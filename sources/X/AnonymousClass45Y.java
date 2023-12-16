package X;

/* renamed from: X.45Y  reason: invalid class name */
public final class AnonymousClass45Y extends C829045j implements AnonymousClass4GR {
    public static final AnonymousClass45Y A00 = new AnonymousClass45Y();

    public AnonymousClass45Y() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C72543dt r0;
        C85494Gl r6 = (C85494Gl) obj;
        C85484Gk r7 = (C85484Gk) obj2;
        C18260x0.A0O(r6, r7);
        C85494Gl minusKey = r6.minusKey(r7.getKey());
        C72553du r3 = C72553du.A00;
        if (minusKey == r3) {
            return r7;
        }
        C72513dq r02 = AnonymousClass4GY.A00;
        C85484Gk r2 = minusKey.get(r02);
        if (r2 == null) {
            return new C72543dt(r7, minusKey);
        }
        C85494Gl minusKey2 = minusKey.minusKey(r02);
        if (minusKey2 == r3) {
            return r0;
        }
        r0 = new C72543dt(r7, minusKey2);
        return new C72543dt(r2, r0);
    }
}
