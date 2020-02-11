package ua.onpu.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;
import ua.onpu.presentation.fragments.settings.TrackerSettingsFragment;

@Module(
  subcomponents = FragmentModule_BindTrackerFragment.TrackerSettingsFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentModule_BindTrackerFragment {
  private FragmentModule_BindTrackerFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TrackerSettingsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TrackerSettingsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface TrackerSettingsFragmentSubcomponent
      extends AndroidInjector<TrackerSettingsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TrackerSettingsFragment> {}
  }
}
