package com.hamas.app_project_suhuf.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bookmark")
data class Bookmark(
    @PrimaryKey(autoGenerate = false)
    val id: Int? = null,

    @ColumnInfo(name = "sora_name_en")
    val surahName:String? = "",

    @ColumnInfo(name = "aya_no")
    val ayatNumber:Int? = 0,

    @ColumnInfo(name = "sora")
    val surahNumber:Int? = 0,

    @ColumnInfo(name = "position")
    val positionScroll:Int? = 0,

    @ColumnInfo(name = "aya_text")
    val textQuran:String? = "",


)
