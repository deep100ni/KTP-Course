import com.faangx.ktp.basics.OddEvenCheckerMiniApp

fun checkEvenOdd(num: Int): String {
    if (num%2==0){
        return "Even"
    }else{
        return "Odd"
    }
}

fun main() {
    OddEvenCheckerMiniApp(::checkEvenOdd)
}