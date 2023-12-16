package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4fd  reason: invalid class name and case insensitive filesystem */
public class C90004fd extends AnonymousClass1I8 {
    public final C624134x A00;
    public final C95894up A01;

    public /* bridge */ /* synthetic */ Object A07() {
        List list;
        UserJid userJid;
        AnonymousClass3ZH A07;
        C95894up r4 = this.A01;
        C624134x r11 = this.A00;
        List A02 = C615731j.A02(r11, r4.A06);
        C106705a1 r14 = null;
        if (A02 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C624134x.A0S(r11, "Couldn't load vcard for message ", A0o);
            throw new C143696zK(A0o.toString());
        }
        ArrayList A0I = AnonymousClass002.A0I(3);
        C106705a1 r10 = null;
        int i = 0;
        int i2 = 0;
        while (i < A02.size() && i < 100 && i2 < 3) {
            try {
                C54292oU r9 = r4.A04;
                C64773Ex r8 = r4.A01;
                AnonymousClass5Y4 r1 = new AnonymousClass5Y4(r8, r4.A03, r9, r4.A05);
                r1.A05(AnonymousClass001.A0n(A02, i));
                C106705a1 r7 = r1.A04;
                if (r14 == null) {
                    r14 = r7;
                }
                byte[] bArr = r7.A0B;
                if (bArr == null || bArr.length <= 0) {
                    List list2 = r7.A06;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                UserJid userJid2 = AnonymousClass4L0.A0R(it).A01;
                                if (userJid2 != null && (A07 = r8.A07(userJid2)) != null && r4.A02.A07(A07)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    i++;
                }
                A0I.add(r7);
                if (r10 == null) {
                    r10 = r7;
                }
                i2++;
            } catch (C143696zK e) {
                Log.e("Invalid VCard.", e);
            }
            i++;
        }
        String str = null;
        if (!(r14 == null || (list = r14.A06) == null || list.isEmpty() || (userJid = ((AnonymousClass7OD) C18290x4.A0k(r14.A06)).A01) == null)) {
            C56722sS r12 = r4.A00;
            if (C155477ey.A00(userJid)) {
                str = r12.A01(userJid);
            }
        }
        if (r10 != null) {
            r14 = r10;
        }
        return new AnonymousClass7O9(r11, str, A0I, r14, A02.size());
    }

    public C90004fd(C624134x r1, C95894up r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
