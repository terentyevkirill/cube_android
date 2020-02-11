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
public final class MainViewModel_MembersInjector implements MembersInjector<MainViewModel> {
  private final Provider<ResourceProvider> resourceProvider;

  public MainViewModel_MembersInjector(Provider<ResourceProvider> resourceProvider) {
    this.resourceProvider = resourceProvider;
  }

  public static MembersInjector<MainViewModel> create(Provider<ResourceProvider> resourceProvider) {
    return new MainViewModel_MembersInjector(resourceProvider);}

  @Override
  public void injectMembers(MainViewModel instance) {
    BaseViewModel_MembersInjector.injectResourceProvider(instance, resourceProvider.get());
  }
}
