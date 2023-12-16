package X;

/* renamed from: X.2AN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2AN {
    public static final AnonymousClass4C8 A00(C85494Gl r6, AnonymousClass4C8 r7) {
        AnonymousClass4C8 r5 = r7;
        C85494Gl r2 = r6;
        if (r6.get(C85474Gj.A00) != null) {
            throw AnonymousClass000.A0E(r6, "Flow context cannot contain job in it. Had ", AnonymousClass001.A0o());
        } else if (r6.equals(C72553du.A00)) {
            return r5;
        } else {
            if (r7 instanceof C85554Gs) {
                return ((C85554Gs) r5).B3e(r6, C369720l.SUSPEND, -3);
            }
            return new C832846v(r2, (C378924l) null, (C369720l) null, r5, 0, 12);
        }
    }
}
