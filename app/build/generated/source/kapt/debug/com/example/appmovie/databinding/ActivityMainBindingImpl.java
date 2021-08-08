package com.example.appmovie.databinding;
import com.example.appmovie.R;
import com.example.appmovie.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appNameTextView, 3);
        sViewsWithIds.put(R.id.searchView, 4);
        sViewsWithIds.put(R.id.searchImageView, 5);
        sViewsWithIds.put(R.id.searchEditText, 6);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.EditText) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.movieTypeRecyclerView.setTag(null);
        this.moviesRecylerView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.activity == variableId) {
            setActivity((com.example.appmovie.module.main.MainActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setActivity(@Nullable com.example.appmovie.module.main.MainActivity Activity) {
        this.mActivity = Activity;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
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
        com.example.appmovie.module.main.MovieListAdapter activityMoviesAdapter = null;
        com.example.appmovie.module.main.MovieTypeListAdapter activityMovieTypeAdapter = null;
        com.example.appmovie.module.main.MainActivity activity = mActivity;

        if ((dirtyFlags & 0x3L) != 0) {



                if (activity != null) {
                    // read activity.moviesAdapter
                    activityMoviesAdapter = activity.getMoviesAdapter();
                    // read activity.movieTypeAdapter
                    activityMovieTypeAdapter = activity.getMovieTypeAdapter();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.movieTypeRecyclerView.setAdapter(activityMovieTypeAdapter);
            this.moviesRecylerView.setAdapter(activityMoviesAdapter);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): activity
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}