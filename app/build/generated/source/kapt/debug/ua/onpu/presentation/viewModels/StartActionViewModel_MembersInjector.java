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
public final class StartActionViewModel_MembersInjector implements MembersInjector<StartActionViewModel> {
  private final Provider<ResourceProvider> resourceProvider;

  public StartActionViewModel_MembersInjector(Provider<ResourceProvider> resourceProvider) {
    this.resourceProvider = resourceProvider;
  }

  public static MembersInjector<StartActionViewModel> create(
      Provider<ResourceProvider> resourceProvider) {
    return new StartActionViewModel_MembersInjector(resourceProvider);}

  @Override
  public void injectMembers(StartActionViewModel instance) {
    BaseViewModel_MembersInjector.injectResourceProvider(instance, resourceProvider.get());
  }
}
