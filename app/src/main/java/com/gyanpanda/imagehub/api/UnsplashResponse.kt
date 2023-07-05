package com.gyanpanda.imagehub.api

import com.gyanpanda.imagehub.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)