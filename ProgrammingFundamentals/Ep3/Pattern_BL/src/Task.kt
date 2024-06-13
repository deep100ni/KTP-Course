import com.faangx.ktp.patterns.single.PatternLinesAndCharBasedMiniApp

fun printPattern(lines: Int, char: Char) {
    repeat(lines){
        repeat(it +1){
            print(char)
        }
        println()
    }
}

fun main() {
    PatternLinesAndCharBasedMiniApp("BL", ::printPattern)
}