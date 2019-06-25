package acies.calendarlogbook.model.enums

enum class WorkStatus(status: Int) {
    WORKING(0) {
        override fun getColor() = Color.BLUE
    },
    TENTATIVE(1) {
        override fun getColor() = Color.GREEN
    },
    NOT_WORKING(2) {
        override fun getColor() = Color.RED
    };

    abstract fun getColor(): Color
}