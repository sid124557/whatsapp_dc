package X;

import com.whatsapp.registration.ChangeNumberOverview;

/* renamed from: X.3c2  reason: invalid class name and case insensitive filesystem */
public class C71393c2 implements Runnable {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public final int A03;

    public C71393c2(ChangeNumberOverview changeNumberOverview, boolean z, boolean z2) {
        this.A03 = 3;
        this.A00 = changeNumberOverview;
        this.A01 = z;
        this.A02 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0 == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            int r0 = r13.A03
            switch(r0) {
                case 0: goto L_0x0096;
                case 1: goto L_0x00f7;
                case 2: goto L_0x00b4;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r7 = r13.A00
            com.whatsapp.registration.ChangeNumberOverview r7 = (com.whatsapp.registration.ChangeNumberOverview) r7
            boolean r1 = r13.A01
            boolean r0 = r13.A02
            if (r1 == 0) goto L_0x0012
            r12 = 1
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r12 = 0
        L_0x0013:
            X.1VX r1 = r7.A0D
            r0 = 6367(0x18df, float:8.922E-42)
            r1.A0X(r0)
            r0 = 2131428672(0x7f0b0540, float:1.8478995E38)
            android.widget.TextView r9 = X.C18310x6.A0L(r7, r0)
            r0 = 2131428678(0x7f0b0546, float:1.8479007E38)
            android.widget.TextView r8 = X.C18310x6.A0L(r7, r0)
            r0 = 2131428677(0x7f0b0545, float:1.8479005E38)
            android.widget.TextView r6 = X.C18310x6.A0L(r7, r0)
            r0 = 2131428671(0x7f0b053f, float:1.8478993E38)
            android.view.View r11 = r7.findViewById(r0)
            r0 = 2131428670(0x7f0b053e, float:1.8478991E38)
            android.view.View r10 = r7.findViewById(r0)
            r0 = 2131428674(0x7f0b0542, float:1.8479E38)
            android.view.View r5 = r7.findViewById(r0)
            r0 = 2131428673(0x7f0b0541, float:1.8478997E38)
            android.view.View r4 = r7.findViewById(r0)
            r0 = 2131428676(0x7f0b0544, float:1.8479003E38)
            android.view.View r3 = r7.findViewById(r0)
            r0 = 2131428675(0x7f0b0543, float:1.8479001E38)
            android.view.View r2 = r7.findViewById(r0)
            r1 = 8
            r11.setVisibility(r1)
            r10.setVisibility(r1)
            r5.setVisibility(r1)
            r4.setVisibility(r1)
            if (r12 == 0) goto L_0x0086
            r0 = 2131887582(0x7f1205de, float:1.9409775E38)
            r9.setText(r0)
            r0 = 2131887585(0x7f1205e1, float:1.9409781E38)
            r8.setText(r0)
            r0 = 2131887583(0x7f1205df, float:1.9409777E38)
        L_0x0078:
            r6.setText(r0)
            X.2Gt r0 = r7.A04
            if (r0 == 0) goto L_0x00f0
            r3.setVisibility(r1)
            r2.setVisibility(r1)
        L_0x0085:
            return
        L_0x0086:
            r0 = 2131887578(0x7f1205da, float:1.9409767E38)
            r9.setText(r0)
            r0 = 2131887591(0x7f1205e7, float:1.9409793E38)
            r8.setText(r0)
            r0 = 2131887589(0x7f1205e5, float:1.940979E38)
            goto L_0x0078
        L_0x0096:
            java.lang.Object r0 = r13.A00
            X.85C r0 = (X.AnonymousClass85C) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x00a0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0085
            java.lang.Object r2 = r3.next()
            X.8vW r2 = (X.C186538vW) r2
            boolean r1 = r13.A02
            boolean r0 = r13.A01
            r2.Bfb(r1, r0)
            goto L_0x00a0
        L_0x00b4:
            java.lang.Object r4 = r13.A00
            X.2UP r4 = (X.AnonymousClass2UP) r4
            boolean r6 = r13.A01
            boolean r5 = r13.A02
            X.2m9 r2 = r4.A0C
            r0 = 2
            X.3bz r1 = new X.3bz
            r1.<init>(r0, r4, r6)
            r0 = 14
            r2.A01(r1, r0)
            X.1VX r2 = r4.A0K
            X.2vE r1 = X.C58422vE.A01
            r0 = 6524(0x197c, float:9.142E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 != 0) goto L_0x00e6
            X.3Wi r3 = r4.A00
            X.1im r2 = r4.A03
            java.util.Objects.requireNonNull(r2)
            r1 = 19
            X.3bq r0 = new X.3bq
            r0.<init>((java.lang.Object) r2, (int) r1)
            r3.A0S(r0)
        L_0x00e6:
            if (r5 == 0) goto L_0x0085
            if (r6 != 0) goto L_0x0085
            r0 = 2000(0x7d0, double:9.88E-321)
            X.AnonymousClass2UP.A00(r4, r0)
            return
        L_0x00f0:
            java.lang.String r0 = "interopRolloutManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00f7:
            java.lang.Object r2 = r13.A00
            X.35O r2 = (X.AnonymousClass35O) r2
            boolean r1 = r13.A01
            boolean r0 = r13.A02
            X.AnonymousClass35O.A03(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71393c2.run():void");
    }

    public C71393c2(Object obj, int i, boolean z, boolean z2) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = z;
        this.A01 = z2;
    }
}
