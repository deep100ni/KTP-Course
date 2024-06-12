import com.faangx.ktp.basics.CeaserCipherMiniApp

fun encode(text: String, delta: Int): String {
    TODO()
}

fun decode(text: String, delta: Int): String {
    TODO()
}

fun encode(text: String, delta: Int, negative: Boolean): String {
    TODO()
}

fun decode(text: String, delta: Int, negative: Boolean): String {
    TODO()
}

fun shiftChar(char: Char, delta: Int): Char {
    TODO()
}

fun isLetter(char: Char): Boolean {
    TODO()
}

fun main() {
    CeaserCipherMiniApp(
        ::encode, ::decode
    )
}