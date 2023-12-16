package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Pe  reason: invalid class name */
public final class AnonymousClass0Pe {
    public List A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public AnonymousClass0Pe(String str, List list, List list2, boolean z) {
        C162457s7.A0J(str, 1);
        C162457s7.A0J(list, 3);
        C162457s7.A0J(list2, 4);
        this.A01 = str;
        this.A03 = z;
        this.A02 = list;
        this.A00 = list2;
        boolean isEmpty = list2.isEmpty();
        ArrayList arrayList = list2;
        if (isEmpty) {
            int size = list.size();
            ArrayList A0I = AnonymousClass002.A0I(size);
            for (int i = 0; i < size; i++) {
                A0I.add("ASC");
            }
            arrayList = A0I;
        }
        this.A00 = arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass0Pe) {
            AnonymousClass0Pe r5 = (AnonymousClass0Pe) obj;
            if (this.A03 == r5.A03 && C162457s7.A0P(this.A02, r5.A02) && C162457s7.A0P(this.A00, r5.A00)) {
                String str = this.A01;
                boolean A0X = C175738Zn.A0Y(str, "index_", false);
                String str2 = r5.A01;
                if (A0X) {
                    return C175738Zn.A0Y(str2, "index_", false);
                }
                return C162457s7.A0P(str, str2);
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.A01;
        if (C175738Zn.A0Y(str, "index_", false)) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return AnonymousClass002.A02(this.A00, AnonymousClass000.A08(this.A02, ((hashCode * 31) + (this.A03 ? 1 : 0)) * 31));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Index{name='");
        A0o.append(this.A01);
        A0o.append("', unique=");
        A0o.append(this.A03);
        A0o.append(", columns=");
        A0o.append(this.A02);
        A0o.append(", orders=");
        A0o.append(this.A00);
        return AnonymousClass000.A0X("'}", A0o);
    }
}
