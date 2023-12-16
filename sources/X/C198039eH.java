package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.9eH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C198039eH implements C84134Bd {
    public final /* synthetic */ AnonymousClass39R A00;
    public final /* synthetic */ AnonymousClass3QO A01;
    public final /* synthetic */ AnonymousClass9PL A02;
    public final /* synthetic */ AnonymousClass9VS A03;
    public final /* synthetic */ CountDownLatch A04;

    public final void AwB(Object obj) {
        AnonymousClass9VS r11 = this.A03;
        AnonymousClass3QO r1 = this.A01;
        AnonymousClass39R r10 = this.A00;
        AnonymousClass9PL r9 = this.A02;
        CountDownLatch countDownLatch = this.A04;
        if (AnonymousClass001.A0K(obj) == 0 && r1.A02() != null) {
            C56752sV r12 = r1.A02().A02;
            if (r12.A00() != null) {
                byte[] bArr = r12.A00().A01;
                long j = r12.A00().A00;
                String A06 = r12.A06();
                String A05 = r12.A05();
                String A032 = r12.A03();
                boolean A0X = r11.A04.A0X(1084);
                r10.A08 = bArr;
                r10.A00 = j;
                r10.A04 = A06;
                r10.A03 = A05;
                r10.A02 = A032;
                r10.A07 = A0X;
                r9.A00 = 1;
                countDownLatch.countDown();
            }
        }
        r9.A01 = 3;
        countDownLatch.countDown();
    }

    public /* synthetic */ C198039eH(AnonymousClass39R r1, AnonymousClass3QO r2, AnonymousClass9PL r3, AnonymousClass9VS r4, CountDownLatch countDownLatch) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = countDownLatch;
    }
}
