package fragments.home;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

import com.example.fd_assignment.R;

public class AdminHomeFragmentDirections {
  private AdminHomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAdminHomeFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_adminHomeFragment_to_loginFragment);
  }
}
