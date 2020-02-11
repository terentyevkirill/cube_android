package ua.onpu.presentation.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\u001a\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lua/onpu/presentation/fragments/TimerFragment;", "Lua/onpu/base/BaseFragment;", "Lua/onpu/presentation/viewModels/TimerViewModel;", "()V", "TAG", "", "args", "Lua/onpu/presentation/fragments/TimerFragmentArgs;", "getArgs", "()Lua/onpu/presentation/fragments/TimerFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "fragmentLayout", "", "getFragmentLayout", "()I", "timerState", "Lua/onpu/presentation/fragments/TimerFragment$TimerState;", "hideToolbar", "", "initData", "initListeners", "initObservers", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "TimerState", "app_debug"})
public final class TimerFragment extends ua.onpu.base.BaseFragment<ua.onpu.presentation.viewModels.TimerViewModel> {
    private final int fragmentLayout = ua.onpu.R.layout.fragment_timer;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final java.lang.String TAG = "TimerFragment";
    private ua.onpu.presentation.fragments.TimerFragment.TimerState timerState;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getFragmentLayout() {
        return 0;
    }
    
    private final ua.onpu.presentation.fragments.TimerFragmentArgs getArgs() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void initObservers() {
    }
    
    @java.lang.Override()
    public void initListeners() {
    }
    
    private final void initData() {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    private final void hideToolbar() {
    }
    
    public TimerFragment() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lua/onpu/presentation/fragments/TimerFragment$TimerState;", "", "(Ljava/lang/String;I)V", "Running", "Stopped", "app_debug"})
    public static enum TimerState {
        /*public static final*/ Running /* = new Running() */,
        /*public static final*/ Stopped /* = new Stopped() */;
        
        TimerState() {
        }
    }
}