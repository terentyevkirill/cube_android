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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<ResourceProvider> resourceProvider;

  public MainViewModel_Factory(Provider<ResourceProvider> resourceProvider) {
    this.resourceProvider = resourceProvider;
  }

  @Override
  public MainViewModel get() {
    MainViewModel instance = newInstance();
    BaseViewModel_MembersInjector.injectResourceProvider(instance, resourceProvider.get());
    return instance;
  }

  public static MainViewModel_Factory create(Provider<ResourceProvider> resourceProvider) {
    return new MainViewModel_Factory(resourceProvider);
  }

  public static MainViewModel newInstance() {
    return new MainViewModel();
  }
}
