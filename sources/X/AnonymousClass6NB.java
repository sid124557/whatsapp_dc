package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.msys.mci.DefaultCrypto;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.6NB  reason: invalid class name */
public abstract class AnonymousClass6NB extends C161797qU implements C184838sd {
    public AnonymousClass84O A00;
    public final long A01;

    public AnonymousClass6NB(C153427bI r5, AnonymousClass84O r6) {
        super(C141236vF.VIEW);
        this.A01 = (long) r6.A02;
        this.A00 = r6;
        C157267i1[] r2 = {new C157267i1(new C1682084n(r5, this), this), new C157267i1(new C1682184o(r5, this), this)};
        int i = 0;
        do {
            A0L(r2[i]);
            i++;
        } while (i < 2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: android.text.TextWatcher} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v84, resolved type: X.7z8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: X.7z8} */
    /* JADX WARNING: type inference failed for: r3v30, types: [android.text.TextWatcher] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0507  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x050d  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0526  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0M(android.view.View r24, X.C153427bI r25, X.AnonymousClass84O r26, java.lang.Object r27) {
        /*
            r23 = this;
            r11 = r24
            r1 = r23
            boolean r0 = r1 instanceof X.C131106d3
            if (r0 == 0) goto L_0x001e
            X.6d3 r1 = (X.C131106d3) r1
            X.84O r4 = r1.A00
            java.lang.String r3 = X.AnonymousClass84O.A07(r4)
            r2 = 35
            r0 = 0
            boolean r2 = r4.A0W(r2, r0)
            X.8vU r0 = r1.A01
            r0.Ay3(r11, r3, r2)
        L_0x001c:
            r0 = 0
            return r0
        L_0x001e:
            boolean r0 = r1 instanceof X.C131096d2
            r2 = r25
            if (r0 == 0) goto L_0x0099
            X.6d2 r1 = (X.C131096d2) r1
            X.84O r3 = r1.A00
            r0 = 52
            r1 = 1
            boolean r15 = r3.A0W(r0, r1)
            r0 = 56
            boolean r14 = r3.A0W(r0, r1)
            r0 = 59
            r5 = 0
            boolean r16 = r3.A0W(r0, r5)
            r0 = 44
            java.util.List r0 = r3.A0S(r0)
            java.util.Iterator r9 = r0.iterator()
            r8 = 0
            r13 = r8
            r12 = r8
            r7 = 0
            r6 = 0
        L_0x004b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x007b
            java.lang.Object r4 = r9.next()
            X.84O r4 = (X.AnonymousClass84O) r4
            r1 = 36
            java.lang.String r0 = "regular"
            java.lang.String r1 = r4.A0P(r1, r0)
            java.lang.String r0 = "hd"
            boolean r3 = r1.equals(r0)
            r1 = 35
            r0 = 41
            if (r3 == 0) goto L_0x0088
            android.net.Uri r13 = X.AnonymousClass84O.A02(r4)
            int r7 = r4.A0E(r0, r5)
            int r6 = r4.A0E(r1, r5)
        L_0x0077:
            if (r13 == 0) goto L_0x004b
            if (r12 == 0) goto L_0x004b
        L_0x007b:
            android.content.Context r0 = r2.A00
            android.app.Activity r1 = X.C111095hX.A02(r0)
            if (r24 == 0) goto L_0x0087
            if (r12 != 0) goto L_0x0600
            if (r13 != 0) goto L_0x0600
        L_0x0087:
            return r8
        L_0x0088:
            android.net.Uri r12 = X.AnonymousClass84O.A02(r4)
            if (r7 == 0) goto L_0x0090
            if (r6 != 0) goto L_0x0077
        L_0x0090:
            int r7 = r4.A0E(r0, r5)
            int r6 = r4.A0E(r1, r5)
            goto L_0x0077
        L_0x0099:
            boolean r0 = r1 instanceof X.C131086d1
            if (r0 == 0) goto L_0x00f9
            X.6d1 r1 = (X.C131086d1) r1
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            X.84O r6 = r1.A00
            r0 = 42
            java.lang.Object r0 = X.AnonymousClass84O.A05(r6, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x00f4
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
        L_0x00af:
            r11.setScaleType(r0)
            r0 = 44
            X.84O r3 = r6.A0K(r0)
            if (r3 == 0) goto L_0x00c2
            r0 = 0
            int r0 = X.C154127ce.A01(r2, r3, r0)
            r11.setColorFilter(r0)
        L_0x00c2:
            r0 = 1
            X.761 r5 = new X.761
            r5.<init>(r2, r0, r3)
            r0 = 0
            X.35t r4 = new X.35t
            r4.<init>(r2, r0)
            X.8vU r3 = r1.A01
            r0 = 38
            java.lang.Object r1 = X.AnonymousClass84O.A05(r6, r0)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 41
            java.lang.Object r0 = X.AnonymousClass84O.A05(r6, r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r13 = X.AnonymousClass84O.A06(r6)
            java.lang.String r14 = X.AnonymousClass84O.A07(r6)
            r6 = r3
            r7 = r11
            r8 = r4
            r9 = r5
            r10 = r2
            r11 = r1
            r12 = r0
            r6.Ay0(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x001c
        L_0x00f4:
            android.widget.ImageView$ScaleType r0 = X.C162407s0.A0C(r0)     // Catch:{ 6u2 -> 0x0612 }
            goto L_0x00af
        L_0x00f9:
            boolean r0 = r1 instanceof X.C131076d0
            if (r0 == 0) goto L_0x01ba
            X.6d0 r1 = (X.C131076d0) r1
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            X.84O r5 = r1.A00
            r0 = 41
            java.lang.Object r9 = X.AnonymousClass84O.A05(r5, r0)
            java.lang.String r9 = (java.lang.String) r9
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x0125
            r0 = 36
            java.lang.Object r0 = X.AnonymousClass84O.A05(r5, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0125
            r0 = 36
            java.lang.Object r9 = X.AnonymousClass84O.A05(r5, r0)
            java.lang.String r9 = (java.lang.String) r9
        L_0x0125:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0166
            r0 = 44
            X.48t r0 = r5.A0L(r0)
            if (r0 != 0) goto L_0x01b3
            r8 = 0
        L_0x0134:
            X.C162377rs.A05(r2, r5)
            X.8vU r7 = r1.A01
            android.net.Uri r6 = android.net.Uri.parse(r9)
            java.lang.String r3 = r6.getHost()
            java.lang.String r0 = "static.whatsapp.net"
            boolean r4 = r0.equals(r3)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r6.getHost()
            r3.append(r0)
            java.lang.String r0 = r6.getPath()
            if (r4 == 0) goto L_0x015f
            r3.append(r0)
            java.lang.String r0 = r6.getQuery()
        L_0x015f:
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r3)
            r7.B1z(r11, r8, r9, r0)
        L_0x0166:
            r0 = 46
            X.84O r3 = r5.A0K(r0)
            if (r3 == 0) goto L_0x0186
            r0 = 36
            java.lang.Object r3 = X.AnonymousClass84O.A05(r3, r0)
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0186
            X.8vU r1 = r1.A01
            r0 = 0
            byte[] r0 = android.util.Base64.decode(r3, r0)
            r1.B20(r11, r0)
        L_0x0186:
            java.lang.String r0 = X.AnonymousClass84O.A08(r5)
            if (r0 != 0) goto L_0x01a3
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_CROP
        L_0x018e:
            r11.setScaleType(r4)
            r0 = 35
            X.84O r1 = r5.A0K(r0)
            if (r1 == 0) goto L_0x001c
            r0 = 0
            int r0 = X.C154127ce.A01(r2, r1, r0)
            r11.setColorFilter(r0)
            goto L_0x001c
        L_0x01a3:
            android.widget.ImageView$ScaleType r4 = X.C162407s0.A0C(r0)     // Catch:{ 6u2 -> 0x01a8 }
            goto L_0x018e
        L_0x01a8:
            r3 = move-exception
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_CROP
            java.lang.String r1 = "WaRcCoreBloksImageComponentBinderUtils"
            java.lang.String r0 = "Failed to parse Image scaleType"
            X.C159737mN.A00(r2, r1, r0, r3)
            goto L_0x018e
        L_0x01b3:
            X.2vT r8 = new X.2vT
            r8.<init>(r2, r5, r0)
            goto L_0x0134
        L_0x01ba:
            boolean r3 = r1 instanceof X.C131126d5
            r0 = r26
            if (r3 == 0) goto L_0x01db
            X.6d5 r1 = (X.C131126d5) r1
            r6 = 0
            r11.setFocusable(r6)
            r3 = 45
            java.lang.Object r3 = X.AnonymousClass84O.A05(r0, r3)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 41
            java.lang.Object r4 = X.AnonymousClass84O.A05(r0, r4)
            java.lang.String r4 = (java.lang.String) r4
            r8 = 0
            if (r4 == 0) goto L_0x0627
            goto L_0x0618
        L_0x01db:
            boolean r3 = r1 instanceof X.C131066cz
            if (r3 == 0) goto L_0x022d
            X.6cz r1 = (X.C131066cz) r1
            X.84O r8 = r1.A00
            r0 = 38
            java.lang.Object r14 = X.AnonymousClass84O.A05(r8, r0)
            java.lang.String r14 = (java.lang.String) r14
            r3 = 45
            java.lang.String r0 = "image"
            java.lang.String r15 = r8.A0P(r3, r0)
            r0 = 43
            java.lang.Object r7 = X.AnonymousClass84O.A05(r8, r0)
            java.lang.String r7 = (java.lang.String) r7
            r0 = 46
            java.lang.Object r6 = X.AnonymousClass84O.A05(r8, r0)
            java.lang.String r6 = (java.lang.String) r6
            r0 = 42
            java.lang.Object r5 = X.AnonymousClass84O.A05(r8, r0)
            java.lang.String r5 = (java.lang.String) r5
            X.7H5 r13 = new X.7H5
            r13.<init>(r2, r8)
            java.lang.ref.WeakReference r4 = X.AnonymousClass0x9.A14(r2)
            java.lang.ref.WeakReference r3 = X.AnonymousClass0x9.A14(r8)
            r0 = 0
            X.761 r12 = new X.761
            r12.<init>(r3, r0, r4)
            X.8uN r9 = r1.A01
            android.content.Context r10 = r2.A00
            r18 = r5
            r16 = r7
            r17 = r6
            r9.Axy(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x001c
        L_0x022d:
            boolean r3 = r1 instanceof X.C131136d6
            if (r3 == 0) goto L_0x0312
            X.6d6 r1 = (X.C131136d6) r1
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            boolean r3 = X.AnonymousClass0x2.A1Y(r11, r2)
            android.content.Context r4 = r2.A00
            java.io.File r2 = r4.getCacheDir()
            java.lang.String r0 = "avatar_image"
            java.io.File r2 = X.AnonymousClass002.A0A(r2, r0)
            r2.mkdirs()
            java.lang.String r0 = "TEMP_SELFIE.jpg"
            java.io.File r0 = X.AnonymousClass002.A0A(r2, r0)
            X.7J2 r2 = new X.7J2
            r2.<init>()
            java.lang.String r0 = r0.getCanonicalPath()
            r2.A00 = r0
            r2.A02 = r3
            r2.A01 = r3
            X.7yZ r3 = new X.7yZ
            r3.<init>((X.AnonymousClass7J2) r2)
            X.7H4 r2 = r1.A02
            X.7RY r0 = r1.A03
            X.7lC r5 = new X.7lC
            r5.<init>(r4, r3, r2, r0)
            r1.A00 = r5
            r5.A00 = r11
            X.9oA r6 = r5.A03
            java.lang.String r3 = "null cannot be cast to non-null type com.facebook.cameracore.litecamera.LiteCameraController"
            if (r6 != 0) goto L_0x029c
            X.7RY r0 = r5.A09
            X.82F r2 = new X.82F
            r2.<init>(r5)
            X.6d6 r0 = r0.A00
            X.9oA r6 = r0.A01
            r6.Bn4(r2)     // Catch:{ all -> 0x0296 }
            r2 = 921600(0xe1000, float:1.291437E-39)
            r6.Bnm(r2)     // Catch:{ all -> 0x0296 }
            r0 = 1048576(0x100000, float:1.469368E-39)
            r6.Bmu(r0)     // Catch:{ all -> 0x0296 }
            r6.Bn5(r2)     // Catch:{ all -> 0x0296 }
            r0 = 1
            r6.Bmm(r0)     // Catch:{ all -> 0x0296 }
            goto L_0x029a
        L_0x0296:
            r0 = move-exception
            X.C57682u2.A00(r0)
        L_0x029a:
            r5.A03 = r6
        L_0x029c:
            X.C162457s7.A0K(r6, r3)
            r0 = 1
            r6.BmQ(r0)     // Catch:{ all -> 0x02a6 }
            X.2wD r2 = X.C59022wD.A00     // Catch:{ all -> 0x02a6 }
            goto L_0x02ac
        L_0x02a6:
            r0 = move-exception
            X.3Z0 r2 = new X.3Z0
            r2.<init>(r0)
        L_0x02ac:
            java.lang.Throwable r3 = X.AnonymousClass3Z9.A00(r2)
            if (r3 == 0) goto L_0x02b9
            java.lang.String r2 = "AESelfieViewProvider"
            java.lang.String r0 = "Unable to set initial camera facing"
            X.C162477s9.A0A(r2, r0, r3)
        L_0x02b9:
            android.content.Context r4 = r5.A06
            android.view.View r2 = r6.B5D(r4)
            android.widget.FrameLayout r0 = r5.A00
            if (r0 == 0) goto L_0x02c6
            r0.addView(r2)
        L_0x02c6:
            X.7yZ r3 = r5.A07
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x02da
            X.4NO r2 = new X.4NO
            r2.<init>(r4)
            r5.A02 = r2
            android.widget.FrameLayout r0 = r5.A00
            if (r0 == 0) goto L_0x02da
            r0.addView(r2)
        L_0x02da:
            X.82E r0 = new X.82E
            r0.<init>(r4, r3, r5)
            r5.A01 = r0
            com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager r0 = r0.A02
            r5.A04 = r0
            r6.Bk9()
            android.app.Activity r5 = r5.A01(r4)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0300
            X.46A r0 = X.AnonymousClass788.A00
            X.4C6 r4 = X.AnonymousClass349.A02(r0)
            r3 = 0
            com.facebook.avatar.autogen.view.AESelfieViewProvider$increaseBrightness$1 r2 = new com.facebook.avatar.autogen.view.AESelfieViewProvider$increaseBrightness$1
            r2.<init>(r5, r3)
            r0 = 3
            X.C616131n.A02(r3, r2, r4, r3, r0)
        L_0x0300:
            X.7OZ r2 = r1.A04
            android.content.Context r1 = r2.A05
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Application"
            X.C162457s7.A0K(r1, r0)
            android.app.Application r1 = (android.app.Application) r1
            android.app.Application$ActivityLifecycleCallbacks r0 = r2.A04
            r1.registerActivityLifecycleCallbacks(r0)
            goto L_0x001c
        L_0x0312:
            boolean r3 = r1 instanceof X.C131056cy
            if (r3 == 0) goto L_0x0336
            X.6cy r1 = (X.C131056cy) r1
            X.03n r11 = (X.AnonymousClass03n) r11
            X.8vU r3 = r1.A01
            X.C1449673q.A00(r11, r2, r0, r3)
            X.84O r1 = r1.A00
            r0 = 46
            X.84O r1 = r1.A0K(r0)
            if (r1 == 0) goto L_0x0331
            r0 = 0
            int r0 = X.C154127ce.A01(r2, r1, r0)
            r11.setTextColor(r0)
        L_0x0331:
            r3.BmV(r11)
            goto L_0x001c
        L_0x0336:
            boolean r3 = r1 instanceof X.C130986cr
            if (r3 == 0) goto L_0x034d
            r1 = 35
            X.48t r3 = r0.A0L(r1)
            if (r3 == 0) goto L_0x001c
            r1 = 0
            X.3aJ r4 = new X.3aJ
            r4.<init>(r0, r3, r2, r1)
        L_0x0348:
            r11.post(r4)
            goto L_0x001c
        L_0x034d:
            boolean r3 = r1 instanceof X.C130976cq
            if (r3 == 0) goto L_0x0361
            r1 = 35
            X.48t r3 = r0.A0L(r1)
            if (r3 == 0) goto L_0x001c
            r1 = 49
            X.8Mj r4 = new X.8Mj
            r4.<init>(r0, r3, r2, r1)
            goto L_0x0348
        L_0x0361:
            boolean r3 = r1 instanceof X.C131046cx
            if (r3 == 0) goto L_0x03a0
            X.6cx r1 = (X.C131046cx) r1
            r3 = 40
            r4 = -1
            int r14 = r0.A0E(r3, r4)
            r3 = 38
            int r15 = r0.A0E(r3, r4)
            r3 = 42
            int r16 = r0.A0E(r3, r4)
            r3 = 35
            int r17 = r0.A0E(r3, r4)
            X.84O r4 = r1.A00
            r3 = 36
            r0 = 1065353216(0x3f800000, float:1.0)
            float r13 = r4.A0B(r3, r0)
            r0 = 41
            X.48t r3 = r4.A0L(r0)
            r0 = 0
            if (r3 == 0) goto L_0x039e
            X.7KP r12 = new X.7KP
            r12.<init>(r2, r4, r3)
        L_0x0398:
            X.8vU r10 = r1.A01
            r10.Ay2(r11, r12, r13, r14, r15, r16, r17)
            return r0
        L_0x039e:
            r12 = r0
            goto L_0x0398
        L_0x03a0:
            boolean r3 = r1 instanceof X.C131016cu
            if (r3 == 0) goto L_0x03c7
            r1 = 2131432722(0x7f0b1512, float:1.848721E38)
            android.view.View r3 = X.C06560Yg.A02(r11, r1)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            r1 = 35
            X.84O r1 = r0.A0K(r1)
            if (r3 == 0) goto L_0x001c
            if (r1 == 0) goto L_0x001c
            r0 = 0
            int r2 = X.C154127ce.A01(r2, r1, r0)
            android.graphics.drawable.Drawable r1 = r3.getIndeterminateDrawable()
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.setColorFilter(r2, r0)
            goto L_0x001c
        L_0x03c7:
            boolean r3 = r1 instanceof X.C131006ct
            if (r3 == 0) goto L_0x03d4
            X.6ct r1 = (X.C131006ct) r1
            X.8vU r1 = r1.A00
            X.C1449473o.A00(r11, r2, r0, r1)
            goto L_0x001c
        L_0x03d4:
            boolean r3 = r1 instanceof X.C131116d4
            if (r3 == 0) goto L_0x0558
            X.6d4 r1 = (X.C131116d4) r1
            java.lang.Object r8 = X.C162377rs.A05(r2, r0)
            r8.getClass()
            X.8Cu r8 = (X.C170338Cu) r8
            X.8vU r10 = r1.A00
            android.content.Context r3 = r2.A00
            android.app.Activity r4 = X.C111095hX.A02(r3)
            r7 = 0
            r3 = 41
            boolean r3 = r0.A0W(r3, r7)
            if (r3 == 0) goto L_0x03fd
            android.view.Window r4 = r4.getWindow()
            r3 = 8192(0x2000, float:1.14794E-41)
            r4.setFlags(r3, r3)
        L_0x03fd:
            java.lang.String r3 = r8.A05
            android.util.Pair r3 = X.C159757mP.A01(r11, r2, r0, r3)
            java.lang.Object r9 = r3.first
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            java.lang.Object r6 = r3.second
            com.google.android.material.textfield.TextInputEditText r6 = (com.google.android.material.textfield.TextInputEditText) r6
            r8.A04 = r6
            r3 = 49
            java.lang.Object r4 = X.AnonymousClass84O.A05(r0, r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = "true"
            boolean r3 = r3.equals(r4)
            r3 = r3 ^ 1
            r6.setEnabled(r3)
            r6.setFocusableInTouchMode(r3)
            r6.setFocusable(r3)
            r5 = 1
            r6.setCursorVisible(r3)
            android.text.TextWatcher r3 = r8.A03
            if (r3 != 0) goto L_0x0441
            r11 = 58
            r3 = 0
            long r15 = r0.A0F(r11, r3)
            X.7z8 r3 = new X.7z8
            r11 = r3
            r12 = r2
            r13 = r0
            r14 = r8
            r11.<init>(r12, r13, r14, r15)
            r8.A03 = r3
        L_0x0441:
            r6.addTextChangedListener(r3)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            android.text.InputFilter r3 = r10.BA1()
            r4.add(r3)
            r3 = 54
            java.lang.Object r11 = X.AnonymousClass84O.A05(r0, r3)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x0469
            java.lang.String r3 = "lowercase"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x0549
            X.6E7 r3 = new X.6E7
            r3.<init>(r1)
        L_0x0466:
            r4.add(r3)
        L_0x0469:
            r3 = 44
            r1 = -1
            int r3 = r0.A0E(r3, r1)
            if (r3 < 0) goto L_0x047a
            android.text.InputFilter$LengthFilter r1 = new android.text.InputFilter$LengthFilter
            r1.<init>(r3)
            r4.add(r1)
        L_0x047a:
            android.text.InputFilter[] r1 = new android.text.InputFilter[r7]
            java.lang.Object[] r1 = r4.toArray(r1)
            android.text.InputFilter[] r1 = (android.text.InputFilter[]) r1
            r6.setFilters(r1)
            r1 = 55
            java.lang.Object r12 = X.AnonymousClass84O.A05(r0, r1)
            java.lang.String r12 = (java.lang.String) r12
            r1 = 45
            java.lang.Object r4 = X.AnonymousClass84O.A05(r0, r1)
            java.lang.String r4 = (java.lang.String) r4
            r1 = 53
            java.lang.Object r3 = X.AnonymousClass84O.A05(r0, r1)
            java.lang.String r3 = (java.lang.String) r3
            r1 = 59
            java.lang.Object r1 = X.AnonymousClass84O.A05(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            r11 = 0
            if (r1 == 0) goto L_0x0532
            int r1 = X.C159757mP.A00(r2, r1)
            if (r1 == 0) goto L_0x0546
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
        L_0x04b2:
            if (r3 == 0) goto L_0x04c1
            if (r4 != 0) goto L_0x04b8
            if (r12 == 0) goto L_0x04c1
        L_0x04b8:
            android.text.TextWatcher r1 = r10.B9L(r6, r3, r12, r4)
            r8.A02 = r1
            r6.addTextChangedListener(r1)
        L_0x04c1:
            android.text.TextWatcher r4 = r8.A02
            if (r4 == 0) goto L_0x04cc
            android.text.Editable r1 = r6.getEditableText()
            r4.afterTextChanged(r1)
        L_0x04cc:
            int r10 = r8.A01
            if (r10 < 0) goto L_0x0526
            int r4 = r8.A00
            if (r4 < r10) goto L_0x0526
            java.lang.String r1 = r8.A05
            int r1 = r1.length()
            if (r4 > r1) goto L_0x0526
            r6.setSelection(r10, r4)
        L_0x04df:
            r1 = 46
            X.48t r8 = r0.A0L(r1)
            if (r8 == 0) goto L_0x04fd
            r4 = 7
            X.5f5 r1 = new X.5f5
            r1.<init>((X.C153427bI) r2, (X.AnonymousClass84O) r0, (X.C835248t) r8, (int) r4)
            r9.setOnClickListener(r1)
            r0 = 2131434234(0x7f0b1afa, float:1.8490276E38)
            android.view.View r0 = X.C06560Yg.A02(r9, r0)
            r0.setOnClickListener(r1)
            r0.setFocusable(r7)
        L_0x04fd:
            java.util.Locale r0 = java.util.Locale.getDefault()
            int r0 = X.AnonymousClass0I0.A00(r0)
            if (r0 != r5) goto L_0x0508
            r7 = 1
        L_0x0508:
            r1 = 5
            r2 = 3
            r0 = 3
            if (r7 == 0) goto L_0x050e
            r0 = 5
        L_0x050e:
            r9.setGravity(r0)
            if (r7 != 0) goto L_0x0514
            r1 = 3
        L_0x0514:
            r6.setGravity(r1)
            if (r3 == 0) goto L_0x0525
            int r1 = r3.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x0681
            if (r1 == r2) goto L_0x0681
            r0 = 4
            if (r1 == r0) goto L_0x0681
        L_0x0525:
            return r11
        L_0x0526:
            java.lang.String r1 = r8.A05
            if (r1 == 0) goto L_0x04df
            int r1 = r1.length()
            r6.setSelection(r1)
            goto L_0x04df
        L_0x0532:
            if (r3 == 0) goto L_0x0546
            int r1 = X.C162407s0.A08(r3)     // Catch:{ 6u2 -> 0x053e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ 6u2 -> 0x053e }
            goto L_0x04b2
        L_0x053e:
            r4 = move-exception
            java.lang.String r3 = "WaRcFormInputComponentBinderUtils"
            java.lang.String r1 = "Error parsing text input type"
            X.C159737mN.A00(r2, r3, r1, r4)
        L_0x0546:
            r3 = r11
            goto L_0x04c1
        L_0x0549:
            java.lang.String r1 = "uppercase"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0469
            android.text.InputFilter$AllCaps r3 = new android.text.InputFilter$AllCaps
            r3.<init>()
            goto L_0x0466
        L_0x0558:
            boolean r3 = r1 instanceof X.C131036cw
            if (r3 == 0) goto L_0x05bd
            X.6cw r1 = (X.C131036cw) r1
            android.content.Context r10 = r2.A00
            X.84O r5 = r1.A00
            java.lang.String r13 = X.AnonymousClass84O.A08(r5)
            java.lang.String r14 = X.AnonymousClass84O.A06(r5)
            r0 = 48
            r3 = 0
            long r19 = r5.A0F(r0, r3)
            r0 = 43
            r6 = 0
            int r18 = r5.A0E(r0, r6)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r0 = 38
            r3 = 1
            boolean r0 = r5.A0W(r0, r3)
            boolean r0 = X.C18320x8.A1W(r4, r0)
            r21 = r0 ^ 1
            r0 = 46
            boolean r0 = r5.A0W(r0, r6)
            boolean r0 = X.C18320x8.A1W(r4, r0)
            r3 = r3 ^ r0
            r0 = 41
            java.lang.Object r15 = X.AnonymousClass84O.A05(r5, r0)
            java.lang.String r15 = (java.lang.String) r15
            r0 = 45
            java.lang.Object r4 = X.AnonymousClass84O.A05(r5, r0)
            java.lang.String r4 = (java.lang.String) r4
            r0 = 50
            java.lang.Object r0 = X.AnonymousClass84O.A05(r5, r0)
            java.lang.String r0 = (java.lang.String) r0
            X.7Sw r12 = new X.7Sw
            r12.<init>(r2, r5, r1)
            X.8vU r9 = r1.A01
            r22 = r3
            r16 = r4
            r17 = r0
            r9.Axz(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22)
            goto L_0x001c
        L_0x05bd:
            boolean r3 = r1 instanceof X.C131026cv
            if (r3 == 0) goto L_0x05f7
            X.6cv r1 = (X.C131026cv) r1
            X.84O r5 = r1.A00
            long r8 = X.C1449373n.A00(r5)
            r3 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001c
            r0 = 38
            java.lang.Object r3 = X.AnonymousClass84O.A05(r5, r0)
            java.lang.String r3 = (java.lang.String) r3
            r0 = 2131433873(0x7f0b1991, float:1.8489544E38)
            android.widget.TextView r0 = X.C18300x5.A0G(r11, r0)
            r0.setText(r3)
            java.lang.Object r3 = X.C162377rs.A05(r2, r5)
            X.7Cq r3 = (X.C147057Cq) r3
            X.6Dg r4 = new X.6Dg
            r5 = r11
            r6 = r2
            r7 = r1
            r4.<init>(r5, r6, r7, r8)
            android.os.CountDownTimer r0 = r4.start()
            r3.A00 = r0
            goto L_0x001c
        L_0x05f7:
            X.6cs r1 = (X.C130996cs) r1
            X.8vU r1 = r1.A00
            X.C1449273m.A00(r11, r2, r0, r1)
            goto L_0x001c
        L_0x0600:
            r0 = 2131434675(0x7f0b1cb3, float:1.849117E38)
            android.view.View r0 = r11.findViewById(r0)
            com.whatsapp.videoplayback.BloksVideoPlayerView r0 = (com.whatsapp.videoplayback.BloksVideoPlayerView) r0
            X.7Zd r11 = new X.7Zd
            r11.<init>(r12, r13, r14, r15, r16)
            r0.A03(r1, r11)
            return r8
        L_0x0612:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)
            throw r0
        L_0x0618:
            int r4 = X.C162407s0.A07(r4)     // Catch:{ 6u2 -> 0x0621 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)     // Catch:{ 6u2 -> 0x0621 }
            goto L_0x0628
        L_0x0621:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)
            throw r0
        L_0x0627:
            r15 = r8
        L_0x0628:
            java.lang.String r19 = X.AnonymousClass84O.A06(r0)
            java.lang.String r18 = X.AnonymousClass84O.A08(r0)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r4 = 43
            r5 = 1
            boolean r4 = r0.A0W(r4, r5)
            boolean r4 = X.C18320x8.A1W(r7, r4)
            r21 = r4 ^ 1
            r4 = 44
            boolean r4 = r0.A0W(r4, r5)
            boolean r4 = X.C18320x8.A1W(r7, r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x067e
            r4 = 42
            X.84O r4 = r0.A0K(r4)
            if (r4 == 0) goto L_0x067c
            int r4 = X.C154127ce.A01(r2, r4, r6)
        L_0x0659:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
        L_0x065d:
            r4 = 36
            int r20 = r0.A0E(r4, r6)
            X.91U r12 = new X.91U
            r12.<init>(r0, r6)
            X.91T r13 = new X.91T
            r13.<init>(r2, r0, r6)
            X.91T r14 = new X.91T
            r14.<init>(r2, r0, r5)
            X.8vU r9 = r1.A00
            android.content.Context r10 = r2.A00
            r17 = r3
            r9.Axx(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r8
        L_0x067c:
            r4 = 0
            goto L_0x0659
        L_0x067e:
            r16 = r8
            goto L_0x065d
        L_0x0681:
            r6.setTextDirection(r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NB.A0M(android.view.View, X.7bI, X.84O, java.lang.Object):java.lang.Object");
    }

    public void A0N(View view, C153427bI r5, AnonymousClass84O r6, Object obj, Object obj2) {
        Activity A02;
        if (this instanceof C131126d5) {
            Context context = r5.A00;
            CodeInputField codeInputField = (CodeInputField) C06560Yg.A02(view, R.id.code);
            codeInputField.removeTextChangedListener(codeInputField.A04);
            if (codeInputField.getTag() != null) {
                codeInputField.removeCallbacks((Runnable) codeInputField.getTag());
            }
            ((ViewGroup) view).removeAllViews();
            A02 = C111095hX.A02(context);
        } else if (this instanceof C131116d4) {
            ((ViewGroup) C06560Yg.A02(view, R.id.container)).removeAllViews();
            A02 = C111095hX.A02(r5.A00);
        } else {
            return;
        }
        A02.getWindow().clearFlags(DefaultCrypto.BUFFER_SIZE);
    }

    public void A0O(View view, C153427bI r8, AnonymousClass84O r9, Object obj, Object obj2) {
        if (this instanceof C131106d3) {
            ((C131106d3) this).A01.BrJ(view);
        } else if (this instanceof C131096d2) {
            ((C131096d2) this).A01.BrG(view);
        } else if (this instanceof C131086d1) {
            ImageView imageView = (ImageView) view;
            imageView.setImageBitmap((Bitmap) null);
            imageView.setImageDrawable((Drawable) null);
            imageView.setColorFilter((ColorFilter) null);
        } else if (this instanceof C131076d0) {
            ImageView imageView2 = (ImageView) view;
            imageView2.setImageDrawable((Drawable) null);
            imageView2.setTag((Object) null);
            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView2.setColorFilter((ColorFilter) null);
            imageView2.setScaleX(1.0f);
        } else if (this instanceof C131126d5) {
        } else {
            if (this instanceof C131066cz) {
                C131066cz r2 = (C131066cz) this;
                r2.A01.BrH((C179088ia) C162377rs.A05(r8, r2.A00));
            } else if (this instanceof C131136d6) {
                C131136d6 r22 = (C131136d6) this;
                ViewGroup viewGroup = (ViewGroup) view;
                C162457s7.A0J(viewGroup, 0);
                C159147lC r1 = r22.A00;
                if (r1 == null) {
                    throw C18270x1.A0S("selfieViewProvider");
                }
                C203699oA r0 = r1.A03;
                if (r0 != null) {
                    r0.destroy();
                }
                C159147lC.A00(r1);
                r1.A03 = null;
                r1.A01 = null;
                viewGroup.removeAllViews();
                AnonymousClass7OZ r23 = r22.A04;
                Context context = r23.A05;
                C162457s7.A0K(context, "null cannot be cast to non-null type android.app.Application");
                ((Application) context).unregisterActivityLifecycleCallbacks(r23.A04);
            } else if (this instanceof C131056cy) {
                ((TextView) view).setText("");
            } else if (!(this instanceof C130986cr) && !(this instanceof C130976cq) && !(this instanceof C131046cx) && !(this instanceof C131016cu)) {
                if (this instanceof C131006ct) {
                    ((RecyclerView) C06560Yg.A02(view, R.id.recycler_view)).setAdapter((AnonymousClass0R6) null);
                } else if (this instanceof C131116d4) {
                    C170338Cu r5 = (C170338Cu) C162377rs.A05(r8, r9);
                    r5.A04 = null;
                    if (((ViewGroup) C06560Yg.A02(view, R.id.container)).getChildCount() != 0) {
                        TextInputLayout textInputLayout = (TextInputLayout) C06560Yg.A02(view, R.id.default_text_input_layout);
                        EditText editText = (EditText) C06560Yg.A02(textInputLayout, R.id.text_view);
                        r5.A00 = editText.getSelectionEnd();
                        r5.A01 = editText.getSelectionStart();
                        r5.A05 = editText.getText().toString();
                        editText.removeTextChangedListener(r5.A03);
                        editText.setText("");
                        TextWatcher textWatcher = r5.A02;
                        if (textWatcher != null) {
                            editText.removeTextChangedListener(textWatcher);
                        }
                        editText.setFilters(C159757mP.A00);
                        editText.setTypeface(Typeface.DEFAULT);
                        editText.setEnabled(true);
                        editText.setFocusableInTouchMode(true);
                        editText.setFocusable(true);
                        editText.setCursorVisible(true);
                        textInputLayout.setPasswordVisibilityToggleEnabled(true);
                        textInputLayout.setError((CharSequence) null);
                        textInputLayout.setErrorEnabled(false);
                        textInputLayout.setHint((CharSequence) "");
                    }
                } else if (this instanceof C131036cw) {
                    TextView A0G = C18300x5.A0G(view, R.id.hintOrDate);
                    A0G.setOnClickListener((View.OnClickListener) null);
                    A0G.setText("");
                    A0G.setEnabled(false);
                    A0G.setClickable(false);
                    ((TextInputLayout) C06560Yg.A02(view, R.id.inputView)).setHint((CharSequence) "");
                } else if (this instanceof C131026cv) {
                    C131026cv r3 = (C131026cv) this;
                    C147057Cq r12 = (C147057Cq) C162377rs.A05(r8, r3.A00);
                    CountDownTimer countDownTimer = r12.A00;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                        r12.A00 = null;
                    }
                    r3.A01.BrI(view);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object B0R(Context context) {
        if (this instanceof C131106d3) {
            return C86654Ky.A0G(context, R.layout.f8nameremoved);
        }
        if (this instanceof C131096d2) {
            return C86654Ky.A0G(context, R.layout.f8nameremoved);
        }
        if ((this instanceof C131086d1) || (this instanceof C131076d0)) {
            return new WaImageView(context);
        }
        if (this instanceof C131126d5) {
            return C86654Ky.A0G(context, R.layout.f8nameremoved);
        }
        if (this instanceof C131066cz) {
            return C86654Ky.A0G(context, R.layout.f8nameremoved);
        }
        if (this instanceof C131136d6) {
            C162457s7.A0J(context, 0);
            return new FrameLayout(context);
        } else if (this instanceof C131056cy) {
            return new TextEmojiLabel(context);
        } else {
            if ((this instanceof C130986cr) || (this instanceof C130976cq)) {
                View view = new View(context);
                view.setVisibility(8);
                return view;
            } else if (this instanceof C131046cx) {
                return C86654Ky.A0G(context, R.layout.f8nameremoved);
            } else {
                if (this instanceof C131016cu) {
                    return C86654Ky.A0G(context, R.layout.f8nameremoved);
                }
                if (this instanceof C131006ct) {
                    return C86654Ky.A0G(context, R.layout.f8nameremoved);
                }
                if (this instanceof C131116d4) {
                    return C86654Ky.A0G(context, R.layout.f8nameremoved);
                }
                if (this instanceof C131036cw) {
                    return C86654Ky.A0G(context, R.layout.f8nameremoved);
                }
                if (this instanceof C131026cv) {
                    return C86654Ky.A0G(context, R.layout.f8nameremoved);
                }
                return C86654Ky.A0G(context, R.layout.f8nameremoved);
            }
        }
    }

    public /* synthetic */ Class BBU() {
        return getClass();
    }
}
