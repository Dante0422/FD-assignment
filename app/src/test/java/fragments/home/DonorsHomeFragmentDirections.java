package fragments.home;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

import com.example.fd_assignment.R;

public class DonorsHomeFragmentDirections {
  private DonorsHomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionDonorsHomeFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_donorsHomeFragment_to_loginFragment);
  }

  @NonNull
  public static NavDirections actionDonorsHomeFragmentToDonateFragment() {
    return new ActionOnlyNavDirections(R.id.action_donorsHomeFragment_to_donateFragment);
  }

  @NonNull
  public static NavDirections actionDonorsHomeFragmentToHistoryFragment() {
    return new ActionOnlyNavDirections(R.id.action_donorsHomeFragment_to_historyFragment);
  }

  @NonNull
  public static NavDirections actionDonorsHomeFragmentToAboutUsFragment() {
    return new ActionOnlyNavDirections(R.id.action_donorsHomeFragment_to_aboutUsFragment);
  }

  @NonNull
  public static NavDirections actionDonorsHomeFragmentToContactUsFragment() {
    return new ActionOnlyNavDirections(R.id.action_donorsHomeFragment_to_contactUsFragment);
  }
}
