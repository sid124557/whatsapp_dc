package X;

/* renamed from: X.8zi  reason: invalid class name and case insensitive filesystem */
public class C188928zi extends AnonymousClass8O3 {
    public Object A00;
    public final int A01;

    /* renamed from: result  reason: collision with other method in class */
    public Object m25result(int i) {
        return this.A01 != 0 ? result(i) : result(this, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C188928zi(C129376aD r1, int i) {
        super(r1);
        this.A01 = i;
        this.A00 = r1;
    }

    public static Object result(C188928zi r0, int i) {
        return ((C129376aD) r0.A00).backingMap.getKey(i);
    }

    public C153177an result(int i) {
        return ((C129376aD) this.A00).backingMap.getEntry(i);
    }
}
