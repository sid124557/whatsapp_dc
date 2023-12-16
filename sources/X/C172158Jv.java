package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8Jv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C172158Jv implements C84134Bd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass5X1 A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public final void AwB(Object obj) {
        Context context = this.A01;
        UserJid userJid = this.A03;
        String str = this.A06;
        boolean z = this.A07;
        boolean z2 = this.A08;
        int i = this.A00;
        Integer num = this.A04;
        Integer num2 = this.A05;
        if (AnonymousClass001.A1Z(obj)) {
            AnonymousClass5ZY.A01(context, C627736r.A1E(context, z2, false), userJid, num, num2, str, i, z);
        } else {
            AnonymousClass5X1.A00(context);
        }
    }

    public /* synthetic */ C172158Jv(Context context, AnonymousClass5X1 r2, UserJid userJid, Integer num, Integer num2, String str, int i, boolean z, boolean z2) {
        this.A01 = context;
        this.A03 = userJid;
        this.A06 = str;
        this.A07 = z;
        this.A08 = z2;
        this.A00 = i;
        this.A04 = num;
        this.A05 = num2;
        this.A02 = r2;
    }
}
