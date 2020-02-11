package ua.onpu.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;
import ua.onpu.presentation.fragments.settings.ProfileFragment;

@Module(subcomponents = FragmentModule_BindProfileFragment.ProfileFragmentSubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentModule_BindProfileFragment {
  private FragmentModule_BindProfileFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ProfileFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProfileFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ProfileFragmentSubcomponent extends AndroidInjector<ProfileFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProfileFragment> {}
  }
}
