package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5oR  reason: invalid class name and case insensitive filesystem */
public final class C115295oR implements AnonymousClass4EZ {
    public final /* synthetic */ C142636xW A00;
    public final /* synthetic */ C53382n0 A01;
    public final /* synthetic */ AnonymousClass2RH A02;
    public final /* synthetic */ C84814Du A03;

    public void BSN(AnonymousClass36K r8, String str) {
        C142586xR r1;
        C162457s7.A0J(r8, 1);
        int A0a = r8.A0m("error").A0a("code");
        C84814Du r5 = this.A03;
        C142586xR[] values = C142586xR.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r1 = C142586xR.DEFAULT;
                break;
            }
            r1 = values[i];
            if (r1.code == A0a) {
                break;
            }
            i++;
        }
        r5.BkD(new AnonymousClass8H0(r1));
    }

    public void BdM(AnonymousClass36K r8, String str) {
        C84814Du r1;
        Object obj;
        AnonymousClass59I r3;
        C162457s7.A0J(r8, 1);
        Jid A0h = r8.A0h(GroupJid.class, "from");
        C53382n0 r6 = this.A01;
        boolean A0P = C162457s7.A0P(A0h, r6.A01);
        C626936e.A0D(A0P, "Group Jid in request and response don't match.");
        if (A0P) {
            AnonymousClass36K A0m = r8.A0m("membership_requests_action").A0m(this.A00.value).A0m("participant");
            UserJid userJid = (UserJid) A0m.A0h(UserJid.class, "jid");
            PhoneUserJid phoneUserJid = (PhoneUserJid) A0m.A0g(PhoneUserJid.class, "phone_number");
            if (C627336j.A0L(userJid) && phoneUserJid != null) {
                this.A02.A03.A00((C27981fH) userJid, phoneUserJid);
            }
            boolean A0P2 = C162457s7.A0P(userJid, r6.A04);
            C626936e.A0D(A0P2, "Requester Jid in request and response don't match.");
            if (A0P2) {
                String A0r = A0m.A0r("error", (String) null);
                if (A0r == null) {
                    r1 = this.A03;
                    obj = AnonymousClass8H3.A00;
                    r1.BkD(obj);
                }
                int parseInt = Integer.parseInt(A0r);
                AnonymousClass59I[] values = AnonymousClass59I.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        r3 = AnonymousClass59I.A02;
                        break;
                    }
                    r3 = values[i];
                    if (r3.value == parseInt) {
                        break;
                    }
                    i++;
                }
                AnonymousClass2RH r2 = this.A02;
                C70343aL.A01(r2.A04, r3, r6, r2, 32);
                this.A03.BkD(new AnonymousClass8H1(r3));
                return;
            }
        }
        r1 = this.A03;
        obj = AnonymousClass8H2.A00;
        r1.BkD(obj);
    }

    public C115295oR(C142636xW r1, C53382n0 r2, AnonymousClass2RH r3, C84814Du r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void BQs(String str) {
        this.A03.BkD(AnonymousClass8H2.A00);
    }
}
