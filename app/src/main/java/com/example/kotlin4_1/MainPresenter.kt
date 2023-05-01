package com.example.kotlin4_1

private const val BUTTON_1_ID = 1
private const val BUTTON_2_ID = 2
private const val BUTTON_3_ID = 3

class MainPresenter(val view: MainView) {

    val model = CountersModel()
    //Архитектурная ошибка. В качестве практического задания -- исправить
    fun counterClick(id: Int){
        when(id){
            BUTTON_1_ID -> {
                val nextValue = model.next(0)
                view.setButtonText(0, nextValue.toString())
            }
            BUTTON_2_ID -> {
                val nextValue = model.next(1)
                view.setButtonText(1, nextValue.toString())
            }
            BUTTON_3_ID -> {
                val nextValue = model.next(2)
                view.setButtonText(2, nextValue.toString())
            }
        }
    }

}