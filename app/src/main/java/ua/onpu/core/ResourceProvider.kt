package ua.onpu.core

import android.content.Context
import androidx.annotation.StringRes
import javax.inject.Inject

/**
 * Created by Nazariy Yatsuk on 20.07.2019.
 * Copyright (c) 2019 ANZID Company. All rights reserved.
 */

class ResourceProvider @Inject constructor(private val context: Context)  {

    fun context() = context

    fun getString(@StringRes resId: Int): String = context.resources.getString(resId)
}