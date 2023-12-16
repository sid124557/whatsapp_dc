package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5aX  reason: invalid class name and case insensitive filesystem */
public class C107005aX {
    public static int[] A05(C60152y5 r1, int[] iArr) {
        return C107425bI.A08(iArr, C18280x3.A02(r1.A03("emoji_modifiers"), A01(iArr)));
    }

    public static String A00(int[] iArr) {
        int[] A07 = C107425bI.A07(iArr);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("multi_skin_");
        return AnonymousClass000.A0X(C106655Zv.A01(A07), A0o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (X.C107425bI.A00(r3) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(int[] r4) {
        /*
            boolean r1 = X.C107425bI.A03(r4)
            java.lang.String r0 = "must be skin tone"
            X.C626936e.A0D(r1, r0)
            int[] r3 = X.C106825aE.A03(r4)
            int r2 = r3.length
            r0 = 3
            if (r2 == r0) goto L_0x0014
            r0 = 4
            if (r2 != r0) goto L_0x004f
        L_0x0014:
            int r0 = r2 + -2
            r1 = r3[r0]
            r0 = 8205(0x200d, float:1.1498E-41)
            if (r1 != r0) goto L_0x004f
            int r0 = r2 + -1
            r3 = r3[r0]
            boolean r0 = X.C107425bI.A00(r3)
            if (r0 == 0) goto L_0x004f
        L_0x0026:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            r0 = 0
            r0 = r4[r0]
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r2.append(r0)
            if (r3 != 0) goto L_0x003d
            java.lang.String r0 = ""
        L_0x0038:
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)
            return r0
        L_0x003d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "_"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toString(r3)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x0038
        L_0x004f:
            r3 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107005aX.A01(int[]):java.lang.String");
    }

    public static void A02(C60152y5 r4, int[] iArr) {
        String join;
        int[] A06 = C107425bI.A06(iArr);
        if (!C107425bI.A02(A06)) {
            Log.e("EmojiSkinTonePreferenceManager/savePreferredMultiSkinTone/emoji is not a multi skin tone emoji");
            return;
        }
        String A00 = A00(A06);
        List<Pair> list = new AnonymousClass5XR(iArr).A01;
        ArrayList A0p = AnonymousClass000.A0p(list);
        for (Pair A03 : list) {
            int A032 = C18290x4.A03(A03);
            if (A032 > 0) {
                A0p.add(Integer.toString(A032));
            }
        }
        if (A0p.size() == 0) {
            join = "";
        } else {
            join = TextUtils.join("_", A0p);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EmojiSkinTonePreferenceManager/savePreferredMultiSkinTone, key: ");
        A0o.append(A00);
        C18260x0.A0q(", value: ", join, A0o);
        C18270x1.A0j(C60152y5.A00(r4, "emoji_modifiers"), A00, join);
    }

    public static void A03(C60152y5 r3, int[] iArr) {
        int i;
        String A01 = A01(iArr);
        if (C107425bI.A01(iArr)) {
            i = iArr[1];
        } else {
            i = 0;
        }
        C86604Kt.A15(r3.A03("emoji_modifiers"), A01, i);
    }

    public static int[] A04(C60152y5 r4, int[] iArr) {
        String A00 = A00(iArr);
        try {
            String A0v = AnonymousClass0x9.A0v(r4.A03("emoji_modifiers"), A00);
            if (TextUtils.isEmpty(A0v)) {
                return iArr;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("EmojiSkinTonePreferenceManager/getPreferredMultiSkinTone, key: ");
            A0o.append(A00);
            C18260x0.A0q(", value: ", A0v, A0o);
            String[] split = TextUtils.split(A0v, "_");
            int length = split.length;
            if (length < 2) {
                return iArr;
            }
            AnonymousClass5XR r2 = new AnonymousClass5XR(C107425bI.A05(C107425bI.A06(iArr)));
            int i = 1;
            do {
                r2 = r2.A00(i, Integer.parseInt(split[i - 1]));
                i++;
            } while (i <= length);
            return r2.A01();
        } catch (ClassCastException e) {
            Log.e("EmojiSkinTonePreferenceManager/getPreferredMultiSkinTone", e);
            return iArr;
        }
    }
}
