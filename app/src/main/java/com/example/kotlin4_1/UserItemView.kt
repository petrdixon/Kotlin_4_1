package com.example.kotlin4_1

// интерфейс, куда вынесли позицию элемента списка. Она понадобится для элемента любого списка в нашем приложении.
interface UserItemView: IItemView {
    fun setLogin(text: String)
}
