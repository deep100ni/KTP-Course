import com.faangx.ktp.basics.MultiplicationTableMiniApp

fun printTable(num: Int) {
    repeat(10){
        println("$num X ${it+1} = ${num*(it+1)}")
    }
}

fun main() {
    MultiplicationTableMiniApp(::printTable)
}