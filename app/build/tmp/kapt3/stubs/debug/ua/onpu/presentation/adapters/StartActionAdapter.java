package ua.onpu.presentation.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B6\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0014\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lua/onpu/presentation/adapters/StartActionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lua/onpu/presentation/adapters/StartActionAdapter$ActiveActionViewHolder;", "actions", "", "Lua/onpu/db/entity/Action;", "openTimerFragment", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "action", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setActions", "ActiveActionViewHolder", "app_debug"})
public final class StartActionAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ua.onpu.presentation.adapters.StartActionAdapter.ActiveActionViewHolder> {
    private java.util.List<ua.onpu.db.entity.Action> actions;
    private final kotlin.jvm.functions.Function1<ua.onpu.db.entity.Action, kotlin.Unit> openTimerFragment = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.onpu.presentation.adapters.StartActionAdapter.ActiveActionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ua.onpu.presentation.adapters.StartActionAdapter.ActiveActionViewHolder holder, int position) {
    }
    
    public final void setActions(@org.jetbrains.annotations.NotNull()
    java.util.List<ua.onpu.db.entity.Action> actions) {
    }
    
    public StartActionAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<ua.onpu.db.entity.Action> actions, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.onpu.db.entity.Action, kotlin.Unit> openTimerFragment) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J1\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00060\n\u00a8\u0006\r"}, d2 = {"Lua/onpu/presentation/adapters/StartActionAdapter$ActiveActionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "bindAction", "", "action", "Lua/onpu/db/entity/Action;", "openTimerFragment", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "app_debug"})
    public static final class ActiveActionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bindAction(@org.jetbrains.annotations.NotNull()
        ua.onpu.db.entity.Action action, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super ua.onpu.db.entity.Action, kotlin.Unit> openTimerFragment) {
        }
        
        public ActiveActionViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}