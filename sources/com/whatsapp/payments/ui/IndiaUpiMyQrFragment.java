package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0O1;
import X.AnonymousClass0R8;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass33p;
import X.AnonymousClass5I4;
import X.AnonymousClass5UX;
import X.AnonymousClass9Y9;
import X.C003203q;
import X.C003403v;
import X.C009707r;
import X.C02680He;
import X.C08310eF;
import X.C105365Uq;
import X.C114015mM;
import X.C153087ae;
import X.C18280x3;
import X.C18290x4;
import X.C1899593h;
import X.C1901293y;
import X.C56972sr;
import X.C620733j;
import X.C626936e;
import X.C66663Mh;
import X.C69263Wi;
import X.C89644eZ;
import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;
import com.whatsapp.util.Log;

public class IndiaUpiMyQrFragment extends Hilt_IndiaUpiMyQrFragment {
    public View A00;
    public ImageView A01;
    public ImageView A02;
    public TextView A03;
    public C69263Wi A04;
    public C56972sr A05;
    public AnonymousClass5UX A06;
    public C105365Uq A07;
    public C114015mM A08;
    public AnonymousClass33p A09;
    public C620733j A0A;
    public C153087ae A0B;
    public IndiaUpiDisplaySecureQrCodeView A0C;
    public IndiaUpiSecureQrCodeViewModel A0D;
    public AnonymousClass5I4 A0E;
    public final AnonymousClass0O1 A0F = Bid(new AnonymousClass9Y9(this), new C003403v());

    public static IndiaUpiMyQrFragment A00(String str) {
        Bundle A082 = AnonymousClass002.A08();
        A082.putString("extra_account_holder_name", str);
        A082.putInt("action_bar_title_res_id", 0);
        A082.putBoolean("bottom_icon_visible", true);
        IndiaUpiMyQrFragment indiaUpiMyQrFragment = new IndiaUpiMyQrFragment();
        indiaUpiMyQrFragment.A0u(A082);
        return indiaUpiMyQrFragment;
    }

