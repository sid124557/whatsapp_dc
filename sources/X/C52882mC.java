package X;

import com.whatsapp.jid.GroupJid;
import java.util.AbstractCollection;
import java.util.Arrays;

/* renamed from: X.2mC  reason: invalid class name and case insensitive filesystem */
public class C52882mC {
    public int A00;
    public final long A01;
    public final GroupJid A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C52882mC r7 = (C52882mC) obj;
            if (this.A01 != r7.A01 || !this.A02.equals(r7.A02) || !this.A03.equals(r7.A03) || this.A00 != r7.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A02;
        objArr[1] = this.A03;
        AnonymousClass0x2.A1U(objArr, this.A01);
        AnonymousClass000.A1O(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public static void A00(GroupJid groupJid, String str, AbstractCollection abstractCollection) {
        abstractCollection.add(new C52882mC(groupJid, str, 2, 0));
    }

    public C52882mC(GroupJid groupJid, String str, int i, long j) {
        this.A02 = groupJid;
        this.A03 = str;
        this.A01 = j;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Subgroup{groupJid=");
        A0o.append(this.A02);
        A0o.append(", subject='");
        C18320x8.A1M(A0o, this.A03);
        A0o.append(", subjectTime=");
        A0o.append(this.A01);
        A0o.append(", groupType=");
        A0o.append(this.A00);
        return AnonymousClass000.A0d(A0o);
    }
}
