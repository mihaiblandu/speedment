package com.company.sakila.sakila.sakila.user.generated;

import com.company.sakila.sakila.sakila.user.User;
import com.company.sakila.sakila.sakila.user.UserEntityStoreSerializerImpl;
import com.company.sakila.sakila.sakila.user.UserManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfLong;
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
 * UserManager}.
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
public final class GeneratedUserCacheHolder implements EntityStoreHolder<User> {
    
    private final EntityStore<User> entityStore;
    private final OfLong fieldIdCache;
    private final OfString fieldNameCache;
    private final OfString fieldSurNameCache;
    
    public GeneratedUserCacheHolder(
            EntityStore<User> entityStore,
            OfLong fieldIdCache,
            OfString fieldNameCache,
            OfString fieldSurNameCache) {
        
        this.entityStore       = requireNonNull(entityStore);
        this.fieldIdCache      = requireNonNull(fieldIdCache);
        this.fieldNameCache    = requireNonNull(fieldNameCache);
        this.fieldSurNameCache = requireNonNull(fieldSurNameCache);
    }
    
    @Override
    public EntityStore<User> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<User> columnId) {
        if (columnId instanceof User.Identifier) {
            final User.Identifier _id = (User.Identifier) columnId;
            switch (_id) {
                case ID       : return (CACHE) fieldIdCache;
                case NAME     : return (CACHE) fieldNameCache;
                case SUR_NAME : return (CACHE) fieldSurNameCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "id"       : return (CACHE) fieldIdCache;
                case "name"     : return (CACHE) fieldNameCache;
                case "sur_name" : return (CACHE) fieldSurNameCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<User> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedUserCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            UserEntityStoreSerializerImpl::new,
            TableIdentifier.of("sakila", "sakila", "user")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<User> recycleAndPersist(PersistOperation<User> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<User> recycleAndRemove(RemoveOperation<User> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<User> recycleAndUpdate(UpdateOperation<User> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<User> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<User>, FieldCache<?>>>of(
            Tuples.of(User.ID,      fieldIdCache),
            Tuples.of(User.NAME,    fieldNameCache),
            Tuples.of(User.SUR_NAME,fieldSurNameCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<User>> columnIdentifiers = Stream.<HasIdentifier<User>>of(
            User.ID,
            User.NAME,
            User.SUR_NAME
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
    
    public static CompletableFuture<GeneratedUserCacheHolder> reload(CompletableFuture<EntityStore<User>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfLong> fieldIdCacheFuture =
            DataStoreHolderUtil.buildLongCache(entityStoreFuture, executor, User.ID, FieldCache.DISTINCT);
        
        final CompletableFuture<FieldCache.OfString> fieldNameCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, User.NAME, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldSurNameCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, User.SUR_NAME, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedUserCacheHolder(
                    entityStore,
                    fieldIdCacheFuture.get(),
                    fieldNameCacheFuture.get(),
                    fieldSurNameCacheFuture.get()
                );
            } catch (final ExecutionException | InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
    
    @Override
    public void close() {
        entityStore.close();
        fieldIdCache.close();
        fieldNameCache.close();
        fieldSurNameCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                User.Identifier.ID,
                User.Identifier.NAME,
                User.Identifier.SUR_NAME
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}