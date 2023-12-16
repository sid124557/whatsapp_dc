package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.7bK  reason: invalid class name and case insensitive filesystem */
public abstract class C153447bK {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final LinearLayoutManager A03;
    public final AnonymousClass0O5 A04;
    public final C04690Qg A05;
    public final RecyclerView A06;
    public final AnonymousClass7EB A07;
    public final ShapePickerRecyclerView A08;
    public final C125326Hj A09;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r4.A09.A02.size() <= 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r3 = r4.A06
            int r2 = r3.getVisibility()
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0015
            X.6Hj r0 = r4.A09
            java.util.List r0 = r0.A02
            int r1 = r0.size()
            r0 = 0
            if (r1 > 0) goto L_0x0017
        L_0x0015:
            r0 = 8
        L_0x0017:
            r3.setVisibility(r0)
            if (r2 == r0) goto L_0x0033
            X.7EB r1 = r4.A07
            int r0 = r3.getVisibility()
            boolean r2 = X.AnonymousClass000.A1T(r0)
            X.7km r0 = r1.A00
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView r1 = r0.A0Q
            X.107 r0 = r0.A0Z
            boolean r0 = X.C86604Kt.A1Z(r0)
            r1.A17(r0, r2)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153447bK.A00():void");
    }

    public void A01(AnonymousClass6IZ r5, boolean z) {
        View view = r5.A00;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Resources A0G = C18290x4.A0G(this.A06);
        int i = R.dimen.f6nameremoved;
        if (z) {
            i = R.dimen.f6nameremoved;
        }
        int dimensionPixelSize = A0G.getDimensionPixelSize(i);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        view.setLayoutParams(layoutParams);
    }

    public void A02(boolean z) {
        RecyclerView recyclerView = this.A06;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Resources A0G = C18290x4.A0G(recyclerView);
        int i = R.dimen.f6nameremoved;
        if (z) {
            i = R.dimen.f6nameremoved;
        }
        layoutParams.height = A0G.getDimensionPixelSize(i);
        recyclerView.setLayoutParams(layoutParams);
        for (int i2 = 0; i2 < this.A09.A02.size(); i2++) {
            AnonymousClass6IZ r0 = (AnonymousClass6IZ) recyclerView.A0F(i2);
            if (r0 != null) {
                A01(r0, z);
            }
        }
        this.A00 = z;
    }

    public C153447bK(RecyclerView recyclerView, AnonymousClass7EB r7, ShapePickerRecyclerView shapePickerRecyclerView, boolean z) {
        C188848za r1 = new C188848za(this, 4);
        this.A04 = r1;
        C125326Hj r4 = new C125326Hj(this);
        this.A09 = r4;
        r4.A0E(z);
        recyclerView.setItemAnimator((AnonymousClass0UY) null);
        this.A08 = shapePickerRecyclerView;
        this.A07 = r7;
        shapePickerRecyclerView.A0q(r1);
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        this.A03 = linearLayoutManager;
        this.A05 = new C188818zX(recyclerView.getContext(), this, 3);
        this.A06 = recyclerView;
        recyclerView.setAdapter(r4);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addOnLayoutChangeListener(new C1891690g((Object) this, 6));
    }
}
