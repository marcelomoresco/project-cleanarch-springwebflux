package com.cleanarchproject.Projeto.Clean.Arch.usecases.client

import com.cleanarchproject.Projeto.Clean.Arch.domain.Client
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface ListClient {
    fun execute(): Flux<Client>
}