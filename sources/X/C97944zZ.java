package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4zZ  reason: invalid class name and case insensitive filesystem */
public class C97944zZ extends C98054zk {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public FrameLayout A04;
    public WaImageView A05;
    public WaImageView A06;
    public AnonymousClass4R7 A07;
    public C90004fd A08;
    public List A09;
    public boolean A0A;
    public final C69263Wi A0B;
    public final AnonymousClass5UX A0C;
    public final C105365Uq A0D;
    public final C620733j A0E;
    public final C95894up A0F;

    public void A00() {
        if (!this.A0A) {
            this.A0A = true;
            generatedComponent();
        }
    }

    public final ThumbnailButton A04(Context context, int i) {
        ThumbnailButton thumbnailButton = new ThumbnailButton(context);
        C86624Kv.A0x(thumbnailButton, i);
        thumbnailButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        thumbnailButton.A03 = AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        thumbnailButton.A01 = (float) this.A00;
        thumbnailButton.A02 = (float) this.A02;
        thumbnailButton.A07 = false;
        AnonymousClass0YY.A06(thumbnailButton, 2);
        return thumbnailButton;
    }

    public void A05(C624134x r4, List list) {
        Runnable A022;
        this.A07.setSubText((String) null, (List) null);
        C90004fd r1 = this.A08;
        if (r1 != null) {
            this.A0F.A04(r1);
        }
        C95894up r12 = this.A0F;
        synchronized (r12) {
            A022 = r12.A02(r4, (Object) null);
        }
        C90004fd r2 = (C90004fd) A022;
        this.A08 = r2;
        r2.A04(new C124256Bo(r4, this, list, 0), this.A0B.A08);
    }

    public void setMessage(C30421mQ r7, List list) {
        C620733j r1 = this.A0E;
        FrameLayout frameLayout = this.A04;
        int i = this.A01;
        C107555bV.A06(frameLayout, r1, i, i, i, i);
        this.A0C.A06(this.A06, R.drawable.avatar_contact);
        this.A05.setVisibility(8);
        String A012 = C615731j.A01(getContext(), r7);
        if (A012 == null) {
            A012 = "";
        }
        this.A07.setTitleAndDescription(C107575bX.A0C(A012, 128), (String) null, list);
        A05(r7, list);
    }

    public C97944zZ(Context context, C69263Wi r2, AnonymousClass5UX r3, C105365Uq r4, C620733j r5, C95894up r6) {
        super(context);
        A00();
        this.A0B = r2;
        this.A0C = r3;
        this.A0E = r5;
        this.A0F = r6;
        this.A0D = r4;
        A03();
    }

    public View A01() {
        this.A07 = new AnonymousClass4R7(getContext());
        FrameLayout.LayoutParams A0q = C86664Kz.A0q();
        int A062 = C86634Kw.A06(this);
        C107555bV.A07(this.A07, this.A0E, 0, 0, A062, 0);
        this.A07.setLayoutParams(A0q);
        return this.A07;
    }

    public View A02() {
        Context context = getContext();
        this.A04 = new FrameLayout(context);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A02 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A04.setLayoutParams(C86664Kz.A0p());
        this.A06 = A04(context, dimensionPixelSize);
        ThumbnailButton A042 = A04(context, dimensionPixelSize);
        this.A05 = A042;
        ArrayList A0s = AnonymousClass001.A0s();
        this.A09 = A0s;
        A0s.add(this.A06);
        A0s.add(A042);
        this.A01 = C86634Kw.A06(this);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A03 = dimensionPixelSize2;
        C107555bV.A06(this.A05, this.A0E, dimensionPixelSize2, 0, 0, 0);
        this.A04.addView(this.A05);
        this.A04.addView(this.A06);
        return this.A04;
    }

    public void setMessage(C30411mP r7, List list) {
        int i = this.A01;
        int i2 = ((i * 2) - this.A03) / 2;
        C107555bV.A06(this.A04, this.A0E, i2, i, i2, i);
        AnonymousClass5UX r2 = this.A0C;
        r2.A06(this.A06, R.drawable.avatar_contact);
        r2.A06(this.A05, R.drawable.avatar_contact);
        this.A05.setVisibility(0);
        this.A06.setVisibility(0);
        A05(r7, list);
    }
}
