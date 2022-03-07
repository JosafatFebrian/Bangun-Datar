class Segitiga (Alas: Int, Tinggi: Int) : BangunSegitiga (Alas, Tinggi) {
    override fun hitungLuas() {
        println("Luas segitiga ${this.Alas}x${this.Tinggi} : 2 adalah ${this.Alas * this.Tinggi/2}")
    }
}