package ua.onpu.presentation.viewModels;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import ua.onpu.base.BaseViewModel_MembersInjector;
import ua.onpu.core.ResourceProvider;
import ua.onpu.repository.ActionRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StartActionViewModel_Factory implements Factory<StartActionViewModel> {
  private final Provider<ActionRepository> actionRepositoryProvider;

  private final Provider<ResourceProvider> resourceProvider;

  public StartActionViewModel_Factory(Provider<ActionRepository> actionRepositoryProvider,
      Provider<ResourceProvider> resourceProvider) {
    this.actionRepositoryProvider = actionRepositoryProvider;
    this.resourceProvider = resourceProvider;
  }

  @Override
  public StartActionViewModel get() {
    StartActionViewModel instance = newInstance(actionRepositoryProvider.get());
    BaseViewModel_MembersInjector.injectResourceProvider(instance, resourceProvider.get());
    return instance;
  }

  public static StartActionViewModel_Factory create(
      Provider<ActionRepository> actionRepositoryProvider,
      Provider<ResourceProvider> resourceProvider) {
    return new StartActionViewModel_Factory(actionRepositoryProvider, resourceProvider);
  }

  public static StartActionViewModel newInstance(ActionRepository actionRepository) {
    return new StartActionViewModel(actionRepository);
  }
}
