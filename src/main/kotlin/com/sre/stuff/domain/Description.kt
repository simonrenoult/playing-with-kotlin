package com.sre.stuff.domain

class Description(content: String) {
    init {
        val minDescriptionLength = 15
        if (content.length < minDescriptionLength) {
            throw Exception("A description must be longer than 15 characters.")
        }
    }
}