package com.example.wildlifephotography

import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.wildlifephotography.ui.theme.ImagesAndText

@Preview(showSystemUi = true)
@Composable
fun PreviewArtApp() {
    ArtSpaceApp()
}

@Composable
fun ArtSpaceApp() {
    var currentStep by remember { mutableStateOf(1) }

    when(currentStep) {
        1-> {
            ImagesAndText(
                title = R.string.monday_morning_mood,
                artist = R.string.andrew_mayes,
                drawableResourse = R.drawable.andrew_mayes_2021_monday_morning_mood,
                onButtonClickNext = { currentStep = 2 },
                onButtonClickPrev = { currentStep = 10 })
        }
        2 -> {
            ImagesAndText(
                title = R.string.time_for_school,
                artist = R.string.chee_kee_teo,
                drawableResourse = R.drawable.chee__kee_teo_2021_time__for_school,
                onButtonClickNext = { currentStep = 3 },
                onButtonClickPrev = { currentStep = 1 })
        }
        3 -> {
            ImagesAndText(
                title = R.string.hello_everyone,
                artist = R.string.miroslav_srb,
                drawableResourse = R.drawable.miroslav_srb_2022_hello_everyone,
                onButtonClickNext = { currentStep = 4 },
                onButtonClickPrev = { currentStep = 2 })
        }
        4 -> {
            ImagesAndText(
                title = R.string.symphonyno5,
                artist = R.string.giacomo_redaelli,
                drawableResourse = R.drawable.giacomoredaelli_2019_symphonyno5,
                onButtonClickNext = { currentStep = 5 },
                onButtonClickPrev = { currentStep = 3 })
        }
        5 -> {
            ImagesAndText(
                title = R.string.quarantine_life,
                artist = R.string.kevin_biskanorn,
                drawableResourse = R.drawable.kevin_biskanorn_2021_quarantine_life,
                onButtonClickNext = { currentStep = 6 },
                onButtonClickPrev = { currentStep = 4 })
        }
        6 -> {
            ImagesAndText(
                title = R.string.peek_a_boo,
                artist = R.string.shane_keena,
                drawableResourse = R.drawable.shane_keena_2018_peek_a_boo,
                onButtonClickNext = { currentStep = 7 },
                onButtonClickPrev = { currentStep = 5 })
        }
        7 -> {
            ImagesAndText(
                title = R.string.help,
                artist = R.string.tibor_kercz,
                drawableResourse = R.drawable.tibor_kercz_2017_help,
                onButtonClickNext = { currentStep = 8 },
                onButtonClickPrev = { currentStep = 6 })
        }
        8 -> {
            ImagesAndText(
                title = R.string.head_shot,
                artist = R.string.tom_sables,
                drawableResourse = R.drawable.tom_sables_2016_head_shot,
                onButtonClickNext = { currentStep = 9 },
                onButtonClickPrev = { currentStep = 7 })
        }
        9 -> {
            ImagesAndText(
                title = R.string.slap,
                artist = R.string.troy_mayne,
                drawableResourse = R.drawable.troy_mayne_2017_slap,
                onButtonClickNext = { currentStep = 10 },
                onButtonClickPrev = { currentStep = 8 })
        }
        10 -> {
            ImagesAndText(
                title = R.string.we_all_have,
                artist = R.string.yarin_klein,
                drawableResourse = R.drawable.yarin_klein_2020_we_all_have_that_friend,
                onButtonClickNext = { currentStep = 1 },
                onButtonClickPrev = { currentStep = 9 })
        }
    }

}

