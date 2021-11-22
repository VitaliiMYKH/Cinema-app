package mykh.vitalii.spring.dao.impl;

import mykh.vitalii.spring.dao.AbstractDao;
import mykh.vitalii.spring.dao.TicketDao;
import mykh.vitalii.spring.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
