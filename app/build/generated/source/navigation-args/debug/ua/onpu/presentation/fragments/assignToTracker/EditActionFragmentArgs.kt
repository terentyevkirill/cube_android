package ua.onpu.presentation.fragments.assignToTracker

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import ua.onpu.db.entity.Action

data class EditActionFragmentArgs(val StringGoToEditAction: Action) : NavArgs {
    @Suppress("CAST_NEVER_SUCCEEDS")
    fun toBundle(): Bundle {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Action::class.java)) {
            result.putParcelable("@string/goToEditAction", this.StringGoToEditAction as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Action::class.java)) {
            result.putSerializable("@string/goToEditAction", this.StringGoToEditAction as
                    Serializable)
        } else {
            throw UnsupportedOperationException(Action::class.java.name +
                    " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): EditActionFragmentArgs {
            bundle.setClassLoader(EditActionFragmentArgs::class.java.classLoader)
            val __StringGoToEditAction : Action?
            if (bundle.containsKey("@string/goToEditAction")) {
                if (Parcelable::class.java.isAssignableFrom(Action::class.java) ||
                        Serializable::class.java.isAssignableFrom(Action::class.java)) {
                    __StringGoToEditAction = bundle.get("@string/goToEditAction") as Action?
                } else {
                    throw UnsupportedOperationException(Action::class.java.name +
                            " must implement Parcelable or Serializable or must be an Enum.")
                }
                if (__StringGoToEditAction == null) {
                    throw IllegalArgumentException("Argument \"@string/goToEditAction\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"@string/goToEditAction\" is missing and does not have an android:defaultValue")
            }
            return EditActionFragmentArgs(__StringGoToEditAction)
        }
    }
}
