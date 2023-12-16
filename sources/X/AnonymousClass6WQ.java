package X;

/* renamed from: X.6WQ  reason: invalid class name */
public final class AnonymousClass6WQ extends AnonymousClass6WS {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ AnonymousClass6WS zzc;

    public AnonymousClass6WQ(AnonymousClass6WS r1, int i, int i2) {
        this.zzc = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public final Object get(int i) {
        C159327le.A01(i, this.A01);
        return this.zzc.get(i + this.A00);
    }

    public final int size() {
        return this.A01;
    }
}
