package X;

/* renamed from: X.1ho  reason: invalid class name and case insensitive filesystem */
public class C28811ho extends C61102zi {
    public final C183538qC A00;

    public C28811ho(C183538qC r1, C183538qC r2) {
        super(r1);
        this.A00 = r2;
    }

    public final void A08(C47722di r5, Exception exc) {
        String A0O = AnonymousClass000.A0O(r5);
        ((C55682qk) this.A00.get()).A09("abprops-observer-crashed", A0O, new RuntimeException(AnonymousClass000.A0V("Observer crashed: ", A0O, AnonymousClass001.A0o()), exc));
    }
}
