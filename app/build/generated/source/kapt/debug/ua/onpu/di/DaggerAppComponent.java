package ua.onpu.di;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;
import ua.onpu.CubeApplication;
import ua.onpu.base.BaseFragment_MembersInjector;
import ua.onpu.core.ResourceProvider;
import ua.onpu.core.ResourceProvider_Factory;
import ua.onpu.db.CubeLocalDb;
import ua.onpu.di.modules.ActivityModule_BindLobbyActivity;
import ua.onpu.di.modules.AppModule;
import ua.onpu.di.modules.AppModule_ProvideApplicationFactory;
import ua.onpu.di.modules.DatabaseModule;
import ua.onpu.di.modules.DatabaseModule_ProvideDbFactory;
import ua.onpu.di.modules.FragmentModule_BindAddActionFragment;
import ua.onpu.di.modules.FragmentModule_BindAssignToTrackerFragment;
import ua.onpu.di.modules.FragmentModule_BindEditActionFragment;
import ua.onpu.di.modules.FragmentModule_BindHistoryFragment;
import ua.onpu.di.modules.FragmentModule_BindProfileFragment;
import ua.onpu.di.modules.FragmentModule_BindSettingsFragment;
import ua.onpu.di.modules.FragmentModule_BindStartActionFragment;
import ua.onpu.di.modules.FragmentModule_BindTimerFragment;
import ua.onpu.di.modules.FragmentModule_BindTrackerFragment;
import ua.onpu.di.modules.NetworkingApiModule;
import ua.onpu.di.modules.NetworkingApiModule_ProvideRetrofitApiFactory;
import ua.onpu.di.modules.RepositoryModule;
import ua.onpu.di.modules.RepositoryModule_ProvideActionRepositoryFactory;
import ua.onpu.di.modules.RepositoryModule_ProvideTimerRepositoryFactory;
import ua.onpu.networkingApi.ApiService;
import ua.onpu.presentation.activity.LobbyActivity;
import ua.onpu.presentation.fragments.HistoryFragment;
import ua.onpu.presentation.fragments.StartActionFragment;
import ua.onpu.presentation.fragments.TimerFragment;
import ua.onpu.presentation.fragments.assignToTracker.AddActionFragment;
import ua.onpu.presentation.fragments.assignToTracker.AssignToTrackerFragment;
import ua.onpu.presentation.fragments.assignToTracker.EditActionFragment;
import ua.onpu.presentation.fragments.settings.ProfileFragment;
import ua.onpu.presentation.fragments.settings.SettingsFragment;
import ua.onpu.presentation.fragments.settings.TrackerSettingsFragment;
import ua.onpu.presentation.viewModels.AddActionViewModel;
import ua.onpu.presentation.viewModels.AddActionViewModel_Factory;
import ua.onpu.presentation.viewModels.AssignToTrackerViewModel;
import ua.onpu.presentation.viewModels.AssignToTrackerViewModel_Factory;
import ua.onpu.presentation.viewModels.HistoryViewModel;
import ua.onpu.presentation.viewModels.HistoryViewModel_Factory;
import ua.onpu.presentation.viewModels.ProfileViewModel;
import ua.onpu.presentation.viewModels.ProfileViewModel_Factory;
import ua.onpu.presentation.viewModels.SettingsViewModel;
import ua.onpu.presentation.viewModels.SettingsViewModel_Factory;
import ua.onpu.presentation.viewModels.StartActionViewModel;
import ua.onpu.presentation.viewModels.StartActionViewModel_Factory;
import ua.onpu.presentation.viewModels.TimerViewModel;
import ua.onpu.presentation.viewModels.TimerViewModel_Factory;
import ua.onpu.presentation.viewModels.TrackerViewModel;
import ua.onpu.presentation.viewModels.TrackerViewModel_Factory;
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
public final class DaggerAppComponent implements AppComponent {
  private Provider<FragmentModule_BindAssignToTrackerFragment.AssignToTrackerFragmentSubcomponent.Factory> assignToTrackerFragmentSubcomponentFactoryProvider;

  private Provider<FragmentModule_BindTimerFragment.TimerFragmentSubcomponent.Factory> timerFragmentSubcomponentFactoryProvider;

