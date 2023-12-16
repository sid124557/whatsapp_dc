package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.9ai  reason: invalid class name and case insensitive filesystem */
public class C196359ai implements C185418tc {
    public ImageView A00;
    public ImageView A01;
    public TextView A02;
    public final C620733j A03;
    public final AnonymousClass1VX A04;
    public final C194589Tn A05;
    public final C150457Qu A06;

    public /* bridge */ /* synthetic */ void Axq(Object obj) {
        ImageView imageView;
        AnonymousClass39R A052;
        AnonymousClass1S4 r0;
        C195319Xg A0D;
        int i;
        AnonymousClass39L r1;
        C624034w r11 = (C624034w) obj;
        this.A02.setVisibility(8);
        if (r11 != null && r11.A08 != null) {
            AnonymousClass1VX r7 = this.A04;
            if (!r7.A0X(4443) || (r0 = r11.A0A) == null || (A0D = r0.A0D()) == null || (i = A0D.A01) <= 1 || (r1 = A0D.A02) == null) {
                TextView textView = this.A02;
                textView.setText(AnonymousClass9UO.A00(textView.getContext(), this.A03, r11.A03(), r11.A08));
            } else {
                SpannableStringBuilder A002 = AnonymousClass9UO.A00(this.A02.getContext(), this.A03, r11.A03(), r1.A02);
                Context context = this.A02.getContext();
                Object[] A0M = AnonymousClass002.A0M();
                A0M[0] = String.valueOf(i);
                this.A02.setText(AnonymousClass002.A0F(context, A002, A0M, 1, R.string.f11nameremoved));
            }
            this.A02.setVisibility(0);
            TextView textView2 = this.A02;
            C18320x8.A11(textView2.getResources(), textView2, AnonymousClass5Yj.A02(this.A02.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
            this.A02.setAlpha(1.0f);
            boolean A003 = this.A06.A00(r11);
            TextView textView3 = this.A02;
            if (A003) {
                C192719Lh.A00(textView3);
            } else {
                textView3.setPaintFlags(textView3.getPaintFlags() & -17);
            }
            if ((r7.A0X(605) || r7.A0X(629)) && (A052 = r11.A05()) != null) {
                this.A00.setImageDrawable((Drawable) null);
                this.A02.setTextColor(A052.A0C);
                if (A003) {
                    this.A02.setAlpha(0.54f);
                }
                this.A00.setBackgroundColor(A052.A0A);
                ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
                String str = A052.A01;
                if (!TextUtils.isEmpty(str)) {
                    this.A00.setContentDescription(str);
                }
                C194589Tn r4 = this.A05;
                ImageView imageView2 = this.A00;
                int i2 = layoutParams.width;
                int i3 = layoutParams.height;
                if (C194589Tn.A00(r4.A00, A052)) {
                    r4.A08.A00(imageView2, A052, i2, i3);
                } else {
                    C18270x1.A0l(r4.A02.A0U(), "payment_background_batch_require_fetch", true);
                }
                this.A00.setVisibility(0);
                imageView = this.A01;
            } else {
                this.A01.setVisibility(0);
                imageView = this.A00;
            }
            imageView.setVisibility(8);
        }
    }

    public C196359ai(C620733j r1, AnonymousClass1VX r2, C194589Tn r3, C150457Qu r4) {
        this.A04 = r2;
        this.A03 = r1;
        this.A05 = r3;
        this.A06 = r4;
    }

    public void BfU(View view) {
        this.A02 = C18300x5.A0G(view, R.id.amount_container);
        this.A01 = AnonymousClass0x9.A0E(view, R.id.conversation_row_payment_pattern);
        this.A00 = AnonymousClass0x9.A0E(view, R.id.conversation_row_expressive_payment_background);
    }

    public int B94() {
        return R.layout.f8nameremoved;
    }

    public /* synthetic */ void BFl(ViewStub viewStub) {
        AnonymousClass9LS.A00(viewStub, this);
    }
}
