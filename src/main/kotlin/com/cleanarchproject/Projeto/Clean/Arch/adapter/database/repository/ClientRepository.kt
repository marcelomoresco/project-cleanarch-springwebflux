package com.cleanarchproject.Projeto.Clean.Arch.adapter.database.repository

import com.cleanarchproject.Projeto.Clean.Arch.adapter.database.entity.ClientEntity
import com.cleanarchproject.Projeto.Clean.Arch.domain.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface ClientRepository: JpaRepository<ClientEntity, UUID> {
}