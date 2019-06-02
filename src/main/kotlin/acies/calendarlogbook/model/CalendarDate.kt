package acies.calendarlogbook.model

import acies.calendarlogbook.model.enums.WorkStatus
import java.time.LocalDate

data class CalendarDate(
        val date: LocalDate,
        var logbook: LogBook = LogBook(),
        var workStatus: WorkStatus = WorkStatus.TENTATIVE
)