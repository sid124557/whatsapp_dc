package X;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.97C  reason: invalid class name */
public class AnonymousClass97C extends AnonymousClass4Rn implements C202789ma {
    public int A00;
    public Handler A01;
    public View A02;
    public TextView A03;
    public ConstraintLayout A04;
    public RecyclerView A05;
    public ShimmerFrameLayout A06;
    public AnonymousClass39R A07;
    public AnonymousClass959 A08;
    public WDSButton A09;
    public final ImageView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final AnonymousClass6Z3 A0E;
    public final AnonymousClass9RV A0F;
    public final C194589Tn A0G;
    public final PaymentAmountInputField A0H;
    public final C196409an A0I;
    public final AnonymousClass9QF A0J;
    public final List A0K = AnonymousClass001.A0s();

    public AnonymousClass97C(Activity activity, ImageView imageView, TextView textView, TextView textView2, TextView textView3, AnonymousClass6Z3 r14, C55682qk r15, C181568my r16, C620633i r17, AnonymousClass33p r18, AnonymousClass9RV r19, C194589Tn r20, PaymentAmountInputField paymentAmountInputField, C196409an r22, AnonymousClass9QF r23, C105895Wv r24) {
        super(activity, r15, r16, r17, r18, r24);
        this.A0G = r20;
        this.A0F = r19;
        this.A0E = r14;
        this.A0I = r22;
        this.A0H = paymentAmountInputField;
        this.A0B = textView;
        this.A0C = textView2;
        this.A0J = r23;
        this.A0D = textView3;
        this.A0A = imageView;
    }

