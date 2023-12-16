package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: X.5cR  reason: invalid class name and case insensitive filesystem */
public class C108115cR implements SensorEventListener {
    public final /* synthetic */ C116095pj A00;
    public final /* synthetic */ C116095pj A01;

    public C108115cR(C116095pj r1, C116095pj r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorEventListener sensorEventListener;
        Sensor sensor;
        C116095pj r0 = this.A01;
        C116095pj r3 = this.A00;
        if (r0 != r3) {
            SensorManager sensorManager = r3.A0F;
            if (!(sensorManager == null || (sensorEventListener = r3.A0E) == null || (sensor = r3.A0D) == null)) {
                sensorManager.unregisterListener(sensorEventListener, sensor);
                r3.A0F = null;
            }
            r3.A07();
            return;
        }
        float f = sensorEvent.values[0];
        if (f >= 5.0f || f == r3.A0D.getMaximumRange()) {
            r3.A0C(false);
        } else {
            r3.A0C(true);
        }
    }
}
