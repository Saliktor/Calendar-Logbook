package acies.calendarlogbook.dao.impl

import acies.calendarlogbook.dto.Log
import acies.calendarlogbook.dto.LogBook
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Repository
class LogBookJpaDao{
    @PersistenceContext
    private var entityManager: EntityManager? = null


    @Transactional
    fun find(id: Long): LogBook? {
        return entityManager?.find(LogBook::class.java, id)
    }

    @Transactional
    fun delete(entity: LogBook) {
        entityManager?.remove(entity)
    }

    @Transactional
    fun udpate(entity: LogBook){
        entityManager?.merge(entity)
    }

    @Transactional
    fun create(entity: LogBook){
        println(entityManager)
        entityManager?.persist(entity)
    }
}