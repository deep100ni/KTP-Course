import com.faangx.ktp.basics.TextMiniApp

fun getText(): String {
    return "Namaste Kotlin"
}

fun main() {
    TextMiniApp(::getText)
}