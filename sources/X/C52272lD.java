package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.2lD  reason: invalid class name and case insensitive filesystem */
public final class C52272lD {
    public final C52882mC A00;
    public final GroupJid A01;
    public final boolean A02;

    public C52272lD(C52882mC r2, GroupJid groupJid, boolean z) {
        C162457s7.A0J(groupJid, 2);
        this.A00 = r2;
        this.A01 = groupJid;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52272lD) {
                C52272lD r5 = (C52272lD) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass000.A08(this.A01, C18300x5.A04(this.A00)), this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SubgroupDataModel(subgroup=");
        A0o.append(this.A00);
        A0o.append(", parentGroupJid=");
        A0o.append(this.A01);
        A0o.append(", isNew=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
