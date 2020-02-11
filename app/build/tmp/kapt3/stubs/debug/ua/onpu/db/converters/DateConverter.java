package ua.onpu.db.converters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lua/onpu/db/converters/DateConverter;", "", "()V", "fromDate", "", "date", "Ljava/util/Date;", "toDate", "timestamp", "app_debug"})
public final class DateConverter {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.Date toDate(long timestamp) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    public final long fromDate(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return 0L;
    }
    
    public DateConverter() {
        super();
    }
}