package pl.sda.ludwiczak.generic;

public class GenericHolder<E> {

    E secret; // jakikolwiek obiekt, E - coś co utworzymy w momencie tworzenia, trzeba zobaczyć w HolderTest jak zostało stworzone, to nie musi byc "E" -> shift+F6;

    public E getSecret() {
        return secret;
    }

    public void setSecret(E secret) {
        this.secret = secret;
    }


}
