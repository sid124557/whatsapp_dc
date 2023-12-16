package X;

/* renamed from: X.86C  reason: invalid class name */
public class AnonymousClass86C implements C178048gs {
    public final AnonymousClass6OT A00;
    public final AnonymousClass866 A01;
    public final C187058wN[] A02;

    public AnonymousClass86C(C187058wN... r6) {
        AnonymousClass6OT r4 = new AnonymousClass6OT();
        AnonymousClass866 r3 = new AnonymousClass866();
        int length = r6.length;
        C187058wN[] r1 = new C187058wN[(length + 2)];
        this.A02 = r1;
        System.arraycopy(r6, 0, r1, 0, length);
        this.A00 = r4;
        this.A01 = r3;
        r1[length] = r4;
        r1[length + 1] = r3;
    }
}
