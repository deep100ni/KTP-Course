import com.faangx.ktp.basics.StageOfLifeMiniApp

fun stageOfLife(age: Int): String {
    return when {
        age >= 60 -> "Old age"
        age >= 18 -> "Adulthood"
        age >= 12 -> "Teenage"
        age >= 3 -> "Childhood"
        else -> "Infancy"
    }
}
fun main() {
    StageOfLifeMiniApp(::stageOfLife)
}