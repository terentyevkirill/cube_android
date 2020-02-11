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
public final class ActionRepositoryImpl_Factory implements Factory<ActionRepositoryImpl> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<CubeLocalDb> cubeLocalDbProvider;

  public ActionRepositoryImpl_Factory(Provider<ApiService> apiServiceProvider,
      Provider<CubeLocalDb> cubeLocalDbProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.cubeLocalDbProvider = cubeLocalDbProvider;
  }

  @Override
  public ActionRepositoryImpl get() {
    return newInstance(apiServiceProvider.get(), cubeLocalDbProvider.get());
  }

  public static ActionRepositoryImpl_Factory create(Provider<ApiService> apiServiceProvider,
      Provider<CubeLocalDb> cubeLocalDbProvider) {
    return new ActionRepositoryImpl_Factory(apiServiceProvider, cubeLocalDbProvider);
  }

  public static ActionRepositoryImpl newInstance(ApiService apiService, CubeLocalDb cubeLocalDb) {
    return new ActionRepositoryImpl(apiService, cubeLocalDb);
  }
}
