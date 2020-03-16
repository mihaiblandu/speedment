package com.company.sakila.sakila.sakila.film_category.generated;

import com.company.sakila.sakila.sakila.category.Category;
import com.company.sakila.sakila.sakila.film.Film;
import com.company.sakila.sakila.sakila.film_category.FilmCategory;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.field.DatastoreFields;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.ShortForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;

/**
 * The generated base for the {@link
 * com.company.sakila.sakila.sakila.film_category.FilmCategory}-interface
 * representing entities of the {@code film_category}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedFilmCategory {
    
    /**
     * This Field corresponds to the {@link FilmCategory} field that can be
     * obtained using the {@link FilmCategory#getFilmId()} method.
     */
    IntForeignKeyField<FilmCategory, Integer, Film> FILM_ID = DatastoreFields.createIntForeignKeyField(
        Identifier.FILM_ID,
        FilmCategory::getFilmId,
        FilmCategory::setFilmId,
        Film.FILM_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link FilmCategory} field that can be
     * obtained using the {@link FilmCategory#getCategoryId()} method.
     */
    ShortForeignKeyField<FilmCategory, Short, Category> CATEGORY_ID = DatastoreFields.createShortForeignKeyField(
        Identifier.CATEGORY_ID,
        FilmCategory::getCategoryId,
        FilmCategory::setCategoryId,
        Category.CATEGORY_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link FilmCategory} field that can be
     * obtained using the {@link FilmCategory#getLastUpdate()} method.
     */
    ComparableField<FilmCategory, Timestamp, Timestamp> LAST_UPDATE = DatastoreFields.createComparableField(
        Identifier.LAST_UPDATE,
        FilmCategory::getLastUpdate,
        FilmCategory::setLastUpdate,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the filmId of this FilmCategory. The filmId field corresponds to
     * the database column sakila.sakila.film_category.film_id.
     * 
     * @return the filmId of this FilmCategory
     */
    int getFilmId();
    
    /**
     * Returns the categoryId of this FilmCategory. The categoryId field
     * corresponds to the database column
     * sakila.sakila.film_category.category_id.
     * 
     * @return the categoryId of this FilmCategory
     */
    short getCategoryId();
    
    /**
     * Returns the lastUpdate of this FilmCategory. The lastUpdate field
     * corresponds to the database column
     * sakila.sakila.film_category.last_update.
     * 
     * @return the lastUpdate of this FilmCategory
     */
    Timestamp getLastUpdate();
    
    /**
     * Sets the filmId of this FilmCategory. The filmId field corresponds to the
     * database column sakila.sakila.film_category.film_id.
     * 
     * @param filmId to set of this FilmCategory
     * @return       this FilmCategory instance
     */
    FilmCategory setFilmId(int filmId);
    
    /**
     * Sets the categoryId of this FilmCategory. The categoryId field
     * corresponds to the database column
     * sakila.sakila.film_category.category_id.
     * 
     * @param categoryId to set of this FilmCategory
     * @return           this FilmCategory instance
     */
    FilmCategory setCategoryId(short categoryId);
    
    /**
     * Sets the lastUpdate of this FilmCategory. The lastUpdate field
     * corresponds to the database column
     * sakila.sakila.film_category.last_update.
     * 
     * @param lastUpdate to set of this FilmCategory
     * @return           this FilmCategory instance
     */
    FilmCategory setLastUpdate(Timestamp lastUpdate);
    
    /**
     * Queries the specified manager for the referenced Film. If no such Film
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Film findFilmId(Manager<Film> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Category. If no such
     * Category exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Category findCategoryId(Manager<Category> foreignManager);
    
    enum Identifier implements ColumnIdentifier<FilmCategory> {
        
        FILM_ID     ("film_id"),
        CATEGORY_ID ("category_id"),
        LAST_UPDATE ("last_update");
        
        private final String columnId;
        private final TableIdentifier<FilmCategory> tableIdentifier;
        
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
            return "film_category";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<FilmCategory> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}