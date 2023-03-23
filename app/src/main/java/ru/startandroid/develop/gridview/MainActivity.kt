package ru.startandroid.develop.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView

class MainActivity : AppCompatActivity() {

    val data = arrayListOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" )

    var gvMain: GridView? = null
    var adapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = ArrayAdapter<String>(this, R.layout.item, R.id.tvText, data)
        gvMain = findViewById(R.id.gvMain)
        gvMain?.adapter = adapter
        adjustGridView()
    }

    fun adjustGridView() {
        gvMain?.numColumns = GridView.AUTO_FIT
        gvMain?.columnWidth = 80
        gvMain?.verticalSpacing = 5
        gvMain?.horizontalSpacing = 5
        gvMain?.stretchMode = GridView.STRETCH_SPACING
    }
}