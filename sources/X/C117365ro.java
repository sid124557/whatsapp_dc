package X;

import java.util.List;
import org.json.JSONObject;

/* renamed from: X.5ro  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117365ro implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass5ZL A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;

    public final void run() {
        AnonymousClass5ZL r1 = this.A02;
        String str = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        List list = this.A04;
        List list2 = this.A05;
        C111515iD r9 = r1.A0A;
        C56532s8 r7 = r1.A0E;
        int i3 = 0;
        if (r7.A02 == 98) {
            i3 = 20;
        }
        int A052 = C86644Kx.A05(r7);
        AnonymousClass1VX r4 = r9.A01;
        C162457s7.A0J(r4, 0);
        if (r4.A0X(5957)) {
            C94924sJ r10 = new C94924sJ();
            r10.A00 = 47;
            r10.A01 = Integer.valueOf(i3);
            r9.A01(r10);
            r9.A02(r10, Integer.valueOf(A052), (Integer) null, Integer.valueOf(i), (Integer) null, Integer.valueOf(i2), (String) null, list);
            r9.A02.BhD(r10);
        }
        AnonymousClass3Z6[] r3 = new AnonymousClass3Z6[3];
        AnonymousClass3Z6.A09("error_type", Integer.valueOf(i2), r3, 0);
        AnonymousClass3Z6.A05("error_code", list, r3);
        AnonymousClass3Z6.A06("error_message", list2, r3);
        r9.A03((Boolean) null, (Integer) null, str, (String) null, C18290x4.A0o(new JSONObject(C73813g7.A0G(r3))), 3, i3);
    }

    public /* synthetic */ C117365ro(AnonymousClass5ZL r1, String str, List list, List list2, int i, int i2) {
        this.A02 = r1;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = list;
        this.A05 = list2;
    }
}
