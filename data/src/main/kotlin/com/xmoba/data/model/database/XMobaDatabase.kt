package com.xmoba.data.model.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import com.xmoba.data.model.database.converters.ListStringConverter
import com.xmoba.data.model.database.converters.CoordinatesConverter
import com.xmoba.data.model.database.converters.PostCodeConverter
import com.xmoba.data.model.database.converters.TimezoneConverter
import com.xmoba.data.model.database.dao.UserDao
import com.xmoba.data.model.user.UserEntity

/**
 * Created by david on 8/8/18.
 */
@Database(entities = [UserEntity::class], version = 3)
@TypeConverters(ListStringConverter::class, PostCodeConverter::class, CoordinatesConverter::class, TimezoneConverter::class)
abstract class XMobaDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao
}