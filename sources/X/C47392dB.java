package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2dB  reason: invalid class name and case insensitive filesystem */
public final class C47392dB {
    public String A00;
    public String A01;
    public final C55682qk A02;
    public final C620433g A03;
    public final C56192ra A04;
    public final C105145Tt A05;
    public final C40042Eh A06;
    public final C48922fh A07;
    public final AnonymousClass2FC A08;
    public final AnonymousClass1VX A09;
    public final AnonymousClass4FS A0A;

    public C47392dB(C55682qk r2, C620433g r3, C56192ra r4, C105145Tt r5, C40042Eh r6, C48922fh r7, AnonymousClass2FC r8, AnonymousClass1VX r9, AnonymousClass4FS r10) {
        C18260x0.A0b(r5, r3, r10, 3);
        C18260x0.A0W(r4, r2, r9);
        this.A06 = r6;
        this.A08 = r8;
        this.A05 = r5;
        this.A03 = r3;
        this.A0A = r10;
        this.A04 = r4;
        this.A02 = r2;
        this.A09 = r9;
        this.A07 = r7;
    }

    public final C160157n8 A00(C51322jd r11, C108985dt r12, String str, String str2, String str3) {
        UserJid userJid = r11.A00;
        int i = this.A06.A00;
        int A002 = C18280x3.A00(this.A08.A00.A08.A0a(userJid) ? 1 : 0) * 9;
        return new C160157n8(new C42222Ng(r11.A01, str, str2), this.A07.A00(r12, AnonymousClass74S.A00()), userJid, str3, this.A05.A02, A002, i, i);
    }
}
