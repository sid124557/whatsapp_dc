package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4w2  reason: invalid class name and case insensitive filesystem */
public final class C96234w2 extends AnonymousClass4W2 {
    public final AnonymousClass5EL A00;
    public final AnonymousClass1VX A01;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        AnonymousClass5EL r4 = this.A00;
        View inflate = C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
        C162457s7.A0H(inflate);
        C162457s7.A0J(inflate, 1);
        Resources resources = viewGroup.getResources();
        if (resources.getConfiguration().orientation == 1) {
            int A012 = C1222663s.A01(((float) (resources.getDisplayMetrics().widthPixels - (AnonymousClass0YH.A03(viewGroup) + AnonymousClass0YH.A02(viewGroup)))) / 4.4f);
            if (resources.getDimensionPixelSize(R.dimen.f6nameremoved) > A012) {
                int floor = (int) Math.floor(((double) A012) / 1.5d);
                int dimensionPixelSize = floor - (resources.getDimensionPixelSize(R.dimen.f6nameremoved) * 2);
                View A02 = C06560Yg.A02(inflate, R.id.profile_icon_layout);
                A02.getLayoutParams().width = floor;
                C86624Kv.A0w(A02, floor);
                View A022 = C06560Yg.A02(inflate, R.id.profile_icon);
                A022.getLayoutParams().width = dimensionPixelSize;
                C86624Kv.A0w(A022, dimensionPixelSize);
            }
            inflate.getLayoutParams().width = A012;
        }
        AnonymousClass0x9.A0E(inflate, R.id.profile_icon_badge).setImageResource(AnonymousClass29N.A00(this.A01));
        return new C96654wi(inflate, (AnonymousClass2HH) r4.A00.A03.A00.A66.get());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96234w2(AnonymousClass5EL r2, AnonymousClass1VX r3) {
        super(C86624Kv.A0E(6));
        C18260x0.A0Q(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
    }
}
