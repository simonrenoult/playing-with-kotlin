package com.sre.stuff.domain

interface KnowledgeRepository {
    fun findAll(): List<Knowledge>
}