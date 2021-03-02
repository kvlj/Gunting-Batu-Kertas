class controller {



    var p1menang = 0
    var p2menang = 0
    var seri = 0



    fun hasil(player1: String, player2: String) {



        if (player1 == "E") {
            println("Okay, Exit. See you!")
            return
        }

        if (player1 == "G" && player2 == "K" ) {
            println("Gunting mengalahkan kertas --- Player 1 Menang!")
            p1menang++
        }
        else if (player1 == "G" && player2 == "B") {
            println("Gunting dikalahkan Batu --- Player 2 Menang!")
            p2menang++
        }
        else if (player1 == "K" && player2 == "B") {
            println("Kertas mengalahkan Batu --- Player 1 Menang!")
            p1menang++
        }
        else if (player1 == "K" && player2 == "G")  {
            println("Kertas dikalahkan Gunting --- Player 2 Menang!")
            p2menang++
        }
        else if (player1 == "B" && player2 == "K") {
            println("Batu dikalahkan Kertas --- Player 2 Menang!")
            p2menang++
        }
        else if (player1 == "B" && player2 == "G") {
            println("Batu mengalahkan Gunting --- Player 1 Menang!")
            p1menang++
        }

        else {
            println("Ooops! Seri nih. Ayo ulang lagi!")
            seri++
        }
    }
}


