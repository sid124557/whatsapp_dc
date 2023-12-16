package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;

/* renamed from: X.7o9  reason: invalid class name and case insensitive filesystem */
public final class C160697o9 {
    public static boolean A0C = true;
    public static Bitmap.Config A0D = Bitmap.Config.ARGB_8888;
    public static BitmapFactory.Options A0E;
    public static final Bitmap A0F = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
    public static final C158417jw A0G = new C158417jw(20);
    public static final C158417jw A0H = new C158417jw(32);
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public int A04 = -1;
    public Bitmap A05;
    public BitmapFactory.Options A06;
    public C160697o9 A07 = null;
    public C160697o9 A08 = null;
    public final C172748Mo A09 = new C125946Kc(this);
    public final C160697o9[] A0A = new C160697o9[4];
    public volatile int A0B = 0;

    public static C160697o9 A00(byte[] bArr, int i) {
        Bitmap bitmap;
        C160697o9 r5 = new C160697o9(-1, -1);
        if (A0C) {
            BitmapFactory.Options options = r5.A06;
            if (options.inBitmap == null) {
                options.inBitmap = (Bitmap) A0H.A00();
            }
        }
        try {
            BitmapFactory.Options options2 = r5.A06;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, i, options2);
            r5.A05 = bitmap;
            if (A0C) {
                options2.inBitmap = null;
            }
        } catch (IllegalArgumentException unused) {
            C158827kc.A06.A01();
            A0C = false;
            BitmapFactory.Options options3 = r5.A06;
            options3.inBitmap.recycle();
            options3.inBitmap = null;
            A0H.A01();
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, i, options3);
            r5.A05 = bitmap;
        }
        if (bitmap == null) {
            r5.A02();
            return null;
        }
        r5.A01 = bitmap.getWidth();
        r5.A00 = r5.A05.getHeight();
        return r5;
    }

    public synchronized Bitmap A01() {
        return this.A05;
    }

    public void A02() {
        this.A01 = -1;
        this.A00 = -1;
        for (int i = 0; i < 4; i++) {
            this.A0A[i] = null;
        }
        A04();
        this.A0B = 0;
        this.A07 = null;
        this.A08 = null;
        this.A02 = -1;
        this.A03 = -1;
        this.A04 = -1;
    }

    public final synchronized void A04() {
        Bitmap bitmap = this.A05;
        if (!(bitmap == null || bitmap == A0F)) {
            if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                A0G.A02(this.A05);
            } else if (A0C) {
                A0H.A02(this.A05);
            } else {
                this.A05.recycle();
            }
        }
        this.A05 = null;
    }

    public synchronized String toString() {
        StringBuilder A0o;
        String str;
        A0o = AnonymousClass001.A0o();
        A0o.append(C160697o9.class.getSimpleName());
        A0o.append(" {x=");
        A0o.append(this.A02);
        A0o.append(", y=");
        A0o.append(this.A03);
        A0o.append(", zoom=");
        A0o.append(this.A04);
        A0o.append(", status=");
        A0o.append(this.A0B);
        A0o.append("}");
        if (this.A05 == null) {
            str = "x";
        } else {
            str = "o";
        }
        return AnonymousClass000.A0X(str, A0o);
    }

    public C160697o9(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (!A0C) {
            BitmapFactory.Options options = A0E;
            if (options == null) {
                options = new BitmapFactory.Options();
                A0E = options;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
            }
            this.A06 = options;
            return;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        this.A06 = options2;
        options2.inSampleSize = 1;
        options2.inPreferredConfig = A0D;
        options2.inMutable = true;
    }

    public void A03() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.A0B = 0;
            if (this.A07 == null && this.A08 == null) {
                A02();
                return;
            }
            return;
        }
        C161847qe.A02.post(this.A09);
    }
}
