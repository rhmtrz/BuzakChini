package com.vira.buzakechini.datastorage

import com.vira.buzakechini.datastorage.storyFiles.SampleStory1
import com.vira.buzakechini.datastorage.storyFiles.SampleStory2
import com.vira.buzakechini.datastorage.storyFiles.SampleStory3

fun storyList() : List<Story> {
    return listOf(
        Story( id = 1, title = "زن جادوگر", author = "شقایق", director = "معصومه رحیمی", content = SampleStory1.content ),
        Story(id = 2, title = "دختر خجالتی", author = "مجتبی", director = "معصومه رحیمی", content = SampleStory2.content),
        Story(id = 3, title = "ماهی کوچک", author = "هما یوسفی", director = "کامله رضایی و معصومه رحیمی", content = SampleStory3.content),
    )
}



