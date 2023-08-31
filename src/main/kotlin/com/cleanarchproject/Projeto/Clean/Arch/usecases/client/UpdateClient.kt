package com.cleanarchproject.Projeto.Clean.Arch.usecases.client

import com.cleanarchproject.Projeto.Clean.Arch.domain.Client
import reactor.core.publisher.Mono

interface UpdateClient {
    fun execute(domain: Client): Mono<Client>
}