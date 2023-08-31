package com.cleanarchproject.Projeto.Clean.Arch.usecases.client.impl

import com.cleanarchproject.Projeto.Clean.Arch.domain.Client
import com.cleanarchproject.Projeto.Clean.Arch.usecases.client.CreateClient
import reactor.core.publisher.Mono

class CreateClientImpl:CreateClient {
    override fun execute(domain: Client): Mono<Void> {
        TODO("Not yet implemented")
    }
}