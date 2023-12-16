package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.registration.RegistrationScrollView;

/* renamed from: X.5fZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110025fZ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ LinearLayout A02;
    public final /* synthetic */ WaTextView A03;
    public final /* synthetic */ RegistrationScrollView A04;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r2 != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r6 = this;
            com.whatsapp.registration.RegistrationScrollView r5 = r6.A04
            android.widget.LinearLayout r4 = r6.A02
            com.whatsapp.WaTextView r3 = r6.A03
            boolean r0 = r5.A06
            r2 = 1
            if (r0 != 0) goto L_0x0016
            android.view.ViewTreeObserver r1 = r5.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r0 = r5.A09
            r1.addOnScrollChangedListener(r0)
            r5.A06 = r2
        L_0x0016:
            boolean r2 = r5.canScrollVertically(r2)
            r0 = -1
            boolean r1 = r5.canScrollVertically(r0)
            if (r1 != 0) goto L_0x002b
            if (r2 != 0) goto L_0x002d
            r0 = 0
            X.AnonymousClass0YZ.A0B(r4, r0)
            X.AnonymousClass0YZ.A0B(r3, r0)
        L_0x002a:
            return
        L_0x002b:
            if (r2 == 0) goto L_0x0034
        L_0x002d:
            float r0 = r5.A08
            X.AnonymousClass0YZ.A0B(r3, r0)
            if (r1 == 0) goto L_0x002a
        L_0x0034:
            float r0 = r5.A08
            X.AnonymousClass0YZ.A0B(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110025fZ.onGlobalLayout():void");
    }

    public /* synthetic */ C110025fZ(View view, View view2, LinearLayout linearLayout, WaTextView waTextView, RegistrationScrollView registrationScrollView) {
        this.A04 = registrationScrollView;
        this.A00 = view;
        this.A01 = view2;
        this.A02 = linearLayout;
        this.A03 = waTextView;
    }
}
