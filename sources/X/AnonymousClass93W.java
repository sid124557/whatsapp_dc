package X;

/* renamed from: X.93W  reason: invalid class name */
public class AnonymousClass93W implements AnonymousClass4BP {
    public Object A00;
    public final int A01;

    public AnonymousClass93W(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bci(AnonymousClass39M r3, Integer num, int i) {
        AnonymousClass4BP r0;
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            r0 = ((C137306oT) obj).A03;
        } else {
            r0 = ((C137296oS) obj).A07;
        }
        if (r0 != null) {
            r0.Bci(r3, num, i);
        }
    }
}
