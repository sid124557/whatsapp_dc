package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4Wu  reason: invalid class name and case insensitive filesystem */
public class C87964Wu extends AnonymousClass0R6 {
    public boolean A00 = false;
    public Bitmap[] A01;
    public boolean[] A02;
    public boolean[] A03;
    public final float A04;
    public final float A05;
    public final Context A06;
    public final Drawable A07;
    public final C133846i2 A08;
    public final AnonymousClass5Y7 A09;

    public void A0K(int i) {
        this.A00 = true;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.A02;
            if (i2 < zArr.length) {
                if (!zArr[i2]) {
                    A06(i2);
                }
                i2++;
            } else {
                this.A08.A0G(new AnonymousClass8GQ(this), i);
                return;
            }
        }
    }

    public int A0G() {
        return C106315Ym.A00.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r25, int i) {
        float f;
        AnonymousClass55G r14;
        AnonymousClass4Z9 r8 = (AnonymousClass4Z9) r25;
        AnonymousClass5Y7 r7 = this.A09;
        int i2 = i;
        boolean booleanValue = Boolean.valueOf(AnonymousClass000.A1U(i2, r7.A01)).booleanValue();
        float f2 = 1.0f;
        if (booleanValue) {
            f = this.A05;
            f2 = this.A04;
        } else {
            f = 1.0f;
        }
        r8.A04.A06(booleanValue, false);
        View view = r8.A00;
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setPivotX(((float) r7.A0H) / 2.0f);
        view.setPivotY((float) r7.A0G);
        TextView textView = r8.A03;
        textView.setText(C106315Ym.A00(i2).A01);
        ImageView imageView = r8.A02;
        imageView.setBackground(this.A07);
        imageView.setImageDrawable((Drawable) null);
        View view2 = r8.A01;
        view2.setOnClickListener(r8);
        if (r7.A02 != null) {
            if (i == 0) {
                r14 = new AnonymousClass55G(this.A06, this.A08, r7, r8, this, this.A01, this.A03, this.A02, 0);
            } else {
                boolean[] zArr = this.A02;
                if (zArr[i - 1]) {
                    Context context = this.A06;
                    Bitmap[] bitmapArr = this.A01;
                    boolean[] zArr2 = this.A03;
                    r14 = new AnonymousClass55G(context, this.A08, r7, r8, this, bitmapArr, zArr2, zArr, i2);
                } else if (this.A00) {
                    textView.setText(R.string.f11nameremoved);
                    C86604Kt.A0z(this.A06, imageView, R.color.f5nameremoved);
                    view2.setOnClickListener((View.OnClickListener) null);
                    imageView.setClickable(false);
                    return;
                } else {
                    textView.setText(R.string.f11nameremoved);
                    imageView.setClickable(true);
                    C18290x4.A1F(view2, this, 45);
                    return;
                }
            }
            r14.A02.executeOnExecutor(r7.A0W, new Void[0]);
        }
    }

    public C87964Wu(Context context, C133846i2 r5, AnonymousClass5Y7 r6) {
        this.A06 = context;
        this.A08 = r5;
        this.A09 = r6;
        this.A04 = context.getResources().getDimension(R.dimen.f6nameremoved) / ((float) r6.A0G);
        this.A05 = context.getResources().getDimension(R.dimen.f6nameremoved) / ((float) r6.A0H);
        this.A07 = new ColorDrawable(AnonymousClass0Y8.A04(context, R.color.f5nameremoved));
        int A032 = AnonymousClass002.A03(C106315Ym.A00);
        this.A01 = new Bitmap[A032];
        this.A03 = new boolean[A032];
        this.A02 = new boolean[A032];
        A0K(0);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass4Z9(AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this);
    }
}
