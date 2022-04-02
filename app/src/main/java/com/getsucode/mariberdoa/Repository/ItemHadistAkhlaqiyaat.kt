package com.getsucode.mariberdoa.Repository

import com.getsucode.mariberdoa.Model.*

object ItemHadistAkhlaqiyaat {

    private val ArabicHadistAkhlaqiyaat = arrayOf(
        "علَيْكُمْ باِلصِّدْقِِ",
        "اِجْتَنِبُواالْغَضَبٌَِِ",
        "لاَ يَدْخُلُ الجَنّةَ خَبٌّ وَلاَ بَخِيْلٌ وَلاَ مَنَّانٌ",
        "يَدْخُلُ الْجَنَّةَ نَمَّامٌ لاَ",
        "اَ يَرْحَمُ الله ُمَنْ لاَ يَرْحَمُ النَّاسَلٌَُِْ",
        "الدُّنْيَا سِجْنُ الْمُؤْمِنِ وَجَنَّةُ الْكَافِرِ",
        "اَلْمُسْلِمُ مَنْ سَلِمَ الْمُسْلَمُوْنَ مِنْ لِسَانِهِ وَيَدِهِ",
        "الصُّبْحَةُ تَمْنَعُ الرِّزْقَِِِ",
    )

    private val LatinHadistAkhlaqiyaat= arrayOf(
        "Alaykum bis shidqi (HR Muslim) ",
        "Ijtanibul ghadhab (Kanzul Ummal) ",
        "Laa yadkhulul jannata khabbun wa laa bakhiylun wa laa mannaan (HR Tirmizi) ",
        "Laa yadkhulul jannata nammaamun (HR Muslim)  ",
        "Laa yarhamullaahu man laa yarhamunnaasa (HR Bukhari)  ",
        "Ad duniya sijnul mu’min wa jannatul kaafir (HR Muslim) ",
        "Al muslimu man salimal muslimuuna min lisaanihii wa yadihii(HR Bukhari) ",
        "As subhatu tamna’ur rizq (Musnad Ahmad)  ",
    )

    private val ArtiHadistAkhlaqiyaat = arrayOf(
        "Artinya: Hendaknya kalian berlaku jujur.",
        "Artinya: Jauhilah sifat pemarah.",
        "Artinya: Tidak akan masuk surga orang yang suka menipu, pelit dan mengungkit pemberian.",
        "Artinya: Tidak akan masuk surga penghasut.",
        "Artinya: Tidak disayang Allah orang yang tidak sayang kepada manusia.",
        "Artinya: Dunia adalah penjara bagi orang beriman dan surga bagi orang kafir.",
        "Artinya: Muslim sejati adalah orang yang menyelamatkan muslim lainnya dari keburukan lisannya dan kejahatan tangannya.",
        "Artinya: Tidur di waktu pagi menjadi penghalang rizki."
    )

    val listDataHadistAkhlaqiyaat: ArrayList<ListModelHadistAkhlaqiyaat>
        get() {
            val list = arrayListOf<ListModelHadistAkhlaqiyaat>()
            for (position in ArabicHadistAkhlaqiyaat .indices) {
                val listdaftarhadistAkhlaqiyaat= ListModelHadistAkhlaqiyaat()
                listdaftarhadistAkhlaqiyaat .arabicHadistAkhlaqiyaat= ArabicHadistAkhlaqiyaat[position]
                listdaftarhadistAkhlaqiyaat .latinHadistAkhlaqiyaat = LatinHadistAkhlaqiyaat[position]
                listdaftarhadistAkhlaqiyaat .artiHadistAkhlaqiyaat= ArtiHadistAkhlaqiyaat[position]
                list.add(  listdaftarhadistAkhlaqiyaat  )
            }
            return list
        }
}