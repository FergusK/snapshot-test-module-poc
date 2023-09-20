package com.poc.testsnapshot

import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.android.ide.common.rendering.api.SessionParams
import com.poc.snapshot.InfoImagePreview
import org.junit.Test
import org.junit.Rule

class SnapshotTest {

    @get:Rule
    val paparazzi = Paparazzi(
        theme = "android:Theme.Material.Light.NoActionBar",
        renderingMode = SessionParams.RenderingMode.NORMAL,
        deviceConfig = DeviceConfig.PIXEL_3,
        showSystemUi = true
    )

    @Test
    fun iconComponentTest() {
        paparazzi.snapshot {
            InfoImagePreview()
        }
    }
}
