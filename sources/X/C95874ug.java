package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.LocationPicker;

/* renamed from: X.4ug  reason: invalid class name and case insensitive filesystem */
public class C95874ug extends AnonymousClass4Zi {
    public float A00;
    public float A01;
    public int A02 = 2;
    public long A03;
    public SensorManager A04;
    public Display A05;
    public C110885hC A06;
    public AnonymousClass4Zd A07;
    public C142776xk A08 = C142776xk.BOTTOM_RIGHT;
    public C156807hE A09;
    public C85244Fm A0A;
    public C620633i A0B;
    public boolean A0C;
    public final SensorEventListener A0D = new AnonymousClass6AU(this, 0);
    public final C180298ko A0E = new AnonymousClass93D(this, 1);
    public final float[] A0F = new float[3];
    public final float[] A0G = new float[16];
    public final float[] A0H = new float[3];

    private void setupInfoButtonForFacebookMap(Context context) {
        A0G(new C107605ba(context, 3, this));
    }

    public void A0K() {
        SensorManager sensorManager = this.A04;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            this.A0C = AnonymousClass000.A1W(defaultSensor);
            if (defaultSensor != null) {
                sensorManager.registerListener(this.A0D, defaultSensor, 16000);
            }
        }
    }

    public void A0L(int i) {
        ImageView imageView;
        int i2;
        LocationPicker locationPicker;
        ImageView imageView2;
        int i3;
        if (this instanceof C95834uc) {
            C95834uc r0 = (C95834uc) this;
            if (i != 0) {
                locationPicker = r0.A00;
                imageView2 = locationPicker.A0P.A0S;
                if (i != 1) {
                    i3 = R.drawable.btn_myl;
                } else {
                    imageView2.setImageResource(R.drawable.btn_myl_active);
                    locationPicker.A0P.A0s = true;
                    return;
                }
            } else {
                locationPicker = r0.A00;
                imageView2 = locationPicker.A0P.A0S;
                i3 = R.drawable.btn_compass_mode_tilt;
            }
            imageView2.setImageResource(i3);
            locationPicker.A0P.A0s = false;
        } else if (this instanceof C95824ub) {
            int i4 = 8;
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = ((C95824ub) this).A00;
            if (i == 0) {
                C111445i6 r02 = groupChatLiveLocationsActivity.A0N;
                r02.A0u = true;
                r02.A0s = true;
                imageView = groupChatLiveLocationsActivity.A03;
                i2 = R.drawable.btn_compass_mode_tilt;
            } else if (i != 1) {
                groupChatLiveLocationsActivity.A03.setImageResource(R.drawable.btn_myl);
                groupChatLiveLocationsActivity.A0N.A0s = false;
                return;
            } else {
                C111445i6 r03 = groupChatLiveLocationsActivity.A0N;
                r03.A0u = true;
                r03.A0s = true;
                imageView = groupChatLiveLocationsActivity.A03;
                i2 = R.drawable.btn_myl_active;
            }
            imageView.setImageResource(i2);
            C111445i6 r04 = groupChatLiveLocationsActivity.A0N;
            View view = r04.A0U;
            if (r04.A0m == null) {
                i4 = 0;
            }
            view.setVisibility(i4);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A02 != 2) {
            this.A02 = 2;
            A0L(2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getLocationMode() {
        return this.A02;
    }

    public Location getMyLocation() {
        C110885hC A0J = A0J(this.A0E);
        if (A0J == null || !A0J.A0N || A0J.A0G == null) {
            return null;
        }
        return A0J.A0V.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (r3 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setLocationMode(int r6) {
        /*
            r5 = this;
            X.8ko r0 = r5.A0E
            X.5hC r4 = r5.A0J(r0)
            if (r4 != 0) goto L_0x000b
            r5.A02 = r6
        L_0x000a:
            return
        L_0x000b:
            X.7yk r3 = r4.A02()
            if (r6 == 0) goto L_0x001d
            r2 = 1
            r1 = 2
            if (r6 == r2) goto L_0x0065
            if (r6 != r1) goto L_0x000a
            r5.A02 = r1
            r5.A0L(r1)
            return
        L_0x001d:
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x000a
            float r0 = r3.A02
            r5.A01 = r0
            r0 = 0
            r5.A0L(r0)
            android.location.Location r0 = r5.getMyLocation()
            if (r0 == 0) goto L_0x0060
            X.5ds r3 = X.C108975ds.A01(r0)
        L_0x0033:
            X.7Sg r2 = new X.7Sg
            r2.<init>()
            float r0 = r5.A00
            r2.A00 = r0
            float r1 = r5.A01
            r0 = 1097859072(0x41700000, float:15.0)
            float r0 = java.lang.Math.max(r1, r0)
            r2.A01 = r0
            r2.A02 = r3
            X.7yk r0 = r2.A00()
            X.7UM r0 = X.C153847c7.A00(r0)
            r4.A09(r0)
        L_0x0053:
            r0 = 8
            X.3by r2 = new X.3by
            r2.<init>(r5, r0, r4)
            r0 = 1000(0x3e8, double:4.94E-321)
            r5.postDelayed(r2, r0)
            return
        L_0x0060:
            X.5ds r3 = r3.A03
            if (r3 == 0) goto L_0x0053
            goto L_0x0033
        L_0x0065:
            android.location.Location r0 = r5.getMyLocation()
            if (r0 == 0) goto L_0x008f
            X.5ds r0 = X.C108975ds.A01(r0)
            r5.A02 = r2
            r1 = 1
        L_0x0072:
            r5.A0L(r1)
            X.7Sg r1 = new X.7Sg
            r1.<init>()
            r1.A02 = r0
            float r0 = r3.A02
            r1.A01 = r0
            r0 = 0
            r1.A00 = r0
            X.7yk r0 = r1.A00()
            X.7UM r0 = X.C153847c7.A00(r0)
            r4.A09(r0)
            return
        L_0x008f:
            X.5ds r0 = r3.A03
            r5.A02 = r1
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95874ug.setLocationMode(int):void");
    }

    public C95874ug(Context context, C150067Pa r4) {
        super(context, r4);
        this.A08 = r4.A01;
        this.A04 = this.A0B.A0D();
        this.A05 = this.A0B.A0O().getDefaultDisplay();
        setupInfoButtonForFacebookMap(getContext());
    }

    public C110885hC A0J(C180298ko r2) {
        C626936e.A01();
        C110885hC r0 = this.A06;
        if (r0 != null) {
            r2.BW1(r0);
            return this.A06;
        }
        A0G(r2);
        return null;
    }

    public void setInfoButtonPosition(C142776xk r1) {
        this.A08 = r1;
    }
}
