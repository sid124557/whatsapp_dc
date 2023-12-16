package X;

import android.net.Uri;

/* renamed from: X.0OP  reason: invalid class name */
public final class AnonymousClass0OP {
    public final Uri A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<AnonymousClass0OP> cls2 = AnonymousClass0OP.class;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (cls2.equals(cls)) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
                AnonymousClass0OP r5 = (AnonymousClass0OP) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }

    public AnonymousClass0OP(Uri uri, boolean z) {
        this.A00 = uri;
        this.A01 = z;
    }
}
