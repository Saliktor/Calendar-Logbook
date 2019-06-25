package acies.calendarlogbook.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import org.springframework.transaction.annotation.EnableTransactionManagement
import java.util.*
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.PersistenceContext
import javax.sql.DataSource


@Configuration
@EnableTransactionManagement
class DefaultConfig (val datasource: DataSource){

    @Value("\${spring.jpa.hibernate.ddl-auto}")
    val hibernateDdlAuto: String? = null

    @Value("\${spring.jpa.database-platform}")
    val hibernateDialect: String? = null

    @Bean
    fun entityManagerFactory(): LocalContainerEntityManagerFactoryBean {
        val em = LocalContainerEntityManagerFactoryBean()
        em.dataSource = datasource
        em.setPackagesToScan(*arrayOf("acies.calendarlogbook.dto"))

        val vendorAdapter = HibernateJpaVendorAdapter()
        em.jpaVendorAdapter = vendorAdapter
        em.setJpaProperties(additionalProperties())

        return em
    }

    fun additionalProperties(): Properties {
        val properties = Properties()
        properties.setProperty("hibernate.hbm2ddl.auto", hibernateDdlAuto)
        properties.setProperty("hibernate.dialect", hibernateDialect)

        return properties
    }
}