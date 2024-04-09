import com.faangx.ktp.basics.MaxOfTwoNumsMiniApp

fun maxOf(x: Int, y: Int): Int {
    if (x>y){
        return x
    }else{
        return y
    }
}

fun main() {
    MaxOfTwoNumsMiniApp(::maxOf)
}