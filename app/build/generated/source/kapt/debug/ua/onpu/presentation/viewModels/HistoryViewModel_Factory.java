package ua.onpu.presentation.viewModels;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import ua.onpu.base.BaseViewModel_MembersInjector;
import ua.onpu.core.ResourceProvider;
import ua.onpu.repository.IntervalRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HistoryViewModel_Factory implements Factory<HistoryViewModel> {
  private final Provider<IntervalRepository> intervalRepositoryProvider;

  private final Provider<ResourceProvider> resourceProvider;

  public HistoryViewModel_Factory(Provider<IntervalRepository> intervalRepositoryProvider,
      Provider<ResourceProvider> resourceProvider) {
    this.intervalRepositoryProvider = intervalRepositoryProvider;
    this.resourceProvider = resourceProvider;
  }

  @Override
  public HistoryViewModel get() {
    HistoryViewModel instance = newInstance(intervalRepositoryProvider.get());
    BaseViewModel_MembersInjector.injectResourceProvider(instance, resourceProvider.get());
    return instance;
  }

  public static HistoryViewModel_Factory create(
      Provider<IntervalRepository> intervalRepositoryProvider,
      Provider<ResourceProvider> resourceProvider) {
    return new HistoryViewModel_Factory(intervalRepositoryProvider, resourceProvider);
  }

  public static HistoryViewModel newInstance(IntervalRepository intervalRepository) {
    return new HistoryViewModel(intervalRepository);
  }
}
