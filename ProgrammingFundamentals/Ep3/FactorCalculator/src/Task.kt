import com.faangx.ktp.basics.FactorCalculatorMiniApp

fun printFactorsOf(num: Int) {
    for (i in 1..num){
                if (num%i == 0) {
                    print("$i, ")
        }
    }
}

fun isPrime(num: Int): Boolean {
    var noOfFactors =0
    for (i in 1..num){
        if (num%i == 0) {
            noOfFactors += 1
        }
    }
    return noOfFactors == 2
}

fun main() {
    FactorCalculatorMiniApp(::printFactorsOf, ::isPrime)
}