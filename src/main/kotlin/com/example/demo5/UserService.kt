package com.example.demo5

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*


@Service
class UserService (val userRepo: UserRepository) {

@Transactional
fun createUser (userNameNew: String, userSurnameNew: String, ageNew: Int?, emailNew: String?): UserEntity {

    val user = UserEntity(userName = userNameNew,
            userSurname = userSurnameNew,
            age = ageNew,
            email = emailNew)
    return userRepo.save(user)
}

@Transactional
    fun deleteUser (id: UUID) {
    return userRepo.deleteById(id)
}

}