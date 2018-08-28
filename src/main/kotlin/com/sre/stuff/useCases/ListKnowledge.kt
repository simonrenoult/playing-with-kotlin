package com.sre.stuff.useCases

import com.sre.stuff.domain.Knowledge
import com.sre.stuff.domain.KnowledgeRepository

class ListKnowledge(private val knowledgeRepository: KnowledgeRepository): UseCase {
    override fun execute(): List<Knowledge> {
        return knowledgeRepository.findAll()
    }
}