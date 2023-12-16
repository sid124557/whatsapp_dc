package X;

import com.whatsapp.R;

/* renamed from: X.9il  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200709il implements Runnable {
    public final /* synthetic */ C166587yw A00;
    public final /* synthetic */ AnonymousClass94y A01;

    public final void run() {
        AnonymousClass9QJ A002;
        AnonymousClass94y r4 = this.A01;
        C166587yw r3 = this.A00;
        Class BBL = r4.A0D().BBL();
        if (BBL == null || r3 == null) {
            A002 = AnonymousClass9QJ.A00(8);
            A002.A0C = r4.A0O.A00.getString(R.string.f11nameremoved);
        } else {
            A002 = AnonymousClass9QJ.A00(7);
            A002.A09 = BBL;
            A002.A04 = r3;
        }
        AnonymousClass94y.A00(r4, A002);
    }

    public /* synthetic */ C200709il(C166587yw r1, AnonymousClass94y r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
