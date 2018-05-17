package ifangeek.com.proyectox

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import com.google.firebase.auth.FirebaseAuth



class MainActivity : AppCompatActivity() {


    protected var etEmail: EditText? = null
    protected var etPassword: EditText? = null
    protected var btnLogin: Button? = null
    protected var btnRegister: Button? = null


    private lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mAuth = FirebaseAuth.getInstance()

        btnRegister!!.setOnClickListener {
            val intent = Intent(baseContext,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
