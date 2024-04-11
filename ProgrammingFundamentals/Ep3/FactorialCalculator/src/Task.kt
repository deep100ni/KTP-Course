import com.faangx.ktp.basics.FactorialCalculatorMiniApp

fun factorialOf(x: Long): Long {
    var factorial = 1L
    for (i in 1..x){
        factorial *= i
    }
    return factorial
}

fun permutationsOf(n: Long, r: Long): Long {
    var permutations =1L
    for (i in (n-r+1)..n){
        permutations *= i
    }
    return permutations
}

fun combinationsOf(n: Long, r: Long): Long {
    return permutationsOf(n,r)/factorialOf(r)
}

fun main() {
    FactorialCalculatorMiniApp(
        ::factorialOf,
        ::permutationsOf,
        ::combinationsOf
    )
}