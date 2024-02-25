package com.yandexpracticum.example_gridlayoutmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val news = listOf(
            News("В Хомяковилле запущена новая станция метро", "Сегодня мэр Хомяковилла торжественно открыл новую станцию метро, соединяющую завод ХомяАгроИндастри и жилой сектор ХомиТаун."),
            News("Хомяки вышли на ежегодный марш в поддержку трудящихся","Ежегодно 1 мая в Хомякостане празднуют день труда и вкусняшек. В этом году празднование прошло на Площади независимости от колёс"),
            News("В Хомёбино ночью была драка с участием местных банд", "В ночь с 21 на 22 февраля в пригородном районе Хомёбино прошла драка между уличными бандами домашних и диких хомяков. Пострадавших нет! Все подружились!"),
            News("Учёные лаборатории по изучению людей сделали открытие.","В среду директор лаборатории Хомишвейна по изучению поведения людей объявил о новом открытии в процессах мышления людей. Учёным пока неизвестно, как это применить.")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = GridLayoutManager(this, /*Количество столбцов*/ 2) //ориентация по умолчанию — вертикальная
        recyclerView.adapter = NewsAdapter(news+news+news)
    }
}