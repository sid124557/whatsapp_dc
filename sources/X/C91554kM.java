package X;

import java.util.Collection;

/* renamed from: X.4kM  reason: invalid class name and case insensitive filesystem */
public final class C91554kM extends AnonymousClass5AS {
    public final Collection A00;

    public C91554kM(Collection collection) {
        C162457s7.A0J(collection, 1);
        this.A00 = collection;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91554kM) && C162457s7.A0P(this.A00, ((C91554kM) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DisableMultipleChatLock(chatJids=");
        return C18260x0.A04(this.A00, A0o);
    }
}
