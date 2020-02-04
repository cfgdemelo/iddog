package presentation.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cfgdemelo.iddog.domain.login.LoginUseCase
import kotlinx.coroutines.launch

class LoginViewModel(private val loginUseCase: LoginUseCase): ViewModel() {


    val isValidEmailMutable = MutableLiveData<Boolean>()
    val isValidEmail: LiveData<Boolean> = isValidEmailMutable

    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean> = _loading

    private val _error = MutableLiveData<String>()
    val error: LiveData<String> = _error

    private val _response = MutableLiveData<String>()
    val response: LiveData<String> = _response

    fun login(email: String) {
        viewModelScope.launch {
            _loading.value = true

            try {
                loginUseCase.login(email).also {
                    _response.value = it.user?.token
                }
            } catch (exception: Throwable) {
                exception.printStackTrace()
                _error.value = exception.message
            }

            _loading.value = false
        }
    }
}