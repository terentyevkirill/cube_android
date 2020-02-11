package ua.onpu.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;
import ua.onpu.presentation.fragments.assignToTracker.AssignToTrackerFragment;

@Module(
  subcomponents =
      FragmentModule_BindAssignToTrackerFragment.AssignToTrackerFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentModule_BindAssignToTrackerFragment {
  private FragmentModule_BindAssignToTrackerFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AssignToTrackerFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AssignToTrackerFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AssignToTrackerFragmentSubcomponent
      extends AndroidInjector<AssignToTrackerFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AssignToTrackerFragment> {}
  }
}
