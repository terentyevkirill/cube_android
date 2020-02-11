package ua.onpu.presentation.viewModels;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import ua.onpu.base.BaseViewModel_MembersInjector;
import ua.onpu.core.ResourceProvider;
import ua.onpu.repository.ActionRepository;
import ua.onpu.repository.IntervalRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TimerViewModel_Factory implements Factory<TimerViewModel> {
  private final Provider<IntervalRepository> intervalRepositoryProvider;

  private final Provider<ActionRepository> actionRepositoryProvider;

  private final Provider<ResourceProvider> resourceProvider;

  public TimerViewModel_Factory(Provider<IntervalRepository> intervalRepositoryProvider,
      Provider<ActionRepository> actionRepositoryProvider,
      Provider<ResourceProvider> resourceProvider) {
    this.intervalRepositoryProvider = intervalRepositoryProvider;
    this.actionRepositoryProvider = actionRepositoryProvider;
    this.resourceProvider = resourceProvider;
  }

  @Override
  public TimerViewModel get() {
    TimerViewModel instance = newInstance(intervalRepositoryProvider.get(), actionRepositoryProvider.get());
    BaseViewModel_MembersInjector.injectResourceProvider(instance, resourceProvider.get());
    return instance;
  }

  public static TimerViewModel_Factory create(
      Provider<IntervalRepository> intervalRepositoryProvider,
      Provider<ActionRepository> actionRepositoryProvider,
      Provider<ResourceProvider> resourceProvider) {
    return new TimerViewModel_Factory(intervalRepositoryProvider, actionRepositoryProvider, resourceProvider);
  }

  public static TimerViewModel newInstance(IntervalRepository intervalRepository,
      ActionRepository actionRepository) {
    return new TimerViewModel(intervalRepository, actionRepository);
  }
}
