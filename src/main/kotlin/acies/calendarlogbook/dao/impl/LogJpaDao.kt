package acies.calendarlogbook.dao.impl

import acies.calendarlogbook.dto.Log
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Repository
class LogJpaDao{
    @PersistenceContext
    private var entityManager: EntityManager? = null


    @Transactional
    fun find(id: Long): Log? {
        return entityManager?.find(Log::class.java, id)
    }

    @Transactional
    fun delete(entity: Log) {
        entityManager?.remove(entity)
    }

    @Transactional
    fun update(entity: Log){
        entityManager?.merge(entity)
    }

    @Transactional
    fun create(entity: Log){
        entityManager?.persist(entity)
    }
}