package com.getsucode.mariberdoa.Repository

import com.getsucode.mariberdoa.Model.ListModel
import com.getsucode.mariberdoa.Model.ListModelHadistIbaadaat
import com.getsucode.mariberdoa.Model.ListModelHadistMuamalaat

object ItemHadistMuamalaat {

    private val ArabicHadistMuamalaat = arrayOf(
        "مَنْ غَشَّنا فَلَيْسَ مِنَّا",
        "مَنِ انْتَهَبَ نُهْبَةً فَلَيْسَ مِنَّاِ",
        "لَعَنَ رَسُولُ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ الرَّاشِيَ وَالْمُرْتَشِِ",
        "الْمَرْءُ مَعَ مَنْ أَحَبٌَّ",
        "سِبَابُ الْمُسْلِمِ فُسُوقٌ ، وَقِتَالُهُ كُفْرٌَُْ",
        "أحَبُّ الْبِلاَدِ إِلَى اللهِ مَسَاجِدُهَا",
        "بَلِّـغُوْا عَنِّي وَلَوْ آيَةً",
        "اَلأَنَاةُ مِنَ اللَّهِ وَالْعَجَلَةُ مِنَ الشَّيْطَانِِ",
    )

    private val LatinHadistMuamalaat= arrayOf(
        "Man ghassyanaa fa laisa minnaa. (HR Muslim) ",
        "Manintahaba nuhbatan fa laisa minnaa. (HR Tirmizi) ",
        "La’ana Rasulullahi (SAW) ar rasyia wal murtasyia. (HR Abu Daud) ",
        "Al mar’u maa man ahabba. (HR Muslim)",
        "Sibaabul muslimi fusuuqun wa qitaaluhu kufrun. (HR Tirmizi)",
        "Ahabbul bilaadi ilallaahi masaajiduh. (HR Bukhari)",
        "Ballighuw anniy walau aayah. (HR Bukhari) ",
        "Al-anaatu minallahi wal ‘ajalatu minas syaithan. (HR Tirmizi) ",
    )

    private val ArtiHadistMuamalaat = arrayOf(
        "Artinya: Siapa yang curang bukan golongan kami.",
        "Artinya: Siapa merampas milik orang bukan golongan kami.",
        "Artinya: Laknat Rasulullah (SAW) kepada orang yang menyogok dan yang disogok.",
        "Artinya: Seseorang akan bersama siapa yang dicintainya.",
        "Artinya: Mencaci seorang muslim adalah dosa dan memeranginya adalah kufur.",
        "Artinya: Tempat yang paling dicintai Allah di muka bumi adalah masjid-masjidnya.",
        "Artinya: Sampaikan dariku walau satu ayat.",
        "Artinya: Kehati-hatian datangnya dari Allah dan ketergesa-gesaan datangnya dari setan."
    )

    val listDataHadistMuamalaat: ArrayList<ListModelHadistMuamalaat>
        get() {
            val list = arrayListOf<ListModelHadistMuamalaat>()
            for (position in ArabicHadistMuamalaat .indices) {
                val listdaftarhadistMuamalaat = ListModelHadistMuamalaat()
                listdaftarhadistMuamalaat .arabicHadistMuamalaat = ArabicHadistMuamalaat[position]
                listdaftarhadistMuamalaat .latinHadistMuamalaat = LatinHadistMuamalaat[position]
                listdaftarhadistMuamalaat .artiHadistMuamalaat= ArtiHadistMuamalaat[position]
                list.add(  listdaftarhadistMuamalaat  )
            }
            return list
        }
}