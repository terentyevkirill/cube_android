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
public final class TrackerViewModel_MembersInjector implements MembersInjector<TrackerViewModel> {
  private final Provider<ResourceProvider> resourceProvider;

  public TrackerViewModel_MembersInjector(Provider<ResourceProvider> resourceProvider) {
    this.resourceProvider = resourceProvider;
  }

  public static MembersInjector<TrackerViewModel> create(
      Provider<ResourceProvider> resourceProvider) {
    return new TrackerViewModel_MembersInjector(resourceProvider);}

  @Override
  public void injectMembers(TrackerViewModel instance) {
    BaseViewModel_MembersInjector.injectResourceProvider(instance, resourceProvider.get());
  }
}
