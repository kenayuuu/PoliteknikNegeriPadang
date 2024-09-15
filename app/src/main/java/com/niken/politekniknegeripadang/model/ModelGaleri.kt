package com.niken.politekniknegeripadang.model

import com.niken.politekniknegeripadang.R

data class ModelGaleri(
    val image : Int
)
object Mocklist{
    fun getModel() : List<ModelGaleri> {
        val itemModel1 = ModelGaleri(
            R.drawable.kopi
        )
        val itemModel2 = ModelGaleri(
            R.drawable.logo
        )

        val itemModel3 = ModelGaleri(
            R.drawable.logo_tekinfo
        )

        val itemModel4 = ModelGaleri(
            R.drawable.neteupeulikseu
        )

        val itemModel5 = ModelGaleri(
            R.drawable.white_app_icon
        )

        val itemModel6 = ModelGaleri(
            R.drawable.logo_pnp
        )
        val itemList: ArrayList<ModelGaleri> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList
    }
}