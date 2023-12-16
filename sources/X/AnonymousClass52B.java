package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;
import java.util.List;

/* renamed from: X.52B  reason: invalid class name */
public class AnonymousClass52B extends C87844Wi {
    public final /* synthetic */ StickerStoreMyTabFragment A00;

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return super.BQR(viewGroup, i);
        }
        StickerStoreMyTabFragment stickerStoreMyTabFragment = this.A00;
        return new AnonymousClass6IM(AnonymousClass001.A0R(LayoutInflater.from(stickerStoreMyTabFragment.A1D()), viewGroup, R.layout.f8nameremoved), stickerStoreMyTabFragment);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass52B(StickerStoreMyTabFragment stickerStoreMyTabFragment, List list) {
        super(stickerStoreMyTabFragment, list);
        this.A00 = stickerStoreMyTabFragment;
    }

    public int A0G() {
        int A08 = C86614Ku.A08(this.A00);
        if (A08 > 0) {
            return A08 + 1;
        }
        return A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r5.A05.size() != 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BNf(X.C05570Ua r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.getItemViewType(r11)
            if (r0 != 0) goto L_0x00b6
            X.4Yu r10 = (X.C88454Yu) r10
            super.BNf(r10, r11)
            java.util.List r0 = r9.A00
            java.lang.Object r5 = r0.get(r11)
            X.2iT r5 = (X.C50612iT) r5
            com.whatsapp.CircularProgressBar r2 = r10.A0G
            boolean r0 = r5.A0T
            r3 = 8
            r4 = 0
            if (r0 == 0) goto L_0x0025
            java.util.List r0 = r5.A05
            int r1 = r0.size()
            r0 = 0
            if (r1 == 0) goto L_0x0027
        L_0x0025:
            r0 = 8
        L_0x0027:
            r2.setVisibility(r0)
            android.widget.ImageView r1 = r10.A06
            r0 = 2131233712(0x7f080bb0, float:1.808357E38)
            r1.setImageResource(r0)
            android.content.Context r2 = r1.getContext()
            r0 = 2131101268(0x7f060654, float:1.781494E38)
            X.C86644Kx.A0l(r2, r1, r0)
            android.widget.ImageView r2 = r10.A07
            r0 = 2131233718(0x7f080bb6, float:1.8083581E38)
            r2.setImageResource(r0)
            android.widget.ImageView r6 = r10.A08
            r0 = 2131232653(0x7f08078d, float:1.8081421E38)
            r6.setImageResource(r0)
            boolean r0 = r5.A00()
            r8 = 4
            if (r0 == 0) goto L_0x00c0
            X.C86624Kv.A14(r1, r2, r6, r8)
            android.view.View r0 = r10.A04
            r0.setVisibility(r4)
            boolean r7 = r5.A06
            com.whatsapp.WaTextView r0 = r10.A0H
            if (r7 == 0) goto L_0x00b7
            r0.setVisibility(r8)
            android.widget.ProgressBar r0 = r10.A0A
            r0.setVisibility(r4)
        L_0x0069:
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r7 = r9.A00
            r0 = 2131894062(0x7f121f2e, float:1.9422918E38)
            X.C86634Kw.A1D(r1, r7, r0)
            r0 = 32
            X.AnonymousClass54E.A00(r1, r5, r9, r0)
            r0 = 2131894078(0x7f121f3e, float:1.942295E38)
            X.C86634Kw.A1D(r2, r7, r0)
            r0 = 1
            r2.setLongClickable(r0)
            r1 = 5
            X.39Z r0 = new X.39Z
            r0.<init>(r1)
            r2.setOnClickListener(r0)
            X.5Bt r0 = new X.5Bt
            r0.<init>(r10, r1, r9)
            r2.setOnTouchListener(r0)
            r0 = 2131886128(0x7f120030, float:1.9406826E38)
            X.C107295b4.A05(r2, r0)
            r0 = 2131894059(0x7f121f2b, float:1.9422912E38)
            X.C86634Kw.A1D(r6, r7, r0)
            r0 = 33
            X.C989753y.A00(r6, r9, r0)
            X.2pc r0 = r7.A02
            java.lang.String r1 = r5.A0G
            X.C162457s7.A0J(r1, r4)
            java.lang.String r0 = r0.A01()
            boolean r0 = X.C162457s7.A0P(r0, r1)
            if (r0 == 0) goto L_0x00b6
            r2.setVisibility(r3)
        L_0x00b6:
            return
        L_0x00b7:
            r0.setVisibility(r4)
            android.widget.ProgressBar r0 = r10.A0A
            r0.setVisibility(r8)
            goto L_0x0069
        L_0x00c0:
            android.view.View r0 = r10.A04
            r0.setVisibility(r8)
            boolean r0 = r5.A0S
            if (r0 == 0) goto L_0x00d3
            r1.setVisibility(r8)
            r2.setVisibility(r3)
            r6.setVisibility(r4)
            goto L_0x0069
        L_0x00d3:
            X.C86654Ky.A16(r6, r1, r2, r3, r4)
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass52B.BNf(X.0Ua, int):void");
    }

    public int getItemViewType(int i) {
        if (A0G() - 1 != i) {
            return 0;
        }
        return 1;
    }
}
