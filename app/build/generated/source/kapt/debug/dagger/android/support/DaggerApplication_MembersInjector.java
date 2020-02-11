package dagger.android.support;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
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
public final class DaggerApplication_MembersInjector implements MembersInjector<DaggerApplication> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public DaggerApplication_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector<DaggerApplication> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new DaggerApplication_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(DaggerApplication instance) {
    dagger.android.DaggerApplication_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
  }
}
