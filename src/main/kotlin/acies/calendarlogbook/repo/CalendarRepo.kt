package acies.calendarlogbook.repo

import acies.calendarlogbook.dto.CalendarDate
import java.time.LocalDate

interface CalendarRepo {
    fun getCalendarDate(date: LocalDate): CalendarDate
    fun createCalendarDate(date: CalendarDate)
    fun updateCalendarDate(date: CalendarDate)
    fun deleteCalendarDate(date: LocalDate)
}