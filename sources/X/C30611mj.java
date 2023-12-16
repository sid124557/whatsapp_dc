package X;

/* renamed from: X.1mj  reason: invalid class name and case insensitive filesystem */
public class C30611mj extends AnonymousClass2z0 {
    public final int A00;

    public C30611mj(AnonymousClass2z0 r1, int i) {
        super(r1);
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof C30611mj) || ((C30611mj) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Key[id=");
        AnonymousClass2z0.A0A(this, A0o);
        A0o.append(", from_me=");
        A0o.append(this.A02);
        A0o.append(", remote_jid=");
        A0o.append(this.A00);
        A0o.append(", card_index=");
        A0o.append(this.A00);
        return AnonymousClass000.A0f(A0o);
    }
}
