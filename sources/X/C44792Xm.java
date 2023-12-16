package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.widget.Button;
import com.whatsapp.R;

/* renamed from: X.2Xm  reason: invalid class name and case insensitive filesystem */
public final class C44792Xm {
    public final Button A00;
    public final Button A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r5.orientation == 1) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.res.Configuration r5) {
        /*
            r4 = this;
            r0 = 0
            X.C162457s7.A0J(r5, r0)
            int r1 = r5.smallestScreenWidthDp
            r0 = 360(0x168, float:5.04E-43)
            if (r1 < r0) goto L_0x0024
            int r0 = r5.orientation
            r3 = 1
            if (r0 != r3) goto L_0x0024
        L_0x000f:
            android.widget.Button r2 = r4.A00
            r1 = 0
            r0 = 8
            if (r3 == 0) goto L_0x0017
            r0 = 0
        L_0x0017:
            r2.setVisibility(r0)
            android.widget.Button r0 = r4.A01
            if (r3 == 0) goto L_0x0020
            r1 = 8
        L_0x0020:
            r0.setVisibility(r1)
            return
        L_0x0024:
            r3 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44792Xm.A00(android.content.res.Configuration):void");
    }

    public C44792Xm(Activity activity, View view) {
        this.A01 = (Button) C18280x3.A0E(view, R.id.save_button);
        this.A00 = (Button) C18280x3.A0E(view, R.id.keyboard_aware_save_button);
        Configuration A0M = AnonymousClass001.A0M(activity);
        C162457s7.A0D(A0M);
        A00(A0M);
    }
}
