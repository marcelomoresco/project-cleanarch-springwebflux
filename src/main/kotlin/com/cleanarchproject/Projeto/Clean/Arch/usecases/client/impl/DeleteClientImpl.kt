package com.cleanarchproject.Projeto.Clean.Arch.usecases.client.impl

import com.cleanarchproject.Projeto.Clean.Arch.usecases.client.DeleteClient
import reactor.core.publisher.Mono
import java.util.*

class DeleteClientImpl:DeleteClient {
    override fun execute(idClient: UUID): Mono<Void> {
        TODO("Not yet implemented")
    }
}