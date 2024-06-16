import com.faangx.ktp.basics.BinomialExpansionMiniApp

fun printBinomialExpansion(n: Long) {
	repeat(n + 1L) { i ->
		if (combinationsOf(n, i) != 1L) print(combinationsOf(n, i))
		var powA = n - i
		var powB = i
		if (powA > 1) print("a^$powA") else if (powA > 0) print("a")
		if (powB > 1) print("b^$powB") else if (powB > 0) print("b")
		if (i < n) print(" + ")
	}
}

fun factorialOf(x: Long): Long {
	var factorial = 1L
	for (i in 2..x) {
		factorial *= i
	}
	return factorial
}

fun permutationsOf(n: Long, r: Long): Long {
	var permutations = 1L
	for (i in (n - r + 1)..n) {
		permutations *= i
	}
	return permutations
}

fun combinationsOf(n: Long, r: Long): Long {
	return permutationsOf(n, r) / factorialOf(r)
}


fun main() {
    BinomialExpansionMiniApp(::printBinomialExpansion)
}