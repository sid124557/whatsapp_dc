package X;

import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

/* renamed from: X.3AH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3AH implements C15630rg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C623734t A01;
    public final /* synthetic */ AnonymousClass227 A02;
    public final /* synthetic */ C25931bJ A03;
    public final /* synthetic */ Collection A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public final Object apply(Object obj) {
        String obj2;
        String obj3;
        C623734t r7 = this.A01;
        AnonymousClass227 r9 = this.A02;
        int i = this.A00;
        Collection collection = this.A04;
        List list = this.A05;
        C25931bJ r6 = this.A03;
        boolean z = this.A06;
        boolean z2 = this.A07;
        String str = (String) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C43552So A012 = r7.A0C.A01("sync/sync_delta/", list, Collections.emptyList());
        if (A012 == null) {
            r6.A09 = 2L;
        } else {
            ArrayList A0s = AnonymousClass001.A0s();
            Set A0B = r7.A0E.A0B();
            HashSet A0K = AnonymousClass002.A0K();
            HashSet A0K2 = AnonymousClass002.A0K();
            Iterator it = A012.A01.iterator();
            while (it.hasNext()) {
                AnonymousClass3ZH A0R = C18310x6.A0R(it);
                if (!C623734t.A01(A0R, A0B, true)) {
                    C618832q r13 = new C618832q(A0R);
                    boolean A0E = r7.A0L.A0E();
                    r13.A0C = true;
                    r13.A0L = true;
                    r13.A0J = r7.A0N.A07();
                    r13.A0B = true;
                    Map map = r7.A0Q;
                    UserJid userJid = r13.A0P;
                    C618832q.A01(r7, r13, userJid, map);
                    r13.A0E = true;
                    r13.A0I = A0E;
                    AnonymousClass3ZH r0 = r13.A0O;
                    C626936e.A06(r0);
                    r13.A01 = AnonymousClass227.A00(r0, r9);
                    C56952sp.A09(r7, r13, z, z2);
                    r13.A02 = AnonymousClass318.A00(r13, r7.A0I, userJid);
                    if (A0E) {
                        C618832q.A00(r7, r13, userJid);
                    }
                    C618832q.A02(r13, A0s);
                }
            }
            List list2 = A012.A00;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                AnonymousClass3ZH A0R2 = C18310x6.A0R(it2);
                C51602k5 r1 = A0R2.A0F;
                C95814uZ r02 = A0R2.A0H;
                if (r1 != null) {
                    obj3 = r1.A01;
                } else if (r02 != null) {
                    obj3 = r02.getRawString();
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C18280x3.A1G(A0o, "hc_", A0R2);
                    obj3 = A0o.toString();
                }
                A0K.add(obj3);
            }
            Iterator it3 = A012.A04.iterator();
            while (it3.hasNext()) {
                AnonymousClass3ZH A0R3 = C18310x6.A0R(it3);
                if (!C623734t.A01(A0R3, A0B, true)) {
                    C51602k5 r12 = A0R3.A0F;
                    C95814uZ r03 = A0R3.A0H;
                    if (r12 != null) {
                        obj2 = r12.A01;
                    } else if (r03 != null) {
                        obj2 = r03.getRawString();
                    } else {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        C18280x3.A1G(A0o2, "hc_", A0R3);
                        obj2 = A0o2.toString();
                    }
                    if (!A0K.contains(obj2)) {
                        C618832q r04 = new C618832q(A0R3);
                        r04.A0C = true;
                        r04.A0D = true;
                        C618832q.A02(r04, A0s);
                        if (r7.A04(A0R3, A0B)) {
                            C618832q r14 = new C618832q(A0R3);
                            r14.A0L = true;
                            r14.A0J = r7.A0N.A07();
                            r14.A0B = true;
                            r14.A0G = true;
                            r14.A0K = true;
                            if (C56952sp.A0F(r7.A0J)) {
                                r14.A0M = true;
                            }
                            Map map2 = r7.A0Q;
                            UserJid userJid2 = r14.A0P;
                            C618832q.A01(r7, r14, userJid2, map2);
                            A0K2.add(userJid2);
                            C618832q.A02(r14, A0s);
                        }
                    }
                }
            }
            if (collection != null) {
                Iterator it4 = collection.iterator();
                while (it4.hasNext()) {
                    AnonymousClass3ZH A0R4 = C18310x6.A0R(it4);
                    if (!A0K2.contains(AnonymousClass3ZH.A03(A0R4)) && !C621733w.A02(A0R4.A0H)) {
                        boolean A0E2 = r7.A0L.A0E();
                        C618832q r11 = new C618832q(A0R4);
                        r11.A0L = true;
                        r11.A0J = r7.A0N.A07();
                        r11.A0B = true;
                        r11.A0G = true;
                        r11.A0K = true;
                        r11.A0E = true;
                        r11.A01 = AnonymousClass227.A00(A0R4, r9);
                        r11.A0I = A0E2;
                        C56952sp.A09(r7, r11, z, z2);
                        Map map3 = r7.A0Q;
                        UserJid userJid3 = r11.A0P;
                        C618832q.A01(r7, r11, userJid3, map3);
                        r11.A02 = AnonymousClass318.A00(r11, r7.A0I, userJid3);
                        if (A0E2) {
                            C618832q.A00(r7, r11, userJid3);
                        }
                        C618832q.A02(r11, A0s);
                    }
                }
            }
            C18260x0.A1A("sync/sync_delta/request/count ", AnonymousClass001.A0o(), A0s);
            r6.A0F = AnonymousClass0x9.A0m(A0s.size());
            HashSet A0r = C18310x6.A0r(A0s);
            if (!A0s.isEmpty()) {
                Iterator it5 = A0s.iterator();
                while (it5.hasNext()) {
                    UserJid userJid4 = ((AnonymousClass2UM) it5.next()).A07;
                    if (userJid4 != null) {
                        A0r.add(userJid4);
                    }
                }
                Future A013 = C59512x2.A01(r9, r7.A02(), "sync_sid_delta", A0s, i);
                Log.d("contactsynchelper/syncDelta/resultData send iq");
                if (r7.A05(r6, str, A013)) {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("contactsynchelper/syncDelta/resultData userSize=");
                    C41402Kc r05 = r7.A01;
                    C626936e.A06(r05);
                    C18260x0.A1F(A0o3, r05.A01.length);
                    r7.A03((Collection) null, list2, r7.A0T);
                    Log.d("contactsynchelper/syncDelta/update phone book");
                    boolean A062 = r7.A06(list2, A012.A03, A012.A06);
                    C18260x0.A1D("contactsynchelper/syncDelta/isPhonebookUpdated=", AnonymousClass001.A0o(), A062);
                    C41402Kc r06 = r7.A01;
                    C60022xs.A00(r06, r6);
                    r7.A09.A01(r06.A00, r6, A0s, r7.A0R, r7.A0S, elapsedRealtime);
                    int i2 = 3;
                    if (A062) {
                        i2 = 2;
                    }
                    return new AnonymousClass304(A0r, i2);
                }
            } else if (r7.A06(list2, A012.A03, A012.A06)) {
                return AnonymousClass304.A07;
            } else {
                return AnonymousClass304.A08;
            }
        }
        return AnonymousClass304.A03;
    }

    public /* synthetic */ AnonymousClass3AH(C623734t r1, AnonymousClass227 r2, C25931bJ r3, Collection collection, List list, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A04 = collection;
        this.A05 = list;
        this.A03 = r3;
        this.A06 = z;
        this.A07 = z2;
    }
}