  private Provider<FragmentModule_BindHistoryFragment.HistoryFragmentSubcomponent.Factory> historyFragmentSubcomponentFactoryProvider;

  private Provider<FragmentModule_BindTrackerFragment.TrackerSettingsFragmentSubcomponent.Factory> trackerSettingsFragmentSubcomponentFactoryProvider;

  private Provider<FragmentModule_BindSettingsFragment.SettingsFragmentSubcomponent.Factory> settingsFragmentSubcomponentFactoryProvider;

  private Provider<FragmentModule_BindProfileFragment.ProfileFragmentSubcomponent.Factory> profileFragmentSubcomponentFactoryProvider;

  private Provider<FragmentModule_BindStartActionFragment.StartActionFragmentSubcomponent.Factory> startActionFragmentSubcomponentFactoryProvider;

  private Provider<FragmentModule_BindAddActionFragment.AddActionFragmentSubcomponent.Factory> addActionFragmentSubcomponentFactoryProvider;

  private Provider<FragmentModule_BindEditActionFragment.EditActionFragmentSubcomponent.Factory> editActionFragmentSubcomponentFactoryProvider;

  private Provider<ActivityModule_BindLobbyActivity.LobbyActivitySubcomponent.Factory> lobbyActivitySubcomponentFactoryProvider;

  private Provider<Context> provideApplicationProvider;

  private Provider<ResourceProvider> resourceProvider;

  private Provider<SettingsViewModel> settingsViewModelProvider;

  private Provider<TrackerViewModel> trackerViewModelProvider;

  private Provider<ProfileViewModel> profileViewModelProvider;

  private Provider<ApiService> provideRetrofitApiProvider;

  private Provider<CubeLocalDb> provideDbProvider;

  private Provider<IntervalRepository> provideTimerRepositoryProvider;

  private Provider<HistoryViewModel> historyViewModelProvider;

  private Provider<ActionRepository> provideActionRepositoryProvider;

  private Provider<AssignToTrackerViewModel> assignToTrackerViewModelProvider;

  private Provider<TimerViewModel> timerViewModelProvider;

  private Provider<StartActionViewModel> startActionViewModelProvider;

  private Provider<AddActionViewModel> addActionViewModelProvider;

  private DaggerAppComponent(AppModule appModuleParam, DatabaseModule databaseModuleParam,
      RepositoryModule repositoryModuleParam, NetworkingApiModule networkingApiModuleParam,
      CubeApplication application) {

    initialize(appModuleParam, databaseModuleParam, repositoryModuleParam, networkingApiModuleParam, application);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
      ) {
    return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(10).put(AssignToTrackerFragment.class, (Provider) assignToTrackerFragmentSubcomponentFactoryProvider).put(TimerFragment.class, (Provider) timerFragmentSubcomponentFactoryProvider).put(HistoryFragment.class, (Provider) historyFragmentSubcomponentFactoryProvider).put(TrackerSettingsFragment.class, (Provider) trackerSettingsFragmentSubcomponentFactoryProvider).put(SettingsFragment.class, (Provider) settingsFragmentSubcomponentFactoryProvider).put(ProfileFragment.class, (Provider) profileFragmentSubcomponentFactoryProvider).put(StartActionFragment.class, (Provider) startActionFragmentSubcomponentFactoryProvider).put(AddActionFragment.class, (Provider) addActionFragmentSubcomponentFactoryProvider).put(EditActionFragment.class, (Provider) editActionFragmentSubcomponentFactoryProvider).put(LobbyActivity.class, (Provider) lobbyActivitySubcomponentFactoryProvider).build();}

  private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
    return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

  private Map<Class<? extends ViewModel>, Provider<ViewModel>> getMapOfClassOfAndProviderOfViewModel(
      ) {
    return MapBuilder.<Class<? extends ViewModel>, Provider<ViewModel>>newMapBuilder(8).put(SettingsViewModel.class, (Provider) settingsViewModelProvider).put(TrackerViewModel.class, (Provider) trackerViewModelProvider).put(ProfileViewModel.class, (Provider) profileViewModelProvider).put(HistoryViewModel.class, (Provider) historyViewModelProvider).put(AssignToTrackerViewModel.class, (Provider) assignToTrackerViewModelProvider).put(TimerViewModel.class, (Provider) timerViewModelProvider).put(StartActionViewModel.class, (Provider) startActionViewModelProvider).put(AddActionViewModel.class, (Provider) addActionViewModelProvider).build();}

