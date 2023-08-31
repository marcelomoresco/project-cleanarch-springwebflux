package com.cleanarchproject.Projeto.Clean.Arch.adapter.controller.dto.request

import com.cleanarchproject.Projeto.Clean.Arch.domain.enum.Gender
import com.cleanarchproject.Projeto.Clean.Arch.domain.enum.MaritalStatus
import java.util.UUID

data class ClientRequest (
    var id: UUID? = null,
    var name: String,
    var address: String? = null,
    var creditScore: Int? = null,
    var gender: Gender? = null,
    var maritalStatus: MaritalStatus? = null
)