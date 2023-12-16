package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4WY  reason: invalid class name */
public final class AnonymousClass4WY extends AnonymousClass0R6 {
    public List A00;
    public final Context A01;
    public final LayoutInflater A02;
    public final AnonymousClass5ZU A03;
    public final C105365Uq A04;
    public final C620733j A05;
    public final C56982ss A06;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        return new AnonymousClass4YI(C18310x6.A0I(this.A02, viewGroup, R.layout.f8nameremoved, false));
    }

    public int A0G() {
        List list = this.A00;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r8, int i) {
        Context context;
        int i2;
        AnonymousClass4YI r82 = (AnonymousClass4YI) r8;
        C162457s7.A0J(r82, 0);
        List list = this.A00;
        if (list != null) {
            AnonymousClass3ZH A0L = AnonymousClass4L0.A0L(list, i);
            TextView textView = r82.A01;
            String A0J = A0L.A0J();
            if (A0J != null && A0J.length() > 0) {
                textView.setText(A0L.A0J());
            } else if (A0L.A0V()) {
                textView.setText(this.A03.A0S(A0L, false));
                textView.setSingleLine(false);
            } else {
                String A0D = this.A06.A0D(AnonymousClass3ZH.A01(A0L));
                if (A0D == null || A0D.length() <= 0) {
                    String str = A0L.A0b;
                    if (str == null || str.length() <= 0) {
                        A0D = C86654Ky.A0m(this.A05, A0L);
                        textView.setSingleLine(true);
                    } else {
                        A0D = AnonymousClass5ZU.A03(this.A03, A0L);
                        textView.setSingleLine(false);
                        context = this.A01;
                        i2 = R.color.f5nameremoved;
                        AnonymousClass0x2.A0q(context, textView, i2);
                        textView.setText(A0D);
                        this.A04.A0A(r82.A00, A0L, false);
                    }
                } else {
                    textView.setSingleLine(false);
                }
                context = this.A01;
                i2 = AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved);
                AnonymousClass0x2.A0q(context, textView, i2);
                textView.setText(A0D);
                this.A04.A0A(r82.A00, A0L, false);
            }
            AnonymousClass5Yj.A0B(this.A01, textView, R.attr.f3nameremoved, R.color.f5nameremoved);
            this.A04.A0A(r82.A00, A0L, false);
        }
    }

    public AnonymousClass4WY(Context context, LayoutInflater layoutInflater, AnonymousClass5ZU r4, C105365Uq r5, C620733j r6, C56982ss r7) {
        C18260x0.A0e(r7, layoutInflater, r4, r6);
        C162457s7.A0J(r5, 6);
        this.A01 = context;
        this.A06 = r7;
        this.A02 = layoutInflater;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
    }
}
