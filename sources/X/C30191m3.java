package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.1m3  reason: invalid class name and case insensitive filesystem */
public class C30191m3 extends C105335Un {
    public final C48352el A00;
    public final C69263Wi A01;
    public final C29441ip A02;
    public final C64773Ex A03;
    public final C29421in A04;
    public final C56332ro A05;
    public final C55052pi A06;
    public final C56612sH A07;
    public final AnonymousClass33p A08;
    public final C66543Lv A09;
    public final C56892sj A0A;
    public final C56152rV A0B;
    public final AnonymousClass1VX A0C;
    public final AnonymousClass4FV A0D;
    public final C56452s0 A0E;
    public final C56832sd A0F;
    public final C45602aH A0G;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C30191m3(X.C116985rC r14, X.C48352el r15, X.C64393Dh r16, X.C69263Wi r17, X.C56972sr r18, X.C29441ip r19, X.C64773Ex r20, X.C29421in r21, X.C56332ro r22, X.C55052pi r23, X.C620633i r24, X.C56612sH r25, X.AnonymousClass33p r26, X.C620733j r27, X.C66543Lv r28, X.C56892sj r29, X.C56152rV r30, X.AnonymousClass1VX r31, X.AnonymousClass4FV r32, X.C49652gs r33, X.C56452s0 r34, X.C56832sd r35, X.C45602aH r36, X.C187958y5 r37, X.AnonymousClass4FS r38) {
        /*
            r13 = this;
            r1 = r13
            r7 = r24
            r6 = r22
            r5 = r18
            r4 = r17
            r3 = r16
            r12 = r38
            r11 = r37
            r10 = r33
            r9 = r31
            r2 = r14
            r8 = r27
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r25
            r13.A07 = r0
            r13.A0C = r9
            r13.A01 = r4
            r0 = r32
            r13.A0D = r0
            r0 = r20
            r13.A03 = r0
            r13.A00 = r15
            r0 = r21
            r13.A04 = r0
            r0 = r28
            r13.A09 = r0
            r0 = r36
            r13.A0G = r0
            r0 = r30
            r13.A0B = r0
            r13.A05 = r6
            r0 = r23
            r13.A06 = r0
            r0 = r34
            r13.A0E = r0
            r0 = r35
            r13.A0F = r0
            r0 = r29
            r13.A0A = r0
            r0 = r19
            r13.A02 = r0
            r0 = r26
            r13.A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30191m3.<init>(X.5rC, X.2el, X.3Dh, X.3Wi, X.2sr, X.1ip, X.3Ex, X.1in, X.2ro, X.2pi, X.33i, X.2sH, X.33p, X.33j, X.3Lv, X.2sj, X.2rV, X.1VX, X.4FV, X.2gs, X.2s0, X.2sd, X.2aH, X.8y5, X.4FS):void");
    }

    public boolean A0B(AnonymousClass3ZH r3) {
        File A012 = this.A05.A01(r3);
        if (A012 == null || !A012.exists()) {
            return false;
        }
        return true;
    }

    public AnonymousClass331 A0C(C95814uZ r19, byte[] bArr, byte[] bArr2, boolean z) {
        C56612sH r7 = this.A07;
        C69263Wi r1 = this.A01;
        C56972sr r2 = this.A03;
        AnonymousClass4FV r11 = this.A0D;
        C64773Ex r3 = this.A03;
        C29421in r4 = this.A04;
        C56152rV r10 = this.A0B;
        return new AnonymousClass331(r1, r2, r3, r4, this.A05, this.A06, r7, this.A09, this.A0A, r10, r11, r19, this.A0E, this.A0F, bArr, bArr2, z);
    }

    public C41802Lq A0D(byte[] bArr) {
        FileOutputStream A0h;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        options.inDither = true;
        options.inPreferQualityOverSpeed = true;
        Bitmap bitmap = C107245ax.A05((AnonymousClass5QA) null, new AnonymousClass5WB(options, (Long) null, 96, 96, true), bArr, false).A02;
        if (bitmap != null) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(96, 96, config);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            paint.setDither(true);
            canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, 96, 96), paint);
            bitmap.recycle();
            try {
                A0h = AnonymousClass0x9.A0h(this.A01.A0S("tmpt"));
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 75, A0h);
                A0h.close();
            } catch (IOException e) {
                Log.e("profileinfo/sendphoto/cannot save thumb", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            createBitmap.recycle();
            File A0S = this.A01.A0S("tmpt");
            byte[] bArr2 = new byte[((int) A0S.length())];
            FileInputStream A0g = AnonymousClass0x9.A0g(A0S);
            try {
                A0g.read(bArr2);
                A0g.close();
                return new C41802Lq(bArr, bArr2);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        } else {
            Log.e("profileinfo/sendphoto/cannot decode thumb");
            throw new FileNotFoundException();
        }
        throw th;
    }

    public void A0E(AnonymousClass3ZH r8) {
        if (!this.A02.A0F()) {
            this.A01.A0H(R.string.f11nameremoved, 0);
            return;
        }
        this.A0E.A05(A0C(AnonymousClass3ZH.A02(r8, C95814uZ.class), (byte[]) null, (byte[]) null, false));
        AnonymousClass33p r6 = this.A08;
        if (AnonymousClass0x2.A0F(r6).getInt("privacy_profile_photo", 0) == 0 && AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r6), "privacy_tip_remove_profile_photo_timestamp") == -1 && this.A0C.A0Y(C58422vE.A02, 3998)) {
            r6.A1Y("privacy_tip_remove_profile_photo_timestamp");
        }
    }

    public void A0F(AnonymousClass3ZH r10) {
        FileInputStream A0g;
        int read;
        C56332ro r0 = this.A05;
        File A002 = r0.A00(r10);
        File A012 = r0.A01(r10);
        if (A002 != null && A002.exists() && A012 != null && A012.exists()) {
            try {
                FileInputStream A0g2 = AnonymousClass0x9.A0g(A012);
                try {
                    A0g = AnonymousClass0x9.A0g(A002);
                    int length = (int) A012.length();
                    byte[] bArr = new byte[length];
                    int i = 0;
                    while (i < length && (read = A0g2.read(bArr, i, length - i)) != -1) {
                        i += read;
                    }
                    int length2 = (int) A002.length();
                    byte[] bArr2 = new byte[length2];
                    int i2 = 0;
                    while (i2 < length2) {
                        int read2 = A0g.read(bArr2, i2, length2 - i2);
                        if (read2 == -1) {
                            break;
                        }
                        i2 += read2;
                    }
                    C95814uZ A013 = AnonymousClass3ZH.A01(r10);
                    C626936e.A06(A013);
                    AnonymousClass331 A0C2 = A0C(A013, bArr2, bArr, false);
                    A0C2.A01 = true;
                    this.A0E.A05(A0C2);
                    A0g.close();
                    A0g2.close();
                    return;
                } catch (Throwable th) {
                    A0g2.close();
                    throw th;
                }
            } catch (IOException e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass3ZH.A0C(r10, "profileinfo/resend/jid ", A0o);
                C18260x0.A15("/failed", A0o, e);
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            return;
        }
        throw th;
    }

    public boolean A0G(AnonymousClass3ZH r4) {
        return A0H(r4, this.A05.A00.A0S("tmpp"), (byte[]) null, false);
    }

    public final boolean A0H(AnonymousClass3ZH r8, File file, byte[] bArr, boolean z) {
        C41802Lq r6;
        if (!this.A02.A0F()) {
            this.A01.A0H(R.string.f11nameremoved, 0);
            return false;
        }
        if (file != null) {
            try {
                r6 = A0D(C627536m.A0U(file));
            } catch (FileNotFoundException | IOException e) {
                this.A01.A0H(R.string.f11nameremoved, 0);
                Log.e("profileinfo/sendphoto", e);
                return false;
            }
        } else {
            C626936e.A06(bArr);
            r6 = A0D(bArr);
        }
        this.A0E.A05(A0C(AnonymousClass3ZH.A02(r8, C95814uZ.class), r6.A00, r6.A01, z));
        return true;
    }

    public int A01() {
        return 0;
    }
}
