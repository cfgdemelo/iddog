package com.cfgdemelo.iddog.presentation.utils

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.text.Editable
import android.text.TextWatcher
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.MutableLiveData

fun EditText.textWatcherEmail(isEmail: MutableLiveData<Boolean>) {
    addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(editable: Editable?) {
            editable?.let {
                isEmail.value = it.toString().isValidEmail()
            }
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
    })
}

private fun String.isValidEmail(): Boolean {
    return android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
}

fun Context.toast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}

fun Context.toastLong(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}

fun Context.fullscreenDialog(layout: Int): Dialog {
    return Dialog(this).apply {
        this.setContentView(layout)
        this.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        this.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )

        this.show()
    }
}