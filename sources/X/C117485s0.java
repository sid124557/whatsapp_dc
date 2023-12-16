package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5s0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117485s0 implements Runnable {
    public final /* synthetic */ C105145Tt A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public final void run() {
        C105145Tt r9 = this.A00;
        String str = this.A07;
        UserJid userJid = this.A01;
        Integer num = this.A03;
        Long l = this.A05;
        Long l2 = this.A06;
        Boolean bool = this.A02;
        String str2 = this.A08;
        Integer num2 = this.A04;
        C94964sN r1 = new C94964sN();
        r1.A06 = str;
        r1.A07 = r9.A08.A00(userJid);
        r1.A08 = r9.A02;
        r1.A01 = num;
        r1.A03 = l;
        r1.A04 = l2;
        r1.A00 = bool;
        r1.A09 = str2;
        r1.A05 = AnonymousClass0x9.A0m(r9.A0D.getAndIncrement());
        r1.A02 = num2;
        r9.A07.BhD(r1);
    }

    public /* synthetic */ C117485s0(C105145Tt r1, UserJid userJid, Boolean bool, Integer num, Integer num2, Long l, Long l2, String str, String str2) {
        this.A00 = r1;
        this.A07 = str;
        this.A01 = userJid;
        this.A03 = num;
        this.A05 = l;
        this.A06 = l2;
        this.A02 = bool;
        this.A08 = str2;
        this.A04 = num2;
    }
}
