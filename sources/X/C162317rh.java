package X;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.7rh  reason: invalid class name and case insensitive filesystem */
public final class C162317rh {
    public static final HashMap A00 = AnonymousClass001.A0t();
    public static final Pattern A01 = Pattern.compile("^\\D?(\\d+)$");

    public static void A05(String str) {
        String str2;
        try {
            A03(str, false);
            return;
        } catch (C143126yN e) {
            e = e;
            str2 = "Codec warming failed";
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
            str2 = "Codec warming failed with UnsatisfiedLinkError";
        }
        Log.e("MediaCodecUtil", str2, e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x018d, code lost:
        if (r1.equals(r0) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x018f, code lost:
        r6 = r11.A0N;
        r7 = "Ignoring malformed HEVC codec string: ";
        r4 = "MediaCodecUtil";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0197, code lost:
        if (r5.length < 4) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0199, code lost:
        r2 = 1;
        r1 = A01.matcher(r5[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01a6, code lost:
        if (r1.matches() == false) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01a8, code lost:
        r3 = r1.group(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b2, code lost:
        if ("1".equals(r3) != false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01ba, code lost:
        if ("2".equals(r3) == false) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01bc, code lost:
        if (r6 == null) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01be, code lost:
        r1 = r6.A03;
        r2 = com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01c3, code lost:
        if (r1 == 6) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01c5, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c6, code lost:
        r3 = r5[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01c9, code lost:
        if (r3 == null) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01d6, code lost:
        switch(r3.hashCode()) {
            case 70821: goto L_0x030e;
            case 70914: goto L_0x0301;
            case 70917: goto L_0x02f2;
            case 71007: goto L_0x02e7;
            case 71010: goto L_0x02dc;
            case 74665: goto L_0x02cf;
            case 74758: goto L_0x02c2;
            case 74761: goto L_0x02b5;
            case 74851: goto L_0x02aa;
            case 74854: goto L_0x029f;
            case 2193639: goto L_0x0294;
            case 2193642: goto L_0x0289;
            case 2193732: goto L_0x027d;
            case 2193735: goto L_0x0271;
            case 2193738: goto L_0x0265;
            case 2193825: goto L_0x0259;
            case 2193828: goto L_0x024d;
            case 2193831: goto L_0x0241;
            case 2312803: goto L_0x0235;
            case 2312806: goto L_0x0229;
            case 2312896: goto L_0x021d;
            case 2312899: goto L_0x0211;
            case 2312902: goto L_0x0205;
            case 2312989: goto L_0x01f9;
            case 2312992: goto L_0x01ed;
            case 2312995: goto L_0x01e1;
            default: goto L_0x01d9;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01d9, code lost:
        r5 = X.AnonymousClass001.A0o();
        r0 = "Unknown HEVC level string: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01e7, code lost:
        if (r3.equals("L186") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01e9, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01f3, code lost:
        if (r3.equals("L183") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01f5, code lost:
        r0 = 4194304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01ff, code lost:
        if (r3.equals("L180") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0201, code lost:
        r0 = 1048576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x020b, code lost:
        if (r3.equals("L156") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x020d, code lost:
        r0 = 262144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0217, code lost:
        if (r3.equals("L153") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0219, code lost:
        r0 = 65536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0223, code lost:
        if (r3.equals("L150") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0225, code lost:
        r0 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x022f, code lost:
        if (r3.equals("L123") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0231, code lost:
        r0 = com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x023b, code lost:
        if (r3.equals("L120") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x023d, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0247, code lost:
        if (r3.equals("H186") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0249, code lost:
        r0 = 33554432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0253, code lost:
        if (r3.equals("H183") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0255, code lost:
        r0 = 8388608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x025f, code lost:
        if (r3.equals("H180") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0261, code lost:
        r0 = 2097152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x026b, code lost:
        if (r3.equals("H156") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x026d, code lost:
        r0 = 524288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0277, code lost:
        if (r3.equals("H153") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0279, code lost:
        r0 = X.AnonymousClass35S.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0283, code lost:
        if (r3.equals("H150") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0285, code lost:
        r0 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x028f, code lost:
        if (r3.equals("H123") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0291, code lost:
        r0 = com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x029a, code lost:
        if (r3.equals("H120") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x029c, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02a5, code lost:
        if (r3.equals("L93") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02a7, code lost:
        r0 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02b0, code lost:
        if (r3.equals("L90") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02b2, code lost:
        r0 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02bb, code lost:
        if (r3.equals("L63") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02bd, code lost:
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02c8, code lost:
        if (r3.equals("L60") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02ca, code lost:
        r1 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02d5, code lost:
        if (r3.equals("L30") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02d7, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02e2, code lost:
        if (r3.equals("H93") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02e4, code lost:
        r0 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x02ed, code lost:
        if (r3.equals("H90") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x02ef, code lost:
        r0 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x02f8, code lost:
        if (r3.equals("H63") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x02fa, code lost:
        r0 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x02fc, code lost:
        r1 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0307, code lost:
        if (r3.equals("H60") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0309, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0314, code lost:
        if (r3.equals("H30") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0316, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x031a, code lost:
        if (r1 == null) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0324, code lost:
        return X.AnonymousClass0x9.A0C(java.lang.Integer.valueOf(r2), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0325, code lost:
        r5 = X.AnonymousClass001.A0o();
        r0 = "Unknown HEVC profile string: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x03e1, code lost:
        if (r1.equals(r0) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x03e3, code lost:
        r9 = r5.length;
        r4 = "MediaCodecUtil";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x03e9, code lost:
        if (r9 >= 2) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x03eb, code lost:
        r1 = X.AnonymousClass000.A0m("Ignoring malformed AVC codec string: ", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:?, code lost:
        r2 = r5[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x03f9, code lost:
        if (r2.length() != 6) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x03fb, code lost:
        r9 = java.lang.Integer.parseInt(X.AnonymousClass0x7.A0r(r2, 2), 16);
        r2 = java.lang.Integer.parseInt(r5[1].substring(4), 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0412, code lost:
        if (r9 < 3) goto L_0x0438;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0414, code lost:
        r9 = java.lang.Integer.parseInt(r2);
        r2 = X.AnonymousClass6CA.A0F(r5, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x041c, code lost:
        r3 = X.AnonymousClass6C8.A0s(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0421, code lost:
        if (r3 != -1) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0423, code lost:
        r1 = X.AnonymousClass001.A0o();
        r0 = "Unknown AVC profile: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x042b, code lost:
        r1 = X.AnonymousClass6C8.A05(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x042f, code lost:
        if (r1 != -1) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0431, code lost:
        r1 = X.AnonymousClass001.A0o();
        r0 = "Unknown AVC level: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        android.util.Log.w(r4, X.AnonymousClass000.A0T("Ignoring malformed AVC codec string: ", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0441, code lost:
        r0 = X.AnonymousClass000.A0l("Ignoring malformed AVC codec string: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x048a, code lost:
        r1.append(r0);
        r1.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x04b0, code lost:
        r1.append(r0);
        r1.append(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x04c5, code lost:
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x04cf, code lost:
        r2 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x04d4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x04d9, code lost:
        r0 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x04e1, code lost:
        return X.AnonymousClass0x9.A0C(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        r2 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        if (r2 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c8, code lost:
        r3 = r5[2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ca, code lost:
        if (r3 == null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d0, code lost:
        switch(r3.hashCode()) {
            case 1537: goto L_0x0169;
            case 1538: goto L_0x015c;
            case 1539: goto L_0x014f;
            case 1540: goto L_0x0142;
            case 1541: goto L_0x0133;
            case 1542: goto L_0x0128;
            case 1543: goto L_0x011d;
            case 1544: goto L_0x0112;
            case 1545: goto L_0x0107;
            case 1567: goto L_0x00fc;
            case 1568: goto L_0x00f1;
            case 1569: goto L_0x00e6;
            case 1570: goto L_0x00db;
            default: goto L_0x00d3;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d3, code lost:
        r5 = X.AnonymousClass001.A0o();
        r0 = "Unknown Dolby Vision level string: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e1, code lost:
        if (r3.equals("13") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e3, code lost:
        r0 = com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ec, code lost:
        if (r3.equals("12") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ee, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f7, code lost:
        if (r3.equals("11") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f9, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0102, code lost:
        if (r3.equals("10") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0104, code lost:
        r0 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010d, code lost:
        if (r3.equals("09") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010f, code lost:
        r0 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0118, code lost:
        if (r3.equals("08") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011a, code lost:
        r0 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0123, code lost:
        if (r3.equals("07") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0125, code lost:
        r0 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012e, code lost:
        if (r3.equals("06") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0130, code lost:
        r0 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0139, code lost:
        if (r3.equals("05") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013b, code lost:
        r0 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x013d, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0148, code lost:
        if (r3.equals("04") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x014a, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0155, code lost:
        if (r3.equals("03") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0157, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0162, code lost:
        if (r3.equals("02") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0164, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016f, code lost:
        if (r3.equals("01") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0171, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0175, code lost:
        if (r0 != null) goto L_0x04dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A00(X.C166637z1 r11) {
        /*
            java.lang.String r3 = r11.A0O
            r10 = 0
            if (r3 == 0) goto L_0x004c
            java.lang.String r0 = "\\."
            java.lang.String[] r5 = r3.split(r0)
            java.lang.String r1 = "video/dolby-vision"
            java.lang.String r0 = r11.A0S
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0179
            int r1 = r5.length
            r0 = 3
            java.lang.String r7 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r4 = "MediaCodecUtil"
            if (r1 < r0) goto L_0x032d
            java.util.regex.Pattern r2 = A01
            r1 = 1
            r0 = r5[r1]
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r0 = r2.matches()
            if (r0 == 0) goto L_0x032d
            java.lang.String r3 = r2.group(r1)
            if (r3 == 0) goto L_0x003d
            int r0 = r3.hashCode()
            r8 = 8
            r7 = 4
            r6 = 2
            switch(r0) {
                case 1536: goto L_0x00ba;
                case 1537: goto L_0x00ad;
                case 1538: goto L_0x00a0;
                case 1539: goto L_0x0093;
                case 1540: goto L_0x0084;
                case 1541: goto L_0x0079;
                case 1542: goto L_0x006e;
                case 1543: goto L_0x0063;
                case 1544: goto L_0x0058;
                case 1545: goto L_0x004d;
                default: goto L_0x003d;
            }
        L_0x003d:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown Dolby Vision profile string: "
        L_0x0043:
            r5.append(r0)
        L_0x0046:
            r5.append(r3)
        L_0x0049:
            X.AnonymousClass6C7.A1A(r5, r4)
        L_0x004c:
            return r10
        L_0x004d:
            java.lang.String r0 = "09"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x008e
        L_0x0058:
            java.lang.String r0 = "08"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x008e
        L_0x0063:
            java.lang.String r0 = "07"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x008e
        L_0x006e:
            java.lang.String r0 = "06"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 64
            goto L_0x008e
        L_0x0079:
            java.lang.String r0 = "05"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 32
            goto L_0x008e
        L_0x0084:
            java.lang.String r0 = "04"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 16
        L_0x008e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x00c6
        L_0x0093:
            java.lang.String r0 = "03"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x00c6
        L_0x00a0:
            java.lang.String r0 = "02"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x00c6
        L_0x00ad:
            java.lang.String r0 = "01"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto L_0x00c6
        L_0x00ba:
            java.lang.String r0 = "00"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L_0x00c6:
            if (r2 == 0) goto L_0x003d
            r3 = r5[r6]
            if (r3 == 0) goto L_0x00d3
            int r0 = r3.hashCode()
            switch(r0) {
                case 1537: goto L_0x0169;
                case 1538: goto L_0x015c;
                case 1539: goto L_0x014f;
                case 1540: goto L_0x0142;
                case 1541: goto L_0x0133;
                case 1542: goto L_0x0128;
                case 1543: goto L_0x011d;
                case 1544: goto L_0x0112;
                case 1545: goto L_0x0107;
                case 1567: goto L_0x00fc;
                case 1568: goto L_0x00f1;
                case 1569: goto L_0x00e6;
                case 1570: goto L_0x00db;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown Dolby Vision level string: "
            goto L_0x0043
        L_0x00db:
            java.lang.String r0 = "13"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x013d
        L_0x00e6:
            java.lang.String r0 = "12"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x013d
        L_0x00f1:
            java.lang.String r0 = "11"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x013d
        L_0x00fc:
            java.lang.String r0 = "10"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x013d
        L_0x0107:
            java.lang.String r0 = "09"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x013d
        L_0x0112:
            java.lang.String r0 = "08"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x013d
        L_0x011d:
            java.lang.String r0 = "07"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 64
            goto L_0x013d
        L_0x0128:
            java.lang.String r0 = "06"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 32
            goto L_0x013d
        L_0x0133:
            java.lang.String r0 = "05"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 16
        L_0x013d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0175
        L_0x0142:
            java.lang.String r0 = "04"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x0175
        L_0x014f:
            java.lang.String r0 = "03"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            goto L_0x0175
        L_0x015c:
            java.lang.String r0 = "02"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L_0x0175
        L_0x0169:
            java.lang.String r0 = "01"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0175:
            if (r0 != 0) goto L_0x04dd
            goto L_0x00d3
        L_0x0179:
            r0 = 0
            r1 = r5[r0]
            int r0 = r1.hashCode()
            switch(r0) {
                case 3004662: goto L_0x0446;
                case 3006243: goto L_0x03db;
                case 3006244: goto L_0x03d8;
                case 3199032: goto L_0x0187;
                case 3214780: goto L_0x0184;
                case 3356560: goto L_0x0333;
                case 3624515: goto L_0x037a;
                default: goto L_0x0183;
            }
        L_0x0183:
            return r10
        L_0x0184:
            java.lang.String r0 = "hvc1"
            goto L_0x0189
        L_0x0187:
            java.lang.String r0 = "hev1"
        L_0x0189:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            X.7z0 r6 = r11.A0N
            int r1 = r5.length
            r0 = 4
            java.lang.String r7 = "Ignoring malformed HEVC codec string: "
            java.lang.String r4 = "MediaCodecUtil"
            if (r1 < r0) goto L_0x032d
            java.util.regex.Pattern r1 = A01
            r2 = 1
            r0 = r5[r2]
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L_0x032d
            java.lang.String r3 = r1.group(r2)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x01c6
            java.lang.String r0 = "2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0325
            if (r6 == 0) goto L_0x01c5
            int r1 = r6.A03
            r0 = 6
            r2 = 4096(0x1000, float:5.74E-42)
            if (r1 == r0) goto L_0x01c6
        L_0x01c5:
            r2 = 2
        L_0x01c6:
            r0 = 3
            r3 = r5[r0]
            if (r3 == 0) goto L_0x01d9
            int r0 = r3.hashCode()
            r8 = 16
            r7 = 8
            r6 = 4
            r5 = 2
            r1 = 1
            switch(r0) {
                case 70821: goto L_0x030e;
                case 70914: goto L_0x0301;
                case 70917: goto L_0x02f2;
                case 71007: goto L_0x02e7;
                case 71010: goto L_0x02dc;
                case 74665: goto L_0x02cf;
                case 74758: goto L_0x02c2;
                case 74761: goto L_0x02b5;
                case 74851: goto L_0x02aa;
                case 74854: goto L_0x029f;
                case 2193639: goto L_0x0294;
                case 2193642: goto L_0x0289;
                case 2193732: goto L_0x027d;
                case 2193735: goto L_0x0271;
                case 2193738: goto L_0x0265;
                case 2193825: goto L_0x0259;
                case 2193828: goto L_0x024d;
                case 2193831: goto L_0x0241;
                case 2312803: goto L_0x0235;
                case 2312806: goto L_0x0229;
                case 2312896: goto L_0x021d;
                case 2312899: goto L_0x0211;
                case 2312902: goto L_0x0205;
                case 2312989: goto L_0x01f9;
                case 2312992: goto L_0x01ed;
                case 2312995: goto L_0x01e1;
                default: goto L_0x01d9;
            }
        L_0x01d9:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown HEVC level string: "
            goto L_0x0043
        L_0x01e1:
            java.lang.String r0 = "L186"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            goto L_0x02fc
        L_0x01ed:
            java.lang.String r0 = "L183"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x02fc
        L_0x01f9:
            java.lang.String r0 = "L180"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x02fc
        L_0x0205:
            java.lang.String r0 = "L156"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 262144(0x40000, float:3.67342E-40)
            goto L_0x02fc
        L_0x0211:
            java.lang.String r0 = "L153"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 65536(0x10000, float:9.18355E-41)
            goto L_0x02fc
        L_0x021d:
            java.lang.String r0 = "L150"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x02fc
        L_0x0229:
            java.lang.String r0 = "L123"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x02fc
        L_0x0235:
            java.lang.String r0 = "L120"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x02fc
        L_0x0241:
            java.lang.String r0 = "H186"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x02fc
        L_0x024d:
            java.lang.String r0 = "H183"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x02fc
        L_0x0259:
            java.lang.String r0 = "H180"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x02fc
        L_0x0265:
            java.lang.String r0 = "H156"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 524288(0x80000, float:7.34684E-40)
            goto L_0x02fc
        L_0x0271:
            java.lang.String r0 = "H153"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x02fc
        L_0x027d:
            java.lang.String r0 = "H150"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L_0x02fc
        L_0x0289:
            java.lang.String r0 = "H123"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 8192(0x2000, float:1.14794E-41)
            goto L_0x02fc
        L_0x0294:
            java.lang.String r0 = "H120"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x02fc
        L_0x029f:
            java.lang.String r0 = "L93"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x02fc
        L_0x02aa:
            java.lang.String r0 = "L90"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 64
            goto L_0x02fc
        L_0x02b5:
            java.lang.String r0 = "L63"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            goto L_0x031a
        L_0x02c2:
            java.lang.String r0 = "L60"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            goto L_0x031a
        L_0x02cf:
            java.lang.String r0 = "L30"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x031a
        L_0x02dc:
            java.lang.String r0 = "H93"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x02fc
        L_0x02e7:
            java.lang.String r0 = "H90"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x02fc
        L_0x02f2:
            java.lang.String r0 = "H63"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            r0 = 32
        L_0x02fc:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L_0x031a
        L_0x0301:
            java.lang.String r0 = "H60"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            goto L_0x031a
        L_0x030e:
            java.lang.String r0 = "H30"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
        L_0x031a:
            if (r1 == 0) goto L_0x01d9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            android.util.Pair r10 = X.AnonymousClass0x9.A0C(r0, r1)
            return r10
        L_0x0325:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown HEVC profile string: "
            goto L_0x0043
        L_0x032d:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0l(r7)
            goto L_0x0046
        L_0x0333:
            java.lang.String r0 = "mp4a"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            int r1 = r5.length
            r0 = 3
            java.lang.String r2 = "Ignoring malformed MP4A codec string: "
            java.lang.String r4 = "MediaCodecUtil"
            if (r1 == r0) goto L_0x0349
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r2)
            goto L_0x045c
        L_0x0349:
            r0 = 1
            r1 = r5[r0]     // Catch:{ NumberFormatException -> 0x0374 }
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r1, r0)     // Catch:{ NumberFormatException -> 0x0374 }
            java.lang.String r1 = X.C162097rD.A03(r0)     // Catch:{ NumberFormatException -> 0x0374 }
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)     // Catch:{ NumberFormatException -> 0x0374 }
            if (r0 == 0) goto L_0x004c
            r0 = 2
            int r0 = X.AnonymousClass6CA.A0F(r5, r0)     // Catch:{ NumberFormatException -> 0x0374 }
            short r1 = X.AnonymousClass6C9.A0q(r0)
            r0 = -1
            if (r1 == r0) goto L_0x004c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0374 }
            r0 = 0
            android.util.Pair r10 = X.C18290x4.A0K(r1, r0)     // Catch:{ NumberFormatException -> 0x0374 }
            return r10
        L_0x0374:
            java.lang.String r0 = X.AnonymousClass000.A0T(r2, r3)
            goto L_0x0460
        L_0x037a:
            java.lang.String r0 = "vp09"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            int r1 = r5.length
            r0 = 3
            java.lang.String r2 = "Ignoring malformed VP9 codec string: "
            java.lang.String r4 = "MediaCodecUtil"
            if (r1 >= r0) goto L_0x0390
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0l(r2)
            goto L_0x0046
        L_0x0390:
            r0 = 1
            int r1 = X.AnonymousClass6CA.A0F(r5, r0)     // Catch:{ NumberFormatException -> 0x03d2 }
            r0 = 2
            r0 = r5[r0]     // Catch:{ NumberFormatException -> 0x03d2 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x03d2 }
            r0 = 1
            r3 = 1
            if (r1 == 0) goto L_0x03ab
            r3 = 2
            if (r1 == r0) goto L_0x03ab
            if (r1 == r3) goto L_0x03bc
            r0 = 3
            r3 = 8
            if (r1 == r0) goto L_0x03ab
            r3 = -1
        L_0x03ab:
            r0 = -1
            if (r3 != r0) goto L_0x03be
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown VP9 profile: "
            r5.append(r0)
            r5.append(r1)
            goto L_0x0049
        L_0x03bc:
            r3 = 4
            goto L_0x03ab
        L_0x03be:
            short r1 = X.AnonymousClass6C8.A0r(r2)
            if (r1 != r0) goto L_0x04cf
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown VP9 level: "
            r5.append(r0)
            r5.append(r2)
            goto L_0x0049
        L_0x03d2:
            java.lang.String r0 = X.AnonymousClass000.A0T(r2, r3)
            goto L_0x0460
        L_0x03d8:
            java.lang.String r0 = "avc2"
            goto L_0x03dd
        L_0x03db:
            java.lang.String r0 = "avc1"
        L_0x03dd:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            int r9 = r5.length
            java.lang.String r8 = "Ignoring malformed AVC codec string: "
            java.lang.String r4 = "MediaCodecUtil"
            r7 = 2
            if (r9 >= r7) goto L_0x03f1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r8, r3)
            goto L_0x04c5
        L_0x03f1:
            r6 = 1
            r2 = r5[r6]     // Catch:{ NumberFormatException -> 0x0441 }
            int r1 = r2.length()     // Catch:{ NumberFormatException -> 0x0441 }
            r0 = 6
            if (r1 != r0) goto L_0x0411
            java.lang.String r0 = X.AnonymousClass0x7.A0r(r2, r7)     // Catch:{ NumberFormatException -> 0x0441 }
            r2 = 16
            int r9 = java.lang.Integer.parseInt(r0, r2)     // Catch:{ NumberFormatException -> 0x0441 }
            r1 = r5[r6]     // Catch:{ NumberFormatException -> 0x0441 }
            r0 = 4
            java.lang.String r0 = r1.substring(r0)     // Catch:{ NumberFormatException -> 0x0441 }
            int r2 = java.lang.Integer.parseInt(r0, r2)     // Catch:{ NumberFormatException -> 0x0441 }
            goto L_0x041c
        L_0x0411:
            r0 = 3
            if (r9 < r0) goto L_0x0438
            int r9 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0441 }
            int r2 = X.AnonymousClass6CA.A0F(r5, r7)     // Catch:{ NumberFormatException -> 0x0441 }
        L_0x041c:
            short r3 = X.AnonymousClass6C8.A0s(r9)
            r0 = -1
            if (r3 != r0) goto L_0x042b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown AVC profile: "
            goto L_0x04b0
        L_0x042b:
            int r1 = X.AnonymousClass6C8.A05(r2)
            if (r1 != r0) goto L_0x04cf
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown AVC level: "
            goto L_0x048a
        L_0x0438:
            java.lang.String r0 = X.AnonymousClass000.A0T(r8, r3)     // Catch:{ NumberFormatException -> 0x0441 }
            android.util.Log.w(r4, r0)     // Catch:{ NumberFormatException -> 0x0441 }
            goto L_0x04d4
        L_0x0441:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r8)
            goto L_0x045c
        L_0x0446:
            java.lang.String r0 = "av01"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            X.7z0 r8 = r11.A0N
            int r1 = r5.length
            r0 = 4
            java.lang.String r2 = "Ignoring malformed AV1 codec string: "
            java.lang.String r4 = "MediaCodecUtil"
            if (r1 >= r0) goto L_0x0464
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r2)
        L_0x045c:
            java.lang.String r0 = X.AnonymousClass000.A0X(r3, r0)
        L_0x0460:
            android.util.Log.w(r4, r0)
            return r10
        L_0x0464:
            r7 = 1
            int r6 = X.AnonymousClass6CA.A0F(r5, r7)     // Catch:{ NumberFormatException -> 0x04ca }
            r1 = 2
            r0 = r5[r1]     // Catch:{ NumberFormatException -> 0x04ca }
            java.lang.String r0 = X.AnonymousClass0x7.A0r(r0, r1)     // Catch:{ NumberFormatException -> 0x04ca }
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x04ca }
            r0 = 3
            int r2 = X.AnonymousClass6CA.A0F(r5, r0)     // Catch:{ NumberFormatException -> 0x04ca }
            if (r6 == 0) goto L_0x047c
            goto L_0x04b9
        L_0x047c:
            r1 = 8
            if (r2 == r1) goto L_0x0491
            r0 = 10
            if (r2 == r0) goto L_0x0491
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown AV1 bit depth: "
        L_0x048a:
            r1.append(r0)
            r1.append(r2)
            goto L_0x04c5
        L_0x0491:
            if (r2 == r1) goto L_0x04a3
            if (r8 == 0) goto L_0x04b7
            byte[] r0 = r8.A04
            if (r0 != 0) goto L_0x04a1
            int r1 = r8.A03
            r0 = 7
            if (r1 == r0) goto L_0x04a1
            r0 = 6
            if (r1 != r0) goto L_0x04b7
        L_0x04a1:
            r7 = 4096(0x1000, float:5.74E-42)
        L_0x04a3:
            int r1 = X.AnonymousClass6C8.A09(r9)
            r0 = -1
            if (r1 != r0) goto L_0x04d5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown AV1 level: "
        L_0x04b0:
            r1.append(r0)
            r1.append(r9)
            goto L_0x04c5
        L_0x04b7:
            r7 = 2
            goto L_0x04a3
        L_0x04b9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown AV1 profile: "
            r1.append(r0)
            r1.append(r6)
        L_0x04c5:
            java.lang.String r0 = r1.toString()
            goto L_0x0460
        L_0x04ca:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r2)
            goto L_0x045c
        L_0x04cf:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L_0x04d9
        L_0x04d4:
            return r10
        L_0x04d5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
        L_0x04d9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x04dd:
            android.util.Pair r10 = X.AnonymousClass0x9.A0C(r2, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162317rh.A00(X.7z1):android.util.Pair");
    }

    public static String A01(C166637z1 r2) {
        Pair A002;
        String str = r2.A0S;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(str) || (A002 = A00(r2)) == null) {
            return null;
        }
        int A03 = C18280x3.A03(A002);
        if (A03 == 16 || A03 == 256) {
            return "video/hevc";
        }
        if (A03 == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
        if ("OMX.MTK.AUDIO.DECODER.DSPAC3".equals(r3) != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (A06(r13) == false) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x014c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b8 A[Catch:{ Exception -> 0x01a8, Exception -> 0x01e3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A02(X.AnonymousClass7VU r21, X.C185548tr r22) {
        /*
            java.lang.String r9 = "secure-playback"
            java.lang.String r8 = "tunneled-playback"
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x01e3 }
            r15 = r21
            java.lang.String r6 = r15.A00     // Catch:{ Exception -> 0x01e3 }
            r10 = r22
            int r14 = r10.B5c()     // Catch:{ Exception -> 0x01e3 }
            boolean r16 = r10.Bkx()     // Catch:{ Exception -> 0x01e3 }
            r5 = 0
        L_0x0017:
            if (r5 >= r14) goto L_0x01e2
            android.media.MediaCodecInfo r13 = r10.B5d(r5)     // Catch:{ Exception -> 0x01e3 }
            int r4 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ Exception -> 0x01e3 }
            r0 = 29
            if (r4 < r0) goto L_0x002a
            boolean r1 = A06(r13)     // Catch:{ Exception -> 0x01e3 }
            r0 = 1
            if (r1 != 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r0 != 0) goto L_0x014c
            java.lang.String r3 = r13.getName()     // Catch:{ Exception -> 0x01e3 }
            boolean r0 = r13.isEncoder()     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00b3
            if (r16 != 0) goto L_0x0042
            java.lang.String r0 = ".secure"
            boolean r0 = r3.endsWith(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x0042
            goto L_0x00b3
        L_0x0042:
            r0 = 24
            java.lang.String r1 = "samsung"
            if (r4 >= r0) goto L_0x00b5
            java.lang.String r0 = "OMX.SEC.aac.dec"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "OMX.Exynos.AAC.Decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x00a3
        L_0x0058:
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A03     // Catch:{ Exception -> 0x01e3 }
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x00a3
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A01     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r0 = "zeroflte"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "zerolte"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "zenlte"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "SC-05G"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "marinelteatt"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "404SC"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "SC-04G"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "SCV31"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x00a3
            goto L_0x00b3
        L_0x00a3:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r0 = r0.equals(r6)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x00b5
        L_0x00b3:
            r0 = 0
            goto L_0x00b6
        L_0x00b5:
            r0 = 1
        L_0x00b6:
            if (r0 == 0) goto L_0x014c
            java.lang.String[] r12 = r13.getSupportedTypes()     // Catch:{ Exception -> 0x01e3 }
            int r11 = r12.length     // Catch:{ Exception -> 0x01e3 }
            r1 = 0
        L_0x00be:
            if (r1 >= r11) goto L_0x00cb
            r2 = r12[r1]     // Catch:{ Exception -> 0x01e3 }
            boolean r0 = r2.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x012b
            int r1 = r1 + 1
            goto L_0x00be
        L_0x00cb:
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = "OMX.MS.HEVCDV.Decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x00de
            java.lang.String r2 = "video/hevcdv"
            goto L_0x012b
        L_0x00de:
            java.lang.String r0 = "OMX.RTK.video.decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = "OMX.realtek.video.decoder.tunneled"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x012a
        L_0x00ee:
            java.lang.String r2 = "video/dv_hevc"
            goto L_0x012b
        L_0x00f1:
            java.lang.String r0 = "audio/alac"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "OMX.lge.alac.decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x0104
            java.lang.String r2 = "audio/x-lg-alac"
            goto L_0x012b
        L_0x0104:
            java.lang.String r0 = "audio/flac"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x0117
            java.lang.String r0 = "OMX.lge.flac.decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x0117
            java.lang.String r2 = "audio/x-lg-flac"
            goto L_0x012b
        L_0x0117:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = "OMX.lge.ac3.decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x012a
            java.lang.String r2 = "audio/lg-ac3"
            goto L_0x012b
        L_0x012a:
            r2 = 0
        L_0x012b:
            if (r2 == 0) goto L_0x014c
            android.media.MediaCodecInfo$CodecCapabilities r1 = r13.getCapabilitiesForType(r2)     // Catch:{ Exception -> 0x01a8 }
            r10.BHa(r1, r8, r2)     // Catch:{ Exception -> 0x01a8 }
            boolean r0 = r10.BHZ(r1, r8, r2)     // Catch:{ Exception -> 0x01a8 }
            if (r0 != 0) goto L_0x014c
            boolean r12 = r10.BHa(r1, r9, r2)     // Catch:{ Exception -> 0x01a8 }
            boolean r0 = r10.BHZ(r1, r9, r2)     // Catch:{ Exception -> 0x01a8 }
            boolean r11 = r15.A01     // Catch:{ Exception -> 0x01a8 }
            if (r11 != 0) goto L_0x0148
            if (r0 != 0) goto L_0x014c
        L_0x0148:
            if (r11 == 0) goto L_0x0150
            if (r12 != 0) goto L_0x0150
        L_0x014c:
            int r5 = r5 + 1
            goto L_0x0017
        L_0x0150:
            r0 = 29
            if (r4 < r0) goto L_0x0155
            goto L_0x015c
        L_0x0155:
            boolean r0 = A09(r13, r6)     // Catch:{ Exception -> 0x01a8 }
            r20 = r0 ^ 1
            goto L_0x0160
        L_0x015c:
            boolean r20 = A07(r13)     // Catch:{ Exception -> 0x01a8 }
        L_0x0160:
            boolean r21 = A09(r13, r6)     // Catch:{ Exception -> 0x01a8 }
            r0 = 29
            if (r4 < r0) goto L_0x016c
            A04(r13)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x0173
        L_0x016c:
            java.lang.String r0 = r13.getName()     // Catch:{ Exception -> 0x01a8 }
            X.C1447272s.A00(r0)     // Catch:{ Exception -> 0x01a8 }
        L_0x0173:
            if (r16 == 0) goto L_0x0177
            if (r11 == r12) goto L_0x0198
        L_0x0177:
            if (r16 != 0) goto L_0x017c
            if (r11 != 0) goto L_0x017c
            goto L_0x0198
        L_0x017c:
            if (r16 != 0) goto L_0x014c
            if (r12 == 0) goto L_0x014c
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0l(r3)     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r0 = ".secure"
            java.lang.String r18 = X.AnonymousClass000.A0X(r0, r11)     // Catch:{ Exception -> 0x01a8 }
            r22 = 1
            r17 = r1
            r19 = r6
            X.7nt r0 = X.C160577nt.A00(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x01a8 }
            r7.add(r0)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x01c7
        L_0x0198:
            r22 = 0
            r17 = r1
            r18 = r3
            r19 = r6
            X.7nt r0 = X.C160577nt.A00(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x01a8 }
            r7.add(r0)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x014c
        L_0x01a8:
            r12 = move-exception
            r0 = 23
            java.lang.String r11 = "MediaCodecUtil"
            if (r4 > r0) goto L_0x01c8
            boolean r0 = r7.isEmpty()     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x01c8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r0 = "Skipping codec "
            r1.append(r0)     // Catch:{ Exception -> 0x01e3 }
            r1.append(r3)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r0 = " (failed to query capabilities)"
            X.AnonymousClass000.A1D(r0, r11, r1)     // Catch:{ Exception -> 0x01e3 }
            goto L_0x014c
        L_0x01c7:
            return r7
        L_0x01c8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r0 = "Failed to query codec "
            r1.append(r0)     // Catch:{ Exception -> 0x01e3 }
            r1.append(r3)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r0 = " ("
            r1.append(r0)     // Catch:{ Exception -> 0x01e3 }
            r1.append(r2)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r0 = ")"
            X.AnonymousClass000.A1D(r0, r11, r1)     // Catch:{ Exception -> 0x01e3 }
            throw r12     // Catch:{ Exception -> 0x01e3 }
        L_0x01e2:
            return r7
        L_0x01e3:
            r1 = move-exception
            X.6yN r0 = new X.6yN
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162317rh.A02(X.7VU, X.8tr):java.util.ArrayList");
    }

    public static synchronized List A03(String str, boolean z) {
        List list;
        synchronized (C162317rh.class) {
            AnonymousClass7VU r4 = new AnonymousClass7VU(str, z);
            HashMap hashMap = A00;
            list = (List) hashMap.get(r4);
            if (list == null) {
                int i = Util.A00;
                ArrayList A02 = A02(r4, new AnonymousClass81L(z));
                if (z && A02.isEmpty() && i <= 23) {
                    A02 = A02(r4, new AnonymousClass81K());
                    if (!A02.isEmpty()) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("MediaCodecList API didn't list secure decoder for: ");
                        A0o.append(str);
                        A0o.append(". Assuming: ");
                        AnonymousClass000.A1F(((C160577nt) AnonymousClass0x9.A0t(A02)).A02, "MediaCodecUtil", A0o);
                    }
                }
                if ("audio/raw".equals(str)) {
                    if (i < 26 && Util.A01.equals("R9") && A02.size() == 1 && ((C160577nt) A02.get(0)).A02.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        A02.add(C160577nt.A00((MediaCodecInfo.CodecCapabilities) null, "OMX.google.raw.decoder", "audio/raw", false, true, false));
                    }
                    AnonymousClass91R.A00(new AnonymousClass7QX(), A02, 0);
                }
                if (i < 32 && A02.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((C160577nt) A02.get(0)).A02)) {
                    A02.add(A02.remove(0));
                }
                list = C129586aY.copyOf((Collection) A02);
                hashMap.put(r4, list);
            }
        }
        return list;
    }

    public static boolean A09(MediaCodecInfo mediaCodecInfo, String str) {
        if (Util.A00 >= 29) {
            return A08(mediaCodecInfo);
        }
        if (!C162097rD.A07(str, "audio")) {
            String A002 = C1447272s.A00(mediaCodecInfo.getName());
            if (A002.startsWith("arc.")) {
                return false;
            }
            if (A002.startsWith("omx.google.") || A002.startsWith("omx.ffmpeg.") || ((A002.startsWith("omx.sec.") && A002.contains(".sw.")) || A002.equals("omx.qcom.video.decoder.hevcswvdec") || A002.startsWith("c2.android.") || A002.startsWith("c2.google.") || (!A002.startsWith("omx.") && !A002.startsWith("c2.")))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean A06(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean A07(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean A08(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static void A04(MediaCodecInfo mediaCodecInfo) {
        mediaCodecInfo.isVendor();
    }
}
