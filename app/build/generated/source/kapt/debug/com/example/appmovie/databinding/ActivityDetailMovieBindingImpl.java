package com.example.appmovie.databinding;
import com.example.appmovie.R;
import com.example.appmovie.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailMovieBindingImpl extends ActivityDetailMovieBinding implements com.example.appmovie.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.detailMovieImageView, 9);
        sViewsWithIds.put(R.id.imageView2, 10);
        sViewsWithIds.put(R.id.textView7, 11);
        sViewsWithIds.put(R.id.overviewTitleTextView, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailMovieBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityDetailMovieBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            );
        this.backImageView.setTag(null);
        this.detailMovieTitleTextView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.movieLinkTextView.setTag(null);
        this.movieRatingTextView.setTag(null);
        this.overviewTextView.setTag(null);
        this.statusTextView.setTag(null);
        this.totalRateTextView.setTag(null);
        this.yearReleasedTextView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.appmovie.generated.callback.OnClickListener(this, 2);
        mCallback1 = new com.example.appmovie.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.movie == variableId) {
            setMovie((com.example.appmovie.model.MovieDetail) variable);
        }
        else if (BR.activity == variableId) {
            setActivity((com.example.appmovie.module.detail.DetailMovieActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMovie(@Nullable com.example.appmovie.model.MovieDetail Movie) {
        this.mMovie = Movie;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.movie);
        super.requestRebind();
    }
    public void setActivity(@Nullable com.example.appmovie.module.detail.DetailMovieActivity Activity) {
        this.mActivity = Activity;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.activity);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int movieVoteCount = 0;
        java.lang.String integerToStringMovieVoteCount = null;
        com.example.appmovie.model.MovieDetail movie = mMovie;
        java.lang.String movieOverview = null;
        java.lang.String movieHomepage = null;
        double movieVoteAverage = 0.0;
        java.lang.String doubleToStringMovieVoteAverage = null;
        java.lang.String movieTitle = null;
        java.lang.String movieReleaseData = null;
        java.lang.String movieStatus = null;
        com.example.appmovie.module.detail.DetailMovieActivity activity = mActivity;
        java.lang.String movieReleaseDataSubstringInt0Int4 = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (movie != null) {
                    // read movie.voteCount
                    movieVoteCount = movie.getVoteCount();
                    // read movie.overview
                    movieOverview = movie.getOverview();
                    // read movie.homepage
                    movieHomepage = movie.getHomepage();
                    // read movie.voteAverage
                    movieVoteAverage = movie.getVoteAverage();
                    // read movie.title
                    movieTitle = movie.getTitle();
                    // read movie.releaseData
                    movieReleaseData = movie.getReleaseData();
                    // read movie.status
                    movieStatus = movie.getStatus();
                }


                // read Integer.toString(movie.voteCount)
                integerToStringMovieVoteCount = java.lang.Integer.toString(movieVoteCount);
                // read Double.toString(movie.voteAverage)
                doubleToStringMovieVoteAverage = java.lang.Double.toString(movieVoteAverage);
                if (movieReleaseData != null) {
                    // read movie.releaseData.substring(0, 4)
                    movieReleaseDataSubstringInt0Int4 = movieReleaseData.substring(0, 4);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.backImageView.setOnClickListener(mCallback1);
            this.movieLinkTextView.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.detailMovieTitleTextView, movieTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieLinkTextView, movieHomepage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieRatingTextView, doubleToStringMovieVoteAverage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.overviewTextView, movieOverview);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusTextView, movieStatus);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.totalRateTextView, integerToStringMovieVoteCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.yearReleasedTextView, movieReleaseDataSubstringInt0Int4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // movie
                com.example.appmovie.model.MovieDetail movie = mMovie;
                // activity != null
                boolean activityJavaLangObjectNull = false;
                // movie.homepage
                java.lang.String movieHomepage = null;
                // activity
                com.example.appmovie.module.detail.DetailMovieActivity activity = mActivity;
                // movie != null
                boolean movieJavaLangObjectNull = false;



                activityJavaLangObjectNull = (activity) != (null);
                if (activityJavaLangObjectNull) {



                    movieJavaLangObjectNull = (movie) != (null);
                    if (movieJavaLangObjectNull) {


                        movieHomepage = movie.getHomepage();

                        activity.onLinkClicked(movieHomepage);
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // activity != null
                boolean activityJavaLangObjectNull = false;
                // activity
                com.example.appmovie.module.detail.DetailMovieActivity activity = mActivity;



                activityJavaLangObjectNull = (activity) != (null);
                if (activityJavaLangObjectNull) {


                    activity.onBackPressed();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): movie
        flag 1 (0x2L): activity
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}