package com.company.sakila.sakila.sakila.user.generated;

import com.company.sakila.sakila.sakila.user.User;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.field.DatastoreFields;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.LongField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;

/**
 * The generated base for the {@link
 * com.company.sakila.sakila.sakila.user.User}-interface representing entities
 * of the {@code user}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedUser {
    
    /**
     * This Field corresponds to the {@link User} field that can be obtained
     * using the {@link User#getId()} method.
     */
    LongField<User, Long> ID = DatastoreFields.createLongField(
        Identifier.ID,
        User::getId,
        User::setId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link User} field that can be obtained
     * using the {@link User#getName()} method.
     */
    StringField<User, String> NAME = DatastoreFields.createStringField(
        Identifier.NAME,
        o -> OptionalUtil.unwrap(o.getName()),
        User::setName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link User} field that can be obtained
     * using the {@link User#getSurName()} method.
     */
    StringField<User, String> SUR_NAME = DatastoreFields.createStringField(
        Identifier.SUR_NAME,
        o -> OptionalUtil.unwrap(o.getSurName()),
        User::setSurName,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this User. The id field corresponds to the database
     * column sakila.sakila.user.id.
     * 
     * @return the id of this User
     */
    long getId();
    
    /**
     * Returns the name of this User. The name field corresponds to the database
     * column sakila.sakila.user.name.
     * 
     * @return the name of this User
     */
    Optional<String> getName();
    
    /**
     * Returns the surName of this User. The surName field corresponds to the
     * database column sakila.sakila.user.sur_name.
     * 
     * @return the surName of this User
     */
    Optional<String> getSurName();
    
    /**
     * Sets the id of this User. The id field corresponds to the database column
     * sakila.sakila.user.id.
     * 
     * @param id to set of this User
     * @return   this User instance
     */
    User setId(long id);
    
    /**
     * Sets the name of this User. The name field corresponds to the database
     * column sakila.sakila.user.name.
     * 
     * @param name to set of this User
     * @return     this User instance
     */
    User setName(String name);
    
    /**
     * Sets the surName of this User. The surName field corresponds to the
     * database column sakila.sakila.user.sur_name.
     * 
     * @param surName to set of this User
     * @return        this User instance
     */
    User setSurName(String surName);
    
    enum Identifier implements ColumnIdentifier<User> {
        
        ID       ("id"),
        NAME     ("name"),
        SUR_NAME ("sur_name");
        
        private final String columnId;
        private final TableIdentifier<User> tableIdentifier;
        
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
            return "user";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<User> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}