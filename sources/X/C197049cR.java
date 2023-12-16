package X;

import android.content.DialogInterface;
import com.whatsapp.R;

/* renamed from: X.9cR  reason: invalid class name and case insensitive filesystem */
public class C197049cR implements C203089n6 {
    public final /* synthetic */ C89644eZ A00;
    public final /* synthetic */ AnonymousClass9W1 A01;
    public final /* synthetic */ boolean A02;

    public C197049cR(C89644eZ r1, AnonymousClass9W1 r2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z;
    }

    public void BS8(AnonymousClass9V4 r5) {
        AnonymousClass34V r0 = r5.A00;
        if (r0 == null) {
            r0 = C1899693i.A0M();
        }
        int i = r0.A00;
        AnonymousClass9W1 r1 = this.A01;
        C89644eZ r2 = this.A00;
        if (i == 25554) {
            r1.A04(r2, this.A02);
        } else {
            AnonymousClass9WM.A00(r2, (DialogInterface.OnDismissListener) null, r2.getString(R.string.f11nameremoved)).show();
        }
    }

    public void onResult(Object obj) {
        this.A01.A04(this.A00, this.A02);
    }
}
