package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5j4  reason: invalid class name and case insensitive filesystem */
public class C112025j4 implements C184088rE {
    public final /* synthetic */ AnonymousClass7MW A00;
    public final /* synthetic */ AnonymousClass5Y9 A01;

    public C112025j4(AnonymousClass7MW r1, AnonymousClass5Y9 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BSn(AnonymousClass5TG r6, int i) {
        AnonymousClass7MW r4 = this.A00;
        C18260x0.A0x("onFetchCollectionProductListFailure errorCode =", AnonymousClass001.A0o(), i);
        AnonymousClass5Y9 r3 = r4.A00;
        AnonymousClass0x9.A1I(r3.A05);
        if (i == 404) {
            Log.d("remove collection cache and reset page info");
            r3.A0C.A0H(r4.A01, true);
        }
        r3.A03.A0G(new C132316f5(r4.A01, i, r4.A02));
    }

    public void BdN(C64533Dw r15, AnonymousClass5TG r16) {
        String str;
        AnonymousClass7MW r8 = this.A00;
        AnonymousClass5Y9 r9 = r8.A00;
        AnonymousClass0x9.A1I(r9.A05);
        String str2 = r16.A05;
        if (str2 == null || str2.equals(r8.A03)) {
            boolean z = true;
            boolean A1W = AnonymousClass000.A1W(str2);
            C105405Uu r7 = r9.A0C;
            UserJid userJid = r8.A01;
            C162457s7.A0J(userJid, 0);
            synchronized (r7) {
                C49722gz r11 = r15.A02;
                List list = r11.A04;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C109015dw A12 = C86664Kz.A12(it);
                    Map map = r7.A02;
                    String str3 = A12.A0F;
                    map.put(new C48382eo(userJid, str3), A12);
                    Map map2 = r7.A03;
                    C162457s7.A0C(str3);
                    map2.put(str3, userJid);
                }
                str = r11.A03;
                C162457s7.A0C(str);
                C148057Gt r2 = (C148057Gt) r7.A02(userJid).A05.get(str);
                if (r2 != null) {
                    if (!A1W) {
                        r2.A01.A04.clear();
                    }
                    C49722gz r1 = r2.A01;
                    r1.A02 = r11.A02;
                    r1.A01 = r11.A01;
                    r1.A00 = r11.A00;
                    r1.A04.addAll(list);
                } else {
                    AnonymousClass7OX A02 = r7.A02(userJid);
                    r2 = new C148057Gt(r11);
                    A02.A05.put(str, r2);
                }
                r2.A00 = r15.A01;
            }
            AnonymousClass08M r12 = r9.A03;
            if (r8.A03 != null) {
                z = false;
            }
            r12.A0G(new C132326f6(userJid, str, false, z));
        }
    }
}
