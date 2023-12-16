package X;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.5ex  reason: invalid class name and case insensitive filesystem */
public class C109645ex implements View.OnClickListener {
    public final View A00;
    public final C56972sr A01;
    public final C64773Ex A02;
    public final AnonymousClass5ZU A03;
    public final C105365Uq A04;
    public final AnonymousClass5RC A05;
    public final C113895mA A06;
    public final AnonymousClass33p A07;
    public final C620733j A08;
    public final WeakReference A09;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0067, code lost:
        if (r3 == 10) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r11) {
        /*
            r10 = this;
            X.5mA r8 = r10.A06
            boolean r1 = r8.A0C()
            boolean r0 = r8.A0B()
            if (r1 != 0) goto L_0x001e
            if (r0 == 0) goto L_0x0011
            r8.A04()
        L_0x0011:
            X.1mu r2 = r8.A01()
            monitor-enter(r8)
            r0 = 0
            r8.A02 = r0     // Catch:{ all -> 0x001b }
            monitor-exit(r8)
            goto L_0x0045
        L_0x001b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x001e:
            if (r0 == 0) goto L_0x0039
            X.5pj r1 = r8.A00()
            if (r1 == 0) goto L_0x002c
            int r0 = r1.A06
            int r0 = r0 + 1
            r1.A06 = r0
        L_0x002c:
            r8.A04()
            boolean r0 = r11 instanceof android.widget.ImageButton
            if (r0 == 0) goto L_0x0094
            android.widget.ImageButton r11 = (android.widget.ImageButton) r11
            X.C107465bM.A06(r11)
            return
        L_0x0039:
            X.5pj r3 = r8.A00()
            X.1mu r2 = r8.A01()
            if (r3 != 0) goto L_0x0095
            if (r2 == 0) goto L_0x0094
        L_0x0045:
            java.lang.ref.WeakReference r0 = r10.A09
            java.lang.Object r4 = r0.get()
            android.app.Activity r4 = (android.app.Activity) r4
            if (r2 == 0) goto L_0x0094
            if (r4 == 0) goto L_0x0094
            X.5RC r3 = r10.A05
            r5 = 0
            r1 = 0
            r0 = 1
            X.5pj r4 = r3.A01(r4, r1, r0)
            r4.A0N = r2
            r4.A0A = r0
            int r3 = r2.A0D
            r0 = 9
            if (r3 == r0) goto L_0x0069
            r1 = 10
            r0 = 0
            if (r3 != r1) goto L_0x006a
        L_0x0069:
            r0 = 1
        L_0x006a:
            r4.A0U = r0
            r4.A0I = r5
            r1 = 0
            r0 = 1
            r4.A09(r1, r0, r0)
            X.33j r9 = r10.A08
            android.view.View r3 = r10.A00
            X.5Uq r7 = r10.A04
            X.2sr r4 = r10.A01
            X.3Ex r5 = r10.A02
            X.5ZU r6 = r10.A03
            X.C107465bM.A01(r3, r4, r5, r6, r7, r8, r9)
            X.33p r1 = r10.A07
            X.2z0 r0 = r2.A1J
            X.4uZ r0 = r0.A00
            X.C107465bM.A0B(r1, r0)
            X.5pj r1 = r8.A00()
            if (r1 == 0) goto L_0x0094
            r0 = 1
            r1.A0Y = r0
        L_0x0094:
            return
        L_0x0095:
            r1 = 0
            r0 = 1
            r3.A09(r1, r0, r0)
            boolean r0 = r11 instanceof android.widget.ImageButton
            if (r0 == 0) goto L_0x0094
            android.widget.ImageButton r11 = (android.widget.ImageButton) r11
            X.C107465bM.A05(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109645ex.onClick(android.view.View):void");
    }

    public C109645ex(Activity activity, View view, C56972sr r4, C64773Ex r5, AnonymousClass5ZU r6, C105365Uq r7, AnonymousClass5RC r8, C113895mA r9, AnonymousClass33p r10, C620733j r11) {
        this.A00 = view;
        this.A05 = r8;
        this.A06 = r9;
        this.A09 = AnonymousClass0x9.A14(activity);
        this.A08 = r11;
        this.A04 = r7;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A07 = r10;
    }
}
