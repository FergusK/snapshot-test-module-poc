package com.poc.snapshot

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun IconImage(contentDescription: String) {
    Image(
        painter = painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = contentDescription,
    )
}

@Composable
@Preview
fun InfoImagePreview() {
    IconImage(contentDescription = "")
}
