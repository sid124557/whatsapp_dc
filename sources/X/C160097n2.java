package X;

/* renamed from: X.7n2  reason: invalid class name and case insensitive filesystem */
public final class C160097n2 {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C160097n2(Object obj, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj;
        if (i < 0) {
            throw AnonymousClass000.A0G("width must be >= 0, but was: ", AnonymousClass001.A0o(), i);
        } else if (i2 < 0) {
            throw AnonymousClass000.A0G("height must be >= 0, but was: ", AnonymousClass001.A0o(), i2);
        }
    }

    public /* synthetic */ C160097n2(long j) {
        this((Object) null, (int) ((j >> 32) & 4294967295L), (int) (j & 4294967295L));
    }

    public /* synthetic */ C160097n2(Object obj, C378924l r2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(obj, i, i2);
    }
}
