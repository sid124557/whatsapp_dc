package X;

import android.content.Context;
import android.content.DialogInterface;
import com.whatsapp.R;

/* renamed from: X.9p8  reason: invalid class name and case insensitive filesystem */
public class C204299p8 implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public C204299p8(Object obj, int i, int i2, boolean z) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A03 != 0) {
            AnonymousClass9C3 r2 = (AnonymousClass9C3) this.A01;
            int i2 = this.A00;
            boolean z = this.A02;
            C621433s.A00(r2, i2);
            r2.A77(z);
            return;
        }
        AnonymousClass9Bv r1 = (AnonymousClass9Bv) this.A01;
        int i3 = this.A00;
        boolean z2 = this.A02;
        C621433s.A00(r1, i3);
        C1902194o r0 = r1.A01;
        AnonymousClass9Q9 r22 = new AnonymousClass9Q9(5);
        r22.A08 = true;
        r22.A02 = R.string.f11nameremoved;
        r0.A03.A0H(r22);
        C204539pW r12 = new C204539pW(r0, 7);
        if (z2) {
            Context context = r0.A0D.A00;
            C69263Wi r4 = r0.A0A;
            AnonymousClass4FS r122 = r0.A0U;
            C194259Se r11 = r0.A0S;
            AnonymousClass9U4 r10 = r0.A0Q;
            new C194329Sl(context, r4, r0.A0E, r0.A0K, r0.A0M, r0.A0N, r0.A0O, r10, r11, r122).A00(r12);
            return;
        }
        C56612sH r5 = r0.A0C;
        C69263Wi r3 = r0.A0A;
        C56972sr r42 = r0.A0B;
        AnonymousClass31C r7 = r0.A0I;
        C54292oU r6 = r0.A0D;
        AnonymousClass4FS r112 = r0.A0U;
        new C194199Ry(r3, r42, r5, r6, r7, r0.A0K, r0.A0L, r0.A0Q, r112).A00(r12);
    }
}
