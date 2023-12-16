package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.91S  reason: invalid class name */
public class AnonymousClass91S implements Comparator {
    public final int A00;

    public AnonymousClass91S(int i) {
        this.A00 = i;
    }

    public static final int A00(Object obj, Object obj2) {
        return ((Long) ((Map.Entry) obj2).getValue()).compareTo((Long) ((Map.Entry) obj).getValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02ad, code lost:
        if (r0 <= 0) goto L_0x02af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0076;
                case 1: goto L_0x0080;
                case 2: goto L_0x008a;
                case 3: goto L_0x0097;
                case 4: goto L_0x00b6;
                case 5: goto L_0x00c3;
                case 6: goto L_0x03b4;
                case 7: goto L_0x00da;
                case 8: goto L_0x00f5;
                case 9: goto L_0x0102;
                case 10: goto L_0x0113;
                case 11: goto L_0x0120;
                case 12: goto L_0x0016;
                case 13: goto L_0x03b4;
                case 14: goto L_0x0034;
                case 15: goto L_0x0055;
                case 16: goto L_0x012a;
                case 17: goto L_0x0134;
                case 18: goto L_0x0141;
                case 19: goto L_0x014f;
                case 20: goto L_0x0005;
                case 21: goto L_0x03ac;
                case 22: goto L_0x0167;
                case 23: goto L_0x017f;
                case 24: goto L_0x0197;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x01a8;
                case 28: goto L_0x01c1;
                case 29: goto L_0x01da;
                case 30: goto L_0x0005;
                case 31: goto L_0x01ef;
                case 32: goto L_0x0358;
                case 33: goto L_0x037e;
                case 34: goto L_0x01fd;
                case 35: goto L_0x0210;
                case 36: goto L_0x03d3;
                case 37: goto L_0x03c5;
                case 38: goto L_0x03e1;
                case 39: goto L_0x0223;
                case 40: goto L_0x0230;
                case 41: goto L_0x0242;
                case 42: goto L_0x0254;
                case 43: goto L_0x0269;
                case 44: goto L_0x028b;
                case 45: goto L_0x0298;
                case 46: goto L_0x02e2;
                case 47: goto L_0x02e2;
                case 48: goto L_0x02f7;
                case 49: goto L_0x0310;
                case 50: goto L_0x031b;
                case 51: goto L_0x0320;
                case 52: goto L_0x032d;
                case 53: goto L_0x033e;
                case 54: goto L_0x0391;
                case 55: goto L_0x0391;
                case 56: goto L_0x034f;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.5e2 r8 = (X.C109075e2) r8
            X.5e0 r0 = r8.A0B
            java.lang.Double r1 = r0.A05
            X.5e2 r9 = (X.C109075e2) r9
            X.5e0 r0 = r9.A0B
            java.lang.Double r0 = r0.A05
            int r3 = X.AnonymousClass2A6.A00(r1, r0)
        L_0x0015:
            return r3
        L_0x0016:
            java.lang.Number r8 = (java.lang.Number) r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r2 = r8.intValue()
            r3 = -1
            if (r2 != r3) goto L_0x0029
            int r0 = r9.intValue()
            if (r0 != r3) goto L_0x0015
            goto L_0x03b4
        L_0x0029:
            int r1 = r9.intValue()
            r0 = -1
            int r3 = r2 - r1
            if (r1 != r0) goto L_0x0015
            goto L_0x03df
        L_0x0034:
            X.7h1 r8 = (X.C156677h1) r8
            X.7h1 r9 = (X.C156677h1) r9
            int r1 = r9.A00
            int r0 = r8.A00
            int r3 = java.lang.Integer.compare(r1, r0)
            if (r3 != 0) goto L_0x0015
            java.lang.String r1 = r8.A03
            java.lang.String r0 = r9.A03
            int r3 = r1.compareTo(r0)
            if (r3 != 0) goto L_0x0015
            java.lang.String r1 = r8.A02
            java.lang.String r0 = r9.A02
            int r3 = r1.compareTo(r0)
            return r3
        L_0x0055:
            X.7h1 r8 = (X.C156677h1) r8
            X.7h1 r9 = (X.C156677h1) r9
            int r1 = r9.A01
            int r0 = r8.A01
            int r3 = java.lang.Integer.compare(r1, r0)
            if (r3 != 0) goto L_0x0015
            java.lang.String r1 = r9.A03
            java.lang.String r0 = r8.A03
            int r3 = r1.compareTo(r0)
            if (r3 != 0) goto L_0x0015
            java.lang.String r1 = r9.A02
            java.lang.String r0 = r8.A02
            int r3 = r1.compareTo(r0)
            return r3
        L_0x0076:
            X.7z1 r8 = (X.C166637z1) r8
            X.7z1 r9 = (X.C166637z1) r9
            int r3 = r9.A04
            int r0 = r8.A04
            int r3 = r3 - r0
            return r3
        L_0x0080:
            X.7Iy r8 = (X.C148587Iy) r8
            X.7Iy r9 = (X.C148587Iy) r9
            int r3 = r8.A01
            int r0 = r9.A01
            int r3 = r3 - r0
            return r3
        L_0x008a:
            X.7Iy r8 = (X.C148587Iy) r8
            X.7Iy r9 = (X.C148587Iy) r9
            float r1 = r8.A00
            float r0 = r9.A00
            int r3 = java.lang.Float.compare(r1, r0)
            return r3
        L_0x0097:
            X.5h5 r8 = (X.C110815h5) r8
            X.5h5 r9 = (X.C110815h5) r9
            int r3 = r8.A03
            int r0 = r9.A03
            float r2 = r8.A02
            float r1 = r9.A02
            if (r3 != r0) goto L_0x00b4
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00b0
            float r2 = r2 - r1
            float r0 = java.lang.Math.signum(r2)
            int r3 = (int) r0
            return r3
        L_0x00b0:
            int r3 = r8.A06
            int r0 = r9.A06
        L_0x00b4:
            int r3 = r3 - r0
            return r3
        L_0x00b6:
            X.7JJ r8 = (X.AnonymousClass7JJ) r8
            X.7JJ r9 = (X.AnonymousClass7JJ) r9
            java.lang.Long r1 = r8.A00
            java.lang.Long r0 = r9.A00
            int r3 = r1.compareTo(r0)
            return r3
        L_0x00c3:
            X.7JJ r8 = (X.AnonymousClass7JJ) r8
            X.7JJ r9 = (X.AnonymousClass7JJ) r9
            java.lang.Long r2 = r8.A01
            java.lang.Long r1 = r9.A01
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x00d5
            java.lang.Long r1 = r9.A00
            java.lang.Long r2 = r8.A00
        L_0x00d5:
            int r3 = r1.compareTo(r2)
            return r3
        L_0x00da:
            X.7av r8 = (X.C153247av) r8
            X.7av r9 = (X.C153247av) r9
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r1 = r8.A01
            java.util.concurrent.TimeUnit r0 = r8.A02
            long r2 = r6.convert(r1, r0)
            long r4 = r9.A01
            java.util.concurrent.TimeUnit r0 = r9.A02
            long r0 = r6.convert(r4, r0)
            int r3 = java.lang.Long.compare(r2, r0)
            return r3
        L_0x00f5:
            X.7gE r8 = (X.C156207gE) r8
            X.7gE r9 = (X.C156207gE) r9
            int r1 = r9.A00
            int r0 = r8.A00
            int r3 = java.lang.Integer.compare(r1, r0)
            return r3
        L_0x0102:
            X.7gF r8 = (X.C156217gF) r8
            X.7gF r9 = (X.C156217gF) r9
            X.7MB r0 = r8.A01
            int r1 = r0.A00
            X.7MB r0 = r9.A01
            int r0 = r0.A00
            int r3 = java.lang.Integer.compare(r1, r0)
            return r3
        L_0x0113:
            X.7Ji r8 = (X.C148687Ji) r8
            X.7Ji r9 = (X.C148687Ji) r9
            long r2 = r8.A01
            long r0 = r9.A01
            int r3 = java.lang.Long.compare(r2, r0)
            return r3
        L_0x0120:
            X.7yp r8 = (X.C166527yp) r8
            X.7yp r9 = (X.C166527yp) r9
            int r3 = r9.A05
            int r0 = r8.A05
            int r3 = r3 - r0
            return r3
        L_0x012a:
            X.7Jk r8 = (X.C148707Jk) r8
            X.7Jk r9 = (X.C148707Jk) r9
            int r3 = r8.A01
            int r0 = r9.A01
            int r3 = r3 - r0
            return r3
        L_0x0134:
            X.7Jk r8 = (X.C148707Jk) r8
            X.7Jk r9 = (X.C148707Jk) r9
            float r1 = r8.A00
            float r0 = r9.A00
            int r3 = java.lang.Float.compare(r1, r0)
            return r3
        L_0x0141:
            android.view.View r8 = (android.view.View) r8
            android.view.View r9 = (android.view.View) r9
            int r3 = r8.getTop()
            int r0 = r9.getTop()
            int r3 = r3 - r0
            return r3
        L_0x014f:
            X.7yB r8 = (X.C166127yB) r8
            X.7yB r9 = (X.C166127yB) r9
            java.lang.Integer r0 = r8.A03
            X.C626936e.A06(r0)
            int r3 = r0.intValue()
            java.lang.Integer r0 = r9.A03
            X.C626936e.A06(r0)
            int r0 = r0.intValue()
            int r3 = r3 - r0
            return r3
        L_0x0167:
            X.8u4 r8 = (X.C185678u4) r8
            X.8u4 r9 = (X.C185678u4) r9
            r0 = 21
            X.91S r2 = new X.91S
            r2.<init>(r0)
            java.lang.Double r1 = r9.BBb()
            java.lang.Double r0 = r8.BBb()
            int r3 = r2.compare(r1, r0)
            return r3
        L_0x017f:
            X.8u4 r8 = (X.C185678u4) r8
            X.8u4 r9 = (X.C185678u4) r9
            r0 = 21
            X.91S r2 = new X.91S
            r2.<init>(r0)
            java.lang.Double r1 = r8.BBb()
            java.lang.Double r0 = r9.BBb()
            int r3 = r2.compare(r1, r0)
            return r3
        L_0x0197:
            X.8u4 r8 = (X.C185678u4) r8
            X.8u4 r9 = (X.C185678u4) r9
            double r2 = r8.B78()
            double r0 = r9.B78()
            int r3 = java.lang.Double.compare(r2, r0)
            return r3
        L_0x01a8:
            X.8Le r8 = (X.AnonymousClass8Le) r8
            X.8ki r0 = r8.A03
            X.5e2 r0 = (X.C109075e2) r0
            X.5e0 r0 = r0.A0B
            java.lang.Double r1 = r0.A05
            X.8Le r9 = (X.AnonymousClass8Le) r9
            X.8ki r0 = r9.A03
            X.5e2 r0 = (X.C109075e2) r0
            X.5e0 r0 = r0.A0B
            java.lang.Double r0 = r0.A05
            int r3 = X.AnonymousClass2A6.A00(r1, r0)
            return r3
        L_0x01c1:
            X.5e2 r8 = (X.C109075e2) r8
            X.5e2 r9 = (X.C109075e2) r9
            X.5e0 r0 = r8.A0B
            java.lang.Double r0 = r0.A05
            double r2 = r0.doubleValue()
            X.5e0 r0 = r9.A0B
            java.lang.Double r0 = r0.A05
            double r0 = r0.doubleValue()
            int r3 = java.lang.Double.compare(r2, r0)
            return r3
        L_0x01da:
            X.5e2 r8 = (X.C109075e2) r8
            float r0 = r8.A06
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            X.5e2 r9 = (X.C109075e2) r9
            float r0 = r9.A06
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            int r3 = X.AnonymousClass2A6.A00(r1, r0)
            return r3
        L_0x01ef:
            X.5Tw r8 = (X.C105175Tw) r8
            X.5Tw r9 = (X.C105175Tw) r9
            int r1 = r8.A05
            int r0 = r9.A05
            int r0 = java.lang.Integer.compare(r1, r0)
            int r3 = -r0
            return r3
        L_0x01fd:
            android.hardware.Camera$Size r8 = (android.hardware.Camera.Size) r8
            android.hardware.Camera$Size r9 = (android.hardware.Camera.Size) r9
            int r2 = r8.width
            int r0 = r8.height
            int r2 = r2 * r0
            int r1 = r9.width
            int r0 = r9.height
            int r1 = r1 * r0
            int r3 = java.lang.Integer.compare(r2, r1)
            return r3
        L_0x0210:
            android.hardware.Camera$Size r8 = (android.hardware.Camera.Size) r8
            android.hardware.Camera$Size r9 = (android.hardware.Camera.Size) r9
            int r2 = r8.width
            int r0 = r8.height
            int r2 = r2 * r0
            int r1 = r9.width
            int r0 = r9.height
            int r1 = r1 * r0
            int r3 = java.lang.Integer.compare(r1, r2)
            return r3
        L_0x0223:
            com.whatsapp.location.PlaceInfo r8 = (com.whatsapp.location.PlaceInfo) r8
            com.whatsapp.location.PlaceInfo r9 = (com.whatsapp.location.PlaceInfo) r9
            double r2 = r8.A00
            double r0 = r9.A00
            int r3 = java.lang.Double.compare(r2, r0)
            return r3
        L_0x0230:
            X.0PJ r8 = (X.AnonymousClass0PJ) r8
            X.0PJ r9 = (X.AnonymousClass0PJ) r9
            java.lang.Object r0 = r8.A01
            android.graphics.Point r0 = (android.graphics.Point) r0
            int r3 = r0.x
            java.lang.Object r0 = r9.A01
            android.graphics.Point r0 = (android.graphics.Point) r0
            int r0 = r0.x
            int r3 = r3 - r0
            return r3
        L_0x0242:
            X.0PJ r8 = (X.AnonymousClass0PJ) r8
            X.0PJ r9 = (X.AnonymousClass0PJ) r9
            java.lang.Object r0 = r8.A01
            android.graphics.Point r0 = (android.graphics.Point) r0
            int r3 = r0.y
            java.lang.Object r0 = r9.A01
            android.graphics.Point r0 = (android.graphics.Point) r0
            int r0 = r0.y
            int r3 = r3 - r0
            return r3
        L_0x0254:
            X.7Hm r8 = (X.C148207Hm) r8
            X.7Hm r9 = (X.C148207Hm) r9
            java.io.File r0 = r8.A01
            java.lang.String r1 = r0.getName()
            java.io.File r0 = r9.A01
            java.lang.String r0 = r0.getName()
            int r3 = r1.compareTo(r0)
            return r3
        L_0x0269:
            X.7Hn r8 = (X.C148217Hn) r8
            X.7Hn r9 = (X.C148217Hn) r9
            r2 = 0
            java.util.List r0 = r8.A01
            java.lang.Object r0 = r0.get(r2)
            java.io.File r0 = (java.io.File) r0
            java.lang.String r1 = r0.getName()
            java.util.List r0 = r9.A01
            java.lang.Object r0 = r0.get(r2)
            java.io.File r0 = (java.io.File) r0
            java.lang.String r0 = r0.getName()
            int r3 = r1.compareTo(r0)
            return r3
        L_0x028b:
            X.7Hq r8 = (X.C148247Hq) r8
            X.7Hq r9 = (X.C148247Hq) r9
            long r2 = r8.A00
            long r0 = r9.A00
            int r3 = java.lang.Long.compare(r2, r0)
            return r3
        L_0x0298:
            X.7YJ r8 = (X.AnonymousClass7YJ) r8
            X.3ZH r1 = r8.A00
            r4 = 0
            if (r1 == 0) goto L_0x02e0
            X.4uZ r0 = r1.A0H()
        L_0x02a3:
            boolean r0 = r0 instanceof X.C27981fH
            r3 = 1
            if (r0 == 0) goto L_0x02d9
            if (r1 == 0) goto L_0x02af
            int r0 = r1.A06
            r1 = 0
            if (r0 > 0) goto L_0x02b0
        L_0x02af:
            r1 = 1
        L_0x02b0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            X.7YJ r9 = (X.AnonymousClass7YJ) r9
            X.3ZH r1 = r9.A00
            if (r1 == 0) goto L_0x02be
            X.4uZ r4 = r1.A0H()
        L_0x02be:
            boolean r0 = r4 instanceof X.C27981fH
            if (r0 == 0) goto L_0x02d2
            if (r1 == 0) goto L_0x02c9
            int r0 = r1.A06
            if (r0 <= 0) goto L_0x02c9
            r3 = 0
        L_0x02c9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            int r3 = X.AnonymousClass2A6.A00(r2, r0)
            return r3
        L_0x02d2:
            java.lang.String r0 = r9.A01
            r3 = 3
            if (r0 == 0) goto L_0x02c9
            r3 = 2
            goto L_0x02c9
        L_0x02d9:
            java.lang.String r0 = r8.A01
            r1 = 3
            if (r0 == 0) goto L_0x02b0
            r1 = 2
            goto L_0x02b0
        L_0x02e0:
            r0 = r4
            goto L_0x02a3
        L_0x02e2:
            X.5Sw r9 = (X.C104925Sw) r9
            int r0 = r9.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.5Sw r8 = (X.C104925Sw) r8
            int r0 = r8.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = X.AnonymousClass2A6.A00(r1, r0)
            return r3
        L_0x02f7:
            java.io.File r8 = (java.io.File) r8
            java.io.File r9 = (java.io.File) r9
            long r0 = r8.lastModified()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            long r0 = r9.lastModified()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r3 = r2.compareTo(r0)
            return r3
        L_0x0310:
            X.34x r8 = (X.C624134x) r8
            X.34x r9 = (X.C624134x) r9
            long r4 = r9.A1M
            long r0 = r8.A1M
            long r4 = r4 - r0
            int r3 = (int) r4
            return r3
        L_0x031b:
            int r3 = A00(r8, r9)
            return r3
        L_0x0320:
            X.4zL r8 = (X.C97844zL) r8
            X.4zL r9 = (X.C97844zL) r9
            long r2 = r9.A00
            long r0 = r8.A00
            int r3 = java.lang.Long.compare(r2, r0)
            return r3
        L_0x032d:
            android.util.Pair r8 = (android.util.Pair) r8
            android.util.Pair r9 = (android.util.Pair) r9
            java.lang.Object r1 = r9.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r8.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r3 = r1.compareTo(r0)
            return r3
        L_0x033e:
            java.io.File r8 = (java.io.File) r8
            java.io.File r9 = (java.io.File) r9
            java.lang.String r1 = r8.getName()
            java.lang.String r0 = r9.getName()
            int r3 = r1.compareTo(r0)
            return r3
        L_0x034f:
            X.7YA r8 = (X.AnonymousClass7YA) r8
            X.7YA r9 = (X.AnonymousClass7YA) r9
            int r3 = org.pjsip.PjCameraInfo.lambda$static$0(r8, r9)
            return r3
        L_0x0358:
            X.5Tw r8 = (X.C105175Tw) r8
            X.5Tw r9 = (X.C105175Tw) r9
            boolean r0 = r8.A00()
            if (r0 == 0) goto L_0x0379
            boolean r0 = r9.A00()
            if (r0 == 0) goto L_0x03d1
            android.util.Pair r0 = r8.A08
            int r1 = X.C18290x4.A03(r0)
            android.util.Pair r0 = r9.A08
            int r0 = X.C18290x4.A03(r0)
            int r3 = java.lang.Integer.compare(r1, r0)
            return r3
        L_0x0379:
            boolean r3 = r9.A00()
            return r3
        L_0x037e:
            X.5Tw r8 = (X.C105175Tw) r8
            X.5Tw r9 = (X.C105175Tw) r9
            android.util.Pair r0 = r8.A08
            int r1 = X.C18280x3.A03(r0)
            android.util.Pair r0 = r9.A08
            int r0 = X.C18280x3.A03(r0)
            if (r1 <= r0) goto L_0x03d1
            goto L_0x03df
        L_0x0391:
            X.39M r8 = (X.AnonymousClass39M) r8
            X.39M r9 = (X.AnonymousClass39M) r9
            if (r8 == r9) goto L_0x03b4
            if (r8 == 0) goto L_0x03d1
            if (r9 == 0) goto L_0x03df
            java.lang.String r1 = r8.A0E
            if (r1 != 0) goto L_0x03a1
            java.lang.String r1 = ""
        L_0x03a1:
            java.lang.String r0 = r9.A0E
            if (r0 != 0) goto L_0x03a7
            java.lang.String r0 = ""
        L_0x03a7:
            int r3 = r1.compareTo(r0)
            return r3
        L_0x03ac:
            java.lang.Number r8 = (java.lang.Number) r8
            java.lang.Number r9 = (java.lang.Number) r9
            if (r8 != 0) goto L_0x03b6
            if (r9 != 0) goto L_0x03df
        L_0x03b4:
            r3 = 0
            return r3
        L_0x03b6:
            if (r9 == 0) goto L_0x03d1
            double r2 = r8.doubleValue()
            double r0 = r9.doubleValue()
            int r3 = java.lang.Double.compare(r2, r0)
            return r3
        L_0x03c5:
            X.5XY r8 = (X.AnonymousClass5XY) r8
            X.5XY r9 = (X.AnonymousClass5XY) r9
            int r1 = r8.A00
            int r0 = r9.A00
            if (r1 > r0) goto L_0x03df
            if (r1 >= r0) goto L_0x03e5
        L_0x03d1:
            r3 = -1
            return r3
        L_0x03d3:
            X.5XY r8 = (X.AnonymousClass5XY) r8
            X.5XY r9 = (X.AnonymousClass5XY) r9
            int r1 = r8.A01
            int r0 = r9.A01
            if (r1 > r0) goto L_0x03d1
            if (r1 >= r0) goto L_0x03e5
        L_0x03df:
            r3 = 1
            return r3
        L_0x03e1:
            X.5XY r8 = (X.AnonymousClass5XY) r8
            X.5XY r9 = (X.AnonymousClass5XY) r9
        L_0x03e5:
            long r3 = r8.A02
            long r1 = r9.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x03d1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03b4
            goto L_0x03df
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91S.compare(java.lang.Object, java.lang.Object):int");
    }
}
