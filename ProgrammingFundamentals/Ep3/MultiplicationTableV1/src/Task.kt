import com.faangx.ktp.basics.MultiplicationTableMiniAppV1

fun printTable(num: Int, start: Int, end: Int) {
    for (i in start..end){
        println("$num X $i = ${num*i}")
    }
}

fun main() {
    MultiplicationTableMiniAppV1(::printTable)
}