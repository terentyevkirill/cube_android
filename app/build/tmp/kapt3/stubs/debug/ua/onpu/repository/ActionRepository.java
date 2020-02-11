package ua.onpu.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH&\u00a8\u0006\u000f"}, d2 = {"Lua/onpu/repository/ActionRepository;", "", "addAction", "", "action", "Lua/onpu/db/entity/Action;", "deleteAction", "editAction", "getActionById", "id", "", "getAllActions", "Landroidx/lifecycle/LiveData;", "", "getId", "app_debug"})
public abstract interface ActionRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<ua.onpu.db.entity.Action>> getAllActions();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ua.onpu.db.entity.Action getActionById(long id);
    
    public abstract void addAction(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Action action);
    
    public abstract void editAction(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Action action);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.Long> getId();
    
    public abstract void deleteAction(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Action action);
}