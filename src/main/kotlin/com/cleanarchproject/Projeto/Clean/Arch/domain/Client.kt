package com.cleanarchproject.Projeto.Clean.Arch.domain

import com.cleanarchproject.Projeto.Clean.Arch.domain.enum.Gender
import com.cleanarchproject.Projeto.Clean.Arch.domain.enum.MaritalStatus
import java.util.UUID

data class Client(
    var id: UUID? = null,
    var name: String? = null,
    var address: String? = null,
    var gender: Gender? = null,
    var creditScore: Int? = null,
    var maritalStatus: MaritalStatus? = null
)