package X;

import com.whatsapp.util.Log;

/* renamed from: X.3EQ  reason: invalid class name */
public final class AnonymousClass3EQ implements AnonymousClass4CR {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass2XY A01;
    public final /* synthetic */ C54862pP A02;

    public AnonymousClass3EQ(AnonymousClass2XY r1, C54862pP r2, long j) {
        this.A00 = j;
        this.A02 = r2;
        this.A01 = r1;
    }

    public void BSk() {
        Log.i("BonsaiTos/accept/error");
        AnonymousClass2XY r1 = this.A01;
        if (r1 != null) {
            r1.A00(false);
        }
    }

    public void onSuccess() {
        String str;
        AnonymousClass66R r0;
        boolean A1T = AnonymousClass000.A1T((this.A00 > 20230902 ? 1 : (this.A00 == 20230902 ? 0 : -1)));
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BonsaiTos/accept/success; type=");
        if (A1T) {
            str = "invoke";
        } else {
            str = "agent";
        }
        C18260x0.A1L(A0o, str);
        C54862pP r02 = this.A02;
        if (A1T) {
            r0 = r02.A05;
        } else {
            r0 = r02.A04;
        }
        ((C54282oT) r0.getValue()).A01(AnonymousClass21Y.A02, true);
        AnonymousClass2XY r03 = this.A01;
        if (r03 != null) {
            r03.A00(true);
        }
    }
}
