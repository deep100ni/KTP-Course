import com.faangx.ktp.basics.StringCaseConvertorMiniApp

fun convertToSentenceCase(text: String): String {
	var capitalize = true
	var requireSpace = false
	return buildString {
		for (char in text) {
			if (requireSpace) {
				if (char != ' ') append(' ')
				requireSpace = false
			}
			if (capitalize) {
				append(convertToUppercase(char))
				capitalize = false
			} else {
				append(char)
			}
			if (char in listOf('.', '!', '?')) {
				capitalize = true
				requireSpace = true
			}
		}
	}
}

fun convertToTitleCase(text: String): String {
	var capitalize = true
	return buildString {
		for (char in text) {
			if (char != ' ') {
				if (capitalize) {
					append(convertToUppercase(char))
					capitalize = false
				} else {
					append(char)
				}
			}
			if (char in listOf(' ', '!', '?', '.', ":", ';', ',')) {
				capitalize = true
			}
		}
	}
}

fun convertToUppercase(text: String): String {
	return convertToUppercase(text)
}

fun convertToLowercase(text: String): String {
	return convertToLowercase(text)
}

fun convertToSnakeCase(text: String): String {
	return buildString {
		for (char in text) {
			if (char == ' ') append('_')
		}
	}
}

fun convertToUppercase(char: Char): Char {
	return if (char in 'a'..'z') {
		val upperChar = char - 32
		(upperChar)
	} else {
		(char)
	}
}

fun convertToLowercase(char: Char): Char {
	return if (char in 'A'..'Z') {
		val lowerChar = char + 32
		(lowerChar)
	} else {
		(char)
	}
}

fun isAlphabet(char: Char): Boolean {
	return char in 'a'..'z' || char in 'A'..'Z'
}


fun main() {
    StringCaseConvertorMiniApp(
        ::convertToSentenceCase,
        ::convertToTitleCase,
        ::convertToUppercase,
        ::convertToLowercase,
        ::convertToSnakeCase
    )
}