package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.1Tc  reason: invalid class name */
public final class AnonymousClass1Tc extends AnonymousClass26W {
    public final int A00;
    public final Bitmap A01;
    public final C41552Kr A02;
    public final List A03;
    public final boolean A04;

    public AnonymousClass1Tc(Bitmap bitmap, C41552Kr r3, List list, int i, boolean z) {
        C162457s7.A0J(list, 4);
        this.A02 = r3;
        this.A00 = i;
        this.A01 = bitmap;
        this.A03 = list;
        this.A04 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1Tc) {
                AnonymousClass1Tc r5 = (AnonymousClass1Tc) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03) || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass000.A08(this.A03, (((C18300x5.A04(this.A02) + this.A00) * 31) + AnonymousClass000.A07(this.A01)) * 31), this.A04);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BrowserState(selectedTab=");
        A0o.append(this.A02);
        A0o.append(", selectedTabPosition=");
        A0o.append(this.A00);
        A0o.append(", dynamicAvatarIconBitmap=");
        A0o.append(this.A01);
        A0o.append(", tabs=");
        A0o.append(this.A03);
        A0o.append(", showAvatarEditIcon=");
        return C18260x0.A0A(A0o, this.A04);
    }
}
