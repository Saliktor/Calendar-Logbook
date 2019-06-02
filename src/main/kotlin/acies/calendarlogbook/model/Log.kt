package acies.calendarlogbook.model

import java.time.LocalDateTime
import java.util.*

data class Log(var rowNum: Int,
    val id: UUID = UUID.randomUUID(),
    var message: String,
    var startTime: LocalDateTime?,
    var endTime: LocalDateTime?)
