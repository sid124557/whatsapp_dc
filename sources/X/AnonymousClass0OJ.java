package X;

import android.content.res.Resources;

/* renamed from: X.0OJ  reason: invalid class name */
public final class AnonymousClass0OJ {
    public final Resources.Theme A00;
    public final Resources A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass0OJ.class != obj.getClass()) {
                return false;
            }
            AnonymousClass0OJ r5 = (AnonymousClass0OJ) obj;
            if (!this.A01.equals(r5.A01) || !C04880Ra.A01(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass0OJ(Resources.Theme theme, Resources resources) {
        this.A01 = resources;
        this.A00 = theme;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        A0M[1] = this.A00;
        return C04880Ra.A00(A0M);
    }
}
