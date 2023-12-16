package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.5mz  reason: invalid class name and case insensitive filesystem */
public class C114405mz implements C184408rk {
    public final String A00;
    public final /* synthetic */ C103765Oi A01;

    public C114405mz(C103765Oi r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public void BSO(AnonymousClass7T4 r6, int i) {
        AnonymousClass4U1 r4 = this.A01.A02;
        if (r4 != null) {
            r4.A09.A0S(new C117205rY(r4, this.A00, i, 0));
            r4.A0H.A03();
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ArrayList A0s;
        AnonymousClass08J r8;
        AnonymousClass7QA r14 = (AnonymousClass7QA) obj;
        AnonymousClass4U1 r4 = this.A01.A02;
        if (r4 != null) {
            List list = r14.A09;
            String str = this.A00;
            LinkedList linkedList = r4.A0K;
            synchronized (linkedList) {
                if (linkedList.contains(str)) {
                    while (!str.equals(linkedList.peek())) {
                        linkedList.poll();
                    }
                    linkedList.poll();
                    if (list.isEmpty()) {
                        r8 = r4.A05;
                        A0s = C162197rQ.newArrayList((Object[]) new C136186lz[]{new C132496fR((C181938nb) null, str, 1)});
                    } else {
                        A0s = AnonymousClass001.A0s();
                        for (int i = 0; i < list.size(); i++) {
                            C109065e1 r6 = (C109065e1) list.get(i);
                            A0s.add(new C96334wC(r6, new C114955ns(r4, r6, i), 62));
                        }
                        A0s.add(new C136096lq(AnonymousClass5YI.A04(r4.A00, 12.0f)));
                        A0s.add(new C135856lM());
                        A0s.add(new C135886lP());
                        r8 = r4.A05;
                    }
                    r8.A0G(A0s);
                    r4.A0H.A04();
                    C104795Sj r7 = r4.A0F;
                    long size = (long) list.size();
                    Iterator it = list.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        if (AnonymousClass4L0.A0K(it).A08 == 2) {
                            i2++;
                        }
                    }
                    r7.A01(0, size, (long) i2);
                    if (r4.A0A.A00(r4.A0J)) {
                        long size2 = (long) list.size();
                        Iterator it2 = list.iterator();
                        int i3 = 0;
                        while (it2.hasNext()) {
                            if (AnonymousClass4L0.A0K(it2).A08 == 2) {
                                i3++;
                            }
                        }
                        r7.A01(0, size2, (long) i3);
                    }
                }
            }
        }
    }
}
