package ua.onpu.presentation.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import ua.onpu.R
import ua.onpu.db.entity.Action

class StartActionFragmentDirections private constructor() {
    private data class ActionTimer(val StringTrackedAction: Action) : NavDirections {
        override fun getActionId(): Int = R.id.actionTimer

        @Suppress("CAST_NEVER_SUCCEEDS")
        override fun getArguments(): Bundle {
            val result = Bundle()
            if (Parcelable::class.java.isAssignableFrom(Action::class.java)) {
                result.putParcelable("@string/trackedAction", this.StringTrackedAction as
                        Parcelable)
            } else if (Serializable::class.java.isAssignableFrom(Action::class.java)) {
                result.putSerializable("@string/trackedAction", this.StringTrackedAction as
                        Serializable)
            } else {
                throw UnsupportedOperationException(Action::class.java.name +
                        " must implement Parcelable or Serializable or must be an Enum.")
            }
            return result
        }
    }

    companion object {
        fun actionTimer(StringTrackedAction: Action): NavDirections =
                ActionTimer(StringTrackedAction)
    }
}
