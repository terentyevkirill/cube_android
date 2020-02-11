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
public final class TrackerViewModel_Factory implements Factory<TrackerViewModel> {
  private final Provider<ResourceProvider> resourceProvider;

  public TrackerViewModel_Factory(Provider<ResourceProvider> resourceProvider) {
    this.resourceProvider = resourceProvider;
  }

  @Override
  public TrackerViewModel get() {
    TrackerViewModel instance = newInstance();
    BaseViewModel_MembersInjector.injectResourceProvider(instance, resourceProvider.get());
    return instance;
  }

  public static TrackerViewModel_Factory create(Provider<ResourceProvider> resourceProvider) {
    return new TrackerViewModel_Factory(resourceProvider);
  }

  public static TrackerViewModel newInstance() {
    return new TrackerViewModel();
  }
}
