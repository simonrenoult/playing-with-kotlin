package com.sre.stuff.domain

interface IdGenerator {
    fun generateRandomId(): String
}