package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.5sY  reason: invalid class name and case insensitive filesystem */
public class C117825sY implements Comparator {
    public final AnonymousClass5ZU A00;
    public final C56982ss A01;
    public final Collator A02;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j;
        long j2;
        AnonymousClass3ZH r9 = (AnonymousClass3ZH) obj;
        AnonymousClass3ZH r10 = (AnonymousClass3ZH) obj2;
        Class<C95814uZ> cls = C95814uZ.class;
        C95814uZ A022 = AnonymousClass3ZH.A02(r9, cls);
        C95814uZ A023 = AnonymousClass3ZH.A02(r10, cls);
        C56982ss r1 = this.A01;
        if (r1.A0L(A022)) {
            j = r1.A09(A022);
        } else {
            j = 0;
        }
        if (r1.A0L(A023)) {
            j2 = r1.A09(A023);
        } else {
            j2 = 0;
        }
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (j == 0) {
            if (i != 0) {
                return 1;
            }
            Collator collator = this.A02;
            AnonymousClass5ZU r0 = this.A00;
            return collator.compare(r0.A0H(r9), r0.A0H(r10));
        } else if (i == 0) {
            return -1;
        } else {
            int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            if (i2 == 0) {
                AnonymousClass5ZU r02 = this.A00;
                return r02.A0H(r9).compareTo(r02.A0H(r10));
            } else if (i2 < 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public C117825sY(AnonymousClass5ZU r3, C620733j r4, C56982ss r5) {
        this.A01 = r5;
        this.A00 = r3;
        Collator A0w = C86614Ku.A0w(r4);
        this.A02 = A0w;
        A0w.setDecomposition(1);
    }
}
