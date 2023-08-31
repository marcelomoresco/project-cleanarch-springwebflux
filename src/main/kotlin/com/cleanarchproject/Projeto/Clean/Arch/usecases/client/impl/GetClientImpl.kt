package com.cleanarchproject.Projeto.Clean.Arch.usecases.client.impl

import com.cleanarchproject.Projeto.Clean.Arch.domain.Client
import com.cleanarchproject.Projeto.Clean.Arch.usecases.client.GetClient
import reactor.core.publisher.Mono

class GetClientImpl: GetClient {
    override fun execute(idClient: String): Mono<Client> {
        TODO("Not yet implemented")
    }
}