package com.sre.stuff.domain

import java.util.*

open class Stuff(
    val author: Author,
    val creationDate: CreationDate = CreationDate(),
    val tags: List<Tag>,
    val id: String
)
