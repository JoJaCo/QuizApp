package com.bignerdramch.andriod.quizapp

data class Question(

    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThre:String,
    val opttionFour:String,
    val correctAnswer: Int
)
