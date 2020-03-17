package com.company.sakila.sakila.sakila.payment.generated;

import com.company.sakila.sakila.sakila.payment.Payment;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.company.sakila.sakila.sakila.payment.Payment} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedPaymentManager extends Manager<Payment> {
    
    TableIdentifier<Payment> IDENTIFIER = TableIdentifier.of("sakila", "sakila", "payment");
    List<Field<Payment>> FIELDS = unmodifiableList(asList(
        Payment.PAYMENT_ID,
        Payment.CUSTOMER_ID,
        Payment.STAFF_ID,
        Payment.RENTAL_ID,
        Payment.AMOUNT,
        Payment.PAYMENT_DATE,
        Payment.LAST_UPDATE
    ));
    
    @Override
    default Class<Payment> getEntityClass() {
        return Payment.class;
    }
}