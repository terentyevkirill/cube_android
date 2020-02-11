package ua.onpu.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;
import ua.onpu.presentation.fragments.HistoryFragment;

@Module(subcomponents = FragmentModule_BindHistoryFragment.HistoryFragmentSubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentModule_BindHistoryFragment {
  private FragmentModule_BindHistoryFragment() {}

  @Binds
  @IntoMap
  @ClassKey(HistoryFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HistoryFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface HistoryFragmentSubcomponent extends AndroidInjector<HistoryFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HistoryFragment> {}
  }
}
