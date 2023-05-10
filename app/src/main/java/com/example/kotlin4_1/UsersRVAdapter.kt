package com.example.kotlin4_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin4_1.databinding.FragmentUsersBinding

class UsersRVAdapter(val presenter: IUserListPresenter) : RecyclerView.Adapter<UsersRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate( // здесь изменения от методички
                R.layout.recycler_view_element, parent, false
            )
        ).apply {
            itemView.setOnClickListener {
                presenter.itemClickListener?.invoke(this)
            }
        }

    override fun getItemCount() = presenter.getCount()
    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        presenter.bindView(holder.apply { pos = position })

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), UserItemView {
        override var pos = -1
        override fun setLogin(text: String) = with(itemView) {
            val tvLogin: TextView = findViewById(R.id.tv_login)
            tvLogin.text = text
        }
    }
}
