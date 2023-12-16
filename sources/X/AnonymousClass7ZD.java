package X;

import java.util.List;

/* renamed from: X.7ZD  reason: invalid class name */
public final class AnonymousClass7ZD {
    public List A00;
    public List A01;
    public final int A02;
    public final String A03;

    public AnonymousClass7ZD(String str, List list, List list2, int i) {
        C162457s7.A0J(str, 1);
        this.A03 = str;
        this.A01 = list;
        this.A00 = list2;
        this.A02 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZD) {
                AnonymousClass7ZD r5 = (AnonymousClass7ZD) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00, AnonymousClass000.A08(this.A01, C18310x6.A09(this.A03))) + this.A02;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MapViewBusinessData(viewType=");
        A0o.append(this.A03);
        A0o.append(", clusterList=");
        A0o.append(this.A01);
        A0o.append(", businessList=");
        A0o.append(this.A00);
        A0o.append(", resultState=");
        return C18260x0.A09(A0o, this.A02);
    }
}
