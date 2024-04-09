import com.faangx.ktp.basics.StageOfLifeMiniApp

fun stageOfLife(age: Int): String {
    return when{
        age < 3 ->  "Infancy"
        age < 12 -> "Childhood"
        age < 18 -> "Teenage"
        age < 60 -> "Adulthood"
        else -> "Old age"
    }
}

fun main() {
    StageOfLifeMiniApp(::stageOfLife)
}