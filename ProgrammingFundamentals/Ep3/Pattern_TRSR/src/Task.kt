import com.faangx.ktp.patterns.single.PatternLinesBasedMiniApp

fun printPattern(lines: Int) {
    repeat(lines){ i->
        repeat(i){ print(" ") }
        for (j in lines downTo i+1){print(j)}
        println()

    }
}

fun main() {
    PatternLinesBasedMiniApp("TRSR", ::printPattern)
}