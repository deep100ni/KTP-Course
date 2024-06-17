import com.faangx.ktp.basics.StringStatsCalculatorMiniApp

fun calcNoOfChars(text: String): Int {
	return text.length
}

fun calcNoOfAlphabets(text: String): Int {
	var count = 0
	for (c in text) {
		if (c in 'a'..'z' || c in 'A'..'Z') count += 1
	}
	return count
}

fun calcNoOfVowels(text: String): Int {
	var count = 0
	for (c in text) {
		if (c in listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')) count += 1
	}
	return count
}

fun calcNoOfConsonants(text: String): Int {
	return calcNoOfAlphabets(text) - calcNoOfVowels(text)
}

fun calcNoOfDigits(text: String): Int {
	var count = 0
	for (c in text) {
		if (c in '0'..'9') count += 1
	}
	return count
}

fun calcNoOfSpecialChars(text: String): Int {
	return text.length - (calcNoOfAlphabets(text) + calcNoOfDigits(text) + calcNoOfSpaces(text))
}

fun calcNoOfSpaces(text: String): Int {
	var count = 0
	for (c in text) {
		if (c in listOf(' ', '\n', '\t')) count += 1
	}
	return count
}

fun calcNoOfWords(text: String): Int {
	var count = 0
	var nonPunctuationCharFound = false
	for (c in text) {
		if (c !in listOf(' ', '\t', '\n', '.', ',', '?', '!')) {
			nonPunctuationCharFound = true
		} else if (nonPunctuationCharFound) {
			nonPunctuationCharFound = false
			count += 1
		}
	}
	if (nonPunctuationCharFound) count += 1
	return count
}

fun calcNoOfSentences(text: String): Int {
	var count = 0
	var nonPunctuationCharFound = false

	for (c in text) {
		if (c !in listOf(' ', '\t', '\n', '.', ',', '?', '!')) {
			nonPunctuationCharFound = true
		} else if (c in listOf('.', '!', '?') && nonPunctuationCharFound) {
			nonPunctuationCharFound = false
			count += 1
		}
	}
	if (nonPunctuationCharFound) count += 1
	return count
}


fun main() {
    StringStatsCalculatorMiniApp(
        ::calcNoOfChars,
        ::calcNoOfAlphabets,
        ::calcNoOfVowels,
        ::calcNoOfConsonants,
        ::calcNoOfDigits,
        ::calcNoOfSpecialChars,
        ::calcNoOfSpaces,
        ::calcNoOfWords,
        ::calcNoOfSentences
    )
}