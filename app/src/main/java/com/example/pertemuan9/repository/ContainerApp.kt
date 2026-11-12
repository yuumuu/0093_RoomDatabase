package com.example.pertemuan9.repository

import android.content.Context
import com.example.pertemuan9.room.DatabaseSiswa

//
interface ContainerApp {
    val siswaRepository: SiswaRepository
}

class ContainerDataApp(private val context: Context) : ContainerApp {
    override val siswaRepository: SiswaRepository by lazy {
        OfflineSiswaRepository(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}