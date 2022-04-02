package com.getsucode.mariberdoa.Repository

import com.getsucode.mariberdoa.Model.ListQuotesMuslimModel
import com.getsucode.mariberdoa.R

object ItemQuotesMuslim {

    private val daftarQoutesImage = arrayOf(

        R.drawable.q10,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img6,
        R.drawable.img7,
        R.drawable.img8,
        R.drawable.q2,
        R.drawable.q3,
        R.drawable.q4,
        R.drawable.q5,
        R.drawable.q6,
        R.drawable.q7,
        R.drawable.q8,
        R.drawable.q9,
        R.drawable.q1

    )

    val listDataQuotesMuslim: ArrayList<ListQuotesMuslimModel>
        get() {
            val list = arrayListOf<ListQuotesMuslimModel>()
            for (position in daftarQoutesImage.indices) {
                val listQuotesMuslim = ListQuotesMuslimModel()
                listQuotesMuslim.imageQuotesMuslim = daftarQoutesImage[position]
                list.add( listQuotesMuslim )
            }
            return list
        }
}