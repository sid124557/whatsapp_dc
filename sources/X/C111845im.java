package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5im  reason: invalid class name and case insensitive filesystem */
public class C111845im implements C184048rA {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ C69263Wi A02;
    public final /* synthetic */ AnonymousClass3XA A03;
    public final /* synthetic */ AnonymousClass5Y9 A04;
    public final /* synthetic */ UserJid A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C111845im(Context context, Intent intent, C69263Wi r3, AnonymousClass3XA r4, AnonymousClass5Y9 r5, UserJid userJid, String str, boolean z) {
        this.A06 = str;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = userJid;
        this.A07 = z;
        this.A00 = context;
        this.A01 = intent;
        this.A03 = r4;
    }

    public void BTH(String str, int i) {
        if (this.A06.equals(str)) {
            C69263Wi r3 = this.A02;
            r3.A02.post(new C117175rV(this, 7, this.A04));
            this.A03.AwB(Boolean.FALSE);
        }
    }

    public void BTI(AnonymousClass7PB r9, String str) {
        String str2 = this.A06;
        if (str2.equals(str)) {
            C69263Wi r3 = this.A02;
            r3.A02.post(new C117175rV(this, 8, this.A04));
            AnonymousClass5ZY.A01(this.A00, this.A01, this.A05, (Integer) null, (Integer) null, str2, 6, this.A07);
            this.A03.AwB(Boolean.TRUE);
        }
    }
}
