package Zestaw7;

public record Wektor3D(double sx, double sy, double sz) implements Comparable<Wektor3D> {
    public Wektor3D(Punkt3D p3d1, Punkt3D p3d2){
        double diffX = p3d2.x() - p3d1.x();
        double diffY = p3d2.y() - p3d1.y();
        double diffZ = p3d2.z() - p3d1.z();
        this(diffX, diffY, diffZ);
    }
    public Wektor3D(double sx, double sy, double sz){
        this.sx = sx;
        this.sy = sy;
        this.sz = sz;
    }
    
    public double modul(){
        double sumaKwadratow = Math.pow(sx, 2) + Math.pow(sy, 2) + Math.pow(sz, 2);
        return Math.sqrt(sumaKwadratow);
    }

    private double iloczynSkalarny(Wektor3D wektor){
        return this.sx * wektor.sx() + this.sy * wektor.sy() + this.sz * wektor.sz();
    }

    @Override
    public int compareTo(Wektor3D wektor){
        double modulThis = this.modul();
        double modulOther = wektor.modul();
        return Double.compare(modulThis, modulOther);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Wektor3D)) return false;
        Wektor3D inny = (Wektor3D) obj;
        double iloczyn = iloczynSkalarny(inny);
        if (iloczyn == 0) return true;
        return false;
    }
}
