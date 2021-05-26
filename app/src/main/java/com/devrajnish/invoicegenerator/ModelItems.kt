package com.devrajnish.invoicegenerator

data class ModelItems(
    val itemName: String,
    val itemDesc: String,
    val quantity: Int,
    val disAmount : Int,
    val vat: Int,
    val netAmount: Int
) {
}