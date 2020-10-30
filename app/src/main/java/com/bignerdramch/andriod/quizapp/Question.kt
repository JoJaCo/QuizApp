package com.bignerdramch.andriod.quizapp
//question layout that we cab use as data format
data class Question(

    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree:String,
    val optionFour:String,
    val correctAnswer: Int
)
