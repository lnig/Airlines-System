import java.util.Date;

public class Bilet {
    private Date DataOdlotu, DataPrzylotu;
    private String MiejsceOdlotu;
    private String MiejscePrzylotu;
    private String NazwaBiletu;

    public Bilet(Date dataOdlotu, Date dataPrzylotu, String miejsceOdlotu, String miejscePrzylotu, String nazwaBiletu) {
        DataOdlotu = dataOdlotu;
        DataPrzylotu = dataPrzylotu;
        MiejsceOdlotu = miejsceOdlotu;
        MiejscePrzylotu = miejscePrzylotu;
        NazwaBiletu = nazwaBiletu;
    }

    public Date getDataOdlotu() {
        return DataOdlotu;
    }

    public void setDataOdlotu(Date dataOdlotu) {
        DataOdlotu = dataOdlotu;
    }

    public Date getDataPrzylotu() {
        return DataPrzylotu;
    }

    public void setDataPrzylotu(Date dataPrzylotu) {
        DataPrzylotu = dataPrzylotu;
    }

    public String getMiejsceOdlotu() {
        return MiejsceOdlotu;
    }

    public void setMiejsceOdlotu(String miejsceOdlotu) {
        MiejsceOdlotu = miejsceOdlotu;
    }

    public String getMiejscePrzylotu() {
        return MiejscePrzylotu;
    }

    public void setMiejscePrzylotu(String miejscePrzylotu) {
        MiejscePrzylotu = miejscePrzylotu;
    }

    public String getNazwaBiletu() {
        return NazwaBiletu;
    }

    public void setNazwaBiletu(String nazwaBiletu) {
        NazwaBiletu = nazwaBiletu;
    }
}
