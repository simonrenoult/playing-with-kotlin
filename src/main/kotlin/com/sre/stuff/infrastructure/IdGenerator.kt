package com.sre.stuff.infrastructure

import com.sre.stuff.domain.IdGenerator
import org.springframework.stereotype.Service
import java.util.*

@Service
class IdGenerator: IdGenerator {
    override fun generateRandomId(): String {
        return UUID.randomUUID().toString()
    }
}