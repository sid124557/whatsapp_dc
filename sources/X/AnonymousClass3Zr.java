package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.3Zr  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3Zr implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C66723Mn A01;

    public final void run() {
        C56172rX r16;
        int i;
        C66723Mn r0 = this.A01;
        Context context = this.A00;
        C26071bX r11 = r0.A0J;
        r11.A04();
        File A0A = AnonymousClass002.A0A(context.getFilesDir(), "wam.wam");
        C380625j r7 = r0.A0C;
        int length = C57842uI.A00.length - 1;
        C56172rX r6 = new C56172rX(r7, (AnonymousClass33p) null, (AnonymousClass1VX) null, (C56092rP) null, r11, A0A, length, 3, 0, false);
        r0.A01 = r6;
        C66693Mk r2 = r0.A0I;
        C56092rP r1 = r0.A0H;
        r0.A06 = new C55452qN(r7, r1, r2, r6);
        r0.A0L.countDown();
        C380625j r17 = r7;
        C26071bX r21 = r11;
        int i2 = length;
        C56172rX r162 = new C56172rX(r17, (AnonymousClass33p) null, (AnonymousClass1VX) null, (C56092rP) null, r21, AnonymousClass002.A0A(context.getFilesDir(), "wamrealtime.wam"), i2, 8, 1, false);
        r0.A03 = r162;
        r0.A05 = new C55452qN(r7, r1, r2, r162);
        r0.A0N.countDown();
        if (r0.A0S) {
            AnonymousClass1VX r5 = r0.A0E;
            C58422vE r62 = C58422vE.A02;
            if (r5.A0Y(r62, 3271)) {
                i = r5.A0O(r62, 4290);
            } else {
                i = 2;
            }
            r16 = new C56172rX(r7, r0.A0D, r5, r1, r11, AnonymousClass002.A0A(context.getFilesDir(), "wamdit3.wam"), length, i, 2, true);
        } else {
            r16 = new C56172rX(r17, (AnonymousClass33p) null, (AnonymousClass1VX) null, (C56092rP) null, r21, AnonymousClass002.A0A(context.getFilesDir(), "wamprivatestats.wam"), i2, 3, 2, false);
        }
        r0.A02 = r16;
        r0.A04 = new C55452qN(r7, r1, r2, r16);
        r0.A0M.countDown();
    }

    public /* synthetic */ AnonymousClass3Zr(Context context, C66723Mn r2) {
        this.A01 = r2;
        this.A00 = context;
    }
}
