package com.example.rosaapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.rosaapp.R

// Set of Material typography styles to start with

private val poppins = FontFamily(
    Font(R.font.poppins_bold),
    Font(R.font.poppins_black),
    Font(R.font.poppins_black_italic),
    Font(R.font.poppins_extra_bold),
    Font(R.font.poppins_extra_light),
    Font(R.font.poppins_extra_bold_italic),
    Font(R.font.poppins_extra_light_italic),
    Font(R.font.poppins_italic),
    Font(R.font.poppins_light),
    Font(R.font.poppins_light_italic),
    Font(R.font.poppins_medium),
    Font(R.font.poppins_medium_italic),
    Font(R.font.poppins_regular),
    Font(R.font.poppins_semi_bold),
    Font(R.font.poppins_semi_bold_italic),
    Font(R.font.poppins_thin),
    Font(R.font.poppins_thin_italic)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),

    titleLarge = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)
