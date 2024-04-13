import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    repeat(lines){i->
        repeat(i){ print(' ')}
        repeat(2*(lines-i)-1){j->
            if (j%2 == 0) print(char1)
            else
                print(char2)
        }
        println()
    }
}

fun main() {
    PatternMiniApp("PD3", ::printPattern)
}