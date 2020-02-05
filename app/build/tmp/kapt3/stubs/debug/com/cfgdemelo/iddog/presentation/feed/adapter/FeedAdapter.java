package com.cfgdemelo.iddog.presentation.feed.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001\u001dB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J\u0014\u0010\u001a\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/cfgdemelo/iddog/presentation/feed/adapter/FeedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/cfgdemelo/iddog/presentation/feed/adapter/FeedAdapter$FeedViewHolder;", "Landroid/view/View$OnClickListener;", "glide", "Lcom/bumptech/glide/RequestManager;", "itemClick", "Lcom/cfgdemelo/iddog/presentation/feed/adapter/ItemClick;", "(Lcom/bumptech/glide/RequestManager;Lcom/cfgdemelo/iddog/presentation/feed/adapter/ItemClick;)V", "photoList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onClick", "view", "Landroid/view/View;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refresh", "newList", "", "FeedViewHolder", "app_debug"})
public final class FeedAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.cfgdemelo.iddog.presentation.feed.adapter.FeedAdapter.FeedViewHolder> implements android.view.View.OnClickListener {
    private final java.util.ArrayList<java.lang.String> photoList = null;
    private final com.bumptech.glide.RequestManager glide = null;
    private final com.cfgdemelo.iddog.presentation.feed.adapter.ItemClick itemClick = null;
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.cfgdemelo.iddog.presentation.feed.adapter.FeedAdapter.FeedViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.cfgdemelo.iddog.presentation.feed.adapter.FeedAdapter.FeedViewHolder holder, int position) {
    }
    
    public final void refresh(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> newList) {
    }
    
    public FeedAdapter(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager glide, @org.jetbrains.annotations.NotNull()
    com.cfgdemelo.iddog.presentation.feed.adapter.ItemClick itemClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/cfgdemelo/iddog/presentation/feed/adapter/FeedAdapter$FeedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/cfgdemelo/iddog/presentation/feed/adapter/FeedAdapter;Landroid/view/View;)V", "image", "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", "setOnClick", "", "onClick", "Landroid/view/View$OnClickListener;", "app_debug"})
    public final class FeedViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView image = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImage() {
            return null;
        }
        
        public final void setOnClick(@org.jetbrains.annotations.NotNull()
        android.view.View.OnClickListener onClick) {
        }
        
        public FeedViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}