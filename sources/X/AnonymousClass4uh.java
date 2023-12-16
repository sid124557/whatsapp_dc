package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.view.Display;
import android.view.MotionEvent;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.4uh  reason: invalid class name */
public abstract class AnonymousClass4uh extends C88564aB {
    public float A00;
    public float A01;
    public float A02;
    public int A03 = 2;
    public long A04;
    public SensorManager A05 = this.A09.A0D();
    public Location A06;
    public Display A07 = this.A09.A0O().getDefaultDisplay();
    public C105415Uv A08;
    public C620633i A09;
    public boolean A0A;
    public boolean A0B;
    public final SensorEventListener A0C = new AnonymousClass6AU(this, 1);
    public final C183968qx A0D = new AnonymousClass90W(this, 0);
    public final float[] A0E = new float[3];
    public final float[] A0F = new float[16];
    public final float[] A0G = new float[3];

    public abstract void A0B(int i);

    public static LatLng A01(LatLng latLng, double d) {
        return C86624Kv.A0G(latLng, d, 50.0d / 6378137.0d);
    }

    public void A0A() {
        SensorManager sensorManager = this.A05;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            this.A0B = AnonymousClass000.A1W(defaultSensor);
            if (defaultSensor != null) {
                sensorManager.registerListener(this.A0C, defaultSensor, 1);
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A03 != 2) {
            this.A03 = 2;
            A0B(2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getLocationMode() {
        return this.A03;
    }

    public void setLocationMode(int i) {
        LatLng latLng;
        LatLng latLng2;
        int i2;
        C105415Uv r4 = this.A08;
        if (r4 != null) {
            CameraPosition A022 = r4.A02();
            if (i != 0) {
                if (i == 1) {
                    Location location = this.A06;
                    if (location != null) {
                        latLng2 = AnonymousClass4L0.A0H(location.getLatitude(), this.A06.getLongitude());
                        this.A03 = 1;
                        i2 = 1;
                    } else {
                        latLng2 = A022.A03;
                        this.A03 = 2;
                        i2 = 2;
                    }
                    A0B(i2);
                    C151747Wd r1 = new C151747Wd();
                    r1.A01(latLng2);
                    r1.A00 = A022.A02;
                    r1.A01 = 0.0f;
                    r1.A02 = 0.0f;
                    r4.A09(C106555Zl.A00(r1.A00()));
                    return;
                } else if (i == 2) {
                    this.A03 = 2;
                    A0B(2);
                    return;
                } else {
                    return;
                }
            } else if (this.A0B) {
                this.A01 = A022.A02;
                i = 0;
                A0B(0);
                Location location2 = this.A06;
                if (location2 != null) {
                    latLng = AnonymousClass4L0.A0H(location2.getLatitude(), this.A06.getLongitude());
                } else {
                    latLng = A022.A03;
                }
                r4.A0B(C106555Zl.A00(C88564aB.A00(latLng, this)), this.A0D);
            } else {
                return;
            }
        }
        this.A03 = i;
    }

    public AnonymousClass4uh(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        A08(new AnonymousClass93E(this, 1));
    }

    public C105415Uv A09(C181128mC r2) {
        C626936e.A01();
        C105415Uv r0 = this.A08;
        if (r0 != null) {
            r2.BW2(r0);
            return this.A08;
        }
        A08(r2);
        return null;
    }

    public void setMyLocation(Location location) {
        this.A06 = location;
    }
}
