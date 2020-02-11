package ua.onpu.presentation.viewModels;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import ua.onpu.base.BaseViewModel_MembersInjector;
import ua.onpu.core.ResourceProvider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
  private final Provider<ResourceProvider> resourceProvider;

  public ProfileViewModel_Factory(Provider<ResourceProvider> resourceProvider) {
    this.resourceProvider = resourceProvider;
  }

  @Override
  public ProfileViewModel get() {
    ProfileViewModel instance = newInstance();
    BaseViewModel_MembersInjector.injectResourceProvider(instance, resourceProvider.get());
    return instance;
  }

  public static ProfileViewModel_Factory create(Provider<ResourceProvider> resourceProvider) {
    return new ProfileViewModel_Factory(resourceProvider);
  }

  public static ProfileViewModel newInstance() {
    return new ProfileViewModel();
  }
}
