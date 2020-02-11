package ua.onpu.base;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import ua.onpu.core.ResourceProvider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseViewModel_MembersInjector implements MembersInjector<BaseViewModel> {
  private final Provider<ResourceProvider> resourceProvider;

  public BaseViewModel_MembersInjector(Provider<ResourceProvider> resourceProvider) {
    this.resourceProvider = resourceProvider;
  }

  public static MembersInjector<BaseViewModel> create(Provider<ResourceProvider> resourceProvider) {
    return new BaseViewModel_MembersInjector(resourceProvider);}

  @Override
  public void injectMembers(BaseViewModel instance) {
    injectResourceProvider(instance, resourceProvider.get());
  }

  public static void injectResourceProvider(BaseViewModel instance,
      ResourceProvider resourceProvider) {
    instance.resourceProvider = resourceProvider;
  }
}
