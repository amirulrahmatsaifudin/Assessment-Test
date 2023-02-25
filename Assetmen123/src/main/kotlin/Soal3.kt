fun main() {
    print("Masukkan str :  ")
    val substring: String = readLine()?.toString()!!
    println(lengthOfLongestSubstring(substring))

}

private fun lengthOfLongestSubstring(subsring: String): Int {
    if (subsring == "") {
        return 0
    }
    var start = 0
    var end = 0
    var maxLength = 0
    val uniqueCharacters: MutableSet<Char> = HashSet()
    while (end < subsring.length) {
        if (uniqueCharacters.add(subsring[end])) {
            end++
            maxLength = maxLength.coerceAtLeast(uniqueCharacters.size)
        } else {
            uniqueCharacters.remove(subsring[start])
            start++
        }
    }
    return maxLength
}



