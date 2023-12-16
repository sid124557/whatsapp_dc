package X;

import android.content.DialogInterface;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9X6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9X6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass39Q A00;
    public final /* synthetic */ C95814uZ A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ AnonymousClass9PL A03;
    public final /* synthetic */ C203749oF A04;
    public final /* synthetic */ AnonymousClass9WW A05;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass9WW r9 = this.A05;
        C203749oF r8 = this.A04;
        C95814uZ r7 = this.A01;
        UserJid userJid = this.A02;
        AnonymousClass39Q r5 = this.A00;
        AnonymousClass9PL r4 = this.A03;
        r8.Bj8();
        AnonymousClass1nE r2 = r4.A03;
        C626936e.A06(r2);
        AnonymousClass9U5 r1 = r9.A03;
        if (!C627336j.A0K(r7)) {
            userJid = AnonymousClass32Y.A03(r7);
        }
        r1.A0K(r5, (AnonymousClass39R) null, userJid, r2);
        r9.A00.A0S(new C201279jo(r4, r8, r9, r2));
    }

    public /* synthetic */ AnonymousClass9X6(AnonymousClass39Q r1, C95814uZ r2, UserJid userJid, AnonymousClass9PL r4, C203749oF r5, AnonymousClass9WW r6) {
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = userJid;
        this.A00 = r1;
        this.A03 = r4;
    }
}
