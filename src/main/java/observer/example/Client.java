package observer.example;

public class Client {
    public static void main (String [] args){
        CanalYoutube canalYoutube = new CanalYoutube();
        canalYoutube.subscription(new UserYoutube("comida", new Persona("123", "Carlos")));
        canalYoutube.subscription(new UserYoutube("niños", new Persona("456", "Luis")));
        canalYoutube.subscription(new UserYoutube("juegos", new Persona("789", "Andres")));
        canalYoutube.subscription(new UserYoutube("comida", new Persona("014", "Esteban")));

        canalYoutube.uploadVideo(new Video("33333","comediantes","comedia"));
    }
}