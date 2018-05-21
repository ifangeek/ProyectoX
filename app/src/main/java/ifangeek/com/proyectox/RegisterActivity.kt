package ifangeek.com.proyectox

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.activity_register.*


class RegisterActivity : AppCompatActivity(), IRegister.View{

    lateinit var pg_progress_bar:ProgressBar

    var presenter:IRegister.Presenter? = RegisterPresenter(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btn_register.setOnClickListener{
            registrarusuario()
        }
    }

    fun registrarusuario(){
        presenter!!.crearUsuario(text_input_email.editText?.text.toString(), text_input_password.editText?.text.toString())

    }

    override fun showProgress() {
    }

    override fun hidePrgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onLoginSucess() {
      var intent = Intent(this@RegisterActivity,MainActivity::class.java)
        startActivity(intent)

    }

    override fun onLoginError(message: String?) {
        TODO()// cuando coloque sus credeciales mal que mensaje debera mostrar
    }
}