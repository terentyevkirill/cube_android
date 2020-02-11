package ua.onpu.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;
import ua.onpu.presentation.fragments.TimerFragment;

@Module(subcomponents = FragmentModule_BindTimerFragment.TimerFragmentSubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentModule_BindTimerFragment {
  private FragmentModule_BindTimerFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TimerFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TimerFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface TimerFragmentSubcomponent extends AndroidInjector<TimerFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TimerFragment> {}
  }
}
