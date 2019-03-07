package pl.sda.ludwiczak.thread.interrupting;

public class SyncObject {

    private Boolean shouldContinue = Boolean.TRUE;

    public Boolean getShouldContinue() {
        return shouldContinue;
    }

    public void setShouldContinue(Boolean shouldContinue) {
        this.shouldContinue = shouldContinue;
    }
}
