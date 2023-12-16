package X;

import java.util.List;

/* renamed from: X.0Pm  reason: invalid class name and case insensitive filesystem */
public final class C04600Pm {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public C04600Pm(String str, String str2, String str3, List list, List list2) {
        C162457s7.A0J(str, 1);
        C162457s7.A0J(str2, 2);
        C162457s7.A0J(str3, 3);
        C162457s7.A0J(list, 4);
        C162457s7.A0J(list2, 5);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = list;
        this.A04 = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04600Pm)) {
            return false;
        }
        C04600Pm r4 = (C04600Pm) obj;
        if (!C162457s7.A0P(this.A02, r4.A02) || !C162457s7.A0P(this.A00, r4.A00) || !C162457s7.A0P(this.A01, r4.A01) || !C162457s7.A0P(this.A03, r4.A03)) {
            return false;
        }
        return C162457s7.A0P(this.A04, r4.A04);
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A04, AnonymousClass000.A08(this.A03, ((((this.A02.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode()) * 31));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ForeignKey{referenceTable='");
        A0o.append(this.A02);
        A0o.append("', onDelete='");
        A0o.append(this.A00);
        A0o.append(" +', onUpdate='");
        A0o.append(this.A01);
        A0o.append("', columnNames=");
        A0o.append(this.A03);
        A0o.append(", referenceColumnNames=");
        return AnonymousClass000.A0Q(this.A04, A0o);
    }
}
