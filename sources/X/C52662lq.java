package X;

import com.whatsapp.jid.GroupJid;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.2lq  reason: invalid class name and case insensitive filesystem */
public final class C52662lq {
    public final int A00;
    public final GroupJid A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52662lq) {
                C52662lq r5 = (C52662lq) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(GroupJid groupJid, String str, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C52662lq(groupJid, str, i));
    }

    public static void A01(GroupJid groupJid, String str, List list, int i) {
        list.add(new C52662lq(groupJid, str, i));
    }

    public int hashCode() {
        return ((C18300x5.A04(this.A01) + C18270x1.A00(this.A02)) * 31) + this.A00;
    }

    public C52662lq(GroupJid groupJid, String str, int i) {
        this.A01 = groupJid;
        this.A02 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupNode(jid=");
        A0o.append(this.A01);
        A0o.append(", subject=");
        A0o.append(this.A02);
        A0o.append(", type=");
        return C18260x0.A09(A0o, this.A00);
    }
}
