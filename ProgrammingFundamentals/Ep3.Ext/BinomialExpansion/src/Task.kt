import com.faangx.ktp.basics.BinomialExpansionMiniApp

fun printBinomialExpansion(n: Int) {
	repeat(n + 1) { i ->
		if (combinationsOf(n, i) != 1) print(combinationsOf(n, i))
		var powA = n - i
		var powB = i
		if (powA > 1) print("a^$powA") else if (powA > 0) print("a")
		if (powB > 1) print("b^$powB") else if (powB > 0) print("b")
		if (i < n) print(" + ")
	}
}

fun factorialOf(x: Int): Int {
	var factorial = 1
	for (i in 2..x) {
		factorial *= i
	}
	return factorial
}

fun permutationsOf(n: Int, r: Int): Int {
	var permutations = 1
	for (i in (n - r + 1)..n) {
		permutations *= i
	}
	return permutations
}

fun combinationsOf(n: Int, r: Int): Int {
	return permutationsOf(n, r) / factorialOf(r)
}


fun main() {
    BinomialExpansionMiniApp(::printBinomialExpansion)
}