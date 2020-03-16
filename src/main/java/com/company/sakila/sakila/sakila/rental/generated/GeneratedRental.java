package com.company.sakila.sakila.sakila.rental.generated;

import com.company.sakila.sakila.sakila.customer.Customer;
import com.company.sakila.sakila.sakila.inventory.Inventory;
import com.company.sakila.sakila.sakila.rental.Rental;
import com.company.sakila.sakila.sakila.staff.Staff;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.field.DatastoreFields;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.ShortForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;
import java.util.Optional;

/**
 * The generated base for the {@link
 * com.company.sakila.sakila.sakila.rental.Rental}-interface representing
 * entities of the {@code rental}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedRental {
    
    /**
     * This Field corresponds to the {@link Rental} field that can be obtained
     * using the {@link Rental#getRentalId()} method.
     */
    IntField<Rental, Integer> RENTAL_ID = DatastoreFields.createIntField(
        Identifier.RENTAL_ID,
        Rental::getRentalId,
        Rental::setRentalId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Rental} field that can be obtained
     * using the {@link Rental#getRentalDate()} method.
     */
    ComparableField<Rental, Timestamp, Timestamp> RENTAL_DATE = DatastoreFields.createComparableField(
        Identifier.RENTAL_DATE,
        Rental::getRentalDate,
        Rental::setRentalDate,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Rental} field that can be obtained
     * using the {@link Rental#getInventoryId()} method.
     */
    IntForeignKeyField<Rental, Integer, Inventory> INVENTORY_ID = DatastoreFields.createIntForeignKeyField(
        Identifier.INVENTORY_ID,
        Rental::getInventoryId,
        Rental::setInventoryId,
        Inventory.INVENTORY_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Rental} field that can be obtained
     * using the {@link Rental#getCustomerId()} method.
     */
    IntForeignKeyField<Rental, Integer, Customer> CUSTOMER_ID = DatastoreFields.createIntForeignKeyField(
        Identifier.CUSTOMER_ID,
        Rental::getCustomerId,
        Rental::setCustomerId,
        Customer.CUSTOMER_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Rental} field that can be obtained
     * using the {@link Rental#getReturnDate()} method.
     */
    ComparableField<Rental, Timestamp, Timestamp> RETURN_DATE = DatastoreFields.createComparableField(
        Identifier.RETURN_DATE,
        o -> OptionalUtil.unwrap(o.getReturnDate()),
        Rental::setReturnDate,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Rental} field that can be obtained
     * using the {@link Rental#getStaffId()} method.
     */
    ShortForeignKeyField<Rental, Short, Staff> STAFF_ID = DatastoreFields.createShortForeignKeyField(
        Identifier.STAFF_ID,
        Rental::getStaffId,
        Rental::setStaffId,
        Staff.STAFF_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Rental} field that can be obtained
     * using the {@link Rental#getLastUpdate()} method.
     */
    ComparableField<Rental, Timestamp, Timestamp> LAST_UPDATE = DatastoreFields.createComparableField(
        Identifier.LAST_UPDATE,
        Rental::getLastUpdate,
        Rental::setLastUpdate,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the rentalId of this Rental. The rentalId field corresponds to
     * the database column sakila.sakila.rental.rental_id.
     * 
     * @return the rentalId of this Rental
     */
    int getRentalId();
    
    /**
     * Returns the rentalDate of this Rental. The rentalDate field corresponds
     * to the database column sakila.sakila.rental.rental_date.
     * 
     * @return the rentalDate of this Rental
     */
    Timestamp getRentalDate();
    
    /**
     * Returns the inventoryId of this Rental. The inventoryId field corresponds
     * to the database column sakila.sakila.rental.inventory_id.
     * 
     * @return the inventoryId of this Rental
     */
    int getInventoryId();
    
    /**
     * Returns the customerId of this Rental. The customerId field corresponds
     * to the database column sakila.sakila.rental.customer_id.
     * 
     * @return the customerId of this Rental
     */
    int getCustomerId();
    
    /**
     * Returns the returnDate of this Rental. The returnDate field corresponds
     * to the database column sakila.sakila.rental.return_date.
     * 
     * @return the returnDate of this Rental
     */
    Optional<Timestamp> getReturnDate();
    
    /**
     * Returns the staffId of this Rental. The staffId field corresponds to the
     * database column sakila.sakila.rental.staff_id.
     * 
     * @return the staffId of this Rental
     */
    short getStaffId();
    
    /**
     * Returns the lastUpdate of this Rental. The lastUpdate field corresponds
     * to the database column sakila.sakila.rental.last_update.
     * 
     * @return the lastUpdate of this Rental
     */
    Timestamp getLastUpdate();
    
    /**
     * Sets the rentalId of this Rental. The rentalId field corresponds to the
     * database column sakila.sakila.rental.rental_id.
     * 
     * @param rentalId to set of this Rental
     * @return         this Rental instance
     */
    Rental setRentalId(int rentalId);
    
    /**
     * Sets the rentalDate of this Rental. The rentalDate field corresponds to
     * the database column sakila.sakila.rental.rental_date.
     * 
     * @param rentalDate to set of this Rental
     * @return           this Rental instance
     */
    Rental setRentalDate(Timestamp rentalDate);
    
    /**
     * Sets the inventoryId of this Rental. The inventoryId field corresponds to
     * the database column sakila.sakila.rental.inventory_id.
     * 
     * @param inventoryId to set of this Rental
     * @return            this Rental instance
     */
    Rental setInventoryId(int inventoryId);
    
    /**
     * Sets the customerId of this Rental. The customerId field corresponds to
     * the database column sakila.sakila.rental.customer_id.
     * 
     * @param customerId to set of this Rental
     * @return           this Rental instance
     */
    Rental setCustomerId(int customerId);
    
    /**
     * Sets the returnDate of this Rental. The returnDate field corresponds to
     * the database column sakila.sakila.rental.return_date.
     * 
     * @param returnDate to set of this Rental
     * @return           this Rental instance
     */
    Rental setReturnDate(Timestamp returnDate);
    
    /**
     * Sets the staffId of this Rental. The staffId field corresponds to the
     * database column sakila.sakila.rental.staff_id.
     * 
     * @param staffId to set of this Rental
     * @return        this Rental instance
     */
    Rental setStaffId(short staffId);
    
    /**
     * Sets the lastUpdate of this Rental. The lastUpdate field corresponds to
     * the database column sakila.sakila.rental.last_update.
     * 
     * @param lastUpdate to set of this Rental
     * @return           this Rental instance
     */
    Rental setLastUpdate(Timestamp lastUpdate);
    
    /**
     * Queries the specified manager for the referenced Inventory. If no such
     * Inventory exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Inventory findInventoryId(Manager<Inventory> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Customer. If no such
     * Customer exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Customer findCustomerId(Manager<Customer> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Staff. If no such Staff
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Staff findStaffId(Manager<Staff> foreignManager);
    
    enum Identifier implements ColumnIdentifier<Rental> {
        
        RENTAL_ID    ("rental_id"),
        RENTAL_DATE  ("rental_date"),
        INVENTORY_ID ("inventory_id"),
        CUSTOMER_ID  ("customer_id"),
        RETURN_DATE  ("return_date"),
        STAFF_ID     ("staff_id"),
        LAST_UPDATE  ("last_update");
        
        private final String columnId;
        private final TableIdentifier<Rental> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "sakila";
        }
        
        @Override
        public String getSchemaId() {
            return "sakila";
        }
        
        @Override
        public String getTableId() {
            return "rental";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Rental> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}