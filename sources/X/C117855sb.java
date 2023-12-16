package X;

import com.whatsapp.jid.UserJid;
import java.text.Collator;
import java.util.Comparator;
import java.util.HashSet;

/* renamed from: X.5sb  reason: invalid class name and case insensitive filesystem */
public final class C117855sb implements Comparator {
    public final C56972sr A00;
    public final Collator A01;
    public final /* synthetic */ AnonymousClass5NU A02;
    public final /* synthetic */ HashSet A03;

    public C117855sb(C56972sr r3, AnonymousClass5ZU r4, AnonymousClass5NU r5, HashSet hashSet) {
        this.A02 = r5;
        this.A03 = hashSet;
        this.A00 = r3;
        Collator A0w = C86614Ku.A0w(r4.A03);
        A0w.setDecomposition(1);
        this.A01 = A0w;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass5Rm r7 = (AnonymousClass5Rm) obj;
        AnonymousClass5Rm r8 = (AnonymousClass5Rm) obj2;
        C18260x0.A0O(r7, r8);
        C56972sr r1 = this.A02.A01;
        AnonymousClass3ZH r5 = r7.A01;
        if (!C56972sr.A08(r1, r5)) {
            AnonymousClass3ZH r4 = r8.A01;
            if (!C56972sr.A08(r1, r4)) {
                HashSet hashSet = this.A03;
                Class<UserJid> cls = UserJid.class;
                boolean A0U = C73723fy.A0U(hashSet, r5.A0I(cls));
                boolean A0U2 = C73723fy.A0U(hashSet, r4.A0I(cls));
                if (A0U) {
                    if (!A0U2) {
                        return -1;
                    }
                } else if (A0U2) {
                    return 1;
                }
            }
        }
        C56972sr r2 = this.A00;
        boolean A08 = C56972sr.A08(r2, r5);
        if (A08 == C56972sr.A08(r2, r8.A01)) {
            return C117875sd.A00(r7.A00, r8.A00, this.A01);
        } else if (A08) {
            return -1;
        } else {
            return 1;
        }
    }
}
