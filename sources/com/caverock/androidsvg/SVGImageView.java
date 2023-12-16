package com.caverock.androidsvg;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass01P;
import X.AnonymousClass01R;
import X.AnonymousClass0QT;
import X.C05420Tg;
import X.C06530Yb;
import X.C14450pi;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

public class SVGImageView extends ImageView {
    public static Method A02;
    public C05420Tg A00 = new C05420Tg();
    public AnonymousClass0QT A01 = null;

    public void setImageAsset(String str) {
        try {
            InputStream open = getContext().getAssets().open(str);
            new AnonymousClass01P(this).execute(new InputStream[]{open});
        } catch (IOException unused) {
            Log.e("SVGImageView", AnonymousClass000.A0V("File not found: ", str, AnonymousClass001.A0o()));
        }
    }

    public void setImageURI(Uri uri) {
        try {
            InputStream openInputStream = getContext().getContentResolver().openInputStream(uri);
            new AnonymousClass01P(this).execute(new InputStream[]{openInputStream});
        } catch (FileNotFoundException unused) {
            Log.e("SVGImageView", AnonymousClass000.A0P(uri, "File not found: ", AnonymousClass001.A0o()));
        }
    }

    static {
        Class<View> cls = View.class;
        try {
            Class[] clsArr = new Class[2];
            clsArr[0] = Integer.TYPE;
            A02 = AnonymousClass001.A0r(cls, Paint.class, "setLayerType", clsArr, 1);
        } catch (NoSuchMethodException unused) {
        }
    }

    private void setFromString(String str) {
        try {
            this.A01 = new C06530Yb().A0R(new ByteArrayInputStream(str.getBytes()));
            A00();
        } catch (C14450pi unused) {
            Log.e("SVGImageView", AnonymousClass000.A0V("Could not find SVG at: ", str, AnonymousClass001.A0o()));
        }
    }

    public final void A00() {
        AnonymousClass0QT r1 = this.A01;
        if (r1 != null) {
            Picture A002 = r1.A00(this.A00);
            Method method = A02;
            if (method != null) {
                try {
                    int i = View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()));
                    Object[] A0M = AnonymousClass002.A0M();
                    AnonymousClass000.A1L(A0M, i);
                    A0M[1] = null;
                    method.invoke(this, A0M);
                } catch (Exception e) {
                    Log.w("SVGImageView", "Unexpected failure calling setLayerType", e);
                }
            }
            setImageDrawable(new PictureDrawable(A002));
        }
    }

    public void setCSS(String str) {
        this.A00.A00(str);
        A00();
    }

    public void setSVG(AnonymousClass0QT r2, String str) {
        if (r2 != null) {
            this.A01 = r2;
            this.A00.A00(str);
            A00();
            return;
        }
        throw AnonymousClass001.A0c("Null value passed to setSVG()");
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(attributeSet, i);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0050 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0069 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.isInEditMode()
            if (r0 != 0) goto L_0x0075
            android.content.Context r0 = r7.getContext()
            android.content.res.Resources$Theme r2 = r0.getTheme()
            int[] r1 = X.C03300Jp.A00
            r0 = 0
            android.content.res.TypedArray r5 = r2.obtainStyledAttributes(r8, r1, r9, r0)
            java.lang.String r1 = r5.getString(r0)     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x0020
            X.0Tg r0 = r7.A00     // Catch:{ all -> 0x0070 }
            r0.A00(r1)     // Catch:{ all -> 0x0070 }
        L_0x0020:
            r6 = 1
            r1 = -1
            int r0 = r5.getResourceId(r6, r1)     // Catch:{ all -> 0x0070 }
            if (r0 == r1) goto L_0x002c
            r7.setImageResource(r0)     // Catch:{ all -> 0x0070 }
            goto L_0x006c
        L_0x002c:
            java.lang.String r4 = r5.getString(r6)     // Catch:{ all -> 0x0070 }
            if (r4 == 0) goto L_0x006c
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x0070 }
            r3 = 0
            android.content.Context r0 = r7.getContext()     // Catch:{ FileNotFoundException -> 0x0050 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0050 }
            java.io.InputStream r2 = r0.openInputStream(r1)     // Catch:{ FileNotFoundException -> 0x0050 }
            X.01P r1 = new X.01P     // Catch:{ FileNotFoundException -> 0x0050 }
            r1.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0050 }
            java.io.InputStream[] r0 = new java.io.InputStream[r6]     // Catch:{ FileNotFoundException -> 0x0050 }
            r0[r3] = r2     // Catch:{ FileNotFoundException -> 0x0050 }
            r1.execute(r0)     // Catch:{ FileNotFoundException -> 0x0050 }
            goto L_0x006c
        L_0x0050:
            android.content.Context r0 = r7.getContext()     // Catch:{ IOException -> 0x0069 }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x0069 }
            java.io.InputStream r2 = r0.open(r4)     // Catch:{ IOException -> 0x0069 }
            X.01P r1 = new X.01P     // Catch:{ IOException -> 0x0069 }
            r1.<init>(r7)     // Catch:{ IOException -> 0x0069 }
            java.io.InputStream[] r0 = new java.io.InputStream[r6]     // Catch:{ IOException -> 0x0069 }
            r0[r3] = r2     // Catch:{ IOException -> 0x0069 }
            r1.execute(r0)     // Catch:{ IOException -> 0x0069 }
            goto L_0x006c
        L_0x0069:
            r7.setFromString(r4)     // Catch:{ all -> 0x0070 }
        L_0x006c:
            r5.recycle()
            return
        L_0x0070:
            r0 = move-exception
            r5.recycle()
            throw r0
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGImageView.A01(android.util.AttributeSet, int):void");
    }

    public void setImageResource(int i) {
        new AnonymousClass01R(getContext(), this, i).execute(new Integer[0]);
    }

    public SVGImageView(Context context) {
        super(context);
    }

    public void setSVG(AnonymousClass0QT r2) {
        if (r2 != null) {
            this.A01 = r2;
            A00();
            return;
        }
        throw AnonymousClass001.A0c("Null value passed to setSVG()");
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A01(attributeSet, 0);
    }
}
