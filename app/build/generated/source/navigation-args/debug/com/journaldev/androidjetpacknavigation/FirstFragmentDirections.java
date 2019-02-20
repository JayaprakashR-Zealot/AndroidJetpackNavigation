package com.journaldev.androidjetpacknavigation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;

public class FirstFragmentDirections {
  @NonNull
  public static ActionFirstFragmentToSecondFragment actionFirstFragmentToSecondFragment() {
    return new ActionFirstFragmentToSecondFragment();
  }

  public static class ActionFirstFragmentToSecondFragment implements NavDirections {
    public ActionFirstFragmentToSecondFragment() {
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    public int getActionId() {
      return com.truedreamz.navigation.R.id.action_firstFragment_to_secondFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      if (!super.equals(object)) {
          return false;
      }
      ActionFirstFragmentToSecondFragment that = (ActionFirstFragmentToSecondFragment) object;
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + getActionId();
      return result;
    }
  }
}
