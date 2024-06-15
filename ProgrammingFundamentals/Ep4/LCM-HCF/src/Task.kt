import com.faangx.ktp.basics.LcmHcfCalculatorMiniApp

fun getLCM(x: Int, y: Int): Int {
	val a = if (x > y) x else y
	val b = if (x < y) x else y

	var mul = a
	while (mul % b != 0) {
		mul += a
	}
	return mul
}

fun getHCF(x: Int, y: Int): Int {
	var a = x
	var b = y

	while (b != 0) {
		val rem = a % b
		a = b
		b = rem
	}
	return a
}


fun main() {
    LcmHcfCalculatorMiniApp(
        ::getLCM,
        ::getHCF
    )
}