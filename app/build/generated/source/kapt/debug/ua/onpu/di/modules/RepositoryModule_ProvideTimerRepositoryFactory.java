package ua.onpu.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ua.onpu.db.CubeLocalDb;
import ua.onpu.networkingApi.ApiService;
import ua.onpu.repository.IntervalRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideTimerRepositoryFactory implements Factory<IntervalRepository> {
  private final RepositoryModule module;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<CubeLocalDb> cubeLocalDbProvider;

  public RepositoryModule_ProvideTimerRepositoryFactory(RepositoryModule module,
      Provider<ApiService> apiServiceProvider, Provider<CubeLocalDb> cubeLocalDbProvider) {
    this.module = module;
    this.apiServiceProvider = apiServiceProvider;
    this.cubeLocalDbProvider = cubeLocalDbProvider;
  }

  @Override
  public IntervalRepository get() {
    return provideTimerRepository(module, apiServiceProvider.get(), cubeLocalDbProvider.get());
  }

  public static RepositoryModule_ProvideTimerRepositoryFactory create(RepositoryModule module,
      Provider<ApiService> apiServiceProvider, Provider<CubeLocalDb> cubeLocalDbProvider) {
    return new RepositoryModule_ProvideTimerRepositoryFactory(module, apiServiceProvider, cubeLocalDbProvider);
  }

  public static IntervalRepository provideTimerRepository(RepositoryModule instance,
      ApiService apiService, CubeLocalDb cubeLocalDb) {
    return Preconditions.checkNotNull(instance.provideTimerRepository(apiService, cubeLocalDb), "Cannot return null from a non-@Nullable @Provides method");
  }
}
