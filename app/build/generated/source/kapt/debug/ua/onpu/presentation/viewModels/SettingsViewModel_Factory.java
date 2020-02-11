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
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<ResourceProvider> resourceProvider;

  public SettingsViewModel_Factory(Provider<ResourceProvider> resourceProvider) {
    this.resourceProvider = resourceProvider;
  }

  @Override
  public SettingsViewModel get() {
    SettingsViewModel instance = newInstance();
    BaseViewModel_MembersInjector.injectResourceProvider(instance, resourceProvider.get());
    return instance;
  }

  public static SettingsViewModel_Factory create(Provider<ResourceProvider> resourceProvider) {
    return new SettingsViewModel_Factory(resourceProvider);
  }

  public static SettingsViewModel newInstance() {
    return new SettingsViewModel();
  }
}
