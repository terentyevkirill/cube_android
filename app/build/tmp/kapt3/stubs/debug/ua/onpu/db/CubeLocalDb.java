package ua.onpu.db;

import java.lang.System;

@androidx.room.Database(entities = {ua.onpu.db.entity.Action.class, ua.onpu.db.entity.Interval.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lua/onpu/db/CubeLocalDb;", "Landroidx/room/RoomDatabase;", "()V", "actionsDao", "Lua/onpu/db/dao/ActionsDao;", "intervalsDao", "Lua/onpu/db/dao/IntervalsDao;", "Companion", "app_debug"})
public abstract class CubeLocalDb extends androidx.room.RoomDatabase {
    private static ua.onpu.db.CubeLocalDb cubeLocalDb;
    private static final java.lang.String NAME_LOCAL_DB = "cube.db";
    public static final int VERSION_CUBE_DB = 1;
    public static final ua.onpu.db.CubeLocalDb.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract ua.onpu.db.dao.ActionsDao actionsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ua.onpu.db.dao.IntervalsDao intervalsDao();
    
    public CubeLocalDb() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lua/onpu/db/CubeLocalDb$Companion;", "", "()V", "NAME_LOCAL_DB", "", "VERSION_CUBE_DB", "", "cubeLocalDb", "Lua/onpu/db/CubeLocalDb;", "buildCubeDb", "appContext", "Landroid/content/Context;", "getCubeDatabase", "populateInitialData", "Lkotlinx/coroutines/Job;", "context", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ua.onpu.db.CubeLocalDb getCubeDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context appContext) {
            return null;
        }
        
        private final ua.onpu.db.CubeLocalDb buildCubeDb(android.content.Context appContext) {
            return null;
        }
        
        private final kotlinx.coroutines.Job populateInitialData(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}