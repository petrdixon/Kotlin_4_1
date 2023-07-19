package com.example.kotlin4_1

import io.reactivex.rxjava3.core.Observable

class Producer {
    fun just(): Observable<List<GithubUser>> {
        return Observable.just(GithubUsersRepo().getUsers())
    }
}
