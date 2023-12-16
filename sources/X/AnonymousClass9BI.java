package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9BI  reason: invalid class name */
public class AnonymousClass9BI extends AnonymousClass9TV {
    public View A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ImageView A03;
    public ImageView A04;
    public WaTextView A05;
    public WaTextView A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C69263Wi A0A;
    public final C620733j A0B;
    public final C158777kX A0C;
    public final C109665ez A0D = new C203969ob(this, 7);
    public final C109665ez A0E = new C203969ob(this, 6);
    public final AnonymousClass4FS A0F;

    public static /* synthetic */ void A00(C166587yw r8, AnonymousClass9BI r9, String str) {
        AnonymousClass9C3 r7 = r9.A04;
        C158777kX r5 = r9.A0C;
        C166587yw r0 = r7.A08;
        C162457s7.A0J(r0, 0);
        String A0F2 = AnonymousClass002.A0F(r7, r5.A02(r0, true), new Object[1], 0, R.string.f11nameremoved);
        C19340zH A002 = AnonymousClass5V0.A00(r7);
        A002.A0h(A0F2);
        if (r8 != null) {
            A002.A0Q(AnonymousClass002.A0F(r7, r5.A02(r8, true), new Object[1], 0, R.string.f11nameremoved));
        }
        A002.setPositiveButton(R.string.f11nameremoved, new C204399pI(0, str, r9));
        A002.setNegativeButton(R.string.f11nameremoved, new C204359pE(2));
        C18280x3.A0q(A002);
    }

    public void A01() {
        View view = this.A04.A00;
        ViewStub viewStub = (ViewStub) C06560Yg.A02(view, R.id.default_payment_method_stub);
        viewStub.setLayoutResource(R.layout.f8nameremoved);
        View inflate = viewStub.inflate();
        this.A00 = inflate;
        this.A02 = C86644Kx.A0I(inflate, R.id.p2p_method_container);
        this.A01 = C86644Kx.A0I(this.A00, R.id.p2m_method_container);
        this.A06 = AnonymousClass0x7.A0L(this.A00, R.id.p2p_default_message);
        this.A04 = AnonymousClass0x9.A0E(this.A00, R.id.p2p_default_icon);
        this.A05 = AnonymousClass0x7.A0L(this.A00, R.id.p2m_default_message);
        this.A03 = AnonymousClass0x9.A0E(this.A00, R.id.p2m_default_icon);
        ImageView A0E2 = AnonymousClass0x9.A0E(view, R.id.p2p_default_icon);
        int i = this.A03;
        C107335b8.A0E(A0E2, i);
        C107335b8.A0E(AnonymousClass0x9.A0E(view, R.id.p2m_default_icon), i);
    }

    public void A02(C166587yw r5, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        C133786hw r3;
        boolean A1U = AnonymousClass000.A1U(r5.A01, 2);
        WaTextView waTextView = this.A06;
        int i5 = R.string.f11nameremoved;
        if (A1U) {
            i5 = R.string.f11nameremoved;
        }
        waTextView.setText(i5);
        WaTextView waTextView2 = this.A06;
        if (A1U) {
            i = this.A09;
        } else {
            i = this.A08;
        }
        waTextView2.setTextColor(i);
        ImageView imageView = this.A04;
        int i6 = R.drawable.ic_group;
        if (A1U) {
            i6 = R.drawable.vec_ic_check_circle_24dp;
        }
        imageView.setImageResource(i6);
        if (A1U) {
            i2 = this.A07;
        } else {
            i2 = this.A03;
        }
        C107335b8.A0E(imageView, i2);
        ViewGroup viewGroup = this.A02;
        C109665ez r0 = this.A0E;
        if (A1U) {
            viewGroup.setOnClickListener((View.OnClickListener) null);
            viewGroup.setBackground((Drawable) null);
        } else {
            viewGroup.setOnClickListener(r0);
            C107235av.A02(viewGroup);
        }
        boolean A1U2 = AnonymousClass000.A1U(r5.A03, 2);
        WaTextView waTextView3 = this.A05;
        int i7 = R.string.f11nameremoved;
        if (A1U2) {
            i7 = R.string.f11nameremoved;
        }
        waTextView3.setText(i7);
        WaTextView waTextView4 = this.A05;
        if (A1U2) {
            i3 = this.A09;
        } else {
            i3 = this.A08;
        }
        waTextView4.setTextColor(i3);
        ImageView imageView2 = this.A03;
        int i8 = R.drawable.ic_shopping_cart;
        if (A1U2) {
            i8 = R.drawable.vec_ic_check_circle_24dp;
        }
        imageView2.setImageResource(i8);
        if (A1U2) {
            i4 = this.A07;
        } else {
            i4 = this.A03;
        }
        C107335b8.A0E(imageView2, i4);
        ViewGroup viewGroup2 = this.A01;
        C109665ez r02 = this.A0D;
        if (A1U2) {
            viewGroup2.setOnClickListener((View.OnClickListener) null);
            viewGroup2.setBackground((Drawable) null);
        } else {
            viewGroup2.setOnClickListener(r02);
            C107235av.A02(viewGroup2);
        }
        if (C195169Wk.A08(r5) && (r3 = (C133786hw) r5.A08) != null) {
            int i9 = 0;
            this.A02.setVisibility(AnonymousClass001.A08(r3.A0X ? 1 : 0));
            ViewGroup viewGroup3 = this.A01;
            if (!r3.A0T) {
                i9 = 8;
            }
            viewGroup3.setVisibility(i9);
        }
    }

    public AnonymousClass9BI(C69263Wi r3, C620733j r4, AnonymousClass9C3 r5, C158777kX r6, AnonymousClass4FS r7) {
        super(r5);
        this.A0A = r3;
        this.A0F = r7;
        this.A0B = r4;
        this.A0C = r6;
        this.A08 = AnonymousClass0Y8.A04(r5, AnonymousClass5Yj.A02(r5, R.attr.f3nameremoved, R.color.f5nameremoved));
        this.A09 = AnonymousClass0Y8.A04(r5, R.color.f5nameremoved);
        this.A07 = AnonymousClass0Y8.A04(r5, AnonymousClass5Yj.A02(r5, R.attr.f3nameremoved, R.color.f5nameremoved));
    }

    public void A03(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C166587yw A0C2 = C1899693i.A0C(it);
            if (A0C2.A0A.equals(this.A04.A08.A0A)) {
                A02(A0C2, false);
                return;
            }
        }
    }
}
