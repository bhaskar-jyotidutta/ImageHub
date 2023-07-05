package com.gyanpanda.imagehub.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


/*In Kotlin, a data class is a special type of class that is primarily used for holding data and automatically
generates some commonly used methods for you. It is designed to reduce boilerplate
code when creating classes whose main purpose is to store data.
*/

/*
The @Parcelize annotation is used to automatically generate the necessary code for making the UnsplashPhoto,
UnsplashPhotoUrls, and UnsplashUser classes Parcelable. This allows instances of these classes to be easily
serialized and deserialized when passing data between different components in Android, such as activities or fragments.
*/

@Parcelize
data class UnsplashPhoto(
    val id: String,
    val description: String?,
    val urls: UnsplashPhotoUrls,
    val user: UnsplashUser
) : Parcelable {

    @Parcelize
    data class UnsplashPhotoUrls(val raw: String, val ful: String, val regular: String, val small: String, val thumb: String) : Parcelable

    @Parcelize
    data class UnsplashUser(val name: String, val username: String)  : Parcelable{

        val attributionUrl get() = "https://api.unsplash.com/$username?utm_source=imagehub&utm_medium=referral"

    }


}