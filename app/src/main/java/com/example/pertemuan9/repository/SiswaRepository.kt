package com.example.pertemuan9.repository

import com.example.pertemuan9.room.Siswa
import com.example.pertemuan9.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface SiswaRepository {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}

class OfflineSiswaRepository(private val siswaDao: SiswaDao) : SiswaRepository {
    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()
    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)
}