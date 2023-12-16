package X;

import java.util.Set;

/* renamed from: X.2jn  reason: invalid class name and case insensitive filesystem */
public final class C51422jn {
    public final Set A00;
    public final AnonymousClass4GP A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51422jn) {
                C51422jn r5 = (C51422jn) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public C51422jn(Set set, AnonymousClass4GP r2) {
        this.A00 = set;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CommunitySuspendActionModeUiState(selectedJids=");
        A0o.append(this.A00);
        A0o.append(", clear=");
        return C18260x0.A04(this.A01, A0o);
    }
}
