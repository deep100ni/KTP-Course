import com.faangx.ktp.basics.StringPalindromeCheckerMiniApp

fun reverseStr(str: String): String {
	return buildString {
		for (i in str.lastIndex downTo 0) {
			append(str[i])
		}
	}
}

fun isPalindrome(str: String, ignoreCase: Boolean): Boolean {
	return areStringsEqual(str, reverseStr(str), ignoreCase)
}

fun areStringsEqual(s1: String, s2: String, ignoreCase: Boolean): Boolean {
	if (s1.length != s2.length) return false

	for (i in s1.indices) {
		if (!areCharsEqual(s1[i], s2[i], ignoreCase)) return false
	}
	return true
}

fun areCharsEqual(c1: Char, c2: Char, ignoreCase: Boolean): Boolean {
	if (!ignoreCase) return c1 == c2
	return convertToLowercase(c1) == convertToLowercase(c2)
}

fun convertToLowercase(char: Char): Char {
	return if (char in 'A'..'Z') {
		Char(char.code + 32)
	} else {
		char
	}
}


fun main() {
    StringPalindromeCheckerMiniApp(
        ::reverseStr,
        ::isPalindrome
    )
}