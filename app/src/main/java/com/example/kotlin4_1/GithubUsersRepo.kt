package com.example.kotlin4_1

// временный класс, пока не сделана загрузка данных с гитхаб
class GithubUsersRepo {
    private val repositories = listOf(
        GithubUser("login1"),
        GithubUser("login2"),
        GithubUser("login3"),
        GithubUser("login4"),
        GithubUser("login5")
    )
    fun getUsers() : List<GithubUser> {
        return repositories
    }
}
