package acies.calendarlogbook.model

import java.time.LocalDateTime
import java.util.*

data class LogBook(
        val id: UUID = UUID.randomUUID(),
        var logList: List<Log> = emptyList(),
        var lastUpdated: LocalDateTime = LocalDateTime.now(),
        var creationDate: LocalDateTime = LocalDateTime.now())