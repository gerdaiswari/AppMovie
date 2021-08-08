package com.example.appmovie.module.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001c\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u0004\u00f8\u0001\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/example/appmovie/module/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "detailMovieLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/appmovie/model/MovieDetail;", "getDetailMovieLiveData", "()Landroidx/lifecycle/MutableLiveData;", "detailMovieResultLiveData", "Lkotlin/Result;", "getDetailMovieResultLiveData", "errorMessageLiveData", "", "getErrorMessageLiveData", "repository", "Lcom/example/appmovie/data/MovieRepository;", "getDetailMovie", "", "movieId", "", "handleMovieDetailResponse", "result", "(Ljava/lang/Object;)V", "setContext", "context", "Landroid/content/Context;", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private com.example.appmovie.data.MovieRepository repository;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Result<com.example.appmovie.model.MovieDetail>> detailMovieResultLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.appmovie.model.MovieDetail> detailMovieLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorMessageLiveData = null;
    
    public DetailViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Result<com.example.appmovie.model.MovieDetail>> getDetailMovieResultLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.appmovie.model.MovieDetail> getDetailMovieLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorMessageLiveData() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void getDetailMovie(int movieId) {
    }
    
    public final void handleMovieDetailResponse(@org.jetbrains.annotations.NotNull()
    java.lang.Object result) {
    }
}