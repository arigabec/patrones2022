package exercises.exercise9;

public class Client {
    public static void main(String[] args){
        Persona p1 = new Persona("1", "Carla", 15);
        Persona p2 = new Persona("2", "Andres", 12);
        Persona p3 = new Persona("3", "Silvana", 19);
        Persona p4 = new Persona("4", "Viviana", 9);
        Persona p5 = new Persona("5", "Valeria", 20);
        Persona p6 = new Persona("6", "Antonio", 53);
        Persona p7 = new Persona("7", "Sergio", 60);
        Persona p8 = new Persona("8", "Mauricio", 7);
        Persona p9 = new Persona("9", "Pamela", 31);
        Persona p10 = new Persona("10", "Maria", 3);
        Persona p11 = new Persona("11", "Carolina", 13);
        Persona p12 = new Persona("12", "Rebeca", 23);
        Persona p13 = new Persona("13", "Ramiro", 28);
        Persona p14 = new Persona("14", "Teresa", 5);
        Persona p15 = new Persona("15", "Carlos", 45);
        Persona p16 = new Persona("16", "Rodrigo", 43);
        Persona p17 = new Persona("17", "Alvaro", 16);
        Persona p18 = new Persona("18", "Walter", 82);
        Persona p19 = new Persona("19", "Angelica", 27);
        Persona p20 = new Persona("20", "Claudia", 32);
        Persona p21 = new Persona("21", "Alberto", 63);
        Persona p22 = new Persona("22", "Rene", 8);
        Persona p23 = new Persona("23", "Jose", 51);
        Persona p24 = new Persona("24", "Ricardo", 59);
        Persona p25 = new Persona("25", "Andrea", 30);
        Persona p26 = new Persona("26", "Waldo", 4);
        Persona p27 = new Persona("27", "Cinthia", 30);
        Persona p28 = new Persona("28", "Martha", 50);
        Persona p29 = new Persona("29", "Norah", 60);
        Persona p30 = new Persona("30", "Hugo", 3);
        Persona p31 = new Persona("31", "Abril", 65);
        Persona p32 = new Persona("32", "Isabel", 33);
        Persona p33 = new Persona("33", "Cecilia", 41);
        Persona p34 = new Persona("34", "Alicia", 81);
        Persona p35 = new Persona("35", "Nicolas", 18);
        Persona p36 = new Persona("36", "Gregorio", 77);
        Persona p37 = new Persona("37", "Natalia", 72);
        Persona p38 = new Persona("38", "Santiago", 19);
        Persona p39 = new Persona("39", "Miguel", 37);
        Persona p40 = new Persona("40", "Francisco", 69);
        Persona p41 = new Persona("41", "Lorena", 23);
        Persona p42 = new Persona("42", "Jose", 46);
        Persona p43 = new Persona("43", "Luis", 21);
        Persona p44 = new Persona("44", "Vilma", 14);
        Persona p45 = new Persona("45", "Raul", 47);
        Persona p46 = new Persona("46", "Susana", 15);
        Persona p47 = new Persona("47", "Gustavo", 38);
        Persona p48 = new Persona("48", "Paola", 40);
        Persona p49 = new Persona("49", "Ernesto", 63);
        Persona p50 = new Persona("50", "Carmela", 86);
        Persona p51 = new Persona("51", "Stephanie", 9);

        Persona[] personas = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15
                , p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31
                 , p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47
                , p48, p49, p50, p51};

        ManagerHandler managerHandler = new ManagerHandler();
        managerHandler.criteriaHandler(personas);
    }
}
