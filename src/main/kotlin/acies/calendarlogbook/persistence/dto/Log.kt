package acies.calendarlogbook.persistence.dto

import java.io.Serializable
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "LOG")
data class Log(
        @Id @GeneratedValue
        val logId: Long? = null,

        val logbookId: Long,

        var rowNumber: Long,

        var message: String = ""
): Serializable
