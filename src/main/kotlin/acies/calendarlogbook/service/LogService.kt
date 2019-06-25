package acies.calendarlogbook.service

import acies.calendarlogbook.dto.Log

interface LogService {
    fun getLog(logId: Long): Log?
    fun updateLog(log: Log)
    fun deleteLog(log: Log)
    fun createLog(rowNumber: Long): Log
}