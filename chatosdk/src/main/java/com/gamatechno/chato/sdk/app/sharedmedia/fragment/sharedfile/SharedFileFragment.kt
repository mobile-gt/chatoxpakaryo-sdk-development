package com.gamatechno.chato.sdk.app.sharedmedia.fragment.sharedfile

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gamatechno.chato.sdk.R
import com.gamatechno.chato.sdk.app.chatroom.model.ChatRoomUiModel
import com.gamatechno.chato.sdk.app.sharedmedia.adapter.SharedMediaFileAdapter
import com.gamatechno.chato.sdk.data.DAO.Chat.Chat
import com.gamatechno.chato.sdk.data.constant.Api
import kotlinx.android.synthetic.main.fragment_shared_media.*

class SharedFileFragment: Fragment(), SharedFileView.View {

    lateinit var adapter: SharedMediaFileAdapter
    lateinit var presenter: SharedFilePresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_shared_media,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter = SharedFilePresenter(context, this)
        initList()
    }

    private fun initList() {
        rv_list.layoutManager = LinearLayoutManager(context)
        adapter = SharedMediaFileAdapter(context!!)
        rv_list.adapter = adapter
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if(activity!!.intent.hasExtra("room")) {
            val chatRoomUiModel = activity!!.intent.getSerializableExtra("room") as ChatRoomUiModel
            if (activity!!.intent.hasExtra("sharedMedia")) {
                presenter.getList(Api.list_room_media(chatRoomUiModel.room_id, chatRoomUiModel.user_id, "file"))
            }
        }
    }

    override fun setListView(list: ArrayList<Chat>) {
        adapter.addAll(list)
        rl_no_data.visibility = View.GONE
    }

    override fun setEmptyView() {
        rl_no_data.visibility = View.VISIBLE
    }

    override fun onLoading() {

    }

    override fun onHideLoading() {

    }

    override fun onErrorConnection(message: String?) {

    }

    override fun onAuthFailed(error: String?) {

    }
}