package com.omersefacarikci.kotlindersleri.nesnetabanliprogramlama

class Odev2 {

    // 1. Dereceyi Fahrenheit'a dönüştürüp geri döndüren
    fun donusturme(celsius: Double): Double {
        val fahrenheit = celsius * 1.8 + 32
        println("$celsius derece = $fahrenheit fahrenheit")
        return fahrenheit
    }

    // 2. Dikdörtgenin çevresini hesaplayıp sadece ekrana yazdıran
    fun dik(kisaKenar: Double, uzunKenar: Double) {
        val cevre = 2 * (kisaKenar + uzunKenar)
        println("Dikdörtgenin çevresi: $cevre")
    }

    // 3. Sayının faktöriyelini hesaplayıp geri döndüren
    fun faktor(sayi: Int): Int {
        var sonuc = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        println("$sayi sayısının faktöriyeli: $sonuc")
        return sonuc
    }

    // 4. Kelime içinde kaç adet 'a' harfi olduğunu geri döndüren
    fun aadedi(kelime: String): Int {
        val adet = kelime.count { it == 'a' || it == 'A' }
        println("$kelime kelimesinde $adet adet 'a' harfi var.")
        return adet
    }
    // 5. Kenar sayısına göre iç açılar toplamını hesaplayan
    fun icAciToplami(kenarSayisi: Int): Int {
        val toplam = (kenarSayisi - 2) * 180
        println("$kenarSayisi kenarlı çokgenin iç açılar toplamı: $toplam")
        return toplam
    }

    // 6. Gün sayısına göre maaş hesaplayan
    fun maasHesapla(gunSayisi: Int): Int {
        val toplamSaat = gunSayisi * 8
        var maas = 0
        if (toplamSaat <= 160) {
            maas = toplamSaat * 10
        } else {
            val mesaiSaat = toplamSaat - 160
            maas = (160 * 10) + (mesaiSaat * 20)
        }
        println("$gunSayisi gün çalışınca maaş: $maas ")
        return maas
    }

    // 7. Kota miktarına göre internet ücreti hesaplayan
    fun kotaUcretiHesapla(kota: Int): Int {
        var ucret = 100
        if (kota > 50) {
            val asimMiktari = kota - 50
            ucret += asimMiktari * 4
        }
        println("$kota GB kullanıma ücret: $ucret ")
        return ucret
    }
}
