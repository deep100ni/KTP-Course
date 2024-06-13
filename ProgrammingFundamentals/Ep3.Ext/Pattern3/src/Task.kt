import com.faangx.ktp.patterns.single.PatternLinesAndTwoCharsBasedMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    repeat(lines){i ->
        repeat(2*lines -1){j ->
            if (j == lines -i-1 || j == lines + i -1 )
                print(char1)
            else
                print(char2)
        }
    println()
    }
}

fun main() {
    PatternLinesAndTwoCharsBasedMiniApp("P3", ::printPattern)
}