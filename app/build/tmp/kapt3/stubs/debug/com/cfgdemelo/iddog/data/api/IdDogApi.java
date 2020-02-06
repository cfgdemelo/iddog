package com.cfgdemelo.iddog.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ)\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/cfgdemelo/iddog/data/api/IdDogApi;", "", "feed", "Lcom/cfgdemelo/iddog/data/model/FeedPayload;", "category", "", "auth", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/cfgdemelo/iddog/data/model/LoginPayload;", "email", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface IdDogApi {
    public static final com.cfgdemelo.iddog.data.api.IdDogApi.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SIGN_UP = "signup";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMAIL = "email";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEED = "feed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTH = "Authorization";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CATEGORY = "category";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "signup")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.cfgdemelo.iddog.data.model.LoginPayload> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "feed")
    public abstract java.lang.Object feed(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "category")
    java.lang.String category, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.cfgdemelo.iddog.data.model.FeedPayload> p2);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/cfgdemelo/iddog/data/api/IdDogApi$Companion;", "", "()V", "AUTH", "", "CATEGORY", "EMAIL", "FEED", "SIGN_UP", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SIGN_UP = "signup";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EMAIL = "email";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FEED = "feed";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUTH = "Authorization";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CATEGORY = "category";
        
        private Companion() {
            super();
        }
    }
}