package com.example.fd_assignment.utils

sealed class Resource <out T> {
    object  Loading: Resource<Nothing>()
    data class Success <out T>(val data : T) : Resource<T>()
    data class Error (val string: String ) : Resource<Nothing>()
}