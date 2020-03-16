package com.company.sakila.sakila.sakila.film_text.generated;

import com.company.sakila.sakila.sakila.film_text.FilmText;
import com.company.sakila.sakila.sakila.film_text.FilmTextEntityStoreSerializerImpl;
import com.company.sakila.sakila.sakila.film_text.FilmTextManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfShort;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfString;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache;
import com.speedment.enterprise.datastore.runtime.fieldcache.MultiFieldCache;
import com.speedment.enterprise.datastore.runtime.statistic.Statistics;
import com.speedment.enterprise.datastore.runtime.util.DataStoreHolderUtil;
import com.speedment.enterprise.datastore.runtime.util.StatisticsUtil;
import com.speedment.runtime.bulk.PersistOperation;
import com.speedment.runtime.bulk.RemoveOperation;
import com.speedment.runtime.bulk.UpdateOperation;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.ColumnLabel;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.StreamSupplierComponent;
import com.speedment.runtime.field.Field;
import com.speedment.runtime.field.trait.HasIdentifier;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

/**
 * A holder class for the various caches that are used to speed up the {@link
 * FilmTextManager}.
 * 
 * Generated by
 * com.speedment.enterprise.datastore.generator.internal.code.GeneratedEntityCacheHolderTranslator
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public final class GeneratedFilmTextCacheHolder implements EntityStoreHolder<FilmText> {
    
    private final EntityStore<FilmText> entityStore;
    private final OfShort fieldFilmIdCache;
    private final OfString fieldTitleCache;
    private final OfString fieldDescriptionCache;
    
    public GeneratedFilmTextCacheHolder(
            EntityStore<FilmText> entityStore,
            OfShort fieldFilmIdCache,
            OfString fieldTitleCache,
            OfString fieldDescriptionCache) {
        
        this.entityStore           = requireNonNull(entityStore);
        this.fieldFilmIdCache      = requireNonNull(fieldFilmIdCache);
        this.fieldTitleCache       = requireNonNull(fieldTitleCache);
        this.fieldDescriptionCache = requireNonNull(fieldDescriptionCache);
    }
    
    @Override
    public EntityStore<FilmText> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<FilmText> columnId) {
        if (columnId instanceof FilmText.Identifier) {
            final FilmText.Identifier _id = (FilmText.Identifier) columnId;
            switch (_id) {
                case FILM_ID     : return (CACHE) fieldFilmIdCache;
                case TITLE       : return (CACHE) fieldTitleCache;
                case DESCRIPTION : return (CACHE) fieldDescriptionCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "film_id"     : return (CACHE) fieldFilmIdCache;
                case "title"       : return (CACHE) fieldTitleCache;
                case "description" : return (CACHE) fieldDescriptionCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<FilmText> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedFilmTextCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            FilmTextEntityStoreSerializerImpl::new,
            TableIdentifier.of("sakila", "sakila", "film_text")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<FilmText> recycleAndPersist(PersistOperation<FilmText> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<FilmText> recycleAndRemove(RemoveOperation<FilmText> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<FilmText> recycleAndUpdate(UpdateOperation<FilmText> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<FilmText> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<FilmText>, FieldCache<?>>>of(
            Tuples.of(FilmText.FILM_ID,    fieldFilmIdCache),
            Tuples.of(FilmText.TITLE,      fieldTitleCache),
            Tuples.of(FilmText.DESCRIPTION,fieldDescriptionCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<FilmText>> columnIdentifiers = Stream.<HasIdentifier<FilmText>>of(
            FilmText.FILM_ID,
            FilmText.TITLE,
            FilmText.DESCRIPTION
        )
            .map(HasIdentifier::identifier)
            .collect(toSet());
        return EntityStoreHolder.of(
            entityStore,
            fieldCaches,
            multiFieldCaches,
            columnIdentifiers
        );
    }
    
    public static CompletableFuture<GeneratedFilmTextCacheHolder> reload(CompletableFuture<EntityStore<FilmText>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfShort> fieldFilmIdCacheFuture =
            DataStoreHolderUtil.buildShortCache(entityStoreFuture, executor, FilmText.FILM_ID, FieldCache.DISTINCT);
        
        final CompletableFuture<FieldCache.OfString> fieldTitleCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, FilmText.TITLE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldDescriptionCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, FilmText.DESCRIPTION, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedFilmTextCacheHolder(
                    entityStore,
                    fieldFilmIdCacheFuture.get(),
                    fieldTitleCacheFuture.get(),
                    fieldDescriptionCacheFuture.get()
                );
            } catch (final ExecutionException | InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
    
    @Override
    public void close() {
        entityStore.close();
        fieldFilmIdCache.close();
        fieldTitleCache.close();
        fieldDescriptionCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                FilmText.Identifier.FILM_ID,
                FilmText.Identifier.TITLE,
                FilmText.Identifier.DESCRIPTION
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}