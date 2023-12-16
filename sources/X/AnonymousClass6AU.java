package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: X.6AU  reason: invalid class name */
public class AnonymousClass6AU implements SensorEventListener {
    public Object A00;
    public final int A01;

    public AnonymousClass6AU(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x025d, code lost:
        if (r5 != 3) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0135, code lost:
        if (r3 != 3) goto L_0x0137;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSensorChanged(android.hardware.SensorEvent r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A01
            r7 = r19
            switch(r0) {
                case 0: goto L_0x0171;
                case 1: goto L_0x0024;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r3 = r1.A00
            com.whatsapp.notification.PopupNotification r3 = (com.whatsapp.notification.PopupNotification) r3
            float[] r1 = r7.values
            r0 = 0
            r2 = r1[r0]
            r3.A00 = r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "popupnotification/proximity:"
            r1.append(r0)
            r1.append(r2)
            X.C18280x3.A14(r1)
        L_0x0023:
            return
        L_0x0024:
            java.lang.Object r4 = r1.A00
            X.4uh r4 = (X.AnonymousClass4uh) r4
            X.5Uv r0 = r4.A08
            if (r0 == 0) goto L_0x0023
            android.location.Location r0 = r4.A06
            if (r0 == 0) goto L_0x0023
            r8 = 0
            r5 = 3
            float[] r1 = r4.A0F     // Catch:{ IllegalArgumentException -> 0x003a }
            float[] r0 = r7.values     // Catch:{ IllegalArgumentException -> 0x003a }
            android.hardware.SensorManager.getRotationMatrixFromVector(r1, r0)     // Catch:{ IllegalArgumentException -> 0x003a }
            goto L_0x0049
        L_0x003a:
            float[] r2 = r7.values
            int r0 = r2.length
            if (r0 <= r5) goto L_0x0049
            float[] r1 = r4.A0E
            java.lang.System.arraycopy(r2, r8, r1, r8, r5)
            float[] r0 = r4.A0F
            android.hardware.SensorManager.getRotationMatrixFromVector(r0, r1)
        L_0x0049:
            android.view.Display r0 = r4.A07
            int r3 = r0.getRotation()
            long r6 = java.lang.System.currentTimeMillis()
            android.location.Location r0 = r4.A06
            long r0 = r0.getTime()
            long r6 = r6 - r0
            r1 = 5000(0x1388, double:2.4703E-320)
            r11 = 0
            r9 = 2
            r10 = 1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0120
            android.location.Location r0 = r4.A06
            boolean r0 = r0.hasBearing()
            if (r0 == 0) goto L_0x0120
            android.location.Location r0 = r4.A06
            float r0 = r0.getSpeed()
            double r0 = (double) r0
            r6 = 4606228376254955242(0x3fec9c4da9003eea, double:0.89408)
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0120
            android.location.Location r0 = r4.A06
            float r2 = r0.getBearing()
        L_0x0081:
            float r11 = r4.A00
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r4.A04
            long r0 = r7 - r5
            float r5 = (float) r0
            r0 = 1137180672(0x43c80000, float:400.0)
            float r5 = r5 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0097
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x0097:
            r4.A04 = r7
            float r6 = r2 - r11
            float r1 = java.lang.Math.abs(r6)
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fd
            r0 = 1114636288(0x42700000, float:60.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00ae
            float r5 = r5 * r6
            float r2 = r11 + r5
        L_0x00ae:
            r4.A00 = r2
            if (r3 == 0) goto L_0x00ec
            if (r3 == r9) goto L_0x00ec
            float[] r0 = r4.A0G
            r0 = r0[r9]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            double r1 = java.lang.Math.abs(r0)
            float r0 = (float) r1
            r4.A02 = r0
        L_0x00c4:
            int r0 = r4.A03
            if (r0 != 0) goto L_0x0023
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0023
            android.location.Location r0 = r4.A06
            double r2 = r0.getLatitude()
            android.location.Location r0 = r4.A06
            double r0 = r0.getLongitude()
            com.google.android.gms.maps.model.LatLng r0 = X.AnonymousClass4L0.A0H(r2, r0)
            com.google.android.gms.maps.model.CameraPosition r0 = X.C88564aB.A00(r0, r4)
            X.5Uv r2 = r4.A08
            X.7BU r1 = X.C106555Zl.A00(r0)
            X.8qx r0 = r4.A0D
            r2.A0B(r1, r0)
            return
        L_0x00ec:
            float[] r0 = r4.A0G
            r0 = r0[r10]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            double r1 = java.lang.Math.abs(r0)
            float r0 = (float) r1
            r4.A02 = r0
            goto L_0x00c4
        L_0x00fd:
            double r0 = (double) r1
            r12 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r12 = r12 - r0
            r6 = 4633641066610819072(0x404e000000000000, double:60.0)
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x00ae
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0119
            float r2 = r2 + r1
            float r2 = r2 - r11
            float r2 = r2 % r1
            float r5 = r5 * r2
            float r11 = r11 + r5
        L_0x0115:
            float r11 = r11 + r1
            float r2 = r11 % r1
            goto L_0x00ae
        L_0x0119:
            float r0 = r1 - r2
            float r0 = r0 + r11
            float r0 = r0 % r1
            float r5 = r5 * r0
            float r11 = r11 - r5
            goto L_0x0115
        L_0x0120:
            float[] r1 = r4.A0F
            float[] r0 = r4.A0G
            android.hardware.SensorManager.getOrientation(r1, r0)
            r0 = r0[r8]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r2 = (float) r0
            if (r3 == r10) goto L_0x016d
            if (r3 == r9) goto L_0x016a
            r0 = 1132920832(0x43870000, float:270.0)
            if (r3 == r5) goto L_0x016f
        L_0x0137:
            r5 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x013e
            float r2 = r2 + r5
        L_0x013e:
            android.location.Location r0 = r4.A06
            double r0 = r0.getLatitude()
            float r12 = (float) r0
            android.location.Location r0 = r4.A06
            double r0 = r0.getLongitude()
            float r13 = (float) r0
            android.location.Location r0 = r4.A06
            double r0 = r0.getAltitude()
            float r14 = (float) r0
            android.location.Location r0 = r4.A06
            long r15 = r0.getTime()
            android.hardware.GeomagneticField r11 = new android.hardware.GeomagneticField
            r11.<init>(r12, r13, r14, r15)
            float r0 = r11.getDeclination()
            float r2 = r2 + r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0081
            float r2 = r2 - r5
            goto L_0x0081
        L_0x016a:
            r0 = 1127481344(0x43340000, float:180.0)
            goto L_0x016f
        L_0x016d:
            r0 = 1119092736(0x42b40000, float:90.0)
        L_0x016f:
            float r2 = r2 + r0
            goto L_0x0137
        L_0x0171:
            java.lang.Object r3 = r1.A00
            X.4ug r3 = (X.C95874ug) r3
            X.8ko r0 = r3.A0E
            X.5hC r2 = r3.A0J(r0)
            if (r2 == 0) goto L_0x0023
            android.location.Location r11 = r3.getMyLocation()
            if (r11 == 0) goto L_0x0023
            r4 = 0
            r6 = 3
            float[] r1 = r3.A0G     // Catch:{ IllegalArgumentException -> 0x018d }
            float[] r0 = r7.values     // Catch:{ IllegalArgumentException -> 0x018d }
            android.hardware.SensorManager.getRotationMatrixFromVector(r1, r0)     // Catch:{ IllegalArgumentException -> 0x018d }
            goto L_0x019c
        L_0x018d:
            float[] r5 = r7.values
            int r0 = r5.length
            if (r0 <= r6) goto L_0x019c
            float[] r1 = r3.A0F
            java.lang.System.arraycopy(r5, r4, r1, r4, r6)
            float[] r0 = r3.A0G
            android.hardware.SensorManager.getRotationMatrixFromVector(r0, r1)
        L_0x019c:
            android.view.Display r0 = r3.A05
            int r5 = r0.getRotation()
            long r9 = java.lang.System.currentTimeMillis()
            long r0 = r11.getTime()
            long r9 = r9 - r0
            r7 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0244
            boolean r0 = r11.hasBearing()
            if (r0 == 0) goto L_0x0244
            float r0 = r11.getSpeed()
            double r7 = (double) r0
            r9 = 4606228376254955242(0x3fec9c4da9003eea, double:0.89408)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0244
            float r6 = r11.getBearing()
        L_0x01c9:
            float r9 = r3.A00
            long r7 = java.lang.System.currentTimeMillis()
            long r4 = r3.A03
            long r0 = r7 - r4
            float r10 = (float) r0
            r0 = 1137180672(0x43c80000, float:400.0)
            float r10 = r10 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01df
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x01df:
            r3.A03 = r7
            float r4 = r6 - r9
            float r1 = java.lang.Math.abs(r4)
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0221
            r0 = 1114636288(0x42700000, float:60.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x01f6
            float r10 = r10 * r4
            float r6 = r9 + r10
        L_0x01f6:
            r3.A00 = r6
            int r0 = r3.A02
            if (r0 != 0) goto L_0x0023
            X.5ds r5 = X.C108975ds.A01(r11)
            X.7Sg r4 = new X.7Sg
            r4.<init>()
            float r0 = r3.A00
            r4.A00 = r0
            float r1 = r3.A01
            r0 = 1097859072(0x41700000, float:15.0)
            float r0 = java.lang.Math.max(r1, r0)
            r4.A01 = r0
            r4.A02 = r5
            X.7yk r0 = r4.A00()
            X.7UM r0 = X.C153847c7.A00(r0)
            r2.A0A(r0)
            return
        L_0x0221:
            double r0 = (double) r1
            r7 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r7 = r7 - r0
            r4 = 4633641066610819072(0x404e000000000000, double:60.0)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x01f6
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x023d
            float r6 = r6 + r1
            float r6 = r6 - r9
            float r6 = r6 % r1
            float r10 = r10 * r6
            float r9 = r9 + r10
        L_0x0239:
            float r9 = r9 + r1
            float r6 = r9 % r1
            goto L_0x01f6
        L_0x023d:
            float r0 = r1 - r6
            float r0 = r0 + r9
            float r0 = r0 % r1
            float r10 = r10 * r0
            float r9 = r9 - r10
            goto L_0x0239
        L_0x0244:
            float[] r1 = r3.A0G
            float[] r0 = r3.A0H
            android.hardware.SensorManager.getOrientation(r1, r0)
            r0 = r0[r4]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r4 = (float) r0
            r1 = 1
            r0 = 1119092736(0x42b40000, float:90.0)
            if (r5 == r1) goto L_0x028d
            r0 = 2
            if (r5 == r0) goto L_0x028b
            r0 = 1132920832(0x43870000, float:270.0)
            if (r5 == r6) goto L_0x028d
        L_0x025f:
            r0 = 0
            r5 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0267
            float r4 = r4 + r5
        L_0x0267:
            double r0 = r11.getLatitude()
            float r13 = (float) r0
            double r0 = r11.getLongitude()
            float r14 = (float) r0
            double r0 = r11.getAltitude()
            float r15 = (float) r0
            long r16 = r11.getTime()
            android.hardware.GeomagneticField r12 = new android.hardware.GeomagneticField
            r12.<init>(r13, r14, r15, r16)
            float r6 = r12.getDeclination()
            float r6 = r6 + r4
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x01c9
            float r6 = r6 - r5
            goto L_0x01c9
        L_0x028b:
            r0 = 1127481344(0x43340000, float:180.0)
        L_0x028d:
            float r4 = r4 + r0
            goto L_0x025f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6AU.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