    public void A0k(int i, int i2, Intent intent) {
        View view;
        if (i == 1006) {
            IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = this.A0C;
            int i3 = 8;
            if (indiaUpiDisplaySecureQrCodeView.A06.getVisibility() == 8) {
                view = indiaUpiDisplaySecureQrCodeView.A05;
            } else {
                view = indiaUpiDisplaySecureQrCodeView.A02;
            }
            view.setVisibility(0);
            boolean A082 = indiaUpiDisplaySecureQrCodeView.A0B.A08(C66663Mh.A0i);
            TextView textView = indiaUpiDisplaySecureQrCodeView.A08;
            if (A082 && indiaUpiDisplaySecureQrCodeView.A04.getVisibility() != 0) {
                i3 = 0;
            }
            textView.setVisibility(i3);
            return;
        }
        super.A0k(i, i2, intent);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0120  */
    public void A0w(android.os.Bundle r13, android.view.View r14) {
        /*
            r12 = this;
            X.5mM r2 = r12.A08
            android.content.Context r1 = r14.getContext()
            java.lang.String r0 = "india-upi-my-qr-fragment"
            X.5Uq r0 = r2.A06(r1, r0)
            r12.A07 = r0
            r0 = 2131432793(0x7f0b1559, float:1.8487353E38)
            android.view.View r0 = X.C06560Yg.A02(r14, r0)
            r12.A00 = r0
            r0 = 2131428994(0x7f0b0682, float:1.8479648E38)
            android.widget.ImageView r0 = X.AnonymousClass0x9.A0E(r14, r0)
            r12.A02 = r0
            r0 = 2131433232(0x7f0b1710, float:1.8488244E38)
            android.widget.TextView r0 = X.C18300x5.A0G(r14, r0)
            r12.A03 = r0
            r0 = 2131429501(0x7f0b087d, float:1.8480677E38)
            android.view.View r0 = X.C06560Yg.A02(r14, r0)
            com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView r0 = (com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView) r0
            r12.A0C = r0
            r0 = 2131428117(0x7f0b0315, float:1.847787E38)
            android.widget.ImageView r0 = X.AnonymousClass0x9.A0E(r14, r0)
            r12.A01 = r0
            android.os.Bundle r1 = r12.A06
            r10 = 0
            r7 = 1
            if (r1 == 0) goto L_0x0082
            java.lang.String r0 = "extra_account_holder_name"
            java.lang.String r11 = r1.getString(r0)
            java.lang.String r0 = "bottom_icon_visible"
            boolean r0 = r1.getBoolean(r0, r7)
        L_0x004f:
            android.widget.ImageView r1 = r12.A01
            r6 = 0
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            X.0XL r1 = new X.0XL
            r1.<init>(r12)
            java.lang.Class<com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel> r0 = com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel.class
            X.0Ty r9 = r1.A01(r0)
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r9 = (com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel) r9
            r12.A0D = r9
            r0 = 30
            X.9qL r1 = X.C205049qL.A00(r12, r0)
            r0 = 31
            X.9qL r0 = X.C205049qL.A00(r12, r0)
            X.08J r2 = r9.A01
            r2.A0B(r12, r1)
            X.08J r8 = r9.A00
            r8.A0B(r12, r0)
            X.9bS r5 = r9.A09
            monitor-enter(r5)
            goto L_0x0085
        L_0x0082:
            r11 = r10
            r0 = 1
            goto L_0x004f
        L_0x0085:
            java.lang.String r4 = "signedQrCode"
            java.lang.String r3 = "signedQrCodeTs"
            java.lang.String[] r0 = new java.lang.String[]{r4, r3}     // Catch:{ all -> 0x01a7 }
            java.lang.String[] r1 = r5.A0U(r0)     // Catch:{ all -> 0x01a7 }
            monitor-exit(r5)
            r0 = r1[r6]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0150
            java.lang.String r5 = X.C196629bS.A00(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = "PAY: user vpa missing"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r1 = -1
            X.9Of r0 = new X.9Of
            r0.<init>(r1, r1)
        L_0x00af:
            r2.A0H(r0)
        L_0x00b2:
            com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView r1 = r12.A0C
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r0 = r12.A0D
            r1.setup(r0)
            r12.A1J(r7)
            r0 = 2131434592(0x7f0b1c60, float:1.8491002E38)
            android.view.View r5 = X.C06560Yg.A02(r14, r0)
            com.whatsapp.CopyableTextView r5 = (com.whatsapp.CopyableTextView) r5
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r0 = r12.A0D
            X.9Wl r0 = r0.A0D()
            java.lang.String r2 = r0.A0O
            r5.A02 = r2
            r1 = 2131895429(0x7f122485, float:1.942569E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r6] = r2
            X.C1899693i.A0l(r5, r12, r0, r1)
            r0 = 2131434558(0x7f0b1c3e, float:1.8490933E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r14, r0)
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r0 = r12.A0D
            X.9Wl r0 = r0.A0D()
            java.lang.String r0 = r0.A09
            r1.setText(r0)
            r0 = 2131434591(0x7f0b1c5f, float:1.8491E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r14, r0)
            X.2sr r0 = r12.A05
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)
            if (r0 != 0) goto L_0x0120
            r0 = 0
        L_0x00fb:
            X.C626936e.A06(r0)
            java.lang.String r0 = X.AnonymousClass36P.A08(r0)
            r1.setText(r0)
            android.widget.TextView r5 = r12.A03
            r2 = 2131893289(0x7f121c29, float:1.942135E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r0 = r12.A0D
            X.9Wl r0 = r0.A0D()
            java.lang.String r0 = r0.A09
            r1[r6] = r0
            X.C1899693i.A0l(r5, r12, r1, r2)
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r8 = r12.A0D
            r5 = -1
            X.9bS r1 = r8.A09
            monitor-enter(r1)
            goto L_0x015b
        L_0x0120:
            java.lang.String r0 = r0.user
            goto L_0x00fb
        L_0x0123:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x014b
            X.2og r0 = r9.A07
            java.lang.String r2 = r0.A03()
            X.9U5 r1 = r9.A0B
            X.9U4 r0 = r9.A0D
            X.9oC r0 = X.AnonymousClass9U4.A07(r0)
            r1.A09(r10, r0)
        L_0x013a:
            X.9Wl r1 = r9.A0D()
            r1.A09 = r2
            r1.A0O = r5
            java.lang.String r0 = "01"
            r1.A04 = r0
            r8.A0H(r1)
            goto L_0x00b2
        L_0x014b:
            java.lang.String r2 = r11.trim()
            goto L_0x013a
        L_0x0150:
            r2 = r8
            r1 = r1[r6]
            java.lang.String r0 = "SCANNED_QR_CODE"
            X.9Wl r0 = X.C195179Wl.A01(r1, r0)
            goto L_0x00af
        L_0x015b:
            java.lang.String[] r0 = new java.lang.String[]{r4, r3}     // Catch:{ all -> 0x01a4 }
            java.lang.String[] r2 = r1.A0U(r0)     // Catch:{ all -> 0x01a4 }
            monitor-exit(r1)
            X.3Mh r1 = r8.A04
            X.1Ei r0 = X.C66663Mh.A0i
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0199
            r0 = r2[r6]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0192
            r0 = r2[r7]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0192
            X.2sH r0 = r8.A05
            long r3 = r0.A0H()
            r0 = r2[r7]
            long r0 = java.lang.Long.parseLong(r0)
            long r3 = r3 - r0
            r1 = 259200000(0xf731400, double:1.280618154E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0199
        L_0x0192:
            r8.A0E(r5)
        L_0x0195:
            r12.A13(r7)
            return
        L_0x0199:
            X.9Of r1 = new X.9Of
            r1.<init>(r6, r5)
            X.08J r0 = r8.A01
            r0.A0H(r1)
            goto L_0x0195
        L_0x01a4:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x01a7:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiMyQrFragment.A0w(android.os.Bundle, android.view.View):void");
    }

    public final void A1J(boolean z) {
        C56972sr r0 = this.A05;
        r0.A0P();
        if (r0.A01 == null) {
            return;
        }
        if (z) {
            C105365Uq r2 = this.A07;
            C56972sr r02 = this.A05;
            r02.A0P();
            r2.A08(this.A02, r02.A01);
        } else if (C18280x3.A02(AnonymousClass0x2.A0F(this.A09), "privacy_profile_photo") != 0) {
            AnonymousClass5UX r22 = this.A06;
            ImageView imageView = this.A02;
            C56972sr r03 = this.A05;
            r03.A0P();
            r22.A07(imageView, r03.A01);
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0c() {
        super.A0c();
        this.A07.A00();
        this.A00 = null;
        this.A02 = null;
        this.A03 = null;
        this.A0C = null;
        this.A01 = null;
    }

    public void A0g() {
        AnonymousClass0R8 supportActionBar;
        super.A0g();
        Bundle bundle = this.A06;
        C003203q A0R = A0R();
        if ((A0R instanceof C89644eZ) && bundle != null && bundle.getInt("action_bar_title_res_id", 0) != 0 && (supportActionBar = ((C009707r) A0R).getSupportActionBar()) != null) {
            C1899593h.A0n(supportActionBar, bundle.getInt("action_bar_title_res_id"));
        }
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        menu.add(0, R.id.menuitem_share_qr, 0, R.string.f11nameremoved).setIcon(C02680He.A00(A0G().getTheme(), C08310eF.A09(this), R.drawable.ic_action_share)).setShowAsAction(1);
        menu.add(0, R.id.menuitem_print, 0, R.string.f11nameremoved);
    }

    public boolean A1B(MenuItem menuItem) {
        int i;
        if (menuItem.getItemId() == R.id.menuitem_share_qr) {
            if (AnonymousClass0Y8.A05(A0G(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    i = R.string.f11nameremoved;
                } else {
                    i = R.string.f11nameremoved;
                    if (i2 < 33) {
                        i = R.string.f11nameremoved;
                    }
                }
                this.A0F.A01(RequestPermissionActivity.A0C(A0G(), R.string.f11nameremoved, i, true));
            } else {
                this.A0D.A0F(C18290x4.A0m(this.A0C.A0F), 0);
                return true;
            }
        } else if (menuItem.getItemId() != R.id.menuitem_print) {
            return false;
        } else {
            if (!(this.A0C.A09 == null || A0Q() == null || this.A00 == null)) {
                A1J(false);
                this.A00.setDrawingCacheEnabled(true);
                this.A00.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                View view = this.A00;
                view.layout(0, 0, view.getMeasuredWidth(), this.A00.getMeasuredHeight());
                this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.A00.buildDrawingCache(true);
                Bitmap createBitmap = Bitmap.createBitmap(this.A00.getDrawingCache());
                C003203q A0R = A0R();
                String str = this.A0D.A0D().A09;
                Log.d("ShareQrCodeUtil/printQrCode");
                C626936e.A0D(!(A0R instanceof Application), "Application context should not be used here");
                PrintManager printManager = (PrintManager) A0R.getSystemService("print");
                if (printManager == null) {
                    Log.e("PAY: payments-display-qr/print/no-print-manager");
                } else {
                    printManager.print(str, new C1901293y(A0R, createBitmap), (PrintAttributes) null);
                }
                this.A00.setDrawingCacheEnabled(false);
                A1J(true);
                return true;
            }
        }
        return true;
    }
}
