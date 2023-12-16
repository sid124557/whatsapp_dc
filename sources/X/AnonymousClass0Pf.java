package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.0Pf  reason: invalid class name */
public final class AnonymousClass0Pf {
    public final String A00;
    public final Map A01;
    public final Set A02;
    public final Set A03;

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass0Pf) {
            AnonymousClass0Pf r5 = (AnonymousClass0Pf) obj;
            if (C162457s7.A0P(this.A00, r5.A00) && C162457s7.A0P(this.A01, r5.A01) && C162457s7.A0P(this.A02, r5.A02)) {
                Set set2 = this.A03;
                if (set2 == null || (set = r5.A03) == null) {
                    return true;
                }
                return set2.equals(set);
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass000.A08(this.A01, this.A00.hashCode() * 31));
    }

    public AnonymousClass0Pf(String str, Map map, Set set, Set set2) {
        this.A00 = str;
        this.A01 = map;
        this.A02 = set;
        this.A03 = set2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TableInfo{name='");
        A0o.append(this.A00);
        A0o.append("', columns=");
        A0o.append(this.A01);
        A0o.append(", foreignKeys=");
        A0o.append(this.A02);
        A0o.append(", indices=");
        return AnonymousClass000.A0Q(this.A03, A0o);
    }
}
