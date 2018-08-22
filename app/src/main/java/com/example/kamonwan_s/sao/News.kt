package com.example.kamonwan_s.sao

class News {
    var detailNews: String = ""
    var titleNews: String = ""
    var photoNews: Int = 1

    constructor()

    constructor(detailNews: String, titleNews: String, photoNews: Int){
        this.detailNews = detailNews
        this.titleNews = titleNews
        this.photoNews = photoNews
    }


}