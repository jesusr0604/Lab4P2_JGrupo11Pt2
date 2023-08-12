package lab4p2_grupo11;


public class Pokemon {
    public String Especie;
    public int  Lvl;
    public int PuntosXP;
    public int HP;
    public int ATK;
    public int DEF;
    public int SP;
    public String SPE;
    public Movimiento[] numeros = new Movimiento[3];

    public Pokemon(String Especie, int Lvl, int PuntosXP, int HP, int ATK, int DEF, int SP, String SPE) {
        this.Especie = Especie;
        this.Lvl = Lvl;
        this.PuntosXP = PuntosXP;
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
        this.SP = SP;
        this.SPE = SPE;
    }

    public Pokemon() {
    }
    

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public int getLvl() {
        return Lvl;
    }

    public void setLvl(int Lvl) {
        this.Lvl = Lvl;
    }

    public int getPuntosXP() {
        return PuntosXP;
    }

    public void setPuntosXP(int PuntosXP) {
        this.PuntosXP = PuntosXP;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public int getSP() {
        return SP;
    }

    public void setSP(int SP) {
        this.SP = SP;
    }

    public String getSPE() {
        return SPE;
    }

    public void setSPE(String SPE) {
        this.SPE = SPE;
    }

    public Movimiento[] getNumeros() {
        return numeros;
    }

    public void setNumeros(Movimiento[] numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "Especie=" + Especie + ", Lvl=" + Lvl + ", PuntosXP=" + PuntosXP + ", HP=" + HP + ", ATK=" + ATK + ", DEF=" + DEF + ", SP=" + SP + ", SPE=" + SPE + ", numeros=" + numeros + '}';
    }
    
    
    
    
}
