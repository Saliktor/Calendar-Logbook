package acies.calendarlogbook.service.impl

import acies.calendarlogbook.dao.impl.LogJpaDao
import acies.calendarlogbook.dto.Log
import acies.calendarlogbook.service.LogService
import org.springframework.stereotype.Service

@Service
class LogServiceImpl(private val logDao: LogJpaDao): LogService {
    override fun getLog(logId: Long): Log? {
        return logDao.find(logId)
    }

    override fun updateLog(log: Log) {
        return logDao.update(log)
    }

    override fun deleteLog(log: Log) {
        return logDao.delete(log)
    }

    override fun createLog(rowNumber: Long): Log {
        var log = Log(rowNumber = rowNumber)
        logDao.create(log)
        return log
    }
}