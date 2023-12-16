package X;

import java.util.Random;

/* renamed from: X.5lm  reason: invalid class name and case insensitive filesystem */
public final class C113655lm implements AnonymousClass4E8 {
    public final C55682qk A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass4FV A02;

    public String BDW() {
        return "CrashDailyCron";
    }

    public void BQW() {
        C22121Ep r3 = (C22121Ep) this.A00;
        r3.A0D.BkM(new C69983Zk(r3, 0));
        int A0N = this.A01.A0N(1211);
        if (A0N > 0 && new Random().nextInt(A0N) < 1) {
            C94934sK r1 = new C94934sK();
            r1.A01 = C18290x4.A0Z();
            r1.A02 = AnonymousClass0x2.A0U();
            r1.A06 = "Dummy";
            r1.A05 = "Dummy";
            r1.A04 = "2.23.26.14";
            this.A02.BhA(r1);
        }
    }

    public /* synthetic */ void BQX() {
    }

    public C113655lm(C55682qk r1, AnonymousClass1VX r2, AnonymousClass4FV r3) {
        C18260x0.A0V(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
