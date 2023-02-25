fun main() {
    print("Masukkan code:  ")
    var code :String = readLine()?.toString()!!
    kode(code)
}

 fun kode (code : String)   {

    when {
        code!! == ("A001") -> {
            println("Wati")
        }

        code == ("A002") -> {
            println("Wira")
        }

        code == ("A003") -> {
            println("Andi")
        }

        code == ("A004") -> {
            println("Bagus")
        }

        code == ("A005") -> {
            println("Siti")
        }

        code == ("A006") -> {
            println("Hasan")
        }

        code == ("A007") -> {
            println("Abdul")
        }

        else -> {
            println("Kode Salah")

        }
    }

}