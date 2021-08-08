package com.example.appmovie.module.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0012J\"\u0010\u0016\u001a\u00020\u00122\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\r\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\r0\u0004\u00f8\u0001\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/example/appmovie/module/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "errorMessageLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorMessageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "moviesLiveData", "", "Lcom/example/appmovie/model/Movie;", "getMoviesLiveData", "moviesResultLiveData", "Lkotlin/Result;", "getMoviesResultLiveData", "repository", "Lcom/example/appmovie/data/MovieRepository;", "getNowPlayingMovies", "", "getPopularMovies", "getTopRatedMovies", "getUpcomingMovies", "handleMovieListResponse", "result", "(Ljava/lang/Object;)V", "searchMovies", "query", "setContext", "context", "Landroid/content/Context;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private com.example.appmovie.data.MovieRepository repository;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Result<java.util.List<com.example.appmovie.model.Movie>>> moviesResultLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.appmovie.model.Movie>> moviesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorMessageLiveData = null;
    
    public MainViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Result<java.util.List<com.example.appmovie.model.Movie>>> getMoviesResultLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.appmovie.model.Movie>> getMoviesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorMessageLiveData() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void getNowPlayingMovies() {
    }
    
    public final void getUpcomingMovies() {
    }
    
    public final void getPopularMovies() {
    }
    
    public final void getTopRatedMovies() {
    }
    
    public final void searchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void handleMovieListResponse(@org.jetbrains.annotations.NotNull()
    java.lang.Object result) {
    }
}