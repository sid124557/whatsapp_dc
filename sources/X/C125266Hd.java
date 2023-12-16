package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.6Hd  reason: invalid class name and case insensitive filesystem */
public final class C125266Hd extends AnonymousClass0R6 {
    public int A00;
    public final C165977xw A01;
    public final C1448373d A02;
    public final C181848nR A03;
    public final C166107y9 A04;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        View inflate = C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
        C162457s7.A0H(inflate);
        AnonymousClass746 r1 = new AnonymousClass746(this, 0);
        C162457s7.A0J(inflate, 0);
        return new C125576Io(inflate, r1);
    }

    public /* bridge */ /* synthetic */ void A0A(C05570Ua r4, List list, int i) {
        View view;
        C125576Io r42 = (C125576Io) r4;
        C18260x0.A0P(r42, list);
        Object A042 = C73723fy.A04(list);
        if (A042 instanceof Boolean) {
            boolean A1Z = AnonymousClass001.A1Z(A042);
            boolean z = false;
            View view2 = r42.A01;
            if (A1Z) {
                C162457s7.A0C(view2);
                view2.setVisibility(0);
                view = r42.A0H;
                z = true;
            } else {
                C162457s7.A0C(view2);
                view2.setVisibility(4);
                view = r42.A0H;
            }
            view.setSelected(z);
            return;
        }
        BNf(r42, i);
    }

    public int A0G() {
        return this.A04.A01.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r11, int i) {
        Boolean bool;
        Context context;
        int i2;
        int i3;
        View view;
        C125576Io r112 = (C125576Io) r11;
        C162457s7.A0J(r112, 0);
        C166107y9 r4 = this.A04;
        String str = ((C132226eu) r4.A01.get(i)).A00;
        C166027y1 A002 = C154217co.A00(C154217co.A01(r4, i), this.A01, r4.A02);
        if (A002 != null) {
            bool = Boolean.valueOf(A002.A02);
        } else {
            bool = null;
        }
        boolean A1U = AnonymousClass000.A1U(i, this.A00);
        Boolean bool2 = Boolean.TRUE;
        boolean A0P = C162457s7.A0P(bool, bool2);
        int i4 = 0;
        TextView textView = r112.A03;
        if (A0P) {
            textView.setText(str);
            context = textView.getContext();
            i2 = AnonymousClass5Yj.A07(textView);
        } else {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new StrikethroughSpan(), 0, str.length(), 33);
            textView.setText(spannableString);
            context = textView.getContext();
            i2 = R.color.f5nameremoved;
        }
        textView.setTextColor(AnonymousClass0Y8.A04(context, i2));
        TextView textView2 = r112.A02;
        C162457s7.A0C(textView2);
        if (C162457s7.A0P(bool, bool2)) {
            i4 = 8;
        }
        textView2.setVisibility(i4);
        if (C162457s7.A0P(bool, bool2)) {
            textView2.setText((CharSequence) null);
        } else {
            if (C162457s7.A0P(bool, Boolean.FALSE)) {
                i3 = R.string.f11nameremoved;
            } else if (bool == null) {
                i3 = R.string.f11nameremoved;
            }
            textView2.setText(i3);
        }
        boolean z = false;
        View view2 = r112.A01;
        if (A1U) {
            C162457s7.A0C(view2);
            view2.setVisibility(0);
            view = r112.A0H;
            z = true;
        } else {
            C162457s7.A0C(view2);
            view2.setVisibility(4);
            view = r112.A0H;
        }
        view.setSelected(z);
    }

    public C125266Hd(C165977xw r1, C1448373d r2, C181848nR r3, C166107y9 r4, int i) {
        this.A04 = r4;
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = i;
    }
}
