package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Xs  reason: invalid class name and case insensitive filesystem */
public final class C69613Xs implements C84964Ek {
    public final /* synthetic */ AnonymousClass2PF A00;

    public C69613Xs(AnonymousClass2PF r1) {
        this.A00 = r1;
    }

    public void BQp() {
        AnonymousClass2PF r6 = this.A00;
        C48612fB r5 = (C48612fB) r6.A01.A05.get();
        C53572nJ r2 = r6.A02;
        String str = r2.A04;
        C129586aY r0 = r2.A02;
        ArrayList A0d = C73783g4.A0d(r0);
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            C624134x.A0Z(A0d, it);
        }
        C129586aY r02 = r2.A01;
        ArrayList A0d2 = C73783g4.A0d(r02);
        Iterator it2 = r02.iterator();
        while (it2.hasNext()) {
            C52072kq.A00(A0d2, it2);
        }
        r5.A01(str, A0d, A0d2);
        AnonymousClass2Z6 r3 = r6.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostRequestSessionManager/Crosspost delivery failure for session: ");
        String str2 = r3.A01.A04;
        AnonymousClass356.A05(A0o, str2);
        r3.A00.A02(AnonymousClass217.CROSSPOST, str2);
    }

    public void BSC(Exception exc, Integer num) {
        AnonymousClass2PF r3 = this.A00;
        AnonymousClass356.A02("CrosspostRequestManager/crosspostRequestIQ unknown error");
        C53572nJ r2 = r3.A02;
        C129586aY r0 = r2.A01;
        ArrayList A0d = C73783g4.A0d(r0);
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            C52072kq.A00(A0d, it);
        }
        C129586aY r02 = r2.A02;
        ArrayList A0d2 = C73783g4.A0d(r02);
        Iterator it2 = r02.iterator();
        while (it2.hasNext()) {
            C624134x.A0Z(A0d2, it2);
        }
        C46852cJ r03 = r3.A01;
        C626736a.A06(r03.A00, r03.A02, r03.A04, A0d2, A0d, 4);
        r3.A00.A00(new C34551vL(-1));
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C73263fC r0;
        Long A0h;
        C52712lv r11 = (C52712lv) obj;
        C162457s7.A0J(r11, 0);
        AnonymousClass2PF r3 = this.A00;
        C46852cJ r6 = r3.A01;
        Map map = r3.A02.A05;
        HashMap A0t = AnonymousClass001.A0t();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            long A0B = C18310x6.A0B(A0w.getKey());
            String str = ((C53342mw) A0w.getValue()).A03;
            if (str == null || (A0h = C18290x4.A0h(str)) == null) {
                C626936e.A0D(false, "CrosspostRequestManager/UniqueId field is empty while iterating through crosspostingInfoMap");
            } else {
                AnonymousClass0x2.A1J(A0h, A0t, A0B);
            }
        }
        Map map2 = r11.A01;
        Iterator A0q2 = AnonymousClass000.A0q(map2);
        while (A0q2.hasNext()) {
            Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
            AnonymousClass223 r8 = (AnonymousClass223) A0w2.getKey();
            C52702lu r7 = (C52702lu) A0w2.getValue();
            List list = r7.A02;
            if (C18310x6.A1X(list)) {
                r6.A00(r8, list, A0t, 3);
            }
            List list2 = r7.A00;
            if (C18310x6.A1X(list2)) {
                r6.A00(r8, list2, A0t, 3);
            }
            List list3 = r7.A01;
            if (C18310x6.A1X(list3)) {
                r6.A00(r8, list3, A0t, 4);
            }
        }
        if (!r11.A02) {
            r3.A00.A00(C34541vK.A00);
        }
        AnonymousClass2Z6 r32 = r3.A00;
        Iterator A0q3 = AnonymousClass000.A0q(map2);
        while (A0q3.hasNext()) {
            C52702lu r1 = (C52702lu) AnonymousClass0x2.A0W(A0q3);
            if (C18310x6.A1X(r1.A00)) {
                r0 = C34531vJ.A00;
            } else if (C18310x6.A1X(r1.A01)) {
                r0 = C34521vI.A00;
            }
            r32.A00(r0);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostRequestSessionManager/Crosspost success for session: ");
        C53572nJ r12 = r32.A01;
        AnonymousClass356.A05(A0o, r12.A04);
        r32.A00.A00(r12);
    }
}
