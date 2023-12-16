package X;

/* renamed from: X.85i  reason: invalid class name and case insensitive filesystem */
public class C1684185i implements C183838qk {
    public AnonymousClass7BA A00 = new AnonymousClass7BA();
    public final C153537bV A01;
    public final C162127rJ A02;
    public final AnonymousClass721 A03;

    public C186218uw B0Z() {
        return new C1683885f(this);
    }

    public C186408vG B0b() {
        return new C1684085h(this);
    }

    public C1684185i(C153537bV r4, C162127rJ r5, AnonymousClass721 r6) {
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = r4;
        C142366x5 r1 = C142366x5.VIDEO;
        if (r4 != null && r4.A02(r1) != null && r4.A02(r1).size() > 1) {
            throw new IllegalArgumentException("FrameRender should have media graph support for MediaComposition", new Throwable());
        }
    }
}
