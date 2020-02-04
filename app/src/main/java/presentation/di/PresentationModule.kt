package presentation.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import presentation.login.LoginViewModel

val presentationModule = module {
    viewModel { LoginViewModel(get()) }
}