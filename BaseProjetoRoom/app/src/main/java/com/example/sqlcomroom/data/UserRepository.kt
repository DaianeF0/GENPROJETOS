package com.example.sqlcomroom.data

import androidx.lifecycle.LiveData
import com.example.sqlcomroom.model.User

class UserRepository(private val userDao: UserDao) {

    val lerTodosOsDados: LiveData<List<User>> = userDao.lerTodosDados()

    fun addUser(user : User){
        userDao.addUser(user)
    }
}