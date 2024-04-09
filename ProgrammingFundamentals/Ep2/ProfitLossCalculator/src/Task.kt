import com.faangx.ktp.basics.ProfitLossCalculatorMiniApp
import kotlin.math.roundToInt

fun getSp1(cp: Int, pl: Int): Int {
    return cp*(100+pl)/100
}
fun getSp2(cp: Int, absPL: Int): Int {
    return cp + absPL
}

fun getCp1(sp: Int, pl: Int): Int {
    return sp * 100 / (100 + pl)
}
fun getCp2(sp: Int, absPL: Int): Int {
    return sp - absPL
}

fun getPl1(cp: Int, sp: Int): Int {
    return ((sp - cp).toFloat() / cp * 100).roundToInt()
}
fun getPl2(cp: Int, absPL: Int): Int {
    return (absPL.toFloat() / cp * 100).roundToInt()
}
fun getPl3(sp: Int, absPL: Int): Int {
    return (absPL.toFloat() / (sp - absPL) * 100).roundToInt()
}

fun getAbsPL1(cp: Int, sp: Int): Int {
    return sp - cp
}
fun getAbsPL2(cp: Int, pl: Int): Int {
    return cp * pl / 100
}
fun getAbsPL3(sp: Int, pl: Int): Int {
    return sp * pl / (100 + pl)
}

fun main() {
    ProfitLossCalculatorMiniApp(
        getSp1 = ::getSp1,
        getSp2 = ::getSp2,
        getCp1 = ::getCp1,
        getCp2 = ::getCp2,
        getPl1 = ::getPl1,
        getPl2 = ::getPl2,
        getPl3 = ::getPl3,
        getAbsPL1 = ::getAbsPL1,
        getAbsPL2 = ::getAbsPL2,
        getAbsPL3 = ::getAbsPL3,
    )
}