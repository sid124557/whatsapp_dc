package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.usernames.observers.UsernameChangeSystemMessageObserver$onUsernameChanged$1;

/* renamed from: X.3Cf  reason: invalid class name and case insensitive filesystem */
public final class C64133Cf implements AnonymousClass494 {
    public final C56612sH A00;
    public final C56982ss A01;
    public final C48062eH A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass35J A04;
    public final C45562aD A05;
    public final AnonymousClass66R A06 = C154517dI.A01(new C79713x4(this));
    public final C73853gB A07;
    public final AnonymousClass4C6 A08;

    public C64133Cf(C56612sH r2, C56982ss r3, C48062eH r4, AnonymousClass1VX r5, AnonymousClass35J r6, C45562aD r7, C73853gB r8, AnonymousClass4C6 r9) {
        C18260x0.A0b(r5, r3, r4, 3);
        C18260x0.A0W(r6, r7, r2);
        this.A08 = r9;
        this.A07 = r8;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r6;
        this.A05 = r7;
        this.A00 = r2;
    }

    public void BfB(UserJid userJid, String str, String str2) {
        UserJid userJid2 = userJid;
        if ((userJid instanceof C27981fH) || (userJid instanceof PhoneUserJid)) {
            String str3 = str;
            if (str.length() > 0) {
                String str4 = str2;
                if (str2.length() > 0) {
                    if (this.A03.A0Y(C58422vE.A02, 4746)) {
                        C616131n.A02((C85494Gl) null, new UsernameChangeSystemMessageObserver$onUsernameChanged$1(userJid2, this, str3, str4, (C84814Du) null), this.A08, (AnonymousClass20D) null, 3);
                    }
                }
            }
        }
    }
}
