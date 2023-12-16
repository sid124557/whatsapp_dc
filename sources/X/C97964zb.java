package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import java.util.List;
import java.util.Set;

/* renamed from: X.4zb  reason: invalid class name and case insensitive filesystem */
public class C97964zb extends C98064zl {
    public View A00;
    public C85244Fm A01;
    public WaImageView A02;
    public C620733j A03;
    public C114635nM A04;
    public C106685Zz A05;
    public AnonymousClass4R7 A06;
    public C56072rN A07;
    public boolean A08;

    public final void setPreviewClickListener(String str, Set set, C30481mW r10) {
        String str2 = str;
        Set set2 = set;
        if (set != null) {
            setOnClickListener(new C634839k(this, set2, r10, str2, 3));
        } else {
            setOnClickListener(new AnonymousClass54G(5, str, this));
        }
    }

    public void A00() {
        if (!this.A08) {
            this.A08 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A05 = C86634Kw.A0m(A002);
            this.A01 = C64333Db.A05(A002);
            this.A03 = C64333Db.A2t(A002);
            this.A07 = C64333Db.A8w(A002);
            this.A04 = (C114635nM) A002.AQW.get();
        }
    }

    public C97964zb(Context context) {
        super(context);
        A00();
        A03();
    }

    public View A01() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout.setLayoutParams(layoutParams);
        int A062 = C86634Kw.A06(this);
        C107555bV.A07(linearLayout, this.A03, A062, 0, A062, 0);
        this.A00 = C18280x3.A0D(this).inflate(R.layout.f8nameremoved, linearLayout, false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = AnonymousClass5YI.A04(getContext(), 4.0f);
        layoutParams2.bottomMargin = AnonymousClass5YI.A04(getContext(), 4.0f);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.setVisibility(8);
        this.A06 = new AnonymousClass4R7(getContext());
        this.A06.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(this.A06);
        linearLayout.addView(this.A00);
        return linearLayout;
    }

    public View A02() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A02 = new WaImageView(getContext());
        this.A02.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        return this.A02;
    }

    public void setMessage(C30481mW r12, List list) {
        String str;
        Bitmap decodeByteArray;
        boolean z = false;
        AnonymousClass5WD A002 = AnonymousClass5WD.A00(getContext(), this.A04, this.A05, r12, 0, this.A07.A01());
        AnonymousClass7LM r6 = A002.A00;
        String str2 = r6.A01;
        String str3 = A002.A04;
        if (str3 == null) {
            str3 = "";
        }
        Set set = r6.A02;
        setPreviewClickListener(str2, set, r12);
        int i = 0;
        if (set != null) {
            z = true;
        }
        byte[] A1z = r12.A1z();
        if (A1z == null || (decodeByteArray = BitmapFactory.decodeByteArray(A1z, 0, A1z.length)) == null || z) {
            C107335b8.A0C(getContext(), this.A02, R.drawable.ic_group_invite_link, R.color.f5nameremoved);
            C86664Kz.A1R(this.A02);
            this.A02.setScaleX(1.5f);
            this.A02.setScaleY(1.5f);
            C86604Kt.A0z(getContext(), this.A02, R.color.f5nameremoved);
        } else {
            this.A02.setImageBitmap(decodeByteArray);
            C86644Kx.A1A(this.A02);
        }
        if (set != null) {
            str = null;
        } else {
            str = A002.A03;
        }
        this.A06.setTitleAndDescription(str3, str, list);
        this.A06.setSubText(r6.A00, list);
        View view = this.A00;
        if (set == null) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
