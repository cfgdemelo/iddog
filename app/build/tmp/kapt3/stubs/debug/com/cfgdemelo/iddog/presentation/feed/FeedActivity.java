package com.cfgdemelo.iddog.presentation.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\u0012\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/cfgdemelo/iddog/presentation/feed/FeedActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/cfgdemelo/iddog/presentation/feed/adapter/ItemClick;", "()V", "adapter", "Lcom/cfgdemelo/iddog/presentation/feed/adapter/FeedAdapter;", "glide", "Lcom/bumptech/glide/RequestManager;", "viewModel", "Lcom/cfgdemelo/iddog/presentation/feed/FeedViewModel;", "getViewModel", "()Lcom/cfgdemelo/iddog/presentation/feed/FeedViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "click", "", "url", "", "configRecyclerView", "configScreenBehavior", "configViewModelObservers", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class FeedActivity extends androidx.appcompat.app.AppCompatActivity implements com.cfgdemelo.iddog.presentation.feed.adapter.ItemClick {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.bumptech.glide.RequestManager glide;
    private com.cfgdemelo.iddog.presentation.feed.adapter.FeedAdapter adapter;
    public static final com.cfgdemelo.iddog.presentation.feed.FeedActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.cfgdemelo.iddog.presentation.feed.FeedViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void click(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    private final void configScreenBehavior() {
    }
    
    private final void configViewModelObservers() {
    }
    
    private final void configRecyclerView() {
    }
    
    public FeedActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/cfgdemelo/iddog/presentation/feed/FeedActivity$Companion;", "", "()V", "newInstance", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}