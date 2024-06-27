import com.faangx.ktp.patterns.single.PatternLinesAndTwoCharsBasedMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    repeat(lines){i->
        repeat(lines){j ->
            if (j == i)
                print(char1)
            else
                print(char2)

        }
    println()
    }
}

fun main() {
    PatternLinesAndTwoCharsBasedMiniApp("P1", ::printPattern)
}