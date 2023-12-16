package X;

import android.content.Context;

/* renamed from: X.99t  reason: invalid class name and case insensitive filesystem */
public class C1907699t extends C197739dn {
    public final /* synthetic */ C203059n3 A00;
    public final /* synthetic */ C193789Pz A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1907699t(Context context, C40602Ha r2, C203059n3 r3, C193789Pz r4, C84104Ba r5, String str, String str2) {
        super(context, r2, r5);
        this.A01 = r4;
        this.A02 = str;
        this.A00 = r3;
        this.A03 = str2;
    }

    public void A03(AnonymousClass34V r4) {
        C160757oG r2 = this.A01.A05;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PaymentKycAction ");
        A0o.append(this.A02);
        C1899593h.A1G(r2, r4, ": onRequestError: ", A0o);
        this.A00.BUy(r4);
    }

    public void A04(AnonymousClass34V r4) {
        C160757oG r2 = this.A01.A05;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PaymentKycAction ");
        A0o.append(this.A02);
        C1899593h.A1G(r2, r4, ": onResponseError: ", A0o);
        this.A00.BUy(r4);
    }

    public void A05(AnonymousClass36K r6) {
        C160757oG r2;
        String str;
        AnonymousClass36K A0T = C1899693i.A0T(r6);
        if (A0T == null) {
            r2 = this.A01.A05;
            StringBuilder A0l = AnonymousClass000.A0l("PaymentKycAction ");
            A0l.append(this.A02);
            str = AnonymousClass000.A0X(": onResponseSuccess: missing account node", A0l);
        } else {
            AnonymousClass34V A002 = AnonymousClass34V.A00(A0T);
            if (A002 != null) {
                C193789Pz r3 = this.A01;
                C160757oG r22 = r3.A05;
                StringBuilder A0l2 = AnonymousClass000.A0l("PaymentKycAction ");
                A0l2.append(this.A02);
                C1899593h.A1G(r22, A002, ": onResponseSuccess: account-node error: ", A0l2);
                if (A002.A00 == 1448) {
                    r3.A04.A02(A002, this.A03, "KYC");
                }
                this.A00.BUy(A002);
                return;
            }
            C195329Xi A003 = C195329Xi.A00(A0T);
            if (A003 != null) {
                this.A00.BUz(A003);
                return;
            } else {
                r2 = this.A01.A05;
                str = "PaymentKycAction/createCallback PaymentKycInfo is null";
            }
        }
        r2.A05(str);
        this.A00.BUy(C1899693i.A0M());
    }
}
