package com.cleanarchproject.Projeto.Clean.Arch.usecases.client.impl

import com.cleanarchproject.Projeto.Clean.Arch.domain.Client
import com.cleanarchproject.Projeto.Clean.Arch.usecases.client.ListClient
import reactor.core.publisher.Flux

class ListClientImpl: ListClient {
    override fun execute(): Flux<Client> {
        TODO("Not yet implemented")
    }
}