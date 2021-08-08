package com.example.appmovie.module.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\b\u0010&\u001a\u00020\u001dH\u0002J\b\u0010\'\u001a\u00020\u001dH\u0002J\b\u0010(\u001a\u00020\u001dH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006)"}, d2 = {"Lcom/example/appmovie/module/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/appmovie/module/main/MovieTypeListAdapter$MovieTypeListener;", "Lcom/example/appmovie/module/main/MovieListAdapter$MovieListListener;", "()V", "binding", "Lcom/example/appmovie/databinding/ActivityMainBinding;", "getBinding", "()Lcom/example/appmovie/databinding/ActivityMainBinding;", "setBinding", "(Lcom/example/appmovie/databinding/ActivityMainBinding;)V", "movieTypeAdapter", "Lcom/example/appmovie/module/main/MovieTypeListAdapter;", "getMovieTypeAdapter", "()Lcom/example/appmovie/module/main/MovieTypeListAdapter;", "movieTypeAdapter$delegate", "Lkotlin/Lazy;", "moviesAdapter", "Lcom/example/appmovie/module/main/MovieListAdapter;", "getMoviesAdapter", "()Lcom/example/appmovie/module/main/MovieListAdapter;", "moviesAdapter$delegate", "viewModel", "Lcom/example/appmovie/module/main/MainViewModel;", "getViewModel", "()Lcom/example/appmovie/module/main/MainViewModel;", "setViewModel", "(Lcom/example/appmovie/module/main/MainViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMovieClicked", "id", "", "onMovieTypeClicked", "setupDataBinding", "setupListener", "setupMovieType", "setupObserver", "setupViewModel", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.appmovie.module.main.MovieTypeListAdapter.MovieTypeListener, com.example.appmovie.module.main.MovieListAdapter.MovieListListener {
    public com.example.appmovie.module.main.MainViewModel viewModel;
    public com.example.appmovie.databinding.ActivityMainBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy moviesAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy movieTypeAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.appmovie.module.main.MainViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.appmovie.module.main.MainViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.appmovie.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.appmovie.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.appmovie.module.main.MovieListAdapter getMoviesAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.appmovie.module.main.MovieTypeListAdapter getMovieTypeAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupDataBinding() {
    }
    
    private final void setupListener() {
    }
    
    private final void setupObserver() {
    }
    
    private final void setupViewModel() {
    }
    
    private final void setupMovieType() {
    }
    
    @java.lang.Override()
    public void onMovieTypeClicked(int id) {
    }
    
    @java.lang.Override()
    public void onMovieClicked(int id) {
    }
}