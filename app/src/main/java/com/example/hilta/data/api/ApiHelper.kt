package com.example.hilta.data.api

import com.example.hilta.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers() : Response<List<User>>
}