    public static /* synthetic */ void A02(AnonymousClass97C r2) {
        r2.A06.setVisibility(8);
        r2.A05.setVisibility(8);
        r2.A03.setText(R.string.f11nameremoved);
        r2.A04.setVisibility(0);
        C204249p3.A02(r2.A09, r2, 121);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        if (java.lang.System.currentTimeMillis() < X.AnonymousClass0x2.A0A(X.AnonymousClass0x2.A0F(r8), "payment_backgrounds_backoff_timestamp")) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(boolean r11) {
        /*
            r10 = this;
            androidx.constraintlayout.widget.ConstraintLayout r1 = r10.A04
            r0 = 8
            r1.setVisibility(r0)
            com.facebook.shimmer.ShimmerFrameLayout r1 = r10.A06
            r0 = 0
            r1.setVisibility(r0)
            android.widget.TextView r1 = r10.A03
            r0 = 2131890535(0x7f121167, float:1.9415765E38)
            r1.setText(r0)
            X.9Tn r4 = r10.A0G
            X.9cS r3 = new X.9cS
            r3.<init>(r10)
            X.2vO r7 = r4.A0B
            if (r11 != 0) goto L_0x0057
            X.33p r8 = r7.A01
            java.lang.String r9 = "payment_backgrounds_last_fetch_timestamp"
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r8)
            long r5 = X.AnonymousClass0x2.A0A(r0, r9)
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0057
            long r0 = X.C58522vO.A02
            boolean r0 = r8.A2P(r9, r0)
            if (r0 == 0) goto L_0x004c
            java.lang.String r1 = "payment_backgrounds_backoff_timestamp"
            long r5 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r8)
            long r1 = X.AnonymousClass0x2.A0A(r0, r1)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
        L_0x004c:
            X.4FS r1 = r4.A0D
            X.9hl r0 = new X.9hl
            r0.<init>(r4, r3)
            r1.BkM(r0)
            return
        L_0x0057:
            X.1ip r0 = r7.A00
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x004c
            X.33p r9 = r7.A01
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r9)
            java.lang.String r8 = "payment_background_backoff_attempt"
            int r0 = X.C18280x3.A02(r0, r8)
            int r7 = r0 + 1
            r5 = 720(0x2d0, double:3.557E-321)
            r0 = 1
            X.2pM r2 = new X.2pM
            r2.<init>(r0, r5)
            long r0 = (long) r7
            r2.A03(r0)
            long r1 = r2.A01()
            r5 = 60000(0xea60, double:2.9644E-319)
            long r1 = r1 * r5
            long r5 = java.lang.System.currentTimeMillis()
            long r1 = r1 + r5
            android.content.SharedPreferences$Editor r0 = r9.A0U()
            X.C18270x1.A0h(r0, r8, r7)
            java.lang.String r0 = "payment_backgrounds_backoff_timestamp"
            r9.A1f(r0, r1)
            X.9S1 r2 = r4.A09
            r0 = 0
            X.9of r1 = new X.9of
            r1.<init>(r3, r0, r4)
            r0 = 0
            r2.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass97C.A0B(boolean):void");
    }

    public void Be0(AnonymousClass39R r12) {
        this.A07 = r12;
        ImageView imageView = this.A0A;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        AnonymousClass39R r2 = this.A07;
        if (r2 != null) {
            layoutParams.height = (int) (((float) layoutParams.width) / (((float) r2.A0D) / ((float) r2.A09)));
            String str = r2.A01;
            if (!TextUtils.isEmpty(str)) {
                imageView.setContentDescription(str);
            }
            this.A0F.A00(imageView, this.A07, layoutParams.width, layoutParams.height);
            PaymentAmountInputField paymentAmountInputField = this.A0H;
            paymentAmountInputField.setTextColor(this.A07.A0C);
            int i = this.A07.A0C;
            paymentAmountInputField.setHintTextColor(Color.argb((int) (((float) Color.alpha(i)) * 0.3f), (int) ((float) Color.red(i)), (int) ((float) Color.green(i)), (int) ((float) Color.blue(i))));
            this.A0B.setTextColor(this.A07.A0C);
            this.A0C.setTextColor(this.A07.A0C);
            TextView textView = this.A0D;
            textView.setTextColor(this.A07.A0B);
            textView.setBackgroundColor(this.A07.A0A);
        } else {
            imageView.setImageResource(R.drawable.payment_default_background);
            PaymentAmountInputField paymentAmountInputField2 = this.A0H;
            AnonymousClass9QF r10 = this.A0J;
            AnonymousClass0Y9.A06(paymentAmountInputField2, r10.A00);
            TextView textView2 = this.A0B;
            Pair pair = r10.A02;
            AnonymousClass0Y9.A06(textView2, C18280x3.A03(pair));
            TextView textView3 = this.A0C;
            int[] iArr = (int[]) pair.second;
            textView3.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
            Pair pair2 = r10.A01;
            AnonymousClass0Y9.A06(textView3, C18280x3.A03(pair2));
            int[] iArr2 = (int[]) pair2.second;
            textView3.setPadding(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
            TextView textView4 = this.A0D;
            Activity activity = this.A03;
            C18320x8.A11(activity.getResources(), textView4, AnonymousClass5Yj.A02(activity, R.attr.f3nameremoved, R.color.f5nameremoved));
            textView4.setBackgroundColor(0);
        }
        imageView.setTag(R.id.selected_expressive_background_theme, this.A07);
    }

    public void dismiss() {
        this.A0E.A05(true);
        C196409an r2 = this.A0I;
        r2.A03.setVisibility(0);
        View view = r2.A02;
        if (view != null) {
            view.setVisibility(0);
        }
        super.dismiss();
    }

    public void A09() {
        if (!isShowing()) {
            super.A09();
            C196409an r1 = this.A0I;
            if (C105895Wv.A00(r1.A0B)) {
                C181568my r7 = this.A05;
                KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r7;
                keyboardPopupLayout.A07 = true;
                InputMethodManager A0Q = this.A06.A0Q();
                C626936e.A06(A0Q);
                if (!A0Q.hideSoftInputFromWindow(r1.A0B.getWindowToken(), 0, new C86894Mg(AnonymousClass000.A0A(), new C199549gl(this), this.A0A))) {
                    keyboardPopupLayout.A07 = false;
                    ((View) r7).requestLayout();
                    return;
                }
                return;
            }
            A0A();
        }
    }

    public final void A0A() {
        A04();
        if (this.A02 == null) {
            Activity activity = this.A03;
            LinearLayout linearLayout = new LinearLayout(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.f8nameremoved, linearLayout, true);
            this.A02 = inflate;
            C204249p3.A02(C06560Yg.A02(inflate, R.id.close_button), this, 122);
            this.A03 = C18300x5.A0G(this.A02, R.id.themes_title);
            this.A05 = (RecyclerView) C06560Yg.A02(this.A02, R.id.expressive_themes_list);
            AnonymousClass959 r1 = new AnonymousClass959(this.A0F, this.A0G, this);
            this.A08 = r1;
            this.A05.setAdapter(r1);
            this.A06 = (ShimmerFrameLayout) C06560Yg.A02(this.A02, R.id.expressive_bg_loading_shimmer);
            ConstraintLayout constraintLayout = (ConstraintLayout) C06560Yg.A02(this.A02, R.id.backgrounds_download_error_layout);
            this.A04 = constraintLayout;
            this.A09 = C86654Ky.A0f(constraintLayout, R.id.retry_backgrounds_download);
            setContentView(linearLayout);
            setTouchable(true);
            setOutsideTouchable(true);
            setInputMethodMode(2);
            setAnimationStyle(0);
            setBackgroundDrawable(new ColorDrawable(activity.getResources().getColor(AnonymousClass5Yj.A01(activity))));
            this.A02.measure(View.MeasureSpec.makeMeasureSpec(C86664Kz.A0f(activity).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.A00 = this.A02.getMeasuredHeight();
            this.A01 = new Handler();
            setTouchInterceptor(new AnonymousClass9Y0());
        }
        setHeight(this.A00);
        setWidth(-1);
        C181568my r5 = this.A05;
        r5.setKeyboardPopup(this);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r5;
        if (keyboardPopupLayout.A07) {
            View view = (View) r5;
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C204929q9(this, 1));
            keyboardPopupLayout.A07 = false;
            view.requestLayout();
        } else if (!isShowing()) {
            showAtLocation((View) r5, 48, 0, 1000000);
            C196409an r2 = this.A0I;
            r2.A03.setVisibility(8);
            View view2 = r2.A02;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        this.A0E.A04(true);
        A0B(false);
    }

    public int A08(int i) {
        return this.A00;
    }
}
