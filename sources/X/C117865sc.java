package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.text.Collator;
import java.util.Comparator;
import java.util.Map;

/* renamed from: X.5sc  reason: invalid class name and case insensitive filesystem */
public class C117865sc implements Comparator {
    public final AnonymousClass5ZU A00;
    public final Collator A01;
    public final Map A02 = AnonymousClass001.A0t();

    public String A01(AnonymousClass3ZH r5) {
        if (r5 == null) {
            return null;
        }
        String str = r5.A0W;
        if (str != null && str.length() > 0) {
            return str;
        }
        if (r5.A0H == null) {
            return null;
        }
        Map map = this.A02;
        Class<UserJid> cls = UserJid.class;
        String A0o = C18310x6.A0o(r5.A0I(cls), map);
        if (A0o != null) {
            return A0o;
        }
        String A0H = this.A00.A0H(r5);
        map.put(r5.A0I(cls), A0H);
        return A0H;
    }

    public C117865sc(AnonymousClass5ZU r3, C620733j r4) {
        this.A00 = r3;
        Collator A0w = C86614Ku.A0w(r4);
        this.A01 = A0w;
        A0w.setDecomposition(1);
    }

    /* renamed from: A00 */
    public int compare(AnonymousClass3ZH r7, AnonymousClass3ZH r8) {
        String A012 = A01(r7);
        String A013 = A01(r8);
        if (A012 == null && A013 == null) {
            return 0;
        }
        if (A012 != null) {
            if (A013 != null) {
                int compare = this.A01.compare(A012, A013);
                if (compare != 0) {
                    return compare;
                }
                C95814uZ r1 = r7.A0H;
                C95814uZ r0 = r8.A0H;
                if (r1 == null) {
                    if (r0 == null) {
                        return 0;
                    }
                } else if (r0 != null) {
                    return r1.compareTo((Jid) r0);
                }
            }
            return -1;
        }
        return 1;
    }
}
