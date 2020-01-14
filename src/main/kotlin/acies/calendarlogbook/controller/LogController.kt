package acies.calendarlogbook.controller

import acies.calendarlogbook.model.LogModel
import acies.calendarlogbook.persistence.dto.Log
import acies.calendarlogbook.service.LogService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class LogController(val logService: LogService){

    @GetMapping("/logs")
    fun getAllLogs(): ResponseEntity<List<Log>> {
        return ResponseEntity(logService.getAllLogs(), HttpStatus.OK)
    }

    //TODO: Create post request for creating a new log
}