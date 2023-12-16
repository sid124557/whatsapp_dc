package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.emoji.EmojiDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/* renamed from: X.5bH  reason: invalid class name and case insensitive filesystem */
public final class C107415bH {
    public static final AnonymousClass66R A00 = C154517dI.A01(AnonymousClass8XY.A00);
    public static final int[] A01 = {-5886863, -7296959, -4087745, -8838856, -5339276, -1002704, -4803801, -3760180, -7640688, -30068, -11222427, -33941, -14236452, -11023873, -9148566, -8482653, -11102465, -9558658, -8729691, -14404032, -8219446};
    public static final int[] A02 = {0, 1, 2, 5, 6, 7, 8, 4};

    public static final int A02(C106685Zz r5, CharSequence charSequence) {
        C18270x1.A14(r5, charSequence);
        int i = 0;
        int A03 = A03(charSequence, 0, charSequence.length());
        ArrayList A04 = r5.A04(charSequence.toString());
        if (A04 == null) {
            return A03;
        }
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            C162457s7.A0H(A0m);
            i += A0m.length() - AnonymousClass5CC.A00(A0m).length();
        }
        return A03 - i;
    }

    public static final String A06(C106685Zz r7, C624134x r8) {
        String A1w;
        C162457s7.A0J(r7, 0);
        if (r8 instanceof AnonymousClass1p5) {
            return ((AnonymousClass1p5) r8).BBe();
        }
        if (r8 instanceof C30481mW) {
            C30481mW r1 = (C30481mW) r8;
            if (!(r1.A1w() == null || (A1w = r1.A1w()) == null)) {
                SpannableStringBuilder A002 = C18330xA.A00(A05(A1w, 0, A1w.length(), 10, 700).toString());
                r7.A06(A002);
                URLSpan[] A1Z = C18310x6.A1Z(A002);
                C162457s7.A0H(A1Z);
                for (URLSpan uRLSpan : A1Z) {
                    int spanStart = A002.getSpanStart(uRLSpan);
                    int spanEnd = A002.getSpanEnd(uRLSpan);
                    String url = uRLSpan.getURL();
                    C162457s7.A0D(url);
                    A002.replace(spanStart, spanEnd, AnonymousClass5CC.A00(url));
                }
                return C18290x4.A0o(A002);
            }
        }
        return r8.A13();
    }

    public static final String A07(String str) {
        C162457s7.A0J(str, 0);
        C94284qs r4 = new C94284qs(str);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            if (str.charAt(i) == 10) {
                i2 += 50;
            } else {
                i2++;
            }
            if (i2 > 700) {
                break;
            }
            r4.A00 = i;
            i += r4.A02(i, EmojiDescriptor.A00(r4, false));
        }
        String substring = str.substring(0, i);
        C162457s7.A0D(substring);
        return substring;
    }

    public static final int A00() {
        int[] iArr = A01;
        return iArr[Math.abs(((Random) A00.getValue()).nextInt()) % iArr.length];
    }

    public static final int A01(int i, int i2, boolean z) {
        if (z) {
            if (i < 50) {
                return 24;
            }
            if (i < 150) {
                if (i2 >= 640) {
                    return 19;
                }
                return 16;
            } else if (i2 < 560) {
                return 14;
            } else {
                if (i2 < 640) {
                    return 16;
                }
            }
            return 19;
        } else if (i < 50) {
            return 32;
        } else {
            if (i < 150) {
                return 24;
            }
            return 16;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r0.A00 <= 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A09(X.C66513Ls r4, int r5) {
        /*
            if (r4 == 0) goto L_0x0027
            android.graphics.Bitmap r0 = r4.A03()
        L_0x0006:
            r3 = 0
            if (r0 == 0) goto L_0x0026
            X.7Kq r0 = r4.A09
            if (r0 == 0) goto L_0x0012
            int r0 = r0.A00
            r2 = 1
            if (r0 > 0) goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r0 = 250(0xfa, float:3.5E-43)
            boolean r1 = X.C18280x3.A1U(r5, r0)
            byte[] r0 = r4.A0W
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r2 != 0) goto L_0x0026
            if (r1 != 0) goto L_0x0026
            if (r0 != 0) goto L_0x0026
            r3 = 1
        L_0x0026:
            return r3
        L_0x0027:
            r0 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107415bH.A09(X.3Ls, int):boolean");
    }

    public static final int A03(CharSequence charSequence, int i, int i2) {
        StringBuilder A0X = C18270x1.A0X(charSequence);
        while (i < i2) {
            if (charSequence.charAt(i) != 10) {
                A0X.append(charSequence.charAt(i));
            }
            i++;
        }
        return AnonymousClass5VB.A00(A0X.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        X.C162457s7.A0D(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        X.C162457s7.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Typeface A04(android.content.Context r1, int r2) {
        /*
            switch(r2) {
                case 1: goto L_0x0009;
                case 2: goto L_0x0020;
                case 3: goto L_0x0003;
                case 4: goto L_0x000c;
                case 5: goto L_0x0031;
                case 6: goto L_0x0042;
                case 7: goto L_0x0053;
                case 8: goto L_0x000f;
                default: goto L_0x0003;
            }
        L_0x0003:
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
        L_0x0005:
            X.C162457s7.A0F(r0)
            return r0
        L_0x0009:
            android.graphics.Typeface r0 = android.graphics.Typeface.SERIF
            goto L_0x0005
        L_0x000c:
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            goto L_0x0005
        L_0x000f:
            android.graphics.Typeface r0 = X.C95964vF.A0J
            if (r0 != 0) goto L_0x0063
            android.content.res.AssetManager r1 = r1.getAssets()
            java.lang.String r0 = "fonts/CourierPrime-Bold.ttf"
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r1, r0)
            X.C95964vF.A0J = r0
            goto L_0x0063
        L_0x0020:
            android.graphics.Typeface r0 = X.C95964vF.A0I
            if (r0 != 0) goto L_0x0063
            android.content.res.AssetManager r1 = r1.getAssets()
            java.lang.String r0 = "fonts/FacebookScriptWA-Regular.otf"
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r1, r0)
            X.C95964vF.A0I = r0
            goto L_0x0063
        L_0x0031:
            android.graphics.Typeface r0 = X.C95964vF.A0G
            if (r0 != 0) goto L_0x0063
            android.content.res.AssetManager r1 = r1.getAssets()
            java.lang.String r0 = "fonts/MorningBreeze-Regular.ttf"
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r1, r0)
            X.C95964vF.A0G = r0
            goto L_0x0063
        L_0x0042:
            android.graphics.Typeface r0 = X.C95964vF.A0F
            if (r0 != 0) goto L_0x0063
            android.content.res.AssetManager r1 = r1.getAssets()
            java.lang.String r0 = "fonts/Calistoga-Regular.ttf"
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r1, r0)
            X.C95964vF.A0F = r0
            goto L_0x0063
        L_0x0053:
            android.graphics.Typeface r0 = X.C95964vF.A0H
            if (r0 != 0) goto L_0x0063
            android.content.res.AssetManager r1 = r1.getAssets()
            java.lang.String r0 = "fonts/Exo2-ExtraBold.ttf"
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r1, r0)
            X.C95964vF.A0H = r0
        L_0x0063:
            X.C162457s7.A0D(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107415bH.A04(android.content.Context, int):android.graphics.Typeface");
    }

    public static final CharSequence A05(CharSequence charSequence, int i, int i2, int i3, int i4) {
        StringBuilder A0o = AnonymousClass001.A0o();
        for (int i5 = i; i5 < i2 && i3 >= 0 && i4 > 0; i5++) {
            A0o.append(charSequence.charAt(i5));
            if (charSequence.charAt(i5) == 10) {
                i3--;
            } else {
                i4--;
            }
        }
        if (A0o.length() > 0 && A0o.charAt(A0o.length() - 1) == 10 && charSequence.charAt(i) != 10 && i != i2 - 1) {
            A0o.deleteCharAt(A0o.length() - 1);
        }
        return C18290x4.A0o(A0o);
    }

    public static final void A08(Context context, View view) {
        int i;
        C18260x0.A0O(view, context);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (((float) AnonymousClass000.A0B(context).widthPixels) > context.getResources().getDimension(R.dimen.f6nameremoved) + (((float) 2) * context.getResources().getDimension(R.dimen.f6nameremoved))) {
            i = AnonymousClass4L0.A01(context.getResources(), R.dimen.f6nameremoved);
        } else {
            i = -1;
        }
        layoutParams.width = i;
        layoutParams.height = -2;
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }
}
