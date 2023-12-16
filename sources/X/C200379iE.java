package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9iE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200379iE implements Runnable {
    public final /* synthetic */ AnonymousClass9Bs A00;
    public final /* synthetic */ boolean A01;

    public final void run() {
        boolean z;
        C624034w A012;
        String A0m;
        AnonymousClass9Bs r0 = this.A00;
        boolean z2 = this.A01;
        AnonymousClass1RR A0V = C86634Kw.A0V(r0.A01);
        if (z2) {
            C85204Fi r3 = r0.A05;
            String str = ((AnonymousClass3H6) r3).A04;
            z = true;
            A012 = AnonymousClass36S.A01(r3, r0.A09, (UserJid) null, (UserJid) A0V.A0H, str, (String) null, "IN", 10, 11, C57232tJ.A00("IN"), 1, 0, -1);
        } else {
            C85204Fi r6 = r0.A05;
            String str2 = ((AnonymousClass3H6) r6).A04;
            z = true;
            A012 = AnonymousClass36S.A01(r6, r0.A09, (UserJid) A0V.A0H, (UserJid) null, str2, (String) null, "IN", 1, 401, C57232tJ.A00("IN"), 1, 0, -1);
        }
        if (!TextUtils.isEmpty(r0.A0R)) {
            r0.A0O.A0X(r0.A0R);
        }
        A012.A05 = r0.A06.A0H();
        A012.A0F = "UNSET";
        AnonymousClass99L r62 = r0.A0O;
        A012.A0A = r62;
        A012.A0P = z;
        String str3 = (String) r0.A0I.A00;
        if (z2) {
            r62.A0Q = str3;
            r62.A0B = C1899693i.A0F(AnonymousClass3QD.A00(), String.class, r0.A0G.A00, "legalName");
        } else {
            r62.A0O = str3;
            r62.A0h((String) r0.A0G.A00);
        }
        String str4 = r62.A0K;
        C626936e.A05(str4);
        C624034w A05 = AnonymousClass36F.A05(r0.A07, str4, (String) null);
        C160757oG r4 = r0.A0f;
        if (A05 == null) {
            A0m = "IN- HANDLE_SEND_AGAIN Old txn is null";
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("IN- HANDLE_SEND_AGAIN Old txn is not null, interop is ");
            A0m = C18300x5.A0m(A0o, A05.A0P);
        }
        r4.A06(A0m);
        r0.A07.A0f(A012, A05, str4);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("getPayNonWaVpaCallback added new transaction with trans id: ");
        C1899593h.A1J(r4, A012.A0K, A0o2);
        r0.A05.A0S(new C200369iD(A012, r0));
    }

    public /* synthetic */ C200379iE(AnonymousClass9Bs r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }
}
