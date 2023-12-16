package X;

import java.util.List;

/* renamed from: X.5Z8  reason: invalid class name */
public final class AnonymousClass5Z8 {
    public final C132096eg A00;
    public final C132066ed A01;
    public final List A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Z8) {
                AnonymousClass5Z8 r5 = (AnonymousClass5Z8) obj;
                if (this.A06 != r5.A06 || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || this.A05 != r5.A05 || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01((((AnonymousClass000.A08(this.A02, AnonymousClass000.A08(this.A03, AnonymousClass0x9.A04(this.A06))) + AnonymousClass000.A07(this.A00)) * 31) + C18310x6.A07(this.A01)) * 31, this.A05), this.A04);
    }

    public AnonymousClass5Z8(C132096eg r1, C132066ed r2, List list, List list2, boolean z, boolean z2, boolean z3) {
        this.A06 = z;
        this.A03 = list;
        this.A02 = list2;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ViewState(isSaving=");
        A0o.append(this.A06);
        A0o.append(", avatarPoses=");
        A0o.append(this.A03);
        A0o.append(", avatarBackgrounds=");
        A0o.append(this.A02);
        A0o.append(", selectedBackground=");
        A0o.append(this.A00);
        A0o.append(", selectedPose=");
        A0o.append(this.A01);
        A0o.append(", isLoading=");
        A0o.append(this.A05);
        A0o.append(", isError=");
        return C18260x0.A0A(A0o, this.A04);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5Z8() {
        /*
            r8 = this;
            r1 = 0
            r5 = 0
            X.3d3 r3 = X.C72023d3.A00
            r0 = r8
            r2 = r1
            r4 = r3
            r6 = r5
            r7 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Z8.<init>():void");
    }
}
