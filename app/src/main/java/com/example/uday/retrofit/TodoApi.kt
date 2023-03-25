package com.example.uday.retrofit

import retrofit2.Response

interface TodoApi {

    fun getTodos(): Response<List<Todo>>

}