package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CarouselScrollbarView;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.mentions.MentionPickerView;

/* renamed from: X.8za  reason: invalid class name and case insensitive filesystem */
public class C188848za extends AnonymousClass0O5 {
    public Object A00;
    public final int A01;

    public C188848za(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        r1 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r5.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0084;
                case 1: goto L_0x008c;
                case 2: goto L_0x00a5;
                case 3: goto L_0x00ad;
                case 4: goto L_0x0009;
                case 5: goto L_0x0005;
                case 6: goto L_0x00b5;
                case 7: goto L_0x00bd;
                case 8: goto L_0x0019;
                case 9: goto L_0x002b;
                case 10: goto L_0x0046;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A04(r6, r7, r8)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r1 = r5.A00
            X.7bK r1 = (X.C153447bK) r1
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0008
            if (r8 == 0) goto L_0x0008
            X.6Hj r0 = r1.A09
            r0.A0K()
            return
        L_0x0019:
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            if (r8 == 0) goto L_0x0008
            java.lang.Object r0 = r5.A00
            com.whatsapp.picker.search.StickerSearchDialogFragment r0 = (com.whatsapp.picker.search.StickerSearchDialogFragment) r0
            com.whatsapp.WaEditText r0 = r0.A05
            if (r0 == 0) goto L_0x0008
            r0.A05()
            return
        L_0x002b:
            if (r8 == 0) goto L_0x0008
            java.lang.Object r1 = r5.A00
            com.whatsapp.scroller.RecyclerFastScroller r1 = (com.whatsapp.scroller.RecyclerFastScroller) r1
            r1.A02()
            X.8pK r0 = r1.A08
            if (r0 == 0) goto L_0x0008
            android.view.View r0 = r1.A02
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0008
            X.8pK r0 = r1.A08
            r0.Brc()
            return
        L_0x0046:
            java.lang.Object r4 = r5.A00
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r4 = (com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment) r4
            androidx.recyclerview.widget.LinearLayoutManager r0 = r4.A03
            int r2 = r0.A1G()
            android.view.View r0 = r4.A01
            int r1 = r0.getTop()
            if (r2 != 0) goto L_0x0071
            android.view.View r0 = r4.A01
            int r0 = r0.getHeight()
            if (r1 == r0) goto L_0x0008
            android.view.View r3 = r4.A01
            int r2 = r3.getHeight()
            android.view.View r0 = r4.A01
            X.6F1 r1 = new X.6F1
            r1.<init>(r0, r2)
        L_0x006d:
            r3.startAnimation(r1)
            return
        L_0x0071:
            if (r1 == 0) goto L_0x0008
            android.view.View r0 = r4.A01
            android.view.animation.Animation r0 = r0.getAnimation()
            if (r0 != 0) goto L_0x0008
            android.view.View r3 = r4.A01
            r0 = 0
            X.6F1 r1 = new X.6F1
            r1.<init>(r3, r0)
            goto L_0x006d
        L_0x0084:
            java.lang.Object r0 = r5.A00
            com.whatsapp.biz.catalog.view.CarouselScrollbarView r0 = (com.whatsapp.biz.catalog.view.CarouselScrollbarView) r0
            r0.A00()
            return
        L_0x008c:
            r0 = 5
            if (r8 <= r0) goto L_0x009d
            java.lang.Object r1 = r5.A00
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r1 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r1
            X.7Sv r0 = r1.A0B
            if (r0 == 0) goto L_0x009d
            r0.A00()
            r0 = 0
            r1.A0B = r0
        L_0x009d:
            java.lang.Object r0 = r5.A00
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r0 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r0
            r0.A77()
            return
        L_0x00a5:
            java.lang.Object r0 = r5.A00
            com.whatsapp.calling.callgrid.view.CallGrid r0 = (com.whatsapp.calling.callgrid.view.CallGrid) r0
            r0.A09()
            return
        L_0x00ad:
            java.lang.Object r0 = r5.A00
            com.whatsapp.calling.callgrid.view.CallGrid r0 = (com.whatsapp.calling.callgrid.view.CallGrid) r0
            r0.A08()
            return
        L_0x00b5:
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            r5.A06(r6)
            return
        L_0x00bd:
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            java.lang.Object r0 = r5.A00
            X.7aj r0 = (X.C153137aj) r0
            X.0O5 r0 = r0.A09
            r0.A04(r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188848za.A04(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public void A05(RecyclerView recyclerView, int i) {
        switch (this.A01) {
            case 0:
                ((CarouselScrollbarView) this.A00).A00();
                return;
            case 3:
                CallGrid callGrid = (CallGrid) this.A00;
                CallGridViewModel callGridViewModel = callGrid.A09;
                if (callGridViewModel != null && i == 0) {
                    callGridViewModel.A0V(callGrid.getVisibleParticipantJids());
                    return;
                }
                return;
            case 4:
                if (i == 1) {
                    ((C153447bK) this.A00).A02 = true;
                    return;
                } else if (i == 0) {
                    ((C153447bK) this.A00).A09.A0K();
                    return;
                } else {
                    return;
                }
            case 5:
                if (i == 0) {
                    MentionPickerView.A01((MentionPickerView) this.A00);
                    return;
                }
                return;
            case 6:
                C162457s7.A0J(recyclerView, 0);
                A06(recyclerView);
                return;
            case 7:
                C162457s7.A0J(recyclerView, 0);
                ((C153137aj) this.A00).A09.A05(recyclerView, i);
                return;
            default:
                super.A05(recyclerView, i);
                return;
        }
    }

    public final void A06(RecyclerView recyclerView) {
        View BEH;
        C153137aj r6 = (C153137aj) this.A00;
        if (r6.A04 != null) {
            float A002 = (C86604Kt.A00(recyclerView.getContext()) * 0.8f) + 0.5f;
            float min = Math.min(((float) recyclerView.computeVerticalScrollOffset()) / (C86664Kz.A01(C18290x4.A0G(recyclerView), R.dimen.f6nameremoved) / 3.0f), 1.0f);
            double d = (double) min;
            if (0.0d <= d && d <= 1.0d) {
                A002 *= min;
            }
            C185108t6 r0 = r6.A04;
            if (r0 != null && (BEH = r0.BEH()) != null) {
                BEH.setBackgroundColor(AnonymousClass0YI.A05(AnonymousClass0YI.A06(r6.A02, (int) (((float) 13) * min)), r6.A01));
                AnonymousClass0YZ.A0B(BEH, A002);
            }
        }
    }
}
