package com.sre.stuff.infrastructure.injections

import com.sre.stuff.infrastructure.IdGenerator
import com.sre.stuff.infrastructure.repositories.HardcodedKnowledgeRepository
import com.sre.stuff.useCases.ListKnowledge
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UseCaseInjection {
    @Bean
    fun listKnownledge(): ListKnowledge {
        return ListKnowledge(HardcodedKnowledgeRepository(IdGenerator()))
    }
}