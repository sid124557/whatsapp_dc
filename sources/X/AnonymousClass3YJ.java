package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3YJ  reason: invalid class name */
public final class AnonymousClass3YJ implements C84314Bw {
    public AnonymousClass1R1 A00;
    public final C56962sq A01;
    public final C56612sH A02;
    public final C55152pt A03;
    public final C620233e A04;

    public boolean AxE(AnonymousClass2PJ r19, C833648c r20, C833748d r21) {
        C52672lr r0;
        Long l;
        Long l2;
        Integer valueOf;
        AnonymousClass2PJ r8 = r19;
        C833648c r7 = r20;
        boolean A1U = C18270x1.A1U(r21, r8);
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator it = this.A03.A01((UserJid) null).iterator();
        int i = 0;
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            UserJid A0o = A0T.A0o();
            long A0H = this.A02.A0H();
            Map map = r8.A01;
            String A0o2 = C18310x6.A0o("first", map);
            if (A0o2 != null) {
                l = Long.valueOf(Long.parseLong(A0o2) * ((long) 60000));
            } else {
                l = null;
            }
            String A0o3 = C18310x6.A0o("second", map);
            if (A0o3 != null) {
                l2 = Long.valueOf(Long.parseLong(A0o3) * ((long) 60000));
            } else {
                l2 = null;
            }
            C95814uZ A032 = C106405Yw.A03(A0o);
            if (A0o != null && A0o != AnonymousClass1fY.A00 && !this.A01.A0d.contains(A0o) && this.A04.A0H(A0T)) {
                if (!((A032 != null && AnonymousClass1R1.A00(A032, this.A00).A0J) || l == null || l2 == null)) {
                    long j = A0T.A0K;
                    if (j >= A0H - l2.longValue() || j <= A0H - l.longValue()) {
                        if (A0r.containsKey(A0o)) {
                            Number A0p = AnonymousClass0x9.A0p(A0o, A0r);
                            if (A0p != null) {
                                valueOf = Integer.valueOf(A0p.intValue() + 1);
                            }
                            i++;
                        } else {
                            valueOf = Integer.valueOf(A1U ? 1 : 0);
                        }
                        A0r.put(A0o, valueOf);
                        i++;
                    }
                }
            }
        }
        if ((r7 instanceof AnonymousClass3Y7) && (r0 = ((AnonymousClass3Y7) r7).A00) != null) {
            r0.A01 = A0r;
        }
        return AnonymousClass001.A1W(i);
    }

    public AnonymousClass3YJ(C56962sq r1, C56612sH r2, C55152pt r3, C620233e r4, AnonymousClass1R1 r5) {
        C18260x0.A0f(r2, r4, r1, r5, r3);
        this.A02 = r2;
        this.A04 = r4;
        this.A01 = r1;
        this.A00 = r5;
        this.A03 = r3;
    }
}
