grammar Treci;

@parser::header{
    import java.util.*;
}

@parser::members{
    class Korisnik{
        public String ime;
        public String prezime;
        public String jmbg;
        public double cijena;
        public String boja;
        public int brojKupovina = 1;
        public Korisnik(){}

        public String toString(){
            return "\n Ime: " + this.ime +
                    "\n Prezime: " + this.prezime +
                    "\n JMBG: " + this.jmbg +
                    "\n Cijena: " + this.cijena +
                    "\n Broj kupovina: " + this.brojKupovina +
                    "\n Boja: " + this.boja;
        }
    }
    List<Korisnik> korisnici = new ArrayList<Korisnik>();
}

prog
    @after{
        korisnici.forEach((newKorisnik) -> {
            System.out.println(newKorisnik);
        });
    }
    :
    rows+;

rows
    @init{
        Korisnik newKorisnik = new Korisnik();
    }
    @after{
        boolean nePostoji = true;
        for(Korisnik korisnik : korisnici) {
            if(korisnik.jmbg.equals(newKorisnik.jmbg)){
                System.out.println("postoji");
                korisnik.cijena += newKorisnik.cijena;
                korisnik.brojKupovina += 1;
                nePostoji = false;
                break;
            }
        }
        if(nePostoji){
            System.out.println("ne postoji");
            korisnici.add(newKorisnik);
        }
    }
    :
    T_IME_ILI_PREZIME_ILI_BOJA {
        System.out.println($T_IME_ILI_PREZIME_ILI_BOJA.text);
        newKorisnik.ime = $T_IME_ILI_PREZIME_ILI_BOJA.text;
    }
    HASH{
        System.out.println("Naletio na hash");
    }
    T_IME_ILI_PREZIME_ILI_BOJA{
        System.out.println($T_IME_ILI_PREZIME_ILI_BOJA.text);
        newKorisnik.prezime = $T_IME_ILI_PREZIME_ILI_BOJA.text;
    }
    HASH{
        System.out.println("Naletio na hash");
    }
    T_JMBG{
        System.out.println($T_JMBG.text);
        newKorisnik.jmbg = $T_JMBG.text;
    }
    HASH{
        System.out.println("Naletio na hash");
    }
    T_DOUBLE {
        System.out.println($T_DOUBLE.text);
        newKorisnik.cijena = Double.parseDouble($T_DOUBLE.text);
    }
    HASH{
        System.out.println("Naletio na hash");
    }
    T_IME_ILI_PREZIME_ILI_BOJA{
        System.out.println($T_IME_ILI_PREZIME_ILI_BOJA.text);
        newKorisnik.boja = $T_IME_ILI_PREZIME_ILI_BOJA.text;
    } NL
    rows

;

T_IME_ILI_PREZIME_ILI_BOJA: [a-zA-Z]+;

T_JMBG: [0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9];

T_DOUBLE: [0-9]+'.'[0-9]+;

HASH: '#';

NL: '\n';

WS: [ \t\r] -> skip;