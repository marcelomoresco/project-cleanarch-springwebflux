package com.cleanarchproject.Projeto.Clean.Arch.adapter.controller.dto.response

import com.cleanarchproject.Projeto.Clean.Arch.domain.enum.Gender
import com.cleanarchproject.Projeto.Clean.Arch.domain.enum.MaritalStatus
import com.fasterxml.jackson.annotation.JsonFormat
import java.math.BigDecimal
import java.time.LocalDate
import java.util.*

data class ClientResponse (
    var uuid: UUID? = null,
    var name: String? = "",
    var address: String? = null,
    var creditScore: Int? = null,
    var gender: Gender? = null,
    var maritalStatus: MaritalStatus? = null
)