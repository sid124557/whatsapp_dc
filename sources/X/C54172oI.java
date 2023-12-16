package X;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.QrScannerOverlay;
import com.whatsapp.qrcode.WaQrScannerView;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: X.2oI  reason: invalid class name and case insensitive filesystem */
public final class C54172oI {
    public Resources A00;
    public View A01;
    public View A02;
    public Animation A03;
    public C69263Wi A04;
    public WaTextView A05;
    public WaTextView A06;
    public AnonymousClass5TW A07;
    public C64773Ex A08;
    public AnonymousClass5ZU A09;
    public AnonymousClass2NZ A0A;
    public C43622Sv A0B;
    public AnonymousClass4AW A0C;
    public UserJid A0D;
    public C59682xJ A0E;
    public QrScannerOverlay A0F;
    public WaQrScannerView A0G;
    public final Charset A0H;
    public final Map A0I;

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0086, code lost:
        if (X.C625535n.A02(r3, r4) == false) goto L_0x0088;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008d A[Catch:{ 6u5 -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0095 A[Catch:{ 6u5 -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009f A[Catch:{ 6u5 -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8 A[Catch:{ 6u5 -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d0 A[Catch:{ 6u5 -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00db A[Catch:{ 6u5 -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0104 A[Catch:{ 6u5 -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x010c A[Catch:{ 6u5 -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0116 A[Catch:{ 6u5 -> 0x014a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2KJ A00(byte[] r8) {
        /*
            r7 = this;
            r0 = 0
            X.C162457s7.A0J(r8, r0)
            X.2NZ r2 = r7.A0A
            r3 = 0
            if (r2 == 0) goto L_0x002c
            X.2Sv r0 = r7.A0B
            if (r0 == 0) goto L_0x0152
            com.facebook.simplejni.NativeHolder r1 = r2.A00
            if (r1 == 0) goto L_0x0033
            r0 = 3
            long r1 = com.whatsapp.wamsys.JniBridge.jvidispatchIOO(r0, r1, r8)
            int r0 = (int) r1
            X.1Qj r3 = new X.1Qj
            r3.<init>(r0)
        L_0x001c:
            int r1 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x002c
            r0 = -4
            if (r1 != r0) goto L_0x002d
            java.lang.String r0 = "idverification/invalidprotobuf"
        L_0x0029:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x002c:
            return r3
        L_0x002d:
            r0 = -1
            if (r1 != r0) goto L_0x002c
            java.lang.String r0 = "idverification/versionmismatch"
            goto L_0x0029
        L_0x0033:
            X.1CW r3 = r2.A02     // Catch:{ 6u5 -> 0x014a }
            X.1CW r0 = X.AnonymousClass1CW.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
            X.6cX r4 = X.C130786cX.A05(r0, r8)     // Catch:{ 6u5 -> 0x014a }
            X.1CW r4 = (X.AnonymousClass1CW) r4     // Catch:{ 6u5 -> 0x014a }
            int r1 = r4.bitField0_     // Catch:{ 6u5 -> 0x014a }
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0142
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0142
            r0 = r1 & 1
            if (r0 == 0) goto L_0x0142
            int r1 = r4.version_     // Catch:{ 6u5 -> 0x014a }
            int r0 = r3.version_     // Catch:{ 6u5 -> 0x014a }
            if (r1 != r0) goto L_0x0142
            X.1Bl r0 = r3.localFingerprint_     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x0057
            X.1Bl r0 = X.C21341Bl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
        L_0x0057:
            X.8Lq r1 = r0.identifier_     // Catch:{ 6u5 -> 0x014a }
            X.1Bl r0 = r4.remoteFingerprint_     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x005f
            X.1Bl r0 = X.C21341Bl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
        L_0x005f:
            X.8Lq r0 = r0.identifier_     // Catch:{ 6u5 -> 0x014a }
            boolean r0 = r1.equals(r0)     // Catch:{ 6u5 -> 0x014a }
            r2 = -2
            r6 = 1
            if (r0 == 0) goto L_0x0088
            X.1Bl r0 = r3.remoteFingerprint_     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x006f
            X.1Bl r0 = X.C21341Bl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
        L_0x006f:
            X.8Lq r1 = r0.identifier_     // Catch:{ 6u5 -> 0x014a }
            X.1Bl r0 = r4.localFingerprint_     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x0077
            X.1Bl r0 = X.C21341Bl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
        L_0x0077:
            X.8Lq r0 = r0.identifier_     // Catch:{ 6u5 -> 0x014a }
            boolean r0 = r1.equals(r0)     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x0081
            r5 = -2
            goto L_0x0089
        L_0x0081:
            boolean r0 = X.C625535n.A02(r3, r4)     // Catch:{ 6u5 -> 0x014a }
            r5 = 1
            if (r0 != 0) goto L_0x0089
        L_0x0088:
            r5 = 2
        L_0x0089:
            X.1Bl r0 = r3.localFingerprint_     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x008f
            X.1Bl r0 = X.C21341Bl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
        L_0x008f:
            X.8Lq r1 = r0.identifier_     // Catch:{ 6u5 -> 0x014a }
            X.1Bl r0 = r4.localFingerprint_     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x0097
            X.1Bl r0 = X.C21341Bl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
        L_0x0097:
            X.8Lq r0 = r0.identifier_     // Catch:{ 6u5 -> 0x014a }
            boolean r0 = r1.equals(r0)     // Catch:{ 6u5 -> 0x014a }
            if (r0 == 0) goto L_0x00c4
            X.1Bl r0 = r3.remoteFingerprint_     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x00a5
            X.1Bl r0 = X.C21341Bl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
        L_0x00a5:
            X.8Lq r1 = r0.identifier_     // Catch:{ 6u5 -> 0x014a }
            X.1Bl r0 = r4.remoteFingerprint_     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x00ad
            X.1Bl r0 = X.C21341Bl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
        L_0x00ad:
            X.8Lq r0 = r0.identifier_     // Catch:{ 6u5 -> 0x014a }
            boolean r0 = r1.equals(r0)     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x00bc
            X.1Qi r3 = new X.1Qi     // Catch:{ 6u5 -> 0x014a }
            r3.<init>(r2)     // Catch:{ 6u5 -> 0x014a }
            goto L_0x001c
        L_0x00bc:
            boolean r0 = X.C625535n.A01(r3, r4)     // Catch:{ 6u5 -> 0x014a }
            int r5 = X.C18280x3.A01(r0)
        L_0x00c4:
            X.1Bl r0 = r3.remoteFingerprint_     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x00ca
            X.1Bl r0 = X.C21341Bl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
        L_0x00ca:
            X.8Lq r1 = r0.identifier_     // Catch:{ 6u5 -> 0x014a }
            X.1Bl r0 = r4.localFingerprint_     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x00d2
            X.1Bl r0 = X.C21341Bl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
        L_0x00d2:
            X.8Lq r0 = r0.identifier_     // Catch:{ 6u5 -> 0x014a }
            boolean r0 = r1.equals(r0)     // Catch:{ 6u5 -> 0x014a }
            r2 = -3
            if (r0 == 0) goto L_0x0100
            X.1Bl r0 = r3.localFingerprint_     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x00e1
            X.1Bl r0 = X.C21341Bl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
        L_0x00e1:
            X.8Lq r1 = r0.identifier_     // Catch:{ 6u5 -> 0x014a }
            X.1Bl r0 = r4.remoteFingerprint_     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x00e9
            X.1Bl r0 = X.C21341Bl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
        L_0x00e9:
            X.8Lq r0 = r0.identifier_     // Catch:{ 6u5 -> 0x014a }
            boolean r0 = r1.equals(r0)     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x00f8
            X.1Qi r3 = new X.1Qi     // Catch:{ 6u5 -> 0x014a }
            r3.<init>(r2)     // Catch:{ 6u5 -> 0x014a }
            goto L_0x001c
        L_0x00f8:
            boolean r0 = X.C625535n.A02(r3, r4)     // Catch:{ 6u5 -> 0x014a }
            int r5 = X.C18280x3.A01(r0)
        L_0x0100:
            X.1Bl r0 = r3.remoteFingerprint_     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x0106
            X.1Bl r0 = X.C21341Bl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
        L_0x0106:
            X.8Lq r1 = r0.identifier_     // Catch:{ 6u5 -> 0x014a }
            X.1Bl r0 = r4.remoteFingerprint_     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x010e
            X.1Bl r0 = X.C21341Bl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
        L_0x010e:
            X.8Lq r0 = r0.identifier_     // Catch:{ 6u5 -> 0x014a }
            boolean r0 = r1.equals(r0)     // Catch:{ 6u5 -> 0x014a }
            if (r0 == 0) goto L_0x013b
            X.1Bl r0 = r3.localFingerprint_     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x011c
            X.1Bl r0 = X.C21341Bl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
        L_0x011c:
            X.8Lq r1 = r0.identifier_     // Catch:{ 6u5 -> 0x014a }
            X.1Bl r0 = r4.localFingerprint_     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x0124
            X.1Bl r0 = X.C21341Bl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x014a }
        L_0x0124:
            X.8Lq r0 = r0.identifier_     // Catch:{ 6u5 -> 0x014a }
            boolean r0 = r1.equals(r0)     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x0133
            X.1Qi r3 = new X.1Qi     // Catch:{ 6u5 -> 0x014a }
            r3.<init>(r2)     // Catch:{ 6u5 -> 0x014a }
            goto L_0x001c
        L_0x0133:
            boolean r0 = X.C625535n.A01(r3, r4)     // Catch:{ 6u5 -> 0x014a }
            if (r0 != 0) goto L_0x013a
            r6 = 2
        L_0x013a:
            r5 = r6
        L_0x013b:
            X.1Qi r3 = new X.1Qi     // Catch:{ 6u5 -> 0x014a }
            r3.<init>(r5)     // Catch:{ 6u5 -> 0x014a }
            goto L_0x001c
        L_0x0142:
            r0 = -1
            X.1Qi r3 = new X.1Qi     // Catch:{ 6u5 -> 0x014a }
            r3.<init>(r0)     // Catch:{ 6u5 -> 0x014a }
            goto L_0x001c
        L_0x014a:
            r0 = -4
            X.1Qi r3 = new X.1Qi
            r3.<init>(r0)
            goto L_0x001c
        L_0x0152:
            java.lang.String r0 = "fingerprintUtil"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54172oI.A00(byte[]):X.2KJ");
    }

    public final void A02(Runnable runnable) {
        View view;
        WaQrScannerView waQrScannerView = this.A0G;
        if (waQrScannerView != null && waQrScannerView.getVisibility() == 0) {
            C59682xJ r1 = this.A0E;
            if (r1 != null) {
                UserJid userJid = this.A0D;
                if (userJid == null) {
                    throw C18270x1.A0S("jid");
                }
                if (r1.A00(userJid)) {
                    view = this.A01;
                } else {
                    view = this.A06;
                }
                if (view != null) {
                    view.setVisibility(8);
                }
                AnonymousClass0x2.A0x(this.A02);
                QrScannerOverlay qrScannerOverlay = this.A0F;
                if (qrScannerOverlay != null) {
                    qrScannerOverlay.setVisibility(8);
                }
                WaTextView waTextView = this.A05;
                if (waTextView != null) {
                    waTextView.setVisibility(8);
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                translateAnimation.setInterpolator(new DecelerateInterpolator());
                Resources resources = this.A00;
                if (resources == null) {
                    throw C18270x1.A0S("resources");
                }
                translateAnimation.setDuration((long) resources.getInteger(17694721));
                translateAnimation.setAnimationListener(new AnonymousClass4H5(runnable, 2, this));
                View view2 = this.A02;
                if (view2 != null) {
                    view2.startAnimation(translateAnimation);
                    return;
                }
                return;
            }
            throw C18270x1.A0S("keyTransparencyManager");
        }
    }

    public C54172oI() {
        Charset charset = AnonymousClass79X.A00;
        this.A0H = charset;
        this.A0I = C57692u3.A04(C142466xF.A01, charset);
    }

    public final void A01(View view, AnonymousClass4AW r3, UserJid userJid) {
        C18260x0.A0O(view, userJid);
        this.A0D = userJid;
        this.A0C = r3;
        Resources resources = view.getResources();
        C162457s7.A0D(resources);
        this.A00 = resources;
        this.A02 = view.findViewById(R.id.main_layout);
        this.A0G = (WaQrScannerView) view.findViewById(R.id.qr_scanner_view);
        this.A0F = (QrScannerOverlay) view.findViewById(R.id.overlay);
        this.A01 = view.findViewById(R.id.footer);
        this.A06 = (WaTextView) view.findViewById(R.id.verify_identity_qr_tip);
        this.A05 = (WaTextView) view.findViewById(R.id.error_indicator);
    }
}
