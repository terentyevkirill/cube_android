package ua.onpu.presentation.activity;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LobbyActivity_MembersInjector implements MembersInjector<LobbyActivity> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public LobbyActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector<LobbyActivity> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new LobbyActivity_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(LobbyActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
  }
}
