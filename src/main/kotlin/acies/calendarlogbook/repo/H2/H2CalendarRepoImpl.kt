package acies.calendarlogbook.repo.H2

import acies.calendarlogbook.dto.CalendarDate
import acies.calendarlogbook.repo.CalendarRepo
import org.springframework.stereotype.Repository
import java.time.LocalDate
import javax.sql.DataSource

@Repository(value = "H2CalendarRepo")
class H2CalendarRepoImpl(var dataSource: DataSource): CalendarRepo {
    override fun getCalendarDate(date: LocalDate): CalendarDate {
        try{
            dataSource.connection.use {
                
            }

        }catch (e: Exception){

        }
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createCalendarDate(date: CalendarDate) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateCalendarDate(date: CalendarDate) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteCalendarDate(date: LocalDate) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}