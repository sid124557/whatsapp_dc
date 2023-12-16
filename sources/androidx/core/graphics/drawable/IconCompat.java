package androidx.core.graphics.drawable;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06350Xh;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode A0A = PorterDuff.Mode.SRC_IN;
    public int A00;
    public int A01;
    public int A02;
    public ColorStateList A03;
    public PorterDuff.Mode A04;
    public Parcelable A05;
    public Object A06;
    public String A07;
    public String A08;
    public byte[] A09;

    @Deprecated
    public Icon A08() {
        return A09((Context) null);
    }

    public static Resources A00(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, DefaultCrypto.BUFFER_SIZE);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", AnonymousClass000.A1b(str)), e);
            return null;
        }
    }

    public int A04() {
        int i = this.A02;
        if (i == -1) {
            if (Build.VERSION.SDK_INT >= 23) {
                return C06350Xh.A00(this.A06);
            }
        } else if (i == 2) {
            return this.A00;
        }
        throw AnonymousClass000.A0H(this, "called getResId() on ", AnonymousClass001.A0o());
    }

    public int A05() {
        int i = this.A02;
        if (i != -1 || Build.VERSION.SDK_INT < 23) {
            return i;
        }
        return C06350Xh.A01(this.A06);
    }

    public Bitmap A06() {
        Object obj;
        int i = this.A02;
        if (i == -1) {
            if (Build.VERSION.SDK_INT >= 23) {
                obj = this.A06;
                if (!(obj instanceof Bitmap)) {
                    return null;
                }
            }
            throw AnonymousClass000.A0H(this, "called getBitmap() on ", AnonymousClass001.A0o());
        } else if (i == 1) {
            obj = this.A06;
        } else {
            if (i == 5) {
                return A01((Bitmap) this.A06, true);
            }
            throw AnonymousClass000.A0H(this, "called getBitmap() on ", AnonymousClass001.A0o());
        }
        return (Bitmap) obj;
    }

    public Icon A09(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C06350Xh.A03(context, this);
        }
        throw AnonymousClass002.A0G("This method is only supported on API level 23+");
    }

    public Uri A0A() {
        int i = this.A02;
        if (i == -1) {
            if (Build.VERSION.SDK_INT >= 23) {
                return C06350Xh.A04(this.A06);
            }
        } else if (i == 4 || i == 6) {
            return Uri.parse((String) this.A06);
        }
        throw AnonymousClass000.A0H(this, "called getUri() on ", AnonymousClass001.A0o());
    }

    public String A0D() {
        int i = this.A02;
        if (i == -1) {
            if (Build.VERSION.SDK_INT >= 23) {
                return C06350Xh.A05(this.A06);
            }
        } else if (i == 2) {
            String str = this.A07;
            if (str == null || TextUtils.isEmpty(str)) {
                return ((String) this.A06).split(":", -1)[0];
            }
            return this.A07;
        }
        throw AnonymousClass000.A0H(this, "called getResPackage() on ", AnonymousClass001.A0o());
    }

    public void A0E(Context context) {
        Object obj;
        if (this.A02 == 2 && (obj = this.A06) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                String A0D = A0D();
                int identifier = A00(context, A0D).getIdentifier(str4, str3, str5);
                if (this.A00 != identifier) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Id has changed for ");
                    A0o.append(A0D);
                    Log.i("IconCompat", AnonymousClass000.A0V(" ", str, A0o));
                    this.A00 = identifier;
                }
            }
        }
    }

    public String toString() {
        String str;
        int i = this.A02;
        if (i == -1) {
            return String.valueOf(this.A06);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (i) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (i) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.A06).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.A06).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.A07);
                sb.append(" id=");
                Object[] A0L = AnonymousClass002.A0L();
                AnonymousClass000.A1L(A0L, A04());
                sb.append(String.format("0x%08x", A0L));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.A00);
                int i2 = this.A01;
                if (i2 != 0) {
                    sb.append(" off=");
                    sb.append(i2);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.A06);
                break;
        }
        ColorStateList colorStateList = this.A03;
        if (colorStateList != null) {
            sb.append(" tint=");
            sb.append(colorStateList);
        }
        PorterDuff.Mode mode = this.A04;
        if (mode != A0A) {
            sb.append(" mode=");
            sb.append(mode);
        }
        return AnonymousClass000.A0e(sb);
    }

    public IconCompat(int i) {
        this.A09 = null;
        this.A05 = null;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = null;
        this.A04 = A0A;
        this.A08 = null;
        this.A02 = i;
    }

    public static Bitmap A01(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix A052 = AnonymousClass002.A05();
        A052.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(A052);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat A02(Resources resources, String str, int i) {
        str.getClass();
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.A00 = i;
            if (resources != null) {
                try {
                    iconCompat.A06 = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw AnonymousClass001.A0c("Icon resource cannot be found");
                }
            } else {
                iconCompat.A06 = str;
            }
            iconCompat.A07 = str;
            return iconCompat;
        }
        throw AnonymousClass001.A0c("Drawable resource ID must not be 0");
    }

    public static IconCompat A03(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.A06 = bitmap;
        return iconCompat;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable A07(android.content.Context r7) {
        /*
            r6 = this;
            r6.A0E(r7)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0012
            android.graphics.drawable.Icon r0 = r6.A09(r7)
            android.graphics.drawable.Drawable r4 = X.C06350Xh.A02(r7, r0)
        L_0x0011:
            return r4
        L_0x0012:
            int r0 = r6.A02
            r4 = 0
            r5 = 0
            switch(r0) {
                case 1: goto L_0x0033;
                case 2: goto L_0x0069;
                case 3: goto L_0x003c;
                case 4: goto L_0x005a;
                case 5: goto L_0x004d;
                case 6: goto L_0x00a2;
                default: goto L_0x0019;
            }
        L_0x0019:
            if (r4 == 0) goto L_0x0011
            android.content.res.ColorStateList r0 = r6.A03
            if (r0 != 0) goto L_0x0025
            android.graphics.PorterDuff$Mode r1 = r6.A04
            android.graphics.PorterDuff$Mode r0 = A0A
            if (r1 == r0) goto L_0x0011
        L_0x0025:
            r4.mutate()
            android.content.res.ColorStateList r0 = r6.A03
            X.AnonymousClass0YG.A01(r0, r4)
            android.graphics.PorterDuff$Mode r0 = r6.A04
            X.AnonymousClass0YG.A04(r0, r4)
            return r4
        L_0x0033:
            android.content.res.Resources r3 = r7.getResources()
            java.lang.Object r0 = r6.A06
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            goto L_0x00b4
        L_0x003c:
            android.content.res.Resources r3 = r7.getResources()
            java.lang.Object r2 = r6.A06
            byte[] r2 = (byte[]) r2
            int r1 = r6.A00
            int r0 = r6.A01
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r2, r1, r0)
            goto L_0x00b4
        L_0x004d:
            android.content.res.Resources r3 = r7.getResources()
            java.lang.Object r0 = r6.A06
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap r0 = A01(r0, r5)
            goto L_0x00b4
        L_0x005a:
            java.io.InputStream r0 = r6.A0C(r7)
            if (r0 == 0) goto L_0x0019
            android.content.res.Resources r3 = r7.getResources()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)
            goto L_0x00b4
        L_0x0069:
            java.lang.String r1 = r6.A0D()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0077
            java.lang.String r1 = r7.getPackageName()
        L_0x0077:
            android.content.res.Resources r2 = A00(r7, r1)
            int r1 = r6.A00     // Catch:{ RuntimeException -> 0x0086 }
            android.content.res.Resources$Theme r0 = r7.getTheme()     // Catch:{ RuntimeException -> 0x0086 }
            android.graphics.drawable.Drawable r4 = X.C02680He.A00(r0, r2, r1)     // Catch:{ RuntimeException -> 0x0086 }
            goto L_0x0019
        L_0x0086:
            r3 = move-exception
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            int r0 = r6.A00
            X.AnonymousClass000.A1P(r2, r0, r5)
            r1 = 1
            java.lang.Object r0 = r6.A06
            r2[r1] = r0
            java.lang.String r0 = "Unable to load resource 0x%08x from pkg=%s"
            java.lang.String r1 = java.lang.String.format(r0, r2)
            java.lang.String r0 = "IconCompat"
            android.util.Log.e(r0, r1, r3)
            goto L_0x0019
        L_0x00a2:
            java.io.InputStream r0 = r6.A0C(r7)
            if (r0 == 0) goto L_0x0019
            android.content.res.Resources r3 = r7.getResources()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)
            android.graphics.Bitmap r0 = A01(r0, r5)
        L_0x00b4:
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
            r4.<init>(r3, r0)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.A07(android.content.Context):android.graphics.drawable.Drawable");
    }

    public Bundle A0B() {
        Parcelable parcelable;
        Bundle A082 = AnonymousClass002.A08();
        switch (this.A02) {
            case -1:
                parcelable = (Parcelable) this.A06;
                break;
            case 1:
            case 5:
                parcelable = (Bitmap) this.A06;
                break;
            case 2:
            case 4:
            case 6:
                A082.putString("obj", (String) this.A06);
                break;
            case 3:
                A082.putByteArray("obj", (byte[]) this.A06);
                break;
            default:
                throw AnonymousClass001.A0c("Invalid icon");
        }
        A082.putParcelable("obj", parcelable);
        A082.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, this.A02);
        A082.putInt("int1", this.A00);
        A082.putInt("int2", this.A01);
        A082.putString("string1", this.A07);
        ColorStateList colorStateList = this.A03;
        if (colorStateList != null) {
            A082.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.A04;
        if (mode != A0A) {
            A082.putString("tint_mode", mode.name());
        }
        return A082;
    }

    public InputStream A0C(Context context) {
        StringBuilder sb;
        String str;
        Uri A0A2 = A0A();
        String scheme = A0A2.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(A0A2);
            } catch (Exception e) {
                e = e;
                sb = AnonymousClass001.A0o();
                str = "Unable to load image from URI: ";
                Log.w("IconCompat", AnonymousClass000.A0P(A0A2, str, sb), e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(AnonymousClass002.A0B((String) this.A06));
            } catch (FileNotFoundException e2) {
                e = e2;
                sb = AnonymousClass001.A0o();
                str = "Unable to load image from path: ";
                Log.w("IconCompat", AnonymousClass000.A0P(A0A2, str, sb), e);
                return null;
            }
        }
    }

    public IconCompat() {
        this.A02 = -1;
        this.A09 = null;
        this.A05 = null;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = null;
        this.A04 = A0A;
        this.A08 = null;
    }
}
