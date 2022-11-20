package com.example.onboarding_presentation

import android.content.res.Resources.Theme
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.core.R
import com.example.core_ui.LocalSpacing
import com.example.core_ui.components.ActionButton
import theme.KCalsTheme as theme



@Composable
fun WelcomeScreen(){
    val spacing = LocalSpacing.current
    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center, 
    horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = stringResource(id = R.string.welcome_text),
        textAlign = TextAlign.Center, style = MaterialTheme.typography.h1)
        Spacer(modifier = Modifier.height(spacing.med_spacing))
        ActionButton(text = "Let's get started", onClick = { } )
    }
}


@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    theme() {
        WelcomeScreen()
    }


}

