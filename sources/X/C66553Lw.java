package X;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.notification.AndroidWear;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.3Lw  reason: invalid class name and case insensitive filesystem */
public final class C66553Lw implements AnonymousClass485 {
    public static final HashMap A0T = AnonymousClass001.A0t();
    public static final String[] A0U = {"_id"};
    public C04440Of A00;
    public final C55682qk A01;
    public final C64393Dh A02;
    public final C56972sr A03;
    public final C625735q A04;
    public final C56942so A05;
    public final AnonymousClass5UX A06;
    public final C64773Ex A07;
    public final AnonymousClass5ZU A08;
    public final C114015mM A09;
    public final C620633i A0A;
    public final C54292oU A0B;
    public final C620733j A0C;
    public final C56982ss A0D;
    public final C66543Lv A0E;
    public final C56892sj A0F;
    public final C56362rr A0G;
    public final AnonymousClass1VX A0H;
    public final AnonymousClass3LP A0I;
    public final C106195Xz A0J;
    public final C195219Wq A0K;
    public final C60152y5 A0L;
    public final C50222hp A0M;
    public final AnonymousClass1R1 A0N;
    public final C55732qp A0O;
    public final AnonymousClass33Q A0P;
    public final WebpUtils A0Q;
    public final C55832qz A0R;
    public final HashMap A0S;

