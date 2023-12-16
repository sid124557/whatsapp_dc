package X;

import java.text.Collator;
import java.util.Comparator;

@Deprecated
/* renamed from: X.5sd  reason: invalid class name and case insensitive filesystem */
public class C117875sd implements Comparator {
    public final int A00;
    public final C56972sr A01;
    public final AnonymousClass5ZU A02;
    public final Collator A03;

    public static int A00(AnonymousClass7HU r5, AnonymousClass7HU r6, Collator collator) {
        char c;
        char c2;
        C998258i r2 = r5.A00;
        C998258i r1 = C998258i.PUSH_NAME;
        if (r2 == r1) {
            c = 1;
        } else {
            c = 0;
            if (r2 == C998258i.PHONE_NUMBER) {
                c = 2;
            }
        }
        C998258i r22 = r6.A00;
        if (r22 == r1) {
            c2 = 1;
        } else {
            c2 = 0;
            if (r22 == C998258i.PHONE_NUMBER) {
                c2 = 2;
            }
        }
        if (c == c2) {
            String str = r5.A01;
            String str2 = r6.A01;
            if (str == null) {
                if (str2 == null) {
                    return 0;
                }
                return -1;
            } else if (str2 != null) {
                return collator.compare(str, str2);
            }
        } else if (c < c2) {
            return -1;
        }
        return 1;
    }

    @Deprecated
    /* renamed from: A01 */
    public int compare(AnonymousClass3ZH r7, AnonymousClass3ZH r8) {
        C56972sr r0 = this.A01;
        boolean A08 = C56972sr.A08(r0, r7);
        if (A08 == C56972sr.A08(r0, r8)) {
            Collator collator = this.A03;
            AnonymousClass5ZU r4 = this.A02;
            int i = this.A00;
            return A00(r4.A0D(r7, i, false, true), r4.A0D(r8, i, false, true), collator);
        } else if (A08) {
            return -1;
        } else {
            return 1;
        }
    }

    public C117875sd(C56972sr r3, AnonymousClass5ZU r4, int i) {
        this.A01 = r3;
        this.A00 = i;
        this.A02 = r4;
        Collator A0w = C86614Ku.A0w(r4.A03);
        A0w.setDecomposition(1);
        this.A03 = A0w;
    }
}
