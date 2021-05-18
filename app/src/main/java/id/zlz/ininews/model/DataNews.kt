package id.zlz.ininews.model

import android.os.Parcel
import android.os.Parcelable

data class DataNews(
    var title: String? = "",
    var author: String? = "",
    var date: String? = "",
    var desc: String? = "",
    var content: String? = "",
    var imagenews: String? = ""
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(author)
        parcel.writeString(date)
        parcel.writeString(desc)
        parcel.writeString(content)
        parcel.writeString(imagenews)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataNews> {
        override fun createFromParcel(parcel: Parcel): DataNews {
            return DataNews(parcel)
        }

        override fun newArray(size: Int): Array<DataNews?> {
            return arrayOfNulls(size)
        }
    }
}

object IndoNews {


    private val title = arrayOf(
        "Teleskop James Webb, Teliti Galaksi Miliaran Tahun Lalu - Republika Online",
        "anda Diabetes yang Muncul di Bagian Jari Kaki : Dipicu oleh Naiknya Kadar Gula Darah - Tribun Jogja",
        "Ikut Aksi Bela Palestina, Supermodel Bella Hadid Dikecam Israel - Kompas.com - KOMPAS.com",
        "Bahaya, Meniup Makanan atau Minuman Panas Picu Diare hingga Sakit Jantung - Bisnis.com",
        "Krisdayanti Tahu Jenis Kelamin Calon Bayi Aurel Hermansyah: Mimi Mau Temani ke Dokter ya - Pikiran Rakyat Tasikmalaya - Pikiran Rakyat",
        "Naik Rp 4.000 Usai Libur Lebaran, Ini Rincian Harga Emas Antam Terbaru - Kompas.com - Kompas.com",
        "Israel: Menara Perkantoran yang di Bom Bukan Pusat Media Internasional tapi Markas Besar Hamas - Kompas.com - KOMPAS.com",
        "Vivo Pastikan Rilis Smartphone Vivo V21 5G di Indonesia - Liputan6.com",
        "Hasil, Klasemen, dan Top Skor Liga Italia: 1 Laga Tersisa dan AC Milan yang Menyusahkan Diri Sendiri - Bola.net",
        "Tujuh Mantan Pimpinan KPK Akan Ambil Sikap soal TWK - CNN Indonesia",
        "Elon Musk Bikin Gara-gara, Harga Bitcoin Jadi Anjlok ke Rp 624 Juta - detikFinance"
    )

    private val author = arrayOf(
        "Dwi Murdaningsih",
        "Mona Kriesdinar",
        "Danur Lambang Pristiandaru",
        "Mia Chitra Dinisari",
        "Silmi Fadillah Meitasnia",
        "Erlangga Djumena",
        "ernadette Aderi Puspaningrum",
        "Agustin Setyo Wardani",
        "null",
        "null",
        "Aulia Damayanti"
    )

    private val publisheddate = arrayOf(
        "2021-05-17",
        "2021-05-17",
        "2021-05-17",
        "2021-05-17",
        "2021-05-17",
        "2021-05-17",
        "2021-05-17",
        "2021-05-17",
        "2021-05-17",
        "2021-05-17",
        "2021-05-17"
    )

    private val desc = arrayOf(
        "Teleskop James Webb akan menggantikan teleskop Hubble, beroperasi akhir tahun ini.",
        "Neuropati perifer adalah istilah medis untuk menggambarkan serabut saraf yang rusak akibat kadar gula darah tinggi tersebut.",
        "Israel mengecam supermodel Bella Hadid karena mengikuti aksi bela Palestina di Brooklyn, Amerika Serikat (AS). Halaman all",
        "Kebiasaan meniup makanan atau minuman panad bisa berbahaya pada tubuh karena bisa memicu penyakit mulai dari diare hingga sakit jantung.",
        "Krisdayanti menuturkan perihal jenis kelamin sang bayi yang tengah dikandung Aurel Hermansyah dan ingin mengantar ke dokter",
        "Kenaikan juga diikuti pada harga buyback atau harga yang di dapat jika pemegang emas Antam ingin menjual emas batangan tersebut.",
        "Outlet berita Internasional mengkhawatirkan dunia akan tahu lebih sedikit tentang apa yang terjadi di Gaza karena serangan Sabtu (15/5/2021). Halaman all",
        "Vivo akan merilis smartphone 5G terbaru di Indonesia yakni Vivo V21 5G.",
        "Perebutan dua tiket tersisa ke Liga Champions musim depan semakin panas setelah pekan ke-37 Liga Italia Serie A 2020-2021. AC Milan, Napoli, dan Juventus sama-sama berpeluang lolos melihat bagaimana posisi mereka di klasemen Liga Italia.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
        "Cuitan Elon Musk di Twitter lagi-lagi mempengaruhi harga Bitcoin. Uang kripto terbesar di dunia itu merosot 8% menjadi US$ 44.000 setara Rp 624 juta."
    )

