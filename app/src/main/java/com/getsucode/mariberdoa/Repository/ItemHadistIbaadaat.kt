package com.getsucode.mariberdoa.Repository

import com.getsucode.mariberdoa.Model.ListModel
import com.getsucode.mariberdoa.Model.ListModelHadistIbaadaat

object ItemHadistIbaadaat {

    private val ArabicHadistIbaadaat = arrayOf(
        "مِفْتَاحُ الْجَنَّةِ الصَّلاَةُ",
        "الطُّهُورُ شَطْرُ الإِيمَانِ",
        "اَلدُّعَاءُ سِلاَحُ الْمُؤْمِنِ",
        "الْكَلِمَةُ الطَّيِّبَةُ صَدَقَةٌ",
        "خَيْرُكُمْ مَنْ تَعَلَّمَ اْلقُرْآنَ وَعَلَّمَهَُْ",
        "أَنْفِقْ يَا ابْنَ آدَمَ يُنْفَقْ عَلَيْكَ",
        "مَنْ حَمَلَ عَلَيْنَا السِّلاَحَ فَلَيْسَ مِنَّاَ",
        "مَنْ عَزَّى مُصَابًا فَلَهُ مِثْلُ أَجْرِهِ",
    )

    private val LatinHadistIbaadaat = arrayOf(
        "Miftaahul Jannati As Sholaah (HR Ahmad) ",
        "At thuhuuru syathrul imaan (HR Muslim) ",
        "Ad du’aau silaahul mu’min (Jamius Saghir)  ",
        "Al kalimatut thayyibatu shadaqah (HR Bukhari) ",
        "Al kalimatut thayyibatu shadaqah (HR Bukhari) ",
        "Anfiq yabna Aadama yunfaq ‘alaik (HR Bukhari)  ",
        "Man hamala ‘alainas silaaha fa laisa minnaa (HR Bukhari)  ",
        "Man ‘azzaa musaaban falahu mitslu ajrih (HR Tirmizi) "
    )

    private val ArtiHadistIbaadaat = arrayOf(
        "Artinya: Kunci surga adalah shalat",
        "Artinya: Kebersihan adalah sebagian iman",
        "Artinya: Do’a adalah senjata orang beriman",
        "Artinya: Berkata yang baik adalah sedekah",
        "Artinya: Sebaik-baik orang di antara kamu adalah orang yang belajar Al Qur’an dan mengajarkannya",
        "Artinya: Berinfaqlah wahai anak Adam maka engkau akan dibalas",
        "Artinya: Barangsiapa menakut-nakuti dengan senjata kepada kami maka bukan golongan kami",
        "Artinya: Barangsiapa menghibur orang yang tertimpa musibah maka baginya pahala seperti orang yang tertimpa musibah"
    )

    val listDataHadistIbaadaat: ArrayList<ListModelHadistIbaadaat>
        get() {
            val list = arrayListOf<ListModelHadistIbaadaat>()
            for (position in ArabicHadistIbaadaat .indices) {
                val listdaftarhadistIbaadaat = ListModelHadistIbaadaat()
                listdaftarhadistIbaadaat .arabicHadistIbaadaat = ArabicHadistIbaadaat[position]
                listdaftarhadistIbaadaat .latinHadistIbaadaat = LatinHadistIbaadaat[position]
                listdaftarhadistIbaadaat .artiHadistIbaadaat= ArtiHadistIbaadaat[position]
                list.add( listdaftarhadistIbaadaat  )
            }
            return list
        }
}