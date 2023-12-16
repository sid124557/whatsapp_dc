package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.stickers.store.StickerStoreActivity;
import com.whatsapp.stickers.store.StickerStoreTabFragment;

/* renamed from: X.69C  reason: invalid class name */
public class AnonymousClass69C implements C16870uA {
    public Object A00;
    public final int A01;

    public AnonymousClass69C(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r4 = (com.whatsapp.notification.PopupNotification) r6.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BXd(int r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x000f
            r5 = 1
            if (r7 != r5) goto L_0x0010
            java.lang.Object r0 = r6.A00
            com.whatsapp.notification.PopupNotification r0 = (com.whatsapp.notification.PopupNotification) r0
            r0.A1T = r5
        L_0x000f:
            return
        L_0x0010:
            if (r7 != 0) goto L_0x000f
            java.lang.Object r4 = r6.A00
            com.whatsapp.notification.PopupNotification r4 = (com.whatsapp.notification.PopupNotification) r4
            java.lang.Integer r0 = r4.A1O
            if (r0 == 0) goto L_0x000f
            java.util.List r1 = r4.A1P
            int r0 = r0.intValue()
            r1.remove(r0)
            java.lang.Integer r0 = r4.A1O
            int r1 = r0.intValue()
            java.util.List r0 = r4.A1P
            int r0 = r0.size()
            if (r1 < r0) goto L_0x003e
            java.lang.Integer r0 = r4.A1O
            int r0 = r0.intValue()
            int r0 = r0 - r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A1O = r0
        L_0x003e:
            X.6JH r0 = r4.A0R
            r0.A05()
            com.whatsapp.notification.PopupNotificationViewPager r3 = r4.A14
            X.6JH r2 = r4.A0R
            java.lang.Integer r0 = r4.A1O
            int r1 = r0.intValue()
            r3.setAdapter(r2)
            r0 = 0
            r3.A0F(r1, r0)
            com.whatsapp.notification.PopupNotificationViewPager r0 = r4.A14
            int r0 = r0.getCurrentItem()
            r4.A6q(r0)
            java.util.List r0 = r4.A1P
            int r0 = r0.size()
            if (r0 != r5) goto L_0x0068
            r4.A6l()
        L_0x0068:
            r0 = 0
            r4.A1O = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69C.BXd(int):void");
    }

    public void BXe(int i, float f, int i2) {
        if (1 - this.A01 == 0) {
            PopupNotification popupNotification = (PopupNotification) this.A00;
            if (popupNotification.A1T) {
                AnonymousClass4SG.A3l(popupNotification, popupNotification.A17);
                AnonymousClass3ZH r1 = popupNotification.A0q;
                if (r1 != null) {
                    C86624Kv.A1H(r1, popupNotification.A1d);
                }
            }
        }
    }

    public void BXf(int i) {
        switch (this.A01) {
            case 0:
                CatalogMediaViewFragment catalogMediaViewFragment = (CatalogMediaViewFragment) this.A00;
                C105145Tt r2 = catalogMediaViewFragment.A03;
                AnonymousClass5P6 A002 = AnonymousClass5P6.A00(r2);
                AnonymousClass5P6.A04(A002, catalogMediaViewFragment.A03);
                AnonymousClass5P6.A02(A002, 11);
                AnonymousClass5P6.A03(A002, 30);
                A002.A0G = catalogMediaViewFragment.A02.A0F;
                A002.A00 = catalogMediaViewFragment.A08;
                r2.A03(A002);
                return;
            case 1:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                if (popupNotification.A1O == null) {
                    popupNotification.A6q(popupNotification.A14.getCurrentItem());
                    return;
                }
                return;
            default:
                int i2 = 0;
                while (true) {
                    StickerStoreActivity stickerStoreActivity = (StickerStoreActivity) this.A00;
                    if (i2 < stickerStoreActivity.A05.A00.size()) {
                        boolean A1U = AnonymousClass000.A1U(i, i2);
                        RecyclerView recyclerView = ((StickerStoreTabFragment) stickerStoreActivity.A05.A0H(i2)).A04;
                        if (recyclerView != null) {
                            recyclerView.setNestedScrollingEnabled(A1U);
                        }
                        i2++;
                    } else {
                        stickerStoreActivity.A01.requestLayout();
                        return;
                    }
                }
        }
    }
}
