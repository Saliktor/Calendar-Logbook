package acies.calendarlogbook.service

import acies.calendarlogbook.dto.CalendarDate
import java.time.LocalDate

interface CalendarService {

    fun getCalendarDate(date: LocalDate): CalendarDate
    fun getCalendarDates(dates: List<LocalDate>): List<CalendarDate>
    fun updateCalendarDate(calendarDate: CalendarDate)
    fun updateCalendarDates(calendarDates: List<CalendarDate>)
    fun createNewCalendarDate(date: LocalDate): CalendarDate
    fun createNewCalendarDates(dates: List<LocalDate>): List<CalendarDate>
    fun deleteCalendarDate(calendarDate: CalendarDate)
    fun deleteCalendarDate(date: LocalDate)
}