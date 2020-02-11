package ua.onpu.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ua.onpu.db.CubeLocalDb;
import ua.onpu.networkingApi.ApiService;
import ua.onpu.repository.HistoryCalendarRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideHistoryCalendarRepositoryFactory implements Factory<HistoryCalendarRepository> {
  private final RepositoryModule module;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<CubeLocalDb> cubeLocalDbProvider;

  public RepositoryModule_ProvideHistoryCalendarRepositoryFactory(RepositoryModule module,
      Provider<ApiService> apiServiceProvider, Provider<CubeLocalDb> cubeLocalDbProvider) {
    this.module = module;
    this.apiServiceProvider = apiServiceProvider;
    this.cubeLocalDbProvider = cubeLocalDbProvider;
  }

  @Override
  public HistoryCalendarRepository get() {
    return provideHistoryCalendarRepository(module, apiServiceProvider.get(), cubeLocalDbProvider.get());
  }

  public static RepositoryModule_ProvideHistoryCalendarRepositoryFactory create(
      RepositoryModule module, Provider<ApiService> apiServiceProvider,
      Provider<CubeLocalDb> cubeLocalDbProvider) {
    return new RepositoryModule_ProvideHistoryCalendarRepositoryFactory(module, apiServiceProvider, cubeLocalDbProvider);
  }

  public static HistoryCalendarRepository provideHistoryCalendarRepository(
      RepositoryModule instance, ApiService apiService, CubeLocalDb cubeLocalDb) {
    return Preconditions.checkNotNull(instance.provideHistoryCalendarRepository(apiService, cubeLocalDb), "Cannot return null from a non-@Nullable @Provides method");
  }
}
