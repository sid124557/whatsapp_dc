package com.whatsapp.crop;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass33O;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass5UE;
import X.AnonymousClass5Y0;
import X.C107535bT;
import X.C117615sD;
import X.C133846i2;
import X.C18260x0;
import X.C18320x8;
import X.C47912e2;
import X.C61072zf;
import X.C620633i;
import X.C64333Db;
import X.C69263Wi;
import X.C70333aK;
import X.C85244Fm;
import X.C86604Kt;
import X.C86614Ku;
import X.C89704el;
import X.C989053r;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class CropImage extends C89704el {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public Bitmap.CompressFormat A0A;
    public Bitmap A0B;
    public Matrix A0C;
    public Matrix A0D;
    public Rect A0E;
    public Uri A0F;
    public C69263Wi A0G;
    public C85244Fm A0H;
    public C620633i A0I;
    public C47912e2 A0J;
    public C61072zf A0K;
    public CropImageView A0L;
    public AnonymousClass5UE A0M;
    public C133846i2 A0N;
    public AnonymousClass5Y0 A0O;
    public AnonymousClass33O A0P;
    public C989053r A0Q;
    public String A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0038, code lost:
        if (r13.A01 == 0) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A0L(com.whatsapp.crop.CropImage r13, X.C44892Xw r14) {
        /*
            r10 = r13
            com.whatsapp.crop.CropImageView r1 = r13.A0L
            r0 = 1
            r1.A04(r14, r0)
            android.graphics.Bitmap r0 = r13.A0B
            int r7 = r0.getWidth()
            android.graphics.Bitmap r0 = r13.A0B
            int r4 = r0.getHeight()
            r0 = 0
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r0, r0, r7, r4)
            android.graphics.Rect r0 = r13.A0E
            if (r0 == 0) goto L_0x01a0
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>(r0)
        L_0x0022:
            com.whatsapp.crop.CropImageView r0 = r13.A0L
            X.5UE r2 = new X.5UE
            r2.<init>(r0)
            com.whatsapp.crop.CropImageView r0 = r13.A0L
            android.graphics.Matrix r3 = r0.getImageMatrix()
            boolean r8 = r13.A0S
            int r0 = r13.A00
            if (r0 == 0) goto L_0x003a
            int r0 = r13.A01
            r7 = 1
            if (r0 != 0) goto L_0x003b
        L_0x003a:
            r7 = 0
        L_0x003b:
            boolean r6 = r13.A0T
            int r4 = r13.A05
            int r0 = r13.A09
            int r4 = r4 / r0
            r1 = 1
            if (r8 == 0) goto L_0x0046
            r7 = 1
        L_0x0046:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r3)
            r2.A03 = r0
            r2.A05 = r9
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r5)
            r2.A06 = r0
            r3 = 0
            if (r7 != 0) goto L_0x005c
            if (r6 != 0) goto L_0x005c
            r1 = 0
        L_0x005c:
            r2.A0A = r1
            r2.A08 = r8
            r2.A01 = r4
            android.graphics.RectF r0 = r2.A05
            float r1 = r0.width()
            android.graphics.RectF r0 = r2.A05
            float r0 = r0.height()
            float r1 = r1 / r0
            r2.A00 = r1
            android.graphics.Rect r0 = r2.A03()
            r2.A04 = r0
            android.graphics.Paint r0 = r2.A0B
            r1 = 128(0x80, float:1.794E-43)
            r0.setARGB(r1, r3, r3, r3)
            android.graphics.Paint r0 = r2.A0C
            r0.setARGB(r1, r3, r3, r3)
            android.graphics.Paint r0 = r2.A0D
            X.C86634Kw.A17(r0)
            r0.setAntiAlias(r3)
            r2.A02 = r3
            com.whatsapp.crop.CropImageView r1 = r13.A0L
            java.util.ArrayList r0 = r1.A07
            r0.add(r2)
            r1.invalidate()
            r13.A0M = r2
            r0 = 2131428509(0x7f0b049d, float:1.8478664E38)
            android.view.View r1 = r13.findViewById(r0)
            r0 = 37
            X.C18290x4.A1G(r1, r13, r0)
            r0 = 2131431930(0x7f0b11fa, float:1.8485603E38)
            android.view.View r1 = r13.findViewById(r0)
            r0 = 38
            X.C18290x4.A1G(r1, r13, r0)
            r0 = 2131433183(0x7f0b16df, float:1.8488144E38)
            android.view.View r1 = r13.findViewById(r0)
            r0 = 39
            X.C18290x4.A1G(r1, r13, r0)
            boolean r0 = r13.A0T
            if (r0 == 0) goto L_0x00c6
            r0 = 8
            r1.setVisibility(r0)
        L_0x00c6:
            java.lang.String r0 = r13.A0R
            if (r0 == 0) goto L_0x0177
            X.3Wi r12 = r13.A0G
            X.33i r13 = r13.A0I
            X.4Fm r11 = r10.A0H
            r0 = 2131888365(0x7f1208ed, float:1.9411363E38)
            java.lang.String r0 = r10.getString(r0)
            java.lang.String r6 = "terms-and-privacy-policy"
            java.lang.String r14 = "https://www.whatsapp.com/legal/"
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableString r2 = X.AnonymousClass4L0.A0A(r0)
            int r1 = r2.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r5 = 0
            java.lang.Object[] r3 = r2.getSpans(r3, r1, r0)
            android.text.style.URLSpan[] r3 = (android.text.style.URLSpan[]) r3
            if (r3 == 0) goto L_0x019d
            int r1 = r3.length
        L_0x00f3:
            if (r5 >= r1) goto L_0x019d
            r4 = r3[r5]
            java.lang.String r0 = r4.getURL()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0199
            int r3 = r2.getSpanStart(r4)
            int r1 = r2.getSpanEnd(r4)
            int r0 = r2.getSpanFlags(r4)
            r2.removeSpan(r4)
            X.4b3 r9 = new X.4b3
            r9.<init>(r10, r11, r12, r13, r14)
            r2.setSpan(r9, r3, r1, r0)
        L_0x0118:
            r5 = -10066330(0xffffffffff666666, float:-3.0625412E38)
            r4 = 0
            r3 = 1069547520(0x3fc00000, float:1.5)
            r6 = 0
            if (r2 == 0) goto L_0x013b
            r0 = 2131434370(0x7f0b1b82, float:1.8490552E38)
            com.whatsapp.TextEmojiLabel r1 = X.C86664Kz.A0z(r10, r0)
            r1.setVisibility(r6)
            X.33i r0 = r10.A0I
            X.AnonymousClass0x2.A12(r1, r0)
            X.1VX r0 = r10.A01
            X.AnonymousClass0x2.A14(r0, r1)
            r1.setText(r2)
            r1.setShadowLayer(r3, r4, r3, r5)
        L_0x013b:
            X.3Wi r12 = r10.A0G
            X.33i r13 = r10.A0I
            X.4Fm r11 = r10.A0H
            java.lang.String r14 = r10.A0R
            X.4b3 r9 = new X.4b3
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.String r0 = r10.A0R
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r0 = r0.getHost()
            android.text.SpannableString r2 = X.AnonymousClass4L0.A0A(r0)
            int r0 = r2.length()
            r2.setSpan(r9, r6, r0, r6)
            r0 = 2131430685(0x7f0b0d1d, float:1.8483078E38)
            com.whatsapp.TextEmojiLabel r1 = X.C86664Kz.A0z(r10, r0)
            r1.setVisibility(r6)
            X.33i r0 = r10.A0I
            X.AnonymousClass0x2.A12(r1, r0)
            X.1VX r0 = r10.A01
            X.AnonymousClass0x2.A14(r0, r1)
            r1.setText(r2)
            r1.setShadowLayer(r3, r4, r3, r5)
        L_0x0177:
            r0 = 2131430678(0x7f0b0d16, float:1.8483064E38)
            android.view.View r3 = r10.findViewById(r0)
            android.graphics.Rect r2 = X.AnonymousClass001.A0N()
            com.whatsapp.crop.CropImageView r1 = r10.A0L
            X.4NF r0 = new X.4NF
            r0.<init>(r2, r1, r10)
            r3.setTouchDelegate(r0)
            java.lang.String r0 = "crop/oncreate/end"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4FS r1 = r10.A04
            X.2e2 r0 = r10.A0J
            X.C117615sD.A01(r1, r0)
            return
        L_0x0199:
            int r5 = r5 + 1
            goto L_0x00f3
        L_0x019d:
            r2 = 0
            goto L_0x0118
        L_0x01a0:
            boolean r0 = r13.A0T
            if (r0 == 0) goto L_0x020a
            int r0 = r13.A06
            if (r0 >= r7) goto L_0x0207
            int r1 = r13.A07
            if (r1 >= r7) goto L_0x0207
            float r2 = (float) r7
            float r1 = (float) r1
            float r2 = r2 * r1
            float r0 = (float) r0
            float r2 = r2 / r0
            int r6 = (int) r2
            r0 = r7
        L_0x01b3:
            int r3 = r13.A00
            if (r3 == 0) goto L_0x01c0
            int r1 = r13.A01
            if (r1 == 0) goto L_0x01c0
            if (r3 <= r1) goto L_0x0203
            int r1 = r1 * r0
            int r6 = r1 / r3
        L_0x01c0:
            if (r6 <= r4) goto L_0x01c9
            float r2 = (float) r6
            float r1 = (float) r4
            float r2 = r2 / r1
            float r0 = (float) r0
            float r0 = r0 / r2
            int r0 = (int) r0
            r6 = r4
        L_0x01c9:
            if (r0 <= r7) goto L_0x01d2
            float r1 = (float) r0
            float r0 = (float) r7
            float r1 = r1 / r0
            float r0 = (float) r6
            float r0 = r0 / r1
            int r6 = (int) r0
            r0 = r7
        L_0x01d2:
            int r2 = r13.A05
            if (r2 <= 0) goto L_0x01f1
            int r1 = r13.A09
            int r2 = r2 / r1
            if (r0 >= r2) goto L_0x01e5
            r0 = r2
            if (r3 == 0) goto L_0x01e5
            int r1 = r13.A01
            if (r1 == 0) goto L_0x01e5
            int r1 = r1 * r2
            int r6 = r1 / r3
        L_0x01e5:
            if (r6 >= r2) goto L_0x01f1
            r6 = r2
            if (r3 == 0) goto L_0x01f1
            int r1 = r13.A01
            if (r1 == 0) goto L_0x01f1
            int r3 = r3 * r2
            int r0 = r3 / r1
        L_0x01f1:
            int r7 = r7 - r0
            int r1 = r7 / 2
            int r4 = r4 - r6
            int r4 = r4 / 2
            float r3 = (float) r1
            float r2 = (float) r4
            int r1 = r1 + r0
            float r1 = (float) r1
            int r4 = r4 + r6
            float r0 = (float) r4
            android.graphics.RectF r9 = X.AnonymousClass4L0.A09(r3, r2, r1, r0)
            goto L_0x0022
        L_0x0203:
            int r0 = r6 * r3
            int r0 = r0 / r1
            goto L_0x01c0
        L_0x0207:
            int r6 = r13.A07
            goto L_0x01b3
        L_0x020a:
            r0 = r7
            r6 = r4
            goto L_0x01b3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.crop.CropImage.A0L(com.whatsapp.crop.CropImage, X.2Xw):void");
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        String A0h;
        String string;
        boolean z = true;
        requestWindowFeature(1);
        super.onCreate(bundle);
        C117615sD.A01(this.A04, this.A0J);
        getWindow().addFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        setContentView((int) R.layout.f8nameremoved);
        C620633i r3 = this.A0I;
        C107535bT.A00(findViewById(R.id.root_view), getWindow(), r3);
        this.A0L = (CropImageView) findViewById(R.id.image);
        Intent intent = getIntent();
        if (intent != null) {
            bundle2 = intent.getExtras();
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            if (bundle2.getString("circleCrop") != null) {
                this.A0S = true;
                this.A00 = 1;
                this.A01 = 1;
            }
            Uri uri = (Uri) bundle2.getParcelable("output");
            this.A0F = uri;
            if (!(uri == null || (string = bundle2.getString("outputFormat")) == null)) {
                this.A0A = Bitmap.CompressFormat.valueOf(string);
            }
            this.A00 = bundle2.getInt("aspectX");
            this.A01 = bundle2.getInt("aspectY");
            this.A06 = bundle2.getInt("outputX");
            this.A07 = bundle2.getInt("outputY");
            this.A05 = bundle2.getInt("minCrop");
            this.A03 = bundle2.getInt("maxCrop");
            this.A0E = (Rect) bundle2.getParcelable("initialRect");
            this.A0T = bundle2.getBoolean("cropByOutputSize", true);
            this.A0Y = bundle2.getBoolean("scale", true);
            this.A0Z = bundle2.getBoolean("scaleUpIfNeeded", true);
            this.A04 = bundle2.getInt("maxFileSize");
            this.A0U = bundle2.getBoolean("flattenRotation", true);
            this.A0R = bundle2.getString("webImageSource");
            this.A0W = bundle2.getBoolean("rotateAspect", false);
        } else {
            Log.i("crop/oncreate/no-extras");
        }
        if (bundle != null) {
            this.A08 = bundle.getInt("rotate");
            this.A0E = (Rect) bundle.getParcelable("initialRect");
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("crop/oncreate/ bitmap:");
        if (this.A0B != null) {
            z = false;
        }
        A0o.append(z);
        A0o.append(" aspectX:");
        A0o.append(this.A00);
        A0o.append(" aspectY:");
        A0o.append(this.A01);
        A0o.append(" outputX:");
        A0o.append(this.A06);
        A0o.append(" outputY:");
        A0o.append(this.A07);
        A0o.append(" minCrop:");
        A0o.append(this.A05);
        A0o.append(" maxCrop:");
        A0o.append(this.A03);
        A0o.append(" cropByOutputSize:");
        A0o.append(this.A0T);
        A0o.append(" initialRect:");
        Rect rect = this.A0E;
        if (rect == null) {
            A0h = "null";
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append(rect.left);
            A0o2.append(",");
            A0o2.append(rect.top);
            A0o2.append(",");
            A0o2.append(rect.right);
            A0o2.append(",");
            A0h = AnonymousClass000.A0h(A0o2, rect.bottom);
        }
        A0o.append(A0h);
        A0o.append(" scale:");
        A0o.append(this.A0Y);
        A0o.append(" scaleUp:");
        A0o.append(this.A0Z);
        A0o.append(" flattenRotation:");
        C18260x0.A1V(A0o, this.A0U);
        if (intent != null) {
            Point A072 = AnonymousClass4L0.A07();
            C86604Kt.A0x(this, A072);
            C70333aK.A00(this.A04, this, intent, A072, 43);
            return;
        }
        finish();
    }

    public static final Intent A0C() {
        Log.e("profileinfo/activityres/fail/load-image");
        return C18320x8.A07().putExtra("io-error", true).putExtra("error_message_id", R.string.f11nameremoved);
    }

    public void A5r() {
        if (!this.A0V) {
            this.A0V = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            this.A04 = C64333Db.A8y(A2Y);
            this.A0G = C64333Db.A04(A2Y);
            this.A0O = C64333Db.A3o(A2Y);
            this.A0H = C64333Db.A05(A2Y);
            this.A0K = (C61072zf) A2Y.AXI.get();
            this.A0N = (C133846i2) A2Y.A00.A5A.get();
            this.A0Q = C86614Ku.A0m(A2Y);
            this.A0I = C64333Db.A2o(A2Y);
            this.A0J = (C47912e2) A2Y.AYH.get();
            this.A0P = (AnonymousClass33O) A2Y.AX1.get();
        }
    }

    public final void A6D(Rect rect) {
        int i = rect.left;
        int i2 = this.A09;
        rect.left = i * i2;
        rect.right *= i2;
        rect.top *= i2;
        rect.bottom *= i2;
    }

    public void onDestroy() {
        Log.i("crop/ondestroy");
        super.onDestroy();
        Bitmap bitmap = this.A0B;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.A0L.A05 = true;
            this.A0B.recycle();
            this.A0B = null;
        }
        C117615sD.A01(this.A04, this.A0J);
    }

    public CropImage(int i) {
        this.A0V = false;
        C86604Kt.A1K(this, 38);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("rotate", this.A08);
        AnonymousClass5UE r0 = this.A0M;
        if (r0 != null) {
            Rect A012 = r0.A01();
            A6D(A012);
            bundle.putParcelable("initialRect", A012);
        }
    }

    public CropImage() {
        this(0);
        this.A0A = Bitmap.CompressFormat.JPEG;
        this.A0Z = true;
        this.A09 = 1;
    }
}
