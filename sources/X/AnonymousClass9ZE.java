package X;

import android.os.Handler;

/* renamed from: X.9ZE  reason: invalid class name */
public class AnonymousClass9ZE implements C185288tO {
    public C1680583y A00;
    public AnonymousClass9ZF A01;
    public AnonymousClass9ZF A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass9XL A05;
    public final AnonymousClass9MQ A06;
    public final AnonymousClass9MR A07;
    public final C157207hv A08;

    public void B1c() {
        AnonymousClass9XL r2 = this.A05;
        r2.A0D = false;
        r2.A05.post(r2.A0A);
    }

    public void BFr(C185568tt r6) {
        C157207hv r4 = this.A08;
        this.A02 = new AnonymousClass9ZF(r4);
        this.A01 = new AnonymousClass9ZF(r4);
        this.A00 = new C1680583y(r4, new C126196Mv(), new C126176Mt(), false);
        r6.AxO(this.A02);
        r6.AxO(this.A01);
    }

    public AnonymousClass9ZE(Handler handler, AnonymousClass9MR r4, C157207hv r5) {
        AnonymousClass9MQ r1 = new AnonymousClass9MQ(this);
        this.A06 = r1;
        this.A08 = r5;
        this.A07 = r4;
        this.A05 = new AnonymousClass9XL(handler, r1);
    }

    public void release() {
    }

    public void AxN(C185558ts r1) {
    }
}
