fun main() {
    print("Masukkan nilai x = ")
    val input: Int = readLine()?.toInt()!!
    fibonacciSeries(input)
}
fun fibonacciSeries(input: Int) {
    var temp1 = 0
    var temp2 = 1
    println(" $input Nilai Bilangan Fibonacci ")

    for (i in 1..input) {
        print("$temp1 ")
        val sum = temp1 + temp2
        temp1 = temp2
        temp2 = sum
    }
    println("")

}