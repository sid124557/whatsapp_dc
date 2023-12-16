package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: X.7T0  reason: invalid class name */
public final class AnonymousClass7T0 {
    public SensorEventListener A00;
    public final Sensor A01;
    public final SensorManager A02;

    public void A00(C182068no r5) {
        SensorEventListener sensorEventListener = this.A00;
        if (sensorEventListener != null) {
            this.A02.unregisterListener(sensorEventListener, this.A01);
            this.A00 = null;
        }
        if (r5 != null) {
            C162827sp r3 = new C162827sp(r5, this);
            this.A00 = r3;
            this.A02.registerListener(r3, this.A01, 2);
        }
    }

    public AnonymousClass7T0(C620633i r3) {
        SensorManager A0D = r3.A0D();
        this.A02 = A0D;
        this.A01 = A0D.getDefaultSensor(8);
    }
}
