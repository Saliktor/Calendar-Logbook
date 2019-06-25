package acies.calendarlogbook.service.impl

import acies.calendarlogbook.dto.CalendarDate
import acies.calendarlogbook.repo.CalendarRepo
import acies.calendarlogbook.service.CalendarService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class CalendarServiceImpl(
        @Qualifier("H2CalendarRepo") var calendarRepo: CalendarRepo
) : CalendarService {

    override fun getCalendarDate(date: LocalDate): CalendarDate {
        return calendarRepo.getCalendarDate(date)
    }
    override fun getCalendarDates(dates: List<LocalDate>): List<CalendarDate> {
        return dates.map{calendarRepo.getCalendarDate(it)}
    }

    override fun updateCalendarDate(calendarDate: CalendarDate) {
        calendarRepo.updateCalendarDate(calendarDate)
    }

    override fun updateCalendarDates(calendarDates: List<CalendarDate>) {
        calendarDates.map { calendarRepo.updateCalendarDate(it) }
    }

    override fun createNewCalendarDate(date: LocalDate): CalendarDate {
        var calendarDate = CalendarDate(date = date)
        calendarRepo.createCalendarDate(calendarDate)

        return calendarDate
    }

    override fun createNewCalendarDates(dates: List<LocalDate>): List<CalendarDate> {
        var calendarDates = dates.map { CalendarDate(date = it) }
        calendarDates.forEach { calendarRepo.createCalendarDate(it)}

        return calendarDates
    }

    override fun deleteCalendarDate(calendarDate: CalendarDate) {
        calendarRepo.deleteCalendarDate(calendarDate.date)
    }

    override fun deleteCalendarDate(date: LocalDate) {
        calendarRepo.deleteCalendarDate(date)
    }
}