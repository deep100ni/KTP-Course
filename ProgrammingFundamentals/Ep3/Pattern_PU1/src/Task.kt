import com.faangx.ktp.patterns.single.PatternLinesAndCharBasedMiniApp

fun printPattern(lines: Int, char: Char) {
    repeat(lines){i ->
        repeat(lines - i -1){ print(" ")}
        repeat(2*i+1){print(char)}
    println()
    }
}

fun main() {
    PatternLinesAndCharBasedMiniApp("PU1", ::printPattern)
}