package X;

/* renamed from: X.8At  reason: invalid class name and case insensitive filesystem */
public final class C169818At implements C183958qw {
    public C183958qw[] A00;

    public final boolean BtN(Class cls) {
        for (C183958qw BtN : this.A00) {
            if (BtN.BtN(cls)) {
                return true;
            }
        }
        return false;
    }

    public final C178618hp Btb(Class cls) {
        for (C183958qw r1 : this.A00) {
            if (r1.BtN(cls)) {
                return r1.Btb(cls);
            }
        }
        String name = cls.getName();
        throw AnonymousClass002.A0G(AnonymousClass6C7.A0k("No factory is available for message type: ", name, name.length()));
    }

    public C169818At(C183958qw... r1) {
        this.A00 = r1;
    }
}
