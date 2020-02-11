package ua.onpu.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;
import ua.onpu.presentation.fragments.StartActionFragment;

@Module(
  subcomponents = FragmentModule_BindStartActionFragment.StartActionFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentModule_BindStartActionFragment {
  private FragmentModule_BindStartActionFragment() {}

  @Binds
  @IntoMap
  @ClassKey(StartActionFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      StartActionFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface StartActionFragmentSubcomponent extends AndroidInjector<StartActionFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<StartActionFragment> {}
  }
}
