package id.zlz.ininews.adapter

import id.zlz.ininews.model.DataNews
import id.zlz.ininews.room.NewsEntities

interface ListSelectionNews{
    fun onClickItem(list: DataNews)
    fun onSave(listdata: DataNews)
}