package ua.onpu.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lua/onpu/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "resourceProvider", "Lua/onpu/core/ResourceProvider;", "getResourceProvider", "()Lua/onpu/core/ResourceProvider;", "setResourceProvider", "(Lua/onpu/core/ResourceProvider;)V", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    protected ua.onpu.core.ResourceProvider resourceProvider;
    
    @org.jetbrains.annotations.NotNull()
    protected final ua.onpu.core.ResourceProvider getResourceProvider() {
        return null;
    }
    
    protected final void setResourceProvider(@org.jetbrains.annotations.NotNull()
    ua.onpu.core.ResourceProvider p0) {
    }
    
    public BaseViewModel() {
        super();
    }
}