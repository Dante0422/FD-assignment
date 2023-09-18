package fragments.auth;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

import com.example.fd_assignment.R;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoginFragmentToSignUpFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_signUpFragment);
  }

  @NonNull
  public static NavDirections actionLoginFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_homeFragment);
  }

  @NonNull
  public static NavDirections actionLoginFragmentToResetPasswordFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_resetPasswordFragment);
  }

  @NonNull
  public static NavDirections actionLoginFragmentToDonorsHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_donorsHomeFragment);
  }

  @NonNull
  public static NavDirections actionLoginFragmentToAdminHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_adminHomeFragment);
  }
}
