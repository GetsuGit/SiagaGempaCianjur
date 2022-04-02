package com.getsucode.mariberdoa.Repository

import com.getsucode.mariberdoa.Model.ListModel
import com.getsucode.mariberdoa.Model.ListModelHadistImaniat

object ItemHadistImaniat {

    private val ArabicHadist = arrayOf(
        "الَدِّيْنُ يُسرٌُ",
        "نمَا الأعْمَالُ باِلنِّيَةِإِ",
        "لاَ تَقُومُ السَّاعَةُ عَلَى أَحَدٍ يَقُولُ : اَللهُ اَللهُ",
        "الَدُّعَاءُ مُخُّ اْلِعبَادَةِ",
        "مَنْ تَشَبَّهَ بِقَوْمٍ فَهُوَ مِنْهُمَْ",
        "مَنْ بَنىَ لِلّهِ مَسْجِدًا بَنىَ اللهُ لَهُ بَيْةً فِي الجَنَّةِ",
    )

    private val LatinHadist = arrayOf(
        "Ad diinu yusrun (HR Bukhari)",
        "Innamal a’maalu bin niyyaat (HR Bukhari)",
        "Laa taquumus saa’atu ‘alaa ahadin yaquulu Allah… Allah… (HR Muslim) ",
        "Ad du’aau mukhkhul ibaadah (HR Tirmizi) ",
        "Ittaqillaha haitsu maa kunta (HR Tirmizi) ",
        "Ad daallu ‘alal khairi kafaa’ilihi (HR Tirmizi) ",
        "Man tashabbaha bi qaumin fa huwa min hum (HR Abu Daud) ",
        "Man banaa lillahi masjidan banallahu lahuu baytan fil jannah(HR Muslim)"
    )

    private val ArtiHadist = arrayOf(
        "Artinya: Agama itu mudah",
        "Artinya: Setiap amal sesuai dengan niatnya",
        "Artinya: Tidak akan datang kiamat selama masih ada yang mengucap Allah… Allah…",
        "Artinya: Do’a adalah inti ibadah",
        "Artinya: Takutlah kepada Allah dimana saja kamu berada",
        "Artinya: Orang yang mengajak kebaikan mendapat pahala yang sama dengan orang yang diajaknya",
        "Artinya: Barangsiapa menyerupai suatu kaum maka ia akan digolongkan sebagai kaum tersebut",
        "Artinya: Barangsiapa membangun masjid karena Allah maka Allah akan bangunkan rumah baginya di dalam surga"
    )

    val listDataHadistImaniat: ArrayList<ListModelHadistImaniat>
        get() {
            val list = arrayListOf<ListModelHadistImaniat>()
            for (position in ArabicHadist .indices) {
                val listdaftarhadist = ListModelHadistImaniat()
                listdaftarhadist.ArabicHadistImaniat = ArabicHadist[position]
                listdaftarhadist.LatinHadistImaniat = LatinHadist[position]
                listdaftarhadist.ArtiHadistImaniat = ArtiHadist[position]
                list.add( listdaftarhadist )
            }
            return list
        }
}