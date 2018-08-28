package com.sre.stuff.domain

class Inquiry(
    author: Author,
    creationDate: CreationDate,
    tagList: List<Tag>,
    id: String,
    question: Question
) : Stuff(author, creationDate, tagList, id)