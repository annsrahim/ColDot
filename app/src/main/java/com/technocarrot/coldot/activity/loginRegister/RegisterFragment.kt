package com.technocarrot.coldot.activity.loginRegister


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.technocarrot.coldot.R
import com.technocarrot.coldot.helper.replaceFragment
import kotlinx.android.synthetic.main.fragment_register.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class RegisterFragment : Fragment(),View.OnClickListener {
    override fun onClick(v: View?) {
        if(v!!.id==R.id.btnLogin)
        {
            val loginRegisterActivity:LoginRegisterActivity = activity as LoginRegisterActivity
            loginRegisterActivity.replaceFragment(LoginFragment.newInstance(),R.id.fragmentContainer)
        }
    }

    lateinit var rootView: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        rootView =  inflater.inflate(R.layout.fragment_register, container, false)
        rootView.btnLogin.setOnClickListener(this)
        return rootView
    }

    companion object {
        fun newInstance():RegisterFragment
        {
            return RegisterFragment()
        }
    }

}
