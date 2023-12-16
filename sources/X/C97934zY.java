package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import java.util.List;

/* renamed from: X.4zY  reason: invalid class name and case insensitive filesystem */
public class C97934zY extends C98054zk {
    public WaImageView A00;
    public AnonymousClass4R7 A01;
    public boolean A02;
    public final C620733j A03;

    public void A00() {
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public C97934zY(Context context, C620733j r2) {
        super(context);
        A00();
        this.A03 = r2;
        A03();
    }

    public View A01() {
        this.A01 = new AnonymousClass4R7(getContext());
        FrameLayout.LayoutParams A0q = C86664Kz.A0q();
        int A06 = C86634Kw.A06(this);
        C107555bV.A07(this.A01, this.A03, 0, 0, A06, 0);
        this.A01.setLayoutParams(A0q);
        return this.A01;
    }

    public View A02() {
        this.A00 = new WaImageView(getContext());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int A06 = C86634Kw.A06(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.setMargins(A06, A06, A06, A06);
        this.A00.setLayoutParams(layoutParams);
        this.A00.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return this.A00;
    }

    public void setMessage(AnonymousClass1nF r11, List list) {
        String string;
        if (!TextUtils.isEmpty(r11.A1x())) {
            string = r11.A1x();
        } else {
            string = getContext().getString(R.string.f11nameremoved);
        }
        C620733j r2 = this.A03;
        String A032 = AnonymousClass35V.A03(r2, r11.A00);
        String A012 = C106695a0.A01(r11);
        this.A01.setTitleAndDescription(string, (String) null, list);
        boolean A04 = C620733j.A04(r2);
        AnonymousClass4R7 r3 = this.A01;
        Context context = getContext();
        Object[] objArr = new Object[2];
        if (A04) {
            objArr[0] = A032;
            r3.setSubText(AnonymousClass002.A0F(context, A012, objArr, 1, R.string.f11nameremoved), (List) null);
        } else {
            objArr[0] = A012;
            r3.setSubText(AnonymousClass002.A0F(context, A032, objArr, 1, R.string.f11nameremoved), (List) null);
        }
        this.A00.setImageDrawable(AnonymousClass5VP.A00(getContext(), r11));
    }
}
