package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Su  reason: invalid class name and case insensitive filesystem */
public class C68343Su implements AnonymousClass4EZ {
    public final C55682qk A00;
    public final C66493Lq A01;
    public final C27991fJ A02;
    public final C72173dI A03;

    public void BQs(String str) {
    }

    public C68343Su(C55682qk r2, C66493Lq r3, C27991fJ r4, AnonymousClass4FS r5) {
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = C72173dI.A00(r5);
    }

    public void BdM(AnonymousClass36K r13, String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass36K A0l = r13.A0l("sub_groups");
        if (A0l != null) {
            Iterator A0M = AnonymousClass36K.A0M(A0l, "group");
            while (A0M.hasNext()) {
                AnonymousClass36K A0Y = C18310x6.A0Y(A0M);
                try {
                    C27991fJ A08 = AnonymousClass36K.A08(A0Y);
                    String A0r = A0Y.A0r("subject", (String) null);
                    long A032 = C615531h.A03(A0Y.A0r("s_t", (String) null)) * 1000;
                    int A022 = AnonymousClass36J.A02(A0Y);
                    if (A022 == 0) {
                        A022 = 2;
                    }
                    if (A0r == null) {
                        A0r = "";
                    }
                    A0s.add(new C52882mC(A08, A0r, A022, A032));
                } catch (AnonymousClass24P e) {
                    C626936e.A0A(e);
                    this.A00.A0A("Connection/handleInvalidJidReceived", true, "invalid-jid-received");
                }
            }
            C66493Lq r5 = this.A01;
            C27991fJ r4 = this.A02;
            Log.i("groupChatManger/onSubGroupsChanged");
            C56062rM r8 = r5.A0A.A0H;
            r8.A04();
            r8.A00.A03(r4, A0s);
            Map map = r8.A02;
            C58612vX r9 = (C58612vX) map.get(r4);
            if (r9 == null) {
                r9 = new C58612vX();
            }
            C58612vX r6 = new C58612vX(r9.A00, r9.A01, AnonymousClass0x9.A15(A0s));
            Iterator it = r9.A02.iterator();
            while (it.hasNext()) {
                r8.A03.remove(AnonymousClass0x7.A0O(it).A02);
            }
            Iterator it2 = A0s.iterator();
            while (it2.hasNext()) {
                r8.A03.put(AnonymousClass0x7.A0O(it2).A02, r4);
            }
            map.put(r4, r6);
            Iterator it3 = A0s.iterator();
            while (it3.hasNext()) {
                C52882mC A0O = AnonymousClass0x7.A0O(it3);
                AnonymousClass31A A002 = C56982ss.A00(r5.A0S, A0O.A02);
                if (A002 != null) {
                    A002.A02 = A0O.A00;
                }
            }
            r5.A05.BkS(new C70103Zx(r5, 19, r4));
        }
    }

    public void BSN(AnonymousClass36K r1, String str) {
    }
}
