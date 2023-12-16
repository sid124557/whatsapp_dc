package X;

import android.app.Activity;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5kQ  reason: invalid class name and case insensitive filesystem */
public class C112815kQ implements C185688u5 {
    public C992454z A00;
    public C992955e A01;
    public String A02;
    public final Activity A03;
    public final C56962sq A04;
    public final C29441ip A05;
    public final C64773Ex A06;
    public final C104195Qa A07;
    public final C66413Li A08;
    public final AnonymousClass31C A09;
    public final AnonymousClass4FS A0A;

    public void A00() {
        C992454z r0 = this.A00;
        if (r0 != null) {
            r0.A0D(true);
            this.A00 = null;
        }
        C992955e r02 = this.A01;
        if (r02 != null) {
            r02.A0D(true);
            this.A01 = null;
        }
    }

    public /* synthetic */ void BT9() {
    }

    public void BTA(AnonymousClass3ZH r6) {
        Activity activity = this.A03;
        if (activity.isFinishing()) {
            return;
        }
        if (r6 != null) {
            this.A07.A01(r6, activity.getString(R.string.f11nameremoved));
            return;
        }
        C104195Qa r4 = this.A07;
        r4.A01((AnonymousClass3ZH) null, activity.getString(R.string.f11nameremoved));
        String string = activity.getString(R.string.f11nameremoved);
        C109335eS r2 = new C109335eS(this, 18);
        C162457s7.A0J(string, 0);
        TextView textView = r4.A03;
        textView.setText(string);
        textView.setVisibility(0);
        textView.setOnClickListener(r2);
    }

    public /* synthetic */ void BTB() {
    }

    public /* synthetic */ void BUK() {
    }

    public C112815kQ(Activity activity, C56962sq r2, C29441ip r3, C64773Ex r4, C104195Qa r5, C66413Li r6, AnonymousClass31C r7, AnonymousClass4FS r8) {
        this.A03 = activity;
        this.A0A = r8;
        this.A09 = r7;
        this.A06 = r4;
        this.A04 = r2;
        this.A08 = r6;
        this.A05 = r3;
        this.A07 = r5;
    }

    public /* synthetic */ void BbX(int i) {
    }
}
