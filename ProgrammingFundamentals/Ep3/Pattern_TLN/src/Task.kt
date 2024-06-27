import com.faangx.ktp.patterns.single.PatternLinesBasedMiniApp

fun printPattern(lines: Int) {
    repeat(lines){i ->
        repeat(lines - i){ print(lines -i) }
    println()
    }
}

fun main() {
    PatternLinesBasedMiniApp("TLN", ::printPattern)
}