package X;

import android.view.View;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.5fJ  reason: invalid class name and case insensitive filesystem */
public class C109865fJ implements View.OnTouchListener {
    public float A00;
    public float A01;
    public final /* synthetic */ VoipCallControlBottomSheetV2 A02;

    public C109865fJ(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        this.A02 = voipCallControlBottomSheetV2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r6 = r10.A02
            X.5Uk r0 = r6.A0N
            r5 = 1
            if (r0 == 0) goto L_0x0087
            boolean r2 = r0.A08()
            X.5Ml r0 = r6.A0g
            if (r0 == 0) goto L_0x0140
            com.whatsapp.voipcalling.VoipActivityV2 r1 = r0.A00
            boolean r0 = r1.A2I
            if (r0 != 0) goto L_0x0023
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r1.A1P
            if (r0 != 0) goto L_0x0023
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r1.A0s
            X.08M r0 = r0.A0H
            java.lang.Object r0 = r0.A07()
            if (r0 == 0) goto L_0x0140
        L_0x0023:
            r8 = 1
        L_0x0024:
            float r4 = r12.getX()
            float r3 = r12.getY()
            X.03q r0 = r6.A0Q()
            if (r0 == 0) goto L_0x0088
            if (r2 != 0) goto L_0x0088
            int r0 = r6.A1S()
            float r0 = (float) r0
            float r0 = r0 + r3
            r12.setLocation(r4, r0)
            X.03q r0 = r6.A0Q()
            r0.dispatchTouchEvent(r12)
            X.5Ml r1 = r6.A0g
            if (r1 == 0) goto L_0x0088
            r0 = 4
            android.view.View[] r7 = new android.view.View[r0]
            com.whatsapp.voipcalling.VoipActivityV2 r2 = r1.A00
            android.widget.ImageButton r1 = r2.A0S
            r0 = 0
            r7[r0] = r1
            android.view.View r0 = r2.A0M
            r7[r5] = r0
            android.view.ViewGroup r1 = r2.A0R
            r0 = 2
            r7[r0] = r1
            com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner r1 = r2.A0r
            r0 = 3
            java.util.List r0 = X.AnonymousClass0x9.A1A(r1, r7, r0)
            android.graphics.Rect r7 = X.AnonymousClass001.A0N()
            java.util.Iterator r2 = r0.iterator()
        L_0x006a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0088
            android.view.View r0 = X.C86654Ky.A0H(r2)
            r0.getGlobalVisibleRect(r7)
            float r0 = r12.getX()
            int r1 = (int) r0
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r0 = r7.contains(r1, r0)
            if (r0 == 0) goto L_0x006a
        L_0x0087:
            return r5
        L_0x0088:
            if (r8 != 0) goto L_0x0087
            int r0 = r12.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x00f1
            r10.A00 = r4
            r10.A01 = r3
        L_0x0095:
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r6.A0U
            if (r0 == 0) goto L_0x0116
            X.5Uk r0 = r6.A0N
            int r1 = r0.A00()
            r0 = 5
            if (r1 == r0) goto L_0x0116
            int r0 = r12.getAction()
            if (r0 == r5) goto L_0x00ae
            int r0 = r12.getAction()
            if (r0 != 0) goto L_0x0116
        L_0x00ae:
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r1 = r6.A0U
            android.view.View r0 = r6.A08
            int r0 = r0.getTop()
            float r8 = (float) r0
            float r8 = r8 - r3
            int r7 = r12.getAction()
            int r0 = r1.A02
            if (r0 != 0) goto L_0x00cd
            android.content.res.Resources r9 = r1.getResources()
            r0 = 2131165533(0x7f07015d, float:1.7945286E38)
            int r0 = r9.getDimensionPixelSize(r0)
            r1.A02 = r0
        L_0x00cd:
            int r0 = r1.getLeft()
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0113
            int r0 = r1.getRight()
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0113
            int r0 = r1.A02
            float r0 = (float) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0113
            boolean r0 = r1.A02(r7)
            if (r0 == 0) goto L_0x0116
            r10.A00 = r2
            r10.A01 = r2
            return r5
        L_0x00f1:
            int r1 = r12.getAction()
            r0 = 2
            if (r1 != r0) goto L_0x0095
            float r0 = r10.A00
            float r0 = X.AnonymousClass002.A00(r4, r0)
            float r1 = r6.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x010e
            float r0 = r10.A01
            float r0 = X.AnonymousClass002.A00(r3, r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0095
        L_0x010e:
            r10.A00 = r2
            r10.A01 = r2
            goto L_0x0095
        L_0x0113:
            r0 = 0
            r1.A05 = r0
        L_0x0116:
            int r0 = r12.getAction()
            if (r0 != r5) goto L_0x0087
            float r0 = r10.A00
            float r0 = X.AnonymousClass002.A00(r4, r0)
            float r1 = r6.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0087
            float r0 = r10.A01
            float r0 = X.AnonymousClass002.A00(r3, r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0087
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r6.A0P
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0087
            r10.A00 = r2
            r10.A01 = r2
            r6.A1W()
            return r5
        L_0x0140:
            r8 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109865fJ.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
