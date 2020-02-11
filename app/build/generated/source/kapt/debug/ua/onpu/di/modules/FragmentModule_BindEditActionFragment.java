package ua.onpu.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;
import ua.onpu.presentation.fragments.assignToTracker.EditActionFragment;

@Module(subcomponents = FragmentModule_BindEditActionFragment.EditActionFragmentSubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentModule_BindEditActionFragment {
  private FragmentModule_BindEditActionFragment() {}

  @Binds
  @IntoMap
  @ClassKey(EditActionFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EditActionFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface EditActionFragmentSubcomponent extends AndroidInjector<EditActionFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EditActionFragment> {}
  }
}
