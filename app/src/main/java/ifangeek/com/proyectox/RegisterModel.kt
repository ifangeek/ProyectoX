package ifangeek.com.proyectox


import android.util.Log.d
import android.util.Log.w
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth





class RegisterModel(presenter: RegisterPresenter): IRegister.Model {

    var presenter: RegisterPresenter? = presenter
    var mAuth: FirebaseAuth? = FirebaseAuth.getInstance()
    var mCallbackState:CallbackState? = null


    override fun crearUsuario(email: String?, password: String?,) {
        mAuth!!.createUserWithEmailAndPassword(email.toString(), password.toString())
                .addOnCompleteListener(OnCompleteListener<AuthResult> { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's informatio
                        d("FIREBASE","Se registro con exito")
                    } else {
                        // If sign in fails, display a message to the user.
                        w("FIREBASE",task.exception)
                    }

                    // ...
                })

    }
    interface CallbackState{
        fun sucess()
        fun error()
    }
}