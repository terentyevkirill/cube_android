package ua.onpu.presentation.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lua/onpu/presentation/viewModels/AssignToTrackerViewModel;", "Lua/onpu/base/BaseViewModel;", "actionRepository", "Lua/onpu/repository/ActionRepository;", "(Lua/onpu/repository/ActionRepository;)V", "getAllActions", "Landroidx/lifecycle/LiveData;", "", "Lua/onpu/db/entity/Action;", "app_debug"})
public final class AssignToTrackerViewModel extends ua.onpu.base.BaseViewModel {
    private final ua.onpu.repository.ActionRepository actionRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<ua.onpu.db.entity.Action>> getAllActions() {
        return null;
    }
    
    @javax.inject.Inject()
    public AssignToTrackerViewModel(@org.jetbrains.annotations.NotNull()
    ua.onpu.repository.ActionRepository actionRepository) {
        super();
    }
}