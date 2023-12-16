package X;

import java.util.List;

/* renamed from: X.5Rn  reason: invalid class name and case insensitive filesystem */
public final class C104575Rn {
    public final C26061bW A00;
    public final List A01;

    public C104575Rn(C26061bW r2, List list) {
        C162457s7.A0J(list, 2);
        this.A00 = r2;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104575Rn) {
                C104575Rn r5 = (C104575Rn) obj;
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

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MediaJobEventBundle(mediaUpload2=");
        A0o.append(this.A00);
        A0o.append(", mediaUploadSlaList=");
        return C18260x0.A04(this.A01, A0o);
    }
}
