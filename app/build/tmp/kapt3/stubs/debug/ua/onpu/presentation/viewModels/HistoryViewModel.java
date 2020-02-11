package ua.onpu.presentation.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lua/onpu/presentation/viewModels/HistoryViewModel;", "Lua/onpu/base/BaseViewModel;", "intervalRepository", "Lua/onpu/repository/IntervalRepository;", "(Lua/onpu/repository/IntervalRepository;)V", "intervalsWithActions", "Landroidx/lifecycle/LiveData;", "", "Lua/onpu/db/converters/IntervalWithAction;", "deleteAllIntervals", "", "getAllIntervalsWithActions", "isHistoryEmpty", "", "app_debug"})
public final class HistoryViewModel extends ua.onpu.base.BaseViewModel {
    private final androidx.lifecycle.LiveData<java.util.List<ua.onpu.db.converters.IntervalWithAction>> intervalsWithActions = null;
    private final ua.onpu.repository.IntervalRepository intervalRepository = null;
    
    public final boolean isHistoryEmpty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<ua.onpu.db.converters.IntervalWithAction>> getAllIntervalsWithActions() {
        return null;
    }
    
    public final void deleteAllIntervals() {
    }
    
    @javax.inject.Inject()
    public HistoryViewModel(@org.jetbrains.annotations.NotNull()
    ua.onpu.repository.IntervalRepository intervalRepository) {
        super();
    }
}