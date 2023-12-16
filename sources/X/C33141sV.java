package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1sV  reason: invalid class name and case insensitive filesystem */
public class C33141sV extends AnonymousClass3CR {
    public static final BitmapFactory.Options A08;
    public int A00;
    public final Handler A01 = AnonymousClass000.A0A();
    public final C33131sU A02;
    public final C45982at A03;
    public final C66833My A04;
    public final C50542iL A05;
    public final HashMap A06 = AnonymousClass001.A0t();
    public final List A07 = AnonymousClass001.A0s();

    public final synchronized Bitmap A06(String str) {
        Bitmap bitmap;
        Bitmap bitmap2;
        bitmap = (Bitmap) this.A02.A06(str);
        if (bitmap == null || bitmap.isRecycled()) {
            if (bitmap != null && bitmap.isRecycled()) {
                Log.e("!! recycled message in hard cache");
            }
            HashMap hashMap = this.A06;
            SoftReference softReference = (SoftReference) hashMap.get(str);
            bitmap = null;
            if (softReference != null) {
                bitmap2 = (Bitmap) softReference.get();
            } else {
                bitmap2 = null;
            }
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap = bitmap2;
            } else if (softReference != null) {
                hashMap.remove(str);
            }
        }
        return bitmap;
    }

    public final void A08(View view, C624134x r12, C151987Xb r13, C185528tp r14, Object obj) {
        C624134x r6;
        Bitmap A062;
        synchronized (this) {
            r6 = r12;
            A062 = A06(A02(r12));
        }
        View view2 = view;
        C151987Xb r3 = r13;
        C185528tp r8 = r14;
        if (A062 != null) {
            r13.A02(A062);
            r14.Bof(A062, view, r12);
            return;
        }
        Bitmap A002 = r13.A00();
        C614630w A0y = r12.A0y();
        if (A002 != null || A0y == null || A0y.A06()) {
            r14.Bof(A002, view, r12);
            r13.A01();
            return;
        }
        this.A03.A00(A0y, new C71683cV(this, r3, A0y, view2, r6, obj, r8, 5));
        r14.Bp1(view);
    }

    public void A09(View view, C624134x r3, C185528tp r4) {
        A0F(view, r3, r4, false);
    }

    public final void A0B(View view, C624134x r9, C185528tp r10, Object obj) {
        View view2 = view;
        Object obj2 = obj;
        view.setTag(obj);
        if (C615631i.A02()) {
            A07();
        }
        C624134x r3 = r9;
        C185528tp r5 = r10;
        if ((r9 instanceof AnonymousClass4DU) || (!(r9 instanceof C30481mW) ? r9.A0y() == null || !r9.A0y().A05() : ((C30481mW) r3).A1z() == null)) {
            r10.Bof((Bitmap) null, view, r9);
        } else {
            A08(view2, r3, new C138086pk(r9, this), r5, obj2);
        }
    }

    public final synchronized void A0C(View view, C624134x r14, C185528tp r15, Object obj, int i, boolean z, boolean z2, boolean z3) {
        synchronized (this) {
            View view2 = view;
            Object obj2 = obj;
            view.setTag(obj2);
            if (C615631i.A02()) {
                A07();
            }
            boolean z4 = z3;
            A08(view, r14, new C33181sa(view2, r14, r15, this, obj2, i, z4, z2, z), r15, obj2);
        }
    }

    public void A0D(View view, C624134x r12, C185528tp r13, Object obj, boolean z) {
        view.setTag(obj);
        AnonymousClass7O7 r6 = new AnonymousClass7O7(view, r12, r13, this, obj);
        C50542iL r0 = this.A05;
        r0.A01(view, r12, r6, r13, obj, z);
    }

    public void A0F(View view, C624134x r11, C185528tp r12, boolean z) {
        A0C(view, r11, r12, r11.A1J, 100, z, false, true);
    }

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        A08 = options;
        options.inInputShareable = true;
        options.inPurgeable = true;
        options.inDither = true;
    }

    public C33141sV(C64393Dh r12, AnonymousClass30B r13, C54292oU r14, C620733j r15, C61072zf r16, AnonymousClass5Y0 r17, AnonymousClass1VX r18, C66843Mz r19, C45982at r20, C66833My r21, C55972rD r22, AnonymousClass33O r23, AnonymousClass33Q r24, AnonymousClass2MO r25) {
        super(r25);
        this.A04 = r21;
        this.A03 = r20;
        this.A05 = new C50542iL(r12, r14, r15, r16, r17, r18, r19, r22, r23, r24);
        C18260x0.A0y("messagethumbcache/construct ", AnonymousClass001.A0o(), (int) ((C58152un.A00 / 1024) / 8));
        this.A02 = r13.A02();
        r13.A01().A07(new C112405jg(this));
        A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r0 != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A01(X.C624134x r2, byte[] r3, int r4, boolean r5, boolean r6) {
        /*
            boolean r0 = r2 instanceof X.AnonymousClass4DU
            r1 = 0
            if (r0 != 0) goto L_0x0048
            if (r3 == 0) goto L_0x0048
            android.graphics.BitmapFactory$Options r0 = A08
            android.graphics.Bitmap r3 = X.AnonymousClass5CD.A00(r0, r3, r4)
            if (r3 == 0) goto L_0x0048
            if (r5 == 0) goto L_0x0021
            boolean r0 = r2 instanceof X.C30481mW
            if (r0 == 0) goto L_0x0022
            java.lang.Integer r0 = X.C18290x4.A0b()
        L_0x0019:
            int r1 = r0.intValue()
            r0 = 2
            com.whatsapp.filter.FilterUtils.blurNative(r3, r1, r0)
        L_0x0021:
            return r3
        L_0x0022:
            boolean r0 = r2 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2 instanceof X.AnonymousClass1nF
            r2 = 1
            if (r0 != 0) goto L_0x0035
            if (r6 == 0) goto L_0x002e
            r2 = 2
        L_0x002e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L_0x0021
            goto L_0x0019
        L_0x0035:
            int r0 = r3.getHeight()
            r1 = 100
            if (r0 >= r1) goto L_0x0021
            int r0 = r3.getWidth()
            if (r0 >= r1) goto L_0x0021
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0019
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33141sV.A01(X.34x, byte[], int, boolean, boolean):android.graphics.Bitmap");
    }

    public static String A02(C624134x r3) {
        String str;
        String str2;
        AnonymousClass2z0 r0 = r3.A1J;
        if (r0 == null || (str = r0.A01) == null) {
            return "null";
        }
        C95814uZ r02 = r0.A00;
        if (r02 != null) {
            str2 = r02.toString();
        } else {
            str2 = "";
        }
        if (!AnonymousClass36V.A06(r3)) {
            return AnonymousClass000.A0T(str2, str);
        }
        StringBuilder A0m = AnonymousClass000.A0m(str2, str);
        A0m.append(":");
        return AnonymousClass000.A0R(AnonymousClass36V.A03(r3), A0m);
    }

    public static byte[] A03(C624134x r2) {
        if (!(r2 instanceof AnonymousClass4DU)) {
            if (r2 instanceof C30481mW) {
                return ((C30481mW) r2).A1z();
            }
            if (r2.A0y() != null && r2.A0y().A06()) {
                return r2.A0y().A09();
            }
        }
        return null;
    }

    public int A05(Context context) {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A00 = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public void A0A(View view, C624134x r3, C185528tp r4) {
        A0B(view, r3, r4, r3.A1J);
    }

    public void A0E(View view, C624134x r8, C185528tp r9, boolean z) {
        AnonymousClass2U8 r3;
        String str;
        view.setTag(r8.A0c.A09);
        synchronized (this) {
            if (C615631i.A02()) {
                A07();
            }
            AnonymousClass2U8 r0 = r8.A0c;
            if (r0 != null) {
                byte[] bArr = r0.A00;
                if (!TextUtils.isEmpty(r0.A04)) {
                    r3 = r8.A0c;
                    str = r3.A04;
                } else {
                    r3 = r8.A0c;
                    str = r3.A09;
                }
                String A0b = AnonymousClass000.A0b("_", AnonymousClass000.A0l(str), z);
                if (bArr == null) {
                    bArr = r3.A0F;
                    A0b = AnonymousClass000.A0X("_micro", AnonymousClass000.A0l(A0b));
                }
                Bitmap A062 = A06(A0b);
                if (A062 == null) {
                    A062 = A01(r8, bArr, 2000, z, false);
                    this.A06.remove(A0b);
                    if (A062 != null) {
                        this.A02.A09(A0b, A062);
                    }
                }
                r9.Bof(A062, view, r8);
            }
        }
    }

    public void A0G(C624134x r3) {
        this.A02.A08(A02(r3));
        this.A06.remove(A02(r3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ee, code lost:
        if (r1 > 0.0f) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C30471mV r4, int r5) {
        /*
            X.33C r1 = X.C30471mV.A00(r4)
            int r2 = r1.A08
            if (r2 <= 0) goto L_0x0015
            int r0 = r1.A06
            if (r0 <= 0) goto L_0x0015
            float r1 = (float) r5
            float r0 = (float) r0
            float r1 = r1 * r0
            float r0 = (float) r2
        L_0x0010:
            float r1 = r1 / r0
            int r0 = (int) r1
            if (r0 <= 0) goto L_0x0066
            return r0
        L_0x0015:
            java.io.File r0 = r1.A0F
            if (r0 == 0) goto L_0x0066
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0066
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r0 = 1
            r2.inJustDecodeBounds = r0
            java.io.File r0 = r1.A0F
            java.lang.String r0 = r0.getAbsolutePath()
            android.graphics.BitmapFactory.decodeFile(r0, r2)
            int r0 = r2.outWidth
            if (r0 <= 0) goto L_0x0066
            int r0 = r2.outHeight
            if (r0 <= 0) goto L_0x0066
            java.io.File r0 = r1.A0F     // Catch:{ IOException -> 0x0060 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0060 }
            X.0YU r1 = new X.0YU     // Catch:{ IOException -> 0x0060 }
            r1.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x0060 }
            r0 = 1
            int r1 = r1.A0G(r0)     // Catch:{ IOException -> 0x0060 }
            r0 = 6
            if (r1 == r0) goto L_0x0057
            r0 = 8
            if (r1 == r0) goto L_0x0057
            float r1 = (float) r5     // Catch:{ IOException -> 0x0060 }
            int r0 = r2.outHeight     // Catch:{ IOException -> 0x0060 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0060 }
            float r1 = r1 * r0
            int r0 = r2.outWidth     // Catch:{ IOException -> 0x0060 }
            goto L_0x005e
        L_0x0057:
            float r1 = (float) r5     // Catch:{ IOException -> 0x0060 }
            int r0 = r2.outWidth     // Catch:{ IOException -> 0x0060 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0060 }
            float r1 = r1 * r0
            int r0 = r2.outHeight     // Catch:{ IOException -> 0x0060 }
        L_0x005e:
            float r0 = (float) r0     // Catch:{ IOException -> 0x0060 }
            goto L_0x0010
        L_0x0060:
            r1 = move-exception
            java.lang.String r0 = "failure retrieving exif, io exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0066:
            byte r0 = r4.A1I
            boolean r0 = X.C614630w.A00(r0)
            if (r0 == 0) goto L_0x00f4
            X.30w r3 = r4.A0y()
            X.C626936e.A06(r3)
            java.lang.Float r0 = r3.A00
            if (r0 != 0) goto L_0x00c0
            X.34x r1 = r3.A04
            byte r0 = r1.A1I
            boolean r0 = X.C614630w.A00(r0)
            if (r0 == 0) goto L_0x00cd
            int r0 = r1.A0i()
            if (r0 != 0) goto L_0x00cd
            java.lang.String r0 = r1.A13()
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = r1.A13()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00cd
            java.lang.String r1 = r1.A13()
            r0 = 0
            byte[] r2 = android.util.Base64.decode(r1, r0)
        L_0x00a2:
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r0 = 1
            r4.inJustDecodeBounds = r0
            int r1 = r2.length
            r0 = 0
            android.graphics.BitmapFactory.decodeByteArray(r2, r0, r1, r4)
            int r2 = r4.outWidth
            if (r2 <= 0) goto L_0x00f1
            int r0 = r4.outHeight
            if (r0 <= 0) goto L_0x00f1
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
        L_0x00ba:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r3.A00 = r0
        L_0x00c0:
            float r1 = r0.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00f4
            float r0 = (float) r5
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
        L_0x00cd:
            byte[] r0 = r1.A1u()
            if (r0 == 0) goto L_0x00df
            byte[] r0 = r1.A1u()
            int r0 = r0.length
            if (r0 <= 0) goto L_0x00df
            byte[] r2 = r1.A1u()
            goto L_0x00a2
        L_0x00df:
            boolean r0 = r1 instanceof X.C30471mV
            if (r0 == 0) goto L_0x00f1
            X.1mV r1 = (X.C30471mV) r1
            X.33C r0 = r1.A01
            if (r0 == 0) goto L_0x00f1
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f1
            goto L_0x00ba
        L_0x00f1:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00ba
        L_0x00f4:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33141sV.A00(X.1mV, int):int");
    }

    public void A07() {
        C626936e.A01();
        List<Object> list = this.A07;
        synchronized (list) {
            for (Object A1K : list) {
                AnonymousClass0x9.A1K(A1K);
            }
            list.clear();
        }
    }
}
