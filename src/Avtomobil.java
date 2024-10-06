public class Avtomobil {
    public int V;
    public double percent;
    public double ckokotlit;

    public int delay = 0;
    public Avtomobil(int V, double percent, double ckokotlit) {
        if (ckokotlit > V - (V * (percent/100))) {
            //System.out.println("Тип не умеет считать или не знает размер своего бака");
        } else {
            this.V = V;
            this.percent = percent;
            this.ckokotlit = ckokotlit;
            //System.out.println(V + " " + percent + " " + ckokotlit);
        }
    }

    public Avtomobil() {}

    public Avtomobil Avtomobilcreator(int V, double percent, double ckokotlit){
        Avtomobil res = new Avtomobil(V, percent, ckokotlit);
        return res;
    }

}
