package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.32S  reason: invalid class name */
public class AnonymousClass32S {
    public final long A00;
    public final AnonymousClass0PJ A01;
    public final AnonymousClass8OQ A02;
    public final AnonymousClass8OQ A03;
    public final AnonymousClass8OQ A04;
    public final AnonymousClass8OQ A05;
    public final UserJid A06;
    public final AnonymousClass39T A07;
    public final String A08;
    public final String A09;
    public final byte[] A0A;

    public static final AnonymousClass0PJ A00(AnonymousClass8OQ r7) {
        C160667o6 r6 = new C160667o6();
        C160667o6 r5 = new C160667o6();
        C172878Nf A0M = C18310x6.A0M(r7);
        while (A0M.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0M);
            C52642lo r3 = (C52642lo) A0w.getValue();
            Object key = A0w.getKey();
            Long valueOf = Long.valueOf(r3.A00);
            r6.put(key, valueOf);
            DeviceJid deviceJid = r3.A02;
            if (deviceJid != null) {
                r5.put(deviceJid, valueOf);
            }
        }
        return AnonymousClass0x9.A0G(r6.build(), r5.build());
    }

    public AnonymousClass32S(AnonymousClass39T r4, String str) {
        this.A06 = null;
        this.A08 = null;
        this.A09 = str;
        AnonymousClass8OQ of = AnonymousClass8OQ.of();
        this.A02 = of;
        this.A03 = of;
        this.A04 = of;
        this.A05 = of;
        this.A07 = r4;
        this.A0A = null;
        this.A00 = 0;
        this.A01 = null;
    }

    public AnonymousClass32S(AnonymousClass0PJ r4, AnonymousClass8OQ r5, AnonymousClass8OQ r6, UserJid userJid, AnonymousClass39T r8, String str, byte[] bArr, long j) {
        this.A06 = userJid;
        this.A08 = str;
        this.A09 = null;
        this.A07 = r8;
        AnonymousClass0PJ A002 = A00(r5);
        AnonymousClass0PJ A003 = A00(r6);
        this.A02 = (AnonymousClass8OQ) A002.A00;
        this.A03 = (AnonymousClass8OQ) A003.A00;
        this.A04 = (AnonymousClass8OQ) A002.A01;
        this.A05 = (AnonymousClass8OQ) A003.A01;
        this.A0A = bArr;
        this.A00 = j;
        this.A01 = r4;
    }
}
