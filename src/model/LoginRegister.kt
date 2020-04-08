package com.vertex.model

import org.bson.codecs.pojo.annotations.BsonId

data class LoginRegister(
    val username: String,
    val password: String,
    @BsonId val id: String? = null
)
