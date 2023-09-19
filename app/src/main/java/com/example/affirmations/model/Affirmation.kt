package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourseID: Int,
    @DrawableRes val imageResourceId: Int) {

}