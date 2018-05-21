package ifangeek.com.proyectox

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.google.firebase.auth.FirebaseAuth



class MainActivity : AppCompatActivity() {





    private lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mAuth = FirebaseAuth.getInstance()


    }
}
