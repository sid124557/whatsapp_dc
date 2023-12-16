package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.5S7  reason: invalid class name */
public final class AnonymousClass5S7 {
    public final int A00;
    public final View A01;
    public final ArrayList A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5S7) {
                AnonymousClass5S7 r5 = (AnonymousClass5S7) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, (C18300x5.A04(this.A02) + this.A00) * 31);
    }

    public AnonymousClass5S7(View view, ArrayList arrayList, int i) {
        this.A02 = arrayList;
        this.A00 = i;
        this.A01 = view;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PostDetailNavigationRequest(posts=");
        A0o.append(this.A02);
        A0o.append(", index=");
        A0o.append(this.A00);
        A0o.append(", childView=");
        return C18260x0.A04(this.A01, A0o);
    }
}
