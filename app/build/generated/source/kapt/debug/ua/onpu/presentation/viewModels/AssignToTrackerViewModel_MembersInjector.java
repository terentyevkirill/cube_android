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
public final class AssignToTrackerViewModel_MembersInjector implements MembersInjector<AssignToTrackerViewModel> {
  private final Provider<ResourceProvider> resourceProvider;

  public AssignToTrackerViewModel_MembersInjector(Provider<ResourceProvider> resourceProvider) {
    this.resourceProvider = resourceProvider;
  }

  public static MembersInjector<AssignToTrackerViewModel> create(
      Provider<ResourceProvider> resourceProvider) {
    return new AssignToTrackerViewModel_MembersInjector(resourceProvider);}

  @Override
  public void injectMembers(AssignToTrackerViewModel instance) {
    BaseViewModel_MembersInjector.injectResourceProvider(instance, resourceProvider.get());
  }
}
