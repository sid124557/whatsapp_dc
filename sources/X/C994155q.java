package X;

import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.StatusesFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.55q  reason: invalid class name and case insensitive filesystem */
public final class C994155q extends AnonymousClass5ZM {
    public final WfalManager A00;
    public final C55152pt A01;
    public final AnonymousClass2W5 A02;
    public final C620233e A03;
    public final C48102eL A04;
    public final AnonymousClass1R1 A05;
    public final C113995mK A06;
    public final C1226665g A07;
    public final C104745Se A08;
    public final C183538qC A09;
    public final C183538qC A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C994155q(WfalManager wfalManager, C55152pt r3, AnonymousClass2W5 r4, C620233e r5, C48102eL r6, AnonymousClass1R1 r7, StatusesFragment statusesFragment, C113995mK r9, C104745Se r10, C183538qC r11, C183538qC r12) {
        super(statusesFragment, true);
        C162457s7.A0J(r5, 1);
        C18260x0.A0e(r10, r7, wfalManager, r3);
        C18260x0.A0g(r9, r4, r6, r11, r12);
        this.A03 = r5;
        this.A08 = r10;
        this.A00 = wfalManager;
        this.A05 = r7;
        this.A01 = r3;
        this.A06 = r9;
        this.A02 = r4;
        this.A04 = r6;
        this.A09 = r11;
        this.A0A = r12;
        this.A07 = null;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i;
        int i2;
        C30721mu r11;
        AnonymousClass8JP r3 = this.A06.A0A;
        r3.markerStart(453128091, 2);
        r3.markerPoint(453128091, 2, "REFRESH_TASK_START");
        List A062 = this.A03.A06();
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        ArrayList A0s3 = AnonymousClass001.A0s();
        LinkedHashMap A0r = C18320x8.A0r();
        LinkedHashMap A0r2 = C18320x8.A0r();
        LinkedHashMap A0r3 = C18320x8.A0r();
        Iterator it = A062.iterator();
        C623534r r16 = null;
        while (it.hasNext()) {
            C623534r A19 = C86664Kz.A19(it);
            C162457s7.A0H(A19);
            C55152pt r10 = this.A01;
            UserJid userJid = A19.A0A;
            C624134x A002 = r10.A00(userJid);
            if ((A002 instanceof C30721mu) && (r11 = (C30721mu) A002) != null) {
                this.A04.A01(r11);
            }
            if (AnonymousClass000.A1Y(userJid, AnonymousClass1fY.A00)) {
                if (this.A08.A00()) {
                    ((C54592oy) this.A0A.get()).A01();
                }
                if (this.A00.A02()) {
                    ((C56012rH) this.A09.get()).A02();
                }
                r16 = A19;
            } else if (this.A05.A0j(userJid)) {
                A0s3.add(A19);
            } else if (A19.A03() > 0) {
                A0s.add(A19);
            } else {
                A0s2.add(A19);
            }
            if (userJid instanceof C135216kJ) {
                Iterator it2 = r10.A01(userJid).iterator();
                while (it2.hasNext()) {
                    C624134x A0T = C18300x5.A0T(it2);
                    String str = this.A02.A00(A0T).A04;
                    if (str != null) {
                        String str2 = A0T.A1J.A01;
                        C162457s7.A0C(str2);
                        int i3 = 0;
                        if (A0r2.get(str2) == null) {
                            if (A0r3.containsKey(str)) {
                                i = C18310x6.A06(AnonymousClass0x9.A0p(str, A0r3));
                                i2 = i + 1;
                            } else {
                                i = 0;
                                i2 = 1;
                            }
                            AnonymousClass0x2.A1I(str, A0r3, i2);
                            AnonymousClass0x2.A1I(str2, A0r2, i);
                        }
                        boolean containsKey = A0r.containsKey(str);
                        int A0C = A19.A0C(A0T);
                        if (containsKey) {
                            if (A0C != 0) {
                                Number A0p = AnonymousClass0x9.A0p(str, A0r);
                                if (A0p != null) {
                                    i3 = A0p.intValue();
                                }
                                A0C = i3 + 1;
                            }
                        }
                        AnonymousClass0x2.A1I(str, A0r, A0C);
                    }
                }
            }
        }
        return new C105765Wh(r16, A0s, A0s2, A0s3, A0r, A0r2);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C105765Wh r5 = (C105765Wh) obj;
        C162457s7.A0J(r5, 0);
        AnonymousClass8JP r3 = this.A06.A0A;
        r3.markerPoint(453128091, 2, "REFRESH_TASK_END");
        C1226665g r0 = (C1226665g) A07(StatusesFragment.class);
        if (!(r0 == null && (r0 = this.A07) == null)) {
            r0.BcY(r5);
        }
        r3.markerPoint(453128091, 2, "REFRESH_TASK_POPULATED");
        r3.markerEnd(453128091, 2, 2);
    }

    public C994155q(WfalManager wfalManager, C55152pt r2, AnonymousClass2W5 r3, C620233e r4, C48102eL r5, AnonymousClass1R1 r6, C113995mK r7, C1226665g r8, C104745Se r9, C183538qC r10, C183538qC r11) {
        this.A03 = r4;
        this.A08 = r9;
        this.A05 = r6;
        this.A00 = wfalManager;
        this.A01 = r2;
        this.A06 = r7;
        this.A02 = r3;
        this.A04 = r5;
        this.A09 = r10;
        this.A0A = r11;
        this.A07 = r8;
    }
}
