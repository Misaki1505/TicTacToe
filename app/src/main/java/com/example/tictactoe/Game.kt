package com.example.tictactoe

var board = arrayListOf<ArrayList<String>>()

fun main(args: Array<String>) {
    for(i in 0..2) {
        val row = arrayListOf<String>()
        for(j in 0..2)
            row.add("")
        board.add(row)
    }
    printBoard()
}

fun printBoard(){
    println("----------------")
    for(i in 0..2) {
        for(j in 0..2) {
            when(board[i][j]) {
                "x" -> print("| x ")
                "o" -> print("| o ")
                else -> print("|   ")
            }
        }
        println("|")
        println("---------------")
    }
}