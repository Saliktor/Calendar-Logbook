package acies.calendarlogbook.persistence.repo

import acies.calendarlogbook.persistence.dto.Log
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LogRepo: JpaRepository<Log, Long>