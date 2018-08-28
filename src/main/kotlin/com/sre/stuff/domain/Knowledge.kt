package com.sre.stuff.domain

class Knowledge(
        author: Author,
        description: Description,
        creationDate: CreationDate,
        tagList: List<Tag>,
        id: String
) : Stuff(author, creationDate, tagList, id)