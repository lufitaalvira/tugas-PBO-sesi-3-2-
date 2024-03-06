public class Lingkaran {
    public static class lingkaran {
        protected double l;
        protected double luas;
        protected double keliling;

        public lingkaran(double l, String name) {
            this.l = l;
            hitungLuas();
            hitungKeliling();
        }
        
        public void hitungLuas() {
            luas = 3.14 * l * l;
        }

        public void hitungKeliling() {
            keliling = 2 * 3.14 * l;
        }
    }
}
