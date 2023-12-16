package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.gallery.DocumentsGalleryFragment;
import com.whatsapp.gallery.LinksGalleryFragment;

/* renamed from: X.692  reason: invalid class name */
public class AnonymousClass692 implements View.OnLongClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass692(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnLongClickListener(new AnonymousClass692(obj, i));
    }

    public static final boolean A01(AnonymousClass692 r4) {
        C88444Yt r42 = (C88444Yt) r4.A00;
        if (r42.A00 == null) {
            return false;
        }
        DocumentsGalleryFragment documentsGalleryFragment = r42.A0B;
        boolean BFW = ((AnonymousClass677) C86654Ky.A0O(documentsGalleryFragment)).BFW();
        AnonymousClass677 r1 = (AnonymousClass677) C86654Ky.A0O(documentsGalleryFragment);
        AnonymousClass1nF r0 = r42.A00;
        if (BFW) {
            r1.Bqw(r0);
        } else {
            r1.Bpx(r0);
        }
        documentsGalleryFragment.A0A.A05();
        return true;
    }

    public static final boolean A02(AnonymousClass692 r8) {
        AnonymousClass4Z4 r2 = (AnonymousClass4Z4) r8.A00;
        AnonymousClass5ZX r5 = new AnonymousClass5ZX(r2, 1);
        AnonymousClass5Y0 r6 = r2.A04;
        ImageView imageView = r2.A02;
        C106825aE.A00(imageView, r2.A03.getRootView(), new AnonymousClass4Ro(imageView, r5, r6, r2.A01.A00, false));
        return true;
    }

    public static final boolean A03(AnonymousClass692 r4) {
        AnonymousClass4Z3 r42 = (AnonymousClass4Z3) r4.A00;
        if (r42.A01 == null) {
            return false;
        }
        LinksGalleryFragment linksGalleryFragment = r42.A0A;
        boolean BFW = ((AnonymousClass677) C86654Ky.A0O(linksGalleryFragment)).BFW();
        AnonymousClass677 r1 = (AnonymousClass677) C86654Ky.A0O(linksGalleryFragment);
        C624134x r0 = r42.A01;
        if (BFW) {
            r1.Bqw(r0);
        } else {
            r1.Bpx(r0);
        }
        linksGalleryFragment.A0A.A05();
        return true;
    }

    public static final boolean A04(AnonymousClass692 r1) {
        C104895St r0 = (C104895St) r1.A00;
        return AnonymousClass001.A1Z(r0.A03.invoke(r0.A01));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (r1 > 0) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r1 > 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0215;
                case 1: goto L_0x01b9;
                case 2: goto L_0x01d5;
                case 3: goto L_0x018c;
                case 4: goto L_0x0184;
                case 5: goto L_0x017f;
                case 6: goto L_0x017a;
                case 7: goto L_0x0175;
                case 8: goto L_0x0170;
                case 9: goto L_0x0141;
                case 10: goto L_0x00e2;
                case 11: goto L_0x0096;
                case 12: goto L_0x0084;
                case 13: goto L_0x0043;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r7.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r4 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r4
            int r2 = r4.A02
            int[] r6 = X.C107415bH.A02
            int r5 = r6.length
            r1 = 0
        L_0x000f:
            if (r1 >= r5) goto L_0x0041
            r0 = r6[r1]
            if (r0 != r2) goto L_0x003e
            if (r1 <= 0) goto L_0x0041
        L_0x0017:
            int r0 = r1 + -1
            r0 = r6[r0]
            r4.A02 = r0
            android.graphics.Typeface r1 = X.C107415bH.A04(r4, r0)
            android.widget.TextView r0 = r4.A0C
            r0.setTypeface(r1)
            com.whatsapp.status.playback.widget.StatusEditText r0 = r4.A0j
            r0.setTypeface(r1)
            int r0 = r4.A02
            r4.A7F(r0)
            int[] r3 = com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A1B
            int r2 = r4.A02
            r1 = 0
        L_0x0035:
            if (r1 >= r5) goto L_0x01ab
            r0 = r6[r1]
            if (r0 == r2) goto L_0x01ac
            int r1 = r1 + 1
            goto L_0x0035
        L_0x003e:
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0041:
            r1 = r5
            goto L_0x0017
        L_0x0043:
            java.lang.Object r6 = r7.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r6 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r6
            int r2 = r6.A00
            int[] r5 = X.C107415bH.A01
            int r4 = r5.length
            r1 = 0
        L_0x004d:
            if (r1 >= r4) goto L_0x006f
            r0 = r5[r1]
            if (r0 != r2) goto L_0x006c
            if (r1 <= 0) goto L_0x006f
        L_0x0055:
            int r0 = r1 + -1
            r0 = r5[r0]
            r6.A00 = r0
            r6.A7D()
            int[] r3 = com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A1A
            int r2 = r6.A00
            r1 = 0
        L_0x0063:
            if (r1 >= r4) goto L_0x0071
            r0 = r5[r1]
            if (r0 == r2) goto L_0x0072
            int r1 = r1 + 1
            goto L_0x0063
        L_0x006c:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x006f:
            r1 = r4
            goto L_0x0055
        L_0x0071:
            r1 = -1
        L_0x0072:
            r0 = r3[r1]
            java.lang.String r1 = r6.getString(r0)
            X.33i r0 = r6.A08
            X.C107295b4.A00(r6, r0, r1)
            X.5mK r0 = r6.A0i
            r0.A02()
            goto L_0x01b7
        L_0x0084:
            java.lang.Object r0 = r7.A00
            X.51j r0 = (X.C985651j) r0
            r0.A06()
            java.lang.String r2 = r0.A04
            X.33i r1 = r0.A02
            X.3Wi r0 = r0.A01
            boolean r0 = X.C106595Zp.A01(r0, r1, r2)
            return r0
        L_0x0096:
            java.lang.Object r3 = r7.A00
            X.5Uj r3 = (X.C105305Uj) r3
            X.5nf r2 = r3.A06
            if (r2 == 0) goto L_0x01b7
            X.5UO r0 = r3.A05
            if (r0 == 0) goto L_0x01b7
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = r2.A0M
            X.5US r0 = r1.A0I
            r0.A02()
            X.5Xo r0 = r1.A0F
            r0.A01()
            r0.A02()
            X.5Ol r0 = r2.A0O
            r1 = 0
            r0.A02 = r1
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r2.A0J
            r0.A04(r1)
            X.5UO r0 = r2.A05
            r0.A00()
            X.5Uj r0 = r2.A0V
            r0.A07(r1)
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r3.A0I
            android.widget.ImageView r1 = r0.A08
            if (r1 != 0) goto L_0x00d2
            java.lang.String r0 = "undoButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00d2:
            r0 = 4
            r1.setVisibility(r0)
            X.5UO r0 = r3.A05
            r0.A02()
            X.5nf r0 = r3.A06
            r0.A06()
            goto L_0x01b7
        L_0x00e2:
            java.lang.Object r3 = r7.A00
            X.5Uj r3 = (X.C105305Uj) r3
            X.7E6 r0 = r3.A0H
            com.whatsapp.mediacomposer.MediaComposerActivity r4 = r0.A00
            X.5Uj r0 = r4.A10
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r0.A0I
            boolean r0 = r0.A0U
            if (r0 != 0) goto L_0x010f
            X.0zH r1 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131890645(0x7f1211d5, float:1.9415988E38)
            r1.A0U(r0)
            r0 = 2131890644(0x7f1211d4, float:1.9415986E38)
            r1.A0T(r0)
            X.C19340zH.A06(r1)
            X.C18280x3.A0q(r1)
        L_0x0108:
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r3.A0I
            r0.A00()
            goto L_0x01b7
        L_0x010f:
            X.1VX r1 = r4.A0D
            r0 = 4448(0x1160, float:6.233E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x012f
            com.whatsapp.mediacomposer.MediaComposerFragment r2 = r4.A76()
            if (r2 == 0) goto L_0x0108
            X.5Us r0 = r4.A0t
            android.net.Uri r0 = r0.A02()
            java.lang.Integer r1 = r4.A1Q
            X.5YF r0 = X.AnonymousClass4SG.A2l(r0, r4)
            r2.A1Q(r0, r1)
            goto L_0x0108
        L_0x012f:
            java.lang.Integer r0 = r4.A1Q
            int r1 = r0.intValue()
            r0 = 3
            if (r1 != r0) goto L_0x0139
            r0 = 0
        L_0x0139:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.BWA(r0)
            goto L_0x0108
        L_0x0141:
            java.lang.Object r0 = r7.A00
            X.4LC r0 = (X.AnonymousClass4LC) r0
            X.5TK r3 = r0.A0G
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x01b7
            X.7E7 r0 = r3.A08
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A00
            r0.invalidate()
            X.5N6 r2 = r3.A0B
            X.5US r1 = r2.A01
            X.5PR r0 = r1.A03
            java.util.LinkedList r0 = r0.A00
            boolean r0 = X.AnonymousClass0x7.A1S(r0)
            if (r0 == 0) goto L_0x016b
            r1.A02()
            X.5Xo r0 = r2.A00
            r0.A01()
            r0.A02()
        L_0x016b:
            r0 = 1
            r3.A02(r0)
            goto L_0x01b7
        L_0x0170:
            boolean r0 = A03(r7)
            return r0
        L_0x0175:
            boolean r0 = A01(r7)
            return r0
        L_0x017a:
            boolean r0 = A02(r7)
            return r0
        L_0x017f:
            boolean r0 = A04(r7)
            return r0
        L_0x0184:
            java.lang.Object r0 = r7.A00
            X.5UB r0 = (X.AnonymousClass5UB) r0
            r0.A02(r8)
            goto L_0x01b7
        L_0x018c:
            java.lang.Object r2 = r7.A00
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            X.5UY r0 = r2.A1J
            if (r0 == 0) goto L_0x01a1
            X.8qC r0 = r2.A1S
            java.lang.Object r1 = r0.get()
            X.5Ts r1 = (X.C105135Ts) r1
            X.5UY r0 = r2.A1J
            r1.A03(r0)
        L_0x01a1:
            r0 = 8
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r0 = X.C379924v.A00(r0)
            r2.Boo(r0)
            goto L_0x01b7
        L_0x01ab:
            r1 = -1
        L_0x01ac:
            r0 = r3[r1]
            java.lang.String r1 = r4.getString(r0)
            X.33i r0 = r4.A08
            X.C107295b4.A00(r4, r0, r1)
        L_0x01b7:
            r0 = 1
            return r0
        L_0x01b9:
            java.lang.Object r1 = r7.A00
            X.4OW r1 = (X.AnonymousClass4OW) r1
            X.4NX r8 = (X.AnonymousClass4NX) r8
            android.graphics.drawable.Drawable r0 = r8.A03
            if (r0 == 0) goto L_0x0230
            X.5ZF r3 = r1.A03
            X.33p r0 = r3.A0M
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "skin_emoji_tip"
            X.C18270x1.A0h(r1, r0, r2)
            r3.A03(r8)
            goto L_0x0230
        L_0x01d5:
            java.lang.Object r6 = r7.A00
            com.whatsapp.HomeActivity r6 = (com.whatsapp.HomeActivity) r6
            int r1 = r6.A06
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0230
            X.59C r0 = r6.A17
            int r5 = r0.ordinal()
            X.59C[] r4 = X.AnonymousClass59C.values()
            int r3 = r4.length
            java.util.ArrayList r2 = X.AnonymousClass002.A0I(r3)
            r1 = 0
        L_0x01ef:
            if (r1 >= r3) goto L_0x01fb
            r0 = r4[r1]
            int r0 = r0.title
            X.C86654Ky.A0w(r6, r2, r0)
            int r1 = r1 + 1
            goto L_0x01ef
        L_0x01fb:
            java.lang.String[] r3 = X.C18300x5.A1b(r2)
            r2 = -24
            r0 = 2131893750(0x7f121df6, float:1.9422285E38)
            com.whatsapp.SingleSelectionDialogFragment r1 = new com.whatsapp.SingleSelectionDialogFragment
            r1.<init>()
            android.os.Bundle r0 = com.whatsapp.SingleSelectionDialogFragment.A00(r3, r2, r5, r0)
            r1.A0u(r0)
            r6.Boo(r1)
            r0 = 1
            return r0
        L_0x0215:
            java.lang.Object r1 = r7.A00
            X.4OW r1 = (X.AnonymousClass4OW) r1
            X.4NX r8 = (X.AnonymousClass4NX) r8
            android.graphics.drawable.Drawable r0 = r8.A03
            if (r0 == 0) goto L_0x0230
            X.5ZF r3 = r1.A03
            X.33p r0 = r3.A0M
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "skin_emoji_tip"
            X.C18270x1.A0h(r1, r0, r2)
            r3.A02(r8)
        L_0x0230:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass692.onLongClick(android.view.View):boolean");
    }
}
