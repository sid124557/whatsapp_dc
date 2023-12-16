package X;

import java.io.Serializable;

/* renamed from: X.3Z9  reason: invalid class name */
public final class AnonymousClass3Z9 implements Serializable {
    public final Object value;

    public static final Throwable A00(Object obj) {
        if (obj instanceof AnonymousClass3Z0) {
            return ((AnonymousClass3Z0) obj).exception;
        }
        return null;
    }

    public boolean equals(Object obj) {
        Object obj2 = this.value;
        if (!(obj instanceof AnonymousClass3Z9) || !C162457s7.A0P(obj2, ((AnonymousClass3Z9) obj).value)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.value);
    }

    public String toString() {
        Object obj = this.value;
        if (obj instanceof AnonymousClass3Z0) {
            return obj.toString();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Success(");
        return C18260x0.A04(obj, A0o);
    }

    public /* synthetic */ AnonymousClass3Z9(Object obj) {
        this.value = obj;
    }
}
