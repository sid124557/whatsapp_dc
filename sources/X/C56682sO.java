package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2sO  reason: invalid class name and case insensitive filesystem */
public class C56682sO {
    public C624134x A00;
    public final C55682qk A01;
    public final C56972sr A02;
    public final C66663Mh A03;
    public final C64773Ex A04;
    public final AnonymousClass5ZU A05;
    public final C620633i A06;
    public final C54292oU A07;
    public final C620733j A08;
    public final C48042eF A09;
    public final AnonymousClass1VX A0A;
    public final C66553Lw A0B;
    public final C59962xm A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        r9 = r12 * 3;
        r1 = r9 / 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C05610Ue r18, X.AnonymousClass3ZH r19, java.lang.StringBuilder r20, boolean r21) {
        /*
            r17 = this;
            r6 = 1
            r8 = 0
            r5 = r17
            if (r21 == 0) goto L_0x0032
            r0 = r19
            java.lang.CharSequence r4 = r5.A04(r0, r8)
        L_0x000c:
            X.34x r1 = r5.A00
            boolean r0 = r1 instanceof X.AnonymousClass1n2
            r3 = r18
            r7 = r20
            if (r0 == 0) goto L_0x006c
            r0 = r1
            X.1mV r0 = (X.C30471mV) r0
            X.33C r10 = r0.A01
            if (r10 == 0) goto L_0x006c
            X.3Lw r11 = r5.A0B
            X.C626936e.A06(r10)
            boolean r0 = r10.A0R
            r2 = 0
            if (r0 == 0) goto L_0x0133
            java.io.File r0 = r10.A0F
            if (r0 == 0) goto L_0x0133
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0133
            goto L_0x0042
        L_0x0032:
            X.33j r4 = r5.A08
            r3 = 2131755233(0x7f1000e1, float:1.914134E38)
            long r1 = (long) r6
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.AnonymousClass000.A1P(r0, r6, r8)
            java.lang.String r4 = r4.A0L(r0, r3, r1)
            goto L_0x000c
        L_0x0042:
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x00dc }
            r9.<init>()     // Catch:{ OutOfMemoryError -> 0x00dc }
            r9.inJustDecodeBounds = r6     // Catch:{ OutOfMemoryError -> 0x00dc }
            java.io.File r0 = r10.A0F     // Catch:{ OutOfMemoryError -> 0x00dc }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ OutOfMemoryError -> 0x00dc }
            android.graphics.BitmapFactory.decodeFile(r0, r9)     // Catch:{ OutOfMemoryError -> 0x00dc }
            int r1 = r9.outWidth     // Catch:{ OutOfMemoryError -> 0x00dc }
            int r0 = r9.outHeight     // Catch:{ OutOfMemoryError -> 0x00dc }
            int r1 = r11.A0C(r1, r0)     // Catch:{ OutOfMemoryError -> 0x00dc }
            r9.inSampleSize = r1     // Catch:{ OutOfMemoryError -> 0x00dc }
            r0 = -1
            if (r1 == r0) goto L_0x0133
            r9.inJustDecodeBounds = r8     // Catch:{ OutOfMemoryError -> 0x00dc }
            java.io.File r0 = r10.A0F     // Catch:{ OutOfMemoryError -> 0x00dc }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ OutOfMemoryError -> 0x00dc }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r0, r9)     // Catch:{ OutOfMemoryError -> 0x00dc }
            goto L_0x00dc
        L_0x006c:
            boolean r0 = r1 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x0133
            X.34w r0 = r1.A0P
            if (r0 != 0) goto L_0x0133
            X.3Lw r10 = r5.A0B
            X.1nE r1 = (X.AnonymousClass1nE) r1
            X.2qp r0 = r10.A0O
            X.39M r13 = r0.A00(r1)
            X.2oU r0 = r10.A0B
            android.content.res.Resources r1 = X.C54292oU.A00(r0)
            r0 = 2131168371(0x7f070c73, float:1.7951042E38)
            int r12 = r1.getDimensionPixelSize(r0)
            r14 = 0
            com.whatsapp.stickers.WebpUtils r11 = r10.A0Q     // Catch:{ OutOfMemoryError -> 0x0133 }
            X.33i r9 = r10.A0A     // Catch:{ OutOfMemoryError -> 0x0133 }
            X.33Q r2 = r10.A0P     // Catch:{ OutOfMemoryError -> 0x0133 }
            X.3Dh r0 = r10.A02     // Catch:{ OutOfMemoryError -> 0x0133 }
            java.lang.String r1 = X.AnonymousClass33O.A00(r13, r12, r12)     // Catch:{ OutOfMemoryError -> 0x0133 }
            byte[] r0 = X.AnonymousClass33O.A01(r0, r9, r13, r11)     // Catch:{ OutOfMemoryError -> 0x0133 }
            if (r0 == 0) goto L_0x0133
            android.graphics.Bitmap r13 = r2.A05(r1, r0, r12, r12)     // Catch:{ OutOfMemoryError -> 0x0133 }
            if (r13 == 0) goto L_0x0133
            int r9 = r12 * 3
            int r1 = r9 / 2
            int r2 = r10.A0C(r9, r1)     // Catch:{ OutOfMemoryError -> 0x0133 }
            r0 = -1
            if (r2 == r0) goto L_0x0133
            int r9 = r9 / r2
            int r1 = r1 / r2
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x0133 }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r9, r1, r0)     // Catch:{ OutOfMemoryError -> 0x0133 }
            android.graphics.Canvas r12 = new android.graphics.Canvas     // Catch:{ OutOfMemoryError -> 0x0133 }
            r12.<init>(r2)     // Catch:{ OutOfMemoryError -> 0x0133 }
            float r15 = (float) r9     // Catch:{ OutOfMemoryError -> 0x0133 }
            r16 = 1077936128(0x40400000, float:3.0)
            float r11 = r15 / r16
            float r10 = (float) r1     // Catch:{ OutOfMemoryError -> 0x0133 }
            r1 = 1086324736(0x40c00000, float:6.0)
            float r9 = r10 / r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r15 = r15 * r0
            float r15 = r15 / r16
            r0 = 1084227584(0x40a00000, float:5.0)
            float r10 = r10 * r0
            float r10 = r10 / r1
            android.graphics.RectF r1 = new android.graphics.RectF     // Catch:{ OutOfMemoryError -> 0x0133 }
            r1.<init>(r11, r9, r15, r10)     // Catch:{ OutOfMemoryError -> 0x0133 }
            android.graphics.Paint r0 = new android.graphics.Paint     // Catch:{ OutOfMemoryError -> 0x0133 }
            r0.<init>()     // Catch:{ OutOfMemoryError -> 0x0133 }
            r12.drawBitmap(r13, r14, r1, r0)     // Catch:{ OutOfMemoryError -> 0x0133 }
        L_0x00dc:
            if (r2 == 0) goto L_0x0133
            java.lang.String r0 = " bigpicture"
            r7.append(r0)
            androidx.core.app.NotificationCompat$BigPictureStyle r1 = new androidx.core.app.NotificationCompat$BigPictureStyle
            r1.<init>()
            java.lang.CharSequence r0 = X.C05610Ue.A00(r4)
            r1.A01 = r0
            r1.A02 = r6
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A03(r2)
            r1.A00 = r0
            r3.A08(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0162
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "wa-notification-manager bigpicturestylepicture builder="
            X.C18280x3.A1G(r1, r0, r3)
            java.lang.String r0 = " ref="
            X.C18280x3.A1G(r1, r0, r2)
            java.lang.String r0 = " c="
            r1.append(r0)
            int r0 = r2.getByteCount()
            r1.append(r0)
            java.lang.String r0 = " w="
            r1.append(r0)
            int r0 = r2.getWidth()
            r1.append(r0)
            java.lang.String r0 = " h="
            r1.append(r0)
            int r0 = r2.getHeight()
            X.C18260x0.A1F(r1, r0)
            return
        L_0x0133:
            java.lang.String r0 = " bigtext:"
            r7.append(r0)
            int r0 = r4.length()
            r7.append(r0)
            androidx.core.app.NotificationCompat$BigTextStyle r7 = new androidx.core.app.NotificationCompat$BigTextStyle
            r7.<init>()
            r7.A07(r4)
            X.33j r5 = r5.A08
            r4 = 2131755233(0x7f1000e1, float:1.914134E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            X.AnonymousClass000.A1P(r2, r6, r8)
            r0 = 1
            java.lang.String r0 = r5.A0L(r2, r4, r0)
            java.lang.CharSequence r0 = X.C05610Ue.A00(r0)
            r7.A01 = r0
            r7.A02 = r6
            r3.A08(r7)
        L_0x0162:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56682sO.A07(X.0Ue, X.3ZH, java.lang.StringBuilder, boolean):void");
    }

    public long A00() {
        C624134x r0;
        if (this instanceof C28551hK) {
            r0 = ((C28551hK) this).A00.A00;
        } else if (this instanceof AnonymousClass1hM) {
            return ((AnonymousClass1hM) this).A00.A02;
        } else {
            if (this instanceof AnonymousClass1hL) {
                r0 = ((AnonymousClass1hL) this).A00.A01;
            } else {
                r0 = this.A00;
            }
        }
        return r0.A1L;
    }

    public AnonymousClass3ZH A02() {
        C95814uZ A0o = this.A00.A0o();
        if (A0o == null) {
            A0o = this.A00.A1J.A00;
        }
        C626936e.A06(A0o);
        return this.A04.A0A(A0o);
    }

    public AnonymousClass2LY A03(AnonymousClass3ZH r16) {
        CharSequence A0G;
        C624134x A0w;
        String str;
        String A0A2;
        AnonymousClass3ZH r10 = r16;
        if (this instanceof C28551hK) {
            C28551hK r7 = (C28551hK) this;
            C42622Ow r5 = r7.A00;
            C30551md r1 = r5.A01;
            int A012 = C18280x3.A01(AnonymousClass2z0.A0D(r1) ? 1 : 0);
            C95814uZ A0n = r1.A0n();
            AnonymousClass5ZU r2 = r7.A05;
            String A0R = r2.A0R(r10, A012, false);
            if (r10.A0U() && A0n != null) {
                A0R = AnonymousClass000.A0V(" @ ", A0R, AnonymousClass000.A0l(r2.A0R(r7.A04.A0A(A0n), A012, false)));
            }
            C626936e.A06(A0R);
            C66553Lw r12 = r7.A0B;
            Context context = r7.A01.A00;
            return new AnonymousClass2LY(A0R, context.getString(R.string.f11nameremoved, AnonymousClass000.A1b(r12.A0F(context, r5.A00))));
        }
        if (this instanceof AnonymousClass1hM) {
            AnonymousClass1hM r72 = (AnonymousClass1hM) this;
            AnonymousClass5ZU r4 = r72.A05;
            int A072 = r4.A07((AnonymousClass3ZH) null, r72.A00.A04.A00);
            UserJid A0o = r72.A00.A03.A0o();
            str = r4.A0R(r10, A072, false);
            if (r10.A0U() && A0o != null) {
                Integer num = r72.A00.A01;
                if (num == null) {
                    str = "";
                    A0A2 = r72.A0A();
                } else {
                    String A0R2 = r4.A0R(r72.A04.A0A(A0o), A072, false);
                    int intValue = num.intValue() - 1;
                    if (intValue > 0) {
                        Resources A002 = C54292oU.A00(r72.A07);
                        Object[] A1X = AnonymousClass0x9.A1X();
                        A1X[0] = A0R2;
                        AnonymousClass000.A1P(A1X, intValue, 1);
                        A1X[2] = str;
                        str = A002.getQuantityString(R.plurals.f9nameremoved, intValue, A1X);
                    } else {
                        str = AnonymousClass000.A0V(" @ ", str, AnonymousClass000.A0l(A0R2));
                    }
                }
            }
            C626936e.A06(str);
            A0A2 = r72.A0A();
        } else if (this instanceof AnonymousClass1hL) {
            AnonymousClass1hL r73 = (AnonymousClass1hL) this;
            AnonymousClass5ZU r3 = r73.A05;
            int A073 = r3.A07((AnonymousClass3ZH) null, r73.A00.A02.A1J.A00);
            C95814uZ A0n2 = r73.A00.A02.A0n();
            String A0R3 = r3.A0R(r10, A073, false);
            if (r10.A0U() && A0n2 != null) {
                String A0R4 = r3.A0R(r73.A04.A0A(A0n2), A073, false);
                int i = r73.A00.A00 - 1;
                if (i != 0) {
                    Resources A003 = C54292oU.A00(r73.A01);
                    Object[] A1X2 = AnonymousClass0x9.A1X();
                    A1X2[0] = A0R4;
                    AnonymousClass000.A1P(A1X2, i, 1);
                    A1X2[2] = A0R3;
                    A0R3 = A003.getQuantityString(R.plurals.f9nameremoved, i, A1X2);
                } else {
                    A0R3 = AnonymousClass000.A0V(" @ ", A0R3, AnonymousClass000.A0l(A0R4));
                }
            }
            C626936e.A06(str);
            A0A2 = r73.A0A();
        } else {
            C66553Lw r9 = this.A0B;
            C624134x r11 = this.A00;
            if (r11 == null) {
                return new AnonymousClass2LY("", "");
            }
            Context context2 = r9.A0B.A00;
            AnonymousClass1VX r42 = r9.A0H;
            C56972sr r32 = r9.A03;
            C58422vE r13 = C58422vE.A02;
            if ((!r42.A0Y(r13, 4927) || !C624435a.A05(r32, r11.A18)) && (!r42.A0Y(r13, 5194) || !AnonymousClass2z0.A0D(r11) || (A0w = r11.A0w()) == null || !A0w.A1J.A02)) {
                A0G = r9.A0F(context2, r11);
            } else {
                A0G = r9.A0G(r10, r11, false, false, false);
            }
            return new AnonymousClass2LY(r9.A0J(r10, r11), A0G);
        }
        return new AnonymousClass2LY(str, A0A2);
    }

    public CharSequence A04(AnonymousClass3ZH r16, boolean z) {
        StringBuilder A0o;
        CharSequence charSequence;
        StringBuilder A0o2;
        CharSequence A0V;
        StringBuilder A0o3;
        CharSequence A0X;
        AnonymousClass3ZH r10 = r16;
        boolean z2 = z;
        if (this instanceof C28551hK) {
            C28551hK r2 = (C28551hK) this;
            CharSequence[] charSequenceArr = new CharSequence[2];
            C42622Ow r5 = r2.A00;
            C95814uZ r9 = r5.A01.A1J.A00;
            AnonymousClass5ZU r8 = r2.A05;
            int A072 = r8.A07(r10, r9);
            if (r10.A0U()) {
                String A0B2 = C624134x.A0B(r9, r2.A0B, r2.A00);
                boolean z3 = r2.A00.A1J.A02;
                if (z) {
                    if (!z3) {
                        A0o3 = C18290x4.A0v(A0B2);
                        A0o3.append(" @ ");
                    }
                } else if (!z3) {
                    A0X = C66553Lw.A02(AnonymousClass000.A0X(": ", C18290x4.A0v(A0B2)));
                    charSequenceArr[0] = A0X;
                    C66553Lw r1 = r2.A0B;
                    Context context = r2.A01.A00;
                    charSequenceArr[1] = AnonymousClass0x2.A0X(context, r1.A0F(context, r5.A00), 1, R.string.f11nameremoved);
                    return TextUtils.concat(charSequenceArr);
                }
                A0o3 = AnonymousClass001.A0o();
            } else {
                String A0R = r8.A0R(r10, A072, false);
                C626936e.A06(A0R);
                if (z) {
                    A0X = AnonymousClass000.A0X(": ", C18290x4.A0v(A0R));
                    charSequenceArr[0] = A0X;
                    C66553Lw r12 = r2.A0B;
                    Context context2 = r2.A01.A00;
                    charSequenceArr[1] = AnonymousClass0x2.A0X(context2, r12.A0F(context2, r5.A00), 1, R.string.f11nameremoved);
                    return TextUtils.concat(charSequenceArr);
                }
                A0o3 = AnonymousClass001.A0o();
            }
            A0X = AnonymousClass000.A0V(r8.A0R(r10, A072, false), ": ", A0o3);
            charSequenceArr[0] = A0X;
            C66553Lw r122 = r2.A0B;
            Context context22 = r2.A01.A00;
            charSequenceArr[1] = AnonymousClass0x2.A0X(context22, r122.A0F(context22, r5.A00), 1, R.string.f11nameremoved);
            return TextUtils.concat(charSequenceArr);
        } else if (this instanceof AnonymousClass1hM) {
            AnonymousClass1hM r4 = (AnonymousClass1hM) this;
            CharSequence[] charSequenceArr2 = new CharSequence[2];
            C95814uZ r82 = r4.A00.A04.A00;
            if (r82 == null) {
                A0V = "";
            } else {
                AnonymousClass5ZU r7 = r4.A05;
                int A073 = r7.A07((AnonymousClass3ZH) null, r82);
                if (r10.A0U()) {
                    C624134x r13 = r4.A00;
                    boolean z4 = r13.A1J.A02;
                    if (z) {
                        if (!z4) {
                            CharSequence A092 = r4.A09(C624134x.A0B(r82, r4.A0B, r13));
                            A0o2 = AnonymousClass001.A0o();
                            A0o2.append(A092.toString());
                            A0o2.append(" @ ");
                            A0V = AnonymousClass000.A0V(r7.A0R(r10, A073, false), ": ", A0o2);
                        }
                    } else if (!z4) {
                        A0V = C66553Lw.A02(AnonymousClass000.A0X(": ", C18290x4.A0v(r4.A09(C624134x.A0B(r82, r4.A0B, r13)))));
                    }
                }
                A0o2 = AnonymousClass001.A0o();
                A0V = AnonymousClass000.A0V(r7.A0R(r10, A073, false), ": ", A0o2);
            }
            charSequenceArr2[0] = A0V;
            charSequenceArr2[1] = r4.A0A();
            return TextUtils.concat(charSequenceArr2);
        } else if (!(this instanceof AnonymousClass1hL)) {
            return this.A0B.A0G(r10, this.A00, z2, false, true);
        } else {
            AnonymousClass1hL r3 = (AnonymousClass1hL) this;
            CharSequence[] charSequenceArr3 = new CharSequence[2];
            C95814uZ r83 = r3.A00.A02.A1J.A00;
            AnonymousClass5ZU r72 = r3.A05;
            int A074 = r72.A07((AnonymousClass3ZH) null, r83);
            if (r10.A0U()) {
                C624134x r42 = r3.A00;
                boolean z5 = r42.A1J.A02;
                if (z) {
                    if (!z5) {
                        A0o = C18290x4.A0v(r3.A09(C624134x.A0B(r83, r3.A0B, r42)));
                        A0o.append(" @ ");
                    }
                } else if (!z5) {
                    charSequence = C66553Lw.A02(AnonymousClass000.A0X(": ", C18290x4.A0v(r3.A09(C624134x.A0B(r83, r3.A0B, r42)))));
                    charSequenceArr3[0] = charSequence;
                    charSequenceArr3[1] = r3.A0A();
                    return TextUtils.concat(charSequenceArr3);
                }
                A0o = AnonymousClass001.A0o();
            } else {
                if (z) {
                    String A0R2 = r72.A0R(r10, A074, false);
                    C626936e.A06(A0R2);
                    A0o = C18290x4.A0v(r3.A09(A0R2));
                    charSequence = AnonymousClass000.A0X(": ", A0o);
                    charSequenceArr3[0] = charSequence;
                    charSequenceArr3[1] = r3.A0A();
                    return TextUtils.concat(charSequenceArr3);
                }
                A0o = AnonymousClass001.A0o();
            }
            A0o.append(r72.A0R(r10, A074, false));
            charSequence = AnonymousClass000.A0X(": ", A0o);
            charSequenceArr3[0] = charSequence;
            charSequenceArr3[1] = r3.A0A();
            return TextUtils.concat(charSequenceArr3);
        }
    }

    public String A05() {
        AnonymousClass5UR A0R = this.A06.A0R();
        if (A0R == null) {
            Log.w("messagenotification cr=null");
        } else {
            Uri A032 = this.A04.A03(A02(), A0R);
            if (A032 != null) {
                return A032.toString();
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e6, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C05610Ue r12, androidx.core.app.NotificationCompat$MessagingStyle r13, X.AnonymousClass3ZH r14) {
        /*
            r11 = this;
            X.34x r1 = r11.A00
            boolean r0 = r1 instanceof X.C30791n7
            if (r0 != 0) goto L_0x0157
            boolean r0 = r1 instanceof X.C30771mz
            if (r0 != 0) goto L_0x0157
            boolean r0 = X.C624134x.A0c(r1)
            if (r0 != 0) goto L_0x0157
        L_0x0010:
            X.2LY r0 = r11.A03(r14)
            X.0Of r7 = r11.A01()
            java.lang.CharSequence r2 = r0.A00
            X.34x r0 = r11.A00
            long r0 = r0.A0K
            X.0Ti r6 = new X.0Ti
            r6.<init>(r7, r2, r0)
            X.34x r2 = r11.A00
            X.3Mh r1 = r11.A03
            byte r0 = r2.A1I
            boolean r0 = X.C627636p.A0I(r0)
            if (r0 != 0) goto L_0x007b
            boolean r0 = r2 instanceof X.AnonymousClass1n2
            if (r0 != 0) goto L_0x004f
            boolean r0 = r2 instanceof X.C30721mu
            if (r0 == 0) goto L_0x003f
            X.1Ei r0 = X.C66663Mh.A0F
            boolean r0 = r1.A08(r0)
            if (r0 != 0) goto L_0x004f
        L_0x003f:
            boolean r0 = r2 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x007b
            X.34w r0 = r2.A0P
            if (r0 != 0) goto L_0x007b
            X.1nE r2 = (X.AnonymousClass1nE) r2
            boolean r0 = r2.A24()
            if (r0 != 0) goto L_0x007b
        L_0x004f:
            X.34x r2 = r11.A00
            boolean r0 = r2 instanceof X.C30771mz
            if (r0 != 0) goto L_0x007b
            X.1mV r2 = (X.C30471mV) r2
            X.33C r1 = r2.A01
            if (r1 == 0) goto L_0x0077
            boolean r0 = r1.A0R
            if (r0 == 0) goto L_0x0077
            java.io.File r0 = r1.A0F
            if (r0 == 0) goto L_0x0077
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0077
            X.2qk r1 = r11.A01
            X.2eF r0 = r11.A09
            android.net.Uri r1 = com.whatsapp.contentprovider.MediaProvider.A05(r1, r0, r2)
            java.lang.String r0 = r2.A05
        L_0x0073:
            r6.A02 = r0
            r6.A00 = r1
        L_0x0077:
            r13.A08(r6)
            return
        L_0x007b:
            X.34x r2 = r11.A00
            boolean r0 = r2 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x010e
            X.1mV r2 = (X.C30471mV) r2
            X.33C r1 = r2.A01
            if (r1 == 0) goto L_0x0077
            boolean r0 = r1.A0R
            if (r0 == 0) goto L_0x0077
            java.io.File r0 = r1.A0F
            if (r0 == 0) goto L_0x0077
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0077
            X.2xm r10 = r11.A0C
            X.2eF r7 = r11.A09
            java.io.File r1 = X.C30471mV.A01(r2)
            X.C626936e.A06(r1)
            java.lang.String r4 = X.C18280x3.A0Y()
            java.lang.String r5 = r1.getName()
            java.lang.String r9 = r2.A04
            r8 = 0
            X.1sT r0 = r10.A01     // Catch:{ OutOfMemoryError -> 0x00e7 }
            X.0QL r0 = r0.A05(r1, r9)     // Catch:{ OutOfMemoryError -> 0x00e7 }
            if (r0 == 0) goto L_0x00ed
            X.01G r2 = new X.01G     // Catch:{ OutOfMemoryError -> 0x00e7 }
            r2.<init>()     // Catch:{ OutOfMemoryError -> 0x00e7 }
            r2.A0G(r0)     // Catch:{ OutOfMemoryError -> 0x00e7 }
            int r1 = r2.getIntrinsicWidth()     // Catch:{ OutOfMemoryError -> 0x00e7 }
            int r0 = r2.getIntrinsicHeight()     // Catch:{ OutOfMemoryError -> 0x00e7 }
            android.graphics.Bitmap r3 = X.C59962xm.A00(r2, r1, r0)     // Catch:{ OutOfMemoryError -> 0x00e7 }
            X.3Dh r0 = r10.A00     // Catch:{ OutOfMemoryError -> 0x00e7 }
            java.io.File r1 = r0.A0D()     // Catch:{ OutOfMemoryError -> 0x00e7 }
            java.lang.String r0 = ".thumb.lottie.tmp"
            java.io.File r0 = X.C64393Dh.A04(r1, r9, r8, r0)     // Catch:{ OutOfMemoryError -> 0x00e7 }
            if (r0 == 0) goto L_0x00ed
            java.io.FileOutputStream r2 = X.AnonymousClass0x9.A0h(r0)     // Catch:{ OutOfMemoryError -> 0x00e7 }
            X.C18310x6.A12(r3, r2)     // Catch:{ all -> 0x00e0 }
            r2.close()     // Catch:{ OutOfMemoryError -> 0x00e7 }
            goto L_0x00ef
        L_0x00e0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ OutOfMemoryError -> 0x00e7 }
            throw r0     // Catch:{ OutOfMemoryError -> 0x00e7 }
        L_0x00e7:
            r1 = move-exception
            java.lang.String r0 = "LottieUtils/getStickerAsWebPForNotification error getting png sticker "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00ed:
            r1 = 0
            goto L_0x010a
        L_0x00ef:
            java.lang.String r1 = r0.getAbsolutePath()
            java.lang.String r0 = "image/png"
            r7.A01(r4, r1, r0, r5)
            android.net.Uri$Builder r1 = X.C18530xp.A00()
            java.lang.String r0 = "item"
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri$Builder r0 = r0.appendEncodedPath(r4)
            android.net.Uri r1 = r0.build()
        L_0x010a:
            java.lang.String r0 = "image/webp"
            goto L_0x0073
        L_0x010e:
            boolean r0 = r2 instanceof X.C30791n7
            if (r0 == 0) goto L_0x0077
            r0 = r2
            X.1n7 r0 = (X.C30791n7) r0
            X.39W r0 = r0.A00
            if (r0 == 0) goto L_0x0077
            byte[] r0 = r0.A05()
            if (r0 == 0) goto L_0x0077
            long r0 = r2.A1L
            X.2eF r3 = r11.A09
            java.lang.String r2 = X.C18280x3.A0Y()
            java.lang.String r0 = java.lang.Long.toString(r0)
            java.lang.String r5 = "image/jpeg"
            java.lang.String r4 = ""
            r3.A01(r2, r0, r5, r4)
            android.net.Uri$Builder r1 = X.C18530xp.A00()
            java.lang.String r0 = "thumbnail"
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri$Builder r0 = r0.appendEncodedPath(r2)
            android.net.Uri r3 = r0.build()
            X.34x r0 = r11.A00
            long r1 = r0.A0K
            X.0Ti r0 = new X.0Ti
            r0.<init>(r7, r4, r1)
            r0.A02 = r5
            r0.A00 = r3
            r13.A08(r0)
            goto L_0x0077
        L_0x0157:
            r0 = 0
            r12.A0S = r0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56682sO.A06(X.0Ue, androidx.core.app.NotificationCompat$MessagingStyle, X.3ZH):void");
    }

    public boolean A08(Context context, C05610Ue r7, AnonymousClass3ZH r8) {
        AnonymousClass33C r1;
        File file;
        C624134x r12 = this.A00;
        if ((!(r12 instanceof C30721mu) && !(r12 instanceof AnonymousClass1n2)) || (r1 = ((C30471mV) r12).A01) == null || !r1.A0R || (file = r1.A0F) == null || !file.exists()) {
            return false;
        }
        Intent action = C627736r.A0N(context, r8).setAction("com.whatsapp.intent.action.PLAY");
        AnonymousClass5VI.A01(action, "UpdateMessageNotificationRunnable");
        C107395bF.A00(action, this.A00.A1J);
        PendingIntent A042 = C624735e.A04(context, action, 4);
        C624134x r13 = this.A00;
        boolean z = r13 instanceof AnonymousClass1n2;
        int i = R.drawable.notification_action_audio;
        if (z) {
            i = R.drawable.notification_action_image;
        }
        byte b = r13.A1I;
        int i2 = R.string.f11nameremoved;
        if (b == 1) {
            i2 = R.string.f11nameremoved;
        }
        r7.A04(i, context.getString(i2), A042);
        return true;
    }

    public C56682sO(C55682qk r1, C56972sr r2, C66663Mh r3, C64773Ex r4, AnonymousClass5ZU r5, C620633i r6, C54292oU r7, C620733j r8, C48042eF r9, AnonymousClass1VX r10, C66553Lw r11, C624134x r12, C59962xm r13) {
        this.A0A = r10;
        this.A01 = r1;
        this.A02 = r2;
        this.A07 = r7;
        this.A03 = r3;
        this.A0C = r13;
        this.A04 = r4;
        this.A06 = r6;
        this.A05 = r5;
        this.A08 = r8;
        this.A0B = r11;
        this.A09 = r9;
        this.A00 = r12;
    }

    public C04440Of A01() {
        boolean z;
        String A0R;
        C624134x A0w;
        C54292oU r0;
        int i;
        AnonymousClass3ZH A022 = A02();
        C624134x r2 = this.A00;
        if ((r2 instanceof C31891p1) && ((C30341mI) r2).A00 == 143) {
            A022 = this.A04.A0A(AnonymousClass2z0.A00(r2));
        }
        String A052 = A05();
        C95814uZ r02 = this.A00.A1J.A00;
        AnonymousClass5ZU r5 = this.A05;
        int A072 = r5.A07(A022, r02);
        C624134x r6 = this.A00;
        if (!this.A03.A08(C66663Mh.A0Q) || !(r6 instanceof C31891p1)) {
            z = r6.A1J.A02;
        } else {
            z = C56972sr.A08(this.A02, A022);
        }
        if (z) {
            return this.A0B.A0E();
        }
        C624134x r8 = this.A00;
        AnonymousClass1VX r7 = this.A0A;
        C56972sr r1 = this.A02;
        C58422vE r62 = C58422vE.A02;
        if (!r7.A0Y(r62, 4927) || !C624435a.A05(r1, r8.A18)) {
            C624134x r12 = this.A00;
            if (!r7.A0Y(r62, 5194) || !AnonymousClass2z0.A0D(r12) || (A0w = r12.A0w()) == null || !A0w.A1J.A02) {
                A0R = r5.A0R(A022, A072, false);
                C03910Ma r13 = new C03910Ma();
                r13.A01 = A0R;
                r13.A00 = IconCompat.A03(this.A0B.A0D(A022));
                r13.A03 = A052;
                return new C04440Of(r13);
            }
            r0 = this.A07;
            i = R.string.f11nameremoved;
        } else {
            r0 = this.A07;
            i = R.string.f11nameremoved;
        }
        A0R = C54292oU.A00(r0).getString(i);
        C03910Ma r132 = new C03910Ma();
        r132.A01 = A0R;
        r132.A00 = IconCompat.A03(this.A0B.A0D(A022));
        r132.A03 = A052;
        return new C04440Of(r132);
    }
}
