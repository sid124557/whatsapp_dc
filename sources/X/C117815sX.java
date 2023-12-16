package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.5sX  reason: invalid class name and case insensitive filesystem */
public class C117815sX implements Comparator {
    public final C56972sr A00;
    public final AnonymousClass5ZU A01;
    public final Collator A02;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass5QZ r8 = (AnonymousClass5QZ) obj;
        AnonymousClass5QZ r9 = (AnonymousClass5QZ) obj2;
        AnonymousClass3ZH r6 = r8.A03;
        if (r6 == null) {
            r6 = new AnonymousClass3ZH(r8.A04);
        }
        AnonymousClass3ZH r5 = r9.A03;
        if (r5 == null) {
            r5 = new AnonymousClass3ZH(r9.A04);
        }
        C56972sr r0 = this.A00;
        boolean A08 = C56972sr.A08(r0, r6);
        if (A08 == C56972sr.A08(r0, r5) && (A08 = AnonymousClass000.A1S(r8.A01)) == AnonymousClass000.A1S(r9.A01)) {
            Collator collator = this.A02;
            AnonymousClass5ZU r2 = this.A01;
            return C117875sd.A00(r2.A0D(r6, 7, false, false), r2.A0D(r5, 7, false, false), collator);
        } else if (A08) {
            return -1;
        } else {
            return 1;
        }
    }

    public C117815sX(C56972sr r3, AnonymousClass5ZU r4) {
        this.A00 = r3;
        this.A01 = r4;
        Collator A0w = C86614Ku.A0w(r4.A03);
        A0w.setDecomposition(1);
        this.A02 = A0w;
    }
}
