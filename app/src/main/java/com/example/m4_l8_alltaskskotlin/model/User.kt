package com.example.m4_l8_alltaskskotlin.model

data class User(
    val firstName:String,
    val lastName:String,
    val number:String
){
    override fun toString(): String {
        return "User(firstName='$firstName', lastName='$lastName', number=$number)"
    }
}
