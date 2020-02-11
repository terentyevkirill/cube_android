package ua.onpu.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import ua.onpu.db.CubeLocalDb;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideDbFactory implements Factory<CubeLocalDb> {
  private final DatabaseModule module;

  public DatabaseModule_ProvideDbFactory(DatabaseModule module) {
    this.module = module;
  }

  @Override
  public CubeLocalDb get() {
    return provideDb(module);
  }

  public static DatabaseModule_ProvideDbFactory create(DatabaseModule module) {
    return new DatabaseModule_ProvideDbFactory(module);
  }

  public static CubeLocalDb provideDb(DatabaseModule instance) {
    return Preconditions.checkNotNull(instance.provideDb(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
