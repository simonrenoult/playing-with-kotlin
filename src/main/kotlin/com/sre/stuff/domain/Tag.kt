package com.sre.stuff.domain

class Tag(name: String) {
    init {
        if (name.isEmpty()) {
            throw Exception("A tag must be at least 1 character long.")
        }

        val validTagNameCharacters = "^[A-Za-z0-9-]+$"
        if (!name.matches(Regex(pattern = validTagNameCharacters))) {
            throw Exception("A tag can only contain alphanumerical and dash characters. Value '$name' was provided.")
        }
    }
}
