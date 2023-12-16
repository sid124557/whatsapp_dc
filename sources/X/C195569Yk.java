package X;

import com.whatsapp.camera.litecamera.LiteCameraView;
import com.whatsapp.util.Log;

/* renamed from: X.9Yk  reason: invalid class name and case insensitive filesystem */
public class C195569Yk implements C203389nc {
    public final /* synthetic */ LiteCameraView A00;

    public C195569Yk(LiteCameraView liteCameraView) {
        this.A00 = liteCameraView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BOK() {
        /*
            r6 = this;
            java.lang.String r0 = "LiteCamera/onCameraInitialised"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            com.whatsapp.camera.litecamera.LiteCameraView r2 = r6.A00
            r0 = 1
            r2.A0K = r0
            r0 = 0
            r2.A08 = r0
            boolean r0 = r2.BHe()
            if (r0 == 0) goto L_0x006c
            java.util.List r0 = r2.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = "off"
            java.lang.String r0 = "on"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r2.A07 = r0
        L_0x002d:
            r2.A02()
        L_0x0030:
            java.util.List r1 = r2.getFlashModes()
            java.lang.String r0 = r2.A05
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0040
            java.lang.String r0 = "off"
            r2.A05 = r0
        L_0x0040:
            X.9oA r1 = r2.A0E
            java.lang.String r0 = r2.A05
            int r0 = com.whatsapp.camera.litecamera.LiteCameraView.A00(r0)
            r1.BmI(r0)
            X.9Yl r1 = (X.C195579Yl) r1
            X.9Ux r1 = r1.A02()
            if (r1 == 0) goto L_0x006a
            X.9Mw r0 = X.C194899Ux.A0j
            java.util.List r1 = X.C194899Ux.A03(r0, r1)
            if (r1 == 0) goto L_0x006a
            r0 = 3
            boolean r0 = X.AnonymousClass0x7.A1U(r1, r0)
        L_0x0060:
            r2.A0B = r0
            X.8uQ r0 = r2.A00
            if (r0 == 0) goto L_0x0069
            r0.BYs()
        L_0x0069:
            return
        L_0x006a:
            r0 = 0
            goto L_0x0060
        L_0x006c:
            java.util.List r0 = r2.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0030
            boolean r0 = r2.BHe()
            if (r0 != 0) goto L_0x00c4
            r0 = 3
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r0)
            java.lang.String r0 = "off"
            r5.add(r0)
            X.9oA r4 = r2.A0E
            java.lang.String r3 = "on"
            X.9Yl r4 = (X.C195579Yl) r4
            X.9Ux r1 = r4.A02()
            if (r1 == 0) goto L_0x00a2
            X.9Mw r0 = X.C194899Ux.A0j
            java.util.List r1 = X.C194899Ux.A03(r0, r1)
            if (r1 == 0) goto L_0x00a2
            r0 = 1
            boolean r0 = X.AnonymousClass0x7.A1U(r1, r0)
            if (r0 == 0) goto L_0x00a2
            r5.add(r3)
        L_0x00a2:
            java.lang.String r3 = "auto"
            X.9Ux r1 = r4.A02()
            if (r1 == 0) goto L_0x00bc
            X.9Mw r0 = X.C194899Ux.A0j
            java.util.List r1 = X.C194899Ux.A03(r0, r1)
            if (r1 == 0) goto L_0x00bc
            r0 = 2
            boolean r0 = X.AnonymousClass0x7.A1U(r1, r0)
            if (r0 == 0) goto L_0x00bc
            r5.add(r3)
        L_0x00bc:
            java.util.List r0 = java.util.Collections.unmodifiableList(r5)
            r2.A06 = r0
            goto L_0x002d
        L_0x00c4:
            java.lang.String r0 = "Cannot create back camera flash list while in front camera"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195569Yk.BOK():void");
    }

    public void BON() {
        Log.d("LiteCamera/onCameraSwitched");
        LiteCameraView liteCameraView = this.A00;
        C18270x1.A0h(liteCameraView.A0C.edit(), "camera_facing", ((C195579Yl) liteCameraView.A0E).A00);
    }

    public void BOG(Exception exc) {
        C18260x0.A1P(AnonymousClass001.A0o(), "LiteCamera/onCameraError: ", exc);
        LiteCameraView liteCameraView = this.A00;
        liteCameraView.A0K = false;
        if (!liteCameraView.A08) {
            liteCameraView.A08 = true;
            liteCameraView.pause();
            liteCameraView.Bk9();
            return;
        }
        C185898uQ r0 = liteCameraView.A00;
        if (r0 != null) {
            r0.BOH(exc, 1);
        }
    }

    public void BOL(String str, String str2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LiteCamera/onCameraLocallyEvicted: ");
        A0o.append(str);
        C18260x0.A0q(">", str2, A0o);
        LiteCameraView liteCameraView = this.A00;
        liteCameraView.A0K = false;
        C185898uQ r2 = liteCameraView.A00;
        if (r2 != null) {
            r2.BOH(new Exception("CameraCustomException: Camera error evicted"), 2);
        }
    }
}
