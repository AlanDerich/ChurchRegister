package com.derich.churchregister

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform