package X;

/* renamed from: X.46c  reason: invalid class name and case insensitive filesystem */
public abstract class C830946c extends AnonymousClass472 implements AnonymousClass4C7, C84834Dw {
    public C72753eE A00;

    public final C72753eE A06() {
        C72753eE r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("job");
    }

    public C833246z B98() {
        return null;
    }

    public boolean BGz() {
        return true;
    }

    public void dispose() {
        A06().A0i(this);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1A(this, A0o);
        C18270x1.A18(this, A0o, '@');
        A0o.append("[job@");
        A0o.append(Integer.toHexString(System.identityHashCode(A06())));
        return AnonymousClass0x2.A0f(A0o);
    }
}
