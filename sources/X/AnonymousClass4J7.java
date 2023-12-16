package X;

import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4J7  reason: invalid class name */
public class AnonymousClass4J7 implements C15630rg {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;

    public AnonymousClass4J7(C623734t r2, AnonymousClass227 r3, C25931bJ r4, List list, List list2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A0F = i2;
        this.A01 = r2;
        this.A02 = r3;
        this.A0B = z;
        this.A0C = z2;
        this.A0D = z3;
        this.A0E = z4;
        this.A06 = z5;
        this.A07 = z6;
        this.A08 = z7;
        this.A09 = z8;
        this.A0A = z9;
        this.A00 = i;
        this.A03 = list;
        this.A04 = list2;
        this.A05 = r4;
    }

    public final Object apply(Object obj) {
        Object obj2 = obj;
        if (this.A0F != 0) {
            C623734t r10 = (C623734t) this.A01;
            AnonymousClass227 r15 = (AnonymousClass227) this.A02;
            boolean z = this.A0B;
            boolean z2 = this.A0C;
            boolean z3 = this.A0D;
            boolean z4 = this.A0E;
            boolean z5 = this.A06;
            boolean z6 = this.A07;
            boolean z7 = this.A08;
            boolean z8 = this.A09;
            boolean z9 = this.A0A;
            int i = this.A00;
            List list = (List) this.A03;
            C25931bJ r8 = (C25931bJ) this.A05;
            String str = (String) obj2;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C626936e.A09("", list);
            ArrayList A0s = AnonymousClass001.A0s();
            C43552So A012 = r10.A0C.A01("sync/sync_notification/", (List) this.A04, list);
            if (A012 != null) {
                Set A0B2 = r10.A0E.A0B();
                List list2 = A012.A02;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    AnonymousClass3ZH A0R = C18310x6.A0R(it);
                    if (!C623734t.A01(A0R, A0B2, false)) {
                        C618832q r4 = new C618832q(A0R);
                        r4.A0C = true;
                        r4.A0L = z;
                        r4.A0J = z2;
                        r4.A0B = z3;
                        r4.A0E = z4;
                        r4.A01 = AnonymousClass227.A00(A0R, r15);
                        r4.A0I = z5;
                        r4.A0F = z6;
                        r4.A0H = z7;
                        r4.A0N = z8;
                        r4.A0M = z9;
                        if (z4) {
                            r4.A02 = AnonymousClass318.A00(r4, r10.A0I, r4.A0P);
                        }
                        AnonymousClass0x2.A13(r10, r4, z5 ? 1 : 0);
                        C618832q.A01(r10, r4, r4.A0P, r10.A0Q);
                        C618832q.A02(r4, A0s);
                    }
                }
                C18260x0.A1A("sync/sync_notification_contact/request/count ", AnonymousClass001.A0o(), A0s);
                if (!C25931bJ.A00(r8, A0s)) {
                    if (r10.A05(r8, str, r10.A02().A04(new C59512x2(r15, A0s, i, false), C621733w.A00("sync_sid_notification_contact"), 64000))) {
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        r10.A03(A0s2, list2, r10.A0T);
                        C53592nL r9 = r10.A08;
                        AnonymousClass1VX r12 = r9.A04;
                        C58422vE r6 = C58422vE.A02;
                        if (r12.A0Y(r6, 1665)) {
                            C70203a7.A00(r9.A06, r9, A0s2, 41);
                        }
                        if (r12.A0Y(r6, 1666)) {
                            long size = (long) A0s2.size();
                            if (size > 0) {
                                AnonymousClass1W7 r62 = new AnonymousClass1W7();
                                r62.A00 = Long.valueOf(size);
                                r9.A05.BhD(r62);
                            }
                        }
                        if (!list2.isEmpty()) {
                            r10.A05.A0M(list2, false);
                        }
                        C41402Kc.A00(r10, r8, A0s, elapsedRealtime);
                        return AnonymousClass304.A07;
                    }
                }
                return AnonymousClass304.A08;
            }
        } else {
            C623734t r13 = (C623734t) this.A01;
            AnonymousClass227 r122 = (AnonymousClass227) this.A02;
            boolean z10 = this.A0B;
            boolean z11 = this.A0C;
            boolean z12 = this.A0D;
            boolean z13 = this.A0E;
            boolean z14 = this.A06;
            boolean z15 = this.A07;
            boolean z16 = this.A08;
            boolean z17 = this.A09;
            boolean z18 = this.A0A;
            int i2 = this.A00;
            List list3 = (List) this.A03;
            List list4 = (List) this.A04;
            C25931bJ r7 = (C25931bJ) this.A05;
            String str2 = (String) obj2;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            C626936e.A09("", list3);
            ArrayList A0s3 = AnonymousClass001.A0s();
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                ArrayList A0s4 = AnonymousClass001.A0s();
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    AnonymousClass3ZH A0R2 = C18310x6.A0R(it2);
                    if (!C621733w.A02(A0R2.A0H) && C621733w.A01(A0R2, instance, list3)) {
                        A0s4.add(A0R2);
                    }
                }
                HashSet A0p = C18320x8.A0p(A0s4);
                Iterator it3 = A0s4.iterator();
                while (it3.hasNext()) {
                    AnonymousClass3ZH A0R3 = C18310x6.A0R(it3);
                    C618832q r2 = new C618832q(A0R3);
                    r2.A0L = z10;
                    r2.A0J = z11;
                    r2.A0B = z12;
                    r2.A0G = true;
                    r2.A0E = z13;
                    r2.A01 = AnonymousClass227.A00(A0R3, r122);
                    r2.A0I = z14;
                    r2.A0F = z15;
                    r2.A0H = z16;
                    r2.A0N = z17;
                    r2.A0M = z18;
                    if (z13) {
                        r2.A02 = AnonymousClass318.A00(r2, r13.A0I, r2.A0P);
                    }
                    AnonymousClass0x2.A13(r13, r2, z14 ? 1 : 0);
                    Map map = r13.A0Q;
                    UserJid userJid = r2.A0P;
                    C618832q.A01(r13, r2, userJid, map);
                    C618832q.A02(r2, A0s3);
                    if (userJid != null) {
                        A0p.add(userJid);
                    }
                }
                C18260x0.A1A("sync/sync_notification_sidelist/request/count ", AnonymousClass001.A0o(), A0s3);
                if (!C25931bJ.A00(r7, A0s3)) {
                    if (r13.A05(r7, str2, C59512x2.A01(r122, r13.A02(), "sync_sid_notification_sidelist", A0s3, i2))) {
                        C41402Kc.A00(r13, r7, A0s3, elapsedRealtime2);
                        return new AnonymousClass304(A0p, 3);
                    }
                }
                return AnonymousClass304.A08;
            } catch (NoSuchAlgorithmException e) {
                throw AnonymousClass0x9.A0i(e);
            }
        }
        return AnonymousClass304.A03;
    }
}
