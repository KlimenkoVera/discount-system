package ru.netology

fun main () {
    val amountOfBuy = 10_050
    val standardDiscount = 100
    val discountPercent = 5
    val discountMusicLover = 1
    val priceMin = 1_000
    val priceMax = 10_000
    val isToMusicLover = true

    var sumBuy = 0

    if (amountOfBuy > priceMax) {
        sumBuy = amountOfBuy - amountOfBuy * discountPercent / 100
    } else if (amountOfBuy < priceMin) {
        sumBuy = amountOfBuy
    } else {
        sumBuy = amountOfBuy - standardDiscount
    }

    val result = if (isToMusicLover) sumBuy - sumBuy * discountMusicLover / 100  else sumBuy

    println("Сумма ваших покупок с учетом скидки составила: $result")

}