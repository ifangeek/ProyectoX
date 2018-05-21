package ifangeek.com.proyectox

import javax.security.auth.callback.Callback

interface IRegister {
    interface  View{
        fun showProgress()
        fun hidePrgress()
        fun onLoginSucess()
        fun onLoginError(message:String?)

    }

    interface Presenter{
        fun crearUsuario(email:String?,password:String?)
    }

    interface Model {
        fun crearUsuario(email:String?,password:String?,mCallbackState:RegisterModel.CallbackState)

    }
}