package acies.calendarlogbook.model.enums

enum class WorkStatus {
    WORKING {
        override fun getColor() = Color.BLUE
    },
    TENTATIVE {
        override fun getColor() = Color.GREEN
    },
    NOT_WORKING {
        override fun getColor() = Color.RED
    };

    abstract fun getColor(): Color
}