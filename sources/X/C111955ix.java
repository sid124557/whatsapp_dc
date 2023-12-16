package X;

import android.view.View;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5ix  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111955ix implements AnonymousClass8nO {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C43072Qq A01;
    public final /* synthetic */ C90544hh A02;

    public final void BPC(View view, AnonymousClass7MZ r11) {
        Object r1;
        C90544hh r12 = this.A02;
        C43072Qq r0 = this.A01;
        int i = this.A00;
        C87614Tz r2 = r12.A00;
        boolean z = r0.A04;
        UserJid userJid = r2.A0T;
        String str = r0.A01;
        if (z) {
            r1 = new C132286f2(userJid, str, r0.A02);
        } else {
            r1 = new C132276f1(userJid, str);
        }
        r2.A07.A0H(r1);
        r2.A0L.A01(userJid, str, 1, 1, i, z);
    }

    public /* synthetic */ C111955ix(C43072Qq r1, C90544hh r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }
}
