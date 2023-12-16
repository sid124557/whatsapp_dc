package X;

import java.util.List;

/* renamed from: X.9h4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9h4 implements Runnable {
    public final /* synthetic */ C1902194o A00;

    public final void run() {
        C133706ho r5;
        C1902194o r7 = this.A00;
        AnonymousClass8EA r1 = r7.A0H;
        if (r1.A09().size() > 0 && (r5 = (C133706ho) r1.A09().get(0)) != null) {
            List A0D = r1.A0D();
            Integer[] numArr = new Integer[1];
            AnonymousClass000.A1P(numArr, 300, 0);
            r7.A09.A0S(new C201299jq(r5, r7, A0D, r7.A0F.A0V(new Integer[0], numArr, 3)));
        }
    }

    public /* synthetic */ AnonymousClass9h4(C1902194o r1) {
        this.A00 = r1;
    }
}
