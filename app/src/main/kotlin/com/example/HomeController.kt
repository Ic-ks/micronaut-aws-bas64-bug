package com.example
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
open class HomeController {

    @Get
    fun index() = HttpResponse.ok(ByteArray(256) { it.toByte() }).contentType(MediaType.APPLICATION_OCTET_STREAM_TYPE)

}