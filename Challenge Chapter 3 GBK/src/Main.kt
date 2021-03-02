fun main() {
    print("Hai!")
    println("Selamat datang di Game Gunting-Batu-Kertas")
    println("Masukkan: (G) untuk Gunting, " +
            "(B) untuk Batu, " +
            "(K) untuk kertas, " +
            "dan (E) untuk Exit")
    println("Masukan pilihan player 1: ")

    val inputp1 = readLine()?.toString()
    val inputp2 = listOf("G", "B", "K" ).random()
    println("Masukkan pilihan player 2: $inputp2")


    println("Hasil = ")
    val controller = Controller()
    controller.hasil(inputp1!!, inputp2!!)




}