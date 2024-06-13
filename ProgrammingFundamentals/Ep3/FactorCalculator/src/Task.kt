import com.faangx.ktp.basics.FactorCalculatorMiniApp

fun printFactorsOf(num: Int) {
    for (i in 1..num){
        if (num % i == 0){
            print("$i, ")
        }
    }
}

fun isPrime(num: Int): Boolean {
    var factor = 0
    for (i in 1..num){
        if (num % i == 0){
            factor ++
        }
    }
    return factor ==2

}

fun main() {
    FactorCalculatorMiniApp(::printFactorsOf, ::isPrime)
}