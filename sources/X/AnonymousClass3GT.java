package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3GT  reason: invalid class name */
public final class AnonymousClass3GT implements AnonymousClass4EA {
    public final C623334p A00;
    public final C56662sM A01;

    public final List A00(PhoneUserJid phoneUserJid) {
        Long[] lArr = new Long[1];
        C623334p r3 = this.A00;
        C18280x3.A1S(lArr, r3.A05(phoneUserJid));
        List A0p = AnonymousClass8UF.A0p(lArr);
        Iterator it = this.A01.A04(phoneUserJid).iterator();
        while (it.hasNext()) {
            A0p.add(C623334p.A03(r3, AnonymousClass0x7.A0S(it)));
        }
        return A0p;
    }

    public List B8q(C95814uZ r9) {
        List A002;
        C162457s7.A0J(r9, 0);
        if (r9 instanceof C27981fH) {
            C27981fH r92 = (C27981fH) r9;
            Long[] lArr = new Long[1];
            C623334p r2 = this.A00;
            C18280x3.A1S(lArr, r2.A05(r92));
            A002 = AnonymousClass8UF.A0p(lArr);
            PhoneUserJid A02 = this.A01.A02(r92);
            if (A02 != null) {
                A002.add(C623334p.A03(r2, A02));
            }
        } else {
            A002 = r9 instanceof PhoneUserJid ? A00((PhoneUserJid) r9) : C18280x3.A0j(this.A00.A05(r9));
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : A002) {
            if (C18310x6.A0B(next) >= 0) {
                A0s.add(next);
            }
        }
        return A0s;
    }

    public List B8r(C95814uZ r9) {
        List A0j;
        C162457s7.A0J(r9, 0);
        if (r9 instanceof C27981fH) {
            C27981fH r92 = (C27981fH) r9;
            Long[] lArr = new Long[1];
            C623334p r2 = this.A00;
            C18280x3.A1S(lArr, r2.A05(r92));
            List A0p = AnonymousClass8UF.A0p(lArr);
            PhoneUserJid A02 = this.A01.A02(r92);
            if (A02 != null) {
                A0p.add(C623334p.A03(r2, A02));
            }
            A0j = C73723fy.A0D(A0p);
        } else if (r9 instanceof PhoneUserJid) {
            A0j = A00((PhoneUserJid) r9);
        } else {
            A0j = C18280x3.A0j(this.A00.A05(r9));
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : A0j) {
            if (C18310x6.A0B(next) >= 0) {
                A0s.add(next);
            }
        }
        return A0s;
    }

    public List B8t(C95814uZ r5) {
        Object[] objArr;
        if (r5 instanceof C27981fH) {
            objArr = new UserJid[2];
            objArr[0] = C56662sM.A00(this.A01, r5);
        } else if (!(r5 instanceof PhoneUserJid)) {
            return C18290x4.A12(r5);
        } else {
            objArr = new UserJid[2];
            objArr[0] = r5;
            r5 = this.A01.A01((PhoneUserJid) r5);
        }
        objArr[1] = r5;
        return C73703fw.A03(objArr);
    }

    public AnonymousClass3GT(C623334p r1, C56662sM r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
