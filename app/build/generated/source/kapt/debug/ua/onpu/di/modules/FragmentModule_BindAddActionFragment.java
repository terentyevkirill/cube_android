package ua.onpu.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;
import ua.onpu.presentation.fragments.assignToTracker.AddActionFragment;

@Module(subcomponents = FragmentModule_BindAddActionFragment.AddActionFragmentSubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentModule_BindAddActionFragment {
  private FragmentModule_BindAddActionFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AddActionFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AddActionFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AddActionFragmentSubcomponent extends AndroidInjector<AddActionFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AddActionFragment> {}
  }
}
