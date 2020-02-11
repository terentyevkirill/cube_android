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
public final class SettingsViewModel_MembersInjector implements MembersInjector<SettingsViewModel> {
  private final Provider<ResourceProvider> resourceProvider;

  public SettingsViewModel_MembersInjector(Provider<ResourceProvider> resourceProvider) {
    this.resourceProvider = resourceProvider;
  }

  public static MembersInjector<SettingsViewModel> create(
      Provider<ResourceProvider> resourceProvider) {
    return new SettingsViewModel_MembersInjector(resourceProvider);}

  @Override
  public void injectMembers(SettingsViewModel instance) {
    BaseViewModel_MembersInjector.injectResourceProvider(instance, resourceProvider.get());
  }
}
