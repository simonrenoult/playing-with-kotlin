package com.sre.stuff.infrastructure.routers

import com.sre.stuff.domain.Knowledge
import com.sre.stuff.useCases.ListKnowledge
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KnowledgeRouter(private val listKnowledge: ListKnowledge) {

    @RequestMapping("/knowledge")
    fun list(): List<Knowledge> {
        return this.listKnowledge.execute()
    }

}