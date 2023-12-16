package X;

import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.54N  reason: invalid class name */
public class AnonymousClass54N extends AnonymousClass5ZM {
    public final /* synthetic */ CallGridViewModel A00;

    public AnonymousClass54N(CallGridViewModel callGridViewModel) {
        this.A00 = callGridViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r1 == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e1, code lost:
        if (r11 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r19) {
        /*
            r18 = this;
            r1 = r19
            X.5Lb[][] r1 = (X.C102995Lb[][]) r1
            r0 = 0
            r8 = r1[r0]
            int r7 = r8.length
            r6 = 0
            r10 = 0
        L_0x000a:
            if (r6 >= r7) goto L_0x00fb
            r9 = r8[r6]
            r1 = r18
            boolean r0 = X.C18320x8.A1T(r1)
            if (r0 != 0) goto L_0x00fb
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = r1.A00
            X.5Jg r5 = r1.A0T
            com.whatsapp.jid.UserJid r4 = r9.A08
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            X.66R r3 = r5.A03
            java.lang.Object r0 = X.C18300x5.A0d(r3)
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x005f
            X.4xk r1 = r1.A0R
            boolean r0 = r9.A0J
            if (r0 == 0) goto L_0x00a2
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r1.A0E
            X.7Oo r2 = r0.getLastCachedFrame()
            if (r2 != 0) goto L_0x007b
            java.lang.String r0 = "voip/CallDatasource/getSelfLastFrameBitmap no cached frame"
        L_0x003e:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 0
        L_0x0042:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0A(r2)
            java.lang.Object r0 = X.C18300x5.A0d(r3)
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0062
            r1 = 0
        L_0x0052:
            if (r2 == 0) goto L_0x0057
            r0 = 1
            if (r1 != 0) goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            if (r0 != 0) goto L_0x005e
            r0 = r10
            r10 = 0
            if (r0 == 0) goto L_0x005f
        L_0x005e:
            r10 = 1
        L_0x005f:
            int r6 = r6 + 1
            goto L_0x000a
        L_0x0062:
            if (r2 == 0) goto L_0x0070
            java.util.Map r0 = r5.A01
            r0.put(r4, r2)
            java.util.Set r0 = r5.A02
            r0.remove(r4)
        L_0x006e:
            r1 = 1
            goto L_0x0052
        L_0x0070:
            java.util.Set r0 = r5.A02
            r0.add(r4)
            java.util.Map r0 = r5.A01
            r0.remove(r4)
            goto L_0x006e
        L_0x007b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/CallDatasource/getSelfLastFrameBitmap start. size: "
            r1.append(r0)
            int r0 = r2.A03
            r1.append(r0)
            java.lang.String r0 = "x"
            r1.append(r0)
            int r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = " format = "
            r1.append(r0)
            int r0 = r2.A00
            X.C18260x0.A1G(r1, r0)
            android.graphics.Bitmap r2 = X.C97174xk.A01(r2)
            goto L_0x0042
        L_0x00a2:
            int r1 = r9.A07
            if (r1 == 0) goto L_0x00f7
            int r0 = r9.A04
            if (r0 == 0) goto L_0x00f7
            r2 = 0
            android.graphics.Bitmap r11 = X.C86664Kz.A0Y(r1, r0)     // Catch:{ OutOfMemoryError -> 0x00ef }
            if (r11 == 0) goto L_0x00dc
            boolean r0 = com.whatsapp.voipcalling.Voip.dumpLastVideoFrame(r4, r11)
            if (r0 == 0) goto L_0x00dc
            android.graphics.Matrix r1 = X.AnonymousClass002.A05()
            int r0 = r9.A05
            int r0 = r0 * 90
            int r0 = -r0
            float r0 = (float) r0
            r1.preRotate(r0)
            r12 = 0
            int r14 = r11.getWidth()     // Catch:{ OutOfMemoryError -> 0x00e4 }
            int r15 = r11.getHeight()     // Catch:{ OutOfMemoryError -> 0x00e4 }
            r17 = 1
            r13 = r12
            r16 = r1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ OutOfMemoryError -> 0x00e4 }
            if (r0 == r11) goto L_0x00d9
            r2 = r11
        L_0x00d9:
            r11 = r2
            r2 = r0
            goto L_0x00e1
        L_0x00dc:
            java.lang.String r0 = "voip/CallDatasource/getPeerLastFrameBitmap dumpLastVideoFrame failed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00e1:
            if (r11 == 0) goto L_0x0042
            goto L_0x00ea
        L_0x00e4:
            r1 = move-exception
            java.lang.String r0 = "voip/CallDatasource/getPeerLastFrameBitmap OOM when creating result bitmap"
            com.whatsapp.util.Log.i(r0, r1)
        L_0x00ea:
            r11.recycle()
            goto L_0x0042
        L_0x00ef:
            r1 = move-exception
            java.lang.String r0 = "voip/CallDatasource/getPeerLastFrameBitmap OOM when creating raw bitmap"
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x0042
        L_0x00f7:
            java.lang.String r0 = "voip/CallDatasource/getLastFrameBitmap cancelled due to bad participant info or video size"
            goto L_0x003e
        L_0x00fb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54N.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!C18320x8.A1T(this) && bool.booleanValue()) {
            CallGridViewModel callGridViewModel = this.A00;
            LinkedHashMap linkedHashMap = callGridViewModel.A12;
            Iterator A0u = AnonymousClass001.A0u(linkedHashMap);
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                C105865Ws r2 = new C105865Ws((C105175Tw) A0w.getValue());
                r2.A07 = callGridViewModel.A0G((UserJid) A0w.getKey(), ((C105175Tw) A0w.getValue()).A0J);
                linkedHashMap.put(A0w.getKey(), r2.A00());
            }
            callGridViewModel.A0L();
        }
    }
}
