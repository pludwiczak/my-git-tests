package pl.sda.ludwiczak.solid.open_close_principle;

public class Main {

    public static void main(String[] args) {
        Secret secret = new Secret("sda", "E://aktualizacje//SDA//file4.txt");

        secret.save();

        // 2 implementacje Saver
        // pierwsza zapis w pliku
        // druga zapis w bazie
        // uzycie z jednym sekretem

        Saver<BetterSecret> fileSaver = new SaveToFile();
        Saver<BetterSecret> dbSaver = new SaveToDataBase();
        Saver<BetterSecret> cloudSaver = new CloudSaver();

        BetterSecret mySecret = new BetterSecret("betterSDA", fileSaver);
        mySecret.save(); // zapisze do pliku


        mySecret.setSecretSaver(dbSaver);
        mySecret.save(); // zapisze do bazy danych

        mySecret.setSecretSaver(cloudSaver);
        mySecret.save(); // zapisze w chmurze

    }

}
