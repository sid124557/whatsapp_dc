package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.5O5  reason: invalid class name */
public class AnonymousClass5O5 {
    public final C56512s6 A00;
    public final AnonymousClass5ZR A01;
    public final C61072zf A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass4FV A04;

    public boolean A00(Activity activity, AnonymousClass4FU r8, C85014Ep r9, int i) {
        boolean z;
        AnonymousClass1VX r1 = this.A03;
        Intent A0L = RequestPermissionActivity.A0L(activity, this.A01, r1, i);
        if (A0L == null) {
            z = true;
        } else {
            activity.startActivityForResult(A0L, i);
            z = false;
        }
        if (z && this.A00.A08(r9)) {
            if (this.A02.A02() >= C86624Kv.A05(r1, 3658)) {
                return true;
            }
            AnonymousClass35X.A05(activity, r8, this.A04, 5);
        }
        return false;
    }

    public AnonymousClass5O5(C56512s6 r1, AnonymousClass5ZR r2, C61072zf r3, AnonymousClass1VX r4, AnonymousClass4FV r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
