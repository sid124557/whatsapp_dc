package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.5Sm  reason: invalid class name and case insensitive filesystem */
public final class C104825Sm {
    public final int A00;
    public final Drawable A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C104825Sm(Drawable drawable, String str, String str2, String str3, int i) {
        C162457s7.A0J(str, 1);
        this.A04 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A01 = drawable;
        this.A03 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104825Sm) {
                C104825Sm r5 = (C104825Sm) obj;
                if (!C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A02, r5.A02) || this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C18310x6.A09(this.A04) + C18270x1.A00(this.A02)) * 31) + this.A00) * 31) + AnonymousClass000.A07(this.A01)) * 31) + AnonymousClass0x7.A07(this.A03);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SearchResultItem(text=");
        A0o.append(this.A04);
        A0o.append(", settingType=");
        A0o.append(this.A02);
        A0o.append(", viewType=");
        A0o.append(this.A00);
        A0o.append(", icon=");
        A0o.append(this.A01);
        A0o.append(", subtitle=");
        return C18260x0.A07(this.A03, A0o);
    }
}
