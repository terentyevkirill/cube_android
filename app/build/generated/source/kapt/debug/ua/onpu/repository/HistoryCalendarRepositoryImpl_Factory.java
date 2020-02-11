package ua.onpu.repository;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import ua.onpu.db.CubeLocalDb;
import ua.onpu.networkingApi.ApiService;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HistoryCalendarRepositoryImpl_Factory implements Factory<HistoryCalendarRepositoryImpl> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<CubeLocalDb> cubeLocalDbProvider;

  public HistoryCalendarRepositoryImpl_Factory(Provider<ApiService> apiServiceProvider,
      Provider<CubeLocalDb> cubeLocalDbProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.cubeLocalDbProvider = cubeLocalDbProvider;
  }

  @Override
  public HistoryCalendarRepositoryImpl get() {
    return newInstance(apiServiceProvider.get(), cubeLocalDbProvider.get());
  }

  public static HistoryCalendarRepositoryImpl_Factory create(
      Provider<ApiService> apiServiceProvider, Provider<CubeLocalDb> cubeLocalDbProvider) {
    return new HistoryCalendarRepositoryImpl_Factory(apiServiceProvider, cubeLocalDbProvider);
  }

  public static HistoryCalendarRepositoryImpl newInstance(ApiService apiService,
      CubeLocalDb cubeLocalDb) {
    return new HistoryCalendarRepositoryImpl(apiService, cubeLocalDb);
  }
}
