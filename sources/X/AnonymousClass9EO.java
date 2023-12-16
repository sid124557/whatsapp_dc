package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: X.9EO  reason: invalid class name */
public class AnonymousClass9EO extends AnonymousClass95T {
    public final View A00;
    public final View A01;
    public final TextEmojiLabel A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final WaTextView A08;
    public final WaTextView A09;
    public final WaTextView A0A;
    public final WaTextView A0B;
    public final WaTextView A0C;
    public final WaTextView A0D;
    public final WaTextView A0E;
    public final WaTextView A0F;
    public final WaTextView A0G;
    public final WaTextView A0H;
    public final WaTextView A0I;
    public final C620633i A0J;
    public final AnonymousClass1VX A0K;
    public final C195219Wq A0L;
    public final C106715a2 A0M;

    public void A07(AnonymousClass9NY r40) {
        String str;
        String A082;
        String A0P;
        int i;
        AnonymousClass9E7 r2 = (AnonymousClass9E7) r40;
        C620733j r1 = r2.A01;
        AnonymousClass39S r3 = r2.A03;
        AnonymousClass39H r4 = r3.A07;
        AnonymousClass39G r8 = r4.A06;
        String A062 = r3.A06(r1, r8);
        String str2 = r2.A04;
        String str3 = r2.A05;
        AnonymousClass39G r7 = r4.A04;
        String A063 = r3.A06(r1, r7);
        AnonymousClass39G r15 = r4.A05;
        String A064 = r3.A06(r1, r15);
        String A0b = this.A0L.A0b(r3);
        C195319Xg r9 = r2.A02;
        if (r9 == null || (i = r9.A01) <= 1) {
            A0A(r2.A00, 8);
            this.A05.setVisibility(8);
            this.A06.setVisibility(8);
        } else {
            Context context = r2.A00;
            AnonymousClass39L r11 = r9.A02;
            if (r11 != null) {
                C162457s7.A0J(r1, 0);
                C85204Fi r12 = r11.A01;
                C162457s7.A0D(r12);
                String B3V = r12.B3V(r1, r11.A02);
                C162457s7.A0D(B3V);
                Resources resources = context.getResources();
                Object[] A0M2 = AnonymousClass002.A0M();
                C18280x3.A19(String.valueOf(i), B3V, A0M2);
                A0B(this.A07, this.A08, r1, (String) null, resources.getString(R.string.f11nameremoved, A0M2), R.string.f11nameremoved);
            }
            AnonymousClass39L r112 = r9.A03;
            if (r112 == null || r112.A00() <= 0) {
                this.A05.setVisibility(8);
                this.A06.setVisibility(8);
            } else {
                C162457s7.A0J(r1, 0);
                C85204Fi r10 = r112.A01;
                C162457s7.A0D(r10);
                String B3V2 = r10.B3V(r1, r112.A02);
                C162457s7.A0D(B3V2);
                WaTextView waTextView = this.A05;
                WaTextView waTextView2 = this.A06;
                A0B(waTextView, waTextView2, r1, (String) null, B3V2, R.string.f11nameremoved);
                waTextView.setVisibility(0);
                waTextView2.setVisibility(0);
            }
            A0A(context, 0);
        }
        String str4 = null;
        if (r8 == null) {
            str = null;
        } else {
            str = r8.A02;
        }
        if (r7 != null) {
            str4 = r7.A02;
        }
        if (!TextUtils.isEmpty(A062) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(A063) || !TextUtils.isEmpty(str3)) {
            A09(0);
            A0B(this.A0D, this.A0E, r1, (String) null, A064, R.string.f11nameremoved);
            A0B(this.A0F, this.A0G, r1, str, A062, R.string.f11nameremoved);
            WaTextView waTextView3 = this.A03;
            WaTextView waTextView4 = this.A04;
            AnonymousClass39G r102 = r4.A03;
            if (TextUtils.isEmpty(str2) || r102 == null) {
                C86624Kv.A12(waTextView3, waTextView4);
            } else {
                String str5 = r102.A02;
                if (TextUtils.isEmpty(str5)) {
                    C626936e.A06(r102);
                    AnonymousClass39L A032 = r3.A03(r102);
                    BigDecimal multiply = A032.A02.A00.multiply(new BigDecimal(A032.A00));
                    C626936e.A06(r15);
                    BigDecimal stripTrailingZeros = multiply.divide(r3.A03(r15).A02.A00, RoundingMode.HALF_UP).stripTrailingZeros();
                    C85204Fi r32 = r3.A06;
                    if (r32 != null) {
                        AnonymousClass3H6 r33 = (AnonymousClass3H6) r32;
                        A0P = AnonymousClass359.A02(r1, r33.A04, r33.A05, stripTrailingZeros, false);
                    } else {
                        A0P = AnonymousClass000.A0P(stripTrailingZeros, "", AnonymousClass001.A0o());
                    }
                    A082 = AnonymousClass0x2.A0X(waTextView3.getContext(), A0P, 1, R.string.f11nameremoved);
                } else {
                    A082 = A08(r1, str5, R.string.f11nameremoved);
                }
                waTextView3.setText(A082);
                waTextView3.setVisibility(0);
                waTextView4.setText(str2);
                waTextView4.setVisibility(0);
                int i2 = 5;
                int i3 = 3;
                if (r1.A0U()) {
                    i3 = 5;
                }
                waTextView3.setGravity(i3);
                if (r1.A0U()) {
                    i2 = 3;
                }
                waTextView4.setGravity(i2);
            }
            A0B(this.A09, this.A0A, r1, (String) null, str3, R.string.f11nameremoved);
            A0B(this.A0B, this.A0C, r1, str4, A063, R.string.f11nameremoved);
        } else {
            A09(8);
        }
        WaTextView waTextView5 = this.A0H;
        waTextView5.setText(A0b);
        boolean z = r2.A06;
        WaTextView waTextView6 = this.A0I;
        int A083 = AnonymousClass001.A08(z ? 1 : 0);
        waTextView6.setVisibility(A083);
        waTextView5.setVisibility(A083);
        this.A00.setVisibility(A083);
    }

