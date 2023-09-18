package com.example.fd_assignment.fragments.splash;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.fd_assignment.R;

public class SplashFragmentDirections {
  private SplashFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSplashFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashFragment_to_loginFragment);
  }

  @NonNull
  public static NavDirections actionSplashFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashFragment_to_homeFragment);
  }

  @NonNull
  public static NavDirections actionSplashFragmentToDonorsHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashFragment_to_donorsHomeFragment);
  }

  @NonNull
  public static NavDirections actionSplashFragmentToAdminHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashFragment_to_adminHomeFragment);
  }
}
