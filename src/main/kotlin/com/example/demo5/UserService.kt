package com.example.demo5

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*


@Service
class UserService (val userRepo: UserRepository) {

@Transactional
fun createUser (userName: String, userSurname: String, age: Int?, email: String?): UserEntity {
    val user = UserEntity ()
    user.userName = userName
    user.userSurname = userSurname
    user.age = age
    user.email = email
    return userRepo.save(user)
}
@Transactional
    fun deleteUser (id: UUID) {
    return userRepo.deleteById(id)
}

}