package ua.onpu.di.modules;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideApplicationFactory implements Factory<Context> {
  private final AppModule module;

  public AppModule_ProvideApplicationFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideApplication(module);
  }

  public static AppModule_ProvideApplicationFactory create(AppModule module) {
    return new AppModule_ProvideApplicationFactory(module);
  }

  public static Context provideApplication(AppModule instance) {
    return Preconditions.checkNotNull(instance.provideApplication(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
