package com.cfgdemelo.iddog.data.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a&\u0010\u0006\u001a\u0002H\u0007\"\u0006\b\u0000\u0010\u0007\u0018\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086\b\u00a2\u0006\u0002\u0010\f\u001a\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\u00a8\u0006\u0013"}, d2 = {"dataModule", "Lorg/koin/core/module/Module;", "getDataModule", "()Lorg/koin/core/module/Module;", "dataModuleForTesting", "getDataModuleForTesting", "createWebService", "T", "okHttpClient", "Lokhttp3/OkHttpClient;", "url", "", "(Lokhttp3/OkHttpClient;Ljava/lang/String;)Ljava/lang/Object;", "providesOkHttpClient", "cacheDataSource", "Lcom/cfgdemelo/iddog/data/datasource/CacheDataSource;", "isTesting", "", "(Lcom/cfgdemelo/iddog/data/datasource/CacheDataSource;Ljava/lang/Boolean;)Lokhttp3/OkHttpClient;", "app_debug"})
public final class DataModuleKt {
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module dataModule = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module dataModuleForTesting = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getDataModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getDataModuleForTesting() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.OkHttpClient providesOkHttpClient(@org.jetbrains.annotations.NotNull()
    com.cfgdemelo.iddog.data.datasource.CacheDataSource cacheDataSource, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isTesting) {
        return null;
    }
}