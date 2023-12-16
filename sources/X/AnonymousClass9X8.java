package X;

import android.content.DialogInterface;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9X8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9X8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass39Q A01;
    public final /* synthetic */ AnonymousClass39R A02;
    public final /* synthetic */ C95814uZ A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ C203749oF A05;
    public final /* synthetic */ AnonymousClass9WW A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass9WW r7 = this.A06;
        String str = this.A07;
        List list = this.A08;
        C95814uZ r5 = this.A03;
        UserJid userJid = this.A04;
        long j = this.A00;
        AnonymousClass39Q r3 = this.A01;
        AnonymousClass39R r4 = this.A02;
        C203749oF r1 = this.A05;
        r7.A06.BkM(new AnonymousClass9k6(r3, r4, r5, userJid, r7, str, list, j));
        r1.B3L();
    }

    public /* synthetic */ AnonymousClass9X8(AnonymousClass39Q r1, AnonymousClass39R r2, C95814uZ r3, UserJid userJid, C203749oF r5, AnonymousClass9WW r6, String str, List list, long j) {
        this.A06 = r6;
        this.A07 = str;
        this.A08 = list;
        this.A03 = r3;
        this.A04 = userJid;
        this.A00 = j;
        this.A01 = r1;
        this.A02 = r2;
        this.A05 = r5;
    }
}
