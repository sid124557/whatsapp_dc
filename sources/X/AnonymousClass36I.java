package X;

/* renamed from: X.36I  reason: invalid class name */
public final class AnonymousClass36I {
    public static final C72733eC A00 = new C72733eC(true);
    public static final C72733eC A01 = new C72733eC(false);
    public static final AnonymousClass2XH A02 = new AnonymousClass2XH("COMPLETING_ALREADY");
    public static final AnonymousClass2XH A03 = new AnonymousClass2XH("COMPLETING_RETRY");
    public static final AnonymousClass2XH A04 = new AnonymousClass2XH("COMPLETING_WAITING_CHILDREN");
    public static final AnonymousClass2XH A05 = new AnonymousClass2XH("SEALED");
    public static final AnonymousClass2XH A06 = new AnonymousClass2XH("TOO_LATE_TO_CANCEL");

    public static final Object A00(Object obj) {
        if (obj instanceof C84834Dw) {
            return new AnonymousClass2J6((C84834Dw) obj);
        }
        return obj;
    }

    public static final Object A01(Object obj) {
        AnonymousClass2J6 r0;
        C84834Dw r02;
        if (!(obj instanceof AnonymousClass2J6) || (r0 = (AnonymousClass2J6) obj) == null || (r02 = r0.A00) == null) {
            return obj;
        }
        return r02;
    }
}
