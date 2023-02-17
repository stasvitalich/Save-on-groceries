package com.example.saveongroceries

import retrofit2.http.GET
import retrofit2.http.Query

interface ExchangeRateApi {
    @GET("/latest.json")
    suspend fun getExchangeRates(@Query("app_id") appId: String, @Query("base") baseCurrency: String): ExchangeRateResponse
}