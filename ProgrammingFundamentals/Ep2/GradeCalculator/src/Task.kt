import com.faangx.ktp.basics.GradeCalculatorMiniApp

fun gradeFor(m1: Int, m2: Int, m3: Int, m4: Int, m5: Int): String {
    val avg = (m1+m2+m3+m4+m5)/50f
    return when(avg) {
        in 9f..10f -> "A+"
        in 8f..9f -> "A"
        in 7f..8f -> "B"
        in 6f..7f -> "C"
        in 5f..6f -> "D"
        in 4f..5f -> "E"
        else-> "Fail"

    }
}

fun main() {
    GradeCalculatorMiniApp(::gradeFor)
}