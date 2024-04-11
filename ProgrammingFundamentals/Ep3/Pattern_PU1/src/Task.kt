import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int, char: Char) {
    repeat(lines){i->
        repeat(lines-1-i){ print(' ') }
        repeat(2*i+1){print(char)}
        println()
    }
}

fun main() {
    PatternMiniApp("PU1", ::printPattern)
}