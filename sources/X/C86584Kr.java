package X;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;
import com.whatsapp.util.Log;

/* renamed from: X.4Kr  reason: invalid class name and case insensitive filesystem */
public class C86584Kr implements C84874Eb {
    public Object A00;
    public final int A01;

    public C86584Kr(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BOF(int i) {
        C69263Wi r1;
        int i2;
        C69263Wi r12;
        int i3;
        switch (this.A01) {
            case 0:
                Log.e("idverification/cameraerror");
                C54172oI r3 = (C54172oI) this.A00;
                AnonymousClass5TW r0 = r3.A07;
                if (r0 != null) {
                    if (r0.A04()) {
                        r12 = r3.A04;
                        if (r12 != null) {
                            i3 = R.string.f11nameremoved;
                        } else {
                            throw C18270x1.A0S("globalUI");
                        }
                    } else {
                        if (i != 2) {
                            r12 = r3.A04;
                            if (r12 != null) {
                                i3 = R.string.f11nameremoved;
                            } else {
                                throw C18270x1.A0S("globalUI");
                            }
                        }
                        r3.A02((Runnable) null);
                        return;
                    }
                    r12.A0H(i3, 1);
                    r3.A02((Runnable) null);
                    return;
                }
                throw C18270x1.A0S("voidCallState");
            case 1:
                C32241pq r32 = (C32241pq) this.A00;
                if (r32.A03.A04()) {
                    r1 = r32.A05;
                    i2 = R.string.f11nameremoved;
                } else {
                    if (i != 2) {
                        r1 = r32.A05;
                        i2 = R.string.f11nameremoved;
                    }
                    r32.finish();
                    return;
                }
                r1.A0H(i2, 1);
                r32.finish();
                return;
            default:
                QrScanCodeFragment qrScanCodeFragment = (QrScanCodeFragment) this.A00;
                if (qrScanCodeFragment.A03.A04()) {
                    qrScanCodeFragment.A02.A0H(R.string.f11nameremoved, 1);
                }
                C003203q A0Q = qrScanCodeFragment.A0Q();
                if (A0Q instanceof C97654yv) {
                    C97654yv r13 = (C97654yv) A0Q;
                    r13.A02.A0F(C620733j.A04(r13.A0H) ^ true ? 1 : 0, true);
                    return;
                }
                return;
        }
    }

    public void BYs() {
        View view;
        View view2;
        switch (this.A01) {
            case 0:
                C54172oI r4 = (C54172oI) this.A00;
                WaQrScannerView waQrScannerView = r4.A0G;
                boolean z = false;
                if (waQrScannerView != null && waQrScannerView.getVisibility() == 0) {
                    z = true;
                }
                if (z && ((view2 = r4.A02) == null || view2.getVisibility() != 8)) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                    r4.A03 = translateAnimation;
                    translateAnimation.setInterpolator(new AccelerateInterpolator());
                    Animation animation = r4.A03;
                    if (animation != null) {
                        Resources resources = r4.A00;
                        if (resources == null) {
                            throw C18270x1.A0S("resources");
                        }
                        animation.setDuration((long) resources.getInteger(17694721));
                    }
                    View view3 = r4.A02;
                    if (view3 != null) {
                        view3.startAnimation(r4.A03);
                    }
                    Animation animation2 = r4.A03;
                    if (animation2 != null) {
                        animation2.setAnimationListener(new AnonymousClass4H6(r4, 1));
                    }
                    View view4 = r4.A02;
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                }
                C59682xJ r1 = r4.A0E;
                if (r1 != null) {
                    UserJid userJid = r4.A0D;
                    if (userJid == null) {
                        throw C18270x1.A0S("jid");
                    }
                    if (r1.A00(userJid)) {
                        view = r4.A01;
                    } else {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        Resources resources2 = r4.A00;
                        if (resources2 == null) {
                            throw C18270x1.A0S("resources");
                        }
                        alphaAnimation.setDuration((long) resources2.getInteger(17694720));
                        WaTextView waTextView = r4.A06;
                        if (waTextView != null) {
                            waTextView.startAnimation(alphaAnimation);
                        }
                        view = r4.A06;
                    }
                    if (view != null) {
                        view.setVisibility(0);
                        return;
                    }
                    return;
                }
                throw C18270x1.A0S("keyTransparencyManager");
            case 1:
                Log.i("qractivity/previewready");
                ((C32241pq) this.A00).A08 = true;
                return;
            default:
                ((QrScanCodeFragment) this.A00).A1K();
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0149, code lost:
        r1 = r1.getString(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BZC(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0031;
                case 1: goto L_0x016d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r7.A00
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment r3 = (com.whatsapp.qrcode.contactqr.QrScanCodeFragment) r3
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x0030
            if (r8 == 0) goto L_0x01a8
            java.lang.String r0 = r3.A07
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x01a8
            r3.A07 = r8
            X.03q r1 = r3.A0R()
            X.4yv r1 = (X.C97654yv) r1
            r0 = 2
            r2 = 1
            boolean r0 = r1.A78(r8, r2, r0)
            if (r0 == 0) goto L_0x01a0
            r3.A0A = r2
            X.3Wi r1 = r3.A02
            java.lang.Runnable r0 = r3.A0C
            r1.A0R(r0)
        L_0x0030:
            return
        L_0x0031:
            java.lang.Object r3 = r7.A00
            X.2oI r3 = (X.C54172oI) r3
            android.view.animation.Animation r0 = r3.A03
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.hasEnded()
            r6 = 1
            if (r0 != r6) goto L_0x0030
            if (r8 == 0) goto L_0x0168
            java.nio.charset.Charset r0 = r3.A0H     // Catch:{ all -> 0x0049 }
            byte[] r2 = X.C18320x8.A1a(r8, r0)     // Catch:{ all -> 0x0049 }
            goto L_0x004e
        L_0x0049:
            r0 = move-exception
            X.3Z0 r2 = X.AnonymousClass3Z0.A01(r0)
        L_0x004e:
            java.lang.Throwable r0 = X.AnonymousClass3Z9.A00(r2)
            if (r0 != 0) goto L_0x0168
            byte[] r2 = (byte[]) r2
            X.2KJ r4 = r3.A00(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "idverification/scannedCode "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " result: "
            X.C18260x0.A1P(r1, r0, r4)
            X.5ZU r2 = r3.A09
            if (r2 == 0) goto L_0x0198
            X.3Ex r1 = r3.A08
            if (r1 == 0) goto L_0x0191
            com.whatsapp.jid.UserJid r0 = r3.A0D
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = "jid"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x007e:
            X.3ZH r0 = r1.A0A(r0)
            java.lang.String r5 = X.C18300x5.A0h(r2, r0)
            if (r4 == 0) goto L_0x0030
            boolean r0 = r4.A01
            if (r0 != r6) goto L_0x0097
            X.4AW r0 = r3.A0C
            if (r0 != 0) goto L_0x017e
            java.lang.String r0 = "listener"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0097:
            boolean r0 = r4 instanceof X.C22851Qi
            if (r0 != r6) goto L_0x00d8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "idverification/handleV1QrCodeError result = "
            X.C18260x0.A1S(r1, r0, r4)
            int r2 = r4.A00
            r0 = -4
            if (r2 == r0) goto L_0x0168
            r0 = -3
            java.lang.String r1 = "resources"
            r4 = 0
            if (r2 == r0) goto L_0x00cf
            r0 = -2
            if (r2 == r0) goto L_0x00c1
            r0 = 2
            if (r2 != r0) goto L_0x0030
            X.4AW r0 = r3.A0C
            if (r0 != 0) goto L_0x018d
            java.lang.String r0 = "listener"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00c1:
            android.content.res.Resources r2 = r3.A00
            if (r2 != 0) goto L_0x00ca
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x00ca:
            r1 = 2131894966(0x7f1222b6, float:1.9424752E38)
            goto L_0x0151
        L_0x00cf:
            android.content.res.Resources r2 = r3.A00
            if (r2 != 0) goto L_0x014e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x00d8:
            boolean r0 = r4 instanceof X.C22861Qj
            if (r0 != r6) goto L_0x0030
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "idverification/handleV3QrCodeError result = "
            X.C18260x0.A1S(r1, r0, r4)
            int r1 = r4.A00
            r4 = 0
            java.lang.String r0 = "resources"
            switch(r1) {
                case -22: goto L_0x00ef;
                case -21: goto L_0x00fc;
                case -20: goto L_0x00fc;
                case -19: goto L_0x00fc;
                case -18: goto L_0x00fc;
                case -17: goto L_0x00ef;
                case -16: goto L_0x0182;
                case -15: goto L_0x0182;
                case -14: goto L_0x0182;
                case -13: goto L_0x0109;
                case -12: goto L_0x0116;
                case -11: goto L_0x0123;
                case -10: goto L_0x0130;
                case -9: goto L_0x013d;
                default: goto L_0x00ee;
            }
        L_0x00ee:
            return
        L_0x00ef:
            android.content.res.Resources r2 = r3.A00
            if (r2 != 0) goto L_0x00f8
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00f8:
            r1 = 2131889372(0x7f120cdc, float:1.9413406E38)
            goto L_0x0151
        L_0x00fc:
            android.content.res.Resources r2 = r3.A00
            if (r2 != 0) goto L_0x0105
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0105:
            r1 = 2131889374(0x7f120cde, float:1.941341E38)
            goto L_0x0151
        L_0x0109:
            android.content.res.Resources r2 = r3.A00
            if (r2 != 0) goto L_0x0112
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0112:
            r1 = 2131889373(0x7f120cdd, float:1.9413408E38)
            goto L_0x0151
        L_0x0116:
            android.content.res.Resources r2 = r3.A00
            if (r2 != 0) goto L_0x011f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x011f:
            r1 = 2131889375(0x7f120cdf, float:1.9413412E38)
            goto L_0x0151
        L_0x0123:
            android.content.res.Resources r2 = r3.A00
            if (r2 != 0) goto L_0x012c
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x012c:
            r1 = 2131889376(0x7f120ce0, float:1.9413414E38)
            goto L_0x0151
        L_0x0130:
            android.content.res.Resources r1 = r3.A00
            if (r1 != 0) goto L_0x0139
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0139:
            r0 = 2131889377(0x7f120ce1, float:1.9413416E38)
            goto L_0x0149
        L_0x013d:
            android.content.res.Resources r1 = r3.A00
            if (r1 != 0) goto L_0x0146
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0146:
            r0 = 2131889378(0x7f120ce2, float:1.9413418E38)
        L_0x0149:
            java.lang.String r1 = r1.getString(r0)
            goto L_0x0157
        L_0x014e:
            r1 = 2131894967(0x7f1222b7, float:1.9424754E38)
        L_0x0151:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r1 = X.C18320x8.A0b(r2, r5, r0, r4, r1)
        L_0x0157:
            X.C162457s7.A0D(r1)
            com.whatsapp.WaTextView r0 = r3.A05
            if (r0 == 0) goto L_0x0161
            r0.setText(r1)
        L_0x0161:
            com.whatsapp.WaTextView r0 = r3.A05
            if (r0 == 0) goto L_0x0168
            r0.setVisibility(r4)
        L_0x0168:
            com.whatsapp.qrcode.WaQrScannerView r0 = r3.A0G
            if (r0 == 0) goto L_0x0030
            goto L_0x01aa
        L_0x016d:
            java.lang.String r0 = "QrScannerActivity/onQrCodeDetected"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r7.A00
            X.1pq r1 = (X.C32241pq) r1
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x0030
            r1.A77(r8)
            return
        L_0x017e:
            r0.BZE(r6)
            return
        L_0x0182:
            X.4AW r0 = r3.A0C
            if (r0 != 0) goto L_0x018d
            java.lang.String r0 = "listener"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x018d:
            r0.BZE(r4)
            return
        L_0x0191:
            java.lang.String r0 = "contactManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0198:
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01a0:
            X.3Wi r1 = r3.A02
            r0 = 2131888195(0x7f120843, float:1.9411018E38)
            r1.A0H(r0, r2)
        L_0x01a8:
            com.whatsapp.qrcode.WaQrScannerView r0 = r3.A06
        L_0x01aa:
            r0.Bjp()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86584Kr.BZC(java.lang.String):void");
    }
}
