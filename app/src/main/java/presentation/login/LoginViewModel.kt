package presentation.login

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cfgdemelo.iddog.domain.login.LoginUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginViewModel(private val loginUseCase: LoginUseCase) : ViewModel() {
    val isValidEmailMutable = MutableLiveData<Boolean>()
    val isValidEmail: LiveData<Boolean> = isValidEmailMutable

    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean> = _loading

    private val _error = MutableLiveData<String>()
    val error: LiveData<String> = _error

    private val _logged = MutableLiveData<Boolean>()
    val logged: LiveData<Boolean> = _logged

    init {
        checkIfUserIsLogged()
    }

    private fun checkIfUserIsLogged() {
        _loading.value = true
        viewModelScope.launch(Dispatchers.IO) {
            loginUseCase.getLoggedUser()?.let {
                viewModelScope.launch { _logged.value = true }
            }
        }
        _loading.value = false
    }

    fun login(context: Context, email: String) {
        viewModelScope.launch {
            _loading.value = true

            try {
                loginUseCase.login(context, email).let {
                    _logged.value = it
                }
            } catch (exception: Throwable) {
                _error.value = exception.message
            }

            _loading.value = false
        }
    }
}