  private DaggerViewModelFactory getDaggerViewModelFactory() {
    return new DaggerViewModelFactory(getMapOfClassOfAndProviderOfViewModel());}

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam, final DatabaseModule databaseModuleParam,
      final RepositoryModule repositoryModuleParam,
      final NetworkingApiModule networkingApiModuleParam, final CubeApplication application) {
    this.assignToTrackerFragmentSubcomponentFactoryProvider = new Provider<FragmentModule_BindAssignToTrackerFragment.AssignToTrackerFragmentSubcomponent.Factory>() {
      @Override
      public FragmentModule_BindAssignToTrackerFragment.AssignToTrackerFragmentSubcomponent.Factory get(
          ) {
        return new AssignToTrackerFragmentSubcomponentFactory();}
    };
    this.timerFragmentSubcomponentFactoryProvider = new Provider<FragmentModule_BindTimerFragment.TimerFragmentSubcomponent.Factory>() {
      @Override
      public FragmentModule_BindTimerFragment.TimerFragmentSubcomponent.Factory get() {
        return new TimerFragmentSubcomponentFactory();}
    };
    this.historyFragmentSubcomponentFactoryProvider = new Provider<FragmentModule_BindHistoryFragment.HistoryFragmentSubcomponent.Factory>() {
      @Override
      public FragmentModule_BindHistoryFragment.HistoryFragmentSubcomponent.Factory get() {
        return new HistoryFragmentSubcomponentFactory();}
    };
    this.trackerSettingsFragmentSubcomponentFactoryProvider = new Provider<FragmentModule_BindTrackerFragment.TrackerSettingsFragmentSubcomponent.Factory>() {
      @Override
      public FragmentModule_BindTrackerFragment.TrackerSettingsFragmentSubcomponent.Factory get() {
        return new TrackerSettingsFragmentSubcomponentFactory();}
    };
    this.settingsFragmentSubcomponentFactoryProvider = new Provider<FragmentModule_BindSettingsFragment.SettingsFragmentSubcomponent.Factory>() {
      @Override
      public FragmentModule_BindSettingsFragment.SettingsFragmentSubcomponent.Factory get() {
        return new SettingsFragmentSubcomponentFactory();}
    };
    this.profileFragmentSubcomponentFactoryProvider = new Provider<FragmentModule_BindProfileFragment.ProfileFragmentSubcomponent.Factory>() {
      @Override
      public FragmentModule_BindProfileFragment.ProfileFragmentSubcomponent.Factory get() {
        return new ProfileFragmentSubcomponentFactory();}
    };
    this.startActionFragmentSubcomponentFactoryProvider = new Provider<FragmentModule_BindStartActionFragment.StartActionFragmentSubcomponent.Factory>() {
      @Override
      public FragmentModule_BindStartActionFragment.StartActionFragmentSubcomponent.Factory get() {
        return new StartActionFragmentSubcomponentFactory();}
    };
    this.addActionFragmentSubcomponentFactoryProvider = new Provider<FragmentModule_BindAddActionFragment.AddActionFragmentSubcomponent.Factory>() {
      @Override
      public FragmentModule_BindAddActionFragment.AddActionFragmentSubcomponent.Factory get() {
        return new AddActionFragmentSubcomponentFactory();}
    };
    this.editActionFragmentSubcomponentFactoryProvider = new Provider<FragmentModule_BindEditActionFragment.EditActionFragmentSubcomponent.Factory>() {
      @Override
      public FragmentModule_BindEditActionFragment.EditActionFragmentSubcomponent.Factory get() {
        return new EditActionFragmentSubcomponentFactory();}
    };
    this.lobbyActivitySubcomponentFactoryProvider = new Provider<ActivityModule_BindLobbyActivity.LobbyActivitySubcomponent.Factory>() {
      @Override
      public ActivityModule_BindLobbyActivity.LobbyActivitySubcomponent.Factory get() {
        return new LobbyActivitySubcomponentFactory();}
    };
    this.provideApplicationProvider = DoubleCheck.provider(AppModule_ProvideApplicationFactory.create(appModuleParam));
    this.resourceProvider = ResourceProvider_Factory.create(provideApplicationProvider);
    this.settingsViewModelProvider = SettingsViewModel_Factory.create(resourceProvider);
    this.trackerViewModelProvider = TrackerViewModel_Factory.create(resourceProvider);
    this.profileViewModelProvider = ProfileViewModel_Factory.create(resourceProvider);
    this.provideRetrofitApiProvider = DoubleCheck.provider(NetworkingApiModule_ProvideRetrofitApiFactory.create(networkingApiModuleParam));
    this.provideDbProvider = DoubleCheck.provider(DatabaseModule_ProvideDbFactory.create(databaseModuleParam));
    this.provideTimerRepositoryProvider = DoubleCheck.provider(RepositoryModule_ProvideTimerRepositoryFactory.create(repositoryModuleParam, provideRetrofitApiProvider, provideDbProvider));
    this.historyViewModelProvider = HistoryViewModel_Factory.create(provideTimerRepositoryProvider, resourceProvider);
    this.provideActionRepositoryProvider = DoubleCheck.provider(RepositoryModule_ProvideActionRepositoryFactory.create(repositoryModuleParam, provideRetrofitApiProvider, provideDbProvider));
    this.assignToTrackerViewModelProvider = AssignToTrackerViewModel_Factory.create(provideActionRepositoryProvider, resourceProvider);
    this.timerViewModelProvider = TimerViewModel_Factory.create(provideTimerRepositoryProvider, provideActionRepositoryProvider, resourceProvider);
    this.startActionViewModelProvider = StartActionViewModel_Factory.create(provideActionRepositoryProvider, resourceProvider);
    this.addActionViewModelProvider = AddActionViewModel_Factory.create(provideActionRepositoryProvider, resourceProvider);
  }

  @Override
  public void inject(CubeApplication arg0) {
    injectCubeApplication(arg0);}

  private CubeApplication injectCubeApplication(CubeApplication instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private CubeApplication application;

    private AppModule appModule;

    private DatabaseModule databaseModule;

    private NetworkingApiModule networkingApiModule;

    private RepositoryModule repositoryModule;

    @Override
    public Builder application(CubeApplication application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public Builder initAppModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    @Override
    public Builder initDatabaseModule(DatabaseModule databaseModule) {
      this.databaseModule = Preconditions.checkNotNull(databaseModule);
      return this;
    }

    @Override
    public Builder initNetworkingApiModule(NetworkingApiModule networkingApiModule) {
      this.networkingApiModule = Preconditions.checkNotNull(networkingApiModule);
      return this;
    }

    @Override
    public Builder initRepositoryModule(RepositoryModule repositoryModule) {
      this.repositoryModule = Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(application, CubeApplication.class);
      Preconditions.checkBuilderRequirement(appModule, AppModule.class);
      Preconditions.checkBuilderRequirement(databaseModule, DatabaseModule.class);
      if (networkingApiModule == null) {
        this.networkingApiModule = new NetworkingApiModule();
      }
      Preconditions.checkBuilderRequirement(repositoryModule, RepositoryModule.class);
      return new DaggerAppComponent(appModule, databaseModule, repositoryModule, networkingApiModule, application);
    }
  }

  private final class AssignToTrackerFragmentSubcomponentFactory implements FragmentModule_BindAssignToTrackerFragment.AssignToTrackerFragmentSubcomponent.Factory {
    @Override
    public FragmentModule_BindAssignToTrackerFragment.AssignToTrackerFragmentSubcomponent create(
        AssignToTrackerFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new AssignToTrackerFragmentSubcomponentImpl(arg0);
    }
  }

  private final class AssignToTrackerFragmentSubcomponentImpl implements FragmentModule_BindAssignToTrackerFragment.AssignToTrackerFragmentSubcomponent {
    private AssignToTrackerFragmentSubcomponentImpl(AssignToTrackerFragment arg0) {

    }

    @Override
    public void inject(AssignToTrackerFragment arg0) {
      injectAssignToTrackerFragment(arg0);}

    private AssignToTrackerFragment injectAssignToTrackerFragment(
        AssignToTrackerFragment instance) {
      DaggerFragment_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      BaseFragment_MembersInjector.injectViewModelFactory(instance, DaggerAppComponent.this.getDaggerViewModelFactory());
      return instance;
    }
  }

  private final class TimerFragmentSubcomponentFactory implements FragmentModule_BindTimerFragment.TimerFragmentSubcomponent.Factory {
    @Override
    public FragmentModule_BindTimerFragment.TimerFragmentSubcomponent create(TimerFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new TimerFragmentSubcomponentImpl(arg0);
    }
  }

  private final class TimerFragmentSubcomponentImpl implements FragmentModule_BindTimerFragment.TimerFragmentSubcomponent {
    private TimerFragmentSubcomponentImpl(TimerFragment arg0) {

    }

    @Override
    public void inject(TimerFragment arg0) {
      injectTimerFragment(arg0);}

    private TimerFragment injectTimerFragment(TimerFragment instance) {
      DaggerFragment_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      BaseFragment_MembersInjector.injectViewModelFactory(instance, DaggerAppComponent.this.getDaggerViewModelFactory());
      return instance;
    }
  }

  private final class HistoryFragmentSubcomponentFactory implements FragmentModule_BindHistoryFragment.HistoryFragmentSubcomponent.Factory {
    @Override
    public FragmentModule_BindHistoryFragment.HistoryFragmentSubcomponent create(
        HistoryFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new HistoryFragmentSubcomponentImpl(arg0);
    }
  }

  private final class HistoryFragmentSubcomponentImpl implements FragmentModule_BindHistoryFragment.HistoryFragmentSubcomponent {
    private HistoryFragmentSubcomponentImpl(HistoryFragment arg0) {

    }

    @Override
    public void inject(HistoryFragment arg0) {
      injectHistoryFragment(arg0);}

    private HistoryFragment injectHistoryFragment(HistoryFragment instance) {
      DaggerFragment_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      BaseFragment_MembersInjector.injectViewModelFactory(instance, DaggerAppComponent.this.getDaggerViewModelFactory());
      return instance;
    }
  }

  private final class TrackerSettingsFragmentSubcomponentFactory implements FragmentModule_BindTrackerFragment.TrackerSettingsFragmentSubcomponent.Factory {
    @Override
    public FragmentModule_BindTrackerFragment.TrackerSettingsFragmentSubcomponent create(
        TrackerSettingsFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new TrackerSettingsFragmentSubcomponentImpl(arg0);
    }
  }

  private final class TrackerSettingsFragmentSubcomponentImpl implements FragmentModule_BindTrackerFragment.TrackerSettingsFragmentSubcomponent {
    private TrackerSettingsFragmentSubcomponentImpl(TrackerSettingsFragment arg0) {

    }

    @Override
    public void inject(TrackerSettingsFragment arg0) {
      injectTrackerSettingsFragment(arg0);}

    private TrackerSettingsFragment injectTrackerSettingsFragment(
        TrackerSettingsFragment instance) {
      DaggerFragment_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      BaseFragment_MembersInjector.injectViewModelFactory(instance, DaggerAppComponent.this.getDaggerViewModelFactory());
      return instance;
    }
  }

  private final class SettingsFragmentSubcomponentFactory implements FragmentModule_BindSettingsFragment.SettingsFragmentSubcomponent.Factory {
    @Override
    public FragmentModule_BindSettingsFragment.SettingsFragmentSubcomponent create(
        SettingsFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new SettingsFragmentSubcomponentImpl(arg0);
    }
  }

  private final class SettingsFragmentSubcomponentImpl implements FragmentModule_BindSettingsFragment.SettingsFragmentSubcomponent {
    private SettingsFragmentSubcomponentImpl(SettingsFragment arg0) {

    }

    @Override
    public void inject(SettingsFragment arg0) {
      injectSettingsFragment(arg0);}

    private SettingsFragment injectSettingsFragment(SettingsFragment instance) {
      DaggerFragment_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      BaseFragment_MembersInjector.injectViewModelFactory(instance, DaggerAppComponent.this.getDaggerViewModelFactory());
      return instance;
    }
  }

  private final class ProfileFragmentSubcomponentFactory implements FragmentModule_BindProfileFragment.ProfileFragmentSubcomponent.Factory {
    @Override
    public FragmentModule_BindProfileFragment.ProfileFragmentSubcomponent create(
        ProfileFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new ProfileFragmentSubcomponentImpl(arg0);
    }
  }

  private final class ProfileFragmentSubcomponentImpl implements FragmentModule_BindProfileFragment.ProfileFragmentSubcomponent {
    private ProfileFragmentSubcomponentImpl(ProfileFragment arg0) {

    }

    @Override
    public void inject(ProfileFragment arg0) {
      injectProfileFragment(arg0);}

    private ProfileFragment injectProfileFragment(ProfileFragment instance) {
      DaggerFragment_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      BaseFragment_MembersInjector.injectViewModelFactory(instance, DaggerAppComponent.this.getDaggerViewModelFactory());
      return instance;
    }
  }

  private final class StartActionFragmentSubcomponentFactory implements FragmentModule_BindStartActionFragment.StartActionFragmentSubcomponent.Factory {
    @Override
    public FragmentModule_BindStartActionFragment.StartActionFragmentSubcomponent create(
        StartActionFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new StartActionFragmentSubcomponentImpl(arg0);
    }
  }

  private final class StartActionFragmentSubcomponentImpl implements FragmentModule_BindStartActionFragment.StartActionFragmentSubcomponent {
    private StartActionFragmentSubcomponentImpl(StartActionFragment arg0) {

    }

    @Override
    public void inject(StartActionFragment arg0) {
      injectStartActionFragment(arg0);}

    private StartActionFragment injectStartActionFragment(StartActionFragment instance) {
      DaggerFragment_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      BaseFragment_MembersInjector.injectViewModelFactory(instance, DaggerAppComponent.this.getDaggerViewModelFactory());
      return instance;
    }
  }

  private final class AddActionFragmentSubcomponentFactory implements FragmentModule_BindAddActionFragment.AddActionFragmentSubcomponent.Factory {
    @Override
    public FragmentModule_BindAddActionFragment.AddActionFragmentSubcomponent create(
        AddActionFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new AddActionFragmentSubcomponentImpl(arg0);
    }
  }

  private final class AddActionFragmentSubcomponentImpl implements FragmentModule_BindAddActionFragment.AddActionFragmentSubcomponent {
    private AddActionFragmentSubcomponentImpl(AddActionFragment arg0) {

    }

    @Override
    public void inject(AddActionFragment arg0) {
      injectAddActionFragment(arg0);}

    private AddActionFragment injectAddActionFragment(AddActionFragment instance) {
      DaggerFragment_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      BaseFragment_MembersInjector.injectViewModelFactory(instance, DaggerAppComponent.this.getDaggerViewModelFactory());
      return instance;
    }
  }

  private final class EditActionFragmentSubcomponentFactory implements FragmentModule_BindEditActionFragment.EditActionFragmentSubcomponent.Factory {
    @Override
    public FragmentModule_BindEditActionFragment.EditActionFragmentSubcomponent create(
        EditActionFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new EditActionFragmentSubcomponentImpl(arg0);
    }
  }

  private final class EditActionFragmentSubcomponentImpl implements FragmentModule_BindEditActionFragment.EditActionFragmentSubcomponent {
    private EditActionFragmentSubcomponentImpl(EditActionFragment arg0) {

    }

    @Override
    public void inject(EditActionFragment arg0) {
      injectEditActionFragment(arg0);}

    private EditActionFragment injectEditActionFragment(EditActionFragment instance) {
      DaggerFragment_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      BaseFragment_MembersInjector.injectViewModelFactory(instance, DaggerAppComponent.this.getDaggerViewModelFactory());
      return instance;
    }
  }

  private final class LobbyActivitySubcomponentFactory implements ActivityModule_BindLobbyActivity.LobbyActivitySubcomponent.Factory {
    @Override
    public ActivityModule_BindLobbyActivity.LobbyActivitySubcomponent create(LobbyActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new LobbyActivitySubcomponentImpl(arg0);
    }
  }

  private final class LobbyActivitySubcomponentImpl implements ActivityModule_BindLobbyActivity.LobbyActivitySubcomponent {
    private LobbyActivitySubcomponentImpl(LobbyActivity arg0) {

    }

    @Override
    public void inject(LobbyActivity arg0) {
      injectLobbyActivity(arg0);}

    private LobbyActivity injectLobbyActivity(LobbyActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      return instance;
    }
  }
}
