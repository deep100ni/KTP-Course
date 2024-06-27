import com.faangx.ktp.basics.SpiralFullScreenMiniApp

fun printFibonacciSeries(n: Int) {
	var a = 1
	var b = 1

	repeat(n) {
		if (it <= 1) {
			print("1, ")
		} else {
			val sum = a + b
			print("$sum, ")
			a = b
			b = sum
		}
	}
}


fun main() {
    SpiralFullScreenMiniApp(
        ::printFibonacciSeries
    )
}