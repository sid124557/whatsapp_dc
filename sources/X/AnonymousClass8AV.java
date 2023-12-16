package X;

/* renamed from: X.8AV  reason: invalid class name */
public final class AnonymousClass8AV implements C183948qv {
    public C183948qv[] A00;

    public final boolean BtN(Class cls) {
        for (C183948qv BtN : this.A00) {
            if (BtN.BtN(cls)) {
                return true;
            }
        }
        return false;
    }

    public final C178548hi Bta(Class cls) {
        for (C183948qv r1 : this.A00) {
            if (r1.BtN(cls)) {
                return r1.Bta(cls);
            }
        }
        String name = cls.getName();
        throw AnonymousClass002.A0G(AnonymousClass6C7.A0k("No factory is available for message type: ", name, name.length()));
    }

    public AnonymousClass8AV(C183948qv... r1) {
        this.A00 = r1;
    }
}
