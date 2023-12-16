package X;

import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3AK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3AK implements C15630rg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C623734t A01;
    public final /* synthetic */ AnonymousClass227 A02;
    public final /* synthetic */ C25931bJ A03;
    public final /* synthetic */ Collection A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;

    public final Object apply(Object obj) {
        AnonymousClass304 r3;
        int i;
        C54002o1 A002;
        long j;
        C623734t r13 = this.A01;
        AnonymousClass227 r30 = this.A02;
        int i2 = this.A00;
        Collection collection = this.A04;
        C25931bJ r12 = this.A03;
        boolean z = this.A0B;
        boolean z2 = this.A0C;
        boolean z3 = this.A0D;
        boolean z4 = this.A0E;
        boolean z5 = this.A0F;
        boolean z6 = this.A05;
        boolean z7 = this.A06;
        boolean z8 = this.A07;
        boolean z9 = this.A08;
        boolean z10 = this.A09;
        boolean z11 = this.A0A;
        String str = (String) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            ArrayList A0s = AnonymousClass001.A0s();
            HashSet A0K = AnonymousClass002.A0K();
            if (collection != null) {
                Set A0B2 = r13.A0E.A0B();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AnonymousClass3ZH A0R = C18310x6.A0R(it);
                    C95814uZ r2 = A0R.A0H;
                    if (!C621733w.A02(r2)) {
                        if (r2 instanceof C27981fH) {
                            A0B2.contains(r2);
                        }
                        C618832q r32 = new C618832q(A0R);
                        UserJid userJid = r32.A0P;
                        if (userJid != null) {
                            r32.A0C = z;
                            r32.A0L = z2;
                            r32.A0J = z3;
                            r32.A01 = AnonymousClass227.A00(A0R, r30);
                            r32.A0B = z4;
                            r32.A0E = z5;
                            r32.A0I = z6;
                            r32.A0F = z7;
                            r32.A0H = z8;
                            r32.A0N = z10;
                            r32.A0A = z9;
                            r32.A0M = z11;
                            if (z4) {
                                C618832q.A01(r13, r32, userJid, r13.A0Q);
                            }
                            if (z5) {
                                AnonymousClass318 r0 = r13.A0I;
                                r32.A08 = r0.A08(userJid);
                                r32.A03 = r0.A02(userJid);
                                C60212yB A072 = r0.A07(userJid);
                                if (A072 != null) {
                                    j = A072.A02;
                                } else {
                                    j = 0;
                                }
                                r32.A02 = j;
                            }
                            if (z6) {
                                C618832q.A00(r13, r32, userJid);
                            }
                            if (z9) {
                                C116985rC r1 = (C116985rC) r13.A0O.get();
                                if (!r1.A07() || (A002 = ((C48902ff) r1.A04()).A00(userJid)) == null) {
                                    i = 0;
                                } else {
                                    i = A002.A00;
                                }
                                r32.A00 = i;
                                r32.A06 = C18310x6.A0o(userJid, r13.A0P);
                            }
                            C618832q.A02(r32, A0s);
                            A0K.add(userJid);
                        } else {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("sync/syncMultiProtocolsInternal/request invalid jid, contact=");
                            A0o.append(r32.A0Q);
                            C18260x0.A0r(" scope=", "multi_protocols", A0o);
                        }
                    }
                }
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C18260x0.A19("sync/syncMultiProtocolsInternal/request/count ", A0o2, A0s);
            C18260x0.A0q(" scope=", "multi_protocols", A0o2);
            if (C25931bJ.A00(r12, A0s)) {
                r3 = AnonymousClass304.A08;
            } else {
                if (!r13.A05(r12, str, C59512x2.A01(r30, r13.A02(), "sync_sid_multi_protocols", A0s, i2))) {
                    r3 = AnonymousClass304.A03;
                } else {
                    C41402Kc r02 = r13.A01;
                    C626936e.A06(r02);
                    C60022xs.A00(r02, r12);
                    C50552iM r33 = r13.A09;
                    C41402Kc r03 = r13.A01;
                    C626936e.A06(r03);
                    r33.A01(r03.A00, r12, A0s, r13.A0R, r13.A0S, elapsedRealtime);
                    r3 = new AnonymousClass304(A0K, 3);
                }
            }
            return r3;
        } finally {
            StringBuilder A0l = AnonymousClass000.A0l("sync/syncMultiProtocolsInternal/time/");
            A0l.append(AnonymousClass0x7.A0E(elapsedRealtime));
            C18260x0.A0s(" scope=", "multi_protocols", A0l);
        }
    }

    public /* synthetic */ AnonymousClass3AK(C623734t r2, AnonymousClass227 r3, C25931bJ r4, Collection collection, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = i;
        this.A04 = collection;
        this.A03 = r4;
        this.A0B = z;
        this.A0C = z2;
        this.A0D = z3;
        this.A0E = z4;
        this.A0F = z5;
        this.A05 = z6;
        this.A06 = z7;
        this.A07 = z8;
        this.A08 = z9;
        this.A09 = z10;
        this.A0A = z11;
    }
}
