package com.example.fd_assignment.fragments.auth;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.fd_assignment.R;

public class SignUpFragmentDirections {
  private SignUpFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSignUpFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_signUpFragment_to_loginFragment);
  }
}
