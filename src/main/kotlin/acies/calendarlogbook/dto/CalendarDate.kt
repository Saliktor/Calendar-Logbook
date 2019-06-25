package acies.calendarlogbook.dto

import acies.calendarlogbook.model.enums.WorkStatus
import java.io.Serializable
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

//@Entity
//@Table(name = "CALENDARDATES")
data class CalendarDate(
//        @Id
        val date: LocalDate,

        var logbook: LogBook = LogBook(),

        var workStatus: WorkStatus = WorkStatus.TENTATIVE
): Serializable

