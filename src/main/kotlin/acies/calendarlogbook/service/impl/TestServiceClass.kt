package acies.calendarlogbook.service.impl

import acies.calendarlogbook.dao.impl.LogBookJpaDao
import acies.calendarlogbook.dao.impl.LogJpaDao
import acies.calendarlogbook.dto.Log
import acies.calendarlogbook.dto.LogBook
import acies.calendarlogbook.service.LogService
import org.springframework.stereotype.Service

@Service
class TestServiceClass(val logDao: LogJpaDao, val logBookJpaDao: LogBookJpaDao, val logService: LogService) {

    //For entities that have a one to many relationship, ensure the many entity is persisting before attempting to
    // persist the one entity
    init{
        var log = logService.createLog(1142L)

//
//        val logbook = LogBook()
//
//
//        val rowNum = 1L
//
//        val log = Log(rowNumber = rowNum)
//        logDao.create(log)
//
//
//        logbook.logList = listOf(log)
//
//        logBookJpaDao.create(logbook)
//        logDao.create(log)

//        println("Created object")

//        var returnedLog = logDao.find(1L)
//        println("returnedLog: " + returnedLog


        //Creating of a new logbook should be done through a service class as to generate a proper id for it in the database
        //logs should also only be created from a service or somehow called on the logbook object itself

    }
}