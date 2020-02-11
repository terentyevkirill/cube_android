package ua.onpu.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import ua.onpu.networkingApi.ApiService;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkingApiModule_ProvideRetrofitApiFactory implements Factory<ApiService> {
  private final NetworkingApiModule module;

  public NetworkingApiModule_ProvideRetrofitApiFactory(NetworkingApiModule module) {
    this.module = module;
  }

  @Override
  public ApiService get() {
    return provideRetrofitApi(module);
  }

  public static NetworkingApiModule_ProvideRetrofitApiFactory create(NetworkingApiModule module) {
    return new NetworkingApiModule_ProvideRetrofitApiFactory(module);
  }

  public static ApiService provideRetrofitApi(NetworkingApiModule instance) {
    return Preconditions.checkNotNull(instance.provideRetrofitApi(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
