package com.cfgdemelo.iddog.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u001d\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/cfgdemelo/iddog/data/api/IdDogApi;", "", "feed", "Ldata/model/FeedPayload;", "category", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Ldata/model/LoginPayload;", "email", "Companion", "app_debug"})
public abstract interface IdDogApi {
    public static final com.cfgdemelo.iddog.data.api.IdDogApi.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SIGN_UP = "signup";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMAIL = "email";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEED = "feed";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "signup")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super data.model.LoginPayload> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "feed")
    public abstract java.lang.Object feed(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "category")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super data.model.FeedPayload> p1);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/cfgdemelo/iddog/data/api/IdDogApi$Companion;", "", "()V", "EMAIL", "", "FEED", "SIGN_UP", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SIGN_UP = "signup";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EMAIL = "email";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FEED = "feed";
        
        private Companion() {
            super();
        }
    }
}