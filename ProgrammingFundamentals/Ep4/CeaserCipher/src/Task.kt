import com.faangx.ktp.basics.CeaserCipherMiniApp

fun encode(text: String, delta: Int): String {
	return buildString {
       for (char in text) {
           if (isLetter(char)) {
               append(shiftChar(char, delta))
           } else {
               append(char)
           }
       }
   }
}

fun decode(text: String, delta: Int): String {
	return encode(text, -delta)
}

fun encode(text: String, delta: Int, negative: Boolean): String {
	return encode(text, if (negative) -delta else delta)
}

fun decode(text: String, delta: Int, negative: Boolean): String {
	return encode(text, if (negative) delta else -delta)
}

fun shiftChar(char: Char, delta: Int): Char {
	val start = if (char in 'A'..'Z') 'A' else 'a'
    val position = char.code - start.code
    var shifted = (position + delta) % 26
    if (shifted < 0) shifted += 26
    return Char(start.code + shifted)
}

fun isLetter(char: Char): Boolean {
	return char in 'a'..'z' || char in 'A'..'Z'
}


fun main() {
    CeaserCipherMiniApp(
        ::encode, ::decode
    )
}