package mykh.vitalii.spring.dao.impl;

import java.util.Optional;
import mykh.vitalii.spring.dao.AbstractDao;
import mykh.vitalii.spring.dao.RoleDao;
import mykh.vitalii.spring.exception.DataProcessingException;
import mykh.vitalii.spring.model.Role;
import mykh.vitalii.spring.model.RoleName;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getRoleByName(RoleName roleName) {
        try (Session session = factory.openSession()) {
            Query<Role> getRoleByNameQuery = session
                    .createQuery("from Role Where name = :name", Role.class);
            getRoleByNameQuery.setParameter("name", roleName);
            return getRoleByNameQuery.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Can`t get role by name: " + roleName, e);
        }
    }
}
