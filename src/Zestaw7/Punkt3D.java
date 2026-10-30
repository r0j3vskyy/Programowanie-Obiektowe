package Zestaw7;

import java.lang.Math;

public record Punkt3D(double x, double y, double z) implements Comparable<Punkt3D> {
    public double odlegloscDo(Punkt3D punkt){
        double dx = punkt.x() - this.x();
        double dy = punkt.y() - this.y();
        double dz = punkt.z() - this.z();

        double sumaKwadratow = Math.pow(dx, 2) + Math.pow(dy, 2) + Math.pow(dz, 2);

        return Math.sqrt(sumaKwadratow);
    }

    private double kwadratOdlegloscOdPoczatku(){
        return Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
    }
    private double sumaWspolrzednych(){
        return x + y + z;
    }

    @Override
    public int compareTo(Punkt3D punkt){
        double taKwadratOdleglosc = this.kwadratOdlegloscOdPoczatku();
        double innaKwadratOdleglosc = punkt.kwadratOdlegloscOdPoczatku();

        return Double.compare(taKwadratOdleglosc, innaKwadratOdleglosc);
    }
    @Override
    public String toString(){
        return String.format("Punkty: [%.2f, %.2f, %.2f]", x(), y(), z());
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Punkt3D)) return false;
        Punkt3D inny = (Punkt3D) obj;
        return Double.compare(this.sumaWspolrzednych(), inny.sumaWspolrzednych()) == 0;
    }
}
