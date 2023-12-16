package X;

import com.whatsapp.R;

/* renamed from: X.9ii  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200679ii implements Runnable {
    public final /* synthetic */ C166587yw A00;
    public final /* synthetic */ AnonymousClass94y A01;

    public final void run() {
        AnonymousClass94y r4 = this.A01;
        C166587yw r3 = this.A00;
        C203719oC A0D = r4.A0D();
        if (A0D.B5P() == null || r3 == null) {
            AnonymousClass9QJ A002 = AnonymousClass9QJ.A00(8);
            A002.A0C = r4.A0O.A00.getString(R.string.f11nameremoved);
            AnonymousClass94y.A00(r4, A002);
            return;
        }
        AnonymousClass9QJ A003 = AnonymousClass9QJ.A00(16);
        A003.A04 = r3;
        A003.A0A = A0D.B5Q();
        AnonymousClass94y.A00(r4, A003);
    }

    public /* synthetic */ C200679ii(C166587yw r1, AnonymousClass94y r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
