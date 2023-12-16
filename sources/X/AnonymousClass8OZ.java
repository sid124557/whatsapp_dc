package X;

import java.util.concurrent.Callable;

/* renamed from: X.8OZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8OZ implements Callable {
    public final /* synthetic */ AnonymousClass8KC A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r5 = this;
            X.8KC r4 = r5.A00
            boolean r0 = r5.A02
            java.lang.Object r1 = r5.A01
            if (r0 == 0) goto L_0x000b
            r4.A08()
        L_0x000b:
            boolean r0 = r4.A0E()
            r3 = 0
            if (r0 != 0) goto L_0x00d9
            android.os.HandlerThread r2 = r4.A0B
            X.C626936e.A03(r2)
            r4.A08()     // Catch:{ RuntimeException -> 0x00ce }
            boolean r0 = r1 instanceof android.view.Surface     // Catch:{ RuntimeException -> 0x00ce }
            if (r0 == 0) goto L_0x002d
            X.7kN r0 = r4.A07     // Catch:{ RuntimeException -> 0x00ce }
            android.view.Surface r1 = (android.view.Surface) r1     // Catch:{ RuntimeException -> 0x00ce }
            X.8fz r0 = (X.C177508fz) r0     // Catch:{ RuntimeException -> 0x00ce }
            r0.A06(r1)     // Catch:{ RuntimeException -> 0x00ce }
        L_0x0027:
            X.7kN r0 = r4.A07     // Catch:{ RuntimeException -> 0x00ce }
            r0.A02()     // Catch:{ RuntimeException -> 0x00ce }
            goto L_0x003b
        L_0x002d:
            boolean r0 = r1 instanceof android.graphics.SurfaceTexture     // Catch:{ RuntimeException -> 0x00ce }
            if (r0 == 0) goto L_0x0027
            X.7kN r0 = r4.A07     // Catch:{ RuntimeException -> 0x00ce }
            android.graphics.SurfaceTexture r1 = (android.graphics.SurfaceTexture) r1     // Catch:{ RuntimeException -> 0x00ce }
            X.8fz r0 = (X.C177508fz) r0     // Catch:{ RuntimeException -> 0x00ce }
            r0.A06(r1)     // Catch:{ RuntimeException -> 0x00ce }
            goto L_0x0027
        L_0x003b:
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x005e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/CoreVideoPort//createEglSurfaceInGlThread flush texture "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r4.A0F
            X.C18260x0.A0m(r0, r1)
            X.C626936e.A03(r2)
            X.7X0 r0 = r4.A04
            if (r0 == 0) goto L_0x005e
            android.graphics.SurfaceTexture r0 = r0.A01
            r0.updateTexImage()
            X.C626936e.A03(r2)
            r4.A08 = r3
        L_0x005e:
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A0I
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L_0x00a6
            boolean r2 = r4.A0J
            com.whatsapp.voipcalling.GlVideoRenderer r1 = r4.A0G
            r0 = 29
            boolean r0 = r1.init(r0, r2)
            if (r0 != 0) goto L_0x0086
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/CoreVideoPort/VideoRenderer.init() failed for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r4.A0F
            X.C18260x0.A0n(r0, r1)
            r4.A07()
            r0 = 0
            goto L_0x00d6
        L_0x0086:
            X.8y5 r0 = r4.A03
            boolean r0 = r0.BIo()
            if (r0 == 0) goto L_0x00cb
            float[] r2 = X.AnonymousClass8KC.A0P
        L_0x0090:
            boolean r0 = X.AnonymousClass8KC.A00(r4)
            if (r0 == 0) goto L_0x00a8
            android.os.Handler r1 = r4.A0A
            r0 = 8
            r1.removeMessages(r0)
            android.os.Message r1 = r1.obtainMessage(r0, r2)
            java.lang.String r0 = "setBackgroundColor"
            r4.A03(r1, r0)
        L_0x00a6:
            r0 = 1
            goto L_0x00d6
        L_0x00a8:
            r1 = 2
            X.91I r0 = new X.91I
            r0.<init>(r4, r1, r2)
            int r2 = r4.A04(r0)
            if (r2 == 0) goto L_0x00a6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/CoreVideoPort/setBackgroundColor failed: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r4.A0F
            X.C18260x0.A0o(r0, r1)
            goto L_0x00a6
        L_0x00cb:
            float[] r2 = X.AnonymousClass8KC.A0N
            goto L_0x0090
        L_0x00ce:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r4.A07()
            r0 = 0
        L_0x00d6:
            if (r0 != 0) goto L_0x00d9
            r3 = -6
        L_0x00d9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8OZ.call():java.lang.Object");
    }

    public /* synthetic */ AnonymousClass8OZ(AnonymousClass8KC r1, Object obj, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = obj;
    }
}
