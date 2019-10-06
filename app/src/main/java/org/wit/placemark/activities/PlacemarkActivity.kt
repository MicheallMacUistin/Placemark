package org.wit.placemark.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_placemark.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.placemark.R
import org.wit.placemark.main.MainApp
import org.wit.placemark.models.PlacemarkModel

class PlacemarkActivity : AppCompatActivity(), AnkoLogger {

    var placemark = PlacemarkModel()
    var app : MainApp? = null
    //val placemarks = ArrayList<PlacemarkModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placemark)
        info("Placemark Activity started..")

        btnAdd.setOnClickListener() {
            placemark.title = placemarkTitle.text.toString()
            placemark.description = description.text.toString()

            //val placemarkTitle = placemarkTitle.text.toString()
            if (placemark.title.isNotEmpty()) {
                app!!("add Button Pressed: ${placemark}")
                //placemarks.add(placemark)
                //placemarks.add(placemark.copy())
                info("add Button Pressed: ${placemark}")
                for(i in placemarks.indices){
                    info("Placemark[$i]:${this.placemarks[i]}")
                }
            } else {
                toast("Please Enter a title")
            }
        }
    }}
