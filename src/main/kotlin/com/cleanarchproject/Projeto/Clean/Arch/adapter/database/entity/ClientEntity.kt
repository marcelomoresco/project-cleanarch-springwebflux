package com.cleanarchproject.Projeto.Clean.Arch.adapter.database.entity

import com.cleanarchproject.Projeto.Clean.Arch.domain.enum.Gender
import com.cleanarchproject.Projeto.Clean.Arch.domain.enum.MaritalStatus
import jakarta.persistence.*
import java.time.OffsetDateTime
import java.util.UUID

@Entity
@Table(name="tb_client")
data class ClientEntity (
    @Id
    @Column(name = "uuid_client")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idClient: UUID? = null,

    @Column(name = "name")
    var name:String? = null,

    @Column(name = "address")
    var address:String? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "marital_status")
    var maritalStatus: MaritalStatus? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    var gender: Gender? = null,

    @Column(name = "date_insert")
    var dateInsert: OffsetDateTime? = null,

    @Column(name = "date_update")
    var dateUpdate: OffsetDateTime? = null,
)