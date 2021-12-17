package com.example

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Routing.userRoutes() {

    get("/user") {
        call.respondText("User1")
    }

    post("/user") {
        call.respondText(text = "The user has been created")
    }
}