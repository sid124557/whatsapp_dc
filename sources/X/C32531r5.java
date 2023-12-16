package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.1r5  reason: invalid class name and case insensitive filesystem */
public class C32531r5 extends C623834u {
    public static final AnonymousClass2P1 A07 = new AnonymousClass2P1(C18290x4.A0Z(), "DEFAULT", (String) null);
    public final AnonymousClass08M A00 = C18330xA.A01(C18290x4.A0Z());
    public final C116985rC A01;
    public final C69263Wi A02;
    public final C56612sH A03;
    public final C32521r4 A04;
    public final C989053r A05;
    public final AnonymousClass4FS A06;

    public static final int A00(AnonymousClass2P1 r3) {
        try {
            String str = r3.A02;
            if (str != null) {
                return Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("wallpaperV2/colorIndex was not a number: ");
            C18260x0.A1J(A0o, r3.A02);
        }
        return 0;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32531r5(X.C116985rC r13, X.C69263Wi r14, X.C56972sr r15, X.AnonymousClass0WN r16, X.AnonymousClass310 r17, X.C56512s6 r18, X.C56612sH r19, X.C54292oU r20, X.C48502f0 r21, X.C48092eK r22, X.C32521r4 r23, X.C84924Eg r24, X.C48772fR r25, X.C622634i r26, X.C989053r r27, X.AnonymousClass4FS r28) {
        /*
            r12 = this;
            r11 = r26
            r9 = r24
            r2 = r15
            r1 = r12
            r10 = r25
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r20
            r7 = r21
            r8 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Integer r0 = X.C18290x4.A0Z()
            X.08M r0 = X.C18330xA.A01(r0)
            r12.A00 = r0
            r0 = r19
            r12.A03 = r0
            r12.A02 = r14
            r0 = r27
            r12.A05 = r0
            r0 = r28
            r12.A06 = r0
            r0 = r23
            r12.A04 = r0
            r12.A01 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32531r5.<init>(X.5rC, X.3Wi, X.2sr, X.0WN, X.310, X.2s6, X.2sH, X.2oU, X.2f0, X.2eK, X.1r4, X.4Eg, X.2fR, X.34i, X.53r, X.4FS):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass5QL A0H(android.content.Context r7, X.AnonymousClass2P1 r8, boolean r9) {
        /*
            r6 = this;
            java.lang.String r2 = r8.A01
            X.C626936e.A06(r2)
            android.content.res.Resources r5 = r7.getResources()
            int r0 = r2.hashCode()
            r3 = 2
            r4 = 1
            r1 = 0
            switch(r0) {
                case -2032180703: goto L_0x0093;
                case -1770733785: goto L_0x0075;
                case -899329064: goto L_0x0030;
                case 175331287: goto L_0x002d;
                case 1804184360: goto L_0x001c;
                default: goto L_0x0013;
            }
        L_0x0013:
            r3 = 0
        L_0x0014:
            java.lang.Integer r1 = r8.A00
            X.5QL r0 = new X.5QL
            r0.<init>(r3, r1, r2, r9)
            return r0
        L_0x001c:
            java.lang.String r0 = "COLOR_ONLY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = A00(r8)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass366.A01(r7, r0, r4)
            goto L_0x0014
        L_0x002d:
            java.lang.String r0 = "USER_PROVIDED"
            goto L_0x0077
        L_0x0030:
            java.lang.String r0 = "COLOR_WITH_WA_OVERLAY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0013
            int r5 = A00(r8)
            int r0 = A00(r8)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass366.A01(r7, r0, r4)
            android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
            r3[r1] = r0
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2130903083(0x7f03002b, float:1.7412974E38)
            int[] r0 = r1.getIntArray(r0)
            r1 = r0[r5]
            r0 = 2131234364(0x7f080e3c, float:1.8084892E38)
            android.graphics.drawable.Drawable r0 = X.C18310x6.A0G(r7, r0)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A0B(r0, r1)
            r3[r4] = r0
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r0.<init>(r3)
            android.graphics.Bitmap r1 = X.C107335b8.A00(r0)
            android.content.res.Resources r0 = r7.getResources()
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
            r3.<init>(r0, r1)
            goto L_0x0014
        L_0x0075:
            java.lang.String r0 = "DOWNLOADED"
        L_0x0077:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r8.A02
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r0 = r0.getPath()
            X.C626936e.A06(r0)
            java.io.File r0 = X.AnonymousClass002.A0B(r0)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass366.A03(r7, r5, r0)
            goto L_0x0014
        L_0x0093:
            java.lang.String r0 = "DEFAULT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0013
            android.graphics.drawable.Drawable r3 = X.AnonymousClass366.A02(r7, r5)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32531r5.A0H(android.content.Context, X.2P1, boolean):X.5QL");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r6.equals(r0) == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r1 = X.AnonymousClass002.A0A(r10.getFilesDir(), "wallpaper.jpg");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r1.exists() == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        r1 = android.net.Uri.fromFile(r1).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r6.equals(r0) == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r0 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r7 = r10.getResources().getIntArray(com.whatsapp.R.array.f2nameremoved)[r2];
        r4 = r10.getResources().getIntArray(com.whatsapp.R.array.f2nameremoved);
        r3 = r4.length;
        r2 = 0;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        if (r2 >= r3) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (r4[r2] == r7) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        r1 = r1 + 1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        r2 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r2 = new X.AnonymousClass2P1(0, r6, r1);
        A0L(r10, (X.C95814uZ) null, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2P1 A0J(android.content.Context r10, boolean r11) {
        /*
            r9 = this;
            X.4Eg r0 = r9.A08
            r5 = 0
            X.2P1 r2 = r0.BES(r5, r11)
            if (r2 != 0) goto L_0x0027
            X.1r4 r1 = r9.A04
            r0 = 1
            X.6p5 r1 = r1.A0G(r10, r0)
            java.lang.String r6 = r1.A02
            int r0 = r6.hashCode()
            r8 = 0
            switch(r0) {
                case -1770733785: goto L_0x0028;
                case -899329064: goto L_0x002b;
                case 175331287: goto L_0x002e;
                case 1804184360: goto L_0x0050;
                default: goto L_0x001a;
            }
        L_0x001a:
            r1 = 0
        L_0x001b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            X.2P1 r2 = new X.2P1
            r2.<init>(r0, r6, r1)
            r9.A0L(r10, r5, r2)
        L_0x0027:
            return r2
        L_0x0028:
            java.lang.String r0 = "DOWNLOADED"
            goto L_0x0030
        L_0x002b:
            java.lang.String r0 = "COLOR_WITH_WA_OVERLAY"
            goto L_0x0052
        L_0x002e:
            java.lang.String r0 = "USER_PROVIDED"
        L_0x0030:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.io.File r1 = r10.getFilesDir()
            java.lang.String r0 = "wallpaper.jpg"
            java.io.File r1 = X.AnonymousClass002.A0A(r1, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x001a
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
            java.lang.String r1 = r0.toString()
            goto L_0x001b
        L_0x0050:
            java.lang.String r0 = "COLOR_ONLY"
        L_0x0052:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r0 = r1.A00
            if (r0 != 0) goto L_0x0083
            r2 = 0
        L_0x005d:
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2130903077(0x7f030025, float:1.7412962E38)
            int[] r0 = r1.getIntArray(r0)
            r7 = r0[r2]
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2130903078(0x7f030026, float:1.7412964E38)
            int[] r4 = r1.getIntArray(r0)
            int r3 = r4.length
            r2 = 0
            r1 = 0
        L_0x0078:
            if (r2 >= r3) goto L_0x0088
            r0 = r4[r2]
            if (r0 == r7) goto L_0x0089
            int r1 = r1 + 1
            int r2 = r2 + 1
            goto L_0x0078
        L_0x0083:
            int r2 = r0.intValue()
            goto L_0x005d
        L_0x0088:
            r1 = 0
        L_0x0089:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32531r5.A0J(android.content.Context, boolean):X.2P1");
    }

    public final void A0K() {
        File[] listFiles;
        AnonymousClass1R1 r4 = (AnonymousClass1R1) this.A08;
        C85284Fq A062 = C18630y0.A06(r4);
        try {
            C56862sg r2 = ((AnonymousClass3H0) A062).A03;
            r2.A0H("UPDATE settings SET wallpaper_light_type = NULL, wallpaper_light_value = NULL, wallpaper_dark_type = NULL, wallpaper_dark_value = NULL, wallpaper_dark_opacity = NULL WHERE jid != 'individual_chat_defaults'", "RESET_ALL_CUSTOM_WALLPAPERS");
            r2.A0H("UPDATE settings SET wallpaper_light_type = 'DEFAULT', wallpaper_light_value = NULL, wallpaper_dark_type = 'DEFAULT', wallpaper_dark_value = NULL, wallpaper_dark_opacity = NULL WHERE jid = 'individual_chat_defaults'", "RESET_GLOBAL_WALLPAPER_TO_DEFAULT");
            A062.close();
            r4.A0Y.clear();
            File A0A = AnonymousClass002.A0A(C54292oU.A03(this.A05), "Wallpapers");
            if (A0A.exists() && (listFiles = A0A.listFiles()) != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public final AnonymousClass0PJ A0G(Context context, C95814uZ r7) {
        AnonymousClass2P1 BES;
        boolean A0D = C107405bG.A0D(context);
        boolean z = true;
        boolean A1X = AnonymousClass000.A1X(r7);
        C116985rC r1 = this.A01;
        if (r1.A07() && ((C1229766o) r1.A04()).BH2(r7)) {
            BES = A07;
        } else if (r7 == null) {
            BES = A0J(context, A0D);
        } else {
            BES = this.A08.BES(r7, A0D);
            if (BES == null) {
                BES = A0J(context, A0D);
            } else {
                z = A1X;
            }
            A1X = z;
        }
        return AnonymousClass0x9.A0G(BES, Boolean.valueOf(A1X));
    }

    public final AnonymousClass2P1 A0I(Context context, BitmapDrawable bitmapDrawable, C95814uZ r8) {
        FileOutputStream A0h;
        String A042 = C627236i.A04(String.valueOf(System.currentTimeMillis()));
        if (A042 == null) {
            A042 = String.valueOf(System.currentTimeMillis());
        }
        File A0A = AnonymousClass002.A0A(AnonymousClass0x7.A0e(context.getFilesDir(), "Wallpapers"), A042);
        if (!A0A.exists()) {
            try {
                A0h = AnonymousClass0x9.A0h(A0A);
                bitmapDrawable.getBitmap().compress(Bitmap.CompressFormat.JPEG, 90, A0h);
                A0h.close();
            } catch (IOException e) {
                Log.e("wallpaper/v2/save-wallpaper-file/failed to save wallpaper", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        AnonymousClass2P1 r0 = new AnonymousClass2P1(25, "USER_PROVIDED", Uri.fromFile(A0A).toString());
        A0L(context, r8, r0);
        return r0;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r1.equalsIgnoreCase(r10.A02) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r6 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if ("USER_PROVIDED".equalsIgnoreCase(r6.A01) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r2 != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        r0 = android.net.Uri.parse(r6.A02).getPath();
        X.C626936e.A06(r0);
        X.AnonymousClass002.A0B(r0).delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if ("USER_PROVIDED".equalsIgnoreCase(r10.A01) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(android.content.Context r8, X.C95814uZ r9, X.AnonymousClass2P1 r10) {
        /*
            r7 = this;
            boolean r5 = X.C107405bG.A0D(r8)
            X.4Eg r4 = r7.A08
            X.2P1 r6 = r4.BES(r9, r5)
            if (r10 == 0) goto L_0x0017
            java.lang.String r1 = "USER_PROVIDED"
            java.lang.String r0 = r10.A01
            boolean r1 = r1.equalsIgnoreCase(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3 = 1
            if (r0 == 0) goto L_0x002a
            if (r6 == 0) goto L_0x004d
            java.lang.String r1 = r6.A02
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = r10.A02
            boolean r0 = r1.equalsIgnoreCase(r0)
            r2 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002a:
            r2 = 0
            if (r6 == 0) goto L_0x004d
        L_0x002d:
            java.lang.String r1 = "USER_PROVIDED"
            java.lang.String r0 = r6.A01
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x004d
            if (r2 != 0) goto L_0x004d
            java.lang.String r0 = r6.A02
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r0 = r0.getPath()
            X.C626936e.A06(r0)
            java.io.File r0 = X.AnonymousClass002.A0B(r0)
            r0.delete()
        L_0x004d:
            r7.A00 = r3
            r4.Bkl(r9, r10, r5)
            if (r9 == 0) goto L_0x0059
            r0 = r5 ^ 1
            r4.Bkl(r9, r10, r0)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32531r5.A0L(android.content.Context, X.4uZ, X.2P1):void");
    }
}
