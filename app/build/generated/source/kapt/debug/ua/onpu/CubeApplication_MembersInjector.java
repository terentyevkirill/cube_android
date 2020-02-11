package ua.onpu;

import dagger.MembersInjector;
import dagger.android.DaggerApplication_MembersInjector;
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
public final class CubeApplication_MembersInjector implements MembersInjector<CubeApplication> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public CubeApplication_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector<CubeApplication> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new CubeApplication_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(CubeApplication instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
  }
}
