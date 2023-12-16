package X;

import java.util.Collection;

/* renamed from: X.5SP  reason: invalid class name */
public final class AnonymousClass5SP {
    public final Integer A00;
    public final String A01;
    public final Collection A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SP) {
                AnonymousClass5SP r5 = (AnonymousClass5SP) obj;
                if (this.A03 != r5.A03 || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A02, (AnonymousClass0x9.A04(this.A03) + AnonymousClass000.A07(this.A00)) * 31) + AnonymousClass0x7.A07(this.A01);
    }

    public AnonymousClass5SP(Integer num, String str, Collection collection, boolean z) {
        this.A03 = z;
        this.A00 = num;
        this.A02 = collection;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VoipContactPickerUiState(isVideo=");
        A0o.append(this.A03);
        A0o.append(", customMultiSelectLimit=");
        A0o.append(this.A00);
        A0o.append(", jidsToExclude=");
        A0o.append(this.A02);
        A0o.append(", callLinkToken=");
        return C18260x0.A07(this.A01, A0o);
    }
}
