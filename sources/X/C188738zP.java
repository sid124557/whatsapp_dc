package X;

import android.view.ViewOutlineProvider;

/* renamed from: X.8zP  reason: invalid class name and case insensitive filesystem */
public class C188738zP extends ViewOutlineProvider {
    public Object A00;
    public final int A01;

    public C188738zP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        r0 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        r11.setAlpha(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r0.getOutline(r11);
        r0 = ((X.AnonymousClass84O) r9.A00).A0B(65, 1.0f);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getOutline(android.view.View r10, android.graphics.Outline r11) {
        /*
            r9 = this;
            int r0 = r9.A01
            r3 = r11
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x004a;
                case 2: goto L_0x0033;
                case 3: goto L_0x0060;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r0 = r9.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r0
            android.view.View r0 = r0.A08
            android.content.res.Resources r1 = X.C18290x4.A0G(r0)
            r0 = 2131165532(0x7f07015c, float:1.7945284E38)
            float r8 = r1.getDimension(r0)
            r4 = 0
            int r6 = r10.getWidth()
            int r7 = r10.getHeight()
            int r0 = (int) r8
            int r7 = r7 + r0
            r5 = r4
            r3.setRoundRect(r4, r5, r6, r7, r8)
        L_0x0026:
            return
        L_0x0027:
            java.lang.Object r0 = r9.A00
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            X.4aX r0 = r0.A06
            if (r0 == 0) goto L_0x0045
            r0.getOutline(r11)
            return
        L_0x0033:
            android.graphics.drawable.Drawable r0 = r10.getBackground()
            if (r0 != 0) goto L_0x0050
            int r2 = r10.getWidth()
            int r1 = r10.getHeight()
            r0 = 0
            r11.setRect(r0, r0, r2, r1)
        L_0x0045:
            r0 = 0
        L_0x0046:
            r11.setAlpha(r0)
            return
        L_0x004a:
            android.graphics.drawable.Drawable r0 = r10.getBackground()
            if (r0 == 0) goto L_0x0026
        L_0x0050:
            r0.getOutline(r11)
            java.lang.Object r2 = r9.A00
            X.84O r2 = (X.AnonymousClass84O) r2
            r1 = 65
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r2.A0B(r1, r0)
            goto L_0x0046
        L_0x0060:
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131166005(0x7f070335, float:1.7946243E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 0
            r11.setOval(r0, r0, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188738zP.getOutline(android.view.View, android.graphics.Outline):void");
    }
}
