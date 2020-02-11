package ua.onpu.core;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ResourceProvider_Factory implements Factory<ResourceProvider> {
  private final Provider<Context> contextProvider;

  public ResourceProvider_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ResourceProvider get() {
    return newInstance(contextProvider.get());
  }

  public static ResourceProvider_Factory create(Provider<Context> contextProvider) {
    return new ResourceProvider_Factory(contextProvider);
  }

  public static ResourceProvider newInstance(Context context) {
    return new ResourceProvider(context);
  }
}
