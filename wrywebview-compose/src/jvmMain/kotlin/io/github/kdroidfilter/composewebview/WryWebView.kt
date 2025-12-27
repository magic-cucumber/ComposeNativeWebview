package io.github.kdroidfilter.composewebview

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.SwingPanel
import io.github.kdroidfilter.composewebview.wry.WryWebViewPanel

@Composable
fun WryWebView(url: String, modifier: Modifier = Modifier) {
    SwingPanel(
        modifier = modifier,
        factory = { WryWebViewPanel(url) },
        update = { it.loadUrl(url) },
    )
}
