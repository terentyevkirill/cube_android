package ua.onpu.presentation.fragments.assignToTracker

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import ua.onpu.R
import ua.onpu.db.entity.Action

class AssignToTrackerFragmentDirections private constructor() {
    private data class ActionActionManagmentFragmentToEditActionFragment(val StringGoToEditAction:
            Action) : NavDirections {
        override fun getActionId(): Int = R.id.action_actionManagmentFragment_to_editActionFragment

        @Suppress("CAST_NEVER_SUCCEEDS")
        override fun getArguments(): Bundle {
            val result = Bundle()
            if (Parcelable::class.java.isAssignableFrom(Action::class.java)) {
                result.putParcelable("@string/goToEditAction", this.StringGoToEditAction as
                        Parcelable)
            } else if (Serializable::class.java.isAssignableFrom(Action::class.java)) {
                result.putSerializable("@string/goToEditAction", this.StringGoToEditAction as
                        Serializable)
            } else {
                throw UnsupportedOperationException(Action::class.java.name +
                        " must implement Parcelable or Serializable or must be an Enum.")
            }
            return result
        }
    }

    companion object {
        fun actionActionManagmentFragmentToEditActionFragment(StringGoToEditAction: Action):
                NavDirections =
                ActionActionManagmentFragmentToEditActionFragment(StringGoToEditAction)
    }
}
