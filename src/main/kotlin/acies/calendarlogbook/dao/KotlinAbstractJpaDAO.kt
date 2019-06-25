package acies.calendarlogbook.dao

import org.springframework.transaction.annotation.Transactional
import java.io.Serializable
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

/**
 * T: Entity Object Class
 * P: Entity Primary Key Type
 */
abstract class KotlinAbstractJpaDAO<T:Serializable, P> (
        private val clazz: Class<T>, private var entityManager: EntityManager){

    @Transactional
    fun find(id: P): T? {
        return entityManager.find(clazz, id)
    }

    @Transactional
    fun delete(entity: T) {
        entityManager.remove(entity)
    }

    @Transactional
    fun udpate(entity: T){
        entityManager.merge(entity)
    }

    @Transactional
    fun create(entity: T){
        println(entityManager)
        entityManager.persist(entity)
    }
}