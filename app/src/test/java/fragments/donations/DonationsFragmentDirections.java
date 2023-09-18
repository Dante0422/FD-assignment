package fragments.donations;

import android.os.Bundle;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;

import com.example.fd_assignment.R;
import com.example.fd_assignment.model.Donation;

import java.io.Serializable;
import java.util.HashMap;

public class DonationsFragmentDirections {
  private DonationsFragmentDirections() {
  }

  @NonNull
  public static ActionDonationsFragmentToDonorLocationFragment actionDonationsFragmentToDonorLocationFragment(
      @NonNull Donation donation) {
    return new ActionDonationsFragmentToDonorLocationFragment(donation);
  }

  public static class ActionDonationsFragmentToDonorLocationFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionDonationsFragmentToDonorLocationFragment(@NonNull Donation donation) {
      if (donation == null) {
        throw new IllegalArgumentException("Argument \"donation\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("donation", donation);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionDonationsFragmentToDonorLocationFragment setDonation(@NonNull Donation donation) {
      if (donation == null) {
        throw new IllegalArgumentException("Argument \"donation\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("donation", donation);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("donation")) {
        Donation donation = (Donation) arguments.get("donation");
        if (Parcelable.class.isAssignableFrom(Donation.class) || donation == null) {
          __result.putParcelable("donation", Parcelable.class.cast(donation));
        } else if (Serializable.class.isAssignableFrom(Donation.class)) {
          __result.putSerializable("donation", Serializable.class.cast(donation));
        } else {
          throw new UnsupportedOperationException(Donation.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_donationsFragment_to_donorLocationFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Donation getDonation() {
      return (Donation) arguments.get("donation");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionDonationsFragmentToDonorLocationFragment that = (ActionDonationsFragmentToDonorLocationFragment) object;
      if (arguments.containsKey("donation") != that.arguments.containsKey("donation")) {
        return false;
      }
      if (getDonation() != null ? !getDonation().equals(that.getDonation()) : that.getDonation() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getDonation() != null ? getDonation().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionDonationsFragmentToDonorLocationFragment(actionId=" + getActionId() + "){"
          + "donation=" + getDonation()
          + "}";
    }
  }
}
