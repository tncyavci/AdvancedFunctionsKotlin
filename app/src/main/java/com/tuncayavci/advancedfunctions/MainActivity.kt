package com.tuncayavci.advancedfunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var myInt : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (myInt!=null){
            val num = myInt!! + 1
        }

        myInt?.let {
            val num = it + 1
        }

        val myNum = myInt?.let {
            it + 1
        } ?: 0

        //also
        val tuncay = Person("Tuncay",25)
        val john = Person("John",24)
        val kirk = Person("kirk",17)

        val people = listOf<Person>(tuncay,john,kirk)

        people.filter { it.age > 18 }.also {
            for (person in it){
                println(person.name)
            }
        }

        //apply  objeleri kolay modifiye etmek
        val intent = Intent()
        intent.putExtra("","")
        intent.putExtra("","")
        intent.`package`= " "
        intent.action = ""


        val intentWithApply = Intent().apply {
            putExtra( "","")
            putExtra("","")
            `package` = ""
            action = ""
        }


        //with apply obje referansi ile with argüman olarak
        Person("barley",4).apply {
            var name ="Barley"
        }.also {
            println(it.name)
        }

        val nnewBarley = Person("bar",4).apply {
            var name = "Barley"
        }
        println(nnewBarley.name)


        val anotherBarley = with(Person("barl",4)){
            var name = "Barley"
        }
        // Unit olarak alıyor geriye birşey döndürmüyor
        println(anotherBarley)

        val withBarley = Person("arley",4)

        with(withBarley){
            var name = "Barley"
            var age = 5
        }

        println("last barley :" + withBarley.name)
    }
}

data class Person(val name: String, val age: Int)