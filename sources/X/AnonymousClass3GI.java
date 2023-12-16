package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3GI  reason: invalid class name */
public final class AnonymousClass3GI implements C836849j {
    public final C56932sn A00;

    public AnonymousClass3GI(C56932sn r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void BYP(C134256ih r8) {
        int i;
        C162457s7.A0J(r8, 0);
        C56932sn r1 = this.A00;
        List A07 = r1.A07();
        List<C50612iT> A09 = r1.A09((AnonymousClass2IB) null);
        int i2 = 0;
        List A08 = r1.A08(0);
        r8.A0y = AnonymousClass0x9.A0m(A07.size());
        if (!(A09 instanceof Collection) || !A09.isEmpty()) {
            i = 0;
            for (C50612iT r0 : A09) {
                if (r0.A0Q && (i = i + 1) < 0) {
                    AnonymousClass8UF.A0q();
                    throw AnonymousClass000.A0L();
                }
            }
        } else {
            i = 0;
        }
        r8.A0x = AnonymousClass0x9.A0m(i);
        r8.A0z = AnonymousClass0x9.A0n((long) A07.size(), (long) A09.size());
        if (!(A08 instanceof Collection) || !A08.isEmpty()) {
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                AnonymousClass330 r02 = AnonymousClass0x7.A0b(it).A04;
                if (r02 != null && r02.A09 && (i2 = i2 + 1) < 0) {
                    AnonymousClass8UF.A0q();
                    throw AnonymousClass000.A0L();
                }
            }
        }
        r8.A0t = AnonymousClass0x9.A0m(i2);
        r8.A0u = AnonymousClass0x9.A0m(A08.size());
    }
}
