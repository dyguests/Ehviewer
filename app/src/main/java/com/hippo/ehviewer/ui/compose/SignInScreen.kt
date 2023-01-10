package com.hippo.ehviewer.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hippo.ehviewer.R
import com.hippo.ehviewer.ui.compose.theme.EhViewerTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreen() {
    Box(
        contentAlignment = Alignment.Center
    ) {
        Column(
            Modifier
                .padding(dimensionResource(id = R.dimen.keyline_margin))
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
                Modifier.padding(dimensionResource(id = R.dimen.keyline_margin))
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                Modifier.width(dimensionResource(id = R.dimen.single_max_width)),
                label = {
                    Text(text = stringResource(id = R.string.username))
                },
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                Modifier.width(dimensionResource(id = R.dimen.single_max_width)),
                label = {
                    Text(text = stringResource(id = R.string.password))
                },
            )

            Text(
                text = stringResource(id = R.string.app_waring),
                Modifier
                    .widthIn(max = dimensionResource(id = R.dimen.single_max_width))
                    .padding(top = 24.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            Row {
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    Modifier
                        .weight(1f)
                        .padding(horizontal = 4.dp)
                ) {
                    Text(text = stringResource(id = R.string.register))
                }

                Button(
                    onClick = { /*TODO*/ },
                    Modifier
                        .weight(1f)
                        .padding(horizontal = 4.dp)
                ) {
                    Text(text = stringResource(id = R.string.sign_in))
                }
            }

            Row(
                Modifier.padding(horizontal = 4.dp)
            ) {
                TextButton(
                    onClick = { /*TODO*/ },
                    Modifier.padding(horizontal = 8.dp)
                ) {
                    Text(text = stringResource(id = R.string.sign_in_via_webview))
                }

                TextButton(
                    onClick = { /*TODO*/ },
                    Modifier.padding(horizontal = 8.dp)
                ) {
                    Text(text = stringResource(id = R.string.sign_in_via_cookies))
                }
            }

            TextButton(
                onClick = { /*TODO*/ },
            ) {
                Text(text = stringResource(id = R.string.tourist_mode))
            }
        }
        CircularProgressIndicator()
    }
}

@Preview
@Composable
fun SignInScreenPreview() {
    EhViewerTheme {
        SignInScreen()
    }
}
