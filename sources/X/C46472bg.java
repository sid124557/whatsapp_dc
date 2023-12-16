package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.2bg  reason: invalid class name and case insensitive filesystem */
public class C46472bg {
    public final C55682qk A00;
    public final AnonymousClass36E A01;
    public final C29411im A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass31C A04;

    public void A00(AnonymousClass2U5 r9) {
        int i = r9.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MessageReceiptXmppMethod/message-retry; message.key=");
        A0o.append(r9.A0B);
        A0o.append("; jid=");
        Jid jid = r9.A05;
        A0o.append(jid);
        C18260x0.A0y("; retryCount=", A0o, i);
        if (i > 4) {
            this.A00.A0A("retry-count-too-high", false, String.valueOf(i));
            AnonymousClass36E r4 = this.A01;
            AnonymousClass1ZX r3 = new AnonymousClass1ZX();
            r3.A04 = AnonymousClass0x9.A0m(i);
            Jid jid2 = r9.A07;
            if (jid2 == null) {
                jid2 = jid;
            }
            r3.A03 = Integer.valueOf(AnonymousClass36M.A05(jid2));
            C56972sr r1 = r4.A03;
            Jid jid3 = r9.A06;
            if (jid3 == null) {
                jid3 = jid;
            }
            r3.A01 = AnonymousClass368.A05(r1, DeviceJid.of(jid3));
            AnonymousClass1gS r0 = (AnonymousClass1gS) r4.A0N.A01(0, r9.A03);
            if (r0 != null) {
                r3.A02 = Integer.valueOf(r0.A00);
            }
            r4.A0Y.BkM(new C172708Mj(r4, r9, r3, 17));
        }
    }

    public C46472bg(C55682qk r1, AnonymousClass36E r2, C29411im r3, AnonymousClass1VX r4, AnonymousClass31C r5) {
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
    }
}
