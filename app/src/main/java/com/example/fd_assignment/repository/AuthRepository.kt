package com.example.fd_assignment.repository

import com.example.fd_assignment.model.User
import com.example.fd_assignment.utils.Resource

interface AuthRepository {
    //suspend fun saveUserDetails(user: User, result: (Resource<User>) -> Unit)
    suspend fun login(email: String, password: String, result: (Resource<String>) -> Unit)
    suspend fun register(email: String, password: String, user: User,result: (Resource<String>) -> Unit)
    suspend fun logout(result: () -> Unit)
}