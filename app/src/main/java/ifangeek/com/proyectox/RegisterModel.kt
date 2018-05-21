package ifangeek.com.proyectox


import android.util.Log.d
import android.util.Log.w
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth





class RegisterModel(presenter: RegisterPresenter): IRegister.Model {

    var presenter: RegisterPresenter? = presenter
    var mAuth: FirebaseAuth? = FirebaseAuth.getInstance()


    override fun crearUsuario(email: String?, password: String?,mCallbackState: CallbackState) {
        mAuth!!.createUserWithEmailAndPassword(email.toString(), password.toString())
                .addOnCompleteListener(OnCompleteListener<AuthResult> { task ->
                    if (task.isSuccessful) {
                        mCallbackState.sucess()
                        d("FIREBASE","Se registro con exito")
                    } else {
                        mCallbackState.error("Ocurrio un error al registrar usuario")
                    }

                    // ...
                })

    }
    //1
    interface CallbackState{
        fun sucess()
        fun error(mensaje:String)
    }
}