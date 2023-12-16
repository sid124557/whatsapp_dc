package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5Tt  reason: invalid class name and case insensitive filesystem */
public class C105145Tt {
    public String A00;
    public String A01;
    public String A02;
    public boolean A03 = false;
    public final C56972sr A04;
    public final C56422rx A05;
    public final AnonymousClass1VX A06;
    public final AnonymousClass4FV A07;
    public final AnonymousClass2WM A08;
    public final AnonymousClass5ZC A09;
    public final AnonymousClass4FS A0A;
    public final C183538qC A0B;
    public final AtomicInteger A0C = new AtomicInteger();
    public final AtomicInteger A0D = new AtomicInteger();

    public void A01(int i) {
        A02(i, (String) null, (String) null);
    }

    public AnonymousClass7KG A00() {
        return new AnonymousClass7KG(this.A02, this.A0C.get(), (long) this.A0D.getAndIncrement());
    }

    public void A03(AnonymousClass5P6 r3) {
        C117165rU.A00(this.A0A, this, r3, 42);
    }

    public C105145Tt(C56972sr r2, C56422rx r3, AnonymousClass1VX r4, AnonymousClass4FV r5, AnonymousClass2WM r6, AnonymousClass4FS r7, C183538qC r8) {
        this.A06 = r4;
        this.A04 = r2;
        this.A0A = r7;
        this.A07 = r5;
        this.A08 = r6;
        this.A05 = r3;
        this.A09 = AnonymousClass3ZG.DEFAULT_SAMPLING_RATE;
        this.A0B = r8;
    }

    public void A02(int i, String str, String str2) {
        this.A02 = C18280x3.A0Y();
        if (this.A06.A0X(4494)) {
            ((C59602xB) this.A0B.get()).A00 = System.currentTimeMillis();
        }
        this.A0D.set(1);
        this.A0C.set(i);
        this.A01 = str;
        this.A00 = str2;
        this.A03 = true;
    }
}
