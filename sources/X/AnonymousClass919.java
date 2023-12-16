package X;

import android.view.View;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.919  reason: invalid class name */
public class AnonymousClass919 implements View.OnLongClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass919(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static final boolean A00(AnonymousClass919 r1) {
        C105175Tw r12 = (C105175Tw) r1.A01;
        AnonymousClass5MO r0 = ((C91234j9) r1.A00).A03;
        if (r0 == null) {
            return false;
        }
        r0.A00(r12);
        return true;
    }

    public static final boolean A01(AnonymousClass919 r2) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) r2.A01;
        C95294tG r1 = ((AnonymousClass6IG) r2.A00).A00;
        C186058ug r0 = r1.A0A;
        if (r0 == null || !mediaGalleryFragmentBase.A1X(r0, r1)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(AnonymousClass919 r1) {
        C105175Tw r12 = (C105175Tw) r1.A01;
        AnonymousClass5MO r0 = ((C91224j8) r1.A00).A03;
        if (r0 == null) {
            return false;
        }
        r0.A00(r12);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r0 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r0 = X.C111095hX.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        ((X.C89654ea) r0).Boo(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r4) {
        /*
            r3 = this;
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x0070;
                case 1: goto L_0x0075;
                case 2: goto L_0x0054;
                case 3: goto L_0x0062;
                case 4: goto L_0x007a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A00
            X.6Hh r0 = (X.C125306Hh) r0
            java.lang.Object r2 = r3.A01
            X.39M r2 = (X.AnonymousClass39M) r2
            X.8pX r1 = r0.A02
            if (r1 == 0) goto L_0x006e
            X.92w r1 = (X.C1898492w) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x002d;
                case 1: goto L_0x0018;
                case 2: goto L_0x003e;
                case 3: goto L_0x004b;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.Object r0 = r1.A00
            X.8J3 r0 = (X.AnonymousClass8J3) r0
            com.whatsapp.stickers.StarStickerFromPickerDialogFragment r2 = com.whatsapp.stickers.StarStickerFromPickerDialogFragment.A00(r2)
        L_0x0020:
            android.content.Context r0 = r0.A0B
        L_0x0022:
            android.app.Activity r0 = X.C111095hX.A02(r0)
        L_0x0026:
            X.4ea r0 = (X.C89654ea) r0
            r0.Boo(r2)
        L_0x002b:
            r0 = 1
            return r0
        L_0x002d:
            java.lang.Object r0 = r1.A00
            X.8J3 r0 = (X.AnonymousClass8J3) r0
            com.whatsapp.stickers.StarStickerFromPickerDialogFragment r2 = com.whatsapp.stickers.StarStickerFromPickerDialogFragment.A00(r2)
            android.content.Context r1 = r0.A0B
            java.lang.Class<X.4ea> r0 = X.C89654ea.class
            android.app.Activity r0 = X.C111095hX.A03(r1, r0)
            goto L_0x0026
        L_0x003e:
            java.lang.Object r1 = r1.A00
            X.6pT r1 = (X.C137916pT) r1
            boolean r0 = r1.A0E
            com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment r2 = com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment.A00(r2, r0)
            android.content.Context r0 = r1.A0B
            goto L_0x0022
        L_0x004b:
            java.lang.Object r0 = r1.A00
            X.8J3 r0 = (X.AnonymousClass8J3) r0
            com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment r2 = com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment.A00(r2)
            goto L_0x0020
        L_0x0054:
            java.lang.Object r0 = r3.A00
            X.5LF r0 = (X.AnonymousClass5LF) r0
            java.lang.Object r1 = r3.A01
            X.3ZF r1 = (X.AnonymousClass3ZF) r1
            com.whatsapp.calling.callhistory.CallLogActivity r0 = r0.A0B
            r0.A78(r1)
            goto L_0x002b
        L_0x0062:
            java.lang.Object r1 = r3.A00
            com.whatsapp.calling.calllink.view.CallLinkActivity r1 = (com.whatsapp.calling.calllink.view.CallLinkActivity) r1
            java.lang.Object r0 = r3.A01
            X.7yU r0 = (X.C166317yU) r0
            r1.A7D(r0)
            goto L_0x002b
        L_0x006e:
            r0 = 0
            return r0
        L_0x0070:
            boolean r0 = A00(r3)
            return r0
        L_0x0075:
            boolean r0 = A02(r3)
            return r0
        L_0x007a:
            boolean r0 = A01(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass919.onLongClick(android.view.View):boolean");
    }
}
