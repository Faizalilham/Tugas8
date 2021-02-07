package com.example.tugas8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugas8.adaptor.adaptor
import com.example.tugas8.databinding.ActivityMainBinding
import com.example.tugas8.model.form
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private var backPressedTime : Long = 0
    private var backToast : Toast? = null

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var data = ArrayList<form>()
        data.add(form(R.drawable.pangeran_diponegoro,"Pangeran Diponegoro","Nama asli Pangeran Diponegoro adalah Raden Mas Ontowiryo. Pangeran Diponegoro adalah anak dari Pangeran Adipati Anom (Hamengku Buwono III) dari garwa ampeyan (selir)."
        ))
        data.add(form(R.drawable.kartini,"R.A.Kartini","Raden Adjeng Kartini adalah pahlawan nasional Indonesia.Beliau dikenal sebagai pelopor kkebangkitan perempuan pribumi yang lahir pada tanggal 21 April 1879 dan meninggal di Rembang,pada tanggal 17 September 1904 pada usia yang masih muda yaitu 25 tahun."))
        data.add(form(R.drawable.dewi,"Dewi Sartika","Raden Dewi Sartika adalah tokoh perintis pendidikan untuk kaum wanita. Ia diakui sebagai Pahlawan Nasional oleh Pemerintah Indonesia pada tahun 1966. "))
        data.add(form(R.drawable.pattimura,"Kapitan Pattimura","Kapitan Pattimura yang bernama asli Thomas Matulessy, ini lahir di Negeri Haria, Saparua, Maluku tahun 1783. Perlawanannya terhadap penjajahan Belanda pada tahun 1817 sempat merebut benteng Belanda dan melumpuhkan semua tentara Belanda di benteng tersebut."))
        data.add(form(R.drawable.dien,"Cut Nyak Dien","Cut Nyak Dhien adalah seorang Pahlawan Nasional Indonesia dari Aceh yang berjuang melawan Belanda pada masa Perang Aceh. dilahirkan dari keluarga bangsawan yang taat beragama di Aceh Besar, pada tahun 1848."))
        data.add(form(R.drawable.sutomo,"Dokter Soetomo","Dr. Soetomo atau Soebroto adalah tokoh pendiri Budi Utomo, organisasi pergerakan yang pertama di Indonesia. Soebroto mengganti namanya menjadi Soetomo saat masuk ke sekolah menengah. Pada tahun 1903, Soetomo menempuh pendidikan kedokteran di School tot Opleiding van Inlandsche Artsen, Batavia."))
        data.add(form(R.drawable.kihajar,"KI Hajar Dewantara","Ki Hajar Dewantara lahir dengan nama Raden Mas (R.M.) Suwardi Suryaningrat. Beliau lahir pada Kamis Legi, 2 Mei 1889 di Yogyakarta.Beliau sebagai seorang pendidik dan mendapat julukan sebagai Bapak Pendidik Indonesia."))
        data.add(form(R.drawable.sisimangaraja,"Sisingamangaraja XII","Sisingamangaraja XII adalah seorang raja di negeri Toba, Sumatra Utara, pejuang yang berperang melawan Belanda, kemudian diangkat oleh pemerintah Indonesia sebagai Pahlawan Nasional Indonesia sejak tanggal 9 November 1961. "))
        data.add(form(R.drawable.mohammad_husni_thamrin,"Muhammad Husni Thamrin","Mohammad Husni Thamrin adalah seorang politisi era Hindia Belanda yang kemudian dianugerahi gelar pahlawan nasional Indonesia."))
        data.add(form(R.drawable.soedirman,"Jendral Sudirman","Sudirman (Soedirman) lahir di Purbalingga,pada tanggal 24 Januari 1916.Jenderal Besar TNI Raden Soedirman adalah seorang perwira tinggi Indonesia pada masa Revolusi Nasional Indonesia. Sebagai panglima besar Tentara Nasional Indonesia pertama, ia adalah sosok yang dihormati di Indonesia."))
        data.add(form(R.drawable.tomo,"Bung Tomo","Sutomo lebih dikenal dengan sapaan akrab oleh rakyat sebagai Bung Tomo, adalah pahlawan yang terkenal karena peranannya dalam membangkitkan semangat rakyat untuk melawan kembalinya penjajah Belanda."))

        var adaptor = adaptor(data)
        binding.rcy.adapter = adaptor
        binding.rcy.layoutManager = LinearLayoutManager(this)
    }

    override fun onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()){
            backToast?.cancel()
            super.onBackPressed()
            return
        }
        else{
            backToast = Toast.makeText(baseContext,"Tekan sekali lagi untuk keluar",Toast.LENGTH_SHORT)
            backToast?.show()
        }
        backPressedTime = System.currentTimeMillis()
    }
}