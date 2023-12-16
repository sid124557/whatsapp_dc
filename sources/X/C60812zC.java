package X;

import java.util.Set;

/* renamed from: X.2zC  reason: invalid class name and case insensitive filesystem */
public final class C60812zC {
    public final String A00;
    public final Set A01;
    public final Set A02;
    public final Set A03;

    public C60812zC(String str, Set set, Set set2, Set set3) {
        C162457s7.A0J(set3, 3);
        this.A01 = set;
        this.A03 = set2;
        this.A02 = set3;
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60812zC) {
                C60812zC r5 = (C60812zC) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A02, AnonymousClass000.A08(this.A03, C18300x5.A04(this.A01))) + C18270x1.A00(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PackageNameMatchingResult(allPackageNames=");
        A0o.append(this.A01);
        A0o.append(", packageNamesWithOtpRequest=");
        A0o.append(this.A03);
        A0o.append(", packageNamesWithActiveOtpRequest=");
        A0o.append(this.A02);
        A0o.append(", matchedPackageName=");
        return C18260x0.A07(this.A00, A0o);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60812zC() {
        /*
            r2 = this;
            r1 = 0
            X.3d7 r0 = X.C72063d7.A00
            r2.<init>(r1, r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60812zC.<init>():void");
    }
}
