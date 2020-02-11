package ua.onpu.presentation.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import ua.onpu.db.entity.Action

data class TimerFragmentArgs(val StringTrackedAction: Action) : NavArgs {
    @Suppress("CAST_NEVER_SUCCEEDS")
    fun toBundle(): Bundle {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Action::class.java)) {
            result.putParcelable("@string/trackedAction", this.StringTrackedAction as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Action::class.java)) {
            result.putSerializable("@string/trackedAction", this.StringTrackedAction as
                    Serializable)
        } else {
            throw UnsupportedOperationException(Action::class.java.name +
                    " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): TimerFragmentArgs {
            bundle.setClassLoader(TimerFragmentArgs::class.java.classLoader)
            val __StringTrackedAction : Action?
            if (bundle.containsKey("@string/trackedAction")) {
                if (Parcelable::class.java.isAssignableFrom(Action::class.java) ||
                        Serializable::class.java.isAssignableFrom(Action::class.java)) {
                    __StringTrackedAction = bundle.get("@string/trackedAction") as Action?
                } else {
                    throw UnsupportedOperationException(Action::class.java.name +
                            " must implement Parcelable or Serializable or must be an Enum.")
                }
                if (__StringTrackedAction == null) {
                    throw IllegalArgumentException("Argument \"@string/trackedAction\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"@string/trackedAction\" is missing and does not have an android:defaultValue")
            }
            return TimerFragmentArgs(__StringTrackedAction)
        }
    }
}