    public final String A08(C620733j r6, String str, int i) {
        String string = this.A0H.getContext().getString(i);
        if (TextUtils.isEmpty(str)) {
            return string;
        }
        boolean A0T = r6.A0T();
        StringBuilder A0o = AnonymousClass001.A0o();
        if (A0T) {
            C18260x0.A0p(string, " (", str, ") ", A0o);
        } else {
            C18260x0.A0p(" (", str, ") ", string, A0o);
        }
        return A0o.toString();
    }

    public final void A09(int i) {
        this.A01.setVisibility(i);
        WaTextView waTextView = this.A0D;
        waTextView.setVisibility(i);
        waTextView.setVisibility(i);
        this.A0F.setVisibility(i);
        this.A0G.setVisibility(i);
        this.A03.setVisibility(i);
        this.A04.setVisibility(i);
        this.A0B.setVisibility(i);
        this.A0C.setVisibility(i);
        this.A09.setVisibility(i);
        this.A0A.setVisibility(i);
    }

    public final void A0A(Context context, int i) {
        this.A07.setVisibility(i);
        this.A08.setVisibility(i);
        TextEmojiLabel textEmojiLabel = this.A02;
        textEmojiLabel.setVisibility(i);
        AnonymousClass0x2.A12(textEmojiLabel, this.A0J);
        AnonymousClass1VX r4 = this.A0K;
        AnonymousClass0x2.A14(r4, textEmojiLabel);
        String[] strArr = {r4.A0Q(4144)};
        textEmojiLabel.setText(this.A0M.A04(textEmojiLabel.getContext(), context.getResources().getString(R.string.f11nameremoved), new Runnable[]{new C198399er(), new C198409es(), new C198419et()}, new String[]{"installment-learn-more"}, strArr));
    }

    public AnonymousClass9EO(View view, C620633i r3, AnonymousClass1VX r4, C195219Wq r5, C106715a2 r6) {
        super(view);
        this.A0K = r4;
        this.A0M = r6;
        this.A0L = r5;
        this.A0J = r3;
        this.A0D = AnonymousClass0x7.A0L(view, R.id.subtotal_key);
        this.A0E = AnonymousClass0x7.A0L(view, R.id.subtotal_amount);
        this.A0F = AnonymousClass0x7.A0L(view, R.id.taxes_key);
        this.A0G = AnonymousClass0x7.A0L(view, R.id.taxes_amount);
        this.A03 = AnonymousClass0x7.A0L(view, R.id.discount_key);
        this.A04 = AnonymousClass0x7.A0L(view, R.id.discount_amount);
        this.A09 = AnonymousClass0x7.A0L(view, R.id.offer_key);
        this.A0A = AnonymousClass0x7.A0L(view, R.id.offer_amount);
        this.A0B = AnonymousClass0x7.A0L(view, R.id.shipping_key);
        this.A0C = AnonymousClass0x7.A0L(view, R.id.shipping_amount);
        this.A0I = AnonymousClass0x7.A0L(view, R.id.total_charge_key);
        this.A0H = AnonymousClass0x7.A0L(view, R.id.total_charge_amount);
        this.A01 = C06560Yg.A02(view, R.id.dashed_underline2);
        this.A00 = C06560Yg.A02(view, R.id.dashed_underline3);
        this.A07 = AnonymousClass0x7.A0L(view, R.id.installment_key);
        this.A08 = AnonymousClass0x7.A0L(view, R.id.installment_amount);
        this.A05 = AnonymousClass0x7.A0L(view, R.id.fees_key);
        this.A06 = AnonymousClass0x7.A0L(view, R.id.fees_amount);
        this.A02 = AnonymousClass0x7.A0K(view, R.id.installment_disclaimer);
    }

    public final void A0B(WaTextView waTextView, WaTextView waTextView2, C620733j r6, String str, String str2, int i) {
        if (TextUtils.isEmpty(str2)) {
            C86624Kv.A12(waTextView, waTextView2);
            return;
        }
        waTextView.setText(A08(r6, str, i));
        waTextView.setVisibility(0);
        waTextView2.setText(str2);
        waTextView2.setVisibility(0);
        int i2 = 5;
        int i3 = 3;
        if (r6.A0U()) {
            i3 = 5;
        }
        waTextView.setGravity(i3);
        if (r6.A0U()) {
            i2 = 3;
        }
        waTextView2.setGravity(i2);
    }
}
