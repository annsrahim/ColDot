package com.technocarrot.coldot.activity.loginRegister

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.technocarrot.coldot.R
import com.technocarrot.coldot.helper.addFragment

class LoginRegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_register)
        if(savedInstanceState==null)
        {
            addFragment(LoginFragment.newInstance(),R.id.fragmentContainer)
        }
    }
}
