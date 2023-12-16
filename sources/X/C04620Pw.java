package X;

import java.util.List;

/* renamed from: X.0Pw  reason: invalid class name and case insensitive filesystem */
public final class C04620Pw {
    public int A00;
    public AnonymousClass0Xq A01;
    public AnonymousClass0GD A02;
    public String A03;
    public List A04;
    public List A05;
    public final int A06;

    public C04620Pw(AnonymousClass0Xq r2, AnonymousClass0GD r3, String str, List list, List list2, int i, int i2) {
        C162457s7.A0J(str, 1);
        C162457s7.A0J(r3, 2);
        this.A03 = str;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = i;
        this.A06 = i2;
        this.A05 = list;
        this.A04 = list2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C04620Pw) {
                C04620Pw r5 = (C04620Pw) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || this.A02 != r5.A02 || !C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00 || this.A06 != r5.A06 || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A08 = AnonymousClass000.A08(this.A02, this.A03.hashCode() * 31);
        return AnonymousClass002.A02(this.A04, AnonymousClass000.A08(this.A05, (((AnonymousClass000.A08(this.A01, A08) + this.A00) * 31) + this.A06) * 31));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WorkInfoPojo(id=");
        A0o.append(this.A03);
        A0o.append(", state=");
        A0o.append(this.A02);
        A0o.append(", output=");
        A0o.append(this.A01);
        A0o.append(", runAttemptCount=");
        A0o.append(this.A00);
        A0o.append(", generation=");
        A0o.append(this.A06);
        A0o.append(", tags=");
        A0o.append(this.A05);
        A0o.append(", progress=");
        A0o.append(this.A04);
        return AnonymousClass000.A0c(A0o);
    }
}
