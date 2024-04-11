import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int) {
    repeat(lines){i->
        repeat(lines-i){ print(lines-i) }
        println()
    }

}

fun main() {
    PatternMiniApp("TLN", ::printPattern)
}