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
public final class IntervalRepositoryImpl_Factory implements Factory<IntervalRepositoryImpl> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<CubeLocalDb> cubeLocalDbProvider;

  public IntervalRepositoryImpl_Factory(Provider<ApiService> apiServiceProvider,
      Provider<CubeLocalDb> cubeLocalDbProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.cubeLocalDbProvider = cubeLocalDbProvider;
  }

  @Override
  public IntervalRepositoryImpl get() {
    return newInstance(apiServiceProvider.get(), cubeLocalDbProvider.get());
  }

  public static IntervalRepositoryImpl_Factory create(Provider<ApiService> apiServiceProvider,
      Provider<CubeLocalDb> cubeLocalDbProvider) {
    return new IntervalRepositoryImpl_Factory(apiServiceProvider, cubeLocalDbProvider);
  }

  public static IntervalRepositoryImpl newInstance(ApiService apiService, CubeLocalDb cubeLocalDb) {
    return new IntervalRepositoryImpl(apiService, cubeLocalDb);
  }
}
