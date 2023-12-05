fun main(input: Array<String>) {
    val regex = Regex("(\\D)")
    val calibration = input.map {
        val onlyDigits = it.replace(regex, "")
        val firstDigit = onlyDigits.first()
        val lastDigit = onlyDigits.last()

        return@map "$firstDigit$lastDigit".toInt()
    }.sum()
    println(calibration)
}
