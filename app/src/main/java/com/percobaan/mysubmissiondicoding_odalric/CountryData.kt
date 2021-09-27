package com.percobaan.mysubmissiondicoding_odalric

import android.content.Intent

object CountryData {
    internal val countryNames = arrayOf("Indonesia",
        "Singapore",
        "Malaysia",
        "Brunei Darussalam",
        "Cambodia",
        "Laos",
        "Myanmar",
        "Philippines",
        "Thailand",
        "Vietnam")

    internal val countryDetails = arrayOf("Indonesia menganut sistem pemerintahan Republik yang dipimpin oleh Presiden sebagai kepala negara sekaligus kepala pemerintahan. Peringatan kemerdekaan Indonesia dirayakan setiap tanggal 17 Agustus, dan mata uang resmi yang digunakan adalah Rupiah.",
        "Meski Singapura menganut sistem pemerintahan berupa Republik, namun otoritas pemerintahan dan kepemimpinan dilakukan oleh seorang Perdana Menteri. Singapura memiliki semboyan negara 'Majulah Singapura' dengan perayaan kemerdekaan pada 9 Agustus. Sementara itu, mata yang digunakan adalah Dollar Singapura.",
        "Malaysia adalah negara yang menganut sistem pemerintahan Federal Parlementer yang terdiri dari tiga belas negara bagian dan tiga wilayah federal. Pemerintahan negara Malaysia dikepalai oleh seorang Perdana Menteri (Muhyiddin Yassin) dengan Raja atau Sultan yang memerintah di setiap negara bagian. Bahasa resmi yang digunakan warga Malaysia adalah Melayu sementara mata uang yang digunakan adalah Ringgit.",
        "Brunei adalah sistem Monarki Absolut dengan kepala pemerintahan dipegang oleh Sultan. Brunei Darussalam menerapkan bahasa Melayu sebagai bahasa resmi atau nasional dengan Dolar Brunei sebagai mata uang sah. Hari kemerdekaan Brunei jatuh pada tanggal 23 Februari.",
        "Kamboja yang merupakan negara dengan sistem pemerintahan Monarki Konstitusional. Penduduk Kamboja mayoritas menganut agama Buddha dan menerapkan bahasa Khmer sebagai bahasa resmi.",
        "Laos satu-satunya negara ASEAN yang terkurung daratan.Pada masa lampau Laos dijuluki Lan Xang atau Negeri Seribu Gajah. Bahasa resmi yang digunakan oleh masyarakat Laos adalah Lao.",
        "Myanmar atau yang dulu disebut dengan Burma bergabung sebagai anggota ASEAN tahun 1997. Pemerintahan yang dijalankan oleh Junta Militer dengan sistem pemerintahan Republik Konstitusional.Bahasa resmi yang digunakan adalah Burma dan mata uang resmi adalah Kyat.",
        "Sistem pemerintahan Filipina yang dijalankan negara ini adalah Republik.Filipina menggunakan bahasa Filipina dan Inggris sebagai bahasa resmi.Mata uang resmi yang digunakan adalah Peso.",
        "Dalam bahasa asli Thailand disebut sebagai Mueang Thai (baca: Meng-Thai) yang berarti Negara Thai. Sebagai salah satu pendiri ASEAN Thailand menganut sistem pemerintahan Monarki Konstitusional.Mata uang resmi yang digunakan adalah Baht.",
        "Bernama asli Republik Sosialis Vietnam dengan Kepala Negara dan Kepala Pemerintahan atau Perdana Menteri. Bahasa resmi yang digunakan adalah bahasa Vietnam. Mata uang yang digunakan adalah Dong.")

    internal val countryImages = intArrayOf(R.drawable.indonesia,
        R.drawable.singapore,
        R.drawable.malaysia,
        R.drawable.brunei,
        R.drawable.cambodia,
        R.drawable.laos,
        R.drawable.myanmar,
        R.drawable.philippines,
        R.drawable.thailand,
        R.drawable.vietnam_flag)

    val listData: ArrayList<Country>
        get() {
            val list = arrayListOf<Country>()
            for (position in countryNames.indices) {
                val country = Country()
                country.name = countryNames[position]
                country.detail = countryDetails[position]
                country.photo = countryImages[position]
                list.add(country)
            }
            return list
        }
}