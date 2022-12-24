package com.vira.buzakechini.datastorage

fun storyList() : List<Story> {

    return listOf(
        Story(
            id = 1,
            title = "Rahmat",
            author = "Rezaei",
            content = SampleStory1.content
        ),
        Story(
            id = 1,
            title = "マリオ",
            author = "ルイージ",
            content = SampleStory2.content
        ),
        Story(
            id = 1,
            title = "ピーチ",
            author = "クッパ",
            content = SampleStory3.content
        ),
    )
}



