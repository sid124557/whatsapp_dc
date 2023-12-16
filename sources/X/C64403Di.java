package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Di  reason: invalid class name and case insensitive filesystem */
public final class C64403Di implements AnonymousClass4CJ {
    public final /* synthetic */ C47392dB A00;
    public final /* synthetic */ C51322jd A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ AnonymousClass4GQ A04;

    public C64403Di(C47392dB r1, C51322jd r2, UserJid userJid, String str, AnonymousClass4GQ r5) {
        this.A00 = r1;
        this.A02 = userJid;
        this.A01 = r2;
        this.A03 = str;
        this.A04 = r5;
    }

    public void BRB(C108985dt r10) {
        C47392dB r2 = this.A00;
        r2.A0A.BkM(new C71623cP(r2, this.A02, this.A01, this.A04, r10, this.A03, 2));
    }

    public void BXC(C108985dt r9) {
        AnonymousClass4GQ r1 = this.A04;
        C47392dB r2 = this.A00;
        C51322jd r3 = this.A01;
        r1.invoke(r2.A00(r3, r9, r3.A01, "V2", this.A03));
    }
}
