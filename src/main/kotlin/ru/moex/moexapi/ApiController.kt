package ru.moex.moexapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestOperations

@RestController
@RequestMapping("/moex/v1/stock")
class ApiController(private val restOperations: RestOperations) {

    @GetMapping
    fun helloWorld(@RequestParam emitent: String, @RequestParam from: String, @RequestParam to: String): Board? {
        val url: String = "https://iss.moex.com/iss/history/engines/stock/markets/shares/boards/TQBR/securities/$emitent.json?from=$from&till=$to"
        val response = restOperations.getForObject(url, Board::class.java)
        return response
    }
}