package com.example.fd_assignment.fragments.home;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.fd_assignment.R;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToDonateFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_donateFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToReceiveFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_receiveFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_loginFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToAboutUsFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_aboutUsFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToDonationsFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_donationsFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToFoodMapFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_foodMapFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToAboutUsFragment2() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_aboutUsFragment2);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToContactUsFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_contactUsFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToHistoryFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_historyFragment);
  }
}
