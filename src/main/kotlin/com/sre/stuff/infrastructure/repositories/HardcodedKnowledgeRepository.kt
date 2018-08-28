package com.sre.stuff.infrastructure.repositories

import com.sre.stuff.domain.*
import org.springframework.stereotype.Repository

@Repository
class HardcodedKnowledgeRepository(private val idGenerator: IdGenerator) : KnowledgeRepository {
    override fun findAll(): List<Knowledge> {
        return listOf(
                Knowledge(
                        Author("", "sre@octo.com"),
                        Description("One must sometimes use the 'version' field when adding a new plugin to the gradle injections."),
                        CreationDate(),
                        listOf(Tag("gradle")),
                        idGenerator.generateRandomId()
                ),
                Knowledge(
                        Author("", "sre@octo.com"),
                        Description("One must use the annotation @Service to enable use-cases autowiring."),
                        CreationDate(),
                        listOf(Tag("spring"), Tag("autowiring"), Tag("dependency-injection")),
                        idGenerator.generateRandomId()
                ),
                Knowledge(
                        Author("", "sre@octo.com"),
                        Description("One can get rid of the annotation @Service in a use-case using both @Configuration and @Bean in a dedicated class in order to specify the implementation."),
                        CreationDate(),
                        listOf(Tag("spring"), Tag("autowiring")),
                        idGenerator.generateRandomId()
                )
        )
    }
}