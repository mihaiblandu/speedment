package com.company.sakila.generated;

import com.company.sakila.sakila.sakila.actor.generated.GeneratedActorCacheHolder;
import com.company.sakila.sakila.sakila.actor_info.generated.GeneratedActorInfoCacheHolder;
import com.company.sakila.sakila.sakila.address.generated.GeneratedAddressCacheHolder;
import com.company.sakila.sakila.sakila.category.generated.GeneratedCategoryCacheHolder;
import com.company.sakila.sakila.sakila.city.generated.GeneratedCityCacheHolder;
import com.company.sakila.sakila.sakila.country.generated.GeneratedCountryCacheHolder;
import com.company.sakila.sakila.sakila.customer.generated.GeneratedCustomerCacheHolder;
import com.company.sakila.sakila.sakila.customer_list.generated.GeneratedCustomerListCacheHolder;
import com.company.sakila.sakila.sakila.film.generated.GeneratedFilmCacheHolder;
import com.company.sakila.sakila.sakila.film_actor.generated.GeneratedFilmActorCacheHolder;
import com.company.sakila.sakila.sakila.film_category.generated.GeneratedFilmCategoryCacheHolder;
import com.company.sakila.sakila.sakila.film_list.generated.GeneratedFilmListCacheHolder;
import com.company.sakila.sakila.sakila.film_text.generated.GeneratedFilmTextCacheHolder;
import com.company.sakila.sakila.sakila.inventory.generated.GeneratedInventoryCacheHolder;
import com.company.sakila.sakila.sakila.language.generated.GeneratedLanguageCacheHolder;
import com.company.sakila.sakila.sakila.nicer_but_slower_film_list.generated.GeneratedNicerButSlowerFilmListCacheHolder;
import com.company.sakila.sakila.sakila.payment.generated.GeneratedPaymentCacheHolder;
import com.company.sakila.sakila.sakila.rental.generated.GeneratedRentalCacheHolder;
import com.company.sakila.sakila.sakila.sales_by_film_category.generated.GeneratedSalesByFilmCategoryCacheHolder;
import com.company.sakila.sakila.sakila.sales_by_store.generated.GeneratedSalesByStoreCacheHolder;
import com.company.sakila.sakila.sakila.staff.generated.GeneratedStaffCacheHolder;
import com.company.sakila.sakila.sakila.staff_list.generated.GeneratedStaffListCacheHolder;
import com.company.sakila.sakila.sakila.store.generated.GeneratedStoreCacheHolder;
import com.company.sakila.sakila.sakila.user.generated.GeneratedUserCacheHolder;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.DataStoreHolder;
import com.speedment.enterprise.datastore.runtime.DataStoreReloader;
import com.speedment.enterprise.datastore.runtime.util.DataStoreHolderUtil;
import com.speedment.runtime.core.component.StreamSupplierComponent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/**
 * A reloader that loads updates from a stream source and creates a new holder
 * for that state.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedSakilaCacheReloader implements DataStoreReloader {
    
    @Override
    public DataStoreHolder reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        final CompletableFuture<GeneratedUserCacheHolder> userHolder                                      = GeneratedUserCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedActorCacheHolder> actorHolder                                    = GeneratedActorCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedAddressCacheHolder> addressHolder                                = GeneratedAddressCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedCategoryCacheHolder> categoryHolder                              = GeneratedCategoryCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedCityCacheHolder> cityHolder                                      = GeneratedCityCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedCountryCacheHolder> countryHolder                                = GeneratedCountryCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedCustomerCacheHolder> customerHolder                              = GeneratedCustomerCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedFilmCacheHolder> filmHolder                                      = GeneratedFilmCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedFilmActorCacheHolder> filmActorHolder                            = GeneratedFilmActorCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedFilmCategoryCacheHolder> filmCategoryHolder                      = GeneratedFilmCategoryCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedFilmTextCacheHolder> filmTextHolder                              = GeneratedFilmTextCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedInventoryCacheHolder> inventoryHolder                            = GeneratedInventoryCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedLanguageCacheHolder> languageHolder                              = GeneratedLanguageCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedPaymentCacheHolder> paymentHolder                                = GeneratedPaymentCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedRentalCacheHolder> rentalHolder                                  = GeneratedRentalCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedStaffCacheHolder> staffHolder                                    = GeneratedStaffCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedStoreCacheHolder> storeHolder                                    = GeneratedStoreCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedActorInfoCacheHolder> actorInfoHolder                            = GeneratedActorInfoCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedCustomerListCacheHolder> customerListHolder                      = GeneratedCustomerListCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedFilmListCacheHolder> filmListHolder                              = GeneratedFilmListCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedNicerButSlowerFilmListCacheHolder> nicerButSlowerFilmListHolder  = GeneratedNicerButSlowerFilmListCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedSalesByFilmCategoryCacheHolder> salesByFilmCategoryHolder        = GeneratedSalesByFilmCategoryCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedSalesByStoreCacheHolder> salesByStoreHolder                      = GeneratedSalesByStoreCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedStaffListCacheHolder> staffListHolder                            = GeneratedStaffListCacheHolder.reload(streamSupplier, executor);
        
        final DataStoreHolder holder;
        try {
            holder = new GeneratedSakilaDataStoreHolder(
                userHolder.get(),
                actorHolder.get(),
                addressHolder.get(),
                categoryHolder.get(),
                cityHolder.get(),
                countryHolder.get(),
                customerHolder.get(),
                filmHolder.get(),
                filmActorHolder.get(),
                filmCategoryHolder.get(),
                filmTextHolder.get(),
                inventoryHolder.get(),
                languageHolder.get(),
                paymentHolder.get(),
                rentalHolder.get(),
                staffHolder.get(),
                storeHolder.get(),
                actorInfoHolder.get(),
                customerListHolder.get(),
                filmListHolder.get(),
                nicerButSlowerFilmListHolder.get(),
                salesByFilmCategoryHolder.get(),
                salesByStoreHolder.get(),
                staffListHolder.get()
            );
        } catch (final ExecutionException | InterruptedException ex) {
            throw new RuntimeException("Error reloading caches.", ex);
        }
        
        DataStoreHolderUtil.decorateEntityStores(holder, executor);
        return holder;
    }
}