package com.cfgdemelo.iddog.domain.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/cfgdemelo/iddog/domain/feed/FeedUseCase;", "", "feedRepository", "Lcom/cfgdemelo/iddog/data/feed/FeedRepository;", "(Lcom/cfgdemelo/iddog/data/feed/FeedRepository;)V", "feed", "Lcom/cfgdemelo/iddog/data/model/FeedPayload;", "category", "", "auth", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FeedUseCase {
    private final com.cfgdemelo.iddog.data.feed.FeedRepository feedRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object feed(@org.jetbrains.annotations.Nullable()
    java.lang.String category, @org.jetbrains.annotations.Nullable()
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.cfgdemelo.iddog.data.model.FeedPayload> p2) {
        return null;
    }
    
    public FeedUseCase(@org.jetbrains.annotations.NotNull()
    com.cfgdemelo.iddog.data.feed.FeedRepository feedRepository) {
        super();
    }
}