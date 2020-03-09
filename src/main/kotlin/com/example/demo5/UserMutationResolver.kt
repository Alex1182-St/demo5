package com.example.demo5

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component
import java.util.*


@Component
class UserMutationResolver (val userServ: UserService) : GraphQLQueryResolver{

fun createUser (userName: String, userSurname: String, age: Int?, email: String?): UserEntity {
    return userServ.createUser(userName,userSurname,age,email)
}
fun deleteUser (id: UUID) {
    return userServ.deleteUser(id)
    }

}