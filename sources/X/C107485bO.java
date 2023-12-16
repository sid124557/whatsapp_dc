package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5bO  reason: invalid class name and case insensitive filesystem */
public class C107485bO implements C184408rk {
    public Object A00;
    public final int A01;

    public C107485bO(C103765Oi r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public void BSO(AnonymousClass7T4 r4, int i) {
        String str;
        AnonymousClass7YI r1;
        int i2 = this.A01;
        C103765Oi r0 = (C103765Oi) this.A00;
        if (i2 != 0) {
            AnonymousClass7KR r02 = r0.A00;
            if (r02 == null) {
                str = "BusinessApiSearchManagerImpl/onError The businessApiSearchResultListener was either not registered or it was unregistered due to lifecycle events";
            } else {
                AnonymousClass08M r2 = r02.A00;
                C156637gx r03 = (C156637gx) r2.A07();
                if (r03 != null) {
                    r1 = r03.A03;
                } else {
                    r1 = null;
                }
                r2.A0G(new C156637gx(r1, i));
                return;
            }
        } else {
            AnonymousClass7P9 r04 = r0.A01;
            if (r04 == null) {
                str = "BusinessApiSearchManagerImpl/fetchBusinessApiHomeModules A businessApiCategoriesListener should be registered before making the request";
            } else {
                r04.A00.A0G(new C156747h8(i));
                return;
            }
        }
        Log.d(str);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        Object obj2 = obj;
        if (this.A01 != 0) {
            C152277Yg r5 = (C152277Yg) obj2;
            AnonymousClass7KR r7 = ((C103765Oi) this.A00).A00;
            if (r7 == null) {
                str = "BusinessApiSearchManagerImpl/onSuccess The businessApiSearchResultListener was either not registered or it was unregistered due to lifecycle events";
            } else {
                C162457s7.A0J(r5, 0);
                ArrayList A0s = AnonymousClass001.A0s();
                int i = 62;
                if (r5.A01.equals("popular_biz")) {
                    i = 70;
                }
                Iterator it = r5.A02.iterator();
                while (it.hasNext()) {
                    C109065e1 A0K = AnonymousClass4L0.A0K(it);
                    A0s.add(new C96334wC(A0K, new C1891390d(r7, 0, A0K), i));
                }
                String str2 = r5.A00;
                if (str2 != null) {
                    A0s.add(new C136186lz(66));
                }
                r7.A00.A0G(new C156637gx(new AnonymousClass7YI(150, str2), (List) A0s));
                return;
            }
        } else {
            C152267Yf r52 = (C152267Yf) obj2;
            AnonymousClass7P9 r3 = ((C103765Oi) this.A00).A01;
            if (r3 == null) {
                str = "BusinessApiSearchManagerImpl/fetchBusinessApiHomeModules A businessApiCategoriesListener should be registered before making the request";
            } else {
                ArrayList A0r = C18300x5.A0r(r52);
                int i2 = 0;
                for (Object next : r52.A00) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        throw C18280x3.A0X();
                    }
                    C133336hB r6 = (C133336hB) next;
                    List list = r52.A02;
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    for (Object next2 : list) {
                        if (C162457s7.A0P(((AnonymousClass7ZA) next2).A00, r6.A00)) {
                            A0s2.add(next2);
                        }
                    }
                    if (A0s2.isEmpty()) {
                        String str3 = r6.A01;
                        C162457s7.A0C(str3);
                        String str4 = r6.A01;
                        A0r.add(new C96404wJ(r6.A00, str3, str4, new AnonymousClass63B(r6, r3, i2), new C1222063m(r3)));
                    }
                    i2 = i3;
                }
                r3.A00.A0G(new C156747h8(r52.A01, A0r, r52.A02));
                return;
            }
        }
        Log.d(str);
    }
}
