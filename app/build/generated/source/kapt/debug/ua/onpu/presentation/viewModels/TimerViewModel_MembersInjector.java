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
public final class TimerViewModel_MembersInjector implements MembersInjector<TimerViewModel> {
  private final Provider<ResourceProvider> resourceProvider;

  public TimerViewModel_MembersInjector(Provider<ResourceProvider> resourceProvider) {
    this.resourceProvider = resourceProvider;
  }

  public static MembersInjector<TimerViewModel> create(
      Provider<ResourceProvider> resourceProvider) {
    return new TimerViewModel_MembersInjector(resourceProvider);}

  @Override
  public void injectMembers(TimerViewModel instance) {
    BaseViewModel_MembersInjector.injectResourceProvider(instance, resourceProvider.get());
  }
}
