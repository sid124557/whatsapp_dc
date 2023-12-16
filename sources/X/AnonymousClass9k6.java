package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9k6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9k6 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass39Q A01;
    public final /* synthetic */ AnonymousClass39R A02;
    public final /* synthetic */ C95814uZ A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ AnonymousClass9WW A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public final void run() {
        AnonymousClass9WW r5 = this.A05;
        String str = this.A06;
        List list = this.A07;
        C95814uZ r6 = this.A03;
        UserJid userJid = this.A04;
        long j = this.A00;
        AnonymousClass39Q r4 = this.A01;
        AnonymousClass39R r3 = this.A02;
        AnonymousClass9U5 r2 = r5.A03;
        C30481mW A032 = r5.A03(r6, userJid, str, list, j);
        if (!C627336j.A0K(r6)) {
            userJid = AnonymousClass32Y.A03(r6);
        }
        if (r2.A0K(r4, r3, userJid, A032)) {
            r2.A05.A08(A032);
        }
    }

    public /* synthetic */ AnonymousClass9k6(AnonymousClass39Q r1, AnonymousClass39R r2, C95814uZ r3, UserJid userJid, AnonymousClass9WW r5, String str, List list, long j) {
        this.A05 = r5;
        this.A06 = str;
        this.A07 = list;
        this.A03 = r3;
        this.A04 = userJid;
        this.A00 = j;
        this.A01 = r1;
        this.A02 = r2;
    }
}
