package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.7X9  reason: invalid class name */
public final class AnonymousClass7X9 {
    public int A00;
    public C165977xw A01;
    public C166107y9 A02 = C1448473e.A00();
    public final TextView A03;
    public final C08270df A04;
    public final C15910sA A05;
    public final C154207cn A06;
    public final C181848nR A07;
    public final C620733j A08;

    public AnonymousClass7X9(TextView textView, C08270df r3, C15910sA r4, C154207cn r5, C181848nR r6, C620733j r7) {
        C162457s7.A0J(textView, 1);
        C162457s7.A0J(r7, 6);
        this.A03 = textView;
        this.A05 = r4;
        this.A04 = r3;
        this.A07 = r6;
        this.A06 = r5;
        this.A08 = r7;
    }

    public final void A01(C165977xw r11, C166107y9 r12, int i, boolean z) {
        C166107y9 r6 = r12;
        C162457s7.A0J(r12, 2);
        this.A02 = r12;
        if (i < 0 || i >= r12.A01.size()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("onTextOptionsReady: provided selectedItem=");
            A0o.append(i);
            C18260x0.A1K(A0o, " is outside of data bounds.");
            i = 0;
        }
        this.A00 = i;
        C165977xw r7 = r11;
        this.A01 = r11;
        A00();
        boolean A1W = C86624Kv.A1W(this.A02.A01.size(), 15);
        TextView textView = this.A03;
        if (A1W) {
            textView.setVisibility(0);
            this.A04.A0j(new AnonymousClass809(r11, this, r12), this.A05, "text.option.selection.request.key");
            textView.setOnClickListener(new C109545en(this, r6, r7, 0, z));
            return;
        }
        textView.setVisibility(8);
        textView.setOnClickListener((View.OnClickListener) null);
        this.A04.A0l("text.option.selection.request.key");
    }

    public final void A00() {
        String str;
        Boolean bool = null;
        if (C18310x6.A1X(this.A02.A01)) {
            C166107y9 r3 = this.A02;
            C165977xw A012 = C154217co.A01(r3, this.A00);
            C165977xw r1 = this.A01;
            C162457s7.A0J(r3, 0);
            C166027y1 A002 = C154217co.A00(A012, r1, r3.A02);
            if (A002 != null) {
                bool = Boolean.valueOf(A002.A02);
            }
            C132226eu r0 = (C132226eu) C73723fy.A06(this.A02.A01, this.A00);
            if (r0 != null) {
                str = r0.A00;
            } else {
                str = "";
            }
            boolean A1Q = AnonymousClass0x9.A1Q(bool);
            TextView textView = this.A03;
            Context context = textView.getContext();
            if (A1Q) {
                AnonymousClass0x2.A0q(context, textView, AnonymousClass5Yj.A07(textView));
                textView.setText(str);
                return;
            }
            AnonymousClass0x2.A0q(context, textView, R.color.f5nameremoved);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            C620733j r2 = this.A08;
            if (r2.A0U()) {
                spannableStringBuilder.append(8207);
            }
            spannableStringBuilder.append(C107555bV.A02(str));
            Context A0F = C18290x4.A0F(textView);
            spannableStringBuilder.append(C107555bV.A01(r2, " • "));
            spannableStringBuilder.append(A0F.getString(R.string.f11nameremoved));
            int A0G = C175728Zm.A0G(spannableStringBuilder, str, 0, false);
            if (A0G <= 0) {
                A0G = 0;
            }
            spannableStringBuilder.setSpan(new StrikethroughSpan(), A0G, str.length() + A0G, 33);
            textView.setText(new SpannedString(spannableStringBuilder));
            return;
        }
        this.A03.setText((CharSequence) null);
    }
}