    private val content = arrayOf(
        "Teleskop James Webb akan menggantikan teleskop Hubble, beroperasi akhir tahun ini.\\r\\n REPUBLIKA.CO.ID, JAKARTA -- Teleskop luar angkasa James Webb akan mulai beroperasi akhir 2021. Dengan teleskop ini…",
        "TRIBUNJOGJA.COM - Gejala diabetes tipe 2 pada awalnya sering kali tidak terlihat, tetapi kadar gula darah yang tinggi secara konsisten dapat meningkatkan perubahan yang lebih nyata. Dr Paul Ettlinger…",
        "EL AVIV, KOMPAS.com –Israel mengecam supermodel Bella Hadid karena mengikuti aksi bela Palestina di Brooklyn, Amerika Serikat (AS).\\r\\nKecaman tersebut disampaikan oleh Israel pada Minggu (16/5/2021)",
        "Bisnis.com, JAKARTA - Pernahkah Anda mendengar larangan meniup makanan atau minuman panas dari orang tua? \\r\\nUmumnya, mereka akan mengatakan jika meniup makanan atau minuman panas berlawanan dengan",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
        "JAKARTA, KOMPAS.com - Harga emas batangan bersertifikat PT Aneka Tambang (Persero) Tbk dibanderol Rp 937.000 per gram pada hari ini, Senin (17/5/2021) atau usai masa libur Lebaran.",
        "GAZA, KOMPAS.com - Di tengah protes global, Pasukan Pertahanan Israel (IDF) membela penargetan menara perkantoran Jalur Gaza, yang menampung outlet media internasional.",
        "Liputan6.com, Jakarta -Vivo memastikan akan menghadirkan smartphone seri V terbaru, yakni Vivo V21 5G. Hal ini diinformasikan Vivo melalui video teaser yang diunggah ke akun media sosial Vivo",
        "Bola.net - Perebutan dua tiket tersisa ke Liga Champions musim depan semakin panas setelah pekan ke-37 Liga Italia Serie A 2020-2021. AC Milan, Napoli, dan Juventus sama-sama berpeluang lolos",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
        "Jakarta - Cuitan Elon Musk di Twitter lagi-lagi mempengaruhi harga Bitcoin. Uang kripto terbesar di dunia itu merosot 8% menjadi US\$ 44.000 setara Rp 624 juta."


    )


    private val imagenews =
        arrayOf(
            "https://static.republika.co.id/uploads/images/inpicture_slide/teleskop-james_210517095512-977.jpg",
            "https://cdn-2.tstatic.net/jogja/foto/bank/images/diabetes-tipe-2.jpg",
            "https://asset.kompas.com/crops/ZKEj-nz6g2E33pgHZgyplbnF29w=/0x0:780x390/780x390/data/photo/2016/06/01/0031060bella-hadid780x390.jpg",
            "https://images.bisnis-cdn.com/posts/2021/05/17/1394434/images-2_copy_800x500.jpeg",
            "https://assets.pikiran-rakyat.com/crop/0x0:0x0/750x500/photo/2021/05/17/1221790736.jpg",
            "https://asset.kompas.com/crops/O020JrNW59Igatn8xu99r-6deVI=/0x0:780x520/780x390/filters:watermark(data/photo/2020/03/10/5e6775b1d85b4.png,0,-0,1)/data/photo/2021/03/18/60530748661ef.jpg",
            "https://asset.kompas.com/crops/p2TI2W2A0P7qDcGMvDsAKETwKuY=/0x0:1728x1152/780x390/data/photo/2021/05/16/60a05bee1c869.jpg",
            "https://cdn1-production-images-kly.akamaized.net/4_2bdxh3RfJ-_zqTVAU2uEyurGg=/673x379/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3456515/original/061148200_1621073849-image002.jpg",
            "https://cdns.klimg.com/bola.net/library/upload/21/2021/05/hakan-calhanoglu_ea2a205.jpg",
            "https://telko.id/wp-content/uploads/2019/06/1561727335_Asyik-Kirim-GIF-dari-Google-Images-Gak-Pake-Lama-Lagi.jpg",
            "https://awsimages.detik.net.id/api/wm/2020/01/20/6defeb86-61bc-4881-af5b-905f09ec0cd5_169.jpeg?wid=54&w=650&v=1&t=jpeg"
        )

    val listDataNews: ArrayList<DataNews>
        get() {
            val list = arrayListOf<DataNews>()
            for (position in title.indices) {
                val data = DataNews()
                data.title = title[position]
                data.author = author[position]
                data.date = publisheddate[position]
                data.desc = desc[position]
                data.content = content[position]
                data.imagenews = imagenews[position]
                list.add(data)
            }
            return list
        }


}


