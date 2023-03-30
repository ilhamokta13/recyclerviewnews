package com.example.recyclerviewnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewnews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ListNewsData = arrayListOf(
            ListNews("Indonesia Batal Tuan Rumah Pildun", 29, "olahraga",R.drawable.logo_pildun),
            ListNews("Libur bersama idul fitri dimajukan ", 29, "dakwah", R.drawable.libur_idul_fitri),
            ListNews("Harga Emas Anjlok", 30, "bisnis", R.drawable.emas),
            ListNews("Peluncuran Lenovo Yoga 9i dan 6", 29, "teknologi", R.drawable.laptop),
            ListNews("UB dan UGM favorit di SNBP 2023", 29, "Pendidikan", R.drawable.ub ),
            ListNews("Polinema peringkat 13 besar nasional pimnas", 1, "pendidikan", R.drawable.polinema),
            ListNews("20 prodi polinema akreditasi internasional", 5, "pendidikan", R.drawable.polinema),
            ListNews("frontage aloha sudah jadi", 7, "pembangunan", R.drawable.aloha),
            ListNews("TBC pada anak", 12, "kesehatan", R.drawable.tbc ),
            ListNews("Jangan campur adukkan politik dengan olahraga", 28, "olahraga", R.drawable.bola)

        )

        //panggil class adapter lalu isi data berupa array list

        val adapternews = NewsAdapter(ListNewsData)

        //mengatur tata letak dari recycler view
        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.rvNews.layoutManager = lm
        binding.rvNews.adapter = adapternews
    }


}