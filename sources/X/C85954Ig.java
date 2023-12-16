package X;

/* renamed from: X.4Ig  reason: invalid class name and case insensitive filesystem */
public class C85954Ig implements AnonymousClass4EI {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C85954Ig(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A02 = obj3;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void BQp() {
        int i = this.A03;
        Object obj = this.A00;
        switch (i) {
            case 3:
            case 4:
                ((C84244Bp) obj).onError(AnonymousClass001.A0K(this.A01));
                return;
            default:
                ((AnonymousClass4EJ) obj).BQp();
                return;
        }
    }

    public void BSB(Exception exc) {
        int i = this.A03;
        Object obj = this.A00;
        switch (i) {
            case 3:
            case 4:
                ((C84244Bp) obj).onError(AnonymousClass001.A0K(this.A01));
                return;
            default:
                ((AnonymousClass4EJ) obj).BSB((Exception) this.A01);
                return;
        }
    }

    public void Bd3(C60272yH r3) {
        int i = this.A03;
        Object obj = this.A02;
        switch (i) {
            case 3:
            case 4:
                AnonymousClass0x9.A1K(obj);
                return;
            default:
                ((AnonymousClass4GP) obj).invoke();
                return;
        }
    }
}
