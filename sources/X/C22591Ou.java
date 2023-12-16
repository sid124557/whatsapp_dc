package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1Ou  reason: invalid class name and case insensitive filesystem */
public class C22591Ou extends C56822sc {
    public final AnonymousClass33E A00;
    public final C64663Ek A01;
    public final C56612sH A02;
    public final C56922sm A03;
    public final AnonymousClass3UZ A04;
    public final C72303dV A05;
    public final C55622qe A06;
    public final C620333f A07;
    public final C55832qz A08;

    public final void A0E(C23291Sa r3, C624134x r4) {
        boolean z = r3.A02;
        boolean z2 = r4.A1F;
        if (z) {
            if (!z2) {
                this.A06.A01(Collections.singleton(r4));
            }
        } else if (z2) {
            this.A06.A04(Collections.singleton(r4));
        }
    }

    public C22591Ou(AnonymousClass33E r1, C64663Ek r2, C56612sH r3, C56922sm r4, AnonymousClass3UZ r5, C72303dV r6, C55622qe r7, C620333f r8, C623934v r9, C55832qz r10) {
        super(r9);
        this.A02 = r3;
        this.A03 = r4;
        this.A08 = r10;
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r8;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r5;
    }

    public final List A0D(Cursor cursor, boolean z) {
        C54782pH A022;
        ArrayList A0s = AnonymousClass001.A0s();
        long A0H = this.A02.A0H();
        while (cursor.moveToNext()) {
            C95814uZ A0B = this.A03.A0B(AnonymousClass0x2.A0C(cursor, "chat_row_id"));
            if (!(A0B == null || (A022 = this.A00.A02(cursor, A0B)) == null)) {
                A0s.add(new C23291Sa((AnonymousClass33J) null, A022.A02, AnonymousClass2z0.A05(A022.A01, A022.A03, A022.A04), (String) null, A0H, z, false));
            }
        }
        return A0s;
    }
}
