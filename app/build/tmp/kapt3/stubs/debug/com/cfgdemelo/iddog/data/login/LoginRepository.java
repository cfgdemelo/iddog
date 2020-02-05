package com.cfgdemelo.iddog.data.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/cfgdemelo/iddog/data/login/LoginRepository;", "", "remoteDataSource", "Lcom/cfgdemelo/iddog/data/datasource/RemoteDataSource;", "cacheDataSource", "Lcom/cfgdemelo/iddog/data/datasource/CacheDataSource;", "(Lcom/cfgdemelo/iddog/data/datasource/RemoteDataSource;Lcom/cfgdemelo/iddog/data/datasource/CacheDataSource;)V", "getLoggedUser", "Ldata/model/User;", "login", "", "context", "Landroid/content/Context;", "email", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LoginRepository {
    private final com.cfgdemelo.iddog.data.datasource.RemoteDataSource remoteDataSource = null;
    private final com.cfgdemelo.iddog.data.datasource.CacheDataSource cacheDataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final data.model.User getLoggedUser() {
        return null;
    }
    
    public LoginRepository(@org.jetbrains.annotations.NotNull()
    com.cfgdemelo.iddog.data.datasource.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.cfgdemelo.iddog.data.datasource.CacheDataSource cacheDataSource) {
        super();
    }
}