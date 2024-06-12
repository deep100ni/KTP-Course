import com.faangx.ktp.basics.SimpleInterestCalculatorV1MiniApp

fun getInterest(p: Float, r: Float, t: Float): Float {
    return p*r*t/100
}

fun main() {
    SimpleInterestCalculatorV1MiniApp(::getInterest)
}