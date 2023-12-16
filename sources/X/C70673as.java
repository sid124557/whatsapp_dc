package X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: X.3as  reason: invalid class name and case insensitive filesystem */
public class C70673as implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    public C70673as(Object obj, Object obj2, String str, String str2, String str3, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = obj2;
    }

    public final void run() {
        C183538qC r1;
        String A0Z;
        String A0b;
        String str;
        String str2;
        String str3;
        Map map;
        C59652xG r0;
        switch (this.A05) {
            case 0:
                C56502s5 r3 = (C56502s5) this.A00;
                String str4 = this.A02;
                String str5 = this.A03;
                String str6 = this.A04;
                Map map2 = (Map) this.A01;
                C56912sl r2 = (C56912sl) r3.A03.get();
                synchronized (r3) {
                    r1 = r3.A04;
                    A0Z = C18320x8.A0J(r1).A0Z();
                    TextUtils.isEmpty(A0Z);
                }
                synchronized (r3) {
                    A0b = C18320x8.A0J(r1).A0b();
                    TextUtils.isEmpty(A0b);
                }
                synchronized (r3) {
                }
                if (r2.A0F()) {
                    byte[] A0H = r2.A0H(A0Z, A0b);
                    byte[] A0G = r2.A0G("sendClientFunnelLog");
                    C105935Wz.A00(new C138556qc(r2.A0N, r2.A0P, A0Z, A0b, str4, str5, str6, map2, A0H, A0G));
                    return;
                }
                return;
            case 1:
                str = this.A02;
                str2 = this.A03;
                str3 = this.A04;
                map = (Map) this.A01;
                C162457s7.A0J(map, 4);
                r0 = ((C34311us) this.A00).A01;
                break;
            default:
                str = this.A02;
                str2 = this.A03;
                str3 = this.A04;
                map = (Map) this.A01;
                r0 = ((AnonymousClass1jG) this.A00).A0C;
                break;
        }
        r0.A01(str, str2, str3, map);
    }
}
