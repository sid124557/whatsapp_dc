package X;

import com.whatsapp.R;
import com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment;

/* renamed from: X.5sH  reason: invalid class name and case insensitive filesystem */
public class C117655sH implements Runnable {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public C117655sH(ImageQualitySettingsBottomSheetFragment imageQualitySettingsBottomSheetFragment, boolean z) {
        this.A03 = 2;
        this.A01 = imageQualitySettingsBottomSheetFragment;
        this.A02 = z;
        this.A00 = R.string.f11nameremoved;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.A03
            switch(r0) {
                case 0: goto L_0x0077;
                case 1: goto L_0x008f;
                case 2: goto L_0x0134;
                case 3: goto L_0x00ac;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r10.A01
            X.85H r1 = (X.AnonymousClass85H) r1
            int r5 = r10.A00
            boolean r7 = r10.A02
            r4 = 0
            r6 = 1
            if (r5 != r6) goto L_0x0017
            X.567 r0 = r1.A00
            r0.A0P = r4
            r0.A0D = r4
        L_0x0017:
            X.567 r3 = r1.A00
            boolean r0 = r3.A0P
            if (r0 != 0) goto L_0x0067
            X.8pt r0 = r3.A0A
            if (r0 == 0) goto L_0x0024
            r0.BYM(r7, r5)
        L_0x0024:
            r2 = 3
            if (r5 != r2) goto L_0x0038
            if (r7 == 0) goto L_0x0038
            boolean r0 = r3.A0Q
            if (r0 == 0) goto L_0x0038
            r3.A0Q = r4
            X.561 r1 = r3.A0D
            if (r1 == 0) goto L_0x0038
            r0 = 500(0x1f4, float:7.0E-43)
            r1.A0E(r0)
        L_0x0038:
            X.7bE r0 = r3.A0B
            if (r0 == 0) goto L_0x003f
            r0.A05(r7, r5)
        L_0x003f:
            if (r5 != r2) goto L_0x0068
            if (r7 == 0) goto L_0x0068
            boolean r0 = r3.A0O
            if (r0 != 0) goto L_0x0050
            r3.A0O = r6
            X.8ps r0 = r3.A09
            if (r0 == 0) goto L_0x0050
            r0.Bc9(r3)
        L_0x0050:
            r3.A0N = r4
        L_0x0052:
            boolean r2 = r3.A0E
            r1 = 2
            boolean r0 = X.AnonymousClass000.A1U(r5, r1)
            if (r2 == r0) goto L_0x0067
            if (r5 != r1) goto L_0x005e
            r4 = 1
        L_0x005e:
            r3.A0E = r4
            X.8pp r0 = r3.A06
            if (r0 == 0) goto L_0x0067
            r0.BNm(r3, r4)
        L_0x0067:
            return
        L_0x0068:
            r3.A0D = r4
            r0 = 4
            if (r5 != r0) goto L_0x0050
            boolean r0 = r3.A0N
            if (r0 != 0) goto L_0x0052
            r3.A0N = r6
            r3.A0H()
            goto L_0x0052
        L_0x0077:
            java.lang.Object r3 = r10.A01
            X.5PA r3 = (X.AnonymousClass5PA) r3
            int r2 = r10.A00
            boolean r1 = r10.A02
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x0067
            boolean[] r0 = r3.A0A
            r0[r2] = r1
            if (r1 == 0) goto L_0x0067
            boolean[] r1 = r3.A09
            r0 = 1
            r1[r2] = r0
            return
        L_0x008f:
            java.lang.Object r1 = r10.A01
            X.3Mn r1 = (X.C66723Mn) r1
            boolean r4 = r10.A02
            int r3 = r10.A00
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0067
            X.8qC r0 = r1.A07
            java.lang.Object r2 = r0.get()
            X.4Ct r2 = (X.C84544Ct) r2
            X.2rX r1 = r1.A02
            r0 = 0
            r2.BlG(r1, r3, r4, r0)
            return
        L_0x00ac:
            java.lang.Object r2 = r10.A01
            X.85I r2 = (X.AnonymousClass85I) r2
            int r4 = r10.A00
            boolean r3 = r10.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WAExoPlayerView/playbackstate="
            r1.append(r0)
            X.6qM r2 = r2.A00
            r0 = 1
            if (r4 == r0) goto L_0x0118
            r0 = 2
            if (r4 == r0) goto L_0x0115
            r0 = 3
            if (r4 == r0) goto L_0x0112
            r0 = 4
            if (r4 == r0) goto L_0x010f
            java.lang.String r0 = "STATE_INVALID"
        L_0x00cd:
            r1.append(r0)
            java.lang.String r0 = ", playWhenReady="
            X.C18260x0.A1D(r0, r1, r3)
            r2.A00 = r4
            r0 = 3
            if (r4 == r0) goto L_0x012c
            X.561 r1 = r2.A02
            if (r1 == 0) goto L_0x011b
            r0 = 4
            if (r4 != r0) goto L_0x011b
            android.widget.FrameLayout r0 = r1.A0E
            boolean r0 = X.C86604Kt.A1Y(r0)
            if (r0 != 0) goto L_0x00ee
            X.561 r0 = r2.A02
            r0.A05()
        L_0x00ee:
            X.2ms r0 = r2.A01
            if (r0 == 0) goto L_0x00f5
            r0.A00()
        L_0x00f5:
            X.7t6 r0 = r2.A03
            if (r0 == 0) goto L_0x0067
            r0.A06()
            X.7t6 r2 = r2.A03
            X.7Ap r1 = new X.7Ap
            r1.<init>()
            r0 = 0
            r1.A00 = r0
            X.7RE r0 = new X.7RE
            r0.<init>(r1)
            r2.A0E(r0)
            return
        L_0x010f:
            java.lang.String r0 = "STATE_ENDED"
            goto L_0x00cd
        L_0x0112:
            java.lang.String r0 = "STATE_READY"
            goto L_0x00cd
        L_0x0115:
            java.lang.String r0 = "STATE_BUFFERING"
            goto L_0x00cd
        L_0x0118:
            java.lang.String r0 = "STATE_IDLE"
            goto L_0x00cd
        L_0x011b:
            r0 = 2
            if (r4 != r0) goto L_0x012c
            X.2ms r1 = r2.A01
            if (r1 == 0) goto L_0x0067
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = r2.A04
            r1.A02(r0)
            return
        L_0x012c:
            X.2ms r0 = r2.A01
            if (r0 == 0) goto L_0x0067
            r0.A00()
            return
        L_0x0134:
            java.lang.Object r3 = r10.A01
            com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment r3 = (com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment) r3
            boolean r8 = r10.A02
            r9 = 0
            X.2r1 r4 = r3.A05
            if (r4 == 0) goto L_0x0169
            X.5YF r0 = r3.A02
            android.net.Uri r6 = r0.A0G
            X.C162457s7.A0D(r6)
            android.graphics.Rect r5 = r0.A03()
            int[] r7 = X.C86664Kz.A1Z()
            r7 = {3, 0} // fill-array
            java.util.Map r2 = r4.A01(r5, r6, r7, r8, r9)
            X.3Wi r1 = r3.A02
            if (r1 == 0) goto L_0x0162
            X.3cY r0 = new X.3cY
            r0.<init>((com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment) r3, (java.util.Map) r2)
            r1.A0S(r0)
            return
        L_0x0162:
            java.lang.String r0 = "globalUi"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0169:
            java.lang.String r0 = "imageQuality"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0170:
            r1.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117655sH.run():void");
    }

    public C117655sH(Object obj, int i, int i2, boolean z) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = z;
    }
}
