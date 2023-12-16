package X;

/* renamed from: X.3WL  reason: invalid class name */
public final class AnonymousClass3WL implements AnonymousClass4G7 {
    public /* bridge */ /* synthetic */ C30341mI B0l(AnonymousClass2z0 r3, int i, long j) {
        C31571oV r1;
        int i2;
        if (i == 75) {
            return new C31571oV(r3, 75, j);
        }
        if (i == 95) {
            r1 = new C31571oV(r3, 95, j);
            i2 = 2;
        } else if (i == 98) {
            r1 = new C31571oV(r3, 98, j);
            i2 = 0;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("System Action `");
            A0o.append(i);
            throw AnonymousClass000.A0I("` not supported by this factory.", A0o);
        }
        r1.A00 = i2;
        return r1;
    }
}
