package ua.onpu.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u0011H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lua/onpu/repository/ActionRepositoryImpl;", "Lua/onpu/repository/ActionRepository;", "apiService", "Lua/onpu/networkingApi/ApiService;", "cubeLocalDb", "Lua/onpu/db/CubeLocalDb;", "(Lua/onpu/networkingApi/ApiService;Lua/onpu/db/CubeLocalDb;)V", "addAction", "", "action", "Lua/onpu/db/entity/Action;", "deleteAction", "editAction", "getActionById", "id", "", "getAllActions", "Landroidx/lifecycle/LiveData;", "", "getId", "app_debug"})
public final class ActionRepositoryImpl implements ua.onpu.repository.ActionRepository {
    private final ua.onpu.networkingApi.ApiService apiService = null;
    private final ua.onpu.db.CubeLocalDb cubeLocalDb = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.onpu.db.entity.Action getActionById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<ua.onpu.db.entity.Action>> getAllActions() {
        return null;
    }
    
    @java.lang.Override()
    public void addAction(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Action action) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.Long> getId() {
        return null;
    }
    
    @java.lang.Override()
    public void editAction(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Action action) {
    }
    
    @java.lang.Override()
    public void deleteAction(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Action action) {
    }
    
    @javax.inject.Inject()
    public ActionRepositoryImpl(@org.jetbrains.annotations.NotNull()
    ua.onpu.networkingApi.ApiService apiService, @org.jetbrains.annotations.NotNull()
    ua.onpu.db.CubeLocalDb cubeLocalDb) {
        super();
    }
}