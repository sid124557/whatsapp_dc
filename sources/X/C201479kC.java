package X;

import java.util.concurrent.Callable;

/* renamed from: X.9kC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201479kC implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass9ZR A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0113, code lost:
        if (X.AnonymousClass0x7.A1U(r1, 6) != false) goto L_0x0115;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r14 = this;
            X.9ZR r6 = r14.A01
            java.lang.String r8 = r14.A02
            long r3 = r14.A00
            java.lang.String r0 = "Camera1Device.startVideoRecording.startVideoTask.call"
            android.os.Trace.beginSection(r0)
            java.util.HashSet r9 = X.AnonymousClass9UX.A01
            boolean r0 = X.C194989Vk.A02(r9)
            if (r0 != 0) goto L_0x002a
            X.9Sn r2 = r6.A0K
            X.9Vh r1 = r2.A06
            java.lang.String r0 = "Setting focus mode for video must happen on the Optic thread."
            r1.A06(r0)
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x002a
            r0 = 1
            r2.A0A = r0
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x00f7
            r0 = 0
            r2.A04 = r0
        L_0x002a:
            X.9T8 r1 = r6.A0P
            int r0 = r6.A00
            X.9Vr r5 = r1.A02(r0)
            X.9Mx r0 = X.C195049Vr.A0T
            boolean r0 = X.C195049Vr.A07(r0, r5)
            r6.A0C = r0
            X.9Mx r0 = X.C195049Vr.A0A
            int r0 = X.C195049Vr.A02(r0, r5)
            r6.A02 = r0
            int r0 = r6.A00
            X.9Vr r10 = r1.A02(r0)
            boolean r13 = X.C194989Vk.A02(r9)
            X.9nz r1 = r6.A09
            r1.getClass()
            X.9Mv r0 = X.C203589nz.A01
            java.lang.Object r0 = r1.B3x(r0)
            int r12 = X.AnonymousClass001.A0K(r0)
            r0 = -1
            r11 = 1
            if (r12 == r0) goto L_0x00f4
            int r0 = r6.A00
            boolean r0 = android.media.CamcorderProfile.hasProfile(r0, r12)
            if (r0 == 0) goto L_0x00f4
        L_0x0067:
            X.9Vb r7 = r6.A0J
            int r0 = r6.A00
            int r0 = r7.A02(r0)
            android.media.CamcorderProfile r2 = android.media.CamcorderProfile.get(r0, r12)
            X.9Mx r0 = X.C195049Vr.A0u
            java.lang.Object r9 = r10.A08(r0)
            X.9T4 r9 = (X.AnonymousClass9T4) r9
            if (r9 != 0) goto L_0x0085
            X.9Mx r0 = X.C195049Vr.A0n
            java.lang.Object r9 = r10.A08(r0)
            X.9T4 r9 = (X.AnonymousClass9T4) r9
        L_0x0085:
            r9.getClass()
            int r1 = r9.A01
            if (r13 == 0) goto L_0x008e
            if (r12 != r11) goto L_0x00b4
        L_0x008e:
            r0 = 2
            r2.videoCodec = r0
            int r0 = r9.A02
            r2.videoFrameWidth = r0
            r2.videoFrameHeight = r1
            X.9Mx r0 = X.C195049Vr.A0s
            int r0 = X.C195049Vr.A02(r0, r10)
            r2.videoFrameRate = r0
            X.9nz r1 = r6.A09
            X.9Mv r0 = X.C203589nz.A0T
            java.lang.Object r1 = r1.B3x(r0)
            X.9Jv r0 = X.C192459Jv.HIGH
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 5000000(0x4c4b40, float:7.006492E-39)
        L_0x00b2:
            r2.videoBitRate = r0
        L_0x00b4:
            int r1 = r6.A00
            int r0 = r6.A0Y
            int r0 = r7.A03(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L_0x00c9
            int r1 = r6.A00
            int r0 = r6.A0Y
            r7.A03(r1, r0)
        L_0x00c9:
            int r1 = r6.A00
            X.9Mx r0 = X.C195049Vr.A0L
            java.lang.Object r0 = r5.A08(r0)
            r0.getClass()
            X.9Tk r0 = r6.A0a
            r0.getClass()
            r6.A05 = r0
            goto L_0x0125
        L_0x00dc:
            X.9Jv r0 = X.C192459Jv.MEDIUM
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e8
            r0 = 3000000(0x2dc6c0, float:4.203895E-39)
            goto L_0x00b2
        L_0x00e8:
            X.9Jv r0 = X.C192459Jv.LOW
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b4
            r0 = 1000000(0xf4240, float:1.401298E-39)
            goto L_0x00b2
        L_0x00f4:
            r12 = 1
            goto L_0x0067
        L_0x00f7:
            X.9T8 r1 = r2.A05
            int r0 = r2.A00
            X.96v r7 = r1.A00(r0)
            X.96p r1 = r7.A00
            X.9Mw r0 = X.C194899Ux.A0k
            java.util.List r1 = X.C194899Ux.A03(r0, r1)
            r5 = 3
            boolean r0 = X.AnonymousClass0x7.A1U(r1, r5)
            if (r0 != 0) goto L_0x0115
            r5 = 6
            boolean r0 = X.AnonymousClass0x7.A1U(r1, r5)
            if (r0 == 0) goto L_0x0120
        L_0x0115:
            X.9Sv r2 = r7.A00
            X.9Mx r1 = X.C195049Vr.A0C
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.A01(r1, r0)
        L_0x0120:
            r7.A02()
            goto L_0x002a
        L_0x0125:
            X.9VT r0 = r0.A01(r2, r8, r1)     // Catch:{ all -> 0x0144 }
            r6.A0A = r0     // Catch:{ all -> 0x0144 }
            android.hardware.Camera r0 = r6.A0Z
            r0.getClass()
            r0.lock()
            X.9VT r2 = r6.A0A
            X.9N3 r1 = X.AnonymousClass9VT.A0N
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.A02(r1, r0)
            android.os.Trace.endSection()
            X.9VT r0 = r6.A0A
            return r0
        L_0x0144:
            r1 = move-exception
            android.hardware.Camera r0 = r6.A0Z
            r0.getClass()
            r0.lock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201479kC.call():java.lang.Object");
    }

    public /* synthetic */ C201479kC(AnonymousClass9ZR r1, String str, long j) {
        this.A01 = r1;
        this.A02 = str;
        this.A00 = j;
    }
}
