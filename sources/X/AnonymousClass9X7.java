package X;

import android.content.DialogInterface;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9X7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9X7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass39Q A01;
    public final /* synthetic */ C95814uZ A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ C203749oF A04;
    public final /* synthetic */ AnonymousClass9WW A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass9WW r6 = this.A05;
        String str = this.A06;
        List list = this.A07;
        C95814uZ r4 = this.A02;
        UserJid userJid = this.A03;
        long j = this.A00;
        AnonymousClass39Q r3 = this.A01;
        C203749oF r1 = this.A04;
        r6.A06.BkM(new C201419k2(r3, r4, userJid, r6, str, list, j));
        r1.B3L();
    }

    public /* synthetic */ AnonymousClass9X7(AnonymousClass39Q r1, C95814uZ r2, UserJid userJid, C203749oF r4, AnonymousClass9WW r5, String str, List list, long j) {
        this.A05 = r5;
        this.A06 = str;
        this.A07 = list;
        this.A02 = r2;
        this.A03 = userJid;
        this.A00 = j;
        this.A01 = r1;
        this.A04 = r4;
    }
}
