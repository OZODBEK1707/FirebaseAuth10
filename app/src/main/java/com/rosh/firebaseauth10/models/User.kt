package com.rosh.firebaseauth10.models

class User {
    var uid: String? = null
    var name: String? = null
    var imageLick: String? = null

    constructor(uid: String?, name: String?, imageLick: String?) {
        this.uid = uid
        this.name = name
        this.imageLick = imageLick
    }
    constructor()
}