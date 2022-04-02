package com.getsucode.mariberdoa.Repository

import com.getsucode.mariberdoa.Model.ListModel
import com.getsucode.mariberdoa.Model.ListModelHadistIbaadaat
import com.getsucode.mariberdoa.Model.ListModelHadistMuamalaat
import com.getsucode.mariberdoa.Model.ListModelHadistMuasyaraat

object ItemHadistMuasyaraat {

    private val ArabicHadistMuasyaraat = arrayOf(
        "الَسَّلامُ قَبْلَ الكَلاَمِ",
        "الْجَنَّةُ تَحْتَ أقْدامِ الأُمَّهَاتِِ",
        "رِضَى الرَّبِّ في رِضَى الْوَالِدِ",
        "لايَدْخُلُ الْجَنَّةَ قَاطِعٌٌَّ",
        "مَنْ سَتَرَ مُسْلِمًا سَتَرَهُ اللَّهُ يوم القيامةٌَُْ",
        "اَلْيَدُ اْلعُلْياَ خَيْرٌ مِنَ اْليَدِ السُّفْلَى",
        "لاَ يَدْخُلُ الجنَّةَ مَنْ لاَ يَأمَنُ جَارُهُ بَوَائِقَهًُ",
        "لايُلْدَغُ الْمُؤْمِنُ مِنْ جُحْرٍ مَرَّتَيْنِِِ",
    )

    private val LatinHadistMuasyaraat= arrayOf(
        "Assalamu qablal kalam (HR Bukhari) ",
        "Al Jannatu tahta aqdaamil ummahaat (Kanzul Ummal) ",
        "Ridhar Rabbii fii ridhal waalid (HR Tirmizi) ",
        "Laa yadkhulul jannata qaati’un (HR Muslim) ",
        "Man satara musliman satarahullaahu yaumal qiyamah (HR Muslim) ",
        "Al yadul ulya khairun minal yadis suflaa (HR Muslim)",
        "Laa yadkhulul jannata man laa ya’manu jaaruhu bawaa’iqahu(HR Muslim) ",
        "Laa yuldaghul mu’min min juhrim marratain (HR Bukhari) ",
    )

    private val ArtiHadistMuasyaraat = arrayOf(
        "Artinya: Ucap salam sebelum bicara.",
        "Artinya: Surga itu berada di bawah telapak kaki ibu.",
        "Artinya: Ridha Allah terletak di dalam ridha orang tua.",
        "Artinya: Tidak akan masuk surga pemutus tali persaudaraan.",
        "Artinya: Siapa menutupi aib seorang muslim maka Allah akan menutupi aibnya pada hari kiamat.",
        "Artinya: Tangan di atas lebih baik daripada tangan di bawah.",
        "Artinya: Tidak masuk surga orang yang tetanggannya tidak merasa aman dari gangguannya.",
        "Artinya: Orang beriman tidak akan tersengat dua kali di lubang yang sama."
    )

    val listDataHadistMuasyaraat: ArrayList<ListModelHadistMuasyaraat>
        get() {
            val list = arrayListOf<ListModelHadistMuasyaraat>()
            for (position in ArabicHadistMuasyaraat .indices) {
                val listdaftarhadistMuasyaraat= ListModelHadistMuasyaraat()
                listdaftarhadistMuasyaraat .arabicHadistMuasyaraat = ArabicHadistMuasyaraat[position]
                listdaftarhadistMuasyaraat .latinHadistMuasyaraat = LatinHadistMuasyaraat[position]
                listdaftarhadistMuasyaraat .artiHadistMuasyaraat= ArtiHadistMuasyaraat[position]
                list.add(  listdaftarhadistMuasyaraat  )
            }
            return list
        }
}