    public static C05610Ue A01(Context context) {
        C05610Ue r1 = new C05610Ue(context, (String) null);
        r1.A00 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r0.booleanValue() != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(android.content.Context r10, android.net.Uri r11, X.C05610Ue r12, X.C620633i r13, X.AnonymousClass2WH r14, X.C60312yL r15) {
        /*
            r5 = r11
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 >= r0) goto L_0x001f
            android.net.Uri r0 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x001f
            java.util.HashMap r3 = A0T
            java.lang.Object r0 = r3.get(r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0041
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0052
        L_0x001f:
            boolean r0 = r14.A00
            if (r0 != 0) goto L_0x0055
            r0 = 26
            if (r1 >= r0) goto L_0x0055
            java.io.File r2 = X.C627536m.A04(r11)
            if (r2 == 0) goto L_0x003b
            r0 = 24
            if (r1 < r0) goto L_0x003b
            android.net.Uri r5 = X.C627536m.A01(r10, r2)     // Catch:{ IllegalArgumentException -> 0x0081 }
            java.lang.String r1 = "com.android.systemui"
            r0 = 1
            r10.grantUriPermission(r1, r5, r0)     // Catch:{ IllegalArgumentException -> 0x0081 }
        L_0x003b:
            if (r5 == 0) goto L_0x0055
            r12.A07(r5)
            return
        L_0x0041:
            X.5UR r4 = r13.A0R()
            if (r4 != 0) goto L_0x0056
            java.lang.String r0 = "messagenotification/is-notification-tone cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x004d:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.put(r11, r0)
        L_0x0052:
            r15.A01(r11)
        L_0x0055:
            return
        L_0x0056:
            java.lang.String[] r6 = A0U     // Catch:{ Exception -> 0x004d }
            java.lang.String r7 = "is_notification=1"
            r8 = 0
            java.lang.String r9 = "title_key"
            android.database.Cursor r2 = r4.A03(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x004d }
            if (r2 == 0) goto L_0x004d
            int r0 = r2.getCount()     // Catch:{ all -> 0x0077 }
            if (r0 <= 0) goto L_0x0073
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0077 }
            r3.put(r11, r0)     // Catch:{ all -> 0x0077 }
            r2.close()     // Catch:{ Exception -> 0x004d }
            goto L_0x001f
        L_0x0073:
            r2.close()     // Catch:{ Exception -> 0x004d }
            goto L_0x004d
        L_0x0077:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x004d }
        L_0x0080:
            throw r1     // Catch:{ Exception -> 0x004d }
        L_0x0081:
            r1 = move-exception
            java.lang.String r0 = "notification/"
            com.whatsapp.util.Log.w(r0, r1)
            r15.A01(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66553Lw.A09(android.content.Context, android.net.Uri, X.0Ue, X.33i, X.2WH, X.2yL):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (X.C624435a.A05(r7.A03, r1) == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0P(X.C56682sO r8, boolean r9) {
        /*
            r7 = this;
            r3 = 0
            if (r8 == 0) goto L_0x002d
            X.34x r2 = r8.A00
            byte r1 = r2.A1I
            r0 = 36
            if (r1 == r0) goto L_0x002d
            r0 = 77
            if (r1 == r0) goto L_0x002d
            r0 = 90
            if (r1 == r0) goto L_0x002d
            X.3LP r1 = r7.A0I
            X.2z0 r0 = r2.A1J
            X.4uZ r0 = r0.A00
            boolean r0 = X.C57362tW.A00(r1, r0)
            if (r0 != 0) goto L_0x002d
            X.2z0 r0 = r2.A1J
            X.4uZ r4 = r0.A00
            if (r9 != 0) goto L_0x002e
            X.2ss r0 = r7.A0D
            boolean r0 = r0.A0P(r4)
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            return r3
        L_0x002e:
            X.C626936e.A06(r8)
            X.34x r6 = r8.A00
            java.util.List r1 = r6.A18
            r5 = 1
            if (r1 == 0) goto L_0x0041
            X.2sr r0 = r7.A03
            boolean r0 = X.C624435a.A05(r0, r1)
            r2 = 1
            if (r0 != 0) goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            X.34x r0 = r6.A0w()
            if (r0 == 0) goto L_0x00b5
            X.4uZ r0 = r0.A0n()
            if (r0 != 0) goto L_0x00b5
        L_0x004e:
            X.2z0 r1 = r6.A1J
            X.4uZ r0 = r1.A00
            boolean r0 = X.C627336j.A0K(r0)
            if (r0 == 0) goto L_0x00b3
            if (r5 != 0) goto L_0x005c
            if (r2 == 0) goto L_0x00b3
        L_0x005c:
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x00b3
            X.1R1 r1 = r7.A0N
            X.4uZ r0 = r6.A0n()
            X.C626936e.A06(r0)
            X.2sa r0 = X.AnonymousClass1R1.A00(r0, r1)
            boolean r2 = r0.A09()
        L_0x0071:
            if (r4 == 0) goto L_0x007c
            X.2ss r0 = r7.A0D
            boolean r0 = r0.A0M(r4)
            if (r0 == 0) goto L_0x007c
        L_0x007b:
            return r2
        L_0x007c:
            boolean r0 = r4 instanceof X.C95804uY
            r1 = 1
            if (r0 == 0) goto L_0x00a3
            X.2ss r0 = r7.A0D
            X.31A r2 = r0.A0A(r4, r3)
            X.1RL r2 = (X.AnonymousClass1RL) r2
            if (r2 == 0) goto L_0x002d
            X.21q r1 = r2.A07
            X.21q r0 = X.C372821q.GUEST
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            if (r0 != 0) goto L_0x002d
            boolean r0 = r2.A0L
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = r2.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002d
            r3 = 1
            return r3
        L_0x00a3:
            X.1R1 r0 = r7.A0N
            X.C626936e.A06(r4)
            X.2sa r0 = X.AnonymousClass1R1.A00(r4, r0)
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x007b
            return r1
        L_0x00b3:
            r2 = 0
            goto L_0x0071
        L_0x00b5:
            r5 = 0
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66553Lw.A0P(X.2sO, boolean):boolean");
    }

    public static Integer A04(String str) {
        int i;
        if (str == null) {
            return null;
        }
        try {
            i = Integer.parseInt(str, 16);
        } catch (NumberFormatException unused) {
            i = 16777215;
        }
        int i2 = i | -16777216;
        if (i2 != -16777216) {
            return Integer.valueOf(i2);
        }
        return null;
    }

    public static String A05(Context context, C620733j r7, AnonymousClass1VX r8, C30821nD r9) {
        if (r8.A0Y(C58422vE.A02, 4893)) {
            return context.getString(R.string.f11nameremoved);
        }
        int i = r9.A00;
        long j = (long) i;
        Object[] objArr = new Object[1];
        boolean A1Y = C18300x5.A1Y(objArr, i);
        String A0L2 = r7.A0L(objArr, R.plurals.f9nameremoved, j);
        if (TextUtils.isEmpty(r9.A06)) {
            return A0L2;
        }
        return AnonymousClass002.A0F(context, r9.A06, C18310x6.A1b(A0L2, A1Y ? 1 : 0), 1, R.string.f11nameremoved);
    }

    public static String A06(Context context, C624134x r4, C50222hp r5) {
        C30471mV r42;
        if (r4 instanceof AnonymousClass4DV) {
            AnonymousClass315 A012 = r5.A01((AnonymousClass4DV) r4);
            if (A012 != null) {
                return A012.A0B(context);
            }
            return null;
        } else if ((r4 instanceof AnonymousClass1n3) || (r4 instanceof C31991pD) || (r4 instanceof AnonymousClass4FG)) {
            return null;
        } else {
            if (r4 instanceof C30771mz) {
                C30771mz r43 = (C30771mz) r4;
                String str = r43.A09;
                String str2 = r43.A02;
                if (!TextUtils.isEmpty(str2)) {
                    str = C18260x0.A06(str, " ", str2);
                }
                String str3 = r43.A05;
                if (!TextUtils.isEmpty(str3)) {
                    return C18260x0.A06(str, " ", str3);
                }
                return str;
            } else if (r4 instanceof C30821nD) {
                return null;
            } else {
                if (r4 instanceof AnonymousClass1n2) {
                    C30471mV r1 = (C30471mV) r4;
                    boolean A042 = AnonymousClass353.A04(r4);
                    r42 = r4;
                    if (!A042) {
                        return r1.A1w();
                    }
                } else if (r4 instanceof C30721mu) {
                    return null;
                } else {
                    if (r4 instanceof C31961pA) {
                        return ((C30471mV) r4).A1w();
                    }
                    if (r4 instanceof C31971pB) {
                        C30471mV r44 = (C30471mV) r4;
                        boolean A043 = AnonymousClass353.A04(r44);
                        r42 = r44;
                        if (!A043) {
                            return r44.A1w();
                        }
                    } else {
                        if (r4 instanceof AnonymousClass1nF) {
                            if (AnonymousClass31H.A02(r4)) {
                                return null;
                            }
                        } else if ((r4 instanceof AnonymousClass1nE) || (r4 instanceof C30391mN) || (r4 instanceof C30381mM) || (r4 instanceof C30411mP) || (r4 instanceof C30421mQ)) {
                            return null;
                        } else {
                            if (!(r4 instanceof AnonymousClass1n9)) {
                                if (r4 instanceof C30801n8) {
                                    return ((C30801n8) r4).A03;
                                }
                                return null;
                            }
                        }
                        return AnonymousClass353.A00(r4);
                    }
                }
                return AnonymousClass353.A00(r42);
            }
        }
    }

    public static void A0A(Context context, C05610Ue r4, AnonymousClass3ZH r5, int i) {
        Intent A1M = new C627736r().A1M(context, r5, Integer.valueOf(i));
        A1M.addFlags(335544320);
        A1M.putExtra("should_show_block_report_dialog", true);
        r4.A04(R.drawable.ic_spam_block, context.getString(R.string.f11nameremoved), C624735e.A04(context, A1M, 0));
    }

    public static long[] A0B(String str) {
        int i;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    i = 0;
                    break;
                } else {
                    return null;
                }
            case 50:
                if (str.equals("2")) {
                    i = 1;
                    break;
                } else {
                    return null;
                }
            case 51:
                if (str.equals("3")) {
                    i = 2;
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        long[] jArr = {0, 750, 250, 750, 250};
        if (2 - i != 0) {
            // fill-array-data instruction
            jArr[0] = 0;
            jArr[1] = 300;
            jArr[2] = 200;
            jArr[3] = 300;
            jArr[4] = 200;
            return jArr;
        }
        return jArr;
    }

    public int A0C(int i, int i2) {
        Point point = new Point();
        this.A0A.A0O().getDefaultDisplay().getSize(point);
        int i3 = point.x;
        int i4 = point.y / 3;
        int i5 = 1;
        if (i != 0 && i2 != 0) {
            while (true) {
                if (i2 <= i4 && i <= i3) {
                    break;
                }
                i5 *= 2;
                i2 = (i2 + 1) / 2;
                i = (i + 1) / 2;
            }
        }
        return i5;
    }

    public Bitmap A0D(AnonymousClass3ZH r9) {
        float f;
        C27991fJ A012;
        AnonymousClass3ZH A072;
        Context context = this.A0B.A00;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(17104901);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(17104902);
        C95814uZ r2 = r9.A0H;
        boolean z = false;
        if (r2 instanceof GroupJid) {
            z = C18310x6.A1W(this.A0D.A06((GroupJid) r2));
        }
        boolean A0N2 = this.A0D.A0N(r2);
        if (!(!A0N2 || (A012 = this.A05.A01((C27991fJ) r2)) == null || (A072 = this.A07.A07(A012)) == null)) {
            r9 = A072;
        }
        Bitmap A032 = this.A09.A03(context, r9, dimensionPixelSize, dimensionPixelSize2);
        if (A032 != null) {
            return A032;
        }
        AnonymousClass5UX r22 = this.A06;
        int min = Math.min(dimensionPixelSize, dimensionPixelSize2);
        if (A0N2 || z) {
            f = -2.14748365E9f;
        } else {
            f = C18310x6.A01(context);
        }
        return r22.A04(r9, f, min);
    }

    public C04440Of A0E() {
        C04440Of r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C03910Ma r2 = new C03910Ma();
        r2.A01 = this.A0B.A00.getString(R.string.f11nameremoved);
        AnonymousClass1RR A012 = C56972sr.A01(this.A03);
        C626936e.A06(A012);
        r2.A00 = IconCompat.A03(A0D(A012));
        C04440Of r02 = new C04440Of(r2);
        this.A00 = r02;
        return r02;
    }

    public CharSequence A0F(Context context, C624134x r6) {
        CharSequence A022;
        boolean z;
        byte b = r6.A1I;
        if (b == 0 || b == 7 || (r6 instanceof C31901p2) || ((r6 instanceof AnonymousClass1nE) && r6.A0P != null)) {
            C624034w r0 = r6.A0P;
            if (r0 != null) {
                if (r0.A03 != 5) {
                    A022 = this.A0K.A0e(r6, true);
                } else {
                    A022 = this.A0B.A00.getString(R.string.f11nameremoved);
                }
            } else if (AnonymousClass353.A04(r6)) {
                String A002 = AnonymousClass353.A00(r6);
                if (TextUtils.isEmpty(A002)) {
                    A002 = "";
                }
                if (!C624134x.A0a(r6)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(r6.A13());
                    A002 = AnonymousClass000.A0V("\n", A002, A0o);
                }
                A022 = A0I(A002);
            } else {
                A022 = this.A0J.A02(context, r6, A0I(r6.A13()));
            }
            CharSequence A032 = C107575bX.A03(A022);
            if ((!TextUtils.isEmpty(A032) || !(r6 instanceof C30341mI)) && ((!((z = r6 instanceof C31891p1)) || ((C30341mI) r6).A00 != 143) && !C627636p.A0n(r6) && (!z || ((C30341mI) r6).A00 != 149))) {
                return A032;
            }
            return this.A04.A0O((C30341mI) r6, false);
        }
        CharSequence A0H2 = A0H(r6);
        if (b == 27) {
            A0H2 = C107635bd.A07(this.A0A, this.A0L, A0H2);
        }
        return this.A0J.A02(context, r6, A0H2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
        if (r2 != null) goto L_0x00dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence A0G(X.AnonymousClass3ZH r14, X.C624134x r15, boolean r16, boolean r17, boolean r18) {
        /*
            r13 = this;
            X.2z0 r9 = r15.A1J
            X.4uZ r8 = r9.A00
            X.5ZU r7 = r13.A08
            int r6 = r7.A07(r14, r8)
            byte r5 = r15.A1I
            java.lang.String r10 = " @ "
            java.lang.String r4 = " "
            r3 = 2
            java.lang.String r2 = ": "
            r12 = 1
            r1 = 0
            if (r5 == 0) goto L_0x012b
            r0 = 7
            if (r5 == r0) goto L_0x012b
            java.lang.CharSequence r0 = r13.A0H(r15)
            r11 = 12
            boolean r11 = X.AnonymousClass000.A1U(r5, r11)
            boolean r5 = r14.A0U()
            if (r5 == 0) goto L_0x00c3
            if (r16 == 0) goto L_0x005d
            boolean r3 = r9.A02
            if (r3 != 0) goto L_0x0111
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = X.C624134x.A0B(r8, r13, r15)
            r4.append(r3)
            r4.append(r10)
            java.lang.String r1 = r7.A0R(r14, r6, r1)
            r4.append(r1)
            r4.append(r2)
            if (r11 == 0) goto L_0x004e
            java.lang.CharSequence r0 = A03(r0)
        L_0x004e:
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r4)
        L_0x0052:
            X.5Xz r2 = r13.A0J
            X.2oU r1 = r13.A0B
            android.content.Context r1 = r1.A00
            java.lang.CharSequence r0 = r2.A02(r1, r15, r0)
            return r0
        L_0x005d:
            if (r17 == 0) goto L_0x0090
            boolean r2 = r9.A02
            if (r2 != 0) goto L_0x00a9
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r3]
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = X.C624134x.A0B(r8, r13, r15)
            java.lang.String r2 = X.AnonymousClass000.A0V(r2, r4, r3)
            java.lang.String r2 = X.C106815aD.A02(r2)
            if (r18 == 0) goto L_0x007d
            if (r2 == 0) goto L_0x007d
            java.lang.CharSequence r2 = A02(r2)
        L_0x007d:
            r5[r1] = r2
            java.lang.String r0 = X.C106815aD.A02(r0)
        L_0x0083:
            if (r11 == 0) goto L_0x0089
            java.lang.CharSequence r0 = A03(r0)
        L_0x0089:
            r5[r12] = r0
            java.lang.CharSequence r0 = android.text.TextUtils.concat(r5)
            goto L_0x0052
        L_0x0090:
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r3]
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = X.C624134x.A0B(r8, r13, r15)
            java.lang.String r2 = X.AnonymousClass000.A0V(r3, r2, r4)
            if (r18 == 0) goto L_0x00a6
            if (r2 == 0) goto L_0x00a6
            java.lang.CharSequence r2 = A02(r2)
        L_0x00a6:
            r5[r1] = r2
            goto L_0x0083
        L_0x00a9:
            java.lang.CharSequence[] r8 = new java.lang.CharSequence[r3]
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            X.2oU r2 = r13.A0B
            android.content.Context r3 = r2.A00
            r2 = 2131895597(0x7f12252d, float:1.9426032E38)
            java.lang.String r2 = r3.getString(r2)
            java.lang.String r2 = X.AnonymousClass000.A0V(r2, r4, r5)
            if (r18 == 0) goto L_0x00e1
            if (r2 == 0) goto L_0x00e1
            goto L_0x00dd
        L_0x00c3:
            if (r16 != 0) goto L_0x0111
            if (r17 == 0) goto L_0x0109
            boolean r2 = r9.A02
            java.lang.CharSequence[] r8 = new java.lang.CharSequence[r3]
            if (r2 != 0) goto L_0x00f5
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = r7.A0R(r14, r6, r1)
            java.lang.String r2 = X.AnonymousClass000.A0V(r2, r4, r3)
            java.lang.String r2 = X.C106815aD.A02(r2)
        L_0x00dd:
            java.lang.CharSequence r2 = A02(r2)
        L_0x00e1:
            r8[r1] = r2
            java.lang.String r0 = X.C106815aD.A02(r0)
            if (r11 == 0) goto L_0x00ed
            java.lang.CharSequence r0 = A03(r0)
        L_0x00ed:
            r8[r12] = r0
            java.lang.CharSequence r0 = android.text.TextUtils.concat(r8)
            goto L_0x0052
        L_0x00f5:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            X.2oU r2 = r13.A0B
            android.content.Context r3 = r2.A00
            r2 = 2131895597(0x7f12252d, float:1.9426032E38)
            java.lang.String r2 = r3.getString(r2)
            java.lang.String r2 = X.AnonymousClass000.A0V(r2, r4, r5)
            goto L_0x00dd
        L_0x0109:
            if (r11 == 0) goto L_0x0052
            java.lang.CharSequence r0 = A03(r0)
            goto L_0x0052
        L_0x0111:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = r7.A0R(r14, r6, r1)
            r3.append(r1)
            r3.append(r2)
            if (r11 == 0) goto L_0x0125
            java.lang.CharSequence r0 = A03(r0)
        L_0x0125:
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r3)
            goto L_0x0052
        L_0x012b:
            boolean r0 = r15 instanceof X.C30341mI
            if (r0 == 0) goto L_0x0159
            if (r16 == 0) goto L_0x014e
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r7.A0R(r14, r6, r1)
            r3.append(r0)
            r3.append(r2)
            X.35q r2 = r13.A04
            r0 = r15
            X.1mI r0 = (X.C30341mI) r0
            java.lang.String r0 = r2.A0O(r0, r1)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r3)
            goto L_0x0052
        L_0x014e:
            X.35q r2 = r13.A04
            r0 = r15
            X.1mI r0 = (X.C30341mI) r0
            java.lang.String r0 = r2.A0O(r0, r1)
            goto L_0x0052
        L_0x0159:
            X.34w r0 = r15.A0P
            if (r0 != 0) goto L_0x018c
            java.lang.String r0 = r15.A13()
            java.lang.CharSequence r0 = r13.A0I(r0)
        L_0x0165:
            boolean r5 = r14.A0U()
            if (r5 == 0) goto L_0x01f2
            if (r16 == 0) goto L_0x01a4
            boolean r3 = r9.A02
            if (r3 != 0) goto L_0x0245
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = X.C624134x.A0B(r8, r13, r15)
            r4.append(r3)
            r4.append(r10)
            java.lang.String r1 = r7.A0R(r14, r6, r1)
            r4.append(r1)
            java.lang.String r0 = X.AnonymousClass000.A0P(r0, r2, r4)
            goto L_0x0052
        L_0x018c:
            int r5 = r0.A03
            r0 = 5
            if (r5 == r0) goto L_0x0198
            X.9Wq r0 = r13.A0K
            java.lang.String r0 = r0.A0e(r15, r1)
            goto L_0x0165
        L_0x0198:
            X.2oU r0 = r13.A0B
            android.content.Context r5 = r0.A00
            r0 = 2131891284(0x7f121454, float:1.9417284E38)
            java.lang.String r0 = r5.getString(r0)
            goto L_0x0165
        L_0x01a4:
            boolean r5 = r9.A02
            if (r17 == 0) goto L_0x01bd
            if (r5 != 0) goto L_0x021e
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r3]
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = X.C624134x.A0B(r8, r13, r15)
            java.lang.String r2 = X.AnonymousClass000.A0V(r2, r4, r3)
            java.lang.String r2 = X.C106815aD.A02(r2)
            goto L_0x020c
        L_0x01bd:
            if (r5 != 0) goto L_0x01ce
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r3]
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = X.C624134x.A0B(r8, r13, r15)
            java.lang.String r2 = X.AnonymousClass000.A0V(r3, r2, r4)
            goto L_0x020c
        L_0x01ce:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "messagePreview/missing_rmt_src:"
            r3.append(r1)
            java.lang.String r1 = X.C627636p.A0E(r15)
            X.C18260x0.A1K(r3, r1)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            X.2oU r1 = r13.A0B
            android.content.Context r3 = r1.A00
            r1 = 2131888111(0x7f1207ef, float:1.9410848E38)
            X.AnonymousClass0x2.A0s(r3, r4, r1)
            java.lang.String r0 = X.AnonymousClass000.A0P(r0, r2, r4)
            goto L_0x0052
        L_0x01f2:
            if (r16 != 0) goto L_0x0245
            if (r17 == 0) goto L_0x0052
            boolean r2 = r9.A02
            if (r2 != 0) goto L_0x021e
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r3]
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = r7.A0R(r14, r6, r1)
            java.lang.String r2 = X.C106815aD.A02(r2)
            java.lang.String r2 = X.AnonymousClass000.A0V(r2, r4, r3)
        L_0x020c:
            if (r18 == 0) goto L_0x0214
            if (r2 == 0) goto L_0x0214
            java.lang.CharSequence r2 = A02(r2)
        L_0x0214:
            r5[r1] = r2
            r5[r12] = r0
            java.lang.CharSequence r0 = android.text.TextUtils.concat(r5)
            goto L_0x0052
        L_0x021e:
            java.lang.CharSequence[] r6 = new java.lang.CharSequence[r3]
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            X.2oU r2 = r13.A0B
            android.content.Context r3 = r2.A00
            r2 = 2131895597(0x7f12252d, float:1.9426032E38)
            java.lang.String r2 = r3.getString(r2)
            java.lang.String r2 = X.AnonymousClass000.A0V(r2, r4, r5)
            if (r18 == 0) goto L_0x023b
            if (r2 == 0) goto L_0x023b
            java.lang.CharSequence r2 = A02(r2)
        L_0x023b:
            r6[r1] = r2
            r6[r12] = r0
            java.lang.CharSequence r0 = android.text.TextUtils.concat(r6)
            goto L_0x0052
        L_0x0245:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = r7.A0R(r14, r6, r1)
            r3.append(r1)
            java.lang.String r0 = X.AnonymousClass000.A0P(r0, r2, r3)
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66553Lw.A0G(X.3ZH, X.34x, boolean, boolean, boolean):java.lang.CharSequence");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02eb, code lost:
        if (r6 == null) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ad, code lost:
        if (r8 == 1) goto L_0x01af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence A0H(X.C624134x r22) {
        /*
            r21 = this;
            r5 = r22
            r3 = r21
            X.2oU r2 = r3.A0B
            android.content.Context r12 = r2.A00
            X.2hp r0 = r3.A0M
            java.lang.String r6 = A06(r12, r5, r0)
            boolean r0 = r5 instanceof X.AnonymousClass1n3
            java.lang.String r7 = "①"
            if (r0 == 0) goto L_0x0029
            r0 = 2131895099(0x7f12233b, float:1.9425021E38)
        L_0x0018:
            java.lang.String r0 = r12.getString(r0)
            java.lang.String r6 = A08(r6, r7, r0)
        L_0x0020:
            java.lang.CharSequence r0 = r3.A0I(r6)
            java.lang.CharSequence r0 = X.C107575bX.A03(r0)
            return r0
        L_0x0029:
            boolean r0 = r5 instanceof X.C31991pD
            if (r0 == 0) goto L_0x0031
            r0 = 2131895118(0x7f12234e, float:1.942506E38)
            goto L_0x0018
        L_0x0031:
            boolean r0 = r5 instanceof X.C31931p6
            if (r0 == 0) goto L_0x0039
            r0 = 2131888313(0x7f1208b9, float:1.9411258E38)
            goto L_0x0018
        L_0x0039:
            boolean r0 = r5 instanceof X.C30711mt
            if (r0 == 0) goto L_0x0041
            r0 = 2131895076(0x7f122324, float:1.9424975E38)
            goto L_0x0018
        L_0x0041:
            boolean r0 = r5 instanceof X.AnonymousClass4FG
            if (r0 == 0) goto L_0x004e
            X.4FG r5 = (X.AnonymousClass4FG) r5
            X.33j r0 = r3.A0C
            java.lang.String r6 = r5.BA2(r0)
            goto L_0x0020
        L_0x004e:
            boolean r0 = r5 instanceof X.C30771mz
            java.lang.String r7 = "🛒"
            if (r0 == 0) goto L_0x0059
            r0 = 2131888310(0x7f1208b6, float:1.9411252E38)
            goto L_0x0018
        L_0x0059:
            boolean r0 = r5 instanceof X.C30821nD
            if (r0 == 0) goto L_0x0073
            X.1VX r1 = r3.A0H
            X.1nD r5 = (X.C30821nD) r5
            X.33j r0 = r3.A0C
            java.lang.String r1 = A05(r12, r0, r1, r5)
            r0 = 2131888297(0x7f1208a9, float:1.9411225E38)
            java.lang.String r0 = r12.getString(r0)
            java.lang.String r6 = A08(r1, r7, r0)
            goto L_0x0020
        L_0x0073:
            boolean r0 = r5 instanceof X.AnonymousClass1n2
            if (r0 == 0) goto L_0x0086
            r0 = 2131888305(0x7f1208b1, float:1.9411242E38)
            java.lang.String r1 = r12.getString(r0)
            java.lang.String r0 = "📷"
            java.lang.String r6 = A08(r6, r0, r1)
            goto L_0x0020
        L_0x0086:
            boolean r0 = r5 instanceof X.C30721mu
            java.lang.String r7 = ")"
            java.lang.String r8 = " ("
            r4 = 1
            if (r0 == 0) goto L_0x00c4
            X.1mV r5 = (X.C30471mV) r5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            int r0 = r5.A09
            if (r0 != r4) goto L_0x00c0
            java.lang.String r0 = "🎤"
        L_0x009c:
            X.AnonymousClass0x2.A1N(r1, r0)
            r0 = 2131895076(0x7f122324, float:1.9424975E38)
            X.AnonymousClass0x2.A0s(r12, r1, r0)
            java.lang.String r6 = r1.toString()
        L_0x00a9:
            int r0 = r5.A0B
            if (r0 == 0) goto L_0x0020
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0m(r6, r8)
            X.33j r2 = r3.A0C
            int r0 = r5.A0B
            long r0 = (long) r0
            java.lang.String r0 = X.C107565bW.A0A(r2, r0)
            java.lang.String r6 = X.AnonymousClass000.A0V(r0, r7, r4)
            goto L_0x0020
        L_0x00c0:
            java.lang.String r0 = "🎵"
            goto L_0x009c
        L_0x00c4:
            boolean r0 = r5 instanceof X.C31961pA
            if (r0 == 0) goto L_0x00d8
            r0 = 2131888301(0x7f1208ad, float:1.9411233E38)
            java.lang.String r1 = r12.getString(r0)
            java.lang.String r0 = "👾"
            java.lang.String r6 = A08(r6, r0, r1)
            goto L_0x0020
        L_0x00d8:
            boolean r0 = r5 instanceof X.C31971pB
            java.lang.String r10 = "🎥"
            if (r0 == 0) goto L_0x00ed
            X.1mV r5 = (X.C30471mV) r5
            r0 = 2131888315(0x7f1208bb, float:1.9411262E38)
            java.lang.String r0 = r12.getString(r0)
            java.lang.String r6 = A08(r6, r10, r0)
            goto L_0x00a9
        L_0x00ed:
            boolean r0 = r5 instanceof X.C31951p9
            java.lang.String r1 = ""
            r9 = 0
            if (r0 == 0) goto L_0x011b
            X.1mV r5 = (X.C30471mV) r5
            r6 = 2131888311(0x7f1208b7, float:1.9411254E38)
            java.lang.Object[] r11 = new java.lang.Object[r4]
            int r0 = r5.A0B
            if (r0 <= 0) goto L_0x0110
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r8)
            X.33j r2 = r3.A0C
            int r0 = r5.A0B
            long r0 = (long) r0
            java.lang.String r0 = X.C107565bW.A0A(r2, r0)
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r7, r4)
        L_0x0110:
            java.lang.String r1 = X.AnonymousClass002.A0F(r12, r1, r11, r9, r6)
            r0 = 0
            java.lang.String r6 = A08(r0, r10, r1)
            goto L_0x0020
        L_0x011b:
            boolean r0 = r5 instanceof X.AnonymousClass1nF
            r10 = 128(0x80, float:1.794E-43)
            java.lang.String r11 = "👤 "
            if (r0 == 0) goto L_0x0144
            X.1nF r5 = (X.AnonymousClass1nF) r5
            boolean r0 = X.AnonymousClass31H.A02(r5)
            if (r0 == 0) goto L_0x01bb
            java.lang.String r2 = r5.A1x()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x01a7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = X.C107575bX.A0C(r2, r10)
        L_0x013e:
            java.lang.String r6 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x0020
        L_0x0144:
            boolean r0 = r5 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x015e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "💟 "
            r1.append(r0)
            r0 = 2131888312(0x7f1208b8, float:1.9411256E38)
            X.AnonymousClass0x2.A0s(r12, r1, r0)
            java.lang.String r6 = r1.toString()
            goto L_0x0020
        L_0x015e:
            boolean r0 = r5 instanceof X.C30391mN
            if (r0 == 0) goto L_0x0178
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "👥 "
            r1.append(r0)
            r0 = 2131888302(0x7f1208ae, float:1.9411235E38)
            X.AnonymousClass0x2.A0s(r12, r1, r0)
            java.lang.String r6 = r1.toString()
            goto L_0x0020
        L_0x0178:
            boolean r0 = r5 instanceof X.C30411mP
            if (r0 == 0) goto L_0x018e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            X.33j r0 = r3.A0C
            X.1mP r5 = (X.C30411mP) r5
            java.lang.String r0 = X.C33061sN.A01(r0, r5)
            java.lang.String r6 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x0020
        L_0x018e:
            boolean r0 = r5 instanceof X.C30421mQ
            if (r0 == 0) goto L_0x0218
            X.1mQ r5 = (X.C30421mQ) r5
            java.lang.String r0 = r5.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01af
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = r5.A00
            java.lang.String r0 = X.C107575bX.A0C(r0, r10)
            goto L_0x013e
        L_0x01a7:
            X.33C r0 = r5.A01
            if (r0 == 0) goto L_0x01fe
            int r8 = r0.A01
            if (r8 != r4) goto L_0x01ff
        L_0x01af:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            r0 = 2131888298(0x7f1208aa, float:1.9411227E38)
            java.lang.String r0 = r12.getString(r0)
            goto L_0x013e
        L_0x01bb:
            java.lang.String r0 = r5.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "📄"
            if (r0 != 0) goto L_0x01d5
            java.lang.String r1 = r5.A01
            r0 = 2131888300(0x7f1208ac, float:1.9411231E38)
            java.lang.String r0 = r12.getString(r0)
            java.lang.String r6 = A08(r1, r2, r0)
            goto L_0x0020
        L_0x01d5:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x01df
            java.lang.String r6 = r5.A1x()
        L_0x01df:
            r0 = 2131888300(0x7f1208ac, float:1.9411231E38)
            java.lang.String r0 = r12.getString(r0)
            java.lang.String r6 = A08(r6, r2, r0)
            int r0 = r5.A00
            if (r0 == 0) goto L_0x0020
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r6, r8)
            X.33j r0 = r3.A0C
            java.lang.String r0 = X.C107105ah.A01(r0, r5)
            java.lang.String r6 = X.AnonymousClass000.A0V(r0, r7, r1)
            goto L_0x0020
        L_0x01fe:
            r8 = 0
        L_0x01ff:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0l(r11)
            X.33j r6 = r3.A0C
            r5 = 2131755207(0x7f1000c7, float:1.9141287E38)
            long r1 = (long) r8
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.AnonymousClass000.A1P(r0, r8, r9)
            java.lang.String r0 = r6.A0L(r0, r5, r1)
            java.lang.String r6 = X.AnonymousClass000.A0X(r0, r7)
            goto L_0x0020
        L_0x0218:
            boolean r0 = r5 instanceof X.AnonymousClass1n9
            java.lang.String r7 = "📌"
            if (r0 == 0) goto L_0x022e
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0229
            X.1n9 r5 = (X.AnonymousClass1n9) r5
            java.lang.String r6 = r5.A01
        L_0x0229:
            r0 = 2131888307(0x7f1208b3, float:1.9411246E38)
            goto L_0x0018
        L_0x022e:
            boolean r0 = r5 instanceof X.C30801n8
            if (r0 == 0) goto L_0x0237
            r0 = 2131888306(0x7f1208b2, float:1.9411244E38)
            goto L_0x0018
        L_0x0237:
            boolean r0 = r5 instanceof X.C30691mr
            if (r0 == 0) goto L_0x025b
            X.1mr r5 = (X.C30691mr) r5
            int r1 = r5.A1y()
            if (r1 == 0) goto L_0x0257
            r2 = 2131888316(0x7f1208bc, float:1.9411264E38)
            if (r1 == r4) goto L_0x0251
            r0 = 2
            r2 = 2131888304(0x7f1208b0, float:1.941124E38)
            if (r1 == r0) goto L_0x0251
            r2 = 2131888303(0x7f1208af, float:1.9411238E38)
        L_0x0251:
            java.lang.String r6 = r12.getString(r2)
            goto L_0x0020
        L_0x0257:
            r2 = 2131888318(0x7f1208be, float:1.9411268E38)
            goto L_0x0251
        L_0x025b:
            boolean r0 = X.C626635z.A09(r5)
            r7 = 5
            if (r0 == 0) goto L_0x0271
            X.34w r0 = r5.A0P
            if (r0 == 0) goto L_0x02c8
            int r0 = r0.A03
            r2 = 2131891284(0x7f121454, float:1.9417284E38)
            if (r0 == r7) goto L_0x0251
            r2 = 2131891688(0x7f1215e8, float:1.9418103E38)
            goto L_0x0251
        L_0x0271:
            boolean r0 = r5 instanceof X.C30351mJ
            if (r0 == 0) goto L_0x0286
            X.34w r0 = r5.A0P
            if (r0 == 0) goto L_0x02d1
            int r0 = r0.A03
            if (r0 == r7) goto L_0x02d1
            r0 = 2131891688(0x7f1215e8, float:1.9418103E38)
            java.lang.String r6 = r12.getString(r0)
            goto L_0x0020
        L_0x0286:
            boolean r0 = r5 instanceof X.C30441mS
            if (r0 == 0) goto L_0x02a6
            X.2z0 r2 = r5.A1J
            X.4uZ r0 = r2.A00
            boolean r1 = r0 instanceof X.C95804uY
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x029d
            r2 = 2131893220(0x7f121be4, float:1.942121E38)
            if (r1 == 0) goto L_0x0251
            r2 = 2131893221(0x7f121be5, float:1.9421212E38)
            goto L_0x0251
        L_0x029d:
            r2 = 2131893218(0x7f121be2, float:1.9421206E38)
            if (r1 == 0) goto L_0x0251
            r2 = 2131893219(0x7f121be3, float:1.9421208E38)
            goto L_0x0251
        L_0x02a6:
            boolean r0 = r5 instanceof X.C30831nH
            if (r0 == 0) goto L_0x02b7
            X.2z0 r0 = r5.A1J
            boolean r0 = r0.A02
            r2 = 2131891766(0x7f121636, float:1.9418261E38)
            if (r0 == 0) goto L_0x0251
            r2 = 2131891798(0x7f121656, float:1.9418326E38)
            goto L_0x0251
        L_0x02b7:
            boolean r0 = r5 instanceof X.AnonymousClass1nG
            if (r0 == 0) goto L_0x02da
            X.2z0 r0 = r5.A1J
            boolean r0 = r0.A02
            r2 = 2131891796(0x7f121654, float:1.9418322E38)
            if (r0 == 0) goto L_0x0251
            r2 = 2131891797(0x7f121655, float:1.9418324E38)
            goto L_0x0251
        L_0x02c8:
            r0 = 2131888299(0x7f1208ab, float:1.941123E38)
            java.lang.String r6 = r12.getString(r0)
            goto L_0x0020
        L_0x02d1:
            r0 = 2131891283(0x7f121453, float:1.9417282E38)
            java.lang.String r6 = r12.getString(r0)
            goto L_0x0020
        L_0x02da:
            boolean r0 = r5 instanceof X.C30431mR
            if (r0 == 0) goto L_0x02e7
            r0 = 2131892096(0x7f121780, float:1.941893E38)
            java.lang.String r6 = r12.getString(r0)
            goto L_0x0020
        L_0x02e7:
            boolean r0 = r5 instanceof X.C30791n7
            if (r0 == 0) goto L_0x02ee
            if (r6 != 0) goto L_0x0020
        L_0x02ed:
            return r1
        L_0x02ee:
            boolean r0 = r5 instanceof X.C30451mT
            if (r0 == 0) goto L_0x02ff
            X.1mT r5 = (X.C30451mT) r5
            java.lang.String r1 = r5.A03
            java.lang.String r0 = "📊"
            java.lang.String r6 = A08(r6, r0, r1)
            goto L_0x0020
        L_0x02ff:
            boolean r0 = r5 instanceof X.C30461mU
            if (r0 == 0) goto L_0x0310
            X.1mU r5 = (X.C30461mU) r5
            java.lang.String r1 = r5.A04
            java.lang.String r0 = "🗓"
            java.lang.String r6 = A08(r6, r0, r1)
            goto L_0x0020
        L_0x0310:
            boolean r0 = r5 instanceof X.C30261mA
            if (r0 == 0) goto L_0x0321
            r1 = 2131892639(0x7f12199f, float:1.9420032E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r2)
            java.lang.String r6 = r0.getString(r1)
            goto L_0x0020
        L_0x0321:
            boolean r0 = r5 instanceof X.C30371mL
            if (r0 == 0) goto L_0x0332
            r1 = 2131892654(0x7f1219ae, float:1.9420062E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r2)
            java.lang.String r6 = r0.getString(r1)
            goto L_0x0020
        L_0x0332:
            boolean r0 = r5 instanceof X.C30491mX
            if (r0 == 0) goto L_0x0357
            X.3Ex r13 = r3.A07
            X.5ZU r14 = r3.A08
            X.33j r15 = r3.A0C
            X.2z0 r2 = r5.A1J
            boolean r4 = r2.A02
            r0 = r5
            X.1mX r0 = (X.C30491mX) r0
            long r0 = r0.A01
            X.4uZ r2 = r2.A00
            com.whatsapp.jid.UserJid r17 = r5.A0o()
            r18 = r0
            r20 = r4
            r16 = r2
            java.lang.String r6 = X.AnonymousClass36T.A02(r12, r13, r14, r15, r16, r17, r18, r20)
            goto L_0x0020
        L_0x0357:
            boolean r0 = r5 instanceof X.C31921p4
            if (r0 == 0) goto L_0x0366
            java.lang.String r6 = r5.A0y
            if (r6 == 0) goto L_0x02ed
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0020
            return r1
        L_0x0366:
            boolean r0 = r5 instanceof X.C30381mM
            if (r0 == 0) goto L_0x0380
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "📡 "
            r1.append(r0)
            r0 = 2131890982(0x7f121326, float:1.9416671E38)
            X.AnonymousClass0x2.A0s(r12, r1, r0)
            java.lang.String r6 = r1.toString()
            goto L_0x0020
        L_0x0380:
            r0 = 2131888314(0x7f1208ba, float:1.941126E38)
            java.lang.String r6 = r12.getString(r0)
            X.2qk r2 = r3.A01
            byte r0 = r5.A1I
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.String r0 = "fmessage-notification-message-type-not-supported"
            r2.A0A(r0, r4, r1)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66553Lw.A0H(X.34x):java.lang.CharSequence");
    }

    public final CharSequence A0I(String str) {
        if (str == null) {
            return "";
        }
        C620633i r6 = this.A0A;
        C60152y5 r5 = this.A0L;
        if (((long) str.length()) > 1024) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(str.subSequence(0, 1020));
            str = AnonymousClass000.A0X("…", A0o);
        }
        return C107635bd.A07(r6, r5, C106815aD.A02(str));
    }

    public String A0J(AnonymousClass3ZH r6, C624134x r7) {
        C95814uZ A0n;
        AnonymousClass5ZU r4 = this.A08;
        C95814uZ r1 = r7.A1J.A00;
        int A072 = r4.A07(r6, r1);
        if (!r6.A0U() || (r7 instanceof C30341mI) || (A0n = r7.A0n()) == null) {
            return r4.A0R(r6, A072, false);
        }
        StringBuilder A0l = AnonymousClass000.A0l(A0K(A0n, r1));
        A0l.append(" @ ");
        return AnonymousClass000.A0X(r4.A0R(r6, A072, false), A0l);
    }

    public String A0K(C95814uZ r5, C95814uZ r6) {
        if (r5 == null) {
            Log.w("notification/messagepreview/getname remote_resource null");
            return "";
        }
        AnonymousClass3ZH A0A2 = this.A07.A0A(r5);
        AnonymousClass5ZU r2 = this.A08;
        return r2.A0R(A0A2, r2.A07(A0A2, r6), false);
    }

    public void A0L(C05610Ue r17, AnonymousClass3ZH r18, C56682sO r19, boolean z, boolean z2, boolean z3, boolean z4) {
        Bitmap bitmap;
        Bitmap bitmap2;
        C56682sO r10 = r19;
        if (A0P(r10, this.A0D.A0P(r10.A00.A1J.A00))) {
            Context context = this.A0B.A00;
            AnonymousClass1VX r9 = this.A0H;
            C56362rr r7 = this.A0G;
            AnonymousClass5ZU r4 = this.A08;
            C620733j r5 = this.A0C;
            C66543Lv r6 = this.A0E;
            C55832qz r12 = this.A0R;
            AnonymousClass3ZH r8 = r18;
            boolean z5 = z3;
            if (!z3 || !z2) {
                bitmap = null;
            } else {
                bitmap = this.A09.A03(context, r8, 400, 400);
            }
            C04480Ol A022 = AndroidWear.A02(context, bitmap, r4, r5, r6, r7, r8, r9, r10, this, r12, z, z5, z4);
            C05610Ue r3 = r17;
            A022.A00(r3);
            if (Build.VERSION.SDK_INT >= 24 && (bitmap2 = A022.A09) != null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18280x3.A1G(A0o, "wa-notification-manager wearable extender background builder=", r3);
                C18280x3.A1G(A0o, " ref=", bitmap2);
                A0o.append(" c=");
                A0o.append(bitmap2.getByteCount());
                A0o.append(" w=");
                A0o.append(bitmap2.getWidth());
                A0o.append(" h=");
                C18260x0.A1F(A0o, bitmap2.getHeight());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r5 = r6.A0S;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0M(X.C95814uZ r7) {
        /*
            r6 = this;
            X.1R1 r0 = r6.A0N
            boolean r0 = r0.A0h(r7)
            if (r0 != 0) goto L_0x0025
            boolean r0 = r7 instanceof X.C27991fJ
            if (r0 == 0) goto L_0x0023
            java.util.HashMap r5 = r6.A0S
            java.lang.Number r0 = X.AnonymousClass0x9.A0p(r7, r5)
            if (r0 == 0) goto L_0x0023
            long r3 = r0.longValue()
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0025
            r5.remove(r7)
        L_0x0023:
            r0 = 0
            return r0
        L_0x0025:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66553Lw.A0M(X.4uZ):boolean");
    }

    public boolean A0N(UserJid userJid) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((C32501qy) AnonymousClass1R1.A00(userJid, this.A0N)).A0E();
        }
        return false;
    }

    public StatusBarNotification[] A0Q() {
        NotificationManager A0A2 = this.A0A.A0A();
        if (A0A2 != null) {
            try {
                return A0A2.getActiveNotifications();
            } catch (Exception e) {
                Log.w("notification-utils/failed to get active notifications: ", e);
            }
        }
        return new StatusBarNotification[0];
    }

    public C66553Lw(C55682qk r2, C64393Dh r3, C56972sr r4, C625735q r5, C56942so r6, AnonymousClass5UX r7, C64773Ex r8, AnonymousClass5ZU r9, C114015mM r10, C620633i r11, C54292oU r12, C620733j r13, C56982ss r14, C66543Lv r15, C56892sj r16, C56362rr r17, AnonymousClass1VX r18, AnonymousClass3LP r19, C106195Xz r20, C195219Wq r21, C60152y5 r22, C50222hp r23, AnonymousClass1R1 r24, C55732qp r25, AnonymousClass33Q r26, WebpUtils webpUtils, C55832qz r28) {
        this.A0S = AnonymousClass001.A0t();
        this.A0B = r12;
        this.A0H = r18;
        this.A0J = r20;
        this.A03 = r4;
        this.A01 = r2;
        this.A0Q = webpUtils;
        this.A0D = r14;
        this.A02 = r3;
        this.A0G = r17;
        this.A0I = r19;
        this.A09 = r10;
        this.A0K = r21;
        this.A06 = r7;
        this.A07 = r8;
        this.A0O = r25;
        this.A0A = r11;
        this.A08 = r9;
        this.A0C = r13;
        this.A0P = r26;
        this.A0E = r15;
        this.A0R = r28;
        this.A0N = r24;
        this.A05 = r6;
        this.A0F = r16;
        this.A0L = r22;
        this.A04 = r5;
        this.A0M = r23;
    }

    public static C05610Ue A00(Context context) {
        C05610Ue A012 = A01(context);
        A012.A0K = "other_notifications@1";
        return A012;
    }

    public static CharSequence A02(CharSequence charSequence) {
        SpannableStringBuilder A002 = C18330xA.A00(charSequence);
        A002.setSpan(new StyleSpan(1), 0, charSequence.length(), 0);
        return A002;
    }

    public static CharSequence A03(CharSequence charSequence) {
        SpannableStringBuilder A002 = C18330xA.A00(charSequence);
        A002.setSpan(new StyleSpan(2), 0, charSequence.length(), 0);
        return A002;
    }

    public static String A07(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return context.getString(R.string.f11nameremoved);
        }
        Ringtone ringtone = RingtoneManager.getRingtone(context, Uri.parse(str));
        if (ringtone == null) {
            return null;
        }
        try {
            return ringtone.getTitle(context);
        } catch (Exception e) {
            C18260x0.A1P(AnonymousClass001.A0o(), "notification-utils/unable to get ringtone name/", e);
            return null;
        }
    }

    public static String A08(String str, String str2, String str3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass0x2.A1N(A0o, str2);
        if (!TextUtils.isEmpty(str)) {
            if (((long) str.length()) > 1024) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append(str.subSequence(0, 1020));
                str = AnonymousClass000.A0X("…", A0o2);
            }
            str3 = str;
        }
        return AnonymousClass000.A0X(str3, A0o);
    }

    public boolean A0O(UserJid userJid) {
        int currentInterruptionFilter;
        Cursor A032;
        C626936e.A00();
        C64773Ex r5 = this.A07;
        AnonymousClass3ZH A0A2 = r5.A0A(userJid);
        C620633i r7 = this.A0A;
        NotificationManager A0A3 = r7.A0A();
        if (!(A0A3 == null || Build.VERSION.SDK_INT < 28 || (currentInterruptionFilter = A0A3.getCurrentInterruptionFilter()) == 1 || currentInterruptionFilter == 0)) {
            NotificationManager.Policy notificationPolicy = A0A3.getNotificationPolicy();
            if (notificationPolicy == null) {
                Log.i("NotificationUtils/shouldCallBeSilencedByDNDMode NotificationManager policy is null");
            } else {
                C18260x0.A1R(AnonymousClass001.A0o(), "NotificationUtils/shouldCallBeSilencedByDNDMode NotificationManager policy ", notificationPolicy);
                if ((notificationPolicy.priorityCategories & 8) == 0) {
                    Log.i("NotificationUtils/shouldCallBeSilencedByDNDMode Calls not allowed in DND");
                    return true;
                }
                int i = notificationPolicy.priorityCallSenders;
                if (i == 1) {
                    if (A0A2.A0F == null) {
                        return true;
                    }
                } else if (i == 2) {
                    AnonymousClass5UR A0R2 = r7.A0R();
                    C626936e.A00();
                    Uri A033 = r5.A03(A0A2, A0R2);
                    boolean z = false;
                    if (A033 == null || (A032 = A0R2.A03(A033, (String[]) null, "starred==1", (String[]) null, (String) null)) == null) {
                        return true;
                    }
                    try {
                        if (A032.moveToNext()) {
                            z = true;
                        }
                        A032.close();
                        if (!z) {
                            return true;
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        throw th;
                    }
                }
            }
        }
        return false;
    }

    public C66553Lw() {
    }
}
