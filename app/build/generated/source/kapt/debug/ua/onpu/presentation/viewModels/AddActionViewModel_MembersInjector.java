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
public final class AddActionViewModel_MembersInjector implements MembersInjector<AddActionViewModel> {
  private final Provider<ResourceProvider> resourceProvider;

  public AddActionViewModel_MembersInjector(Provider<ResourceProvider> resourceProvider) {
    this.resourceProvider = resourceProvider;
  }

  public static MembersInjector<AddActionViewModel> create(
      Provider<ResourceProvider> resourceProvider) {
    return new AddActionViewModel_MembersInjector(resourceProvider);}

  @Override
  public void injectMembers(AddActionViewModel instance) {
    BaseViewModel_MembersInjector.injectResourceProvider(instance, resourceProvider.get());
  }
}
