package com.example.powerpump

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [gymweek1.newInstance] factory method to
 * create an instance of this fragment.
 */
class gymweek1 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_gymweek1, container, false)

        view.findViewById<Button>(R.id.btnWeek2gym2).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_gymweek1_to_gymweek2)
        }

        view.findViewById<CheckBox>(R.id.checkBox7).setOnClickListener {
            writeTextToFile("opslag", "1")
         }
        return view
        }
        val path = context.filesDir()
        val letDirectory = File(path, "LET")
        val LetDirectory.mkdirs()
        val file = File(letDirectory, "Records.txt")
        file.appendText("")
        val inputAsString = FileInputStream(file).bufferedReader().use { readLine() }
    }

fun writeTextToFile(filename: String?, data: String) {
    val file = File("checkBox")
    try {
        val stream = FileOutputStream(file)
        stream.write(data.toByteArray())
        stream.close()
    } catch (e: IOException) {
        e.printStackTrace()
    }
}




