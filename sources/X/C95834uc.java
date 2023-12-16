package X;

import android.content.Context;
import com.whatsapp.location.LocationPicker;

/* renamed from: X.4uc  reason: invalid class name and case insensitive filesystem */
public class C95834uc extends C95874ug {
    public final /* synthetic */ LocationPicker A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95834uc(Context context, C150067Pa r2, LocationPicker locationPicker) {
        super(context, r2);
        this.A00 = locationPicker;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r1 != 3) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            com.whatsapp.location.LocationPicker r4 = r10.A00
            X.5cU r1 = r4.A0P
            boolean r0 = r1.A0t
            r7 = 0
            if (r0 == 0) goto L_0x001a
            android.widget.ImageView r1 = r1.A0S
            r0 = 2131231157(0x7f0801b5, float:1.8078387E38)
            r1.setImageResource(r0)
            X.5cU r0 = r4.A0P
            r0.A0s = r7
        L_0x0015:
            boolean r0 = super.dispatchTouchEvent(r11)
            return r0
        L_0x001a:
            int r1 = r11.getAction()
            if (r1 == 0) goto L_0x0112
            r2 = 120(0x78, double:5.93E-322)
            r8 = 1
            r6 = 8
            r5 = 0
            if (r1 == r8) goto L_0x00d4
            r0 = 2
            if (r1 == r0) goto L_0x002f
            r0 = 3
            if (r1 == r0) goto L_0x00d4
            goto L_0x0015
        L_0x002f:
            X.5cU r0 = r4.A0P
            com.whatsapp.location.PlaceInfo r0 = r0.A0f
            if (r0 == 0) goto L_0x004b
            java.lang.Object r1 = r0.A0D
            if (r1 == 0) goto L_0x0043
            X.4Zc r1 = (X.C88534Zc) r1
            X.7AD r0 = r4.A05
            r1.A0G(r0)
            r1.A0C()
        L_0x0043:
            X.5cU r1 = r4.A0P
            r0 = 0
            r1.A0f = r0
            r1.A0B()
        L_0x004b:
            boolean r0 = r4.A0X
            if (r0 != 0) goto L_0x0015
            float r9 = r11.getX()
            float r1 = r11.getY()
            float r0 = r4.A00
            float r9 = r9 - r0
            float r9 = r9 * r9
            float r0 = r4.A01
            float r1 = r1 - r0
            float r1 = r1 * r1
            float r9 = r9 + r1
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131166943(0x7f0706df, float:1.7948146E38)
            float r0 = r1.getDimension(r0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
            r4.A0X = r8
            X.5cU r1 = r4.A0P
            boolean r0 = r1.A0p
            if (r0 == 0) goto L_0x00a9
            android.view.View r0 = r1.A0C
            r0.setVisibility(r7)
            X.5cU r0 = r4.A0P
            android.view.View r0 = r0.A0C
            float r0 = X.C86664Kz.A02(r0)
            android.view.animation.TranslateAnimation r1 = new android.view.animation.TranslateAnimation
            r1.<init>(r5, r5, r0, r5)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            r1.setDuration(r2)
            X.5cU r0 = r4.A0P
            android.view.View r0 = r0.A0D
            r0.startAnimation(r1)
            X.5cU r0 = r4.A0P
            android.view.View r0 = r0.A0E
            r0.setVisibility(r7)
            X.5cU r0 = r4.A0P
            android.view.View r0 = r0.A0B
            r0.setVisibility(r6)
        L_0x00a9:
            X.5cU r1 = r4.A0P
            boolean r0 = r1.A0s
            if (r0 == 0) goto L_0x00b4
            android.view.View r0 = r1.A0B
            r0.setVisibility(r6)
        L_0x00b4:
            r0 = 2131431170(0x7f0b0f02, float:1.8484062E38)
            android.view.View r2 = r10.findViewById(r0)
            r0 = 2131431099(0x7f0b0ebb, float:1.8483918E38)
            android.view.View r1 = r10.findViewById(r0)
            if (r2 == 0) goto L_0x00c7
            r2.setVisibility(r6)
        L_0x00c7:
            if (r1 == 0) goto L_0x0015
            X.5cU r0 = r4.A0P
            boolean r0 = r0.A0p
            if (r0 == 0) goto L_0x0015
            r1.setVisibility(r6)
            goto L_0x0015
        L_0x00d4:
            r4.A00 = r5
            r4.A01 = r5
            boolean r0 = r4.A0X
            if (r0 == 0) goto L_0x0015
            r4.A0X = r7
            X.5cU r0 = r4.A0P
            android.view.View r0 = r0.A0C
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0015
            X.5cU r0 = r4.A0P
            android.view.View r0 = r0.A0C
            r0.setVisibility(r6)
            X.5cU r0 = r4.A0P
            android.view.View r0 = r0.A0C
            int r0 = r0.getHeight()
            int r0 = -r0
            float r0 = (float) r0
            android.view.animation.TranslateAnimation r1 = new android.view.animation.TranslateAnimation
            r1.<init>(r5, r5, r0, r5)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            r1.setDuration(r2)
            X.5cU r0 = r4.A0P
            android.view.View r0 = r0.A0D
            r0.startAnimation(r1)
            goto L_0x0015
        L_0x0112:
            boolean r0 = r4.A0X
            if (r0 != 0) goto L_0x0015
            float r0 = r11.getX()
            r4.A00 = r0
            float r0 = r11.getY()
            r4.A01 = r0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95834uc.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
