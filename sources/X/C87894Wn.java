package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4Wn  reason: invalid class name and case insensitive filesystem */
public class C87894Wn extends AnonymousClass0R6 {
    public int A00;
    public List A01;
    public final /* synthetic */ AnonymousClass5RG A02;

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.A02.A02;
        if (i != 0) {
            return new AnonymousClass6II(layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false));
        }
        return new AnonymousClass4YH(layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false));
    }

    public C87894Wn(AnonymousClass5RG r1) {
        this.A02 = r1;
    }

    public int A0G() {
        int A08 = C86614Ku.A08(this.A01);
        List list = this.A01;
        int i = this.A00;
        if (list != null) {
            i -= list.size();
        }
        if (i <= 0 || A08 <= 0) {
            return A08;
        }
        return A08 + 1;
    }

    public int getItemViewType(int i) {
        List list = this.A01;
        int i2 = this.A00;
        if (list != null) {
            i2 -= list.size();
        }
        if (i2 <= 0 || i != this.A01.size()) {
            return 0;
        }
        return 1;
    }

    public void BNf(C05570Ua r9, int i) {
        Context context;
        int i2;
        String A0S;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            AnonymousClass4YH r92 = (AnonymousClass4YH) r9;
            AnonymousClass3ZH A0L = AnonymousClass4L0.A0L(this.A01, i);
            AnonymousClass5RG r4 = this.A02;
            TextView textView = r92.A01;
            if (!AnonymousClass3ZH.A0E(A0L)) {
                A0S = A0L.A0J();
            } else if (A0L.A0V()) {
                A0S = r4.A0G.A0S(A0L, false);
            } else {
                String A0D = r4.A0K.A0D(AnonymousClass3ZH.A01(A0L));
                if (!TextUtils.isEmpty(A0D)) {
                    textView.setSingleLine(false);
                } else if (!TextUtils.isEmpty(A0L.A0b)) {
                    A0D = AnonymousClass5ZU.A03(r4.A0G, A0L);
                    textView.setSingleLine(false);
                    context = r4.A01;
                    i2 = R.color.f5nameremoved;
                    AnonymousClass0x2.A0q(context, textView, i2);
                    textView.setText(A0D);
                    C86664Kz.A1S(textView);
                    r4.A0H.A0A(r92.A00, A0L, false);
                } else {
                    A0D = C86654Ky.A0m(r4.A0J, A0L);
                    textView.setSingleLine(true);
                }
                context = r4.A01;
                i2 = AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved);
                AnonymousClass0x2.A0q(context, textView, i2);
                textView.setText(A0D);
                C86664Kz.A1S(textView);
                r4.A0H.A0A(r92.A00, A0L, false);
            }
            textView.setText(A0S);
            textView.setSingleLine(false);
            AnonymousClass5Yj.A0B(r4.A01, textView, R.attr.f3nameremoved, R.color.f5nameremoved);
            C86664Kz.A1S(textView);
            r4.A0H.A0A(r92.A00, A0L, false);
        } else if (itemViewType == 1) {
            TextView textView2 = ((AnonymousClass6II) r9).A00;
            Context context2 = this.A02.A01;
            Object[] objArr = new Object[1];
            List list = this.A01;
            int i3 = this.A00;
            if (list != null) {
                i3 -= list.size();
            }
            AnonymousClass000.A1P(objArr, i3, 0);
            AnonymousClass001.A0y(context2, textView2, objArr, R.string.f11nameremoved);
        }
    }
}
