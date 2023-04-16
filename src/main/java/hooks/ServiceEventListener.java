package hooks;

public interface ServiceEventListener {
    public void onAirQualitySend(Object[] data);
    public void onWaterQualitySend(Object[] data);
    void onAnalysis(Object[][] data);

}