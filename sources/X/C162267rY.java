package X;

import android.media.MediaCodecInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.7rY  reason: invalid class name and case insensitive filesystem */
public final class C162267rY {
    public static final HashMap A00 = AnonymousClass001.A0t();
    public static final Pattern A01 = Pattern.compile("^\\D?(\\d+)$");

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01e5, code lost:
        if (r1.equals(r0) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01e7, code lost:
        r4 = "Ignoring malformed HEVC codec string: ";
        r6 = "MediaCodecUtil";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01ed, code lost:
        if (r5.length < 4) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01ef, code lost:
        r1 = 1;
        r2 = A01.matcher(r5[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01fc, code lost:
        if (r2.matches() == false) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01fe, code lost:
        r3 = r2.group(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0208, code lost:
        if ("1".equals(r3) != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0210, code lost:
        if ("2".equals(r3) == false) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0212, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0213, code lost:
        r3 = r5[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0216, code lost:
        if (r3 == null) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0223, code lost:
        switch(r3.hashCode()) {
            case 70821: goto L_0x035b;
            case 70914: goto L_0x034e;
            case 70917: goto L_0x033f;
            case 71007: goto L_0x0334;
            case 71010: goto L_0x0329;
            case 74665: goto L_0x031c;
            case 74758: goto L_0x030f;
            case 74761: goto L_0x0302;
            case 74851: goto L_0x02f7;
            case 74854: goto L_0x02ec;
            case 2193639: goto L_0x02e1;
            case 2193642: goto L_0x02d6;
            case 2193732: goto L_0x02ca;
            case 2193735: goto L_0x02be;
            case 2193738: goto L_0x02b2;
            case 2193825: goto L_0x02a6;
            case 2193828: goto L_0x029a;
            case 2193831: goto L_0x028e;
            case 2312803: goto L_0x0282;
            case 2312806: goto L_0x0276;
            case 2312896: goto L_0x026a;
            case 2312899: goto L_0x025e;
            case 2312902: goto L_0x0252;
            case 2312989: goto L_0x0246;
            case 2312992: goto L_0x023a;
            case 2312995: goto L_0x022e;
            default: goto L_0x0226;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0226, code lost:
        r1 = X.AnonymousClass001.A0o();
        r0 = "Unknown HEVC level string: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0234, code lost:
        if (r3.equals("L186") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0236, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0240, code lost:
        if (r3.equals("L183") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0242, code lost:
        r0 = 4194304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x024c, code lost:
        if (r3.equals("L180") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x024e, code lost:
        r0 = 1048576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0258, code lost:
        if (r3.equals("L156") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x025a, code lost:
        r0 = 262144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0264, code lost:
        if (r3.equals("L153") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0266, code lost:
        r0 = 65536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0270, code lost:
        if (r3.equals("L150") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0272, code lost:
        r0 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x027c, code lost:
        if (r3.equals("L123") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x027e, code lost:
        r0 = com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0288, code lost:
        if (r3.equals("L120") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x028a, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0294, code lost:
        if (r3.equals("H186") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0296, code lost:
        r0 = 33554432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02a0, code lost:
        if (r3.equals("H183") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02a2, code lost:
        r0 = 8388608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02ac, code lost:
        if (r3.equals("H180") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02ae, code lost:
        r0 = 2097152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02b8, code lost:
        if (r3.equals("H156") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02ba, code lost:
        r0 = 524288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02c4, code lost:
        if (r3.equals("H153") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02c6, code lost:
        r0 = X.AnonymousClass35S.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02d0, code lost:
        if (r3.equals("H150") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02d2, code lost:
        r0 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02dc, code lost:
        if (r3.equals("H123") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02de, code lost:
        r0 = com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02e7, code lost:
        if (r3.equals("H120") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02e9, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x02f2, code lost:
        if (r3.equals("L93") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02f4, code lost:
        r0 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x02fd, code lost:
        if (r3.equals("L90") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x02ff, code lost:
        r0 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0308, code lost:
        if (r3.equals("L63") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x030a, code lost:
        r2 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0315, code lost:
        if (r3.equals("L60") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0317, code lost:
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0322, code lost:
        if (r3.equals("L30") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0324, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x032f, code lost:
        if (r3.equals("H93") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0331, code lost:
        r0 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x033a, code lost:
        if (r3.equals("H90") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x033c, code lost:
        r0 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0345, code lost:
        if (r3.equals("H63") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0347, code lost:
        r0 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0349, code lost:
        r2 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0354, code lost:
        if (r3.equals("H60") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0356, code lost:
        r2 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0361, code lost:
        if (r3.equals("H30") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0363, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0367, code lost:
        if (r2 == null) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0371, code lost:
        return X.AnonymousClass0x9.A0C(java.lang.Integer.valueOf(r1), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0372, code lost:
        r1 = X.AnonymousClass001.A0o();
        r0 = "Unknown HEVC profile string: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x03c2, code lost:
        if (r1.equals(r0) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x03c4, code lost:
        r9 = r5.length;
        r2 = "MediaCodecUtil";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x03ca, code lost:
        if (r9 >= 2) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x03cc, code lost:
        r1 = X.AnonymousClass000.A0m("Ignoring malformed AVC codec string: ", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        r4 = r5[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x03da, code lost:
        if (r4.length() != 6) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x03dc, code lost:
        r9 = java.lang.Integer.parseInt(X.AnonymousClass0x7.A0r(r4, 2), 16);
        r3 = java.lang.Integer.parseInt(r5[1].substring(4), 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x03f3, code lost:
        if (r9 < 3) goto L_0x0419;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x03f5, code lost:
        r9 = java.lang.Integer.parseInt(r4);
        r3 = X.AnonymousClass6CA.A0F(r5, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x03fd, code lost:
        r1 = X.AnonymousClass6C8.A0s(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0402, code lost:
        if (r1 != -1) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0404, code lost:
        r1 = X.AnonymousClass001.A0o();
        r0 = "Unknown AVC profile: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x040c, code lost:
        r4 = X.AnonymousClass6C8.A05(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0410, code lost:
        if (r4 != -1) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0412, code lost:
        r1 = X.AnonymousClass001.A0o();
        r0 = "Unknown AVC level: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:?, code lost:
        android.util.Log.w(r2, X.AnonymousClass000.A0T("Ignoring malformed AVC codec string: ", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0422, code lost:
        r0 = X.AnonymousClass000.A0l("Ignoring malformed AVC codec string: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x046b, code lost:
        r1.append(r0);
        r1.append(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0491, code lost:
        r1.append(r0);
        r1.append(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x04a6, code lost:
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x04ca, code lost:
        r2 = java.lang.Integer.valueOf(r1);
        r0 = java.lang.Integer.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x04d3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x04e0, code lost:
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
        r1 = X.AnonymousClass001.A0o();
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
        if (r0 != null) goto L_0x04dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A00(X.C166527yp r11) {
        /*
            java.lang.String r3 = r11.A0O
            r10 = 0
            if (r3 == 0) goto L_0x004c
            java.lang.String r0 = "\\."
            java.lang.String[] r5 = r3.split(r0)
            java.lang.String r1 = "video/dolby-vision"
            java.lang.String r0 = r11.A0T
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0179
            int r1 = r5.length
            r0 = 3
            java.lang.String r4 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r6 = "MediaCodecUtil"
            if (r1 < r0) goto L_0x037a
            java.util.regex.Pattern r2 = A01
            r1 = 1
            r0 = r5[r1]
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r0 = r2.matches()
            if (r0 == 0) goto L_0x037a
            java.lang.String r3 = r2.group(r1)
            if (r3 == 0) goto L_0x003d
            int r0 = r3.hashCode()
            r8 = 8
            r7 = 4
            r4 = 2
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
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown Dolby Vision profile string: "
        L_0x0043:
            r1.append(r0)
        L_0x0046:
            r1.append(r3)
        L_0x0049:
            X.AnonymousClass6C7.A1A(r1, r6)
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
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            goto L_0x00c6
        L_0x00ba:
            java.lang.String r0 = "00"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L_0x00c6:
            if (r2 == 0) goto L_0x003d
            r3 = r5[r4]
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
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
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
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x0175
        L_0x0169:
            java.lang.String r0 = "01"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0175:
            if (r0 != 0) goto L_0x04dc
            goto L_0x00d3
        L_0x0179:
            r0 = 0
            r1 = r5[r0]
            int r0 = r1.hashCode()
            switch(r0) {
                case 3004662: goto L_0x0427;
                case 3006243: goto L_0x03bc;
                case 3006244: goto L_0x03b9;
                case 3199032: goto L_0x01df;
                case 3214780: goto L_0x01dc;
                case 3356560: goto L_0x0380;
                case 3624515: goto L_0x0184;
                default: goto L_0x0183;
            }
        L_0x0183:
            return r10
        L_0x0184:
            java.lang.String r0 = "vp09"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            int r2 = r5.length
            r0 = 3
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            java.lang.String r6 = "MediaCodecUtil"
            if (r2 >= r0) goto L_0x019a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)
            goto L_0x0046
        L_0x019a:
            r0 = 1
            int r4 = X.AnonymousClass6CA.A0F(r5, r0)     // Catch:{ NumberFormatException -> 0x04b0 }
            r0 = 2
            r0 = r5[r0]     // Catch:{ NumberFormatException -> 0x04b0 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x04b0 }
            r0 = 1
            r1 = 1
            if (r4 == 0) goto L_0x01b5
            r1 = 2
            if (r4 == r0) goto L_0x01b5
            if (r4 == r1) goto L_0x01c6
            r0 = 3
            r1 = 8
            if (r4 == r0) goto L_0x01b5
            r1 = -1
        L_0x01b5:
            r0 = -1
            if (r1 != r0) goto L_0x01c8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown VP9 profile: "
            r1.append(r0)
            r1.append(r4)
            goto L_0x0049
        L_0x01c6:
            r1 = 4
            goto L_0x01b5
        L_0x01c8:
            short r4 = X.AnonymousClass6C8.A0r(r2)
            if (r4 != r0) goto L_0x04ca
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown VP9 level: "
            r1.append(r0)
            r1.append(r2)
            goto L_0x0049
        L_0x01dc:
            java.lang.String r0 = "hvc1"
            goto L_0x01e1
        L_0x01df:
            java.lang.String r0 = "hev1"
        L_0x01e1:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            int r1 = r5.length
            r0 = 4
            java.lang.String r4 = "Ignoring malformed HEVC codec string: "
            java.lang.String r6 = "MediaCodecUtil"
            if (r1 < r0) goto L_0x037a
            java.util.regex.Pattern r2 = A01
            r1 = 1
            r0 = r5[r1]
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r0 = r2.matches()
            if (r0 == 0) goto L_0x037a
            java.lang.String r3 = r2.group(r1)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0213
            java.lang.String r0 = "2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0372
            r1 = 2
        L_0x0213:
            r0 = 3
            r3 = r5[r0]
            if (r3 == 0) goto L_0x0226
            int r0 = r3.hashCode()
            r8 = 16
            r7 = 8
            r5 = 4
            r4 = 2
            r2 = 1
            switch(r0) {
                case 70821: goto L_0x035b;
                case 70914: goto L_0x034e;
                case 70917: goto L_0x033f;
                case 71007: goto L_0x0334;
                case 71010: goto L_0x0329;
                case 74665: goto L_0x031c;
                case 74758: goto L_0x030f;
                case 74761: goto L_0x0302;
                case 74851: goto L_0x02f7;
                case 74854: goto L_0x02ec;
                case 2193639: goto L_0x02e1;
                case 2193642: goto L_0x02d6;
                case 2193732: goto L_0x02ca;
                case 2193735: goto L_0x02be;
                case 2193738: goto L_0x02b2;
                case 2193825: goto L_0x02a6;
                case 2193828: goto L_0x029a;
                case 2193831: goto L_0x028e;
                case 2312803: goto L_0x0282;
                case 2312806: goto L_0x0276;
                case 2312896: goto L_0x026a;
                case 2312899: goto L_0x025e;
                case 2312902: goto L_0x0252;
                case 2312989: goto L_0x0246;
                case 2312992: goto L_0x023a;
                case 2312995: goto L_0x022e;
                default: goto L_0x0226;
            }
        L_0x0226:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown HEVC level string: "
            goto L_0x0043
        L_0x022e:
            java.lang.String r0 = "L186"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            goto L_0x0349
        L_0x023a:
            java.lang.String r0 = "L183"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0349
        L_0x0246:
            java.lang.String r0 = "L180"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0349
        L_0x0252:
            java.lang.String r0 = "L156"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 262144(0x40000, float:3.67342E-40)
            goto L_0x0349
        L_0x025e:
            java.lang.String r0 = "L153"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0349
        L_0x026a:
            java.lang.String r0 = "L150"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0349
        L_0x0276:
            java.lang.String r0 = "L123"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x0349
        L_0x0282:
            java.lang.String r0 = "L120"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x0349
        L_0x028e:
            java.lang.String r0 = "H186"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0349
        L_0x029a:
            java.lang.String r0 = "H183"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0349
        L_0x02a6:
            java.lang.String r0 = "H180"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x0349
        L_0x02b2:
            java.lang.String r0 = "H156"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0349
        L_0x02be:
            java.lang.String r0 = "H153"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0349
        L_0x02ca:
            java.lang.String r0 = "H150"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0349
        L_0x02d6:
            java.lang.String r0 = "H123"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0349
        L_0x02e1:
            java.lang.String r0 = "H120"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0349
        L_0x02ec:
            java.lang.String r0 = "L93"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0349
        L_0x02f7:
            java.lang.String r0 = "L90"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 64
            goto L_0x0349
        L_0x0302:
            java.lang.String r0 = "L63"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x0367
        L_0x030f:
            java.lang.String r0 = "L60"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x0367
        L_0x031c:
            java.lang.String r0 = "L30"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0367
        L_0x0329:
            java.lang.String r0 = "H93"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x0349
        L_0x0334:
            java.lang.String r0 = "H90"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x0349
        L_0x033f:
            java.lang.String r0 = "H63"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            r0 = 32
        L_0x0349:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x0367
        L_0x034e:
            java.lang.String r0 = "H60"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x0367
        L_0x035b:
            java.lang.String r0 = "H30"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0226
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
        L_0x0367:
            if (r2 == 0) goto L_0x0226
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            android.util.Pair r10 = X.AnonymousClass0x9.A0C(r0, r2)
            return r10
        L_0x0372:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown HEVC profile string: "
            goto L_0x0043
        L_0x037a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r4)
            goto L_0x0046
        L_0x0380:
            java.lang.String r0 = "mp4a"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            int r1 = r5.length
            r0 = 3
            java.lang.String r4 = "Ignoring malformed MP4A codec string: "
            java.lang.String r2 = "MediaCodecUtil"
            if (r1 == r0) goto L_0x0396
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r4)
            goto L_0x043d
        L_0x0396:
            r0 = 1
            r1 = r5[r0]     // Catch:{ NumberFormatException -> 0x04c2 }
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r1, r0)     // Catch:{ NumberFormatException -> 0x04c2 }
            java.lang.String r1 = X.C162107rG.A02(r0)     // Catch:{ NumberFormatException -> 0x04c2 }
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)     // Catch:{ NumberFormatException -> 0x04c2 }
            if (r0 == 0) goto L_0x004c
            r0 = 2
            int r0 = X.AnonymousClass6CA.A0F(r5, r0)     // Catch:{ NumberFormatException -> 0x04c2 }
            short r1 = X.AnonymousClass6C9.A0q(r0)
            r0 = -1
            if (r1 == r0) goto L_0x004c
            goto L_0x04b8
        L_0x03b9:
            java.lang.String r0 = "avc2"
            goto L_0x03be
        L_0x03bc:
            java.lang.String r0 = "avc1"
        L_0x03be:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            int r9 = r5.length
            java.lang.String r8 = "Ignoring malformed AVC codec string: "
            java.lang.String r2 = "MediaCodecUtil"
            r7 = 2
            if (r9 >= r7) goto L_0x03d2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r8, r3)
            goto L_0x04a6
        L_0x03d2:
            r6 = 1
            r4 = r5[r6]     // Catch:{ NumberFormatException -> 0x0422 }
            int r1 = r4.length()     // Catch:{ NumberFormatException -> 0x0422 }
            r0 = 6
            if (r1 != r0) goto L_0x03f2
            java.lang.String r0 = X.AnonymousClass0x7.A0r(r4, r7)     // Catch:{ NumberFormatException -> 0x0422 }
            r4 = 16
            int r9 = java.lang.Integer.parseInt(r0, r4)     // Catch:{ NumberFormatException -> 0x0422 }
            r1 = r5[r6]     // Catch:{ NumberFormatException -> 0x0422 }
            r0 = 4
            java.lang.String r0 = r1.substring(r0)     // Catch:{ NumberFormatException -> 0x0422 }
            int r3 = java.lang.Integer.parseInt(r0, r4)     // Catch:{ NumberFormatException -> 0x0422 }
            goto L_0x03fd
        L_0x03f2:
            r0 = 3
            if (r9 < r0) goto L_0x0419
            int r9 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0422 }
            int r3 = X.AnonymousClass6CA.A0F(r5, r7)     // Catch:{ NumberFormatException -> 0x0422 }
        L_0x03fd:
            short r1 = X.AnonymousClass6C8.A0s(r9)
            r0 = -1
            if (r1 != r0) goto L_0x040c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown AVC profile: "
            goto L_0x0491
        L_0x040c:
            int r4 = X.AnonymousClass6C8.A05(r3)
            if (r4 != r0) goto L_0x04ca
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown AVC level: "
            goto L_0x046b
        L_0x0419:
            java.lang.String r0 = X.AnonymousClass000.A0T(r8, r3)     // Catch:{ NumberFormatException -> 0x0422 }
            android.util.Log.w(r2, r0)     // Catch:{ NumberFormatException -> 0x0422 }
            goto L_0x04d3
        L_0x0422:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r8)
            goto L_0x043d
        L_0x0427:
            java.lang.String r0 = "av01"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            X.7ym r8 = r11.A0M
            int r1 = r5.length
            r0 = 4
            java.lang.String r7 = "Ignoring malformed AV1 codec string: "
            java.lang.String r2 = "MediaCodecUtil"
            if (r1 >= r0) goto L_0x0445
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r7)
        L_0x043d:
            java.lang.String r0 = X.AnonymousClass000.A0X(r3, r0)
        L_0x0441:
            android.util.Log.w(r2, r0)
            return r10
        L_0x0445:
            r6 = 1
            int r4 = X.AnonymousClass6CA.A0F(r5, r6)     // Catch:{ NumberFormatException -> 0x04ab }
            r1 = 2
            r0 = r5[r1]     // Catch:{ NumberFormatException -> 0x04ab }
            java.lang.String r0 = X.AnonymousClass0x7.A0r(r0, r1)     // Catch:{ NumberFormatException -> 0x04ab }
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x04ab }
            r0 = 3
            int r3 = X.AnonymousClass6CA.A0F(r5, r0)     // Catch:{ NumberFormatException -> 0x04ab }
            if (r4 == 0) goto L_0x045d
            goto L_0x049a
        L_0x045d:
            r1 = 8
            if (r3 == r1) goto L_0x0472
            r0 = 10
            if (r3 == r0) goto L_0x0472
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown AV1 bit depth: "
        L_0x046b:
            r1.append(r0)
            r1.append(r3)
            goto L_0x04a6
        L_0x0472:
            if (r3 == r1) goto L_0x0484
            if (r8 == 0) goto L_0x0498
            byte[] r0 = r8.A04
            if (r0 != 0) goto L_0x0482
            int r1 = r8.A03
            r0 = 7
            if (r1 == r0) goto L_0x0482
            r0 = 6
            if (r1 != r0) goto L_0x0498
        L_0x0482:
            r6 = 4096(0x1000, float:5.74E-42)
        L_0x0484:
            int r1 = X.AnonymousClass6C8.A09(r9)
            r0 = -1
            if (r1 != r0) goto L_0x04d4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown AV1 level: "
        L_0x0491:
            r1.append(r0)
            r1.append(r9)
            goto L_0x04a6
        L_0x0498:
            r6 = 2
            goto L_0x0484
        L_0x049a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown AV1 profile: "
            r1.append(r0)
            r1.append(r4)
        L_0x04a6:
            java.lang.String r0 = r1.toString()
            goto L_0x0441
        L_0x04ab:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r7)
            goto L_0x043d
        L_0x04b0:
            java.lang.String r0 = X.AnonymousClass000.A0T(r1, r3)
            android.util.Log.w(r6, r0)
            return r10
        L_0x04b8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x04c2 }
            r0 = 0
            android.util.Pair r10 = X.C18290x4.A0K(r1, r0)     // Catch:{ NumberFormatException -> 0x04c2 }
            return r10
        L_0x04c2:
            java.lang.String r0 = X.AnonymousClass000.A0T(r4, r3)
            android.util.Log.w(r2, r0)
            return r10
        L_0x04ca:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x04dc
        L_0x04d3:
            return r10
        L_0x04d4:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x04dc:
            android.util.Pair r10 = X.AnonymousClass0x9.A0C(r2, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162267rY.A00(X.7yp):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (A07(r15) == false) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x012f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b7 A[Catch:{ Exception -> 0x0187, Exception -> 0x01c2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A01(X.AnonymousClass7WB r15, X.C185618ty r16) {
        /*
            java.lang.String r10 = "secure-playback"
            java.lang.String r9 = "tunneled-playback"
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x01c2 }
            r12 = r15
            java.lang.String r7 = r15.A00     // Catch:{ Exception -> 0x01c2 }
            r11 = r16
            int r6 = r11.B5c()     // Catch:{ Exception -> 0x01c2 }
            boolean r16 = r11.Bkx()     // Catch:{ Exception -> 0x01c2 }
            r5 = 0
        L_0x0016:
            if (r5 >= r6) goto L_0x01c1
            android.media.MediaCodecInfo r15 = r11.B5d(r5)     // Catch:{ Exception -> 0x01c2 }
            int r1 = X.C162387ry.A01     // Catch:{ Exception -> 0x01c2 }
            r0 = 29
            if (r1 < r0) goto L_0x0029
            boolean r2 = A07(r15)     // Catch:{ Exception -> 0x01c2 }
            r0 = 1
            if (r2 != 0) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 != 0) goto L_0x012f
            java.lang.String r4 = r15.getName()     // Catch:{ Exception -> 0x01c2 }
            boolean r0 = r15.isEncoder()     // Catch:{ Exception -> 0x01c2 }
            if (r0 != 0) goto L_0x00b2
            if (r16 != 0) goto L_0x0041
            java.lang.String r0 = ".secure"
            boolean r0 = r4.endsWith(r0)     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x0041
            goto L_0x00b2
        L_0x0041:
            r0 = 24
            java.lang.String r2 = "samsung"
            if (r1 >= r0) goto L_0x00a2
            java.lang.String r0 = "OMX.SEC.aac.dec"
            boolean r0 = r0.equals(r4)     // Catch:{ Exception -> 0x01c2 }
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = "OMX.Exynos.AAC.Decoder"
            boolean r0 = r0.equals(r4)     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x00a2
        L_0x0057:
            java.lang.String r0 = X.C162387ry.A04     // Catch:{ Exception -> 0x01c2 }
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x00a2
            java.lang.String r2 = X.C162387ry.A02     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r0 = "zeroflte"
            boolean r0 = r2.startsWith(r0)     // Catch:{ Exception -> 0x01c2 }
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "zerolte"
            boolean r0 = r2.startsWith(r0)     // Catch:{ Exception -> 0x01c2 }
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "zenlte"
            boolean r0 = r2.startsWith(r0)     // Catch:{ Exception -> 0x01c2 }
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "SC-05G"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x01c2 }
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "marinelteatt"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x01c2 }
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "404SC"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x01c2 }
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "SC-04G"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x01c2 }
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "SCV31"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x00a2
            goto L_0x00b2
        L_0x00a2:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r0 = r0.equals(r7)     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r0 = r0.equals(r4)     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x00b4
        L_0x00b2:
            r0 = 0
            goto L_0x00b5
        L_0x00b4:
            r0 = 1
        L_0x00b5:
            if (r0 == 0) goto L_0x012f
            java.lang.String[] r14 = r15.getSupportedTypes()     // Catch:{ Exception -> 0x01c2 }
            int r13 = r14.length     // Catch:{ Exception -> 0x01c2 }
            r2 = 0
        L_0x00bd:
            if (r2 >= r13) goto L_0x00ca
            r3 = r14[r2]     // Catch:{ Exception -> 0x01c2 }
            boolean r0 = r3.equalsIgnoreCase(r7)     // Catch:{ Exception -> 0x01c2 }
            if (r0 != 0) goto L_0x0117
            int r2 = r2 + 1
            goto L_0x00bd
        L_0x00ca:
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "OMX.MS.HEVCDV.Decoder"
            boolean r0 = r0.equals(r4)     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x00dd
            java.lang.String r3 = "video/hevcdv"
            goto L_0x0117
        L_0x00dd:
            java.lang.String r0 = "OMX.RTK.video.decoder"
            boolean r0 = r0.equals(r4)     // Catch:{ Exception -> 0x01c2 }
            if (r0 != 0) goto L_0x00ed
            java.lang.String r0 = "OMX.realtek.video.decoder.tunneled"
            boolean r0 = r0.equals(r4)     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x0116
        L_0x00ed:
            java.lang.String r3 = "video/dv_hevc"
            goto L_0x0117
        L_0x00f0:
            java.lang.String r0 = "audio/alac"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = "OMX.lge.alac.decoder"
            boolean r0 = r0.equals(r4)     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x0103
            java.lang.String r3 = "audio/x-lg-alac"
            goto L_0x0117
        L_0x0103:
            java.lang.String r0 = "audio/flac"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = "OMX.lge.flac.decoder"
            boolean r0 = r0.equals(r4)     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x0116
            java.lang.String r3 = "audio/x-lg-flac"
            goto L_0x0117
        L_0x0116:
            r3 = 0
        L_0x0117:
            if (r3 == 0) goto L_0x012f
            android.media.MediaCodecInfo$CodecCapabilities r13 = r15.getCapabilitiesForType(r3)     // Catch:{ Exception -> 0x0187 }
            boolean r14 = r11.BHa(r13, r9, r3)     // Catch:{ Exception -> 0x0187 }
            boolean r2 = r11.BHZ(r13, r9, r3)     // Catch:{ Exception -> 0x0187 }
            boolean r0 = r12.A02     // Catch:{ Exception -> 0x0187 }
            if (r0 != 0) goto L_0x012b
            if (r2 != 0) goto L_0x012f
        L_0x012b:
            if (r0 == 0) goto L_0x0133
            if (r14 != 0) goto L_0x0133
        L_0x012f:
            int r5 = r5 + 1
            goto L_0x0016
        L_0x0133:
            boolean r14 = r11.BHa(r13, r10, r3)     // Catch:{ Exception -> 0x0187 }
            boolean r0 = r11.BHZ(r13, r10, r3)     // Catch:{ Exception -> 0x0187 }
            boolean r2 = r12.A01     // Catch:{ Exception -> 0x0187 }
            if (r2 != 0) goto L_0x0141
            if (r0 != 0) goto L_0x012f
        L_0x0141:
            if (r2 == 0) goto L_0x0146
            if (r14 != 0) goto L_0x0146
            goto L_0x012f
        L_0x0146:
            r0 = 29
            if (r1 < r0) goto L_0x014b
            goto L_0x014f
        L_0x014b:
            A04(r15)     // Catch:{ Exception -> 0x0187 }
            goto L_0x0152
        L_0x014f:
            A03(r15)     // Catch:{ Exception -> 0x0187 }
        L_0x0152:
            A04(r15)     // Catch:{ Exception -> 0x0187 }
            if (r1 < r0) goto L_0x015b
            A06(r15)     // Catch:{ Exception -> 0x0187 }
            goto L_0x015e
        L_0x015b:
            r15.getName()     // Catch:{ Exception -> 0x0187 }
        L_0x015e:
            if (r16 == 0) goto L_0x0162
            if (r2 == r14) goto L_0x017e
        L_0x0162:
            if (r16 != 0) goto L_0x0167
            if (r2 != 0) goto L_0x0167
            goto L_0x017e
        L_0x0167:
            if (r16 != 0) goto L_0x012f
            if (r14 == 0) goto L_0x012f
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r4)     // Catch:{ Exception -> 0x0187 }
            java.lang.String r0 = ".secure"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r2)     // Catch:{ Exception -> 0x0187 }
            r0 = 1
            X.7o8 r0 = X.C160687o8.A00(r13, r2, r7, r3, r0)     // Catch:{ Exception -> 0x0187 }
            r8.add(r0)     // Catch:{ Exception -> 0x0187 }
            goto L_0x01a6
        L_0x017e:
            r0 = 0
            X.7o8 r0 = X.C160687o8.A00(r13, r4, r7, r3, r0)     // Catch:{ Exception -> 0x0187 }
            r8.add(r0)     // Catch:{ Exception -> 0x0187 }
            goto L_0x012f
        L_0x0187:
            r13 = move-exception
            r0 = 23
            java.lang.String r2 = "MediaCodecUtil"
            if (r1 > r0) goto L_0x01a7
            boolean r0 = r8.isEmpty()     // Catch:{ Exception -> 0x01c2 }
            if (r0 != 0) goto L_0x01a7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r0 = "Skipping codec "
            r1.append(r0)     // Catch:{ Exception -> 0x01c2 }
            r1.append(r4)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r0 = " (failed to query capabilities)"
            X.AnonymousClass000.A1D(r0, r2, r1)     // Catch:{ Exception -> 0x01c2 }
            goto L_0x012f
        L_0x01a6:
            return r8
        L_0x01a7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r0 = "Failed to query codec "
            r1.append(r0)     // Catch:{ Exception -> 0x01c2 }
            r1.append(r4)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r0 = " ("
            r1.append(r0)     // Catch:{ Exception -> 0x01c2 }
            r1.append(r3)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r0 = ")"
            X.AnonymousClass000.A1D(r0, r2, r1)     // Catch:{ Exception -> 0x01c2 }
            throw r13     // Catch:{ Exception -> 0x01c2 }
        L_0x01c1:
            return r8
        L_0x01c2:
            r1 = move-exception
            X.6yS r0 = new X.6yS
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162267rY.A01(X.7WB, X.8ty):java.util.ArrayList");
    }

    public static synchronized List A02(String str, boolean z, boolean z2) {
        List list;
        synchronized (C162267rY.class) {
            AnonymousClass7WB r3 = new AnonymousClass7WB(str, z, z2);
            HashMap hashMap = A00;
            list = (List) hashMap.get(r3);
            if (list == null) {
                int i = C162387ry.A01;
                ArrayList A012 = A01(r3, new AnonymousClass87T(z, z2));
                if (z && A012.isEmpty() && i <= 23) {
                    A012 = A01(r3, new AnonymousClass87S());
                    if (!A012.isEmpty()) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("MediaCodecList API didn't list secure decoder for: ");
                        A0o.append(str);
                        A0o.append(". Assuming: ");
                        AnonymousClass000.A1F(((C160687o8) AnonymousClass0x9.A0t(A012)).A03, "MediaCodecUtil", A0o);
                    }
                }
                if ("audio/raw".equals(str)) {
                    if (i < 26 && C162387ry.A02.equals("R9") && A012.size() == 1 && ((C160687o8) A012.get(0)).A03.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        A012.add(C160687o8.A00((MediaCodecInfo.CodecCapabilities) null, "OMX.google.raw.decoder", "audio/raw", "audio/raw", false));
                    }
                    AnonymousClass91R.A00(new AnonymousClass87U(), A012, 6);
                }
                if (i < 30 && A012.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((C160687o8) A012.get(0)).A03)) {
                    A012.add(A012.remove(0));
                }
                list = Collections.unmodifiableList(A012);
                hashMap.put(r3, list);
            }
        }
        return list;
    }

    public static void A04(MediaCodecInfo mediaCodecInfo) {
        if (C162387ry.A01 >= 29) {
            A05(mediaCodecInfo);
            return;
        }
        String name = mediaCodecInfo.getName();
        if (name != null) {
            name = AnonymousClass0x9.A0z(name);
        }
        if (!name.startsWith("arc.") && !name.startsWith("omx.google.") && !name.startsWith("omx.ffmpeg.") && name.startsWith("omx.sec.") && name.contains(".sw.")) {
        }
    }

    public static boolean A07(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static void A03(MediaCodecInfo mediaCodecInfo) {
        mediaCodecInfo.isHardwareAccelerated();
    }

    public static void A05(MediaCodecInfo mediaCodecInfo) {
        mediaCodecInfo.isSoftwareOnly();
    }

    public static void A06(MediaCodecInfo mediaCodecInfo) {
        mediaCodecInfo.isVendor();
    }
}
