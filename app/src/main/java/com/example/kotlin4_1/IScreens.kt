package com.example.kotlin4_1

import com.github.terrakok.cicerone.Screen

interface IScreens {
    fun users(): Screen
    fun userInfo(login: String): Screen

}