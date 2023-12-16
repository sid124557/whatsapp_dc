package X;

import android.app.Activity;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.3Ok  reason: invalid class name and case insensitive filesystem */
public final class C67213Ok implements AnonymousClass4EN {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C41182Jg A01;
    public final /* synthetic */ AnonymousClass3XX A02;
    public final /* synthetic */ boolean A03;

    public void AyP(AnonymousClass2SI r8) {
        String str;
        C41182Jg r3;
        Map A002;
        C162457s7.A0J(r8, 0);
        int i = r8.A00;
        AnonymousClass3XX r1 = this.A02;
        Activity activity = this.A00;
        boolean z = this.A03;
        if (i == 0) {
            str = "success";
            r3 = this.A01;
            A002 = AnonymousClass31O.A01((String) r8.A03.A00);
        } else {
            str = "error";
            r3 = this.A01;
            A002 = C72043d5.A00();
        }
        r1.A00(activity, r3, str, A002, z);
    }

    public C67213Ok(Activity activity, C41182Jg r2, AnonymousClass3XX r3, boolean z) {
        this.A02 = r3;
        this.A00 = activity;
        this.A03 = z;
        this.A01 = r2;
    }

    public void BQq(IOException iOException) {
        this.A02.A00(this.A00, this.A01, "error", C72043d5.A00(), this.A03);
    }

    public void BSB(Exception exc) {
        this.A02.A00(this.A00, this.A01, "error", C72043d5.A00(), this.A03);
    }
}
