package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.9k0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201399k0 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C153607bd A02;
    public final /* synthetic */ C203339nX A03;
    public final /* synthetic */ C194389Sr A04;
    public final /* synthetic */ Boolean A05;

    public final void run() {
        String str;
        C194389Sr r11 = this.A04;
        Context context = this.A00;
        UserJid userJid = this.A01;
        Boolean bool = this.A05;
        C153607bd r9 = this.A02;
        C203339nX r10 = this.A03;
        C18260x0.A1R(AnonymousClass001.A0o(), "PAY: sendGetContactInfoForJid: ", userJid);
        r11.A0D.Bq0();
        Integer A002 = r11.A0E.A00("upi-get-vpa");
        if (r9 != null) {
            r9.A03("upi-get-vpa");
        }
        AnonymousClass1VX r1 = r11.A04;
        UserJid A003 = C192819Ls.A00(r11.A02, r1, userJid);
        if (A003 == null) {
            Log.e("PAY: IndiaUpiContactActions : lidCompatibleJid is null");
            r10.BS6(C1899693i.A0M());
            return;
        }
        if (bool == null || !r11.A09.A0C() || !r1.A0X(1450)) {
            str = null;
        } else if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        AnonymousClass31C r14 = r11.A05;
        String A032 = r14.A03();
        C192199Io r12 = new C192199Io(A003, C1899693i.A0X(A032), str);
        r14.A0D(new AnonymousClass9AZ(context, context, r11.A00, userJid, r11.A0A, r9, r10, r11, r12, A002), r12.A00, A032, 204, 0);
    }

    public /* synthetic */ C201399k0(Context context, UserJid userJid, C153607bd r3, C203339nX r4, C194389Sr r5, Boolean bool) {
        this.A04 = r5;
        this.A00 = context;
        this.A01 = userJid;
        this.A05 = bool;
        this.A02 = r3;
        this.A03 = r4;
    }
}
