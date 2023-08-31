package com.cleanarchproject.Projeto.Clean.Arch.usecases.client.impl

import com.cleanarchproject.Projeto.Clean.Arch.domain.Client
import com.cleanarchproject.Projeto.Clean.Arch.usecases.client.UpdateClient
import reactor.core.publisher.Mono

class UpdateClientImpl:UpdateClient {
    override fun execute(domain: Client): Mono<Client> {
        TODO("Not yet implemented")
    }
}