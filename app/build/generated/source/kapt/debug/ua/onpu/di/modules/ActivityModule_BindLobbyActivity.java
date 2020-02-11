package ua.onpu.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;
import ua.onpu.presentation.activity.LobbyActivity;

@Module(subcomponents = ActivityModule_BindLobbyActivity.LobbyActivitySubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_BindLobbyActivity {
  private ActivityModule_BindLobbyActivity() {}

  @Binds
  @IntoMap
  @ClassKey(LobbyActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LobbyActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface LobbyActivitySubcomponent extends AndroidInjector<LobbyActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LobbyActivity> {}
  }
}
