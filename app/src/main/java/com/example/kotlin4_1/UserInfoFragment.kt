package com.example.kotlin4_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

private const val KEY = "key"

class UserInfoFragment : Fragment() {

    companion object {
        fun newInstance(login: String) = UserInfoFragment().apply {
            arguments = Bundle(1).apply {
                putString(KEY, login)
            }
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_user_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val userLogin: TextView = view.findViewById(R.id.user_login)
        userLogin.text = arguments?.getString(KEY)
    }


}