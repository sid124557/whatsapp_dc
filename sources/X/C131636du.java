package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6du  reason: invalid class name and case insensitive filesystem */
public class C131636du extends C153617bf {
    public static final C181508ms A00 = new C170538Do();

    public static void A00(C172478Lh r14, C158627kI r15, C153617bf r16, C181508ms r17, Object obj, String str) {
        Object obj2;
        C158627kI r11 = r15;
        C187038wL r9 = r15.A01.A00;
        Object obj3 = obj;
        C153617bf r12 = r16;
        C181508ms r13 = r17;
        String str2 = str;
        if (obj3 instanceof Map) {
            if (r13.BKr(obj3)) {
                r12.A03(r14, r15, obj3, str2);
            }
            Iterator it = r9.BBl(obj3).iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                StringBuilder A0l = AnonymousClass000.A0l(str2);
                A0l.append("['");
                A0l.append(A0m);
                String A0X = AnonymousClass000.A0X("']", A0l);
                Map map = (Map) obj3;
                if (!map.containsKey(A0m)) {
                    obj2 = C187038wL.A00;
                } else {
                    obj2 = map.get(A0m);
                }
                if (obj2 != C187038wL.A00) {
                    A00(new C131356dS(obj3, A0m), r11, r12, r13, obj2, A0X);
                }
            }
        } else if (obj3 instanceof List) {
            int i = 0;
            if (r13.BKr(obj3)) {
                if (r12.A01 == null) {
                    r12.A03(r14, r15, obj3, str2);
                } else {
                    C153617bf A01 = r12.A01();
                    int i2 = 0;
                    for (Object next : r9.Bqo(obj3)) {
                        StringBuilder A0l2 = AnonymousClass000.A0l(str2);
                        C18270x1.A19("[", "]", A0l2, i2);
                        String obj4 = A0l2.toString();
                        A01.A00 = i2;
                        A01.A03(r14, r15, next, obj4);
                        i2++;
                    }
                }
            }
            for (Object next2 : r9.Bqo(obj3)) {
                StringBuilder A0l3 = AnonymousClass000.A0l(str2);
                C18270x1.A19("[", "]", A0l3, i);
                A00(new C131366dT(obj3, i), r11, r12, r13, next2, A0l3.toString());
                i++;
            }
        }
    }
}
