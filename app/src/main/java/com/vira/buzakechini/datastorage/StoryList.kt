package com.vira.buzakechini.datastorage

import com.vira.buzakechini.datastorage.storyFiles.SampleStory1
import com.vira.buzakechini.datastorage.storyFiles.SampleStory2
import com.vira.buzakechini.datastorage.storyFiles.SampleStory3

fun storyList() : List<Story> {
    return listOf(
        Story( id = 1, title = "Rahmat", author = "Rezaei", content = SampleStory1.content ),
        Story(id = 2, title = "マリオ", author = "ルイージ", content = SampleStory2.content),
        Story(id = 3, title = "ピーチ", author = "クッパ", content = SampleStory3.content),
    )
}



