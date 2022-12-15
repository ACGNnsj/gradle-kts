package com.demo.model

class BlogDo {
    var id: Long = 0
    var comment: String? = null
    var content: String? = null
    var mobile: String? = null
    var title: String? = null
    override fun toString(): String {
        return "BlogDo(id=$id, comment=$comment, content=$content, mobile=$mobile, title=$title)"
    }
}