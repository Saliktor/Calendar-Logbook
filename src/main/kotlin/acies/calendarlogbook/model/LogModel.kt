package acies.calendarlogbook.model

data class LogModel(
        val logId: Long? = null,
        val logbookId: Long,
        var rowNumber: Long,
        var message: String = ""
)