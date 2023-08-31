package com.cleanarchproject.Projeto.Clean.Arch.usecases.client

import reactor.core.publisher.Mono
import java.util.*

interface DeleteClient {
    fun execute(idClient: UUID): Mono<Void>
}