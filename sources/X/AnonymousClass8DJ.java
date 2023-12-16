package X;

import android.app.Activity;
import android.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.8DJ  reason: invalid class name */
public class AnonymousClass8DJ implements C835348u {
    public final C835348u A00 = new C10130hR(new C10120hQ(new AnonymousClass8DI()));
    public final C186558vY A01;

    public static HashMap A0A(Map map) {
        String obj;
        String obj2;
        String obj3;
        if (map == null) {
            return null;
        }
        HashMap A0t = AnonymousClass001.A0t();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            Object value = A0w.getValue();
            Object key = A0w.getKey();
            boolean z = key instanceof Number;
            if (value == null) {
                if (z || key != null) {
                    obj3 = key.toString();
                } else {
                    obj3 = null;
                }
                A0t.put(obj3, (Object) null);
            } else {
                if (z || key != null) {
                    obj = key.toString();
                } else {
                    obj = null;
                }
                Object value2 = A0w.getValue();
                if ((value2 instanceof Number) || value2 != null) {
                    obj2 = value2.toString();
                } else {
                    obj2 = null;
                }
                A0t.put(obj, obj2);
            }
        }
        return A0t;
    }

    public final AlertDialog.Builder A0C(C153427bI r11, C131266dJ r12, AnonymousClass84O r13) {
        C131266dJ r6 = r12;
        AlertDialog.Builder message = new AlertDialog.Builder(A01(r12)).setTitle(AnonymousClass84O.A08(r13)).setMessage(AnonymousClass84O.A06(r13));
        AnonymousClass84O A0J = r13.A0K(36);
        C153427bI r5 = r11;
        if (A0J != null) {
            message.setPositiveButton(A0J.A0P(36, ""), new AnonymousClass917(r5, r6, A0J, this, 0));
        }
        AnonymousClass84O A0J2 = r13.A0K(38);
        if (A0J2 != null) {
            message.setNegativeButton(A0J2.A0P(36, ""), new AnonymousClass917(r5, r6, A0J2, this, 1));
        }
        AnonymousClass84O A0J3 = r13.A0K(44);
        if (A0J3 != null) {
            message.setNeutralButton(A0J3.A0P(36, ""), new AnonymousClass917(r5, r6, A0J3, this, 2));
        }
        return message;
    }

    public static int A00(String str) {
        switch (str.hashCode()) {
            case -1009740956:
                if (str.equals("adjust_resize")) {
                    return 16;
                }
                break;
            case -205076707:
                if (str.equals("adjust_nothing")) {
                    return 48;
                }
                break;
            case 1976678381:
                if (str.equals("adjust_pan")) {
                    return 32;
                }
                break;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Unexpected soft input mode ");
        A0o.append(str);
        C159737mN.A01("WindowSoftInputUtils", AnonymousClass000.A0X("; using default instead", A0o));
        return 32;
    }

    public static Activity A01(C131266dJ r1) {
        return (Activity) r1.A00.A02.A00().get(R.id.bloks_host_activity);
    }

    public static C131266dJ A03(Object obj) {
        if (obj instanceof C131266dJ) {
            return (C131266dJ) obj;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1A(obj, A0o);
        A0o.append("is not an instance of ");
        throw AnonymousClass000.A0I(C131266dJ.class.getSimpleName(), A0o);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass84O A04(X.AnonymousClass84O r2, int r3) {
        /*
            int r1 = r2.A03
            r0 = 13784(0x35d8, float:1.9315E-41)
            if (r1 != r0) goto L_0x0027
            r0 = 42
            java.lang.Object r1 = X.AnonymousClass84O.A05(r2, r0)
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x0027
            java.util.List r1 = (java.util.List) r1
        L_0x0012:
            java.util.Iterator r2 = r1.iterator()
        L_0x0016:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r1 = r2.next()
            X.84O r1 = (X.AnonymousClass84O) r1
            int r0 = r1.A03
            if (r0 != r3) goto L_0x0016
            return r1
        L_0x0027:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x0012
        L_0x002c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8DJ.A04(X.84O, int):X.84O");
    }

    public static Object A06(List list) {
        Object A06;
        Class<C17370vQ> cls = C17370vQ.class;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            C08310eF r1 = (C08310eF) list.get(size);
            if (cls.isInstance(r1)) {
                return cls.cast(r1);
            }
            A06 = A06(r1.A0T().A0Y.A05());
        } while (A06 == null);
        return A06;
    }

    public static Runnable A07(C835248t r2, Object obj) {
        return new C117175rV(obj, 24, r2);
    }

    public static String A08(AnonymousClass84O r2) {
        String str;
        int i = r2.A03;
        if (!AnonymousClass000.A1U(i, 13647)) {
            if (i == 13784) {
                AnonymousClass84O A04 = A04(r2, 15855);
                if (A04 != null) {
                    str = AnonymousClass84O.A08(A04);
                    Objects.requireNonNull(str);
                    return str;
                }
            } else {
                throw AnonymousClass001.A0c("screen should be an instance of BloksScreenData or BloksScreenV2Data");
            }
        }
        str = (String) AnonymousClass84O.A05(r2, 35);
        Objects.requireNonNull(str);
        return str;
    }

    public AnonymousClass8DJ(C186558vY r3) {
        this.A01 = r3;
    }

    public static DialogFragment A02(String str, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return null;
            }
            C08310eF r1 = (C08310eF) list.get(size);
            if (!(r1 instanceof C17370vQ) || !(r1 instanceof DialogFragment)) {
                DialogFragment A02 = A02(str, r1.A0T().A0Y.A05());
                if (A02 != null) {
                    return A02;
                }
            } else {
                DialogFragment dialogFragment = (DialogFragment) r1;
                if (((C184978sr) dialogFragment).Azc(str)) {
                    return dialogFragment;
                }
            }
        }
    }

    public static AnonymousClass8DF A05(List list, int i) {
        Object obj = list.get(i);
        if (obj == null) {
            return null;
        }
        return ((C155787fV) obj).A00;
    }

    public static HashMap A09(Map map) {
        String obj;
        HashMap A0t = AnonymousClass001.A0t();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            boolean z = A0w.getValue() instanceof Number;
            Object key = A0w.getKey();
            if (z || A0w.getValue() != null) {
                obj = A0w.getValue().toString();
            } else {
                obj = null;
            }
            A0t.put(key, obj);
        }
        return A0t;
    }

    public static void A0B(C47382dA r5, AnonymousClass49I r6) {
        C835248t B3r = r6.B3r();
        C157157hp.A00(C131266dJ.A00(C162377rs.A01(C158977kt.A00().A00, AnonymousClass6CA.A0I(), (C160817oM) null, r5, (String) null), ((AnonymousClass8DF) B3r).A01, (List) null), C157967jD.A01, B3r);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x026c, code lost:
        if (r2.equals("e") != false) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0273, code lost:
        if (r2.equals("d") == false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0275, code lost:
        com.whatsapp.util.Log.d(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0278, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x027f, code lost:
        if (r2.equals("a") == false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0281, code lost:
        com.whatsapp.util.Log.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0284, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        r6 = X.AnonymousClass001.A0s();
        r2 = r7.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0285, code lost:
        r7 = X.C157967jD.A00(r9, r1);
        X.C162457s7.A0K(r7, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        r7 = (X.C153427bI) r7;
        r2 = r9.A04(1);
        X.C162457s7.A0K(r2, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r2 = (X.AnonymousClass84O) r2;
        r8 = r2.A0L(35);
        r2 = X.AnonymousClass84O.A07(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02a5, code lost:
        if (r2 == null) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02ab, code lost:
        if (r2.isEmpty() != false) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02b1, code lost:
        switch(r2.hashCode()) {
            case -1367751899: goto L_0x02e7;
            case -196315310: goto L_0x02d3;
            case -94789412: goto L_0x02c8;
            default: goto L_0x02b4;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02b4, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02b5, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02b7, code lost:
        r15.Bjn(A01(r1), new X.AnonymousClass3ED(r7, r1, r8), new java.lang.String[]{r0});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02c7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02ce, code lost:
        if (r2.equals("read_contacts") == false) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02d0, code lost:
        r0 = "android.permission.READ_CONTACTS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02d9, code lost:
        if (r2.equals("gallery") == false) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02df, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L_0x02e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e1, code lost:
        r0 = "android.permission.READ_MEDIA_IMAGES";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02e4, code lost:
        r0 = "android.permission.WRITE_EXTERNAL_STORAGE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        if (r2 < 0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02ed, code lost:
        if (r2.equals("camera") == false) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02ef, code lost:
        r0 = "android.permission.CAMERA";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02f2, code lost:
        r0 = (android.app.Dialog) r1.A00.A02.A00().get(com.whatsapp.R.id.bloks_host_progress_dialog);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0303, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0305, code lost:
        r0.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0308, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0309, code lost:
        r8 = X.C157967jD.A00(r9, r1);
        X.C162457s7.A0K(r8, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        r8 = (X.C153427bI) r8;
        r13 = X.C157967jD.A02(r9, 1);
        r0 = r9.A04(2);
        X.C162457s7.A0K(r0, "null cannot be cast to non-null type kotlin.Number");
        r0 = X.AnonymousClass001.A0K(r0);
        r2 = r9.A04(3);
        X.C162457s7.A0K(r2, "null cannot be cast to non-null type kotlin.Number");
        r12 = X.AnonymousClass001.A0K(r2);
        r9 = r9.A00;
        r7 = A05(r9, 4);
        r4 = A05(r9, 5);
        r14 = r8.A00;
        r2 = new X.C151777Wg(r8, r1, r7, r4);
        r11 = new X.C147067Cr(r15);
        r10 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0348, code lost:
        if (r12 <= 0) goto L_0x1365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x034a, code lost:
        if (r0 <= 0) goto L_0x1365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        r1 = (X.C08310eF) r7.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r4 = X.C624635d.A01(r13);
        r1 = r4.getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0354, code lost:
        if (r1 != null) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0356, code lost:
        r2.A00(X.AnonymousClass0GF.INVALID_PARAMETER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x035d, code lost:
        r17 = X.AnonymousClass002.A0B(r1);
        r7 = new X.AnonymousClass0YU(r17.getCanonicalPath()).A0G(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0371, code lost:
        if (r7 == 6) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0375, code lost:
        if (r7 != 8) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0377, code lost:
        r10 = r0;
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0379, code lost:
        r8 = r14.getContentResolver().openInputStream(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0381, code lost:
        if (r8 != null) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        if ((r1 instanceof X.C17370vQ) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0383, code lost:
        r2.A00(X.AnonymousClass0GF.INTERNAL_ERROR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r1 = new android.graphics.BitmapFactory.Options();
        r1.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeStream(r8, (android.graphics.Rect) null, r1);
        r12 = new android.graphics.Rect(0, 0, r1.outWidth, r1.outHeight);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r8.close();
        r7 = r12.width();
        r1 = r12.height();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03a8, code lost:
        if (r7 <= 0) goto L_0x1355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03aa, code lost:
        if (r1 <= 0) goto L_0x1355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03ac, code lost:
        if (r7 > r0) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ae, code lost:
        if (r1 > r10) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03b0, code lost:
        r5 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b2, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03b4, code lost:
        X.C157157hp.A01(r2.A01, r5, r2.A00, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03bd, code lost:
        r9 = new android.graphics.Rect(0, 0, r0, r10);
        r9 = java.lang.Math.max((((double) r12.width()) * 1.0d) / ((double) r9.width()), (((double) r12.height()) * 1.0d) / ((double) r9.height()));
        r9 = new android.graphics.Rect(0, 0, (int) (((double) r12.width()) / r9), (int) (((double) r12.height()) / r9));
        r8 = r14.getContentResolver().openInputStream(r4);
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03fc, code lost:
        if (r8 == null) goto L_0x134f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        r4 = android.graphics.BitmapFactory.decodeStream(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0402, code lost:
        if (r4 == null) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0404, code lost:
        r7 = android.graphics.Bitmap.createScaledBitmap(r4, r9.width(), r9.height(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        if ((r1 instanceof androidx.fragment.app.DialogFragment) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0413, code lost:
        if (r7 == null) goto L_0x134f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0415, code lost:
        r4 = r11.A00;
        r1 = X.AnonymousClass001.A0o();
        X.AnonymousClass000.A1B(java.util.UUID.randomUUID(), r1);
        r5 = r4.B7V(X.AnonymousClass000.A0X(".jpg", r1));
        r4 = X.AnonymousClass0x9.A0h(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        r7.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, r4);
        r4.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        r4.close();
        r4 = new X.AnonymousClass0YU(r5.getCanonicalPath());
        r0 = new X.AnonymousClass0YU(r17.getCanonicalPath()).A0G(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0453, code lost:
        if (r0 == 0) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0455, code lost:
        r4.A0Z("Orientation", java.lang.String.valueOf(r0));
        r4.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x045f, code lost:
        r5 = android.net.Uri.fromFile(r5);
        X.C162457s7.A0J(r5, 0);
        r4 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0468, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
        r1 = (androidx.fragment.app.DialogFragment) r1;
        r6.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x046a, code lost:
        X.C157157hp.A01(r2.A01, r4, r2.A00, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0473, code lost:
        r0 = r9.A00;
        r4 = X.AnonymousClass001.A0n(r0, 0);
        r2 = X.AnonymousClass001.A0n(r0, 1);
        r1 = A01(r1).getIntent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0485, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0487, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x048d, code lost:
        switch(r2.hashCode()) {
            case -891985903: goto L_0x049a;
            case 64711720: goto L_0x04a7;
            case 97526364: goto L_0x04b8;
            case 1958052158: goto L_0x04ca;
            default: goto L_0x0490;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0490, code lost:
        X.C18260x0.A0r("WABLOKS: getIntentParameter type not supported: ", r2, X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0499, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04a0, code lost:
        if (r2.equals("string") == false) goto L_0x0490;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (((X.C184978sr) r1).Azc(r4) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04a6, code lost:
        return r1.getStringExtra(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04ad, code lost:
        if (r2.equals("boolean") == false) goto L_0x0490;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04b3, code lost:
        if (r1.getBooleanExtra(r4, false) == false) goto L_0x1377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04b5, code lost:
        return "1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04be, code lost:
        if (r2.equals("float") == false) goto L_0x0490;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04c9, code lost:
        return java.lang.Float.toString(r1.getFloatExtra(r4, 0.0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04d0, code lost:
        if (r2.equals("integer") == false) goto L_0x0490;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04da, code lost:
        return java.lang.Integer.toString(r1.getIntExtra(r4, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r6.isEmpty() != false) goto L_0x1318;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        if (r1 >= X.C86664Kz.A0M(r6)) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        ((X.C184978sr) ((androidx.fragment.app.DialogFragment) r6.get(r1))).B1u((X.AnonymousClass0GI) null, (java.lang.Runnable) null);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        r6 = X.AnonymousClass001.A0s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        r0 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) ((X.C184978sr) ((androidx.fragment.app.DialogFragment) r6.get(X.C86664Kz.A0M(r6))));
        r2 = r0.A1R();
        r1 = r0.A0G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        if (r2.A0A.size() == 1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        r2.A07(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x08b5, code lost:
        if (r3 == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x08b9, code lost:
        r15.Ayi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x08bc, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x08bd, code lost:
        r15.B37(new X.C1894791l(X.C155787fV.A01(r9, 8), 3), r1, (java.lang.String) r9.A04(2), (java.lang.String) r9.A04(4), (java.lang.String) r9.A04(5), (java.lang.String) r9.A04(7), (java.util.List) r9.A04(1), (java.util.List) r9.A04(3), (java.util.Map) r9.A04(6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        r2 = X.C157967jD.A01(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0909, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x090a, code lost:
        r0 = A01(r1);
        r6 = X.C157967jD.A01(r9, 0);
        r1 = X.C154157ch.A01(X.C154157ch.A00(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x091a, code lost:
        if (r1 == null) goto L_0x0932;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0920, code lost:
        if (r1.isEmpty() != false) goto L_0x0932;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0922, code lost:
        r0 = A02(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0926, code lost:
        r0 = (X.C184978sr) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0928, code lost:
        if (r0 != null) goto L_0x0934;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x092a, code lost:
        X.C159737mN.A01("CDSBloksBottomSheetController", "Cannot remove without an existing bottom sheet - no bottom sheet contains the screen ID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0931, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b6, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0932, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0934, code lost:
        r1 = ((com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r0).A1R().A0A;
        r0 = (X.C04190Ne) r1.peekFirst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0944, code lost:
        if (r0 == null) goto L_0x097a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x094e, code lost:
        if (r6.equals(r0.A03.A03) != false) goto L_0x097a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0950, code lost:
        r4 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0958, code lost:
        if (r4.hasNext() == false) goto L_0x097d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x095a, code lost:
        r2 = (X.C04190Ne) r4.next();
        r1 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0968, code lost:
        if (r6.equals(r1.A03) == false) goto L_0x0954;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        com.whatsapp.util.Log.e("WaExtensions/evaluate/bk.action.io.clipboard.SetString: text cannot be null or empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x096c, code lost:
        if (r2.A00 == null) goto L_0x0973;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x096e, code lost:
        r1.A03();
        r2.A00 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0973, code lost:
        r1.A02();
        r4.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0979, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x097a, code lost:
        r0 = "Attempting to remove the current or only screen in the CDS bottom sheet, so the screen was not removed. Please use pop or dismiss instead.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x097d, code lost:
        r0 = "No screen found with target ID, so the screen was not removed.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x097f, code lost:
        X.C159737mN.A01("CDSBloksBottomSheetDelegate", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0982, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0983, code lost:
        r15.AxX();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0986, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0987, code lost:
        r15.Bgz(A01(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x098e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x098f, code lost:
        A01(r1).finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0996, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0997, code lost:
        r15.BkG(A01(r1), (java.lang.String) r9.A04(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x09a4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x09a5, code lost:
        r15.Bg1(A01(r1), new X.AnonymousClass92U(r9, 7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x09b2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x09b3, code lost:
        r4 = r9.A00;
        r13 = X.AnonymousClass001.A0n(r4, 0);
        r10 = X.AnonymousClass6C9.A0k(r4, 1);
        r9 = X.AnonymousClass6C9.A0V(r4, 2);
        r0 = (java.util.List) r4.get(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00be, code lost:
        r1 = r15.B5Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x09c7, code lost:
        if (r0 == null) goto L_0x0a1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x09c9, code lost:
        r5 = r0.iterator();
        r8 = null;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x09d3, code lost:
        if (r5.hasNext() == false) goto L_0x0a16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x09d5, code lost:
        r4 = (X.AnonymousClass84O) r5.next();
        r2 = 35;
        r8 = (java.lang.String) X.AnonymousClass84O.A05(r4, 35);
        r0 = 36;
        r7 = (java.lang.String) X.AnonymousClass84O.A05(r4, 36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x09eb, code lost:
        if (r8 == null) goto L_0x09cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x09ed, code lost:
        r6 = r9.A0L(r0);
        r5 = r9.A0L(r2);
        r15.AxM(new X.C1894791l(r6, 5), new X.C1894791l(r5, 0), r1, r13, X.C18320x8.A0e("params", A09(r10)), r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0a15, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0a16, code lost:
        r2 = 35;
        r0 = 36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0a1b, code lost:
        r2 = 35;
        r0 = 36;
        r7 = null;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0a22, code lost:
        r2 = r9.A00;
        r5 = X.AnonymousClass6C9.A0V(r2, 0);
        r9 = X.AnonymousClass6C9.A0V(r2, 0);
        r8 = A0A(X.AnonymousClass6C9.A0k(r2, 2));
        r7 = A08(r5);
        r6 = r5.A03;
        r0 = 40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0a44, code lost:
        if (X.AnonymousClass000.A1U(r6, 13647) != false) goto L_0x0a4c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0a48, code lost:
        if (r6 != 13784) goto L_0x0af0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0a4a, code lost:
        r0 = 45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0a4c, code lost:
        r11 = r5.A0P(r0, "0");
        r10 = new X.C156397gY(r7);
        r9 = X.AnonymousClass7r0.A00(r1, r9);
        r0 = new X.AnonymousClass0TK();
        r0.A01 = r7;
        r0.A02 = r8;
        r8 = new X.C09640gW(r0);
        r2 = A04(r5, 15932);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0a6d, code lost:
        if (r2 == null) goto L_0x0adb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0a6f, code lost:
        r2 = r2.A0L(40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0a75, code lost:
        if (r2 == null) goto L_0x0ad9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0a77, code lost:
        r4 = new X.AnonymousClass929(r1, r2, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
        r0 = r9.A00;
        r1 = X.AnonymousClass6C9.A0k(r0, 0);
        r2 = r0.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0a7d, code lost:
        X.AnonymousClass0GI.A00(r5.A0P(36, com.whatsapp.voipcalling.CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID));
        r6 = r1.A00.A00;
        r1 = X.C154157ch.A01(X.C154157ch.A00(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0a94, code lost:
        if (r1 == null) goto L_0x0ad7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0a9a, code lost:
        if (r1.isEmpty() != false) goto L_0x0ad7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0a9c, code lost:
        r7 = A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0aa0, code lost:
        r7 = (X.C17370vQ) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0aa4, code lost:
        if ((r7 instanceof androidx.fragment.app.DialogFragment) == false) goto L_0x0ad5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0aa6, code lost:
        r7 = (androidx.fragment.app.DialogFragment) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0aa8, code lost:
        if (r7 == null) goto L_0x0ae9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0aaa, code lost:
        r8 = X.AnonymousClass0VD.A00(r6, r7, r8, r9, r10, r11);
        r7 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) ((X.C184978sr) r7);
        r5 = r7.A1R();
        r7 = r7.A0G();
        r2 = (X.C04190Ne) r5.A0A.peek();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d0, code lost:
        if (r1 == null) goto L_0x132d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0ac6, code lost:
        if (r2 != null) goto L_0x0ace;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0ac8, code lost:
        r0 = "Cannot push to an empty bottom sheet. Please call open() to show new Screen content in the bottom sheet.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0aca, code lost:
        X.C159737mN.A01("CDSBloksBottomSheetDelegate", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0acd, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0ad0, code lost:
        if (r5.A09 == false) goto L_0x0add;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0ad2, code lost:
        r0 = "Attempting to push to a dismissing sheet. The content will not be displayed properly";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0ad5, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0ad7, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0ad9, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0adb, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0add, code lost:
        r2.A03.A05();
        r5.A05(r7, r8, (X.AnonymousClass0GI) null, r4, 32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0ae8, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0aef, code lost:
        throw X.AnonymousClass001.A0e("Cannot push a new Screen without an existing bottom sheet.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0af6, code lost:
        throw X.AnonymousClass001.A0c("screen should be an instance of BloksScreenData or BloksScreenV2Data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0af7, code lost:
        r2 = r9.A00;
        r15.BGh(A08(X.AnonymousClass6C9.A0V(r2, 0)), A09(X.AnonymousClass6C9.A0k(r2, 1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0b0c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0b0d, code lost:
        r2 = r9.A00;
        r4 = (X.AnonymousClass7r0) r2.get(0);
        r2 = (X.C153427bI) r2.get(2);
        X.C162377rs.A02(r2).A07(r4, (java.util.Map) null);
        A0C(r2, r1, X.AnonymousClass73B.A00(r2, r1, r4.A01)).create().show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
        if (r1.size() <= 0) goto L_0x132d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        r9 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0b33, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0b34, code lost:
        r1 = r9.A00;
        r15.Bjo(A08(X.AnonymousClass6C9.A0V(r1, 0)), A09(X.AnonymousClass6C9.A0k(r1, 1)), X.AnonymousClass000.A09(r1, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0b4d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0b4e, code lost:
        r7 = r9.A00;
        r20 = X.AnonymousClass001.A0n(r7, 0);
        r21 = X.AnonymousClass001.A0n(r7, 1);
        r22 = X.AnonymousClass001.A0n(r7, 2);
        r23 = X.AnonymousClass001.A0n(r7, 3);
        r24 = X.AnonymousClass001.A0n(r7, 4);
        r4 = A05(r7, 5);
        r2 = A05(r7, 6);
        r0 = A05(r7, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0b73, code lost:
        if (r4 == null) goto L_0x0baa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0b75, code lost:
        r5 = new X.C41182Jg();
        r5.A00 = r1;
        r5.A01 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0b7e, code lost:
        if (r2 == null) goto L_0x0ba8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0b80, code lost:
        r4 = new X.C41182Jg();
        r4.A00 = r1;
        r4.A01 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0b89, code lost:
        if (r0 == null) goto L_0x0ba6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0b8b, code lost:
        r2 = new X.C41182Jg();
        r2.A00 = r1;
        r2.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
        r0 = "children";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0b94, code lost:
        r15.Bol((X.C009707r) A01(r1), r5, r4, r2, r20, r21, r22, r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0ba5, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0ba6, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0ba8, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0baa, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0bac, code lost:
        r15.Bme(A01(r1), new X.AnonymousClass3EC(r1, X.AnonymousClass6C9.A0V(r9.A00, 0), r7), new X.C170898Ey(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0bc3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0bc4, code lost:
        r15.Bg3(A01(r1), X.C157967jD.A01(r9, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0bcf, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0bd0, code lost:
        r0 = r9.A00;
        r15.Bhp(X.AnonymousClass000.A09(r0, 0), X.AnonymousClass000.A09(r0, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00db, code lost:
        r0 = r9.A00;
        r1 = X.AnonymousClass6C9.A0k(r0, 0);
        r2 = r0.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0bdd, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0bde, code lost:
        r4 = r9.A00;
        r15.Bho(X.AnonymousClass6C9.A0k(r4, 2), X.AnonymousClass000.A09(r4, 0), X.AnonymousClass000.A09(r4, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0bef, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0bf0, code lost:
        r7 = r9.A00;
        r15.Bhv(X.AnonymousClass000.A09(r7, 0), X.AnonymousClass000.A09(r7, 1), X.AnonymousClass001.A0n(r7, 2), X.AnonymousClass001.A0n(r7, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0c05, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0c06, code lost:
        r7 = r9.A00;
        r16 = X.AnonymousClass001.A0n(r7, 0);
        r19 = X.AnonymousClass000.A09(r7, 1);
        r1 = r7.get(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0c16, code lost:
        if ((r1 instanceof java.lang.Boolean) == false) goto L_0x0c2d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0c18, code lost:
        r20 = X.AnonymousClass001.A1Z(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0c1c, code lost:
        r0 = X.AnonymousClass6C9.A0k(r7, 3);
        r1 = (java.util.ArrayList) r7.get(4);
        r18 = A09(r0);
        r21 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0c2d, code lost:
        r20 = X.AnonymousClass001.A0K(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e5, code lost:
        if (r1 == null) goto L_0x1334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0c32, code lost:
        r2 = r9.A00;
        r6 = X.AnonymousClass001.A0n(r2, 0);
        r5 = X.AnonymousClass001.A0n(r2, 1);
        r4 = A05(r2, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0c40, code lost:
        if (r4 == null) goto L_0x0c4f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0c42, code lost:
        r2 = new X.C1894791l(r4, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0c47, code lost:
        r15.BpF(A01(r1), r2, r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0c4e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0c4f, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0c51, code lost:
        r7 = r9.A00;
        r15.Bjh(A01(r1), X.AnonymousClass001.A0n(r7, 0), X.AnonymousClass001.A0n(r7, 1), X.AnonymousClass001.A0n(r7, 2), X.AnonymousClass001.A0n(r7, 4), X.AnonymousClass6C9.A1O(java.lang.Boolean.TRUE, r7, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0c70, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0c71, code lost:
        r1 = r9.A00;
        r16 = X.AnonymousClass001.A0n(r1, 0);
        r19 = X.AnonymousClass000.A09(r1, 1);
        r20 = X.AnonymousClass000.A09(r1, 2);
        r2 = X.AnonymousClass6C9.A0k(r1, 3);
        r21 = X.AnonymousClass000.A09(r1, 4);
        r1 = (java.util.ArrayList) r1.get(5);
        r18 = A09(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0c92, code lost:
        r15.BlO(r16, r1, r18, r19, r20, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0c97, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0c98, code lost:
        r1 = r9.A00;
        r15.Bhq(new X.AnonymousClass92U(r1.get(3), 2), (java.util.Map) null, X.AnonymousClass000.A09(r1, 0), X.AnonymousClass000.A09(r1, 1), X.AnonymousClass000.A09(r1, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0cb5, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0cb6, code lost:
        r1 = r9.A00;
        r15.Bhr(new X.AnonymousClass92U(r1.get(3), 0), X.AnonymousClass001.A0n(r1, 2), X.AnonymousClass000.A09(r1, 0), X.AnonymousClass000.A09(r1, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0cd0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0cd1, code lost:
        r4 = r9.A00;
        r15.Bhs((X.AnonymousClass49G) null, X.AnonymousClass6C9.A0k(r4, 2), X.AnonymousClass000.A09(r4, 0), X.AnonymousClass000.A09(r4, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0ce2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0ce3, code lost:
        r6 = X.AnonymousClass6C9.A0V(r9.A00, 0);
        r5 = A01(r1);
        r4 = X.AnonymousClass8DI.A06(r1, r9, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0cf1, code lost:
        if (r6 == null) goto L_0x0d24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0cf3, code lost:
        r2 = r6.A0L(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00eb, code lost:
        if (r1.size() <= 0) goto L_0x1334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0cf9, code lost:
        r1 = X.C154157ch.A01(X.C154157ch.A00(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0d01, code lost:
        if (r1 == null) goto L_0x0d22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0d07, code lost:
        if (r1.isEmpty() != false) goto L_0x0d22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0d09, code lost:
        r1 = A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0d0d, code lost:
        r1 = (X.C184978sr) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0d0f, code lost:
        if (r1 == null) goto L_0x0d26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0d11, code lost:
        if (r6 == null) goto L_0x0d20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0d13, code lost:
        if (r2 == null) goto L_0x0d20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0d15, code lost:
        if (r4 == null) goto L_0x0d20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ed, code lost:
        r0 = "properties";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0d17, code lost:
        r0 = new X.C13280mv(r4, r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0d1c, code lost:
        r1.B1u((X.AnonymousClass0GI) null, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0d1f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0d20, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0d22, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0d24, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0d2c, code lost:
        throw X.AnonymousClass001.A0e("Cannot dismiss without an existing bottom sheet.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0d2d, code lost:
        r7 = r9.A00;
        r15.Bhu(X.AnonymousClass000.A09(r7, 0), X.AnonymousClass000.A09(r7, 1), X.AnonymousClass001.A0n(r7, 2), X.AnonymousClass001.A0n(r7, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0d42, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ef, code lost:
        r0 = (java.util.Map) r1.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0d43, code lost:
        A01(r1).startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(X.C157967jD.A01(r9, 0))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0d59, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0d5a, code lost:
        r1 = r9.A00;
        r15.Bhy(new X.AnonymousClass92U(r1.get(2), 3), X.AnonymousClass000.A09(r1, 0), X.AnonymousClass000.A09(r1, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0d71, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0d72, code lost:
        r2 = r9.A00;
        r15.BlL(A01(r1), X.AnonymousClass001.A0n(r2, 0), X.AnonymousClass001.A0n(r2, 1), X.AnonymousClass001.A0n(r2, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0d87, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0d88, code lost:
        r0 = r9.A00;
        r4 = X.AnonymousClass6C9.A0k(r0, 0);
        r0 = X.C155787fV.A02(r0, 1);
        r2 = new X.C41182Jg();
        r2.A01 = r0;
        r2.A00 = r1;
        r15.Bic(r2, A09(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0da2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0da3, code lost:
        r0 = r9.A00;
        r15.BgK(A01(r1), X.AnonymousClass001.A0n(r0, 0), X.C18320x8.A0e("params", A09(X.AnonymousClass6C9.A0k(r0, 1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0dbe, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f5, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0dbf, code lost:
        r2 = X.AnonymousClass84O.A06(X.AnonymousClass6C9.A0V(r9.A00, 0));
        r1 = X.C154157ch.A01(X.C154157ch.A00(A01(r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0dd5, code lost:
        if (r1 == null) goto L_0x0df5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0ddb, code lost:
        if (r1.isEmpty() != false) goto L_0x0df5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0ddd, code lost:
        r0 = A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0de1, code lost:
        r0 = (X.C184978sr) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0de3, code lost:
        if (r0 == null) goto L_0x0dfb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0de5, code lost:
        r0 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r0;
        r1 = r0.A1R();
        r0 = r0.A0G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0def, code lost:
        if (r2 != null) goto L_0x0df7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0df1, code lost:
        r1.A06(r0, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f7, code lost:
        r0 = r0.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0df4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0df5, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0df7, code lost:
        r1.A06(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0dfa, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0e01, code lost:
        throw X.AnonymousClass001.A0e("Cannot pop without an existing bottom sheet.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0e02, code lost:
        r2 = r9.A00;
        r8 = X.AnonymousClass001.A0n(r2, 0);
        r7 = X.AnonymousClass001.A0n(r2, 1);
        r6 = X.AnonymousClass001.A0s();
        r5 = ((java.util.List) r2.get(2)).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0e1e, code lost:
        if (r5.hasNext() == false) goto L_0x0e2e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0e20, code lost:
        r6.add(new X.AnonymousClass92U(r5.next(), 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fb, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
        switch(r12) {
            case 0: goto L_0x09b3;
            case 1: goto L_0x0a22;
            case 2: goto L_0x1195;
            case 3: goto L_0x0af7;
            case 4: goto L_0x0b0d;
            case 5: goto L_0x0b34;
            case 6: goto L_0x0b4e;
            case 7: goto L_0x12c2;
            case 8: goto L_0x119e;
            case 9: goto L_0x0bac;
            case 10: goto L_0x0bc4;
            case 11: goto L_0x0bd0;
            case 12: goto L_0x0bde;
            case 13: goto L_0x11a7;
            case 14: goto L_0x0bf0;
            case 15: goto L_0x0c06;
            case 16: goto L_0x0c32;
            case 17: goto L_0x00ae;
            case 18: goto L_0x0029;
            case 19: goto L_0x0c51;
            case 20: goto L_0x0c71;
            case 21: goto L_0x11b6;
            case 22: goto L_0x0c98;
            case 23: goto L_0x08b9;
            case 24: goto L_0x0cb6;
            case 25: goto L_0x0cd1;
            case 26: goto L_0x0029;
            case 27: goto L_0x0ce3;
            case 28: goto L_0x08bd;
            case 29: goto L_0x0d2d;
            case 30: goto L_0x090a;
            case 31: goto L_0x0d43;
            case 32: goto L_0x0d5a;
            case 33: goto L_0x1238;
            case 34: goto L_0x098f;
            case 35: goto L_0x1128;
            case 36: goto L_0x00c6;
            case 37: goto L_0x0d72;
            case 38: goto L_0x0d88;
            case 39: goto L_0x125e;
            case 40: goto L_0x0da3;
            case 41: goto L_0x0dbf;
            case 42: goto L_0x0029;
            case 43: goto L_0x0e02;
            case 44: goto L_0x0d43;
            case 45: goto L_0x0983;
            case 46: goto L_0x00db;
            case 47: goto L_0x0e36;
            case 48: goto L_0x0e52;
            case 49: goto L_0x0e60;
            case 50: goto L_0x00fe;
            case 51: goto L_0x0f14;
            case X.1ES.REVOKE_MESSAGE_TIMESTAMP_FIELD_NUMBER :int: goto L_0x0f3a;
            case 53: goto L_0x0f4c;
            case 54: goto L_0x12ba;
            case 55: goto L_0x0f64;
            case 56: goto L_0x0f7c;
            case X.1ES.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER :int: goto L_0x0029;
            case 58: goto L_0x0285;
            case 59: goto L_0x0f92;
            case X.1EU.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER :int: goto L_0x12ec;
            case 61: goto L_0x0fb6;
            case 62: goto L_0x0fc2;
            case 63: goto L_0x0fd0;
            case X.1EU.POLL_CREATION_MESSAGE_V3_FIELD_NUMBER :int: goto L_0x0c06;
            case X.1EU.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER :int: goto L_0x02f2;
            case X.1EU.PTV_MESSAGE_FIELD_NUMBER :int: goto L_0x12bf;
            case X.1EU.BOT_INVOKE_MESSAGE_FIELD_NUMBER :int: goto L_0x098f;
            case 68: goto L_0x0ce3;
            case X.1EU.CALL_LOG_MESSSAGE_FIELD_NUMBER :int: goto L_0x0fe6;
            case X.1EU.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER :int: goto L_0x0ff2;
            case X.1EU.ENC_COMMENT_MESSAGE_FIELD_NUMBER :int: goto L_0x11ac;
            case 72: goto L_0x1048;
            case 73: goto L_0x0197;
            case X.1EU.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER :int: goto L_0x0987;
            case X.1EU.EVENT_MESSAGE_FIELD_NUMBER :int: goto L_0x098f;
            case X.1EU.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER :int: goto L_0x0473;
            case X.1EU.COMMENT_MESSAGE_FIELD_NUMBER :int: goto L_0x0309;
            case X.1EU.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER :int: goto L_0x1004;
            case 79: goto L_0x1016;
            case 80: goto L_0x01dd;
            case 81: goto L_0x0029;
            case 82: goto L_0x1022;
            case 83: goto L_0x11b1;
            case 84: goto L_0x1035;
            case 85: goto L_0x1277;
            case 86: goto L_0x0029;
            case 87: goto L_0x0029;
            case 88: goto L_0x0997;
            case 89: goto L_0x1050;
            case 90: goto L_0x09a5;
            case 91: goto L_0x0bde;
            case 92: goto L_0x002a;
            case 93: goto L_0x1062;
            case 94: goto L_0x1089;
            case 95: goto L_0x10be;
            case 96: goto L_0x1294;
            case 97: goto L_0x0029;
            case 98: goto L_0x10e5;
            case 99: goto L_0x12ab;
            case 100: goto L_0x10fc;
            default: goto L_0x0023;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0e2e, code lost:
        r15.BgI(A01(r1), r8, r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0e35, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0e36, code lost:
        r0 = r9.A00;
        r15.BJa(A01(r1), X.AnonymousClass001.A0n(r0, 0), X.C18320x8.A0e("params", A09(X.AnonymousClass6C9.A0k(r0, 1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0e51, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0e52, code lost:
        r15.B1Y(A09(X.AnonymousClass6C9.A0k(r9.A00, 0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0e5f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0e60, code lost:
        r4 = r9.A00;
        r2 = X.AnonymousClass6C9.A0V(r4, 0);
        r10 = X.AnonymousClass6C9.A0V(r4, 1);
        r8 = A0A(X.AnonymousClass6C9.A0k(r4, 2));
        r7 = A08(r2);
        r5 = r2.A03;
        r0 = 40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0e82, code lost:
        if (X.AnonymousClass000.A1U(r5, 13647) != false) goto L_0x0e8a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0e86, code lost:
        if (r5 != 13784) goto L_0x0f0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fd, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0e88, code lost:
        r0 = 45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0e8a, code lost:
        r15 = r2.A0P(r0, "0");
        r14 = new X.C156397gY(r7);
        r9 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A00(X.AnonymousClass0YW.A00.A0C((X.C153427bI) null, r1, r10), r7);
        r9.A02 = r1.A00.A02;
        r4 = new X.AnonymousClass0TK();
        r4.A01 = r7;
        r4.A02 = r8;
        r4.A00 = 812974081;
        r11 = new X.C09640gW(r4);
        r7 = A04(r2, 15932);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0ebe, code lost:
        if (r7 == null) goto L_0x0f03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0ec0, code lost:
        r16 = A00(r7.A0P(38, "adjust_pan"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0eca, code lost:
        if (r7 == null) goto L_0x0f01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0ecc, code lost:
        r0 = r7.A0L(40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0ed2, code lost:
        if (r0 == null) goto L_0x0eff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0ed4, code lost:
        r13 = new X.AnonymousClass929(r1, r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0ed9, code lost:
        r10 = (X.C003203q) A01(r1);
        r0 = 43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0ee7, code lost:
        if (X.AnonymousClass000.A1U(r5, 13647) != false) goto L_0x0ef3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fe, code lost:
        r2 = r9.A00;
        r9 = X.AnonymousClass6C9.A0V(r2, 0);
        r7 = (X.AnonymousClass7r0) r2.get(1);
        r12 = X.AnonymousClass6C9.A0V(r2, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0eef, code lost:
        if (X.AnonymousClass000.A1U(r5, 13784) == false) goto L_0x0f06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0ef1, code lost:
        r0 = 38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0ef3, code lost:
        X.AnonymousClass0VD.A02(r9, r10, r11, X.AnonymousClass7r0.A00(r1, r2.A0K(r0)), r13, r14, r15, r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0efe, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0eff, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0f01, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0f03, code lost:
        r16 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0f0c, code lost:
        throw X.AnonymousClass001.A0c("screen should be an instance of BloksScreenData or BloksScreenV2Data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010e, code lost:
        if (r9 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0f13, code lost:
        throw X.AnonymousClass001.A0c("screen should be an instance of BloksScreenData or BloksScreenV2Data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0f14, code lost:
        r4 = r9.A00;
        r6 = X.AnonymousClass001.A0n(r4, 0);
        r2 = X.AnonymousClass6C9.A0k(r4, 1);
        r15.BgL(A01(r1), new X.AnonymousClass92U(r4.get(2), 5), r6, X.C18320x8.A0e("params", A09(r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0f39, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0f3a, code lost:
        r0 = r9.A00;
        r15.Bjc(A01(r1), X.AnonymousClass001.A0n(r0, 0), X.AnonymousClass001.A0n(r0, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0f4b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0f4c, code lost:
        r1 = r9.A00;
        r15.Bhq((X.AnonymousClass49G) null, X.AnonymousClass6C9.A0k(r1, 3), X.AnonymousClass000.A09(r1, 0), X.AnonymousClass000.A09(r1, 1), X.AnonymousClass000.A09(r1, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0f63, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0f64, code lost:
        r15.Bhl(A01(r1), new X.AnonymousClass92U(r9, 6), X.AnonymousClass001.A1Z(r9.A00.get(1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0f7b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0110, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0f7c, code lost:
        A0C(X.AnonymousClass8DI.A06(r1, r9, 2), r1, X.AnonymousClass6C9.A0V(r9.A00, 0)).create().show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0f91, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0f92, code lost:
        r2 = r9.A00;
        r6 = X.AnonymousClass001.A0n(r2, 0);
        r5 = X.C155787fV.A02(r2, 1);
        r4 = X.C155787fV.A02(r2, 2);
        r2 = new X.C41182Jg();
        r2.A01 = r5;
        r2.A00 = r1;
        r0 = new X.C41182Jg();
        r0.A01 = r4;
        r0.A00 = r1;
        r15.Bs8(r2, r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0fb5, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0fb6, code lost:
        r15.Bg2(A01(r1), X.C157967jD.A01(r9, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0fc1, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0fc2, code lost:
        r0 = r9.A00;
        r15.Bhw(X.AnonymousClass000.A09(r0, 0), X.AnonymousClass000.A09(r0, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0fcf, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0fd0, code lost:
        r7 = r9.A00;
        r15.Bhx(X.AnonymousClass001.A0n(r7, 2), X.AnonymousClass6C9.A0k(r7, 3), X.AnonymousClass000.A09(r7, 0), X.AnonymousClass000.A09(r7, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0fe5, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0112, code lost:
        if (r12 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0fe6, code lost:
        r15.Bo0(A01(r1), X.C157967jD.A01(r9, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0ff1, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0ff2, code lost:
        r0 = r9.A00;
        r15.Bg4(A01(r1), X.AnonymousClass001.A0n(r0, 0), X.AnonymousClass001.A0n(r0, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x1003, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x1004, code lost:
        r4 = r9.A00;
        r15.Bht(X.AnonymousClass000.A09(r4, 0), X.AnonymousClass000.A09(r4, 1), X.AnonymousClass001.A0n(r4, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x1015, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x1016, code lost:
        r15.BgC(A01(r1), X.C157967jD.A01(r9, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x1021, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x1022, code lost:
        r2 = X.AnonymousClass6C9.A0k(r9.A00, 0);
        r0 = A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x102c, code lost:
        if (r2 == null) goto L_0x1031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0114, code lost:
        r11 = (java.lang.String) X.AnonymousClass84O.A05(r9, 43);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x102e, code lost:
        A09(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x1031, code lost:
        r0.onBackPressed();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x1034, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x1035, code lost:
        r15.B1o(A01(r1), new X.C1894791l(X.C155787fV.A02(r9.A00, 0), 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x1047, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x1048, code lost:
        r15.Bqu(X.C157967jD.A01(r9, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x104f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x1050, code lost:
        r0 = r9.A00;
        r15.Bjf(A01(r1), X.AnonymousClass001.A0n(r0, 0), X.AnonymousClass001.A0n(r0, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x1061, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x1062, code lost:
        r0 = r9.A00;
        r15.Bp7(A01(r1), (android.app.ProgressDialog) r1.A00.A02.A00().get(com.whatsapp.R.id.bloks_host_progress_dialog), X.AnonymousClass001.A0n(r0, 0), X.AnonymousClass001.A1Z(r0.get(1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011c, code lost:
        if (r11 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x1088, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x1089, code lost:
        r0 = X.AnonymousClass6C9.A0V(r9.A00, 0);
        r6 = (java.lang.String) X.AnonymousClass84O.A05(r0, 36);
        r0 = r0.A0K(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x109d, code lost:
        if (r0 == null) goto L_0x10bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x109f, code lost:
        r5 = (java.lang.String) X.AnonymousClass84O.A05(r0, 36);
        r4 = r0.A0L(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x10a9, code lost:
        if (r4 == null) goto L_0x10b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x10ab, code lost:
        r2 = new X.C1894791l(r4, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x10b1, code lost:
        r15.BpF(A01(r1), r2, r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x10b8, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x10b9, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x10bb, code lost:
        r4 = null;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011e, code lost:
        r8 = (java.lang.String) X.AnonymousClass84O.A05(r9, 38);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x10be, code lost:
        r7 = r9.A00;
        r16 = X.AnonymousClass001.A0n(r7, 0);
        r19 = X.AnonymousClass000.A09(r7, 1);
        r20 = X.AnonymousClass000.A09(r7, 2);
        r1 = X.AnonymousClass6C9.A0k(r7, 3);
        r15.BlP(r16, (java.util.ArrayList) r7.get(5), A09(r1), r19, r20, X.AnonymousClass000.A09(r7, 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x10e4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x10e5, code lost:
        r1 = r9.A00;
        r15.Bhs(new X.AnonymousClass92U(r1.get(2), 1), (java.util.Map) null, X.AnonymousClass000.A09(r1, 0), X.AnonymousClass000.A09(r1, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x10fb, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x10fc, code lost:
        r0 = r9.A00;
        r6 = X.AnonymousClass000.A09(r0, 0);
        r0 = X.AnonymousClass6C9.A0k(r0, 1);
        r5 = A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x110a, code lost:
        if (r0 == null) goto L_0x1126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x110c, code lost:
        r4 = A09(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x1110, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x1111, code lost:
        if (r6 == 0) goto L_0x1114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x1113, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0126, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x1114, code lost:
        r1 = r5.getIntent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x1118, code lost:
        if (r4 == null) goto L_0x111f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x111a, code lost:
        r1.putExtra("finish_activity_result", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x111f, code lost:
        r5.setResult(r2, r1);
        r5.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x1125, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x1126, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x1128, code lost:
        r7 = X.C157967jD.A00(r9, r1);
        X.C162457s7.A0K(r7, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        r8 = r9.A04(1);
        X.C162457s7.A0K(r8, "null cannot be cast to non-null type kotlin.String");
        r5 = r9.A00;
        r6 = new X.AnonymousClass7TX((X.C153427bI) r7, r1, A05(r5, 2), A05(r5, 3));
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x114d, code lost:
        if (r0 == null) goto L_0x1178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x114f, code lost:
        r5 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x1151, code lost:
        if (r5 == null) goto L_0x1178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0128, code lost:
        r10 = r9.A0E(40, -1);
        r4 = r9.A0L(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x1153, code lost:
        r7 = r5.getPackageManager();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x1157, code lost:
        if (r7 == null) goto L_0x1178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x1159, code lost:
        r4 = "front".equals(r8);
        r2 = r7.hasSystemFeature("android.hardware.camera.front");
        r0 = r7.hasSystemFeature("android.hardware.camera");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x116b, code lost:
        if (r4 == false) goto L_0x1175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x116d, code lost:
        if (r2 != false) goto L_0x117b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x116f, code lost:
        r0 = X.C141756w5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x1171, code lost:
        r6.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x1174, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x1175, code lost:
        if (r0 != false) goto L_0x117b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x1178, code lost:
        r0 = X.C141756w5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0135, code lost:
        if (r4 == null) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x117b, code lost:
        r4 = A01(r1);
        X.C162457s7.A0D(r4);
        r15.Bjn(r4, new X.C170908Ez(r4, r5, r6, r15), new java.lang.String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x1194, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:0x119d, code lost:
        return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:615:0x11a6, code lost:
        return X.AnonymousClass8DI.A0F(X.AnonymousClass8DI.A06(r1, r9, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x11ab, code lost:
        return r15.BBJ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x11b0, code lost:
        return r15.B4m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0137, code lost:
        r4 = (java.util.Map) X.C157157hp.A00(r1, X.C152057Xj.A01(new X.C152057Xj(), r1.A00, 0), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x11b5, code lost:
        return com.bloks.actions.cds.bkactioncdsupdatebackbuttonoverride.BKBloksActionCdsUpdateBackButtonOverrideImpl.evaluate(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x11b6, code lost:
        r8 = r9.A00;
        r2 = X.AnonymousClass001.A0n(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:?, code lost:
        r3 = java.lang.Long.parseLong(r2) * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x11c6, code lost:
        X.C18260x0.A0r("NumberUtil/Invalid long value:", r2, X.AnonymousClass001.A0o());
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0148, code lost:
        r2 = r1.A00;
        r6 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A00(X.AnonymousClass0YW.A00.A0C(r2, (X.C131266dJ) null, r12), r11);
        r6.A02 = r2.A02;
        r0 = new X.AnonymousClass0TK();
        r0.A01 = r11;
        r0.A00 = r10;
        r0.A04 = r4;
        r0.A05 = true;
        r5 = new X.C09640gW(r0);
        r0 = new X.AnonymousClass7KO();
        r0.A01 = r7;
        r0.A00 = r1;
        X.AnonymousClass0VD.A02(r6, (X.C003203q) A01(r1), r5, r7, (X.C181528mu) null, new X.C156397gY(r0), r8, A00(r9.A0P(38, "adjust_pan")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0194, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x1223, code lost:
        r3 = java.lang.Double.valueOf(java.lang.Math.ceil(r2 / r0)).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:645:0x1238, code lost:
        r0 = r9.A00;
        r3 = X.AnonymousClass001.A0n(r0, 0);
        r2 = (java.util.AbstractList) r0.get(1);
        r1 = new java.lang.String[r2.size()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:647:0x124e, code lost:
        if (r6 >= r2.size()) goto L_0x1259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x1250, code lost:
        r1[r6] = r2.get(r6);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0195, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x125d, code lost:
        return java.text.MessageFormat.format(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x125e, code lost:
        r3 = X.C157967jD.A01(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:?, code lost:
        java.lang.Integer.parseInt(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x1266, code lost:
        X.C18260x0.A0r("NumberUtil/Invalid long value:", r3, X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:658:0x1277, code lost:
        r7 = r9.A00;
        r4 = X.AnonymousClass001.A0n(r7, 0);
        r3 = X.AnonymousClass002.A04(r7, 1);
        r2 = new java.lang.String[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x1283, code lost:
        if (r6 >= r3) goto L_0x128f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0197, code lost:
        r2 = r9.A00;
        r0 = X.AnonymousClass001.A0n(r2, 0);
        r6 = X.AnonymousClass001.A0n(r2, 1);
        r5 = A01(r1);
        r2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x1285, code lost:
        r1 = r6 + 1;
        r2[r6] = r7.get(r1);
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:0x1293, code lost:
        return java.text.MessageFormat.format(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x1294, code lost:
        r0 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x12aa, code lost:
        return java.lang.Boolean.valueOf(X.C18280x3.A1X(X.AnonymousClass001.A0n(r0, 0), java.util.regex.Pattern.compile(X.AnonymousClass001.A0n(r0, 1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x12ab, code lost:
        r0 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x12b9, code lost:
        return r15.B41(X.AnonymousClass000.A09(r0, 0), X.AnonymousClass001.A0n(r0, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:668:0x12be, code lost:
        return X.AnonymousClass0x2.A0T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x12bf, code lost:
        return "CONSUMER";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c2, code lost:
        if (r5.getApplicationContext().getPackageManager().queryIntentActivities(r2, 65536).size() <= 0) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:670:0x12c2, code lost:
        r7 = r9.A00;
        r9 = X.AnonymousClass001.A0n(r7, 0);
        r4 = X.AnonymousClass6C9.A0k(r7, 1);
        r6 = X.C155787fV.A02(r7, 2);
        r5 = X.C155787fV.A02(r7, 3);
        r15.AxL(new X.C1894791l(r6, 6), new X.C1894791l(r5, 7), r1, r9, A09(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:671:0x12eb, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:672:0x12ec, code lost:
        r7 = r9.A00;
        r9 = X.AnonymousClass001.A0n(r7, 0);
        r4 = X.AnonymousClass6C9.A0k(r7, 1);
        r6 = X.C155787fV.A02(r7, 2);
        r5 = X.C155787fV.A02(r7, 3);
        r15.AxK(new X.C1894791l(r6, 8), new X.C1894791l(r5, 9), r1, r9, A09(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x1317, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x131e, code lost:
        throw X.AnonymousClass001.A0e("Cannot unwind without an existing bottom sheet.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:677:?, code lost:
        r1.setPrimaryClip(android.content.ClipData.newPlainText(r2, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:678:0x1326, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:679:0x1327, code lost:
        com.whatsapp.util.Log.e("bkinterpreter/clipboard/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c4, code lost:
        r5.startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x132c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x132d, code lost:
        r1 = X.AnonymousClass001.A0o();
        r0 = "WaExtensions/GetChildNode Cannot find the child node [";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x1334, code lost:
        r1 = X.AnonymousClass001.A0o();
        r0 = "WaExtensions/GetChildNode Cannot find the attribute [";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x133a, code lost:
        r1.append(r0);
        r1.append(r2);
        X.C18260x0.A1J(r1, "] on a null or empty parent node");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x1345, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x1346, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:687:0x1347, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:688:0x1348, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x1349, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x134a, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:?, code lost:
        r2.A00(X.AnonymousClass0GF.INTERNAL_ERROR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x1354, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:0x1355, code lost:
        r2.A00(X.AnonymousClass0GF.INVALID_PARAMETER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x135a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:698:0x135b, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c8, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        r0 = r1.A00;
        r4 = X.C157967jD.A01(r9, 0);
        r9.A03(1);
        r7 = X.C154157ch.A01(X.C154157ch.A00(r0.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:700:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:701:0x1360, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:703:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x1364, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:705:0x1365, code lost:
        r2.A00(X.AnonymousClass0GF.INVALID_PARAMETER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:706:0x136a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:707:0x136b, code lost:
        r0 = X.AnonymousClass0GF.INVALID_PARAMETER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:709:0x136e, code lost:
        r0 = X.AnonymousClass0GF.FILE_NOT_FOUND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:711:0x1371, code lost:
        r0 = X.AnonymousClass0GF.INTERNAL_ERROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:713:0x1373, code lost:
        r2.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:0x1376, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:715:0x1377, code lost:
        return "0";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ce, code lost:
        if (r6.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d0, code lost:
        r5.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:733:?, code lost:
        return r7.A00.B2m(r9, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:734:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:735:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:736:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:737:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:738:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:739:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01dc, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:740:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:741:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:742:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:743:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:744:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:745:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:746:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:747:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:748:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:749:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01dd, code lost:
        r4 = java.util.Collections.unmodifiableList(r9.A00);
        r7 = X.C18330xA.A0A("[Bloks logging] ");
        r2 = X.AnonymousClass001.A0n(r4, 0);
        r7.append(X.AnonymousClass001.A0n(r4, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:750:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:751:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:752:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f8, code lost:
        if (r4.get(2) == null) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01fa, code lost:
        r4 = X.AnonymousClass000.A0q(X.AnonymousClass6C9.A0k(r4, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0206, code lost:
        if (r4.hasNext() == false) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0208, code lost:
        r1 = X.AnonymousClass001.A0w(r4);
        X.AnonymousClass001.A1L(r7);
        r7.append(X.C18310x6.A0q(r1));
        r7.append(" : ");
        r1 = r1.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        if (r7 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0221, code lost:
        if ((r1 instanceof java.lang.Number) != false) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0223, code lost:
        if (r1 != null) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0225, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0226, code lost:
        r7.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x022a, code lost:
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x022f, code lost:
        r4 = r7.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0237, code lost:
        switch(r2.hashCode()) {
            case 97: goto L_0x0279;
            case 100: goto L_0x026f;
            case 101: goto L_0x0268;
            case 105: goto L_0x025c;
            case 118: goto L_0x0253;
            case 119: goto L_0x0247;
            default: goto L_0x023a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x023a, code lost:
        X.C18260x0.A0r("[Bloks logging] incorrect level: ", r2, X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0243, code lost:
        com.whatsapp.util.Log.e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0246, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x024d, code lost:
        if (r2.equals("w") == false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x024f, code lost:
        com.whatsapp.util.Log.w(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0252, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0259, code lost:
        if (r2.equals("v") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0262, code lost:
        if (r2.equals("i") == false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0264, code lost:
        com.whatsapp.util.Log.i(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0267, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r7.isEmpty() != false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object B2m(X.C157967jD r26, X.C146787Bp r27, X.C151147Tp r28) {
        /*
            r25 = this;
            r1 = r28
            X.6dJ r1 = (X.C131266dJ) r1
            r7 = r25
            X.8vY r15 = r7.A01
            r8 = r27
            java.lang.String r9 = r8.A00
            int r3 = r9.hashCode()
            r4 = 4
            r2 = 3
            r0 = 2
            r5 = 1
            r6 = 0
            switch(r3) {
                case -2140546951: goto L_0x04db;
                case -2140338357: goto L_0x04e4;
                case -2117986441: goto L_0x04ed;
                case -2068088578: goto L_0x04f6;
                case -2067649951: goto L_0x04ff;
                case -1838906086: goto L_0x0508;
                case -1787809934: goto L_0x0511;
                case -1655856867: goto L_0x051a;
                case -1646637091: goto L_0x0523;
                case -1604504565: goto L_0x052d;
                case -1578886175: goto L_0x0537;
                case -1556410467: goto L_0x0541;
                case -1507852311: goto L_0x054b;
                case -1481223638: goto L_0x0555;
                case -1330718402: goto L_0x055f;
                case -1242219886: goto L_0x0569;
                case -1221103914: goto L_0x0573;
                case -1182895194: goto L_0x057d;
                case -1174424168: goto L_0x0587;
                case -1158334287: goto L_0x0591;
                case -1086615993: goto L_0x059b;
                case -1030847255: goto L_0x05a5;
                case -1003291191: goto L_0x05af;
                case -996698686: goto L_0x05b9;
                case -993097054: goto L_0x05c3;
                case -990185100: goto L_0x05cd;
                case -979462773: goto L_0x05d7;
                case -962969547: goto L_0x05e1;
                case -942664798: goto L_0x05eb;
                case -921635786: goto L_0x05f5;
                case -884670392: goto L_0x05ff;
                case -809454050: goto L_0x0609;
                case -782725013: goto L_0x0613;
                case -780036552: goto L_0x061d;
                case -773489556: goto L_0x0627;
                case -760967806: goto L_0x0631;
                case -746705348: goto L_0x063b;
                case -703852509: goto L_0x0645;
                case -647944134: goto L_0x064f;
                case -629460340: goto L_0x0659;
                case -606722934: goto L_0x0663;
                case -563655164: goto L_0x066d;
                case -541608891: goto L_0x0677;
                case -534326238: goto L_0x0681;
                case -531827055: goto L_0x068b;
                case -424766062: goto L_0x0695;
                case -363552265: goto L_0x069f;
                case -347836657: goto L_0x06a9;
                case -331653351: goto L_0x06b3;
                case -306959749: goto L_0x06bd;
                case -300488230: goto L_0x06c7;
                case -269742372: goto L_0x06d1;
                case -224564602: goto L_0x06db;
                case -188753299: goto L_0x06e5;
                case -161320099: goto L_0x06ef;
                case -149567034: goto L_0x06f9;
                case -136229627: goto L_0x0703;
                case -78052800: goto L_0x070d;
                case -58496533: goto L_0x0717;
                case -26836955: goto L_0x0721;
                case 3413278: goto L_0x072b;
                case 5923458: goto L_0x0735;
                case 136195447: goto L_0x073f;
                case 156743102: goto L_0x0749;
                case 227600558: goto L_0x0753;
                case 243158640: goto L_0x075d;
                case 313766265: goto L_0x0767;
                case 361006941: goto L_0x0771;
                case 458561021: goto L_0x077b;
                case 538167952: goto L_0x0785;
                case 598814056: goto L_0x078f;
                case 610178701: goto L_0x0799;
                case 683144274: goto L_0x07a3;
                case 710140428: goto L_0x07ad;
                case 840594967: goto L_0x07b7;
                case 878253942: goto L_0x07c1;
                case 889592555: goto L_0x07cb;
                case 941474804: goto L_0x07d5;
                case 959076350: goto L_0x07df;
                case 1002037470: goto L_0x07e9;
                case 1073657643: goto L_0x07f3;
                case 1093292105: goto L_0x07fd;
                case 1172555497: goto L_0x0807;
                case 1179677309: goto L_0x0811;
                case 1246727742: goto L_0x081b;
                case 1281868444: goto L_0x0825;
                case 1293733961: goto L_0x082f;
                case 1323560766: goto L_0x0838;
                case 1351005683: goto L_0x0841;
                case 1418508999: goto L_0x084a;
                case 1457845398: goto L_0x0853;
                case 1559677690: goto L_0x085c;
                case 1593718455: goto L_0x0865;
                case 1643041589: goto L_0x086e;
                case 1703102103: goto L_0x0877;
                case 1727518169: goto L_0x0880;
                case 1856118462: goto L_0x0889;
                case 1866424912: goto L_0x0892;
                case 1914861328: goto L_0x089b;
                case 2085194283: goto L_0x08a4;
                case 2094846105: goto L_0x08ad;
                default: goto L_0x0018;
            }
        L_0x0018:
            r12 = -1
        L_0x0019:
            java.lang.String r11 = "d"
            java.lang.String r10 = "e"
            r3 = 0
            r9 = r26
            switch(r12) {
                case 0: goto L_0x09b3;
                case 1: goto L_0x0a22;
                case 2: goto L_0x1195;
                case 3: goto L_0x0af7;
                case 4: goto L_0x0b0d;
                case 5: goto L_0x0b34;
                case 6: goto L_0x0b4e;
                case 7: goto L_0x12c2;
                case 8: goto L_0x119e;
                case 9: goto L_0x0bac;
                case 10: goto L_0x0bc4;
                case 11: goto L_0x0bd0;
                case 12: goto L_0x0bde;
                case 13: goto L_0x11a7;
                case 14: goto L_0x0bf0;
                case 15: goto L_0x0c06;
                case 16: goto L_0x0c32;
                case 17: goto L_0x00ae;
                case 18: goto L_0x0029;
                case 19: goto L_0x0c51;
                case 20: goto L_0x0c71;
                case 21: goto L_0x11b6;
                case 22: goto L_0x0c98;
                case 23: goto L_0x08b9;
                case 24: goto L_0x0cb6;
                case 25: goto L_0x0cd1;
                case 26: goto L_0x0029;
                case 27: goto L_0x0ce3;
                case 28: goto L_0x08bd;
                case 29: goto L_0x0d2d;
                case 30: goto L_0x090a;
                case 31: goto L_0x0d43;
                case 32: goto L_0x0d5a;
                case 33: goto L_0x1238;
                case 34: goto L_0x098f;
                case 35: goto L_0x1128;
                case 36: goto L_0x00c6;
                case 37: goto L_0x0d72;
                case 38: goto L_0x0d88;
                case 39: goto L_0x125e;
                case 40: goto L_0x0da3;
                case 41: goto L_0x0dbf;
                case 42: goto L_0x0029;
                case 43: goto L_0x0e02;
                case 44: goto L_0x0d43;
                case 45: goto L_0x0983;
                case 46: goto L_0x00db;
                case 47: goto L_0x0e36;
                case 48: goto L_0x0e52;
                case 49: goto L_0x0e60;
                case 50: goto L_0x00fe;
                case 51: goto L_0x0f14;
                case 52: goto L_0x0f3a;
                case 53: goto L_0x0f4c;
                case 54: goto L_0x12ba;
                case 55: goto L_0x0f64;
                case 56: goto L_0x0f7c;
                case 57: goto L_0x0029;
                case 58: goto L_0x0285;
                case 59: goto L_0x0f92;
                case 60: goto L_0x12ec;
                case 61: goto L_0x0fb6;
                case 62: goto L_0x0fc2;
                case 63: goto L_0x0fd0;
                case 64: goto L_0x0c06;
                case 65: goto L_0x02f2;
                case 66: goto L_0x12bf;
                case 67: goto L_0x098f;
                case 68: goto L_0x0ce3;
                case 69: goto L_0x0fe6;
                case 70: goto L_0x0ff2;
                case 71: goto L_0x11ac;
                case 72: goto L_0x1048;
                case 73: goto L_0x0197;
                case 74: goto L_0x0987;
                case 75: goto L_0x098f;
                case 76: goto L_0x0473;
                case 77: goto L_0x0309;
                case 78: goto L_0x1004;
                case 79: goto L_0x1016;
                case 80: goto L_0x01dd;
                case 81: goto L_0x0029;
                case 82: goto L_0x1022;
                case 83: goto L_0x11b1;
                case 84: goto L_0x1035;
                case 85: goto L_0x1277;
                case 86: goto L_0x0029;
                case 87: goto L_0x0029;
                case 88: goto L_0x0997;
                case 89: goto L_0x1050;
                case 90: goto L_0x09a5;
                case 91: goto L_0x0bde;
                case 92: goto L_0x002a;
                case 93: goto L_0x1062;
                case 94: goto L_0x1089;
                case 95: goto L_0x10be;
                case 96: goto L_0x1294;
                case 97: goto L_0x0029;
                case 98: goto L_0x10e5;
                case 99: goto L_0x12ab;
                case 100: goto L_0x10fc;
                default: goto L_0x0023;
            }
        L_0x0023:
            X.48u r0 = r7.A00
            java.lang.Object r3 = r0.B2m(r9, r8, r1)
        L_0x0029:
            return r3
        L_0x002a:
            X.7bI r0 = r1.A00
            java.lang.String r4 = X.C157967jD.A01(r9, r6)
            r9.A03(r5)
            android.content.Context r0 = r0.A00
            android.app.Activity r0 = X.C154157ch.A00(r0)
            java.util.List r7 = X.C154157ch.A01(r0)
            if (r7 == 0) goto L_0x0087
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0087
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            int r2 = r7.size()
        L_0x004d:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0087
            java.lang.Object r1 = r7.get(r2)
            X.0eF r1 = (X.C08310eF) r1
            boolean r0 = r1 instanceof X.C17370vQ
            if (r0 == 0) goto L_0x004d
            boolean r0 = r1 instanceof androidx.fragment.app.DialogFragment
            if (r0 == 0) goto L_0x004d
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            r6.add(r1)
            X.8sr r1 = (X.C184978sr) r1
            boolean r0 = r1.Azc(r4)
            if (r0 == 0) goto L_0x004d
        L_0x006c:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x1318
            r1 = 0
        L_0x0073:
            int r0 = X.C86664Kz.A0M(r6)
            if (r1 >= r0) goto L_0x008c
            java.lang.Object r0 = r6.get(r1)
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            X.8sr r0 = (X.C184978sr) r0
            r0.B1u(r3, r3)
            int r1 = r1 + 1
            goto L_0x0073
        L_0x0087:
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            goto L_0x006c
        L_0x008c:
            int r0 = X.C86664Kz.A0M(r6)
            java.lang.Object r0 = r6.get(r0)
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            X.8sr r0 = (X.C184978sr) r0
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r0 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r0
            X.0gV r2 = r0.A1R()
            android.content.Context r1 = r0.A0G()
            java.util.Deque r0 = r2.A0A
            int r0 = r0.size()
            if (r0 == r5) goto L_0x0029
            r2.A07(r1, r4)
            return r3
        L_0x00ae:
            java.lang.String r2 = X.C157967jD.A01(r9, r6)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = "WaExtensions/evaluate/bk.action.io.clipboard.SetString: text cannot be null or empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        L_0x00be:
            android.content.ClipboardManager r1 = r15.B5Z()
            if (r1 == 0) goto L_0x0029
            goto L_0x131f
        L_0x00c6:
            java.util.List r0 = r9.A00
            java.util.Map r1 = X.AnonymousClass6C9.A0k(r0, r6)
            java.lang.Object r2 = r0.get(r5)
            if (r1 == 0) goto L_0x132d
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x132d
            java.lang.String r0 = "children"
            goto L_0x00ef
        L_0x00db:
            java.util.List r0 = r9.A00
            java.util.Map r1 = X.AnonymousClass6C9.A0k(r0, r6)
            java.lang.Object r2 = r0.get(r5)
            if (r1 == 0) goto L_0x1334
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x1334
            java.lang.String r0 = "properties"
        L_0x00ef:
            java.lang.Object r0 = r1.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0029
            return r0
        L_0x00fe:
            java.util.List r2 = r9.A00
            X.84O r9 = X.AnonymousClass6C9.A0V(r2, r6)
            java.lang.Object r7 = r2.get(r5)
            X.7r0 r7 = (X.AnonymousClass7r0) r7
            X.84O r12 = X.AnonymousClass6C9.A0V(r2, r0)
            if (r9 == 0) goto L_0x0029
            if (r7 == 0) goto L_0x0029
            if (r12 == 0) goto L_0x0029
            r0 = 43
            java.lang.Object r11 = X.AnonymousClass84O.A05(r9, r0)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x0029
            r0 = 38
            java.lang.Object r8 = X.AnonymousClass84O.A05(r9, r0)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0029
            r2 = 40
            r0 = -1
            int r10 = r9.A0E(r2, r0)
            r0 = 35
            X.48t r4 = r9.A0L(r0)
            if (r4 == 0) goto L_0x0195
            X.7Xj r2 = new X.7Xj
            r2.<init>()
            X.7bI r0 = r1.A00
            X.7jD r0 = X.C152057Xj.A01(r2, r0, r6)
            java.lang.Object r4 = X.C157157hp.A00(r1, r0, r4)
            java.util.Map r4 = (java.util.Map) r4
        L_0x0148:
            X.7bI r2 = r1.A00
            X.0YW r0 = X.AnonymousClass0YW.A00
            X.7qm r0 = r0.A0C(r2, r3, r12)
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r6 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A00(r0, r11)
            X.2dA r0 = r2.A02
            r6.A02 = r0
            X.0TK r0 = new X.0TK
            r0.<init>()
            r0.A01 = r11
            r0.A00 = r10
            r0.A04 = r4
            r0.A05 = r5
            X.0gW r5 = new X.0gW
            r5.<init>(r0)
            X.7KO r0 = new X.7KO
            r0.<init>()
            r0.A01 = r7
            r0.A00 = r1
            X.7gY r4 = new X.7gY
            r4.<init>((X.AnonymousClass7KO) r0)
            r2 = 38
            java.lang.String r0 = "adjust_pan"
            java.lang.String r0 = r9.A0P(r2, r0)
            int r16 = A00(r0)
            android.app.Activity r0 = A01(r1)
            X.03q r0 = (X.C003203q) r0
            r9 = r6
            r10 = r0
            r11 = r5
            r12 = r7
            r13 = r3
            r14 = r4
            r15 = r8
            X.AnonymousClass0VD.A02(r9, r10, r11, r12, r13, r14, r15, r16)
            return r3
        L_0x0195:
            r4 = r3
            goto L_0x0148
        L_0x0197:
            java.util.List r2 = r9.A00
            java.lang.String r0 = X.AnonymousClass001.A0n(r2, r6)
            java.lang.String r6 = X.AnonymousClass001.A0n(r2, r5)
            android.app.Activity r5 = A01(r1)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r4 = "android.intent.action.VIEW"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r4, r0)
            android.content.Context r0 = r5.getApplicationContext()
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r1.queryIntentActivities(r2, r0)
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01c8
            r5.startActivity(r2)
            return r3
        L_0x01c8:
            if (r6 == 0) goto L_0x0029
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0029
            android.net.Uri r1 = android.net.Uri.parse(r6)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4, r1)
            r5.startActivity(r0)
            return r3
        L_0x01dd:
            java.util.List r1 = r9.A00
            java.util.List r4 = java.util.Collections.unmodifiableList(r1)
            java.lang.String r1 = "[Bloks logging] "
            java.lang.StringBuilder r7 = X.C18330xA.A0A(r1)
            java.lang.String r2 = X.AnonymousClass001.A0n(r4, r6)
            java.lang.String r1 = X.AnonymousClass001.A0n(r4, r5)
            r7.append(r1)
            java.lang.Object r1 = r4.get(r0)
            if (r1 == 0) goto L_0x022f
            java.util.Map r0 = X.AnonymousClass6C9.A0k(r4, r0)
            java.util.Iterator r4 = X.AnonymousClass000.A0q(r0)
        L_0x0202:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x022f
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r4)
            X.AnonymousClass001.A1L(r7)
            java.lang.String r0 = X.C18310x6.A0q(r1)
            r7.append(r0)
            java.lang.String r0 = " : "
            r7.append(r0)
            java.lang.Object r1 = r1.getValue()
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 != 0) goto L_0x022a
            if (r1 != 0) goto L_0x022a
            r0 = 0
        L_0x0226:
            r7.append(r0)
            goto L_0x0202
        L_0x022a:
            java.lang.String r0 = r1.toString()
            goto L_0x0226
        L_0x022f:
            java.lang.String r4 = r7.toString()
            int r0 = r2.hashCode()
            switch(r0) {
                case 97: goto L_0x0279;
                case 100: goto L_0x026f;
                case 101: goto L_0x0268;
                case 105: goto L_0x025c;
                case 118: goto L_0x0253;
                case 119: goto L_0x0247;
                default: goto L_0x023a;
            }
        L_0x023a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "[Bloks logging] incorrect level: "
            X.C18260x0.A0r(r0, r2, r1)
        L_0x0243:
            com.whatsapp.util.Log.e((java.lang.String) r4)
            return r3
        L_0x0247:
            java.lang.String r0 = "w"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x023a
            com.whatsapp.util.Log.w((java.lang.String) r4)
            return r3
        L_0x0253:
            java.lang.String r0 = "v"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0029
            goto L_0x023a
        L_0x025c:
            java.lang.String r0 = "i"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x023a
            com.whatsapp.util.Log.i((java.lang.String) r4)
            return r3
        L_0x0268:
            boolean r0 = r2.equals(r10)
            if (r0 != 0) goto L_0x0243
            goto L_0x023a
        L_0x026f:
            boolean r0 = r2.equals(r11)
            if (r0 == 0) goto L_0x023a
            com.whatsapp.util.Log.d((java.lang.String) r4)
            return r3
        L_0x0279:
            java.lang.String r0 = "a"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x023a
            com.whatsapp.util.Log.a((java.lang.String) r4)
            return r3
        L_0x0285:
            java.lang.Object r7 = X.C157967jD.A00(r9, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext"
            X.C162457s7.A0K(r7, r0)
            X.7bI r7 = (X.C153427bI) r7
            java.lang.Object r2 = r9.A04(r5)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.C162457s7.A0K(r2, r0)
            X.84O r2 = (X.AnonymousClass84O) r2
            r0 = 35
            X.48t r8 = r2.A0L(r0)
            java.lang.String r2 = X.AnonymousClass84O.A07(r2)
            if (r2 == 0) goto L_0x02b4
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x02b4
            int r0 = r2.hashCode()
            switch(r0) {
                case -1367751899: goto L_0x02e7;
                case -196315310: goto L_0x02d3;
                case -94789412: goto L_0x02c8;
                default: goto L_0x02b4;
            }
        L_0x02b4:
            r0 = r3
        L_0x02b5:
            if (r0 == 0) goto L_0x0029
            android.app.Activity r4 = A01(r1)
            java.lang.String[] r2 = new java.lang.String[r5]
            r2[r6] = r0
            X.3ED r0 = new X.3ED
            r0.<init>(r7, r1, r8)
            r15.Bjn(r4, r0, r2)
            return r3
        L_0x02c8:
            java.lang.String r0 = "read_contacts"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02b4
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            goto L_0x02b5
        L_0x02d3:
            java.lang.String r0 = "gallery"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02b4
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r2 < r0) goto L_0x02e4
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            goto L_0x02b5
        L_0x02e4:
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            goto L_0x02b5
        L_0x02e7:
            java.lang.String r0 = "camera"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02b4
            java.lang.String r0 = "android.permission.CAMERA"
            goto L_0x02b5
        L_0x02f2:
            X.7bI r0 = r1.A00
            X.2dA r0 = r0.A02
            android.util.SparseArray r1 = r0.A00()
            r0 = 2131428057(0x7f0b02d9, float:1.8477748E38)
            java.lang.Object r0 = r1.get(r0)
            android.app.Dialog r0 = (android.app.Dialog) r0
            if (r0 == 0) goto L_0x0029
            r0.dismiss()
            return r3
        L_0x0309:
            java.lang.Object r8 = X.C157967jD.A00(r9, r1)
            java.lang.String r7 = "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext"
            X.C162457s7.A0K(r8, r7)
            X.7bI r8 = (X.C153427bI) r8
            java.lang.String r13 = X.C157967jD.A02(r9, r5)
            java.lang.Object r0 = r9.A04(r0)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Number"
            X.C162457s7.A0K(r0, r7)
            int r0 = X.AnonymousClass001.A0K(r0)
            java.lang.Object r2 = r9.A04(r2)
            X.C162457s7.A0K(r2, r7)
            int r12 = X.AnonymousClass001.A0K(r2)
            java.util.List r9 = r9.A00
            X.8DF r7 = A05(r9, r4)
            r2 = 5
            X.8DF r4 = A05(r9, r2)
            android.content.Context r14 = r8.A00
            X.7Wg r2 = new X.7Wg
            r2.<init>(r8, r1, r7, r4)
            X.7Cr r11 = new X.7Cr
            r11.<init>(r15)
            r10 = r12
            if (r12 <= 0) goto L_0x1365
            if (r0 <= 0) goto L_0x1365
            android.net.Uri r4 = X.C624635d.A01(r13)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            java.lang.String r1 = r4.getPath()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            if (r1 != 0) goto L_0x035d
            X.0GF r0 = X.AnonymousClass0GF.INVALID_PARAMETER     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            r2.A00(r0)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            goto L_0x1346
        L_0x035d:
            java.io.File r17 = X.AnonymousClass002.A0B(r1)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            java.lang.String r7 = r17.getCanonicalPath()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            X.0YU r1 = new X.0YU     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            r1.<init>((java.lang.String) r7)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            java.lang.String r13 = "Orientation"
            int r7 = r1.A0G(r6)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            r1 = 6
            if (r7 == r1) goto L_0x0377
            r1 = 8
            if (r7 != r1) goto L_0x0379
        L_0x0377:
            r10 = r0
            r0 = r12
        L_0x0379:
            android.content.ContentResolver r1 = r14.getContentResolver()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            java.io.InputStream r8 = r1.openInputStream(r4)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            if (r8 != 0) goto L_0x038a
            X.0GF r0 = X.AnonymousClass0GF.INTERNAL_ERROR     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            r2.A00(r0)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            goto L_0x1347
        L_0x038a:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x135b }
            r1.<init>()     // Catch:{ all -> 0x135b }
            r1.inJustDecodeBounds = r5     // Catch:{ all -> 0x135b }
            android.graphics.BitmapFactory.decodeStream(r8, r3, r1)     // Catch:{ all -> 0x135b }
            int r7 = r1.outWidth     // Catch:{ all -> 0x135b }
            int r1 = r1.outHeight     // Catch:{ all -> 0x135b }
            android.graphics.Rect r12 = new android.graphics.Rect     // Catch:{ all -> 0x135b }
            r12.<init>(r6, r6, r7, r1)     // Catch:{ all -> 0x135b }
            r8.close()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            int r7 = r12.width()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            int r1 = r12.height()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            if (r7 <= 0) goto L_0x1355
            if (r1 <= 0) goto L_0x1355
            if (r7 > r0) goto L_0x03bd
            if (r1 > r10) goto L_0x03bd
            X.48t r5 = r2.A03     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            if (r5 == 0) goto L_0x0029
            X.7bI r1 = r2.A00     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            X.6dJ r0 = r2.A01     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            X.C157157hp.A01(r0, r5, r1, r4)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            goto L_0x1348
        L_0x03bd:
            android.graphics.Rect r9 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            r9.<init>(r6, r6, r0, r10)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            int r0 = r12.width()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            double r7 = (double) r0     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r7 * r15
            int r0 = r9.width()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            double r0 = (double) r0     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            double r7 = r7 / r0
            int r0 = r12.height()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            double r0 = (double) r0     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            double r0 = r0 * r15
            int r9 = r9.height()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            double r9 = (double) r9     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            double r0 = r0 / r9
            double r9 = java.lang.Math.max(r7, r0)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            int r0 = r12.width()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            double r0 = (double) r0     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            double r0 = r0 / r9
            int r8 = (int) r0     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            int r0 = r12.height()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            double r0 = (double) r0     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            double r0 = r0 / r9
            int r7 = (int) r0     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            android.graphics.Rect r9 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            r9.<init>(r6, r6, r8, r7)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            android.content.ContentResolver r0 = r14.getContentResolver()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            java.io.InputStream r8 = r0.openInputStream(r4)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            r7 = 0
            if (r8 == 0) goto L_0x134f
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch:{ all -> 0x135b }
            if (r4 == 0) goto L_0x0410
            int r1 = r9.width()     // Catch:{ all -> 0x135b }
            int r0 = r9.height()     // Catch:{ all -> 0x135b }
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createScaledBitmap(r4, r1, r0, r5)     // Catch:{ all -> 0x135b }
        L_0x0410:
            r8.close()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            if (r7 == 0) goto L_0x134f
            X.8vY r4 = r11.A00     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            X.AnonymousClass000.A1B(r0, r1)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            java.lang.String r0 = ".jpg"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            java.io.File r5 = r4.B7V(r0)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            java.io.FileOutputStream r4 = X.AnonymousClass0x9.A0h(r5)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x134a }
            r0 = 100
            r7.compress(r1, r0, r4)     // Catch:{ all -> 0x134a }
            r4.flush()     // Catch:{ all -> 0x134a }
            r4.close()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            java.lang.String r0 = r5.getCanonicalPath()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            X.0YU r4 = new X.0YU     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            r4.<init>((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            java.lang.String r1 = r17.getCanonicalPath()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            X.0YU r0 = new X.0YU     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            r0.<init>((java.lang.String) r1)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            int r0 = r0.A0G(r6)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            if (r0 == 0) goto L_0x045f
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            r4.A0Z(r13, r0)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            r4.A0I()     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
        L_0x045f:
            android.net.Uri r5 = android.net.Uri.fromFile(r5)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            X.C162457s7.A0J(r5, r6)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            X.48t r4 = r2.A03     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            if (r4 == 0) goto L_0x0029
            X.7bI r1 = r2.A00     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            X.6dJ r0 = r2.A01     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            X.C157157hp.A01(r0, r4, r1, r5)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            goto L_0x1349
        L_0x0473:
            java.util.List r0 = r9.A00
            java.lang.String r4 = X.AnonymousClass001.A0n(r0, r6)
            java.lang.String r2 = X.AnonymousClass001.A0n(r0, r5)
            android.app.Activity r0 = A01(r1)
            android.content.Intent r1 = r0.getIntent()
            if (r4 == 0) goto L_0x0029
            if (r2 == 0) goto L_0x0029
            int r0 = r2.hashCode()
            switch(r0) {
                case -891985903: goto L_0x049a;
                case 64711720: goto L_0x04a7;
                case 97526364: goto L_0x04b8;
                case 1958052158: goto L_0x04ca;
                default: goto L_0x0490;
            }
        L_0x0490:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WABLOKS: getIntentParameter type not supported: "
            X.C18260x0.A0r(r0, r2, r1)
            return r3
        L_0x049a:
            java.lang.String r0 = "string"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0490
            java.lang.String r3 = r1.getStringExtra(r4)
            return r3
        L_0x04a7:
            java.lang.String r0 = "boolean"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0490
            boolean r0 = r1.getBooleanExtra(r4, r6)
            if (r0 == 0) goto L_0x1377
            java.lang.String r3 = "1"
            return r3
        L_0x04b8:
            java.lang.String r0 = "float"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 0
            float r0 = r1.getFloatExtra(r4, r0)
            java.lang.String r3 = java.lang.Float.toString(r0)
            return r3
        L_0x04ca:
            java.lang.String r0 = "integer"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0490
            int r0 = r1.getIntExtra(r4, r6)
            java.lang.String r3 = java.lang.Integer.toString(r0)
            return r3
        L_0x04db:
            java.lang.String r3 = "bk.action.bloks.AsyncActionWithDataManifestV2"
            boolean r3 = r9.equals(r3)
            r12 = 0
            goto L_0x08b5
        L_0x04e4:
            java.lang.String r3 = "bk.action.cds.PushCdsBottomSheet"
            boolean r3 = r9.equals(r3)
            r12 = 1
            goto L_0x08b5
        L_0x04ed:
            java.lang.String r3 = "bk.action.io.CurrentTimeMillis"
            boolean r3 = r9.equals(r3)
            r12 = 2
            goto L_0x08b5
        L_0x04f6:
            java.lang.String r3 = "bk.action.preload.InvalidatePreloadScreenV2"
            boolean r3 = r9.equals(r3)
            r12 = 3
            goto L_0x08b5
        L_0x04ff:
            java.lang.String r3 = "bk.action.dialog.OpenDialogV2"
            boolean r3 = r9.equals(r3)
            r12 = 4
            goto L_0x08b5
        L_0x0508:
            java.lang.String r3 = "bk.action.preload.RequestPreloadScreenV2"
            boolean r3 = r9.equals(r3)
            r12 = 5
            goto L_0x08b5
        L_0x0511:
            java.lang.String r3 = "wa.action.dialog.ShowDialogWithClientData"
            boolean r3 = r9.equals(r3)
            r12 = 6
            goto L_0x08b5
        L_0x051a:
            java.lang.String r3 = "bk.action.bloks.AsyncActionWithDataManifest"
            boolean r3 = r9.equals(r3)
            r12 = 7
            goto L_0x08b5
        L_0x0523:
            java.lang.String r3 = "bk.action.bloks.DismissKeyboard"
            boolean r3 = r9.equals(r3)
            r12 = 8
            goto L_0x08b5
        L_0x052d:
            java.lang.String r3 = "bk.action.navigation.SetNavBar"
            boolean r3 = r9.equals(r3)
            r12 = 9
            goto L_0x08b5
        L_0x0537:
            java.lang.String r3 = "wa.action.care.OpenReportThisPayment"
            boolean r3 = r9.equals(r3)
            r12 = 10
            goto L_0x08b5
        L_0x0541:
            java.lang.String r3 = "bk.action.qpl.MarkerDrop"
            boolean r3 = r9.equals(r3)
            r12 = 11
            goto L_0x08b5
        L_0x054b:
            java.lang.String r3 = "bk.action.qpl.userflow.AnnotateV2"
            boolean r3 = r9.equals(r3)
            r12 = 12
            goto L_0x08b5
        L_0x0555:
            java.lang.String r3 = "bk.fx.action.GetFamilyDeviceId"
            boolean r3 = r9.equals(r3)
            r12 = 13
            goto L_0x08b5
        L_0x055f:
            java.lang.String r3 = "bk.action.qpl.userflow.EndFlowFailureV2"
            boolean r3 = r9.equals(r3)
            r12 = 14
            goto L_0x08b5
        L_0x0569:
            java.lang.String r3 = "wa.action.SendFieldStat"
            boolean r3 = r9.equals(r3)
            r12 = 15
            goto L_0x08b5
        L_0x0573:
            java.lang.String r3 = "wa.action.ShowSnackbar"
            boolean r3 = r9.equals(r3)
            r12 = 16
            goto L_0x08b5
        L_0x057d:
            java.lang.String r3 = "bk.action.io.clipboard.SetString"
            boolean r3 = r9.equals(r3)
            r12 = 17
            goto L_0x08b5
        L_0x0587:
            java.lang.String r3 = "bk.action.logging.LogEvent"
            boolean r3 = r9.equals(r3)
            r12 = 18
            goto L_0x08b5
        L_0x0591:
            java.lang.String r3 = "bk.action.wa.spam.ReportSpam"
            boolean r3 = r9.equals(r3)
            r12 = 19
            goto L_0x08b5
        L_0x059b:
            java.lang.String r3 = "bk.action.wa.wam.SendFieldstatV3"
            boolean r3 = r9.equals(r3)
            r12 = 20
            goto L_0x08b5
        L_0x05a5:
            java.lang.String r3 = "wa.action.TimeInFuture"
            boolean r3 = r9.equals(r3)
            r12 = 21
            goto L_0x08b5
        L_0x05af:
            java.lang.String r3 = "bk.action.qpl.MarkerEndV2"
            boolean r3 = r9.equals(r3)
            r12 = 22
            goto L_0x08b5
        L_0x05b9:
            java.lang.String r3 = "bk.action.avatar.CaptureAutogenCamera"
            boolean r3 = r9.equals(r3)
            r12 = 23
            goto L_0x08b5
        L_0x05c3:
            java.lang.String r3 = "bk.action.qpl.MarkerPoint"
            boolean r3 = r9.equals(r3)
            r12 = 24
            goto L_0x08b5
        L_0x05cd:
            java.lang.String r3 = "bk.action.qpl.MarkerStart"
            boolean r3 = r9.equals(r3)
            r12 = 25
            goto L_0x08b5
        L_0x05d7:
            java.lang.String r3 = "bk.action.debug.internal.DeviceLog"
            boolean r3 = r9.equals(r3)
            r12 = 26
            goto L_0x08b5
        L_0x05e1:
            java.lang.String r3 = "bk.action.cds.CloseScreen"
            boolean r3 = r9.equals(r3)
            r12 = 27
            goto L_0x08b5
        L_0x05eb:
            java.lang.String r3 = "bk.action.inapppurchase.FetchPriceAndBuy"
            boolean r3 = r9.equals(r3)
            r12 = 28
            goto L_0x08b5
        L_0x05f5:
            java.lang.String r3 = "bk.action.qpl.userflow.MarkErrorV2"
            boolean r3 = r9.equals(r3)
            r12 = 29
            goto L_0x08b5
        L_0x05ff:
            java.lang.String r3 = "bk.action.cds.internal.RemoveCdsBottomSheet"
            boolean r3 = r9.equals(r3)
            r12 = 30
            goto L_0x08b5
        L_0x0609:
            java.lang.String r3 = "bk.action.navigation.OpenUrl"
            boolean r3 = r9.equals(r3)
            r12 = 31
            goto L_0x08b5
        L_0x0613:
            java.lang.String r3 = "bk.action.qpl.userflow.StartFlowV2"
            boolean r3 = r9.equals(r3)
            r12 = 32
            goto L_0x08b5
        L_0x061d:
            java.lang.String r3 = "wa.action.FormatStringV2"
            boolean r3 = r9.equals(r3)
            r12 = 33
            goto L_0x08b5
        L_0x0627:
            java.lang.String r3 = "bk.action.bloks.CloseScreenV2"
            boolean r3 = r9.equals(r3)
            r12 = 34
            goto L_0x08b5
        L_0x0631:
            java.lang.String r3 = "bk.action.foa.media.OpenCamera"
            boolean r3 = r9.equals(r3)
            r12 = 35
            goto L_0x08b5
        L_0x063b:
            java.lang.String r3 = "wa.action.GetChildNode"
            boolean r3 = r9.equals(r3)
            r12 = 36
            goto L_0x08b5
        L_0x0645:
            java.lang.String r3 = "bk.action.flipper.SendData"
            boolean r3 = r9.equals(r3)
            r12 = 37
            goto L_0x08b5
        L_0x064f:
            java.lang.String r3 = "wa.action.RegDeeplinkListener"
            boolean r3 = r9.equals(r3)
            r12 = 38
            goto L_0x08b5
        L_0x0659:
            java.lang.String r3 = "wa.action.HandleError"
            boolean r3 = r9.equals(r3)
            r12 = 39
            goto L_0x08b5
        L_0x0663:
            java.lang.String r3 = "bk.action.bloks.OpenScreen"
            boolean r3 = r9.equals(r3)
            r12 = 40
            goto L_0x08b5
        L_0x066d:
            java.lang.String r3 = "bk.action.cds.PopCdsBottomSheet"
            boolean r3 = r9.equals(r3)
            r12 = 41
            goto L_0x08b5
        L_0x0677:
            java.lang.String r3 = "wa.action.StartFieldStatTimer"
            boolean r3 = r9.equals(r3)
            r12 = 42
            goto L_0x08b5
        L_0x0681:
            java.lang.String r3 = "wa.action.navigation.OpenNativeActionSheet"
            boolean r3 = r9.equals(r3)
            r12 = 43
            goto L_0x08b5
        L_0x068b:
            java.lang.String r3 = "wa.action.OpenUrl"
            boolean r3 = r9.equals(r3)
            r12 = 44
            goto L_0x08b5
        L_0x0695:
            java.lang.String r3 = "bk.action.avatar.PauseAutogenCamera"
            boolean r3 = r9.equals(r3)
            r12 = 45
            goto L_0x08b5
        L_0x069f:
            java.lang.String r3 = "wa.action.GetAttributeValue"
            boolean r3 = r9.equals(r3)
            r12 = 46
            goto L_0x08b5
        L_0x06a9:
            java.lang.String r3 = "bk.action.bloks.LaunchDialog"
            boolean r3 = r9.equals(r3)
            r12 = 47
            goto L_0x08b5
        L_0x06b3:
            java.lang.String r3 = "wa.action.DeregDeeplinkListener"
            boolean r3 = r9.equals(r3)
            r12 = 48
            goto L_0x08b5
        L_0x06bd:
            java.lang.String r3 = "bk.action.cds.OpenCdsBottomSheet"
            boolean r3 = r9.equals(r3)
            r12 = 49
            goto L_0x08b5
        L_0x06c7:
            java.lang.String r3 = "bk.action.fx.OpenSyncScreen"
            boolean r3 = r9.equals(r3)
            r12 = 50
            goto L_0x08b5
        L_0x06d1:
            java.lang.String r3 = "wa.action.navigation.OpenScreenWithOptions"
            boolean r3 = r9.equals(r3)
            r12 = 51
            goto L_0x08b5
        L_0x06db:
            java.lang.String r3 = "bk.wa.ReportABug"
            boolean r3 = r9.equals(r3)
            r12 = 52
            goto L_0x08b5
        L_0x06e5:
            java.lang.String r3 = "bk.action.qpl.MarkerEnd"
            boolean r3 = r9.equals(r3)
            r12 = 53
            goto L_0x08b5
        L_0x06ef:
            java.lang.String r3 = "wa.action.GetFieldStatElapsedTime"
            boolean r3 = r9.equals(r3)
            r12 = 54
            goto L_0x08b5
        L_0x06f9:
            java.lang.String r3 = "bk.action.bloks.PushBottomSheet"
            boolean r3 = r9.equals(r3)
            r12 = 55
            goto L_0x08b5
        L_0x0703:
            java.lang.String r3 = "bk.action.dialog.OpenDialog"
            boolean r3 = r9.equals(r3)
            r12 = 56
            goto L_0x08b5
        L_0x070d:
            java.lang.String r3 = "wa.action.ResetFieldStats"
            boolean r3 = r9.equals(r3)
            r12 = 57
            goto L_0x08b5
        L_0x0717:
            java.lang.String r3 = "bk.action.RequestPermission"
            boolean r3 = r9.equals(r3)
            r12 = 58
            goto L_0x08b5
        L_0x0721:
            java.lang.String r3 = "wa.action.media.UploadMedia"
            boolean r3 = r9.equals(r3)
            r12 = 59
            goto L_0x08b5
        L_0x072b:
            java.lang.String r3 = "bk.action.bloks.AsyncAction"
            boolean r3 = r9.equals(r3)
            r12 = 60
            goto L_0x08b5
        L_0x0735:
            java.lang.String r3 = "wa.action.care.OpenContactSupport"
            boolean r3 = r9.equals(r3)
            r12 = 61
            goto L_0x08b5
        L_0x073f:
            java.lang.String r3 = "bk.action.qpl.userflow.EndFlowSuccessV2"
            boolean r3 = r9.equals(r3)
            r12 = 62
            goto L_0x08b5
        L_0x0749:
            java.lang.String r3 = "bk.action.qpl.userflow.MarkPointV2"
            boolean r3 = r9.equals(r3)
            r12 = 63
            goto L_0x08b5
        L_0x0753:
            java.lang.String r3 = "wa.action.SendFieldStatV2"
            boolean r3 = r9.equals(r3)
            r12 = 64
            goto L_0x08b5
        L_0x075d:
            java.lang.String r3 = "wa.action.DismissProgressBar"
            boolean r3 = r9.equals(r3)
            r12 = 65
            goto L_0x08b5
        L_0x0767:
            java.lang.String r3 = "wa.action.GetAppType"
            boolean r3 = r9.equals(r3)
            r12 = 66
            goto L_0x08b5
        L_0x0771:
            java.lang.String r3 = "bk.action.navigation.CloseScreen"
            boolean r3 = r9.equals(r3)
            r12 = 67
            goto L_0x08b5
        L_0x077b:
            java.lang.String r3 = "bk.action.cds.DismissCdsBottomSheet"
            boolean r3 = r9.equals(r3)
            r12 = 68
            goto L_0x08b5
        L_0x0785:
            java.lang.String r3 = "wa.action.share.Text"
            boolean r3 = r9.equals(r3)
            r12 = 69
            goto L_0x08b5
        L_0x078f:
            java.lang.String r3 = "wa.action.navigation.OpenChat"
            boolean r3 = r9.equals(r3)
            r12 = 70
            goto L_0x08b5
        L_0x0799:
            java.lang.String r3 = "bk.action.session_store.Get"
            boolean r3 = r9.equals(r3)
            r12 = 71
            goto L_0x08b5
        L_0x07a3:
            java.lang.String r3 = "bk.action.io.Toast"
            boolean r3 = r9.equals(r3)
            r12 = 72
            goto L_0x08b5
        L_0x07ad:
            java.lang.String r3 = "bk.action.DeeplinkToOtherAppOrDirectToAppStore"
            boolean r3 = r9.equals(r3)
            r12 = 73
            goto L_0x08b5
        L_0x07b7:
            java.lang.String r3 = "bk.action.bloks.PopBottomSheet"
            boolean r3 = r9.equals(r3)
            r12 = 74
            goto L_0x08b5
        L_0x07c1:
            java.lang.String r3 = "wa.action.FinishActivity"
            boolean r3 = r9.equals(r3)
            r12 = 75
            goto L_0x08b5
        L_0x07cb:
            java.lang.String r3 = "wa.action.GetIntentParameter"
            boolean r3 = r9.equals(r3)
            r12 = 76
            goto L_0x08b5
        L_0x07d5:
            java.lang.String r3 = "bk.action.foa.media.ResizeImage"
            boolean r3 = r9.equals(r3)
            r12 = 77
            goto L_0x08b5
        L_0x07df:
            java.lang.String r3 = "bk.action.qpl.userflow.EndFlowCancelV2"
            boolean r3 = r9.equals(r3)
            r12 = 78
            goto L_0x08b5
        L_0x07e9:
            java.lang.String r3 = "wa.action.navigation.OpenContactInfo"
            boolean r3 = r9.equals(r3)
            r12 = 79
            goto L_0x08b5
        L_0x07f3:
            java.lang.String r3 = "wa.action.Logging"
            boolean r3 = r9.equals(r3)
            r12 = 80
            goto L_0x08b5
        L_0x07fd:
            java.lang.String r3 = "wa.action.GetFieldStatEventId"
            boolean r3 = r9.equals(r3)
            r12 = 81
            goto L_0x08b5
        L_0x0807:
            java.lang.String r3 = "wa.action.PopScreen"
            boolean r3 = r9.equals(r3)
            r12 = 82
            goto L_0x08b5
        L_0x0811:
            java.lang.String r3 = "bk.action.cds.UpdateBackButtonOverride"
            boolean r3 = r9.equals(r3)
            r12 = 83
            goto L_0x08b5
        L_0x081b:
            java.lang.String r3 = "bk.action.bloks.DismissBottomSheet"
            boolean r3 = r9.equals(r3)
            r12 = 84
            goto L_0x08b5
        L_0x0825:
            java.lang.String r3 = "wa.action.FormatString"
            boolean r3 = r9.equals(r3)
            r12 = 85
            goto L_0x08b5
        L_0x082f:
            java.lang.String r3 = "bk.action.io.DebugToast"
            boolean r3 = r9.equals(r3)
            r12 = 86
            goto L_0x08b5
        L_0x0838:
            java.lang.String r3 = "wa.action.DismissDialog"
            boolean r3 = r9.equals(r3)
            r12 = 87
            goto L_0x08b5
        L_0x0841:
            java.lang.String r3 = "wa.action.RouteToNativeScreen"
            boolean r3 = r9.equals(r3)
            r12 = 88
            goto L_0x08b5
        L_0x084a:
            java.lang.String r3 = "bk.action.wa.extension.ReportItem"
            boolean r3 = r9.equals(r3)
            r12 = 89
            goto L_0x08b5
        L_0x0853:
            java.lang.String r3 = "bk.action.bloks.OpenBottomSheet"
            boolean r3 = r9.equals(r3)
            r12 = 90
            goto L_0x08b5
        L_0x085c:
            java.lang.String r3 = "bk.action.qpl.MarkerAnnotate"
            boolean r3 = r9.equals(r3)
            r12 = 91
            goto L_0x08b5
        L_0x0865:
            java.lang.String r3 = "bk.action.cds.UnwindToScreen"
            boolean r3 = r9.equals(r3)
            r12 = 92
            goto L_0x08b5
        L_0x086e:
            java.lang.String r3 = "wa.action.ShowProgressBar"
            boolean r3 = r9.equals(r3)
            r12 = 93
            goto L_0x08b5
        L_0x0877:
            java.lang.String r3 = "bk.action.io.ShowSnackbar"
            boolean r3 = r9.equals(r3)
            r12 = 94
            goto L_0x08b5
        L_0x0880:
            java.lang.String r3 = "bk.action.wa.wam.SendFieldstatWithSkipServerSampling"
            boolean r3 = r9.equals(r3)
            r12 = 95
            goto L_0x08b5
        L_0x0889:
            java.lang.String r3 = "bk.action.string.MatchesRegex"
            boolean r3 = r9.equals(r3)
            r12 = 96
            goto L_0x08b5
        L_0x0892:
            java.lang.String r3 = "wa.action.bloks.LaunchDialog"
            boolean r3 = r9.equals(r3)
            r12 = 97
            goto L_0x08b5
        L_0x089b:
            java.lang.String r3 = "bk.action.qpl.MarkerStartV2"
            boolean r3 = r9.equals(r3)
            r12 = 98
            goto L_0x08b5
        L_0x08a4:
            java.lang.String r3 = "wa.action.GetAbPropValue"
            boolean r3 = r9.equals(r3)
            r12 = 99
            goto L_0x08b5
        L_0x08ad:
            java.lang.String r3 = "wa.action.FinishActivityWithResult"
            boolean r3 = r9.equals(r3)
            r12 = 100
        L_0x08b5:
            if (r3 != 0) goto L_0x0019
            goto L_0x0018
        L_0x08b9:
            r15.Ayi()
            return r3
        L_0x08bd:
            java.lang.Object r10 = r9.A04(r5)
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r9.A04(r0)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r8 = r9.A04(r2)
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r12 = r9.A04(r4)
            java.lang.String r12 = (java.lang.String) r12
            r0 = 5
            java.lang.Object r7 = r9.A04(r0)
            java.lang.String r7 = (java.lang.String) r7
            r0 = 6
            java.lang.Object r6 = r9.A04(r0)
            java.util.Map r6 = (java.util.Map) r6
            r0 = 7
            java.lang.Object r5 = r9.A04(r0)
            java.lang.String r5 = (java.lang.String) r5
            r0 = 8
            X.8DF r4 = X.C155787fV.A01(r9, r0)
            X.91l r0 = new X.91l
            r0.<init>(r4, r2)
            r13 = r15
            r14 = r0
            r15 = r1
            r16 = r11
            r17 = r12
            r18 = r7
            r19 = r5
            r20 = r10
            r21 = r8
            r22 = r6
            r13.B37(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r3
        L_0x090a:
            android.app.Activity r0 = A01(r1)
            java.lang.String r6 = X.C157967jD.A01(r9, r6)
            android.app.Activity r0 = X.C154157ch.A00(r0)
            java.util.List r1 = X.C154157ch.A01(r0)
            if (r1 == 0) goto L_0x0932
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0932
            androidx.fragment.app.DialogFragment r0 = A02(r6, r1)
        L_0x0926:
            X.8sr r0 = (X.C184978sr) r0
            if (r0 != 0) goto L_0x0934
            java.lang.String r1 = "CDSBloksBottomSheetController"
            java.lang.String r0 = "Cannot remove without an existing bottom sheet - no bottom sheet contains the screen ID"
            X.C159737mN.A01(r1, r0)
            return r3
        L_0x0932:
            r0 = 0
            goto L_0x0926
        L_0x0934:
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r0 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r0
            X.0gV r0 = r0.A1R()
            java.util.Deque r1 = r0.A0A
            java.lang.Object r0 = r1.peekFirst()
            X.0Ne r0 = (X.C04190Ne) r0
            java.lang.String r5 = "CDSBloksBottomSheetDelegate"
            if (r0 == 0) goto L_0x097a
            X.0Qe r0 = r0.A03
            java.lang.String r0 = r0.A03
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x097a
            java.util.Iterator r4 = r1.iterator()
        L_0x0954:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x097d
            java.lang.Object r2 = r4.next()
            X.0Ne r2 = (X.C04190Ne) r2
            X.0Qe r1 = r2.A03
            java.lang.String r0 = r1.A03
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0954
            android.view.View r0 = r2.A00
            if (r0 == 0) goto L_0x0973
            r1.A03()
            r2.A00 = r3
        L_0x0973:
            r1.A02()
            r4.remove()
            return r3
        L_0x097a:
            java.lang.String r0 = "Attempting to remove the current or only screen in the CDS bottom sheet, so the screen was not removed. Please use pop or dismiss instead."
            goto L_0x097f
        L_0x097d:
            java.lang.String r0 = "No screen found with target ID, so the screen was not removed."
        L_0x097f:
            X.C159737mN.A01(r5, r0)
            return r3
        L_0x0983:
            r15.AxX()
            return r3
        L_0x0987:
            android.app.Activity r0 = A01(r1)
            r15.Bgz(r0)
            return r3
        L_0x098f:
            android.app.Activity r0 = A01(r1)
            r0.finish()
            return r3
        L_0x0997:
            java.lang.Object r2 = r9.A04(r6)
            java.lang.String r2 = (java.lang.String) r2
            android.app.Activity r0 = A01(r1)
            r15.BkG(r0, r2)
            return r3
        L_0x09a5:
            android.app.Activity r2 = A01(r1)
            r1 = 7
            X.92U r0 = new X.92U
            r0.<init>(r9, r1)
            r15.Bg1(r2, r0)
            return r3
        L_0x09b3:
            java.util.List r4 = r9.A00
            java.lang.String r13 = X.AnonymousClass001.A0n(r4, r6)
            java.util.Map r10 = X.AnonymousClass6C9.A0k(r4, r5)
            X.84O r9 = X.AnonymousClass6C9.A0V(r4, r0)
            java.lang.Object r0 = r4.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0a1b
            java.util.Iterator r5 = r0.iterator()
            r8 = r3
            r7 = r3
        L_0x09cf:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0a16
            java.lang.Object r4 = r5.next()
            X.84O r4 = (X.AnonymousClass84O) r4
            r2 = 35
            java.lang.Object r8 = X.AnonymousClass84O.A05(r4, r2)
            java.lang.String r8 = (java.lang.String) r8
            r0 = 36
            java.lang.Object r7 = X.AnonymousClass84O.A05(r4, r0)
            java.lang.String r7 = (java.lang.String) r7
            if (r8 == 0) goto L_0x09cf
        L_0x09ed:
            X.48t r6 = r9.A0L(r0)
            X.48t r5 = r9.A0L(r2)
            java.util.HashMap r2 = A09(r10)
            java.lang.String r0 = "params"
            java.lang.String r14 = X.C18320x8.A0e(r0, r2)
            r0 = 5
            X.91l r4 = new X.91l
            r4.<init>(r6, r0)
            r2 = 0
            X.91l r0 = new X.91l
            r0.<init>(r5, r2)
            r9 = r15
            r10 = r4
            r11 = r0
            r12 = r1
            r15 = r7
            r16 = r8
            r9.AxM(r10, r11, r12, r13, r14, r15, r16)
            return r3
        L_0x0a16:
            r2 = 35
            r0 = 36
            goto L_0x09ed
        L_0x0a1b:
            r2 = 35
            r0 = 36
            r7 = r3
            r8 = r3
            goto L_0x09ed
        L_0x0a22:
            java.util.List r2 = r9.A00
            X.84O r5 = X.AnonymousClass6C9.A0V(r2, r6)
            X.84O r9 = X.AnonymousClass6C9.A0V(r2, r6)
            java.util.Map r0 = X.AnonymousClass6C9.A0k(r2, r0)
            java.util.HashMap r8 = A0A(r0)
            java.lang.String r7 = A08(r5)
            int r6 = r5.A03
            r0 = 13647(0x354f, float:1.9124E-41)
            boolean r4 = X.AnonymousClass000.A1U(r6, r0)
            java.lang.String r2 = "0"
            r0 = 40
            if (r4 != 0) goto L_0x0a4c
            r0 = 13784(0x35d8, float:1.9315E-41)
            if (r6 != r0) goto L_0x0af0
            r0 = 45
        L_0x0a4c:
            java.lang.String r11 = r5.A0P(r0, r2)
            X.7gY r10 = new X.7gY
            r10.<init>((java.lang.String) r7)
            X.7r0 r9 = X.AnonymousClass7r0.A00(r1, r9)
            X.0TK r0 = new X.0TK
            r0.<init>()
            r0.A01 = r7
            r0.A02 = r8
            X.0gW r8 = new X.0gW
            r8.<init>(r0)
            r0 = 15932(0x3e3c, float:2.2325E-41)
            X.84O r2 = A04(r5, r0)
            if (r2 == 0) goto L_0x0adb
            r0 = 40
            X.48t r2 = r2.A0L(r0)
        L_0x0a75:
            if (r2 == 0) goto L_0x0ad9
            r0 = 1
            X.929 r4 = new X.929
            r4.<init>(r1, r2, r0)
        L_0x0a7d:
            java.lang.String r2 = "default"
            r0 = 36
            java.lang.String r0 = r5.A0P(r0, r2)
            X.AnonymousClass0GI.A00(r0)
            X.7bI r0 = r1.A00
            android.content.Context r6 = r0.A00
            android.app.Activity r0 = X.C154157ch.A00(r6)
            java.util.List r1 = X.C154157ch.A01(r0)
            if (r1 == 0) goto L_0x0ad7
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0ad7
            java.lang.Object r7 = A06(r1)
        L_0x0aa0:
            X.0vQ r7 = (X.C17370vQ) r7
            boolean r0 = r7 instanceof androidx.fragment.app.DialogFragment
            if (r0 == 0) goto L_0x0ad5
            androidx.fragment.app.DialogFragment r7 = (androidx.fragment.app.DialogFragment) r7
        L_0x0aa8:
            if (r7 == 0) goto L_0x0ae9
            X.0Qe r8 = X.AnonymousClass0VD.A00(r6, r7, r8, r9, r10, r11)
            X.8sr r7 = (X.C184978sr) r7
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r7 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r7
            X.0gV r5 = r7.A1R()
            android.content.Context r7 = r7.A0G()
            r11 = 32
            java.util.Deque r0 = r5.A0A
            java.lang.Object r2 = r0.peek()
            X.0Ne r2 = (X.C04190Ne) r2
            java.lang.String r1 = "CDSBloksBottomSheetDelegate"
            if (r2 != 0) goto L_0x0ace
            java.lang.String r0 = "Cannot push to an empty bottom sheet. Please call open() to show new Screen content in the bottom sheet."
        L_0x0aca:
            X.C159737mN.A01(r1, r0)
            return r3
        L_0x0ace:
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0add
            java.lang.String r0 = "Attempting to push to a dismissing sheet. The content will not be displayed properly"
            goto L_0x0aca
        L_0x0ad5:
            r7 = 0
            goto L_0x0aa8
        L_0x0ad7:
            r7 = 0
            goto L_0x0aa0
        L_0x0ad9:
            r4 = r3
            goto L_0x0a7d
        L_0x0adb:
            r2 = r3
            goto L_0x0a75
        L_0x0add:
            X.0Qe r0 = r2.A03
            r0.A05()
            r6 = r5
            r9 = r3
            r10 = r4
            r6.A05(r7, r8, r9, r10, r11)
            return r3
        L_0x0ae9:
            java.lang.String r0 = "Cannot push a new Screen without an existing bottom sheet."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0af0:
            java.lang.String r0 = "screen should be an instance of BloksScreenData or BloksScreenV2Data"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0af7:
            java.util.List r2 = r9.A00
            X.84O r0 = X.AnonymousClass6C9.A0V(r2, r6)
            java.lang.String r1 = A08(r0)
            java.util.Map r0 = X.AnonymousClass6C9.A0k(r2, r5)
            java.util.HashMap r0 = A09(r0)
            r15.BGh(r1, r0)
            return r3
        L_0x0b0d:
            java.util.List r2 = r9.A00
            java.lang.Object r4 = r2.get(r6)
            X.7r0 r4 = (X.AnonymousClass7r0) r4
            java.lang.Object r2 = r2.get(r0)
            X.7bI r2 = (X.C153427bI) r2
            X.7oM r0 = X.C162377rs.A02(r2)
            r0.A07(r4, r3)
            X.84O r0 = r4.A01
            X.84O r0 = X.AnonymousClass73B.A00(r2, r1, r0)
            android.app.AlertDialog$Builder r0 = r7.A0C(r2, r1, r0)
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            return r3
        L_0x0b34:
            java.util.List r1 = r9.A00
            X.84O r0 = X.AnonymousClass6C9.A0V(r1, r6)
            java.lang.String r4 = A08(r0)
            java.util.Map r0 = X.AnonymousClass6C9.A0k(r1, r5)
            int r1 = X.AnonymousClass000.A09(r1, r2)
            java.util.HashMap r0 = A09(r0)
            r15.Bjo(r4, r0, r1)
            return r3
        L_0x0b4e:
            java.util.List r7 = r9.A00
            java.lang.String r20 = X.AnonymousClass001.A0n(r7, r6)
            java.lang.String r21 = X.AnonymousClass001.A0n(r7, r5)
            java.lang.String r22 = X.AnonymousClass001.A0n(r7, r0)
            java.lang.String r23 = X.AnonymousClass001.A0n(r7, r2)
            java.lang.String r24 = X.AnonymousClass001.A0n(r7, r4)
            r0 = 5
            X.8DF r4 = A05(r7, r0)
            r0 = 6
            X.8DF r2 = A05(r7, r0)
            r0 = 7
            X.8DF r0 = A05(r7, r0)
            if (r4 == 0) goto L_0x0baa
            X.2Jg r5 = new X.2Jg
            r5.<init>()
            r5.A00 = r1
            r5.A01 = r4
        L_0x0b7e:
            if (r2 == 0) goto L_0x0ba8
            X.2Jg r4 = new X.2Jg
            r4.<init>()
            r4.A00 = r1
            r4.A01 = r2
        L_0x0b89:
            if (r0 == 0) goto L_0x0ba6
            X.2Jg r2 = new X.2Jg
            r2.<init>()
            r2.A00 = r1
            r2.A01 = r0
        L_0x0b94:
            android.app.Activity r0 = A01(r1)
            X.07r r0 = (X.C009707r) r0
            r16 = r0
            r17 = r5
            r18 = r4
            r19 = r2
            r15.Bol(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r3
        L_0x0ba6:
            r2 = r3
            goto L_0x0b94
        L_0x0ba8:
            r4 = r3
            goto L_0x0b89
        L_0x0baa:
            r5 = r3
            goto L_0x0b7e
        L_0x0bac:
            java.util.List r0 = r9.A00
            X.84O r5 = X.AnonymousClass6C9.A0V(r0, r6)
            X.8Ey r4 = new X.8Ey
            r4.<init>(r1)
            android.app.Activity r2 = A01(r1)
            X.3EC r0 = new X.3EC
            r0.<init>(r1, r5, r7)
            r15.Bme(r2, r0, r4)
            return r3
        L_0x0bc4:
            java.lang.String r2 = X.C157967jD.A01(r9, r6)
            android.app.Activity r0 = A01(r1)
            r15.Bg3(r0, r2)
            return r3
        L_0x0bd0:
            java.util.List r0 = r9.A00
            int r1 = X.AnonymousClass000.A09(r0, r6)
            int r0 = X.AnonymousClass000.A09(r0, r5)
            r15.Bhp(r1, r0)
            return r3
        L_0x0bde:
            java.util.List r4 = r9.A00
            int r2 = X.AnonymousClass000.A09(r4, r6)
            int r1 = X.AnonymousClass000.A09(r4, r5)
            java.util.Map r0 = X.AnonymousClass6C9.A0k(r4, r0)
            r15.Bho(r0, r2, r1)
            return r3
        L_0x0bf0:
            java.util.List r7 = r9.A00
            int r6 = X.AnonymousClass000.A09(r7, r6)
            int r4 = X.AnonymousClass000.A09(r7, r5)
            java.lang.String r1 = X.AnonymousClass001.A0n(r7, r0)
            java.lang.String r0 = X.AnonymousClass001.A0n(r7, r2)
            r15.Bhv(r6, r4, r1, r0)
            return r3
        L_0x0c06:
            java.util.List r7 = r9.A00
            java.lang.String r16 = X.AnonymousClass001.A0n(r7, r6)
            int r19 = X.AnonymousClass000.A09(r7, r5)
            java.lang.Object r1 = r7.get(r0)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0c2d
            boolean r20 = X.AnonymousClass001.A1Z(r1)
        L_0x0c1c:
            java.util.Map r0 = X.AnonymousClass6C9.A0k(r7, r2)
            java.lang.Object r1 = r7.get(r4)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.HashMap r18 = A09(r0)
            r21 = -1
            goto L_0x0c92
        L_0x0c2d:
            int r20 = X.AnonymousClass001.A0K(r1)
            goto L_0x0c1c
        L_0x0c32:
            java.util.List r2 = r9.A00
            java.lang.String r6 = X.AnonymousClass001.A0n(r2, r6)
            java.lang.String r5 = X.AnonymousClass001.A0n(r2, r5)
            X.8DF r4 = A05(r2, r0)
            if (r4 == 0) goto L_0x0c4f
            X.91l r2 = new X.91l
            r2.<init>(r4, r0)
        L_0x0c47:
            android.app.Activity r0 = A01(r1)
            r15.BpF(r0, r2, r6, r5)
            return r3
        L_0x0c4f:
            r2 = r3
            goto L_0x0c47
        L_0x0c51:
            java.util.List r7 = r9.A00
            java.lang.String r17 = X.AnonymousClass001.A0n(r7, r6)
            java.lang.String r18 = X.AnonymousClass001.A0n(r7, r5)
            java.lang.String r19 = X.AnonymousClass001.A0n(r7, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r21 = X.AnonymousClass6C9.A1O(r0, r7, r2)
            java.lang.String r20 = X.AnonymousClass001.A0n(r7, r4)
            android.app.Activity r16 = A01(r1)
            r15.Bjh(r16, r17, r18, r19, r20, r21)
            return r3
        L_0x0c71:
            java.util.List r1 = r9.A00
            java.lang.String r16 = X.AnonymousClass001.A0n(r1, r6)
            int r19 = X.AnonymousClass000.A09(r1, r5)
            int r20 = X.AnonymousClass000.A09(r1, r0)
            java.util.Map r2 = X.AnonymousClass6C9.A0k(r1, r2)
            int r21 = X.AnonymousClass000.A09(r1, r4)
            r0 = 5
            java.lang.Object r1 = r1.get(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.HashMap r18 = A09(r2)
        L_0x0c92:
            r17 = r1
            r15.BlO(r16, r17, r18, r19, r20, r21)
            return r3
        L_0x0c98:
            java.util.List r1 = r9.A00
            int r7 = X.AnonymousClass000.A09(r1, r6)
            int r8 = X.AnonymousClass000.A09(r1, r5)
            int r9 = X.AnonymousClass000.A09(r1, r0)
            java.lang.Object r2 = r1.get(r2)
            X.92U r1 = new X.92U
            r1.<init>(r2, r0)
            r4 = r15
            r5 = r1
            r6 = r3
            r4.Bhq(r5, r6, r7, r8, r9)
            return r3
        L_0x0cb6:
            java.util.List r1 = r9.A00
            int r7 = X.AnonymousClass000.A09(r1, r6)
            int r5 = X.AnonymousClass000.A09(r1, r5)
            java.lang.String r4 = X.AnonymousClass001.A0n(r1, r0)
            java.lang.Object r1 = r1.get(r2)
            X.92U r0 = new X.92U
            r0.<init>(r1, r6)
            r15.Bhr(r0, r4, r7, r5)
            return r3
        L_0x0cd1:
            java.util.List r4 = r9.A00
            int r2 = X.AnonymousClass000.A09(r4, r6)
            int r1 = X.AnonymousClass000.A09(r4, r5)
            java.util.Map r0 = X.AnonymousClass6C9.A0k(r4, r0)
            r15.Bhs(r3, r0, r2, r1)
            return r3
        L_0x0ce3:
            java.util.List r2 = r9.A00
            X.84O r6 = X.AnonymousClass6C9.A0V(r2, r6)
            android.app.Activity r5 = A01(r1)
            X.7bI r4 = X.AnonymousClass8DI.A06(r1, r9, r0)
            if (r6 == 0) goto L_0x0d24
            r0 = 35
            X.48t r2 = r6.A0L(r0)
        L_0x0cf9:
            android.app.Activity r0 = X.C154157ch.A00(r5)
            java.util.List r1 = X.C154157ch.A01(r0)
            if (r1 == 0) goto L_0x0d22
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0d22
            java.lang.Object r1 = A06(r1)
        L_0x0d0d:
            X.8sr r1 = (X.C184978sr) r1
            if (r1 == 0) goto L_0x0d26
            if (r6 == 0) goto L_0x0d20
            if (r2 == 0) goto L_0x0d20
            if (r4 == 0) goto L_0x0d20
            X.0mv r0 = new X.0mv
            r0.<init>(r4, r6, r2)
        L_0x0d1c:
            r1.B1u(r3, r0)
            return r3
        L_0x0d20:
            r0 = r3
            goto L_0x0d1c
        L_0x0d22:
            r1 = 0
            goto L_0x0d0d
        L_0x0d24:
            r2 = r3
            goto L_0x0cf9
        L_0x0d26:
            java.lang.String r0 = "Cannot dismiss without an existing bottom sheet."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0d2d:
            java.util.List r7 = r9.A00
            int r6 = X.AnonymousClass000.A09(r7, r6)
            int r4 = X.AnonymousClass000.A09(r7, r5)
            java.lang.String r1 = X.AnonymousClass001.A0n(r7, r0)
            java.lang.String r0 = X.AnonymousClass001.A0n(r7, r2)
            r15.Bhu(r6, r4, r1, r0)
            return r3
        L_0x0d43:
            java.lang.String r0 = X.C157967jD.A01(r9, r6)
            android.app.Activity r4 = A01(r1)
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            r4.startActivity(r0)
            return r3
        L_0x0d5a:
            java.util.List r1 = r9.A00
            int r6 = X.AnonymousClass000.A09(r1, r6)
            int r4 = X.AnonymousClass000.A09(r1, r5)
            java.lang.Object r2 = r1.get(r0)
            r1 = 3
            X.92U r0 = new X.92U
            r0.<init>(r2, r1)
            r15.Bhy(r0, r6, r4)
            return r3
        L_0x0d72:
            java.util.List r2 = r9.A00
            java.lang.String r6 = X.AnonymousClass001.A0n(r2, r6)
            java.lang.String r4 = X.AnonymousClass001.A0n(r2, r5)
            java.lang.String r2 = X.AnonymousClass001.A0n(r2, r0)
            android.app.Activity r0 = A01(r1)
            r15.BlL(r0, r6, r4, r2)
            return r3
        L_0x0d88:
            java.util.List r0 = r9.A00
            java.util.Map r4 = X.AnonymousClass6C9.A0k(r0, r6)
            X.8DF r0 = X.C155787fV.A02(r0, r5)
            X.2Jg r2 = new X.2Jg
            r2.<init>()
            r2.A01 = r0
            r2.A00 = r1
            java.util.HashMap r0 = A09(r4)
            r15.Bic(r2, r0)
            return r3
        L_0x0da3:
            java.util.List r0 = r9.A00
            java.lang.String r4 = X.AnonymousClass001.A0n(r0, r6)
            java.util.Map r0 = X.AnonymousClass6C9.A0k(r0, r5)
            android.app.Activity r2 = A01(r1)
            java.util.HashMap r1 = A09(r0)
            java.lang.String r0 = "params"
            java.lang.String r0 = X.C18320x8.A0e(r0, r1)
            r15.BgK(r2, r4, r0)
            return r3
        L_0x0dbf:
            java.util.List r0 = r9.A00
            X.84O r0 = X.AnonymousClass6C9.A0V(r0, r6)
            java.lang.String r2 = X.AnonymousClass84O.A06(r0)
            android.app.Activity r0 = A01(r1)
            android.app.Activity r0 = X.C154157ch.A00(r0)
            java.util.List r1 = X.C154157ch.A01(r0)
            if (r1 == 0) goto L_0x0df5
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0df5
            java.lang.Object r0 = A06(r1)
        L_0x0de1:
            X.8sr r0 = (X.C184978sr) r0
            if (r0 == 0) goto L_0x0dfb
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r0 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r0
            X.0gV r1 = r0.A1R()
            android.content.Context r0 = r0.A0G()
            if (r2 != 0) goto L_0x0df7
            r1.A06(r0, r3)
            return r3
        L_0x0df5:
            r0 = 0
            goto L_0x0de1
        L_0x0df7:
            r1.A06(r0, r2)
            return r3
        L_0x0dfb:
            java.lang.String r0 = "Cannot pop without an existing bottom sheet."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0e02:
            java.util.List r2 = r9.A00
            java.lang.String r8 = X.AnonymousClass001.A0n(r2, r6)
            java.lang.String r7 = X.AnonymousClass001.A0n(r2, r5)
            java.lang.Object r0 = r2.get(r0)
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r5 = r0.iterator()
        L_0x0e1a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0e2e
            java.lang.Object r4 = r5.next()
            r2 = 4
            X.92U r0 = new X.92U
            r0.<init>(r4, r2)
            r6.add(r0)
            goto L_0x0e1a
        L_0x0e2e:
            android.app.Activity r0 = A01(r1)
            r15.BgI(r0, r8, r7, r6)
            return r3
        L_0x0e36:
            java.util.List r0 = r9.A00
            java.lang.String r4 = X.AnonymousClass001.A0n(r0, r6)
            java.util.Map r0 = X.AnonymousClass6C9.A0k(r0, r5)
            android.app.Activity r2 = A01(r1)
            java.util.HashMap r1 = A09(r0)
            java.lang.String r0 = "params"
            java.lang.String r0 = X.C18320x8.A0e(r0, r1)
            r15.BJa(r2, r4, r0)
            return r3
        L_0x0e52:
            java.util.List r0 = r9.A00
            java.util.Map r0 = X.AnonymousClass6C9.A0k(r0, r6)
            java.util.HashMap r0 = A09(r0)
            r15.B1Y(r0)
            return r3
        L_0x0e60:
            java.util.List r4 = r9.A00
            X.84O r2 = X.AnonymousClass6C9.A0V(r4, r6)
            X.84O r10 = X.AnonymousClass6C9.A0V(r4, r5)
            java.util.Map r0 = X.AnonymousClass6C9.A0k(r4, r0)
            java.util.HashMap r8 = A0A(r0)
            java.lang.String r7 = A08(r2)
            int r5 = r2.A03
            r0 = 13647(0x354f, float:1.9124E-41)
            boolean r9 = X.AnonymousClass000.A1U(r5, r0)
            java.lang.String r4 = "0"
            r0 = 40
            if (r9 != 0) goto L_0x0e8a
            r0 = 13784(0x35d8, float:1.9315E-41)
            if (r5 != r0) goto L_0x0f0d
            r0 = 45
        L_0x0e8a:
            java.lang.String r15 = r2.A0P(r0, r4)
            X.7gY r14 = new X.7gY
            r14.<init>((java.lang.String) r7)
            X.0YW r0 = X.AnonymousClass0YW.A00
            X.7qm r0 = r0.A0C(r3, r1, r10)
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r9 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A00(r0, r7)
            X.7bI r0 = r1.A00
            X.2dA r0 = r0.A02
            r9.A02 = r0
            X.0TK r4 = new X.0TK
            r4.<init>()
            r4.A01 = r7
            r4.A02 = r8
            r0 = 812974081(0x30750001, float:8.9130486E-10)
            r4.A00 = r0
            X.0gW r11 = new X.0gW
            r11.<init>(r4)
            r0 = 15932(0x3e3c, float:2.2325E-41)
            X.84O r7 = A04(r2, r0)
            r4 = 38
            if (r7 == 0) goto L_0x0f03
            java.lang.String r0 = "adjust_pan"
            java.lang.String r0 = r7.A0P(r4, r0)
            int r16 = A00(r0)
        L_0x0eca:
            if (r7 == 0) goto L_0x0f01
            r0 = 40
            X.48t r0 = r7.A0L(r0)
        L_0x0ed2:
            if (r0 == 0) goto L_0x0eff
            X.929 r13 = new X.929
            r13.<init>(r1, r0, r6)
        L_0x0ed9:
            android.app.Activity r10 = A01(r1)
            X.03q r10 = (X.C003203q) r10
            r0 = 13647(0x354f, float:1.9124E-41)
            boolean r4 = X.AnonymousClass000.A1U(r5, r0)
            r0 = 43
            if (r4 != 0) goto L_0x0ef3
            r0 = 13784(0x35d8, float:1.9315E-41)
            boolean r0 = X.AnonymousClass000.A1U(r5, r0)
            if (r0 == 0) goto L_0x0f06
            r0 = 38
        L_0x0ef3:
            X.84O r0 = r2.A0K(r0)
            X.7r0 r12 = X.AnonymousClass7r0.A00(r1, r0)
            X.AnonymousClass0VD.A02(r9, r10, r11, r12, r13, r14, r15, r16)
            return r3
        L_0x0eff:
            r13 = r3
            goto L_0x0ed9
        L_0x0f01:
            r0 = r3
            goto L_0x0ed2
        L_0x0f03:
            r16 = 32
            goto L_0x0eca
        L_0x0f06:
            java.lang.String r0 = "screen should be an instance of BloksScreenData or BloksScreenV2Data"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0f0d:
            java.lang.String r0 = "screen should be an instance of BloksScreenData or BloksScreenV2Data"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0f14:
            java.util.List r4 = r9.A00
            java.lang.String r6 = X.AnonymousClass001.A0n(r4, r6)
            java.util.Map r2 = X.AnonymousClass6C9.A0k(r4, r5)
            java.lang.Object r5 = r4.get(r0)
            android.app.Activity r4 = A01(r1)
            java.util.HashMap r1 = A09(r2)
            java.lang.String r0 = "params"
            java.lang.String r2 = X.C18320x8.A0e(r0, r1)
            r1 = 5
            X.92U r0 = new X.92U
            r0.<init>(r5, r1)
            r15.BgL(r4, r0, r6, r2)
            return r3
        L_0x0f3a:
            java.util.List r0 = r9.A00
            java.lang.String r4 = X.AnonymousClass001.A0n(r0, r6)
            java.lang.String r2 = X.AnonymousClass001.A0n(r0, r5)
            android.app.Activity r0 = A01(r1)
            r15.Bjc(r0, r4, r2)
            return r3
        L_0x0f4c:
            java.util.List r1 = r9.A00
            int r7 = X.AnonymousClass000.A09(r1, r6)
            int r8 = X.AnonymousClass000.A09(r1, r5)
            int r9 = X.AnonymousClass000.A09(r1, r0)
            java.util.Map r6 = X.AnonymousClass6C9.A0k(r1, r2)
            r4 = r15
            r5 = r3
            r4.Bhq(r5, r6, r7, r8, r9)
            return r3
        L_0x0f64:
            java.util.List r0 = r9.A00
            java.lang.Object r0 = r0.get(r5)
            boolean r4 = X.AnonymousClass001.A1Z(r0)
            android.app.Activity r2 = A01(r1)
            r1 = 6
            X.92U r0 = new X.92U
            r0.<init>(r9, r1)
            r15.Bhl(r2, r0, r4)
            return r3
        L_0x0f7c:
            java.util.List r2 = r9.A00
            X.84O r2 = X.AnonymousClass6C9.A0V(r2, r6)
            X.7bI r0 = X.AnonymousClass8DI.A06(r1, r9, r0)
            android.app.AlertDialog$Builder r0 = r7.A0C(r0, r1, r2)
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            return r3
        L_0x0f92:
            java.util.List r2 = r9.A00
            java.lang.String r6 = X.AnonymousClass001.A0n(r2, r6)
            X.8DF r5 = X.C155787fV.A02(r2, r5)
            X.8DF r4 = X.C155787fV.A02(r2, r0)
            X.2Jg r2 = new X.2Jg
            r2.<init>()
            r2.A01 = r5
            r2.A00 = r1
            X.2Jg r0 = new X.2Jg
            r0.<init>()
            r0.A01 = r4
            r0.A00 = r1
            r15.Bs8(r2, r0, r6)
            return r3
        L_0x0fb6:
            java.lang.String r2 = X.C157967jD.A01(r9, r6)
            android.app.Activity r0 = A01(r1)
            r15.Bg2(r0, r2)
            return r3
        L_0x0fc2:
            java.util.List r0 = r9.A00
            int r1 = X.AnonymousClass000.A09(r0, r6)
            int r0 = X.AnonymousClass000.A09(r0, r5)
            r15.Bhw(r1, r0)
            return r3
        L_0x0fd0:
            java.util.List r7 = r9.A00
            int r6 = X.AnonymousClass000.A09(r7, r6)
            int r4 = X.AnonymousClass000.A09(r7, r5)
            java.lang.String r1 = X.AnonymousClass001.A0n(r7, r0)
            java.util.Map r0 = X.AnonymousClass6C9.A0k(r7, r2)
            r15.Bhx(r1, r0, r6, r4)
            return r3
        L_0x0fe6:
            java.lang.String r2 = X.C157967jD.A01(r9, r6)
            android.app.Activity r0 = A01(r1)
            r15.Bo0(r0, r2)
            return r3
        L_0x0ff2:
            java.util.List r0 = r9.A00
            java.lang.String r4 = X.AnonymousClass001.A0n(r0, r6)
            java.lang.String r2 = X.AnonymousClass001.A0n(r0, r5)
            android.app.Activity r0 = A01(r1)
            r15.Bg4(r0, r4, r2)
            return r3
        L_0x1004:
            java.util.List r4 = r9.A00
            int r2 = X.AnonymousClass000.A09(r4, r6)
            int r1 = X.AnonymousClass000.A09(r4, r5)
            java.lang.String r0 = X.AnonymousClass001.A0n(r4, r0)
            r15.Bht(r2, r1, r0)
            return r3
        L_0x1016:
            java.lang.String r2 = X.C157967jD.A01(r9, r6)
            android.app.Activity r0 = A01(r1)
            r15.BgC(r0, r2)
            return r3
        L_0x1022:
            java.util.List r0 = r9.A00
            java.util.Map r2 = X.AnonymousClass6C9.A0k(r0, r6)
            android.app.Activity r0 = A01(r1)
            if (r2 == 0) goto L_0x1031
            A09(r2)
        L_0x1031:
            r0.onBackPressed()
            return r3
        L_0x1035:
            java.util.List r0 = r9.A00
            X.8DF r2 = X.C155787fV.A02(r0, r6)
            android.app.Activity r1 = A01(r1)
            X.91l r0 = new X.91l
            r0.<init>(r2, r4)
            r15.B1o(r1, r0)
            return r3
        L_0x1048:
            java.lang.String r0 = X.C157967jD.A01(r9, r6)
            r15.Bqu(r0)
            return r3
        L_0x1050:
            java.util.List r0 = r9.A00
            java.lang.String r4 = X.AnonymousClass001.A0n(r0, r6)
            java.lang.String r2 = X.AnonymousClass001.A0n(r0, r5)
            android.app.Activity r0 = A01(r1)
            r15.Bjf(r0, r4, r2)
            return r3
        L_0x1062:
            java.util.List r0 = r9.A00
            java.lang.String r6 = X.AnonymousClass001.A0n(r0, r6)
            java.lang.Object r0 = r0.get(r5)
            boolean r4 = X.AnonymousClass001.A1Z(r0)
            X.7bI r0 = r1.A00
            X.2dA r0 = r0.A02
            android.util.SparseArray r2 = r0.A00()
            r0 = 2131428057(0x7f0b02d9, float:1.8477748E38)
            java.lang.Object r2 = r2.get(r0)
            android.app.ProgressDialog r2 = (android.app.ProgressDialog) r2
            android.app.Activity r0 = A01(r1)
            r15.Bp7(r0, r2, r6, r4)
            return r3
        L_0x1089:
            java.util.List r0 = r9.A00
            X.84O r0 = X.AnonymousClass6C9.A0V(r0, r6)
            r4 = 36
            java.lang.Object r6 = X.AnonymousClass84O.A05(r0, r4)
            java.lang.String r6 = (java.lang.String) r6
            r2 = 35
            X.84O r0 = r0.A0K(r2)
            if (r0 == 0) goto L_0x10bb
            java.lang.Object r5 = X.AnonymousClass84O.A05(r0, r4)
            java.lang.String r5 = (java.lang.String) r5
            X.48t r4 = r0.A0L(r2)
        L_0x10a9:
            if (r4 == 0) goto L_0x10b9
            r0 = 1
            X.91l r2 = new X.91l
            r2.<init>(r4, r0)
        L_0x10b1:
            android.app.Activity r0 = A01(r1)
            r15.BpF(r0, r2, r6, r5)
            return r3
        L_0x10b9:
            r2 = r3
            goto L_0x10b1
        L_0x10bb:
            r4 = r3
            r5 = r3
            goto L_0x10a9
        L_0x10be:
            java.util.List r7 = r9.A00
            java.lang.String r16 = X.AnonymousClass001.A0n(r7, r6)
            int r19 = X.AnonymousClass000.A09(r7, r5)
            int r20 = X.AnonymousClass000.A09(r7, r0)
            java.util.Map r1 = X.AnonymousClass6C9.A0k(r7, r2)
            int r21 = X.AnonymousClass000.A09(r7, r4)
            r0 = 5
            java.lang.Object r0 = r7.get(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.HashMap r18 = A09(r1)
            r17 = r0
            r15.BlP(r16, r17, r18, r19, r20, r21)
            return r3
        L_0x10e5:
            java.util.List r1 = r9.A00
            int r4 = X.AnonymousClass000.A09(r1, r6)
            int r2 = X.AnonymousClass000.A09(r1, r5)
            java.lang.Object r1 = r1.get(r0)
            X.92U r0 = new X.92U
            r0.<init>(r1, r5)
            r15.Bhs(r0, r3, r4, r2)
            return r3
        L_0x10fc:
            java.util.List r0 = r9.A00
            int r6 = X.AnonymousClass000.A09(r0, r6)
            java.util.Map r0 = X.AnonymousClass6C9.A0k(r0, r5)
            android.app.Activity r5 = A01(r1)
            if (r0 == 0) goto L_0x1126
            java.util.HashMap r4 = A09(r0)
        L_0x1110:
            r2 = 0
            if (r6 == 0) goto L_0x1114
            r2 = -1
        L_0x1114:
            android.content.Intent r1 = r5.getIntent()
            if (r4 == 0) goto L_0x111f
            java.lang.String r0 = "finish_activity_result"
            r1.putExtra(r0, r4)
        L_0x111f:
            r5.setResult(r2, r1)
            r5.finish()
            return r3
        L_0x1126:
            r4 = r3
            goto L_0x1110
        L_0x1128:
            java.lang.Object r7 = X.C157967jD.A00(r9, r1)
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext"
            X.C162457s7.A0K(r7, r4)
            X.7bI r7 = (X.C153427bI) r7
            java.lang.Object r8 = r9.A04(r5)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            X.C162457s7.A0K(r8, r4)
            java.util.List r5 = r9.A00
            X.8DF r4 = A05(r5, r0)
            X.8DF r0 = A05(r5, r2)
            X.7TX r6 = new X.7TX
            r6.<init>(r7, r1, r4, r0)
            X.7bI r0 = r1.A00
            if (r0 == 0) goto L_0x1178
            android.content.Context r5 = r0.A00
            if (r5 == 0) goto L_0x1178
            android.content.pm.PackageManager r7 = r5.getPackageManager()
            if (r7 == 0) goto L_0x1178
            java.lang.String r0 = "front"
            boolean r4 = r0.equals(r8)
            java.lang.String r0 = "android.hardware.camera.front"
            boolean r2 = r7.hasSystemFeature(r0)
            java.lang.String r0 = "android.hardware.camera"
            boolean r0 = r7.hasSystemFeature(r0)
            if (r4 == 0) goto L_0x1175
            if (r2 != 0) goto L_0x117b
        L_0x116f:
            X.6w5 r0 = X.C141756w5.NOT_AVAILABLE
        L_0x1171:
            r6.A00(r0)
            return r3
        L_0x1175:
            if (r0 != 0) goto L_0x117b
            goto L_0x116f
        L_0x1178:
            X.6w5 r0 = X.C141756w5.INTERNAL_ERROR
            goto L_0x1171
        L_0x117b:
            android.app.Activity r4 = A01(r1)
            X.C162457s7.A0D(r4)
            java.lang.String r2 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String r0 = "android.permission.CAMERA"
            java.lang.String[] r1 = new java.lang.String[]{r0, r2, r1}
            X.8Ez r0 = new X.8Ez
            r0.<init>(r4, r5, r6, r15)
            r15.Bjn(r4, r0, r1)
            return r3
        L_0x1195:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L_0x119e:
            X.7bI r0 = X.AnonymousClass8DI.A06(r1, r9, r0)
            java.lang.Object r3 = X.AnonymousClass8DI.A0F(r0)
            return r3
        L_0x11a7:
            java.lang.String r3 = r15.BBJ()
            return r3
        L_0x11ac:
            java.util.Map r3 = r15.B4m()
            return r3
        L_0x11b1:
            java.lang.Object r3 = com.bloks.actions.cds.bkactioncdsupdatebackbuttonoverride.BKBloksActionCdsUpdateBackButtonOverrideImpl.evaluate(r9, r1)
            return r3
        L_0x11b6:
            java.util.List r8 = r9.A00
            java.lang.String r2 = X.AnonymousClass001.A0n(r8, r6)
            r6 = 0
            long r3 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x11c6 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            goto L_0x11d1
        L_0x11c6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NumberUtil/Invalid long value:"
            X.C18260x0.A0r(r0, r2, r1)
            r3 = 0
        L_0x11d1:
            java.lang.String r2 = X.AnonymousClass001.A0n(r8, r5)
            long r0 = r15.B6Z()
            long r3 = r3 - r0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x1231
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1074026988: goto L_0x11ee;
                case -906279820: goto L_0x1200;
                case 3208676: goto L_0x1212;
                default: goto L_0x11e9;
            }
        L_0x11e9:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            return r3
        L_0x11ee:
            java.lang.String r0 = "minute"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x11e9
            double r2 = r1.doubleValue()
            r0 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
            goto L_0x1223
        L_0x1200:
            java.lang.String r0 = "second"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x11e9
            double r2 = r1.doubleValue()
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            goto L_0x1223
        L_0x1212:
            java.lang.String r0 = "hour"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x11e9
            double r2 = r1.doubleValue()
            r0 = 4704985352480227328(0x414b774000000000, double:3600000.0)
        L_0x1223:
            double r2 = r2 / r0
            double r0 = java.lang.Math.ceil(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            long r3 = r0.longValue()
            goto L_0x11e9
        L_0x1231:
            r0 = -1
            java.lang.String r3 = java.lang.String.valueOf(r0)
            return r3
        L_0x1238:
            java.util.List r0 = r9.A00
            java.lang.String r3 = X.AnonymousClass001.A0n(r0, r6)
            java.lang.Object r2 = r0.get(r5)
            java.util.AbstractList r2 = (java.util.AbstractList) r2
            int r0 = r2.size()
            java.lang.String[] r1 = new java.lang.String[r0]
        L_0x124a:
            int r0 = r2.size()
            if (r6 >= r0) goto L_0x1259
            java.lang.Object r0 = r2.get(r6)
            r1[r6] = r0
            int r6 = r6 + 1
            goto L_0x124a
        L_0x1259:
            java.lang.String r3 = java.text.MessageFormat.format(r3, r1)
            return r3
        L_0x125e:
            java.lang.String r3 = X.C157967jD.A01(r9, r6)
            java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x1266 }
            goto L_0x126f
        L_0x1266:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NumberUtil/Invalid long value:"
            X.C18260x0.A0r(r0, r3, r2)
        L_0x126f:
            A01(r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            return r3
        L_0x1277:
            java.util.List r7 = r9.A00
            java.lang.String r4 = X.AnonymousClass001.A0n(r7, r6)
            int r3 = X.AnonymousClass002.A04(r7, r5)
            java.lang.String[] r2 = new java.lang.String[r3]
        L_0x1283:
            if (r6 >= r3) goto L_0x128f
            int r1 = r6 + 1
            java.lang.Object r0 = r7.get(r1)
            r2[r6] = r0
            r6 = r1
            goto L_0x1283
        L_0x128f:
            java.lang.String r3 = java.text.MessageFormat.format(r4, r2)
            return r3
        L_0x1294:
            java.util.List r0 = r9.A00
            java.lang.String r1 = X.AnonymousClass001.A0n(r0, r6)
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r5)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            boolean r0 = X.C18280x3.A1X(r1, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x12ab:
            java.util.List r0 = r9.A00
            int r1 = X.AnonymousClass000.A09(r0, r6)
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r5)
            java.lang.String r3 = r15.B41(r1, r0)
            return r3
        L_0x12ba:
            java.lang.Long r3 = X.AnonymousClass0x2.A0T()
            return r3
        L_0x12bf:
            java.lang.String r3 = "CONSUMER"
            return r3
        L_0x12c2:
            java.util.List r7 = r9.A00
            java.lang.String r9 = X.AnonymousClass001.A0n(r7, r6)
            java.util.Map r4 = X.AnonymousClass6C9.A0k(r7, r5)
            X.8DF r6 = X.C155787fV.A02(r7, r0)
            X.8DF r5 = X.C155787fV.A02(r7, r2)
            java.util.HashMap r10 = A09(r4)
            r0 = 6
            X.91l r4 = new X.91l
            r4.<init>(r6, r0)
            r2 = 7
            X.91l r0 = new X.91l
            r0.<init>(r5, r2)
            r5 = r15
            r6 = r4
            r7 = r0
            r8 = r1
            r5.AxL(r6, r7, r8, r9, r10)
            return r3
        L_0x12ec:
            java.util.List r7 = r9.A00
            java.lang.String r9 = X.AnonymousClass001.A0n(r7, r6)
            java.util.Map r4 = X.AnonymousClass6C9.A0k(r7, r5)
            X.8DF r6 = X.C155787fV.A02(r7, r0)
            X.8DF r5 = X.C155787fV.A02(r7, r2)
            java.util.HashMap r10 = A09(r4)
            r0 = 8
            X.91l r4 = new X.91l
            r4.<init>(r6, r0)
            r2 = 9
            X.91l r0 = new X.91l
            r0.<init>(r5, r2)
            r5 = r15
            r6 = r4
            r7 = r0
            r8 = r1
            r5.AxK(r6, r7, r8, r9, r10)
            return r3
        L_0x1318:
            java.lang.String r0 = "Cannot unwind without an existing bottom sheet."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x131f:
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r2, r2)     // Catch:{ NullPointerException | SecurityException -> 0x1327 }
            r1.setPrimaryClip(r0)     // Catch:{ NullPointerException | SecurityException -> 0x1327 }
            return r3
        L_0x1327:
            java.lang.String r0 = "bkinterpreter/clipboard/"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        L_0x132d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WaExtensions/GetChildNode Cannot find the child node ["
            goto L_0x133a
        L_0x1334:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WaExtensions/GetChildNode Cannot find the attribute ["
        L_0x133a:
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "] on a null or empty parent node"
            X.C18260x0.A1J(r1, r0)
            return r3
        L_0x1346:
            return r3
        L_0x1347:
            return r3
        L_0x1348:
            return r3
        L_0x1349:
            return r3
        L_0x134a:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x1360 }
            goto L_0x1364
        L_0x134f:
            X.0GF r0 = X.AnonymousClass0GF.INTERNAL_ERROR     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            r2.A00(r0)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            return r3
        L_0x1355:
            X.0GF r0 = X.AnonymousClass0GF.INVALID_PARAMETER     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            r2.A00(r0)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            return r3
        L_0x135b:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x1360 }
            goto L_0x1364
        L_0x1360:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
        L_0x1364:
            throw r1     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
        L_0x1365:
            X.0GF r0 = X.AnonymousClass0GF.INVALID_PARAMETER     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            r2.A00(r0)     // Catch:{ FileNotFoundException -> 0x136e, IOException -> 0x1371, SecurityException -> 0x136b }
            return r3
        L_0x136b:
            X.0GF r0 = X.AnonymousClass0GF.INVALID_PARAMETER
            goto L_0x1373
        L_0x136e:
            X.0GF r0 = X.AnonymousClass0GF.FILE_NOT_FOUND
            goto L_0x1373
        L_0x1371:
            X.0GF r0 = X.AnonymousClass0GF.INTERNAL_ERROR
        L_0x1373:
            r2.A00(r0)
            return r3
        L_0x1377:
            java.lang.String r3 = "0"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8DJ.B2m(X.7jD, X.7Bp, X.7Tp):java.lang.Object");
    }
}
