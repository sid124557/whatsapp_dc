package X;

import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.5kw  reason: invalid class name and case insensitive filesystem */
public class C113135kw implements C1229466l {
    public final /* synthetic */ C89654ea A00;
    public final /* synthetic */ AnonymousClass5UB A01;
    public final /* synthetic */ C116095pj A02;
    public final /* synthetic */ C30721mu A03;

    public C113135kw(C89654ea r1, AnonymousClass5UB r2, C116095pj r3, C30721mu r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }

    public C30721mu B7W() {
        return this.A03;
    }

    public void BXi(int i) {
        this.A01.A01(this.A00, false);
    }

    public void BYz(int i) {
        AnonymousClass5UB r0 = this.A01;
        CircularProgressBar circularProgressBar = r0.A0A;
        circularProgressBar.setProgress(i);
        AudioPickerActivity audioPickerActivity = r0.A0C;
        circularProgressBar.setContentDescription(C86604Kt.A0m(audioPickerActivity, C107565bW.A0B(audioPickerActivity.A00, (long) i), R.string.f11nameremoved));
    }

    public void BaX() {
        this.A01.A00(this.A00);
    }

    public void Bc6(int i) {
        this.A02.A08(0);
        AnonymousClass5UB r1 = this.A01;
        r1.A00(this.A00);
        r1.A0A.setMax(i);
    }

    public void Bcm(int i, boolean z) {
        AnonymousClass5UB r2 = this.A01;
        r2.A01(this.A00, true);
        if (z) {
            r2.A0A.setProgress(0);
        }
        r2.A0C.A0H.A08((C116095pj) null);
    }

    public void BRl(boolean z) {
    }
}
