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
public final class HistoryViewModel_MembersInjector implements MembersInjector<HistoryViewModel> {
  private final Provider<ResourceProvider> resourceProvider;

  public HistoryViewModel_MembersInjector(Provider<ResourceProvider> resourceProvider) {
    this.resourceProvider = resourceProvider;
  }

  public static MembersInjector<HistoryViewModel> create(
      Provider<ResourceProvider> resourceProvider) {
    return new HistoryViewModel_MembersInjector(resourceProvider);}

  @Override
  public void injectMembers(HistoryViewModel instance) {
    BaseViewModel_MembersInjector.injectResourceProvider(instance, resourceProvider.get());
  }
}
