package com.getsucode.siagagempacianjur.Repository

import com.getsucode.siagagempacianjur.Model.ListModel

object ItemTipsGempa {

    private val JudulTips = arrayOf(
        "1. Jangan Panik",
        "2. Ketika Dalam Ruangan",
        "3. Ketika Diluar Ruangan",
    )

    private val PenjelasanTips = arrayOf(
        "Jangan panik adalah hal pertama yang harus dilakukan ketika terjadinya gempa bumi. Kemudian mewaspadai beberapa hal-hal buruk pascagempa yakni: longsor, kebakaran, tsunami, dan gempa susulan. \nَِ",
        "Bagi yang sedang berada di dalam ruangan, disarankan agar mereka melakukan beberapa hal seperti: segera keluar dari ruangan, berlindung di bawah meja yang kuat, menjauh dari benda yang mudah jatuh dan pecah, jangan menggunakan lift, gunakan jalur evakuasi.َِ",
        "Untuk mereka yang berada di luar ruangan, tiga hal juga wajib dilakukan agar terhindar dari efek buruk gempa. Kemudian, bila berada di gunung menjauh dari lereng atau jurang. \n" +
                "\n" +
                "Dan yang terakhir, bila sedang di pantai, menjauh dari laut terutama jika air laut surut secara tiba-tiba. \n" +
                "\n" +
                "Caranya dengan menjauh dari bangunan, tiang listrik, pohon, papan reklame, terowongan atau jembatan.ِ",
    )

    val listDataTips: ArrayList<ListModel>
        get() {
            val list = arrayListOf<ListModel>()
            for (position in JudulTips.indices) {
                val listTips = ListModel()
                listTips.judulTips = JudulTips[position]
                listTips.penjelasanTips = PenjelasanTips[position]
                list.add(listTips)
            }
            return list
        }
}