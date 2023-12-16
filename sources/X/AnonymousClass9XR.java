package X;

import android.os.Handler;

/* renamed from: X.9XR  reason: invalid class name */
public class AnonymousClass9XR implements Handler.Callback {
    public static void A00(AnonymousClass9VT r9) {
        if (r9 != null) {
            int A0K = AnonymousClass001.A0K(r9.A00(AnonymousClass9VT.A0H));
            int A0K2 = AnonymousClass001.A0K(r9.A00(AnonymousClass9VT.A0G));
            String str = (String) r9.A01(AnonymousClass9VT.A0K);
            String str2 = (String) r9.A01(AnonymousClass9VT.A0M);
            int A0K3 = AnonymousClass001.A0K(r9.A00(AnonymousClass9VT.A0I));
            int A0K4 = AnonymousClass001.A0K(r9.A00(AnonymousClass9VT.A0F));
            int i = 0;
            if (A0K4 != 0) {
                i = 1;
                if (1 != A0K4) {
                    throw C1899593h.A0Y("Could not convert camera facing from optic: ", AnonymousClass001.A0o(), A0K4);
                }
            }
            Object A01 = r9.A01(AnonymousClass9VT.A0L);
            A01.getClass();
            if (AnonymousClass001.A1Z(A01)) {
                Object A012 = r9.A01(AnonymousClass9VT.A0J);
                A012.getClass();
                ((Number) A012).intValue();
            }
            Object A013 = r9.A01(AnonymousClass9VT.A0R);
            A013.getClass();
            ((Number) A013).intValue();
            new C194279Sg(str, str2, A0K, A0K2, A0K3, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fa, code lost:
        r1.BOH(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fd, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r13) {
        /*
            r12 = this;
            int r0 = r13.what
            r7 = 2
            r6 = 1
            r3 = 0
            switch(r0) {
                case 1: goto L_0x0009;
                case 2: goto L_0x0020;
                case 3: goto L_0x0040;
                case 4: goto L_0x005f;
                case 5: goto L_0x0187;
                case 6: goto L_0x0196;
                case 7: goto L_0x0082;
                case 8: goto L_0x009f;
                case 9: goto L_0x00bd;
                case 10: goto L_0x00de;
                case 11: goto L_0x00fe;
                case 12: goto L_0x011a;
                case 13: goto L_0x0133;
                case 14: goto L_0x0133;
                case 15: goto L_0x0148;
                default: goto L_0x0008;
            }
        L_0x0008:
            return r3
        L_0x0009:
            java.lang.Object r2 = r13.obj
            java.util.List r2 = (java.util.List) r2
            r1 = 0
        L_0x000e:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0008
            java.lang.Object r0 = r2.get(r1)
            X.9nc r0 = (X.C203389nc) r0
            r0.BOK()
            int r1 = r1 + 1
            goto L_0x000e
        L_0x0020:
            java.lang.Object r2 = r13.obj
            java.util.List r2 = (java.util.List) r2
            r1 = 0
        L_0x0025:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0008
            java.lang.Object r0 = r2.get(r1)
            X.9nc r0 = (X.C203389nc) r0
            r0.BON()
            java.lang.Object r0 = r2.get(r1)
            X.9nc r0 = (X.C203389nc) r0
            r0.BOK()
            int r1 = r1 + 1
            goto L_0x0025
        L_0x0040:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r4 = r0[r3]
            java.util.List r4 = (java.util.List) r4
            r2 = r0[r6]
            java.lang.Exception r2 = (java.lang.Exception) r2
            r1 = 0
        L_0x004d:
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x0008
            java.lang.Object r0 = r4.get(r1)
            X.9nc r0 = (X.C203389nc) r0
            r0.BOG(r2)
            int r1 = r1 + 1
            goto L_0x004d
        L_0x005f:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r5 = r0[r3]
            java.util.List r5 = (java.util.List) r5
            r4 = r0[r6]
            java.lang.String r4 = (java.lang.String) r4
            r2 = r0[r7]
            java.lang.String r2 = (java.lang.String) r2
            r1 = 0
        L_0x0070:
            int r0 = r5.size()
            if (r1 >= r0) goto L_0x0008
            java.lang.Object r0 = r5.get(r1)
            X.9nc r0 = (X.C203389nc) r0
            r0.BOL(r4, r2)
            int r1 = r1 + 1
            goto L_0x0070
        L_0x0082:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r2 = r0[r3]
            X.9O4 r2 = (X.AnonymousClass9O4) r2
            r4 = r0[r6]
            java.lang.Exception r4 = (java.lang.Exception) r4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LiteCamera/onCaptureError: "
            X.C18260x0.A1P(r1, r0, r4)
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r2.A01
            X.8uQ r1 = r0.A00
            if (r1 == 0) goto L_0x0008
            r0 = 3
            goto L_0x00fa
        L_0x009f:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = r0[r3]
            X.9N8 r1 = (X.AnonymousClass9N8) r1
            r0 = r0[r6]
            X.9VT r0 = (X.AnonymousClass9VT) r0
            A00(r0)
            java.lang.String r0 = "LiteCamera/onRecordingStarted"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r1.A00
            X.8uQ r0 = r0.A00
            if (r0 == 0) goto L_0x0008
            r0.BfF()
            return r3
        L_0x00bd:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = r0[r3]
            X.9N8 r1 = (X.AnonymousClass9N8) r1
            r0 = r0[r6]
            X.9VT r0 = (X.AnonymousClass9VT) r0
            A00(r0)
            java.lang.String r0 = "LiteCamera/onRecordingEnded"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            com.whatsapp.camera.litecamera.LiteCameraView r1 = r1.A00
            java.lang.Runnable r0 = r1.A04
            if (r0 == 0) goto L_0x0008
            r0.run()
            r0 = 0
            r1.A04 = r0
            return r3
        L_0x00de:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r2 = r0[r3]
            X.9N8 r2 = (X.AnonymousClass9N8) r2
            r4 = r0[r6]
            java.lang.Exception r4 = (java.lang.Exception) r4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LiteCamera/onRecordingError: "
            X.C18260x0.A1P(r1, r0, r4)
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r2.A00
            X.8uQ r1 = r0.A00
            if (r1 == 0) goto L_0x0008
            r0 = 4
        L_0x00fa:
            r1.BOH(r4, r0)
            return r3
        L_0x00fe:
            java.lang.Object r1 = r13.obj
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0 = r1[r3]
            X.9N9 r0 = (X.AnonymousClass9N9) r0
            r4 = r1[r6]
            android.graphics.Point r4 = (android.graphics.Point) r4
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r0.A00
            X.8uQ r2 = r0.A00
            if (r2 == 0) goto L_0x0008
            int r0 = r4.x
            float r1 = (float) r0
            int r0 = r4.y
            float r0 = (float) r0
            r2.BN3(r1, r0)
            return r3
        L_0x011a:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r0 = r0[r3]
            X.9N9 r0 = (X.AnonymousClass9N9) r0
            com.whatsapp.camera.litecamera.LiteCameraView r2 = r0.A00
            X.9oA r1 = r2.A0E
            r0 = 0
            X.9Yl r1 = (X.C195579Yl) r1
            r1.A0E = r0
            X.8uQ r0 = r2.A00
            if (r0 == 0) goto L_0x0008
            r0.BN4(r6)
            return r3
        L_0x0133:
            java.lang.Object r0 = r13.obj
            X.9N9 r0 = (X.AnonymousClass9N9) r0
            com.whatsapp.camera.litecamera.LiteCameraView r2 = r0.A00
            X.9oA r1 = r2.A0E
            r0 = 0
            X.9Yl r1 = (X.C195579Yl) r1
            r1.A0E = r0
            X.8uQ r0 = r2.A00
            if (r0 == 0) goto L_0x0008
            r0.BN4(r3)
            return r3
        L_0x0148:
            java.lang.Object r1 = r13.obj
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r4 = r1[r3]
            X.9Yl r4 = (X.C195579Yl) r4
            r2 = r1[r6]
            X.9Ou r2 = (X.C193479Ou) r2
            r0 = r1[r7]
            int r7 = X.AnonymousClass001.A0K(r0)
            r0 = 3
            r0 = r1[r0]
            int r8 = X.AnonymousClass001.A0K(r0)
            if (r7 <= 0) goto L_0x0008
            if (r8 <= 0) goto L_0x0008
            X.9Vr r1 = r2.A02
            X.9Mx r0 = X.C195049Vr.A0n
            java.lang.Object r0 = r1.A08(r0)
            X.9T4 r0 = (X.AnonymousClass9T4) r0
            if (r0 == 0) goto L_0x0008
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            X.9nu r5 = r4.A0Q
            int r9 = r0.A02
            int r10 = r0.A01
            boolean r11 = r4.A0F
            r5.Bny(r6, r7, r8, r9, r10, r11)
            int r0 = r2.A00
            r5.BG9(r6, r7, r8, r0)
            return r3
        L_0x0187:
            java.lang.Object r1 = r13.obj
            X.9O4 r1 = (X.AnonymousClass9O4) r1
            java.lang.String r0 = "LiteCamera/onCaptureStarted"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.5PM r0 = r1.A00
            r0.A00()
            return r3
        L_0x0196:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r5 = r0[r3]
            X.9O4 r5 = (X.AnonymousClass9O4) r5
            r4 = r0[r6]
            byte[] r4 = (byte[]) r4
            r1 = r0[r7]
            X.9VN r1 = (X.AnonymousClass9VN) r1
            if (r1 == 0) goto L_0x01df
            int r0 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = X.AnonymousClass001.A0K(r0)
            if (r2 == 0) goto L_0x01c1
            if (r6 == r2) goto L_0x01c1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Could not convert camera facing from optic: "
            java.lang.RuntimeException r0 = X.C1899593h.A0Y(r0, r1, r2)
            throw r0
        L_0x01c1:
            X.9N2 r0 = X.AnonymousClass9VN.A0T
            r1.A00(r0)
            X.9N2 r0 = X.AnonymousClass9VN.A0Z
            r1.A00(r0)
            X.9N2 r0 = X.AnonymousClass9VN.A0O
            r1.A00(r0)
            X.9N2 r0 = X.AnonymousClass9VN.A0V
            r1.A00(r0)
            X.9N2 r0 = X.AnonymousClass9VN.A0P
            r1.A00(r0)
            X.9N2 r0 = X.AnonymousClass9VN.A0R
            r1.A00(r0)
        L_0x01df:
            java.lang.String r0 = "LiteCamera/onPhotoTaken"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.5PM r1 = r5.A00
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r5.A01
            boolean r0 = r0.BHe()
            r1.A01(r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9XR.handleMessage(android.os.Message):boolean");
    }
}
