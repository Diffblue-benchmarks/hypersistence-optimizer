package io.hypersistence.optimizer.util.transaction;

import org.hibernate.Session;

/**
 * @author Vlad Mihalcea
 */
public abstract class HibernateTransactionConsumer {
    public abstract void accept(Session t);

    public void beforeTransactionCompletion() {

    }

    public void afterTransactionCompletion() {

    }
}
