package com.example.demo5

import org.springframework.data.annotation.Id
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Entity
data class UserEntity (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(updatable = false, nullable = false)
        val id: UUID? = null,

        var userName: String = "defaultUserName",

        var userSurname: String = "defaultUserSurname",

        var age: Int? = null,

        var email: String? = null

        )