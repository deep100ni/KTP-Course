import com.faangx.ktp.basics.SquareOfNumV1MiniApp

fun square(x: Long): Long {
    return x*x
}

fun main() {
    SquareOfNumV1MiniApp(::square)
}