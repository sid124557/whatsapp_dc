package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9k2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201419k2 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass39Q A01;
    public final /* synthetic */ C95814uZ A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ AnonymousClass9WW A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public final void run() {
        AnonymousClass9WW r4 = this.A04;
        String str = this.A05;
        List list = this.A06;
        C95814uZ r5 = this.A02;
        UserJid userJid = this.A03;
        long j = this.A00;
        AnonymousClass39Q r3 = this.A01;
        AnonymousClass9U5 r2 = r4.A03;
        C30481mW A032 = r4.A03(r5, userJid, str, list, j);
        if (!C627336j.A0K(r5)) {
            userJid = AnonymousClass32Y.A03(r5);
        }
        if (r2.A0K(r3, (AnonymousClass39R) null, userJid, A032)) {
            r2.A05.A08(A032);
        }
    }

    public /* synthetic */ C201419k2(AnonymousClass39Q r1, C95814uZ r2, UserJid userJid, AnonymousClass9WW r4, String str, List list, long j) {
        this.A04 = r4;
        this.A05 = str;
        this.A06 = list;
        this.A02 = r2;
        this.A03 = userJid;
        this.A00 = j;
        this.A01 = r1;
    }
}
