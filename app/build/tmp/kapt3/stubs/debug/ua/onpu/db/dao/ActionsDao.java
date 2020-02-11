package ua.onpu.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\f\u001a\u00020\u0003H\'J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110\u0013H\'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110\u0013H\'J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\'J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0019"}, d2 = {"Lua/onpu/db/dao/ActionsDao;", "", "add", "", "action", "Lua/onpu/db/entity/Action;", "addAction", "name", "", "color", "", "delete", "deleteAll", "get", "id", "", "getAll", "", "getAllAction", "Landroidx/lifecycle/LiveData;", "getAllAvailable", "getIds", "insert", "markActionAsDeleted", "update", "app_debug"})
public abstract interface ActionsDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM `action`")
    public abstract androidx.lifecycle.LiveData<java.util.List<ua.onpu.db.entity.Action>> getAllAction();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM `action` WHERE available = 1")
    public abstract androidx.lifecycle.LiveData<java.util.List<ua.onpu.db.entity.Action>> getAllAvailable();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM `action`")
    public abstract java.util.List<ua.onpu.db.entity.Action> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM `action` WHERE id = :id")
    public abstract ua.onpu.db.entity.Action get(long id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Action action);
    
    @androidx.room.Query(value = "Insert INTO `action` (name, color) VALUES(:name, :color)")
    public abstract void addAction(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int color);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void add(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Action action);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT id FROM `action` ORDER BY id")
    public abstract java.util.List<java.lang.Long> getIds();
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Action action);
    
    @androidx.room.Query(value = "UPDATE `action` SET available = \'FALSE\' WHERE id = :id")
    public abstract void markActionAsDeleted(long id);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    ua.onpu.db.entity.Action action);
    
    @androidx.room.Query(value = "DELETE FROM `action`")
    public abstract void deleteAll();
}