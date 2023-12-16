package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2ql  reason: invalid class name and case insensitive filesystem */
public abstract class C55692ql {
    public C47942e5 A00(UserJid userJid) {
        C56342rp r0;
        if (this instanceof C22951Qs) {
            C162457s7.A0J(userJid, 0);
            r0 = ((C22951Qs) this).A04;
        } else if (this instanceof C22941Qr) {
            C162457s7.A0J(userJid, 0);
            r0 = ((C22941Qr) this).A01;
        } else {
            if (!(this instanceof C22921Qp)) {
                Map map = ((C22931Qq) this).A00;
                Object A0i = AnonymousClass001.A0i(map, 1);
                C626936e.A06(A0i);
                C47942e5 A00 = ((C55692ql) A0i).A00(userJid);
                if (A00 != null) {
                    return A00;
                }
                Object A0i2 = AnonymousClass001.A0i(map, 2);
                C626936e.A06(A0i2);
                C47942e5 A002 = ((C55692ql) A0i2).A00(userJid);
                if (A002 != null) {
                    return A002;
                }
            }
            return new C22911Qo();
        }
        return (C47942e5) r0.A01(userJid);
    }

    public void A01() {
        if (this instanceof C22951Qs) {
            C56342rp r7 = ((C22951Qs) this).A04;
            for (C22891Qm r5 : r7.A02()) {
                if (System.currentTimeMillis() - r5.A01 > C22891Qm.A08) {
                    r7.A03(r5.A00);
                }
            }
        } else if (this instanceof C22941Qr) {
            AnonymousClass1k6 r6 = ((C22941Qr) this).A01;
            List A02 = r6.A02();
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : A02) {
                if (System.currentTimeMillis() - ((C22881Ql) next).A01 > C22881Ql.A07) {
                    A0s.add(next);
                }
            }
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                r6.A03(((C22901Qn) it.next()).A00);
            }
        } else if (!(this instanceof C22921Qp)) {
            Iterator A0q = AnonymousClass000.A0q(((C22931Qq) this).A00);
            while (A0q.hasNext()) {
                ((C55692ql) AnonymousClass0x2.A0W(A0q)).A01();
            }
        }
    }

    public void A02(C47942e5 r3) {
        C22901Qn r32;
        C56342rp r1;
        if (this instanceof C22951Qs) {
            r32 = (C22901Qn) r3;
            C162457s7.A0J(r32, 0);
            r1 = ((C22951Qs) this).A04;
        } else if (this instanceof C22941Qr) {
            r32 = (C22901Qn) r3;
            C162457s7.A0J(r32, 0);
            r1 = ((C22941Qr) this).A01;
        } else if (!(this instanceof C22921Qp)) {
            Object A0i = AnonymousClass001.A0i(((C22931Qq) this).A00, r3.A00);
            C626936e.A06(A0i);
            ((C55692ql) A0i).A02(r3);
            return;
        } else {
            return;
        }
        r1.A03(r32.A00);
    }

    public void A03(C47942e5 r7) {
        if (this instanceof C22951Qs) {
            C22951Qs r1 = (C22951Qs) this;
            C22901Qn r72 = (C22901Qn) r7;
            C162457s7.A0J(r72, 0);
            r1.A04.A05(r72);
            AnonymousClass2KM r2 = r1.A02;
            String rawString = r72.A00.getRawString();
            C162457s7.A0J(rawString, 0);
            C18270x1.A0f(C18270x1.A04(r2.A01), rawString);
        } else if (this instanceof C22941Qr) {
            C22901Qn r73 = (C22901Qn) r7;
            C162457s7.A0J(r73, 0);
            UserJid userJid = r73.A00;
            AnonymousClass1k6 r5 = ((C22941Qr) this).A01;
            C22881Ql r0 = (C22881Ql) r5.A01(userJid);
            if (r0 == null || System.currentTimeMillis() - r0.A01 > C22881Ql.A07) {
                r5.A05(r73);
            }
        } else if (!(this instanceof C22921Qp)) {
            Object A0i = AnonymousClass001.A0i(((C22931Qq) this).A00, r7.A00);
            C626936e.A06(A0i);
            ((C55692ql) A0i).A03(r7);
        }
    }

    public void A04(C47942e5 r7, AnonymousClass16O r8) {
        if (this instanceof C22951Qs) {
            C22951Qs r3 = (C22951Qs) this;
            C22891Qm r72 = (C22891Qm) r7;
            C162457s7.A0J(r72, 1);
            if (r3.A01.A00(r72)) {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    C130256bf r5 = new C130256bf(r72.A02.getBytes(C58152un.A0B));
                    C21601Cl r4 = (C21601Cl) C18320x8.A0C(r8);
                    r4.bitField0_ |= 4;
                    r4.conversionData_ = r5;
                    String str = r72.A03;
                    C21601Cl r42 = (C21601Cl) C18320x8.A0C(r8);
                    r42.bitField0_ |= 2;
                    r42.conversionSource_ = str;
                    int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - r72.A01);
                    C21601Cl r1 = (C21601Cl) C18320x8.A0C(r8);
                    r1.bitField0_ |= 8;
                    r1.conversionDelaySeconds_ = seconds;
                } catch (Exception e) {
                    Log.e("CtwaAdsEntryPoint/fillE2ECallInfo/failed to fill E2E context info/exception=", e);
                }
                r3.A03.A01(r72.A00, 0);
                return;
            }
            r3.A03.A01(r72.A00, 1);
        } else if (!(this instanceof C22941Qr) && !(this instanceof C22921Qp)) {
            Object A0i = AnonymousClass001.A0i(((C22931Qq) this).A00, r7.A00);
            C626936e.A06(A0i);
            ((C55692ql) A0i).A04(r7, r8);
        }
    }

    public void A05(C47942e5 r5, C624134x r6) {
        if (this instanceof C22951Qs) {
            C22951Qs r3 = (C22951Qs) this;
            C22891Qm r52 = (C22891Qm) r5;
            C162457s7.A0J(r52, 1);
            if (r3.A01.A00(r52)) {
                r6.A0M = r52;
                r3.A03.A01(r52.A00, 0);
                return;
            }
            r3.A03.A01(r52.A00, 1);
        } else if (this instanceof C22941Qr) {
            C162457s7.A0J(r5, 1);
            r6.A0M = r5;
        } else if (!(this instanceof C22921Qp)) {
            Object A0i = AnonymousClass001.A0i(((C22931Qq) this).A00, r5.A00);
            C626936e.A06(A0i);
            ((C55692ql) A0i).A05(r5, r6);
        }
    }
}
