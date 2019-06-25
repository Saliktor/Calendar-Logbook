package acies.calendarlogbook.dto

import java.io.Serializable
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "LOG")
data class Log(
        @Id @GeneratedValue
        val logId: Long? = null,

        var rowNumber: Long,

        var message: String = "",

        var startTime: LocalDateTime? = null,

        var endTime: LocalDateTime?= null
): Serializable
