fun getDigitsPowerSum(num: Int): Int {
    var result = 0
    var x = num
    var power = 1
    while (x > 0){
        var digit = x % 10
        var n = 1
        repeat(power){
            n *= digit
        }
        result += n
        x /= 10
        power++
    }
    return result
}

fun main() {
    println(
        getDigitsPowerSum(123)
    )
}