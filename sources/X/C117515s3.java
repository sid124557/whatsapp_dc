package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.5s3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117515s3 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C106185Xy A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public final void run() {
        C106185Xy r7 = this.A01;
        String str = this.A07;
        int i = this.A00;
        Integer num = this.A02;
        boolean z = this.A08;
        Integer num2 = this.A03;
        Integer num3 = this.A04;
        Integer num4 = this.A05;
        boolean z2 = this.A09;
        Integer num5 = this.A06;
        Jid A032 = Jid.Companion.A03(str);
        AnonymousClass4sY r1 = new AnonymousClass4sY();
        C105145Tt r11 = r7.A00;
        r1.A09 = AnonymousClass0x9.A0m(r11.A0D.getAndIncrement());
        r1.A06 = Integer.valueOf(i);
        r1.A0B = r11.A02;
        r1.A0A = r7.A02.A00(A032);
        r1.A07 = num;
        r1.A01 = Boolean.valueOf(z);
        r1.A02 = num2;
        r1.A03 = num3;
        r1.A04 = num4;
        r1.A00 = Boolean.valueOf(z2);
        r1.A05 = num5;
        r7.A01.BhD(r1);
    }

    public /* synthetic */ C117515s3(C106185Xy r1, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A07 = str;
        this.A00 = i;
        this.A02 = num;
        this.A08 = z;
        this.A03 = num2;
        this.A04 = num3;
        this.A05 = num4;
        this.A09 = z2;
        this.A06 = num5;
    }
}
