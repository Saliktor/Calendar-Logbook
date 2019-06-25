package acies.calendarlogbook.dto

import java.io.Serializable
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "LOGBOOK")
data class LogBook(
        @Id @GeneratedValue
        val logBookId: Long? = null,

        @OneToMany(orphanRemoval=true)
        @OrderBy("rowNumber")
        var logList: List<Log> = emptyList(),

        var lastUpdated: LocalDateTime = LocalDateTime.now(),

        var creationDate: LocalDateTime = LocalDateTime.now()
): Serializable