package com.example.kotlin4_1

import com.github.terrakok.cicerone.androidx.FragmentScreen

// здесь указаны переходы на фрагменты
class AndroidScreens : IScreens {
    override fun users() = FragmentScreen { UsersFragment.newInstance() }
    override fun userInfo(login: String) = FragmentScreen { UserInfoFragment.newInstance(login) }
}