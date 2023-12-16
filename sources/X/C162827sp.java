package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;

/* renamed from: X.7sp  reason: invalid class name and case insensitive filesystem */
public class C162827sp implements SensorEventListener {
    public boolean A00;
    public final /* synthetic */ C182068no A01;
    public final /* synthetic */ AnonymousClass7T0 A02;

    public C162827sp(C182068no r1, AnonymousClass7T0 r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean z = false;
        float f = sensorEvent.values[0];
        if (f < 5.0f && f != this.A02.A01.getMaximumRange()) {
            z = true;
        }
        if (z != this.A00) {
            this.A00 = z;
            AnonymousClass92P r1 = (AnonymousClass92P) this.A01;
            if (r1.A01 != 0) {
                AnonymousClass92P.A00(r1, z);
            } else {
                ((AudioChatCallingViewModel) r1.A00).A0J(z);
            }
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
