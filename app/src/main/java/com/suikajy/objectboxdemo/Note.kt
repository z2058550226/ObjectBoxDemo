package com.suikajy.objectboxdemo

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import java.util.*

/**
 * Created by suikajy on 2019/2/28
 */
@Entity
class Note(
    @Id
    var label2: Long = 0L,
    var text: String? = null,
    var comment: String? = null,
    var date: Date? = null
)