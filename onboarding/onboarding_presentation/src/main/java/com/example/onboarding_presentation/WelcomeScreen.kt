package com.example.onboarding_presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.core.R
import com.example.core.navigation.Route
import com.example.core.util.UiEvent
import com.example.core_ui.LocalSpacing
import com.example.core_ui.components.ActionButton


@Composable
fun WelcomeScreen(
    onNavigate: (UiEvent.Navigate) -> Unit
) {
    val spacing = LocalSpacing.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.welcome_text),
            textAlign = TextAlign.Center, style = MaterialTheme.typography.h1
        )
        Spacer(modifier = Modifier.height(spacing.med_spacing))
        ActionButton(text = "Let's get started",
            onClick = {
                onNavigate(UiEvent.Navigate(Route.VALUE_PROP1))
            })
    }
}


//@Preview(showBackground = true)
//@Composable
//fun WelcomeScreenPreview() {
//    theme() {
//        WelcomeScreen(UiEvent.Navigate)
//    }
//
//
//}

