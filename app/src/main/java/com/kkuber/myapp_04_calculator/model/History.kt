package com.kkuber.myapp_04_calculator.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// DB 테이블로 사용할 예정
@Entity
data class History (
    // setter 불가능
    @PrimaryKey
    val uid : Int?,
    @ColumnInfo(name = "expression")
    val expression : String?,
    @ColumnInfo(name = "result")
    val result : String?
)