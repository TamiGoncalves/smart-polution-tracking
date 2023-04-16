package hooks;

public interface ServiceListener {
    public void onAirQualitySend(Object[] data);
    public void onWaterQualitySend(Object[] data);
    void onAnalysis(Object[][] data);

}