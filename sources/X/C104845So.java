package X;

import java.util.List;

/* renamed from: X.5So  reason: invalid class name and case insensitive filesystem */
public final class C104845So {
    public final int A00;
    public final String A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104845So) {
                C104845So r5 = (C104845So) obj;
                if (!(this.A03 == r5.A03 && this.A00 == r5.A00 && this.A04 == r5.A04 && C162457s7.A0P(this.A02, r5.A02) && C162457s7.A0P(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A02, AnonymousClass0x2.A01((AnonymousClass0x9.A04(this.A03) + this.A00) * 31, this.A04)) + C18270x1.A00(this.A01);
    }

    public C104845So(String str, List list, int i, boolean z, boolean z2) {
        this.A03 = z;
        this.A00 = i;
        this.A04 = z2;
        this.A02 = list;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SeeAllUiStateData(shouldShowEmptyText=");
        A0o.append(this.A03);
        A0o.append(", emptyTextResource=");
        A0o.append(this.A00);
        A0o.append(", shouldShowEmptyTextAction=");
        A0o.append(this.A04);
        A0o.append(", updateDataItems=");
        A0o.append(this.A02);
        A0o.append(", emptyTextOptionalArgument=");
        return C18260x0.A07(this.A01, A0o);
    }
}
