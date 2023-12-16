package X;

import java.util.Collection;

/* renamed from: X.4kO  reason: invalid class name and case insensitive filesystem */
public final class C91574kO extends AnonymousClass5AS {
    public final Collection A00;

    public C91574kO(Collection collection) {
        C162457s7.A0J(collection, 1);
        this.A00 = collection;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91574kO) && C162457s7.A0P(this.A00, ((C91574kO) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LockMultipleChats(chatJids=");
        return C18260x0.A04(this.A00, A0o);
    }
}
