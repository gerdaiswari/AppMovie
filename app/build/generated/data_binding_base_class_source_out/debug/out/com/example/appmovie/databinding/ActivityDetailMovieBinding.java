// Generated by data binding compiler. Do not edit!
package com.example.appmovie.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.appmovie.R;
import com.example.appmovie.model.MovieDetail;
import com.example.appmovie.module.detail.DetailMovieActivity;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDetailMovieBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backImageView;

  @NonNull
  public final ImageView detailMovieImageView;

  @NonNull
  public final TextView detailMovieTitleTextView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView movieLinkTextView;

  @NonNull
  public final TextView movieRatingTextView;

  @NonNull
  public final TextView overviewTextView;

  @NonNull
  public final TextView overviewTitleTextView;

  @NonNull
  public final TextView statusTextView;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView totalRateTextView;

  @NonNull
  public final TextView yearReleasedTextView;

  @Bindable
  protected MovieDetail mMovie;

  @Bindable
  protected DetailMovieActivity mActivity;

  protected ActivityDetailMovieBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView backImageView, ImageView detailMovieImageView, TextView detailMovieTitleTextView,
      ImageView imageView2, TextView movieLinkTextView, TextView movieRatingTextView,
      TextView overviewTextView, TextView overviewTitleTextView, TextView statusTextView,
      TextView textView7, TextView totalRateTextView, TextView yearReleasedTextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backImageView = backImageView;
    this.detailMovieImageView = detailMovieImageView;
    this.detailMovieTitleTextView = detailMovieTitleTextView;
    this.imageView2 = imageView2;
    this.movieLinkTextView = movieLinkTextView;
    this.movieRatingTextView = movieRatingTextView;
    this.overviewTextView = overviewTextView;
    this.overviewTitleTextView = overviewTitleTextView;
    this.statusTextView = statusTextView;
    this.textView7 = textView7;
    this.totalRateTextView = totalRateTextView;
    this.yearReleasedTextView = yearReleasedTextView;
  }

  public abstract void setMovie(@Nullable MovieDetail movie);

  @Nullable
  public MovieDetail getMovie() {
    return mMovie;
  }

  public abstract void setActivity(@Nullable DetailMovieActivity activity);

  @Nullable
  public DetailMovieActivity getActivity() {
    return mActivity;
  }

  @NonNull
  public static ActivityDetailMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_detail_movie, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailMovieBinding>inflateInternal(inflater, R.layout.activity_detail_movie, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDetailMovieBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_detail_movie, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailMovieBinding>inflateInternal(inflater, R.layout.activity_detail_movie, null, false, component);
  }

  public static ActivityDetailMovieBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityDetailMovieBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDetailMovieBinding)bind(component, view, R.layout.activity_detail_movie);
  }
}
