package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5qK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C116465qK implements C84134Bd {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C113045kn A01;
    public final /* synthetic */ C624134x A02;
    public final /* synthetic */ AnonymousClass39E A03;
    public final /* synthetic */ AnonymousClass39W A04;

    public final void AwB(Object obj) {
        String str;
        C113045kn r4 = this.A01;
        Context context = this.A00;
        C624134x r5 = this.A02;
        AnonymousClass39W r6 = this.A04;
        AnonymousClass39E r2 = this.A03;
        String str2 = (String) obj;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode == -839883634) {
                str = "PERMANENT";
            } else if (hashCode != 181990675) {
                if (hashCode == 476614193) {
                    str = "TEMPORARY";
                } else {
                    return;
                }
            } else if (str2.equals("UNBLOCKED")) {
                UserJid userJid = r2.A00;
                C162457s7.A0C(userJid);
                r4.A00.A01(userJid).A03(new C124246Bn(context, r4, r5, r6, 0));
                return;
            } else {
                return;
            }
            if (str2.equals(str)) {
                r4.A03.A02(context, str2);
            }
        }
    }

    public /* synthetic */ C116465qK(Context context, C113045kn r2, C624134x r3, AnonymousClass39E r4, AnonymousClass39W r5) {
        this.A01 = r2;
        this.A00 = context;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }
}
