package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.8Hp  reason: invalid class name and case insensitive filesystem */
public final class C171578Hp implements C184498rv {
    public final C45362Zt A00;
    public final AnonymousClass59A A01;
    public final C184498rv A02;
    public final String A03;
    public final String A04;

    public void BiS(String str, List list) {
        C162457s7.A0J(list, 0);
        if (this.A04 == null) {
            C45362Zt r7 = this.A00;
            AnonymousClass59A r6 = this.A01;
            String str2 = r6.value;
            String str3 = this.A03;
            String str4 = str3;
            C162457s7.A0J(str2, 0);
            int A0N = r7.A01.A0N(5304);
            if (A0N < 0) {
                A0N = 0;
            }
            long A0H = ((long) A0N) + r7.A00.A0H();
            if (str3 == null) {
                str4 = "global";
            }
            String A0e = AnonymousClass0x2.A0e(str4, AnonymousClass000.A0l(str2), '_');
            Map map = r7.A02;
            synchronized (map) {
                map.put(A0e, new C52592lj(str, list, A0H));
            }
            r7.A00();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("NewsletterDirectoryV2ListJob results saved to cache | type: ");
            A0o.append(r6);
            C18260x0.A0q(" country: ", str3, A0o);
        }
        this.A02.BiS(str, list);
    }

    public void BS5(AnonymousClass8SE r6) {
        String str = this.A04;
        C184498rv r0 = this.A02;
        if (str == null) {
            r0.BS5(r6);
        } else {
            ((C115085o6) r0).A00.A0G(new AnonymousClass7N6(r6, C999558v.FAILED, str, C72023d3.A00));
        }
    }

    public C171578Hp(C45362Zt r1, AnonymousClass59A r2, C184498rv r3, String str, String str2) {
        this.A01 = r2;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
