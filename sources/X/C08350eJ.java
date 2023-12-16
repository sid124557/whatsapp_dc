package X;

/* renamed from: X.0eJ  reason: invalid class name and case insensitive filesystem */
public class C08350eJ implements C15930sC {
    public int A00 = -1;
    public final C06270Wx A01;
    public final C15930sC A02;

    public void BOf(Object obj) {
        int i = this.A00;
        int i2 = this.A01.A01;
        if (i != i2) {
            this.A00 = i2;
            this.A02.BOf(obj);
        }
    }

    public C08350eJ(C06270Wx r2, C15930sC r3) {
        this.A01 = r2;
        this.A02 = r3;
    }
}
