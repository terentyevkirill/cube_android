package ua.onpu.presentation.viewModels;

import dagger.MembersInjector;
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
public final class ProfileViewModel_MembersInjector implements MembersInjector<ProfileViewModel> {
  private final Provider<ResourceProvider> resourceProvider;

  public ProfileViewModel_MembersInjector(Provider<ResourceProvider> resourceProvider) {
    this.resourceProvider = resourceProvider;
  }

  public static MembersInjector<ProfileViewModel> create(
      Provider<ResourceProvider> resourceProvider) {
    return new ProfileViewModel_MembersInjector(resourceProvider);}

  @Override
  public void injectMembers(ProfileViewModel instance) {
    BaseViewModel_MembersInjector.injectResourceProvider(instance, resourceProvider.get());
  }
}
