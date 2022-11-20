package com.example.core_ui

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimensions(
    val default: Dp = 0.dp,
    val small_spacing: Dp = 4.dp,
    val med_spacing: Dp = 8.dp,
    val large_spacing: Dp = 16.dp,
    val xlarge_spacing: Dp = 32.dp,
    val monster_spacing: Dp = 64.dp
)

val LocalSpacing = compositionLocalOf { Dimensions() }
