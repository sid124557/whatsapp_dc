package X;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: X.6Dt  reason: invalid class name and case insensitive filesystem */
public class C124756Dt extends Handler {
    public final Handler A00 = AnonymousClass000.A0A();
    public final WeakReference A01;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
        r2.append(r0);
        X.C18260x0.A0n(r3.A0F, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0096, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b3, code lost:
        r5.post(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            java.lang.ref.WeakReference r0 = r7.A01
            java.lang.Object r3 = r0.get()
            X.8KC r3 = (X.AnonymousClass8KC) r3
            if (r3 == 0) goto L_0x0010
            int r0 = r8.what
            r5 = 0
            switch(r0) {
                case 1: goto L_0x0033;
                case 2: goto L_0x00f7;
                case 3: goto L_0x0057;
                case 4: goto L_0x001e;
                case 5: goto L_0x0010;
                case 6: goto L_0x006f;
                case 7: goto L_0x00b7;
                case 8: goto L_0x00d9;
                case 9: goto L_0x0106;
                case 10: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r1 = r8.obj
            android.os.Handler r5 = r7.A00
            r0 = 43
            X.3a5 r4 = new X.3a5
            r4.<init>(r3, r0, r1)
            goto L_0x00b3
        L_0x001e:
            int r1 = r3.A01()
            if (r1 == 0) goto L_0x0010
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/CoreVideoPort/create failed to init EGL ("
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ") for "
            goto L_0x008e
        L_0x0033:
            int r2 = r8.arg1
            int r1 = r8.arg2
            boolean r0 = r3.A0E()
            if (r0 != 0) goto L_0x0044
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/CoreVideoPort/setWindowSize failed: -6 for "
            goto L_0x008e
        L_0x0044:
            float[] r0 = X.AnonymousClass8KC.A0O
            r3.A05(r0)
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r3.A0G
            r0.setWindow(r5, r5, r2, r1)
            android.os.Handler r5 = r7.A00
            r0 = 1
            X.3aE r4 = new X.3aE
            r4.<init>(r3, r2, r1, r0)
            goto L_0x00b3
        L_0x0057:
            java.lang.Object r0 = r8.obj
            X.C626936e.A06(r0)
            float r1 = X.AnonymousClass001.A05(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0I
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0109
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/CoreVideoPort/setCornerRadius failed: -6 for "
            goto L_0x008e
        L_0x006f:
            int r6 = r8.arg1
            int r4 = r8.arg2
            java.lang.Object r2 = r8.obj
            X.C626936e.A06(r2)
            X.7X0 r2 = (X.AnonymousClass7X0) r2
            r0 = 1
            android.os.HandlerThread r1 = r3.A0B
            X.C626936e.A03(r1)
            r3.A08 = r0
            boolean r0 = r3.A0E()
            if (r0 != 0) goto L_0x0097
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/CoreVideoPort/renderTexture failed: -6 for "
        L_0x008e:
            r2.append(r0)
            com.whatsapp.jid.UserJid r0 = r3.A0F
            X.C18260x0.A0n(r0, r2)
            return
        L_0x0097:
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r3.A0G
            boolean r0 = r2.A01(r0, r6, r4)
            if (r0 == 0) goto L_0x0010
            X.C626936e.A03(r1)
            r3.A08 = r5
            int r0 = r3.A02()
            if (r0 != 0) goto L_0x0010
            android.os.Handler r5 = r7.A00
            r0 = 39
            X.5sL r4 = new X.5sL
            r4.<init>((java.lang.Object) r3, (int) r0)
        L_0x00b3:
            r5.post(r4)
            return
        L_0x00b7:
            java.lang.Object r0 = r8.obj
            if (r0 == 0) goto L_0x0010
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/CoreVideoPort/ releasing surface texture holder for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r3.A0F
            X.C18260x0.A0o(r0, r1)
            java.lang.Object r0 = r8.obj
            X.7X0 r0 = (X.AnonymousClass7X0) r0
            r0.A00()
            android.os.HandlerThread r0 = r3.A0B
            X.C626936e.A03(r0)
            r0 = 0
            r3.A04 = r0
            return
        L_0x00d9:
            java.lang.Object r1 = r8.obj
            X.C626936e.A06(r1)
            float[] r1 = (float[]) r1
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r3.A0G
            boolean r0 = r0.setBackgroundColor(r1)
            if (r0 != 0) goto L_0x0010
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/CoreVideoPort/setBackgroundColor failed: for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r3.A0F
            X.C18260x0.A0o(r0, r1)
            return
        L_0x00f7:
            java.lang.Object r0 = r8.obj
            X.C626936e.A06(r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r3.A0G
            r0.setScaleType(r1)
            return
        L_0x0106:
            r3.A0M = r5
            return
        L_0x0109:
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r3.A0G
            r0.setCornerRadius(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124756Dt.handleMessage(android.os.Message):void");
    }

    public C124756Dt(Looper looper, AnonymousClass8KC r3) {
        super(looper);
        this.A01 = AnonymousClass0x9.A14(r3);
    }
}
