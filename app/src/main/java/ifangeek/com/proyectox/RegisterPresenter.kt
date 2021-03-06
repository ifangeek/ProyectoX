package ifangeek.com.proyectox

class RegisterPresenter(view: IRegister.View) : IRegister.Presenter{

    var view:IRegister.View? = view
    var model:IRegister.Model? = RegisterModel(this)


    override fun crearUsuario(email: String?, password: String?) {
        if(view != null){
            model!!.crearUsuario(email.toString(),password.toString(),object: RegisterModel.CallbackState {
                override fun sucess() {
                    view!!.onLoginSucess()
                }

                override fun error(mensaje:String) {
                    view!!.onLoginError(mensaje)
                }
            })
        }
    }


}