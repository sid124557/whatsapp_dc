package X;

/* renamed from: X.8AD  reason: invalid class name */
public final class AnonymousClass8AD implements C183938qu {
    public final C183938qu[] A00;

    public final C178488hc BtY(Class cls) {
        C183938qu[] r3 = this.A00;
        int i = 0;
        do {
            C183938qu r1 = r3[i];
            if (r1.Btr(cls)) {
                return r1.BtY(cls);
            }
            i++;
        } while (i < 2);
        throw AnonymousClass002.A0G("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean Btr(Class cls) {
        C183938qu[] r3 = this.A00;
        int i = 0;
        while (!r3[i].Btr(cls)) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass8AD(C183938qu... r1) {
        this.A00 = r1;
    }
}
