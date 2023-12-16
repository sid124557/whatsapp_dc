package X;

import android.app.Activity;
import java.util.List;

/* renamed from: X.0QB  reason: invalid class name */
public final class AnonymousClass0QB {
    public final List A00;
    public final boolean A01;

    public final boolean A00(Activity activity) {
        C162457s7.A0J(activity, 0);
        return this.A00.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0QB)) {
            return false;
        }
        AnonymousClass0QB r4 = (AnonymousClass0QB) obj;
        return !C162457s7.A0P(this.A00, r4.A00) && this.A01 != r4.A01;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, (this.A01 ? 1 : 0) * true);
    }

    public AnonymousClass0QB(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ActivityStack{");
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("activities=");
        A0o2.append(this.A00);
        AnonymousClass000.A1B(A0o2, A0o);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("isEmpty=");
        A0o3.append(this.A01);
        String A0X = AnonymousClass000.A0X(AnonymousClass000.A0d(A0o3), A0o);
        C162457s7.A0D(A0X);
        return A0X;
    }
}
