package com.example.mobileappspromo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val promoList = listOf<Promo>(
            Promo(
                R.drawable.promo1,
                namePromo = "Diskon hingga 15% dengan Kartu Kredit dan Kartu Debit BNI",
                descPromo = "Syarat dan ketentuan\n" +
                        "Diskon 15% dengan maksimum Rp150.000 berlaku untuk Kartu Kredit BNI Platinum, Precious, Signature, World, Ultimate, dan Infinite kecuali Kartu Kredit BNI Silver, Gold, Titanium, dan Corporate.\n" +
                        "Diskon 10% dengan maksimum diskon Rp100.000 berlaku untuk seluruh jenis Kartu Debit BNI.\n" +
                        "Promo berlaku dengan minimum transaksi Rp400.000.\n" +
                        "Promo berlaku setiap hari kecuali Hari Natal.\n" +
                        "Promo berlaku untuk seluruh whole cake round 20 cm ke atas kecuali Lapis Legit.\n" +
                        "Info lebih lanjut hubungi BNI Call 1500046"
            ),
            Promo(
                R.drawable.promo2,
                namePromo = "Mau Belanja Apapun Lebih Mudah\n",
                descPromo = "Syarat dan ketentuan\n" +
                        "Gunakan selalu kartu Debit BNI untuk segala kebutuhan anda, dan nikmati berbagai penawaran menariknya\n" +
                        "\n" +
                        "PROMO NASIONAL\n" +
                        "\n" +
                        "Supermarket\n" +
                        "Restaurant & Eating Place\n" +
                        "Belanja Online\n" +
                        "Travel (Flight, Hotel & Train)\n" +
                        "Fashion\n" +
                        "Others"
            ),
            Promo(
                R.drawable.promo3,
                namePromo = "Hemat hingga 50% dengan Kartu Kredit BNI",
                descPromo = "Syarat dan ketentuan\n" +
                        "Hemat hingga 50% dengan BNI Rewards Point tanpa minimum transaksi dan maksimum transaksi Rp 1 juta.\n" +
                        "Promo berlaku setiap hari termasuk hari libur nasional.\n" +
                        "Promo berlaku untuk seluruh jenis Kartu Kredit BNI kecuali Kartu Kredit BNI Co-brand Garuda dan Corporate.\n" +
                        "Info lebih lanjut hubungi BNI Call 1500046"
            ),
            Promo(
                R.drawable.promo4,
                namePromo = "Dapatkan Diskon 20% dengan Kartu Debit BNI Gold, Platinum & Emerald",
                descPromo = "Syarat dan ketentuan\n" +
                        "Kartu Kredit BNI (berlaku hingga 30 Juni 2024)\n" +
                        "\n" +
                        "Diskon 30% hingga Rp150.000 dengan minimum transaksi Rp300.000 (sebelum pajak & service) berlaku setiap hari Senin-Jumat (weekdays).\n" +
                        "Promo berlaku untuk dine-in dan takeaway.\n" +
                        "Promo tidak berlaku split bill atau penggabungan struk.\n" +
                        "Hemat hingga 50% dengan BNI Rewards Point tanpa minimum transaksi dan maksimum transaksi Rp1.000.000 berlaku setiap hari.\n" +
                        "Promo diskon 30% berlaku untuk Kartu Kredit BNI Platinum, Precious, Signature, World, Ultimate dan Infinite kecualiKartu Kredit BNI Silver, Gold, Titanium, dan Corporate.\n" +
                        "Promo hemat hingga 50% BNI Rewards Point berlaku untuk seluruh jenis Kartu Kredit BNI kecualiKartu Kredit BNI Co-brand Garuda dan Corporate."
            ),
            Promo(
                R.drawable.promo5,
                namePromo = "Dapatkan Penawaran Menarik dengan Kartu Kredit BNI",
                descPromo = "Syarat dan ketentuan\n" +
                        "Nasional\n" +
                        "Regional\n" +
                        "Info lebih lanjut hubungi BNI Call 1500046"
            ),
            Promo(
                R.drawable.promo6,
                namePromo = "Promo Travel (Airlines & Hotel)\n",
                descPromo = "Syarat dan ketentuan\n" +
                        "Online Travel Agent/Flights\n" +
                        "\n" +
                        "1. Traveloka\n" +
                        "\n" +
                        "Berlaku di Traveloka app versi minimum 3.20.0 (Android/iOS).\n" +
                        "Berlaku untuk Kartu Debit BNI Gold dan Platinum."
            ),
            Promo(
                R.drawable.promo7,
                namePromo = "Join keanggotaan Supporter WWF-Indonesia (Members of Mona) Kartu Kredit BNI-WWF",
                descPromo = "Syarat dan ketentuan\n" +
                        "Sebagai nasabah, Anda bisa menjadi bagian dari #BeTheChangeBeAMoNa dengan bergabung bersama MoNa (Members of Nature). Dengan berkontribusi mulai dari Rp50.000/bulan, Anda sudah bisa menjadi bagian dari WWF-Indonesia sebagai garda depan perjuangan konservasi keanekaragaman hayati Indonesia.\n" +
                        "\n" +
                        "Mekanisme Program:\n" +
                        "\n" +
                        "Dapatkan Tas menarik dari kolaborasi eksklusif IKYK dan WWF Indonesia dengan cara join keanggotaan Supporter WWF-Indonesia untuk 1 (satu) tahun ke depan dengan kontribusi minimum transaksi sebesar Rp600.000 per tahun.\n" +
                        "Transaksi dilakukan wajib dengan menggunakan kartu kredit BNI-WWF Varian Gold dan Platinum melalui website Registrasi MoNa di https://bit.ly/payment-new-MoNa!\n" +
                        "Kuota terbatas hanya sebanyak 20 orang pertama yang mendaftar."
            ),
            Promo(
                R.drawable.promo8,
                namePromo = "Dapatkan Hemat hingga 20% dengan Kartu BNI dan QRIS BNI Mobile Banking",
                descPromo = "A. Promo QRIS: Potongan Langsung Rp100.000\n" +
                        "\n" +
                        "Minimum transaksi Rp1.000.000.\n" +
                        "Berlaku untuk 1x transaksi/user/hari.\n" +
                        "Kuota 1.000 transaksi pertama/bulan.\n" +
                        "Berlaku khusus pembayaran dengan QRIS BNI Mobile Banking di QRIS BNI.\n" +
                        "Tidak berlaku split bill dan tidak berlaku kelipatan.\n" +
                        "Berlaku setiap hari SeninJumat selama priode program."
            ),
            Promo(
                R.drawable.promo9,
                namePromo = "Dapatkan Cicilan 0% hingga 24 bulan dengan Kartu Kredit BNI",
                descPromo = "Syarat dan ketentuan\n" +
                        "Promo cicilan 0% dilakukan langsung melalui EDC BNI yang ada di seluruh store Atria Home Furnishing & Mattress.\n" +
                        "Promo cicilan 0% hingga tenor 24 bulan dengan minimum transaksi sebagai berikut:\n" +
                        "Tenor 3 bulan dengan minimum transaksi Rp1.000.000.\n" +
                        "Tenor 6 bulan dengan minimum transaksi Rp3.000.000.\n" +
                        "Tenor 12 bulan dengan minimum transaksi Rp6.000.000.\n" +
                        "Tenor 18 bulan dengan minimum transaksi Rp8.000.000.\n" +
                        "Tenor 24 bulan dengan minimum transaksi Rp10.000.000.\n" +
                        "Promo cicilan 0% berlaku untuk semua Kartu Kredit BNI kecuali Kartu Kredit Corporate Card.\n" +
                        "Promo cicilan 0% dapat digabungkan dengan promo lainnya yang berlaku di Atria Home Furnishing & Mattress."
            ),
            Promo(
                R.drawable.promo10,
                namePromo = "Dapatkan Diskon hingga Rp1.000.000 dan Cicilan 0% s/d 24 bulan dengan Kartu Kredit BNI",
                descPromo = "Diskon berupa potongan langsung dan mengurangi harga pada saat transaksi online.\n" +
                        "Promo Diskon wajib digabungkan dengan cicilan 0% tenor hingga 24 bulan.\n" +
                        "Tenor 3, 6 dan 12 bulan minimum transaksi Rp1.000.000.\n" +
                        "Tenor 18 dan 24 bulan minimum transkasi Rp10.000.000.\n" +
                        "Diskon dan installment 0% dilakukan secara langsung pada saat kastemer melakukan pemesanan di website bit.ly/EPPBANKBNI\n" +
                        "Diskon berlaku untuk 50 transaksi pertama selama periode promo. Jika harga tidak berkurang pada saat transaksi, maka kuota diskon sudah habis.\n" +
                        "Promo Diskon ini berlaku khusus Karyawan BNI dengan daftar menggunakan email perusahaan (bni.co.id).\n" +
                        "Tidak berlaku kelipatan dan split transaksi.\n" +
                        "Berlaku untuk semua jenis Kartu Kredit BNI kecuali Corporate Card."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_promo)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = PromoAdapter(this, promoList){
            val intent = Intent (this, DetailPromoActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}