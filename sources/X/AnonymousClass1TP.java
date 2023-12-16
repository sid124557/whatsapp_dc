package X;

import android.graphics.Bitmap;

/* renamed from: X.1TP  reason: invalid class name */
public final class AnonymousClass1TP extends AnonymousClass26T {
    public final Bitmap A00;
    public final C41552Kr A01;
    public final String A02;

    public AnonymousClass1TP(Bitmap bitmap, C41552Kr r3, String str) {
        C162457s7.A0J(str, 1);
        this.A02 = str;
        this.A00 = bitmap;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1TP) {
                AnonymousClass1TP r5 = (AnonymousClass1TP) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, (C18310x6.A09(this.A02) + AnonymousClass000.A07(this.A00)) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SearchExpressionsState(expressionsSearchVal=");
        A0o.append(this.A02);
        A0o.append(", dynamicAvatarIconBitmap=");
        A0o.append(this.A00);
        A0o.append(", selectedTab=");
        return C18260x0.A04(this.A01, A0o);
    }
}
