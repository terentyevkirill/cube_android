package ua.onpu.presentation.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lua/onpu/presentation/viewModels/AddActionViewModel;", "Lua/onpu/base/BaseViewModel;", "actionRepository", "Lua/onpu/repository/ActionRepository;", "(Lua/onpu/repository/ActionRepository;)V", "addAction", "", "action", "Lua/onpu/db/entity/Action;", "deleteAction", "editAction", "getActionById", "id", "", "getId", "", "app_debug"})
public final class AddActionViewModel extends ua.onpu.base.BaseViewModel {
    private final ua.onpu.repository.ActionRepository actionRepository = null;
    
    public final void addAction(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Action action) {
    }
    
    public final void editAction(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Action action) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Long> getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.onpu.db.entity.Action getActionById(long id) {
        return null;
    }
    
    public final void deleteAction(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Action action) {
    }
    
    @javax.inject.Inject()
    public AddActionViewModel(@org.jetbrains.annotations.NotNull()
    ua.onpu.repository.ActionRepository actionRepository) {
        super();
    }
}