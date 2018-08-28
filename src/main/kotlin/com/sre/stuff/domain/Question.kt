package com.sre.stuff.domain

class Question(question: String) {
    init {
        if (question.isEmpty()) {
            throw Exception("A question cannot be empty.")
        }

        if (!question.endsWith("?")) {
            throw Exception("A question must end with a question mark.")
        }
    }
}
