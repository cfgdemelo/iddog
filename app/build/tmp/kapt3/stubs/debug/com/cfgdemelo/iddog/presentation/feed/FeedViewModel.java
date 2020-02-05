package com.cfgdemelo.iddog.presentation.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/cfgdemelo/iddog/presentation/feed/FeedViewModel;", "Landroidx/lifecycle/ViewModel;", "feedUseCase", "Lcom/cfgdemelo/iddog/domain/feed/FeedUseCase;", "(Lcom/cfgdemelo/iddog/domain/feed/FeedUseCase;)V", "_feed", "Landroidx/lifecycle/MutableLiveData;", "Ldata/model/FeedPayload;", "feed", "Landroidx/lifecycle/LiveData;", "getFeed", "()Landroidx/lifecycle/LiveData;", "getNewFeed", "", "category", "", "Companion", "app_debug"})
public final class FeedViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<data.model.FeedPayload> _feed = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<data.model.FeedPayload> feed = null;
    private final com.cfgdemelo.iddog.domain.feed.FeedUseCase feedUseCase = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HUSKY = "husky";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HOUND = "hound";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PUG = "pug";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LABRADOR = "labrador";
    public static final com.cfgdemelo.iddog.presentation.feed.FeedViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<data.model.FeedPayload> getFeed() {
        return null;
    }
    
    public final void getNewFeed(@org.jetbrains.annotations.Nullable()
    java.lang.String category) {
    }
    
    public FeedViewModel(@org.jetbrains.annotations.NotNull()
    com.cfgdemelo.iddog.domain.feed.FeedUseCase feedUseCase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/cfgdemelo/iddog/presentation/feed/FeedViewModel$Companion;", "", "()V", "HOUND", "", "HUSKY", "LABRADOR", "PUG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}