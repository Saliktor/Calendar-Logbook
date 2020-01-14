package acies.calendarlogbook.service

import acies.calendarlogbook.model.LogModel
import acies.calendarlogbook.persistence.dto.Log
import acies.calendarlogbook.persistence.repo.LogRepo
import org.springframework.stereotype.Service

@Service
class LogService(val logRepo: LogRepo){

    fun getAllLogs(): List<Log>{
        return logRepo.findAll()
    }

}