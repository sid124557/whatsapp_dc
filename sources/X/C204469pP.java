package X;

import java.util.concurrent.Callable;

/* renamed from: X.9pP  reason: invalid class name and case insensitive filesystem */
public class C204469pP implements Callable {
    public Object A00;
    public final int A01;

    public C204469pP(AnonymousClass9ZS r1, int i) {
        this.A01 = i;
        switch (i) {
            case 5:
            case 6:
                this.A00 = r1;
                return;
            default:
                this.A00 = r1;
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x024e;
                case 1: goto L_0x021f;
                case 2: goto L_0x01ca;
                case 3: goto L_0x01c5;
                case 4: goto L_0x01ba;
                case 5: goto L_0x0187;
                case 6: goto L_0x0134;
                case 7: goto L_0x0127;
                case 8: goto L_0x009c;
                case 9: goto L_0x007d;
                case 10: goto L_0x0074;
                case 11: goto L_0x006b;
                case 12: goto L_0x0049;
                case 13: goto L_0x001e;
                case 14: goto L_0x02a7;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r6.A00     // Catch:{ Exception -> 0x02bb }
            X.9WQ r1 = (X.AnonymousClass9WQ) r1     // Catch:{ Exception -> 0x02bb }
            X.9ng r0 = r1.A08     // Catch:{ Exception -> 0x02bb }
            if (r0 == 0) goto L_0x0015
            r0.close()     // Catch:{ Exception -> 0x02bb }
            r0 = 0
            r1.A08 = r0     // Catch:{ Exception -> 0x02bb }
            goto L_0x02c6
        L_0x0015:
            X.9Zi r0 = r1.A0K     // Catch:{ Exception -> 0x02bb }
            X.9T9 r0 = r0.A02     // Catch:{ Exception -> 0x02bb }
            r0.A01()     // Catch:{ Exception -> 0x02bb }
            goto L_0x02c6
        L_0x001e:
            java.lang.Object r4 = r6.A00
            X.9WQ r4 = (X.AnonymousClass9WQ) r4
            boolean r0 = r4.A0Q
            r5 = 0
            if (r0 == 0) goto L_0x0048
            java.util.List r1 = r4.A0O
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0048
            r0 = 0
            java.lang.Object r0 = r1.remove(r0)
            X.9O1 r0 = (X.AnonymousClass9O1) r0
            if (r0 == 0) goto L_0x0048
            boolean r3 = r0.A00
            boolean r0 = r0.A01
            X.9Vh r2 = r4.A0N
            X.9kE r1 = new X.9kE
            r1.<init>(r4, r3, r0)
            java.lang.String r0 = "restart_preview_on_background_thread"
            r2.A07(r0, r1)
        L_0x0048:
            return r5
        L_0x0049:
            java.lang.Object r0 = r6.A00
            X.9Mu r0 = (X.AnonymousClass9Mu) r0
            X.9WQ r4 = r0.A00
            X.9T1 r1 = r4.A0H
            java.lang.String r0 = "Method onCameraSessionActive must be called on Optic Thread."
            r1.A01(r0)
            X.9Zh r3 = new X.9Zh
            r3.<init>()
            X.9Vh r2 = r4.A0N
            r0 = 11
            X.9pR r1 = new X.9pR
            r1.<init>(r3, r0, r4)
            java.lang.String r0 = "camera_session_active_on_camera_handler_thread"
            r2.A04(r0, r1)
            goto L_0x024c
        L_0x006b:
            java.lang.Object r0 = r6.A00
            X.9S3 r0 = (X.AnonymousClass9S3) r0
            r0.A00()
            goto L_0x024c
        L_0x0074:
            java.lang.Object r0 = r6.A00
            X.9Ts r0 = (X.C194609Ts) r0
            r0.A05()
            goto L_0x024c
        L_0x007d:
            java.lang.Object r1 = r6.A00
            X.9ZS r1 = (X.AnonymousClass9ZS) r1
            boolean r0 = r1.A08()
            if (r0 != 0) goto L_0x024c
            X.9WQ r3 = r1.A0Z
            boolean r0 = r3.A0Q
            if (r0 == 0) goto L_0x024c
            r0 = 0
            X.9Vh r2 = r3.A0N
            X.9kE r1 = new X.9kE
            r1.<init>(r3, r0, r0)
            java.lang.String r0 = "restart_preview_on_background_thread"
            r2.A07(r0, r1)
            goto L_0x024c
        L_0x009c:
            java.lang.Object r3 = r6.A00
            X.9ZS r3 = (X.AnonymousClass9ZS) r3
            X.AnonymousClass9WT.A00()
            android.hardware.camera2.CameraDevice r0 = r3.A0j     // Catch:{ Exception -> 0x011d }
            if (r0 == 0) goto L_0x0104
            int r0 = r3.A00     // Catch:{ Exception -> 0x011d }
            r4 = 1
            boolean r2 = X.AnonymousClass000.A1T(r0)
            X.9Ts r1 = r3.A0W     // Catch:{ Exception -> 0x011d }
            r0 = 1
            if (r2 != r4) goto L_0x00b4
            r0 = 0
        L_0x00b4:
            boolean r0 = r1.A07(r0)     // Catch:{ Exception -> 0x011d }
            if (r0 != 0) goto L_0x00c8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x011d }
            java.lang.String r0 = "Cannot switch to "
            r1.append(r0)     // Catch:{ Exception -> 0x011d }
            if (r2 != r4) goto L_0x010c
            java.lang.String r0 = "FRONT"
            goto L_0x010e
        L_0x00c8:
            r3.A0s = r4     // Catch:{ Exception -> 0x011d }
            java.lang.String r1 = r1.A03(r2)     // Catch:{ Exception -> 0x011d }
            X.AnonymousClass9ZS.A01(r3, r1)     // Catch:{ Exception -> 0x011d }
            X.AnonymousClass9ZS.A02(r3, r1)     // Catch:{ Exception -> 0x011d }
            X.AnonymousClass9ZS.A00(r3)     // Catch:{ Exception -> 0x011d }
            r0 = 0
            r3.A06(r1, r0)     // Catch:{ Exception -> 0x011d }
            int r4 = r3.A00     // Catch:{ Exception -> 0x011d }
            X.9Ux r2 = r3.B5H()     // Catch:{ Exception -> 0x011d }
            boolean r0 = r3.isConnected()     // Catch:{ Exception -> 0x011d }
            if (r0 == 0) goto L_0x00fc
            X.96t r1 = r3.A0A     // Catch:{ Exception -> 0x011d }
            if (r1 == 0) goto L_0x00fc
            X.9Ot r0 = new X.9Ot     // Catch:{ Exception -> 0x011d }
            r0.<init>(r2, r1, r4)     // Catch:{ Exception -> 0x011d }
            X.9Ou r5 = new X.9Ou     // Catch:{ Exception -> 0x011d }
            r5.<init>(r0)     // Catch:{ Exception -> 0x011d }
            X.AnonymousClass9WT.A00()     // Catch:{ Exception -> 0x011d }
            r0 = 0
            r3.A0s = r0
            return r5
        L_0x00fc:
            java.lang.String r1 = "Cannot get camera settings"
            X.9kW r0 = new X.9kW     // Catch:{ Exception -> 0x011d }
            r0.<init>(r1)     // Catch:{ Exception -> 0x011d }
            throw r0     // Catch:{ Exception -> 0x011d }
        L_0x0104:
            java.lang.String r0 = "Cannot switch camera, no cameras open."
            X.9ka r1 = new X.9ka     // Catch:{ Exception -> 0x011d }
            r1.<init>(r0)     // Catch:{ Exception -> 0x011d }
            goto L_0x011c
        L_0x010c:
            java.lang.String r0 = "BACK"
        L_0x010e:
            r1.append(r0)     // Catch:{ Exception -> 0x011d }
            java.lang.String r0 = ", camera is not present"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception -> 0x011d }
            X.9kb r1 = new X.9kb     // Catch:{ Exception -> 0x011d }
            r1.<init>(r0)     // Catch:{ Exception -> 0x011d }
        L_0x011c:
            throw r1     // Catch:{ Exception -> 0x011d }
        L_0x011d:
            r0 = move-exception
            X.AnonymousClass9WT.A00()     // Catch:{ all -> 0x0122 }
            throw r0     // Catch:{ all -> 0x0122 }
        L_0x0122:
            r1 = move-exception
            r0 = 0
            r3.A0s = r0
            throw r1
        L_0x0127:
            java.lang.Object r0 = r6.A00
            X.9Mm r0 = (X.C192979Mm) r0
            X.9ZS r0 = r0.A00
            X.9SA r0 = r0.A0a
            r0.A00()
            goto L_0x024c
        L_0x0134:
            java.lang.Object r4 = r6.A00
            X.9ZS r4 = (X.AnonymousClass9ZS) r4
            boolean r0 = r4.isConnected()
            if (r0 == 0) goto L_0x017f
            r4.A05()
            X.9Tk r0 = r4.A0k
            if (r0 == 0) goto L_0x015c
            X.9Tk r3 = r4.A0k
            int r2 = r4.A01
            r0 = 1
            r1 = 90
            if (r2 == r0) goto L_0x0159
            r0 = 2
            r1 = 180(0xb4, float:2.52E-43)
            if (r2 == r0) goto L_0x0159
            r0 = 3
            r1 = 270(0x10e, float:3.78E-43)
            if (r2 == r0) goto L_0x0159
            r1 = 0
        L_0x0159:
            r3.A04(r1)
        L_0x015c:
            int r3 = r4.A00
            X.9Ux r2 = r4.B5H()
            boolean r0 = r4.isConnected()
            if (r0 == 0) goto L_0x0177
            X.96t r1 = r4.A0A
            if (r1 == 0) goto L_0x0177
            X.9Ot r0 = new X.9Ot
            r0.<init>(r2, r1, r3)
            X.9Ou r5 = new X.9Ou
            r5.<init>(r0)
            return r5
        L_0x0177:
            java.lang.String r1 = "Cannot get camera settings"
            X.9kW r0 = new X.9kW
            r0.<init>(r1)
            throw r0
        L_0x017f:
            java.lang.String r1 = "Can not update preview display rotation"
            X.9kW r0 = new X.9kW
            r0.<init>(r1)
            throw r0
        L_0x0187:
            java.lang.Object r0 = r6.A00
            X.9ZS r0 = (X.AnonymousClass9ZS) r0
            X.9WQ r2 = r0.A0Z
            X.9T1 r1 = r2.A0H
            java.lang.String r0 = "Can only check if is retrieving preview frames from the Optic thread"
            r1.A01(r0)
            java.lang.String r0 = "Can only check if the prepared on the Optic thread"
            r1.A01(r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x01a3
            boolean r0 = r2.A0R
            if (r0 == 0) goto L_0x01a3
        L_0x01a1:
            r5 = 0
            return r5
        L_0x01a3:
            r1 = 1
            r0 = 0
            r2.A09(r1, r0)     // Catch:{ CameraAccessException | IllegalArgumentException -> 0x01a1, Exception -> 0x01a9 }
            goto L_0x01a1
        L_0x01a9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Could not start preview: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)
            X.9ka r2 = new X.9ka
            r2.<init>(r0)
            throw r2
        L_0x01ba:
            java.lang.Object r1 = r6.A00
            X.9XE r1 = (X.AnonymousClass9XE) r1
            int r0 = r1.A02
            r1.A00(r0)
            goto L_0x024c
        L_0x01c5:
            X.C194919Vb.A00()
            goto L_0x024c
        L_0x01ca:
            java.lang.Object r1 = r6.A00
            X.9ZR r1 = (X.AnonymousClass9ZR) r1
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L_0x024c
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x024c
            X.9Sn r3 = r1.A0K
            X.9Vh r1 = r3.A06
            java.lang.String r0 = "Focus reset must happen on the Optic thread."
            r1.A06(r0)
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x024c
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x024c
            r0 = 0
            r3.A07 = r0
            r3.A08 = r0
            X.9Jm r2 = X.C192379Jm.CANCELLED
            r1 = 0
            X.9lq r0 = r3.A02
            r3.A00(r1, r2, r0)
            android.hardware.Camera r0 = r3.A01
            r0.getClass()
            r0.cancelAutoFocus()
            X.9T8 r1 = r3.A05
            int r0 = r3.A00
            X.96v r2 = r1.A00(r0)
            X.9Mx r1 = X.C195049Vr.A0B
            java.util.List r0 = java.util.Collections.emptyList()
            X.AnonymousClass9My.A02(r1, r2, r0)
            X.9Mx r1 = X.C195049Vr.A0c
            java.util.List r0 = java.util.Collections.emptyList()
            X.AnonymousClass9My.A02(r1, r2, r0)
            r2.A03()
            r2.A02()
            goto L_0x024c
        L_0x021f:
            java.lang.Object r2 = r6.A00
            X.9ZR r2 = (X.AnonymousClass9ZR) r2
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x024c
            X.9TI r1 = r2.A0M
            monitor-enter(r1)
            X.9Sw r0 = r1.A05     // Catch:{ all -> 0x0248 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x0248 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0248 }
            r0 = r0 ^ 1
            monitor-exit(r1)
            if (r0 != 0) goto L_0x024c
            android.hardware.Camera r0 = r2.A0Z
            r0.getClass()
            r1.A01(r0)
            monitor-enter(r1)
            java.util.ArrayList r0 = r1.A06     // Catch:{ all -> 0x0248 }
            r0.clear()     // Catch:{ all -> 0x0248 }
            goto L_0x024b
        L_0x0248:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x024b:
            monitor-exit(r1)
        L_0x024c:
            r5 = 0
            return r5
        L_0x024e:
            java.lang.Object r4 = r6.A00
            X.9ZR r4 = (X.AnonymousClass9ZR) r4
            X.AnonymousClass9WT.A00()
            java.lang.String r0 = "Cannot switch cameras."
            r4.A0B(r0)     // Catch:{ Exception -> 0x02a2 }
            int r0 = r4.A00     // Catch:{ Exception -> 0x02a2 }
            r3 = 1
            boolean r2 = X.AnonymousClass000.A1T(r0)
            X.9Vb r0 = r4.A0J     // Catch:{ Exception -> 0x02a2 }
            boolean r0 = r0.A06(r2)     // Catch:{ Exception -> 0x02a2 }
            if (r0 != 0) goto L_0x0289
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x02a2 }
            java.lang.String r0 = "Cannot switch to "
            r1.append(r0)     // Catch:{ Exception -> 0x02a2 }
            if (r2 != r3) goto L_0x0275
            goto L_0x0278
        L_0x0275:
            java.lang.String r0 = "BACK"
            goto L_0x027a
        L_0x0278:
            java.lang.String r0 = "FRONT"
        L_0x027a:
            r1.append(r0)     // Catch:{ Exception -> 0x02a2 }
            java.lang.String r0 = ", camera is not present"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception -> 0x02a2 }
            X.9kb r0 = new X.9kb     // Catch:{ Exception -> 0x02a2 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x02a2 }
            throw r0     // Catch:{ Exception -> 0x02a2 }
        L_0x0289:
            X.9nz r0 = r4.A09     // Catch:{ Exception -> 0x02a2 }
            r4.A0A(r0, r2)     // Catch:{ Exception -> 0x02a2 }
            X.9nz r2 = r4.A09     // Catch:{ Exception -> 0x02a2 }
            r2.getClass()     // Catch:{ Exception -> 0x02a2 }
            X.9SV r1 = r4.A07     // Catch:{ Exception -> 0x02a2 }
            r1.getClass()     // Catch:{ Exception -> 0x02a2 }
            int r0 = r4.A01     // Catch:{ Exception -> 0x02a2 }
            X.9Ou r5 = r4.A01(r1, r2, r0)     // Catch:{ Exception -> 0x02a2 }
            X.AnonymousClass9WT.A00()     // Catch:{ Exception -> 0x02a2 }
            return r5
        L_0x02a2:
            r2 = move-exception
            X.AnonymousClass9WT.A00()
            throw r2
        L_0x02a7:
            java.lang.Object r1 = r6.A00     // Catch:{ Exception -> 0x02bb }
            X.9WQ r1 = (X.AnonymousClass9WQ) r1     // Catch:{ Exception -> 0x02bb }
            X.9ng r0 = r1.A08     // Catch:{ Exception -> 0x02bb }
            if (r0 == 0) goto L_0x02b3
            r0.Avz()     // Catch:{ Exception -> 0x02bb }
            goto L_0x02c6
        L_0x02b3:
            X.9Zi r0 = r1.A0K     // Catch:{ Exception -> 0x02bb }
            X.9T9 r0 = r0.A02     // Catch:{ Exception -> 0x02bb }
            r0.A01()     // Catch:{ Exception -> 0x02bb }
            goto L_0x02c6
        L_0x02bb:
            java.lang.Object r1 = r6.A00
            X.9WQ r1 = (X.AnonymousClass9WQ) r1
            X.9Zi r0 = r1.A0K
            X.9T9 r0 = r0.A02
            r0.A01()
        L_0x02c6:
            X.9Zi r5 = r1.A0K
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204469pP.call():java.lang.Object");
    }

    public C204469pP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
