package com.example.demo5

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component
import java.util.*


@Component
class UserMutationResolver (val userServ: UserService) : GraphQLQueryResolver{



fun createUser (userNameNew: String, userSurnameNew: String, ageNew: Int?, emailNew: String?): UserEntity {
    return userServ.createUser(userNameNew,userSurnameNew,ageNew,emailNew)
    }

fun deleteUser (id: UUID) {
    return userServ.deleteUser(id)
    }

}