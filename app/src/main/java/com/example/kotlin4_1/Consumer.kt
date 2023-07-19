package com.example.kotlin4_1

import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

class Consumer(val producer: Producer) {
    fun execLambda() {
        val disposable = producer.just()
            .subscribe({ s ->
                println("onNext: $s")
            }, { e ->
                println("onError: ${e.message}")
            }, {
                println("onComplete")
            })
    }
}