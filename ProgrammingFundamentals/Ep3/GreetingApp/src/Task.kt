import com.faangx.ktp.basics.GreetingMiniApp

fun greet(name: String): String {
    return "Namaste $name"
}

fun main() {
    GreetingMiniApp(::greet)
}