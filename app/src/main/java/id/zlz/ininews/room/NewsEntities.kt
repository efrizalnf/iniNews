package id.zlz.ininews.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favourites")
data class NewsEntities(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var title: String,
    var author: String,
    var date: String,
    var desc: String,
    var content: String,
    var imagenews: String
)