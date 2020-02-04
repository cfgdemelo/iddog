package data.model

data class LoginPayload(
    val user: User?
)

data class User(
    val __v: Int,
    val _id: String,
    val createdAt: String,
    val email: String,
    val token: String,
    val updatedAt: String
)