package id.zlz.ininews.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert

@Dao
interface NewsDao {
    @Insert
    fun insertFav(news: NewsEntities)

    @Delete
    fun deleteFav(news: NewsEntities)
}