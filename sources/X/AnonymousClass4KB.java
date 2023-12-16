package X;

/* renamed from: X.4KB  reason: invalid class name */
public class AnonymousClass4KB implements AnonymousClass4BZ {
    public Object A00;
    public final int A01;

    public AnonymousClass4KB(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bez(int i, int i2, long j, long j2) {
        if (this.A01 != 0) {
            Integer[] numArr = new Integer[1];
            AnonymousClass000.A1P(numArr, i + ((int) (((float) i2) * (((float) j) / ((float) j2)))), 0);
            ((AnonymousClass5ZM) this.A00).A0F(numArr);
            return;
        }
        Integer[] numArr2 = new Integer[1];
        AnonymousClass000.A1L(numArr2, i + ((int) (((float) i2) * (((float) j) / ((float) j2)))));
        ((AnonymousClass5ZM) this.A00).A0F(numArr2);
    }
}
