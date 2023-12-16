package X;

import java.util.concurrent.Callable;

/* renamed from: X.91I  reason: invalid class name */
public class AnonymousClass91I implements Callable {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass91I(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if (r0 != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r10 = this;
            int r0 = r10.A02
            switch(r0) {
                case 0: goto L_0x00bb;
                case 1: goto L_0x006c;
                case 2: goto L_0x004f;
                case 3: goto L_0x002d;
                case 4: goto L_0x001f;
                case 5: goto L_0x0012;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r10.A00
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r1 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r1
            java.lang.Object r0 = r10.A01
            com.whatsapp.voipcalling.camera.VoipCamera r0 = (com.whatsapp.voipcalling.camera.VoipCamera) r0
            java.lang.Integer r0 = r1.lambda$unregisterVirtualCamera$8(r0)
            return r0
        L_0x0012:
            java.lang.Object r1 = r10.A00
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r1 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r1
            java.lang.Object r0 = r10.A01
            com.whatsapp.voipcalling.camera.VoipCamera r0 = (com.whatsapp.voipcalling.camera.VoipCamera) r0
            java.lang.Integer r0 = r1.lambda$registerVirtualCamera$7(r0)
            return r0
        L_0x001f:
            java.lang.Object r1 = r10.A00
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r1 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r1
            java.lang.Object r0 = r10.A01
            com.whatsapp.voipcalling.VideoPort r0 = (com.whatsapp.voipcalling.VideoPort) r0
            int r1 = r1.setVideoPortOnCameraThread(r0)
            goto L_0x00b6
        L_0x002d:
            java.lang.Object r3 = r10.A00
            X.8KC r3 = (X.AnonymousClass8KC) r3
            java.lang.Object r2 = r10.A01
            X.7X0 r2 = (X.AnonymousClass7X0) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/CoreVideoPort/ releasing surface texture holder for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r3.A0F
            X.C18260x0.A0o(r0, r1)
            r2.A00()
            android.os.HandlerThread r0 = r3.A0B
            X.C626936e.A03(r0)
            r0 = 0
            r3.A04 = r0
            goto L_0x006a
        L_0x004f:
            java.lang.Object r2 = r10.A00
            X.8KC r2 = (X.AnonymousClass8KC) r2
            java.lang.Object r1 = r10.A01
            float[] r1 = (float[]) r1
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0I
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0061
            r1 = -6
            goto L_0x00b6
        L_0x0061:
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r2.A0G
            boolean r0 = r0.setBackgroundColor(r1)
            r1 = -2
            if (r0 == 0) goto L_0x00b6
        L_0x006a:
            r1 = 0
            goto L_0x00b6
        L_0x006c:
            java.lang.Object r1 = r10.A00
            X.6qU r1 = (X.C138506qU) r1
            java.lang.Object r2 = r10.A01
            X.7k4 r2 = (X.C158497k4) r2
            boolean r0 = X.C107385bE.A0B()
            if (r0 != 0) goto L_0x0084
            android.hardware.display.VirtualDisplay r0 = r1.A00
            if (r0 == 0) goto L_0x0081
            r0.release()
        L_0x0081:
            r0 = 0
            r1.A00 = r0
        L_0x0084:
            android.media.Image r0 = r1.A01
            if (r0 == 0) goto L_0x008b
            r0.close()
        L_0x008b:
            r0 = 0
            r1.A01 = r0
            android.media.ImageReader r0 = r1.A02
            r0.close()
            r1.stopPeriodicCameraCallbackCheck()
            r1.A03 = r2
            int r3 = r2.A02
            int r4 = r2.A01
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r1.A04
            int r5 = r0.format
            int r6 = r0.fps1000
            boolean r7 = r0.isFrontCamera
            int r8 = r0.orientation
            int r9 = r0.idx
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r2 = new com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.A04 = r2
            r1.A01()
            int r1 = r1.A00()
        L_0x00b6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x00bb:
            java.lang.Object r0 = r10.A01     // Catch:{ all -> 0x00cb }
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0     // Catch:{ all -> 0x00cb }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00cb }
            X.8v9 r0 = (X.C186348v9) r0     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00d6
            r0.release()     // Catch:{ all -> 0x00cb }
            goto L_0x00d6
        L_0x00cb:
            r2 = move-exception
            java.lang.Object r0 = r10.A00
            X.7kj r0 = (X.C158897kj) r0
            android.os.Handler r1 = r0.A0E
            r0 = 7
            X.C18290x4.A1C(r1, r2, r0)
        L_0x00d6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91I.call():java.lang.Object");
    }
}
