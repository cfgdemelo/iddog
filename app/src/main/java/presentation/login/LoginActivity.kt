package presentation.login

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.cfgdemelo.iddog.R
import com.cfgdemelo.iddog.presentation.utils.textWatcherEmail
import com.cfgdemelo.iddog.presentation.utils.toast
import com.cfgdemelo.iddog.presentation.utils.toastLong
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity: AppCompatActivity() {

    private val viewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        configScreenBehavior()
        configViewModelObservers()
    }

    private fun configScreenBehavior() {
        etEmail.textWatcherEmail(viewModel.isValidEmailMutable)

        btLogin.setOnClickListener {
            viewModel.login(etEmail.text.toString())
        }
    }

    private fun configViewModelObservers() {
        viewModel.isValidEmail.observe(this, Observer {
            btLogin.isEnabled = it
        })

        viewModel.loading.observe(this, Observer {
            if (it) {
                pbLoading.visibility = View.VISIBLE
            } else {
                pbLoading.visibility = View.GONE
            }
        })

        viewModel.error.observe(this, Observer {
            toast(it)
        })

        viewModel.response.observe(this, Observer {
            toastLong(it)
        })
    }
}