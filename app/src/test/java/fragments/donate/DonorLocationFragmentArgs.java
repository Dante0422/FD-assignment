package fragments.donate;

import android.os.Bundle;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;

import com.example.fd_assignment.model.Donation;

import java.io.Serializable;
import java.util.HashMap;

public class DonorLocationFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DonorLocationFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DonorLocationFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DonorLocationFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DonorLocationFragmentArgs __result = new DonorLocationFragmentArgs();
    bundle.setClassLoader(DonorLocationFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("donation")) {
      Donation donation;
      if (Parcelable.class.isAssignableFrom(Donation.class) || Serializable.class.isAssignableFrom(Donation.class)) {
        donation = (Donation) bundle.get("donation");
      } else {
        throw new UnsupportedOperationException(Donation.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (donation == null) {
        throw new IllegalArgumentException("Argument \"donation\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("donation", donation);
    } else {
      throw new IllegalArgumentException("Required argument \"donation\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DonorLocationFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    DonorLocationFragmentArgs __result = new DonorLocationFragmentArgs();
    if (savedStateHandle.contains("donation")) {
      Donation donation;
      donation = savedStateHandle.get("donation");
      if (donation == null) {
        throw new IllegalArgumentException("Argument \"donation\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("donation", donation);
    } else {
      throw new IllegalArgumentException("Required argument \"donation\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Donation getDonation() {
    return (Donation) arguments.get("donation");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("donation")) {
      Donation donation = (Donation) arguments.get("donation");
      if (Parcelable.class.isAssignableFrom(Donation.class) || donation == null) {
        __result.set("donation", Parcelable.class.cast(donation));
      } else if (Serializable.class.isAssignableFrom(Donation.class)) {
        __result.set("donation", Serializable.class.cast(donation));
      } else {
        throw new UnsupportedOperationException(Donation.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DonorLocationFragmentArgs that = (DonorLocationFragmentArgs) object;
    if (arguments.containsKey("donation") != that.arguments.containsKey("donation")) {
      return false;
    }
    if (getDonation() != null ? !getDonation().equals(that.getDonation()) : that.getDonation() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getDonation() != null ? getDonation().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DonorLocationFragmentArgs{"
        + "donation=" + getDonation()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull DonorLocationFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Donation donation) {
      if (donation == null) {
        throw new IllegalArgumentException("Argument \"donation\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("donation", donation);
    }

    @NonNull
    public DonorLocationFragmentArgs build() {
      DonorLocationFragmentArgs result = new DonorLocationFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setDonation(@NonNull Donation donation) {
      if (donation == null) {
        throw new IllegalArgumentException("Argument \"donation\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("donation", donation);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Donation getDonation() {
      return (Donation) arguments.get("donation");
    }
  }
}
