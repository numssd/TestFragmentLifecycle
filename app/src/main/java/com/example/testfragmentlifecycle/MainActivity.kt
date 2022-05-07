package com.example.testfragmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

/*
1) Фрагмент по сути подобие Activity,
которое мы можем подключать в разные части приложения,
но фрагменты – это не замена активности, существуют только вместе с Activity,
прикрепляются к ней, объявлять их в android manifest не требуется.
Фрагменты являются более облегченными.
Жизненный цикл фрагмента является более сложным, чем жизненный цикл activity,
потому что он имеет больше состояний. Думаю это сделано для оптимизации потребление памяти.
Activity затрагивает жизненный цикл фрагмента, потому что фрагменты прикрепляются к ней.

2) В зависимости от состояния выстраивается приоритет,
что помогает распределять память и ресурсы для правильной работы приложений.
Нам часто необходимо знать в каком состоянии находится наше приложение,
например когда пользователь использует наше приложение и вдруг получает входящий вызов
то приложение временно пропадает из вида и перекрывается новым экраном с входящим вызовом,
когда это происходит нам необходимо остановить все ненужные процессы в приложении,
вот тут нам и приходит на помощь жизненный цикл Activity. С помощью функций жизненного цикла
мы сможем совершать какие то действия в приложении в нужный момент.

3) Сбербанк, YouTube, Aliexpress

 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(Fragment1())

        buttonFragment1.setOnClickListener {
            loadFragment(Fragment1())
        }

        buttonFragment2.setOnClickListener {
            loadFragment(Fragment2())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container1, fragment)
        transaction.commit()
    }
}