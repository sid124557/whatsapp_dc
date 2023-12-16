package X;

import java.security.NoSuchAlgorithmException;

/* renamed from: X.4vk  reason: invalid class name and case insensitive filesystem */
public final class C96064vk extends AnonymousClass59Y {
    public final NoSuchAlgorithmException throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C96064vk) && C162457s7.A0P(this.throwable, ((C96064vk) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public C96064vk(NoSuchAlgorithmException noSuchAlgorithmException) {
        this.throwable = noSuchAlgorithmException;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ModelHashAlgorithmError(throwable=");
        return C18260x0.A04(this.throwable, A0o);
    }
}
