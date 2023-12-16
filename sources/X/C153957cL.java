package X;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.7cL  reason: invalid class name and case insensitive filesystem */
public class C153957cL {
    public static boolean A02(String str, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            return attributeValue.equals("true");
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005e, code lost:
        if (r2 == -9223372036854775807L) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long[] A03(X.C152767a5 r15) {
        /*
            r7 = 3
            long[] r5 = new long[r7]
            r5 = {-1, -1, -1} // fill-array
            if (r15 == 0) goto L_0x00b1
            java.util.List r11 = r15.A0A     // Catch:{ Exception -> 0x00a9 }
            int r10 = r11.size()     // Catch:{ Exception -> 0x00a9 }
            r3 = 0
            java.lang.Object r1 = r11.get(r3)     // Catch:{ Exception -> 0x00a9 }
            X.7Se r1 = (X.C150777Se) r1     // Catch:{ Exception -> 0x00a9 }
            r14 = 1
            int r10 = r10 - r14
            java.lang.Object r2 = r11.get(r10)     // Catch:{ Exception -> 0x00a9 }
            X.7Se r2 = (X.C150777Se) r2     // Catch:{ Exception -> 0x00a9 }
            r6 = 2
            int r0 = r1.A01(r6)     // Catch:{ Exception -> 0x00a9 }
            X.7PZ r0 = X.C150777Se.A00(r1, r0)     // Catch:{ Exception -> 0x00a9 }
            java.util.List r0 = r0.A05     // Catch:{ Exception -> 0x00a9 }
            java.lang.Object r1 = r0.get(r3)     // Catch:{ Exception -> 0x00a9 }
            X.7aP r1 = (X.C152937aP) r1     // Catch:{ Exception -> 0x00a9 }
            int r0 = r2.A01(r6)     // Catch:{ Exception -> 0x00a9 }
            X.7PZ r0 = X.C150777Se.A00(r2, r0)     // Catch:{ Exception -> 0x00a9 }
            java.util.List r0 = r0.A05     // Catch:{ Exception -> 0x00a9 }
            java.lang.Object r4 = r0.get(r3)     // Catch:{ Exception -> 0x00a9 }
            X.7aP r4 = (X.C152937aP) r4     // Catch:{ Exception -> 0x00a9 }
            boolean r0 = r1 instanceof X.AnonymousClass6K8     // Catch:{ Exception -> 0x00a9 }
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r4 instanceof X.AnonymousClass6K8     // Catch:{ Exception -> 0x00a9 }
            if (r0 == 0) goto L_0x00b1
            X.6K8 r1 = (X.AnonymousClass6K8) r1     // Catch:{ Exception -> 0x00a9 }
            X.6K8 r4 = (X.AnonymousClass6K8) r4     // Catch:{ Exception -> 0x00a9 }
            X.6KB r8 = r1.A00     // Catch:{ Exception -> 0x00a9 }
            long r0 = r8.A03     // Catch:{ Exception -> 0x00a9 }
            int r9 = (int) r0     // Catch:{ Exception -> 0x00a9 }
            int r0 = X.AnonymousClass002.A03(r11)     // Catch:{ Exception -> 0x00a9 }
            if (r10 != r0) goto L_0x0093
            long r2 = r15.A01     // Catch:{ Exception -> 0x00a9 }
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
        L_0x0060:
            long r0 = com.facebook.android.exoplayer2.util.Util.A04(r12)     // Catch:{ Exception -> 0x00a9 }
            X.6KB r13 = r4.A00     // Catch:{ Exception -> 0x00a9 }
            int r2 = r13.A00(r0)     // Catch:{ Exception -> 0x00a9 }
            int r2 = r2 + r9
            int r2 = r2 - r14
            int r0 = r2 - r9
            int r10 = r0 + 1
            long r0 = (long) r9     // Catch:{ Exception -> 0x00a9 }
            long r11 = r8.A01(r0)     // Catch:{ Exception -> 0x00a9 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x00a9 }
            long r8 = r13.A01(r2)     // Catch:{ Exception -> 0x00a9 }
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r0 = r4.B7C(r2, r0)     // Catch:{ Exception -> 0x00a9 }
            long r8 = r8 + r0
            long[] r3 = new long[r7]     // Catch:{ Exception -> 0x00a9 }
            r1 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r1
            r0 = 0
            r3[r0] = r11     // Catch:{ Exception -> 0x00a9 }
            long r8 = r8 / r1
            r3[r14] = r8     // Catch:{ Exception -> 0x00a9 }
            long r0 = (long) r10     // Catch:{ Exception -> 0x00a9 }
            r3[r6] = r0     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00a8
        L_0x0093:
            int r0 = r10 + 1
            java.lang.Object r0 = r11.get(r0)     // Catch:{ Exception -> 0x00a9 }
            X.7Se r0 = (X.C150777Se) r0     // Catch:{ Exception -> 0x00a9 }
            long r2 = r0.A00     // Catch:{ Exception -> 0x00a9 }
        L_0x009d:
            java.lang.Object r0 = r11.get(r10)     // Catch:{ Exception -> 0x00a9 }
            X.7Se r0 = (X.C150777Se) r0     // Catch:{ Exception -> 0x00a9 }
            long r0 = r0.A00     // Catch:{ Exception -> 0x00a9 }
            long r12 = r2 - r0
            goto L_0x0060
        L_0x00a8:
            return r3
        L_0x00a9:
            r2 = move-exception
            java.lang.String r1 = "DashManifestHelper2"
            java.lang.String r0 = "Could not get segment range from manifest"
            android.util.Log.w(r1, r0, r2)
        L_0x00b1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153957cL.A03(X.7a5):long[]");
    }

    public static C157797it A00(String str, String str2, String str3, String str4, int i) {
        C157797it r0 = new C157797it();
        r0.A0P = str;
        r0.A0O = str2;
        r0.A0R = str3;
        r0.A0N = str4;
        r0.A03 = i;
        return r0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: X.81P[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x033e, code lost:
        if ("main".equals(r2) == false) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03f7, code lost:
        if (r0.contains("hvq_mobile_landscape") == false) goto L_0x03f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03fb, code lost:
        if (r0 != null) goto L_0x03fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03fd, code lost:
        r91 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0405, code lost:
        if (r0.contains("hvq_mobile_portrait") != false) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0407, code lost:
        r91 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0409, code lost:
        if (r0 == null) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x040b, code lost:
        r90 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0413, code lost:
        if (r0.contains("avoid_on_cellular") != false) goto L_0x0419;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0415, code lost:
        r90 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0417, code lost:
        if (r0 == null) goto L_0x0423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0419, code lost:
        r89 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0421, code lost:
        if (r0.contains("avoid_on_cellular_intentional") != false) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0423, code lost:
        r89 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0425, code lost:
        if (r0 == null) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0427, code lost:
        r88 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x042f, code lost:
        if (r0.contains("avoid_on_cell_datasaver") != false) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0431, code lost:
        r88 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0433, code lost:
        if (r0 == null) goto L_0x043f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0435, code lost:
        r87 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x043d, code lost:
        if (r0.contains("avoid_on_cell_datasaver_intentional") != false) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x043f, code lost:
        r87 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0441, code lost:
        if (r0 == null) goto L_0x044d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0443, code lost:
        r86 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x044b, code lost:
        if (r0.contains("avoid_on_abr") != false) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x044d, code lost:
        r86 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x044f, code lost:
        if (r0 == null) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0451, code lost:
        r85 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0459, code lost:
        if (r0.contains("avoid_on_abr_intentional") != false) goto L_0x045d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x045b, code lost:
        r85 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x045d, code lost:
        r107 = null;
        r0 = r4.getAttributeValue((java.lang.String) null, "FBPlaybackResolutionMos");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0465, code lost:
        if (r0 == null) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0467, code lost:
        r107 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0469, code lost:
        r106 = null;
        r0 = r4.getAttributeValue((java.lang.String) null, "FBPlaybackResolutionMosConfidenceLevel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0471, code lost:
        if (r0 == null) goto L_0x0475;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0473, code lost:
        r106 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0475, code lost:
        r105 = null;
        r0 = r4.getAttributeValue((java.lang.String) null, "FBPlaybackResolutionCsvqm");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x047d, code lost:
        if (r0 == null) goto L_0x0481;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x047f, code lost:
        r105 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0481, code lost:
        r101 = null;
        r0 = r4.getAttributeValue((java.lang.String) null, "FBEncodingTag");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0489, code lost:
        if (r0 == null) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x048b, code lost:
        r101 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0494, code lost:
        r84 = X.AnonymousClass000.A1U(X.C177548g3.A01("FBUltraLowLatencyEncoding", r4, 0), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x049a, code lost:
        if (r14 != false) goto L_0x04a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04a5, code lost:
        if (X.C177548g3.A01("FBDefaultQuality", r4, 0) == 0) goto L_0x04a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04a7, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04a8, code lost:
        r80 = X.AnonymousClass001.A0s();
        r79 = X.AnonymousClass001.A0s();
        r82 = X.AnonymousClass001.A0s();
        r136 = null;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04b7, code lost:
        r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04c0, code lost:
        if (X.C153837c6.A01("BaseURL", r4) == false) goto L_0x04c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04c2, code lost:
        if (r2 != false) goto L_0x0566;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04ca, code lost:
        if (X.C153837c6.A01("AudioChannelConfiguration", r4) == false) goto L_0x04d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04cc, code lost:
        r99 = r11.A09(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04d8, code lost:
        if (X.C153837c6.A01("SegmentBase", r4) == false) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04da, code lost:
        r9 = r11.A0F((X.AnonymousClass6KC) r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04e8, code lost:
        if (X.C153837c6.A01("SegmentList", r4) == false) goto L_0x04f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04ea, code lost:
        r9 = r11.A0C((X.AnonymousClass6K9) r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04f7, code lost:
        if (X.C153837c6.A01("SegmentTemplate", r4) == false) goto L_0x0502;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04f9, code lost:
        r9 = r11.A0D((X.AnonymousClass6KA) r9, r4, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0506, code lost:
        if (X.C153837c6.A01("ContentProtection", r4) == false) goto L_0x051e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0508, code lost:
        r1 = r11.A0A(r4);
        r0 = r1.first;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x050e, code lost:
        if (r0 == null) goto L_0x0514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0510, code lost:
        r136 = (java.lang.String) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0514, code lost:
        r1 = r1.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0516, code lost:
        if (r1 == null) goto L_0x0566;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0518, code lost:
        r80.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0524, code lost:
        if (X.C153837c6.A01("InbandEventStream", r4) == false) goto L_0x0530;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0526, code lost:
        r79.add(X.C177548g3.A05("InbandEventStream", r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0534, code lost:
        if (X.C153837c6.A01("SupplementalProperty", r4) == false) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0536, code lost:
        r82.add(X.C177548g3.A05("SupplementalProperty", r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0546, code lost:
        if (X.C153837c6.A01("FBInitializationBinary", r4) == false) goto L_0x054c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0548, code lost:
        r4.nextText();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0552, code lost:
        if (X.C153837c6.A01("FBSegmentIndexBinary", r4) == false) goto L_0x0566;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0554, code lost:
        r4.nextText();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0558, code lost:
        r4.next();
        r76 = X.C159207lN.A00(r76, r4.getText());
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x056a, code lost:
        if (X.C153837c6.A00("Representation", r4) == false) goto L_0x04b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x056f, code lost:
        r78 = X.AnonymousClass001.A1W(r80.size());
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x057b, code lost:
        if (X.C162097rD.A07(r10, "audio") == false) goto L_0x0598;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x057d, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x057e, code lost:
        if (r8 == null) goto L_0x0758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0584, code lost:
        if (android.text.TextUtils.isEmpty(r8) == false) goto L_0x058d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0586, code lost:
        r3 = new java.lang.String[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x058a, code lost:
        r5 = r3.length;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x058d, code lost:
        r3 = X.AnonymousClass6CA.A0j(r8.trim(), "(\\s*,\\s*)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x059e, code lost:
        if (X.C162097rD.A07(r10, "video") == false) goto L_0x05e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05a0, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05a1, code lost:
        if (r8 == null) goto L_0x0758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05a7, code lost:
        if (android.text.TextUtils.isEmpty(r8) == false) goto L_0x05b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05a9, code lost:
        r3 = new java.lang.String[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05ad, code lost:
        r7 = r3.length;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05b0, code lost:
        r3 = X.AnonymousClass6CA.A0j(r8.trim(), "(\\s*,\\s*)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05bb, code lost:
        if (r1 >= r7) goto L_0x0758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05bd, code lost:
        r0 = X.C162097rD.A04(r3[r1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05c3, code lost:
        if (r0 == null) goto L_0x05cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05c9, code lost:
        if (X.C162097rD.A07(r0, "video") == false) goto L_0x05cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x05cc, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05cf, code lost:
        if (X.C162097rD.A07(r0, "audio") == false) goto L_0x05d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05d1, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05d3, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05d5, code lost:
        if (r1 >= r5) goto L_0x0758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05d7, code lost:
        r0 = X.C162097rD.A04(r3[r1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x05dd, code lost:
        if (r0 == null) goto L_0x05d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x05e8, code lost:
        if (X.C177548g3.A08(r10) == false) goto L_0x05ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x05ea, code lost:
        if (r10 == null) goto L_0x0758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x05ed, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x05f4, code lost:
        if ("application/mp4".equals(r10) == false) goto L_0x0614;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x05fc, code lost:
        if ("stpp".equals(r8) == false) goto L_0x0609;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x05fe, code lost:
        r2 = "application/ttml+xml";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0606, code lost:
        if ("audio/eac3".equals(r2) == false) goto L_0x0661;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x060f, code lost:
        if ("wvtt".equals(r8) == false) goto L_0x0758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0611, code lost:
        r2 = "application/x-mp4-vtt";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x061a, code lost:
        if ("application/x-rawcc".equals(r10) == false) goto L_0x0758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x061c, code lost:
        if (r8 == null) goto L_0x0758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0624, code lost:
        if (r8.contains("cea708") == false) goto L_0x0629;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0626, code lost:
        r2 = "application/cea-708";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x062f, code lost:
        if (r8.contains("eia608") != false) goto L_0x0639;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0637, code lost:
        if (r8.contains("cea608") == false) goto L_0x0758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0639, code lost:
        r2 = "application/cea-608";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x063c, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0641, code lost:
        if (r1 >= r82.size()) goto L_0x066b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0643, code lost:
        r0 = (X.AnonymousClass7W5) r82.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0653, code lost:
        if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(r0.A01) == false) goto L_0x0668;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x065d, code lost:
        if ("ec+3".equals(r0.A02) == false) goto L_0x0668;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x065f, code lost:
        r2 = "audio/eac3-joc";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0668, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x066b, code lost:
        r2 = "audio/eac3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x066d, code lost:
        if (X.C162097rD.A07(r2, "video") == false) goto L_0x0671;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0675, code lost:
        if (X.C162097rD.A07(r2, "audio") == false) goto L_0x06a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0677, code lost:
        r2 = A00(r83, r10, r2, r8, r81);
        r2.A04 = r99;
        r2.A0E = r95;
        r2.A0S = null;
        r2.A0F = r15;
        r2.A0Q = r43;
        r1 = new X.AnonymousClass7QM();
        r1.A01 = r101;
        r1.A0E = r14;
        r1.A00 = r92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06a4, code lost:
        if (X.C177548g3.A08(r2) == false) goto L_0x0758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06ac, code lost:
        if ("application/cea-608".equals(r2) == false) goto L_0x06ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06ae, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06b3, code lost:
        if (r1 >= r54.size()) goto L_0x0736;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x06b5, code lost:
        r0 = (X.AnonymousClass7W5) r54.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x06c5, code lost:
        if ("urn:scte:dash:cc:cea-608:2015".equals(r0.A01) == false) goto L_0x06eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x06c7, code lost:
        r3 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x06c9, code lost:
        if (r3 == null) goto L_0x06eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x06cb, code lost:
        r3 = X.C177548g3.A06.matcher(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x06d5, code lost:
        if (r3.matches() != false) goto L_0x0738;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x06d7, code lost:
        r3 = X.AnonymousClass001.A0o();
        r3.append("Unable to parse CEA-608 channel number from: ");
        android.util.Log.w("MpdParser", X.AnonymousClass000.A0X(r0.A02, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x06eb, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06f4, code lost:
        if ("application/cea-708".equals(r2) == false) goto L_0x0736;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x06f6, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x06fb, code lost:
        if (r1 >= r54.size()) goto L_0x0736;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06fd, code lost:
        r0 = (X.AnonymousClass7W5) r54.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x070d, code lost:
        if ("urn:scte:dash:cc:cea-708:2015".equals(r0.A01) == false) goto L_0x0733;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x070f, code lost:
        r3 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0711, code lost:
        if (r3 == null) goto L_0x0733;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0713, code lost:
        r3 = X.C177548g3.A07.matcher(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x071d, code lost:
        if (r3.matches() != false) goto L_0x0738;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x071f, code lost:
        r3 = X.AnonymousClass001.A0o();
        r3.append("Unable to parse CEA-708 service block number from: ");
        android.util.Log.w("MpdParser", X.AnonymousClass000.A0X(r0.A02, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0733, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0736, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0738, code lost:
        r3 = java.lang.Integer.parseInt(r3.group(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0741, code lost:
        r1 = A00(r83, r10, r2, r8, r81);
        r1.A0F = r15;
        r1.A0Q = r43;
        r1.A02 = r3;
        r0 = new X.C166637z1(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0758, code lost:
        r2 = A00(r83, r10, r2, r8, r81);
        r2.A0F = r15;
        r2.A0Q = r43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0767, code lost:
        r2 = A00(r83, r10, r2, r8, r81);
        r2.A0H = r98;
        r2.A08 = r97;
        r2.A00 = r96;
        r2.A0S = null;
        r2.A0F = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x077f, code lost:
        r1 = new X.AnonymousClass7QM();
        r1.A05 = r116;
        r1.A0F = r93;
        r1.A0G = r91;
        r1.A0C = r90;
        r1.A0B = r89;
        r1.A0A = r88;
        r1.A09 = r87;
        r1.A08 = r86;
        r1.A07 = r85;
        r1.A0H = r78;
        r1.A03 = r107;
        r1.A04 = r106;
        r1.A02 = r105;
        r1.A06 = r125;
        r1.A01 = r101;
        r1.A0E = r14;
        r1.A00 = r92;
        r1.A0D = r94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x07ca, code lost:
        r1.A0I = r84;
        r2.A0J = new X.C165907xp(r1);
        r0 = new X.C166637z1(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x07da, code lost:
        if (r9 != null) goto L_0x07e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x07dc, code lost:
        r9 = new X.AnonymousClass6KC();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x07e1, code lost:
        r132 = new X.AnonymousClass7OH(r0, r9, r76, r136, r80, r79);
        r0 = r132.A00.A0S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x07fa, code lost:
        if (android.text.TextUtils.isEmpty(r0) != false) goto L_0x0814;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0802, code lost:
        if (X.C162097rD.A07(r0, "video") == false) goto L_0x0806;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0804, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x080a, code lost:
        if (X.C162097rD.A07(r0, "audio") == false) goto L_0x080d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x080d, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0812, code lost:
        if (X.C177548g3.A08(r0) != false) goto L_0x0817;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0814, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0816, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0817, code lost:
        r0 = r58;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x081a, code lost:
        if (r0 != -1) goto L_0x081f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x081c, code lost:
        r58 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x081f, code lost:
        if (r1 == -1) goto L_0x0828;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:?, code lost:
        X.C159197lM.A02(X.AnonymousClass000.A1U(r0, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0828, code lost:
        r53.add(r132);
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0bec, code lost:
        if (r118 != false) goto L_0x0bee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0c7c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:?, code lost:
        X.AnonymousClass6C9.A15("Failed to parse manifest: %s", "DashManifestHelper2", r3, new java.lang.Object[]{r30});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0c90, code lost:
        throw new X.C143156yQ(r30, r3);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:592:0x0c7c A[ExcHandler: 6uD | RuntimeException (r3v1 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:564:0x0c15] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C152767a5 A01(android.net.Uri r136, X.C177548g3 r137, java.lang.String r138) {
        /*
            r6 = 0
            r1 = r138
            if (r138 == 0) goto L_0x0ca6
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0ca6
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r1.getBytes(r0)     // Catch:{ 6yQ -> 0x0ca4, IOException -> 0x0ca3 }
            java.io.ByteArrayInputStream r75 = X.AnonymousClass0x9.A0d(r0)     // Catch:{ 6yQ -> 0x0ca4, IOException -> 0x0ca3 }
            java.lang.String r74 = "Failed to close manifest input stream"
            java.lang.String r73 = "DashManifestHelper2"
            r23 = 0
            r30 = r136
            long r33 = java.lang.System.currentTimeMillis()     // Catch:{ 6uD | RuntimeException -> 0x0c7c, IOException -> 0x0c6e }
            r11 = r137
            X.7Ey r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r16 = r0
            if (r0 == 0) goto L_0x0049
            java.lang.String r1 = r11.A03     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 != 0) goto L_0x0049
            monitor-enter(r16)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0c64 }
            if (r0 == 0) goto L_0x0039
            goto L_0x0048
        L_0x0039:
            r0 = r16
            android.util.LruCache r0 = r0.A00     // Catch:{ all -> 0x0c64 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0c64 }
            X.7a5 r0 = (X.C152767a5) r0     // Catch:{ all -> 0x0c64 }
            monitor-exit(r16)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0049
            goto L_0x0c16
        L_0x0048:
            monitor-exit(r16)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x0049:
            org.xmlpull.v1.XmlPullParserFactory r0 = r11.A04     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            org.xmlpull.v1.XmlPullParser r4 = r0.newPullParser()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r21 = 0
            r0 = r75
            r4.setInput(r0, r6)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            int r1 = r4.next()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = 2
            if (r1 != r0) goto L_0x0c50
            java.lang.String r72 = "MPD"
            java.lang.String r1 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r72
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0c50
            if (r136 == 0) goto L_0x0071
            java.lang.String r21 = r30.toString()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x0071:
            java.lang.String r0 = "availabilityStartTime"
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.C177548g3.A07(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r2 = "mediaPresentationDuration"
            r0 = r17
            long r31 = X.C177548g3.A03(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r2 = "minBufferTime"
            X.C177548g3.A03(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "type"
            r71 = 0
            r1 = r71
            java.lang.String r1 = r4.getAttributeValue(r1, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 == 0) goto L_0x00f2
            java.lang.String r0 = "dynamic"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x00f2
            r22 = 1
            java.lang.String r2 = "minimumUpdatePeriod"
            r0 = r17
            X.C177548g3.A03(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r2 = "timeShiftBufferDepth"
            X.C177548g3.A03(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r2 = "suggestedPresentationDelay"
            X.C177548g3.A03(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x00af:
            java.lang.String r0 = "publishTime"
            X.C177548g3.A07(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "availabilityEndTime"
            X.C177548g3.A07(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r2 = "firstAvTimeMs"
            r0 = -1
            long r108 = X.C177548g3.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r2 = "currentServerTimeMs"
            long r110 = X.C177548g3.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r2 = "lastVideoFrameTs"
            long r112 = X.C177548g3.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r2 = "publishFrameTime"
            r0 = 0
            long r114 = X.C177548g3.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "FBWasLive"
            boolean r35 = A02(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "FBIsLiveTemplated"
            boolean r118 = A02(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "FBMS"
            boolean r120 = A02(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "usingASRCaptions"
            java.lang.String r1 = "0"
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x00f6
            goto L_0x00f5
        L_0x00f2:
            r22 = 0
            goto L_0x00af
        L_0x00f5:
            r1 = r0
        L_0x00f6:
            java.lang.String r0 = "1"
            boolean r121 = r1.equals(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "loapStreamId"
            r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r1 = "loapStreamType"
            r0 = r23
            X.C177548g3.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "validationErrors"
            java.lang.String r68 = ""
            r104 = r68
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0116
            r104 = r0
        L_0x0116:
            boolean r0 = r11.A05     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = "FBManifestIdentifier"
            r102 = r71
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0129
            r102 = r0
            goto L_0x0129
        L_0x0127:
            r102 = r71
        L_0x0129:
            java.lang.String r0 = "FBTagsetUsed"
            r103 = r71
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0135
            r103 = r0
        L_0x0135:
            java.lang.String r0 = "FBDeliveryExperimentName"
            r1 = r71
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0140
            r1 = r0
        L_0x0140:
            java.lang.String r0 = "FBDeliveryExperimentGroup"
            java.lang.String r2 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r2 == 0) goto L_0x0157
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = 58
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1.append(r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1.toString()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x0157:
            java.lang.String r0 = "FBManifestTimestamp"
            r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r21 == 0) goto L_0x0170
            java.util.regex.Pattern r1 = X.C177548g3.A09     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r21
            java.util.regex.Matcher r1 = r1.matcher(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            boolean r0 = r1.find()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0170
            r0 = 1
            r1.group(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x0170:
            java.util.ArrayList r69 = X.AnonymousClass001.A0s()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r22 == 0) goto L_0x017c
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x017e
        L_0x017c:
            r19 = 0
        L_0x017e:
            r70 = r71
            r28 = 0
            r29 = 0
            r119 = 0
            r100 = r71
        L_0x0188:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r65 = "BaseURL"
            r0 = r65
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0199
            if (r28 != 0) goto L_0x0b5d
            goto L_0x0b4e
        L_0x0199:
            java.lang.String r0 = "UTCTiming"
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = "schemeIdUri"
            java.lang.String r2 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "value"
            java.lang.String r1 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7Rv r70 = new X.7Rv     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r70
            r0.<init>(r2, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0b5d
        L_0x01b6:
            java.lang.String r0 = "Location"
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x01c8
            java.lang.String r0 = r4.nextText()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            android.net.Uri r100 = android.net.Uri.parse(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0b5d
        L_0x01c8:
            java.lang.String r64 = "Period"
            r0 = r64
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0b5d
            if (r29 != 0) goto L_0x0b5d
            r63 = r21
            java.lang.String r62 = "id"
            r1 = r71
            r0 = r62
            r4.getAttributeValue(r1, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r2 = "start"
            r0 = r19
            long r60 = X.C177548g3.A03(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r59 = "duration"
            r2 = r59
            r0 = r17
            long r26 = X.C177548g3.A03(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.util.ArrayList r66 = X.AnonymousClass001.A0s()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.util.ArrayList r67 = X.AnonymousClass001.A0s()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r24 = r71
            r25 = 0
        L_0x01fd:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r65
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x020c
            if (r25 != 0) goto L_0x0ad6
            goto L_0x0ac7
        L_0x020c:
            java.lang.String r52 = "AdaptationSet"
            r0 = r52
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0948
            r12 = r24
            r51 = r63
            r1 = -1
            r0 = r62
            X.C177548g3.A01(r0, r4, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            int r58 = X.C177548g3.A02(r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "FBUploadResolutionMos"
            r123 = r6
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0230
            r123 = r0
        L_0x0230:
            java.lang.String r0 = "FBUploadResolutionMosConfidenceLevel"
            r124 = r6
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x023c
            r124 = r0
        L_0x023c:
            java.lang.String r0 = "FBUnifiedUploadResolutionMos"
            r125 = r6
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0248
            r125 = r0
        L_0x0248:
            java.lang.String r0 = "subsegmentAlignment"
            boolean r131 = A02(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "bitstreamSwitching"
            boolean r130 = A02(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r49 = "mimeType"
            r0 = r49
            java.lang.String r50 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r47 = "codecs"
            r0 = r47
            java.lang.String r48 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r46 = "width"
            r0 = r46
            int r45 = X.C177548g3.A01(r0, r4, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r44 = "height"
            r0 = r44
            int r42 = X.C177548g3.A01(r0, r4, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r37 = X.C177548g3.A00(r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r38 = "audioSamplingRate"
            r0 = r38
            int r39 = X.C177548g3.A01(r0, r4, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r40 = "lang"
            r0 = r40
            java.lang.String r43 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.util.ArrayList r56 = X.AnonymousClass001.A0s()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.util.ArrayList r55 = X.AnonymousClass001.A0s()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.util.ArrayList r54 = X.AnonymousClass001.A0s()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.util.ArrayList r57 = X.AnonymousClass001.A0s()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.util.ArrayList r53 = X.AnonymousClass001.A0s()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r117 = r6
            r14 = 1
            r36 = -1
            r41 = 0
            r15 = 0
        L_0x02a6:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r65
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x02b5
            if (r41 != 0) goto L_0x0883
            goto L_0x0874
        L_0x02b5:
            java.lang.String r13 = "ContentProtection"
            boolean r0 = X.C153837c6.A01(r13, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x02d4
            android.util.Pair r1 = r11.A0A(r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.Object r0 = r1.first     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x02c9
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r117 = r0
        L_0x02c9:
            java.lang.Object r1 = r1.second     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 == 0) goto L_0x0883
            r0 = r56
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0883
        L_0x02d4:
            java.lang.String r0 = "ContentComponent"
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x030a
            r0 = r40
            java.lang.String r1 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r43 != 0) goto L_0x02e7
            r43 = r1
            goto L_0x02f2
        L_0x02e7:
            if (r1 == 0) goto L_0x02f2
            r0 = r43
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.C159197lM.A02(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x02f2:
            int r2 = X.C177548g3.A02(r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1 = -1
            r0 = r58
            if (r0 != r1) goto L_0x02ff
            r58 = r2
            goto L_0x0883
        L_0x02ff:
            if (r2 == r1) goto L_0x0883
            boolean r0 = X.AnonymousClass000.A1U(r0, r2)
            X.C159197lM.A02(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0883
        L_0x030a:
            java.lang.String r0 = "Role"
            boolean r1 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 == 0) goto L_0x0344
            java.lang.String r1 = "schemeIdUri"
            r2 = 0
            r3 = r6
            java.lang.String r1 = r4.getAttributeValue(r6, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 == 0) goto L_0x031d
            r3 = r1
        L_0x031d:
            java.lang.String r1 = "value"
            java.lang.String r1 = r4.getAttributeValue(r6, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 == 0) goto L_0x0326
            r2 = r1
        L_0x0326:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            boolean r1 = X.C153837c6.A00(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 == 0) goto L_0x0326
            java.lang.String r0 = "urn:mpeg:dash:role:2011"
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0340
            java.lang.String r0 = "main"
            boolean r1 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = 1
            if (r1 != 0) goto L_0x0341
        L_0x0340:
            r0 = 0
        L_0x0341:
            r15 = r15 | r0
            goto L_0x0883
        L_0x0344:
            java.lang.String r7 = "AudioChannelConfiguration"
            boolean r0 = X.C153837c6.A01(r7, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0352
            int r36 = r11.A09(r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0883
        L_0x0352:
            java.lang.String r0 = "Accessibility"
            boolean r1 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 == 0) goto L_0x0365
            X.7W5 r1 = X.C177548g3.A05(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r54
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0883
        L_0x0365:
            java.lang.String r3 = "SupplementalProperty"
            boolean r0 = X.C153837c6.A01(r3, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0378
            X.7W5 r1 = X.C177548g3.A05(r3, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r57
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0883
        L_0x0378:
            java.lang.String r5 = "Representation"
            boolean r0 = X.C153837c6.A01(r5, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x082f
            r76 = r51
            r9 = r12
            r99 = r36
            r8 = r48
            r10 = r50
            r0 = r62
            java.lang.String r83 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "bandwidth"
            r2 = -1
            int r81 = X.C177548g3.A01(r0, r4, r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r49
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x039f
            r10 = r0
        L_0x039f:
            r0 = r47
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x03a8
            r8 = r0
        L_0x03a8:
            r1 = r46
            r0 = r45
            int r98 = X.C177548g3.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1 = r44
            r0 = r42
            int r97 = X.C177548g3.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r37
            float r96 = X.C177548g3.A00(r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1 = r38
            r0 = r39
            int r95 = X.C177548g3.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "FBQualityLabel"
            r116 = r6
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x03d2
            r116 = r0
        L_0x03d2:
            java.lang.String r0 = "FBMaxBandwidth"
            int r92 = X.C177548g3.A01(r0, r4, r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r1 = "FBAbrPolicyTags"
            r0 = r6
            java.lang.String r1 = r4.getAttributeValue(r6, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 == 0) goto L_0x03e2
            r0 = r1
        L_0x03e2:
            java.lang.String r1 = "FBDynamicQualityDropped"
            int r2 = X.C177548g3.A01(r1, r4, r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1 = 1
            boolean r94 = X.AnonymousClass000.A1U(r2, r1)
            if (r0 == 0) goto L_0x03f9
            java.lang.String r1 = "hvq_mobile_landscape"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r93 = 1
            if (r1 != 0) goto L_0x03fd
        L_0x03f9:
            r93 = 0
            if (r0 == 0) goto L_0x0407
        L_0x03fd:
            java.lang.String r1 = "hvq_mobile_portrait"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r91 = 1
            if (r1 != 0) goto L_0x040b
        L_0x0407:
            r91 = 0
            if (r0 == 0) goto L_0x0415
        L_0x040b:
            java.lang.String r1 = "avoid_on_cellular"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r90 = 1
            if (r1 != 0) goto L_0x0419
        L_0x0415:
            r90 = 0
            if (r0 == 0) goto L_0x0423
        L_0x0419:
            java.lang.String r1 = "avoid_on_cellular_intentional"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r89 = 1
            if (r1 != 0) goto L_0x0427
        L_0x0423:
            r89 = 0
            if (r0 == 0) goto L_0x0431
        L_0x0427:
            java.lang.String r1 = "avoid_on_cell_datasaver"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r88 = 1
            if (r1 != 0) goto L_0x0435
        L_0x0431:
            r88 = 0
            if (r0 == 0) goto L_0x043f
        L_0x0435:
            java.lang.String r1 = "avoid_on_cell_datasaver_intentional"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r87 = 1
            if (r1 != 0) goto L_0x0443
        L_0x043f:
            r87 = 0
            if (r0 == 0) goto L_0x044d
        L_0x0443:
            java.lang.String r1 = "avoid_on_abr"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r86 = 1
            if (r1 != 0) goto L_0x0451
        L_0x044d:
            r86 = 0
            if (r0 == 0) goto L_0x045b
        L_0x0451:
            java.lang.String r1 = "avoid_on_abr_intentional"
            boolean r0 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r85 = 1
            if (r0 != 0) goto L_0x045d
        L_0x045b:
            r85 = 0
        L_0x045d:
            java.lang.String r0 = "FBPlaybackResolutionMos"
            r107 = r6
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0469
            r107 = r0
        L_0x0469:
            java.lang.String r0 = "FBPlaybackResolutionMosConfidenceLevel"
            r106 = r6
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0475
            r106 = r0
        L_0x0475:
            java.lang.String r0 = "FBPlaybackResolutionCsvqm"
            r105 = r6
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0481
            r105 = r0
        L_0x0481:
            java.lang.String r0 = "FBEncodingTag"
            r101 = r6
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x048d
            r101 = r0
        L_0x048d:
            java.lang.String r1 = "FBUltraLowLatencyEncoding"
            r0 = r23
            int r1 = X.C177548g3.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = 1
            boolean r84 = X.AnonymousClass000.A1U(r1, r0)
            if (r14 != 0) goto L_0x04a7
            java.lang.String r1 = "FBDefaultQuality"
            r0 = r23
            int r0 = X.C177548g3.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r14 = 0
            if (r0 == 0) goto L_0x04a8
        L_0x04a7:
            r14 = 1
        L_0x04a8:
            java.util.ArrayList r80 = X.AnonymousClass001.A0s()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.util.ArrayList r79 = X.AnonymousClass001.A0s()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.util.ArrayList r82 = X.AnonymousClass001.A0s()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r136 = r6
            r2 = 0
        L_0x04b7:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r65
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x04c6
            if (r2 != 0) goto L_0x0566
            goto L_0x0558
        L_0x04c6:
            boolean r0 = X.C153837c6.A01(r7, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x04d2
            int r99 = r11.A09(r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0566
        L_0x04d2:
            java.lang.String r0 = "SegmentBase"
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x04e2
            X.6KC r9 = (X.AnonymousClass6KC) r9     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.6KC r9 = r11.A0F(r9, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0566
        L_0x04e2:
            java.lang.String r0 = "SegmentList"
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x04f1
            X.6K9 r9 = (X.AnonymousClass6K9) r9     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.6K9 r9 = r11.A0C(r9, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0566
        L_0x04f1:
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0502
            X.6KA r9 = (X.AnonymousClass6KA) r9     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r22
            X.6KA r9 = r11.A0D(r9, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0566
        L_0x0502:
            boolean r0 = X.C153837c6.A01(r13, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x051e
            android.util.Pair r1 = r11.A0A(r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.Object r0 = r1.first     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0514
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r136 = r0
        L_0x0514:
            java.lang.Object r1 = r1.second     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 == 0) goto L_0x0566
            r0 = r80
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0566
        L_0x051e:
            java.lang.String r0 = "InbandEventStream"
            boolean r1 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 == 0) goto L_0x0530
            X.7W5 r1 = X.C177548g3.A05(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r79
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0566
        L_0x0530:
            boolean r0 = X.C153837c6.A01(r3, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0540
            X.7W5 r1 = X.C177548g3.A05(r3, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r82
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0566
        L_0x0540:
            java.lang.String r0 = "FBInitializationBinary"
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x054c
            r4.nextText()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0566
        L_0x054c:
            java.lang.String r0 = "FBSegmentIndexBinary"
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0566
            r4.nextText()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0566
        L_0x0558:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r76
            java.lang.String r76 = X.C159207lN.A00(r0, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r2 = 1
        L_0x0566:
            boolean r0 = X.C153837c6.A00(r5, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x04b7
            int r0 = r80.size()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            boolean r78 = X.AnonymousClass001.A1W(r0)
            r2 = r10
            java.lang.String r13 = "audio"
            boolean r0 = X.C162097rD.A07(r10, r13)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0598
            r2 = 0
            if (r8 == 0) goto L_0x0758
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x058d
            r0 = r23
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x058a:
            int r5 = r3.length     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1 = 0
            goto L_0x05d5
        L_0x058d:
            java.lang.String r1 = r8.trim()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "(\\s*,\\s*)"
            java.lang.String[] r3 = X.AnonymousClass6CA.A0j(r1, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x058a
        L_0x0598:
            java.lang.String r5 = "video"
            boolean r0 = X.C162097rD.A07(r10, r5)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x05e4
            r2 = 0
            if (r8 == 0) goto L_0x0758
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x05b0
            r0 = r23
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x05ad:
            int r7 = r3.length     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1 = 0
            goto L_0x05bb
        L_0x05b0:
            java.lang.String r1 = r8.trim()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "(\\s*,\\s*)"
            java.lang.String[] r3 = X.AnonymousClass6CA.A0j(r1, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x05ad
        L_0x05bb:
            if (r1 >= r7) goto L_0x0758
            r0 = r3[r1]     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = X.C162097rD.A04(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x05cc
            boolean r77 = X.C162097rD.A07(r0, r5)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r77 == 0) goto L_0x05cc
            goto L_0x05d1
        L_0x05cc:
            int r1 = r1 + 1
            goto L_0x05bb
        L_0x05cf:
            if (r7 == 0) goto L_0x05d3
        L_0x05d1:
            r2 = r0
            goto L_0x0600
        L_0x05d3:
            int r1 = r1 + 1
        L_0x05d5:
            if (r1 >= r5) goto L_0x0758
            r0 = r3[r1]     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = X.C162097rD.A04(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x05d3
            boolean r7 = X.C162097rD.A07(r0, r13)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x05cf
        L_0x05e4:
            boolean r0 = X.C177548g3.A08(r10)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x05ed
            if (r10 == 0) goto L_0x0758
            goto L_0x0600
        L_0x05ed:
            java.lang.String r0 = "application/mp4"
            boolean r0 = r0.equals(r10)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r2 = 0
            if (r0 == 0) goto L_0x0614
            java.lang.String r0 = "stpp"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0609
            java.lang.String r2 = "application/ttml+xml"
        L_0x0600:
            java.lang.String r5 = "audio/eac3"
            boolean r0 = r5.equals(r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0661
            goto L_0x063c
        L_0x0609:
            java.lang.String r0 = "wvtt"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0758
            java.lang.String r2 = "application/x-mp4-vtt"
            goto L_0x0600
        L_0x0614:
            java.lang.String r0 = "application/x-rawcc"
            boolean r0 = r0.equals(r10)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0758
            if (r8 == 0) goto L_0x0758
            java.lang.String r0 = "cea708"
            boolean r0 = r8.contains(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0629
            java.lang.String r2 = "application/cea-708"
            goto L_0x0600
        L_0x0629:
            java.lang.String r0 = "eia608"
            boolean r0 = r8.contains(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 != 0) goto L_0x0639
            java.lang.String r0 = "cea608"
            boolean r0 = r8.contains(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0758
        L_0x0639:
            java.lang.String r2 = "application/cea-608"
            goto L_0x0600
        L_0x063c:
            r1 = 0
        L_0x063d:
            int r0 = r82.size()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 >= r0) goto L_0x066b
            r0 = r82
            java.lang.Object r0 = r0.get(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7W5 r0 = (X.AnonymousClass7W5) r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r3 = r0.A01     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r2 = "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r2 == 0) goto L_0x0668
            java.lang.String r2 = "ec+3"
            java.lang.String r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0668
            java.lang.String r2 = "audio/eac3-joc"
        L_0x0661:
            java.lang.String r0 = "video"
            boolean r0 = X.C162097rD.A07(r2, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x066d
        L_0x0668:
            int r1 = r1 + 1
            goto L_0x063d
        L_0x066b:
            r2 = r5
            goto L_0x0661
        L_0x066d:
            if (r0 == 0) goto L_0x0671
            goto L_0x0767
        L_0x0671:
            boolean r0 = X.C162097rD.A07(r2, r13)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x06a0
            r1 = r83
            r0 = r81
            X.7it r2 = A00(r1, r10, r2, r8, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r99
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r95
            r2.A0E = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r2.A0S = r6     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r2.A0F = r15     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r43
            r2.A0Q = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7QM r1 = new X.7QM     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r101
            r1.A01 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1.A0E = r14     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r92
            r1.A00 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x07ca
        L_0x06a0:
            boolean r0 = X.C177548g3.A08(r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0758
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x06ee
            r1 = 0
        L_0x06af:
            int r0 = r54.size()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 >= r0) goto L_0x0736
            r0 = r54
            java.lang.Object r0 = r0.get(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7W5 r0 = (X.AnonymousClass7W5) r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r5 = r0.A01     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r3 = "urn:scte:dash:cc:cea-608:2015"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r3 == 0) goto L_0x06eb
            java.lang.String r3 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r3 == 0) goto L_0x06eb
            java.util.regex.Pattern r5 = X.C177548g3.A06     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.util.regex.Matcher r3 = r5.matcher(r3)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            boolean r5 = r3.matches()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r5 != 0) goto L_0x0738
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r5 = "Unable to parse CEA-608 channel number from: "
            r3.append(r5)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r3)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "MpdParser"
            android.util.Log.w(r0, r3)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x06eb:
            int r1 = r1 + 1
            goto L_0x06af
        L_0x06ee:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0736
            r1 = 0
        L_0x06f7:
            int r0 = r54.size()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 >= r0) goto L_0x0736
            r0 = r54
            java.lang.Object r0 = r0.get(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7W5 r0 = (X.AnonymousClass7W5) r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r5 = r0.A01     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r3 = "urn:scte:dash:cc:cea-708:2015"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r3 == 0) goto L_0x0733
            java.lang.String r3 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r3 == 0) goto L_0x0733
            java.util.regex.Pattern r5 = X.C177548g3.A07     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.util.regex.Matcher r3 = r5.matcher(r3)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            boolean r5 = r3.matches()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r5 != 0) goto L_0x0738
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r5 = "Unable to parse CEA-708 service block number from: "
            r3.append(r5)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r3)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "MpdParser"
            android.util.Log.w(r0, r3)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x0733:
            int r1 = r1 + 1
            goto L_0x06f7
        L_0x0736:
            r3 = -1
            goto L_0x0741
        L_0x0738:
            r0 = 1
            java.lang.String r0 = r3.group(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x0741:
            r1 = r83
            r0 = r81
            X.7it r1 = A00(r1, r10, r2, r8, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1.A0F = r15     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r43
            r1.A0Q = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1.A02 = r3     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7z1 r0 = new X.7z1     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x07da
        L_0x0758:
            r1 = r83
            r0 = r81
            X.7it r2 = A00(r1, r10, r2, r8, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r2.A0F = r15     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r43
            r2.A0Q = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x077f
        L_0x0767:
            r1 = r83
            r0 = r81
            X.7it r2 = A00(r1, r10, r2, r8, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r98
            r2.A0H = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r97
            r2.A08 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r96
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r2.A0S = r6     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r2.A0F = r15     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x077f:
            X.7QM r1 = new X.7QM     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r116
            r1.A05 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r93
            r1.A0F = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r91
            r1.A0G = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r90
            r1.A0C = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r89
            r1.A0B = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r88
            r1.A0A = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r87
            r1.A09 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r86
            r1.A08 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r85
            r1.A07 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r78
            r1.A0H = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r107
            r1.A03 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r106
            r1.A04 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r105
            r1.A02 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r125
            r1.A06 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r101
            r1.A01 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1.A0E = r14     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r92
            r1.A00 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r94
            r1.A0D = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x07ca:
            r0 = r84
            r1.A0I = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7xp r0 = new X.7xp     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r2.A0J = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7z1 r0 = new X.7z1     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.<init>(r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x07da:
            if (r9 != 0) goto L_0x07e1
            X.6KC r9 = new X.6KC     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x07e1:
            X.7OH r3 = new X.7OH     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r132 = r3
            r133 = r0
            r134 = r9
            r135 = r76
            r137 = r80
            r138 = r79
            r132.<init>(r133, r134, r135, r136, r137, r138)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7z1 r0 = r3.A00     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = r0.A0S     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 != 0) goto L_0x0814
            java.lang.String r1 = "video"
            boolean r1 = X.C162097rD.A07(r0, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 == 0) goto L_0x0806
            r1 = 2
            goto L_0x0817
        L_0x0806:
            boolean r1 = X.C162097rD.A07(r0, r13)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 == 0) goto L_0x080d
            goto L_0x0816
        L_0x080d:
            boolean r0 = X.C177548g3.A08(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1 = 3
            if (r0 != 0) goto L_0x0817
        L_0x0814:
            r1 = -1
            goto L_0x0817
        L_0x0816:
            r1 = 1
        L_0x0817:
            r2 = -1
            r0 = r58
            if (r0 != r2) goto L_0x081f
            r58 = r1
            goto L_0x0828
        L_0x081f:
            if (r1 == r2) goto L_0x0828
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            X.C159197lM.A02(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x0828:
            r0 = r53
            r0.add(r3)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r14 = 0
            goto L_0x0883
        L_0x082f:
            java.lang.String r0 = "SegmentBase"
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x083e
            X.6KC r12 = (X.AnonymousClass6KC) r12     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.6KC r12 = r11.A0F(r12, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0883
        L_0x083e:
            java.lang.String r0 = "SegmentList"
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x084d
            X.6K9 r12 = (X.AnonymousClass6K9) r12     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.6K9 r12 = r11.A0C(r12, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0883
        L_0x084d:
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x085e
            X.6KA r12 = (X.AnonymousClass6KA) r12     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r22
            X.6KA r12 = r11.A0D(r12, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0883
        L_0x085e:
            java.lang.String r0 = "InbandEventStream"
            boolean r1 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 == 0) goto L_0x0870
            X.7W5 r1 = X.C177548g3.A05(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r55
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0883
        L_0x0870:
            r4.getEventType()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0883
        L_0x0874:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r51
            java.lang.String r51 = X.C159207lN.A00(r0, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r41 = 1
        L_0x0883:
            r0 = r52
            boolean r0 = X.C153837c6.A00(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x02a6
            java.util.ArrayList r12 = X.C18290x4.A0y(r53)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r9 = 0
        L_0x0890:
            int r0 = r53.size()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r9 >= r0) goto L_0x0932
            r0 = r53
            java.lang.Object r1 = r0.get(r9)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7OH r1 = (X.AnonymousClass7OH) r1     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r13 = r117
            X.7z1 r8 = r1.A00     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = r1.A03     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x08a7
            r13 = r0
        L_0x08a7:
            java.util.ArrayList r3 = r1.A04     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r56
            r3.addAll(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            boolean r0 = r3.isEmpty()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 != 0) goto L_0x0908
            int r2 = r3.size()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x08b8:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x08ea
            java.lang.Object r0 = r3.get(r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7yl r0 = (X.C166487yl) r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            byte[] r5 = r0.A04     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r5 != 0) goto L_0x08b8
            r7 = 0
        L_0x08c7:
            int r5 = r3.size()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r7 >= r5) goto L_0x08b8
            java.lang.Object r5 = r3.get(r7)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7yl r5 = (X.C166487yl) r5     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            byte[] r10 = r5.A04     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r10 == 0) goto L_0x08e7
            byte[] r10 = r0.A04     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r10 != 0) goto L_0x08e7
            java.util.UUID r10 = r0.A03     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            boolean r5 = r5.A00(r10)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r5 == 0) goto L_0x08e7
            r3.remove(r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x08b8
        L_0x08e7:
            int r7 = r7 + 1
            goto L_0x08c7
        L_0x08ea:
            int r0 = r3.size()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7yl[] r0 = new X.C166487yl[r0]     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.Object[] r0 = r3.toArray(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7yl[] r0 = (X.C166487yl[]) r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7z3 r2 = new X.7z3     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r2.<init>(r13, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7it r0 = new X.7it     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.<init>(r8)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.A00(r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7z1 r8 = new X.7z1     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r8.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x0908:
            java.util.ArrayList r2 = r1.A05     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r55
            r2.addAll(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r3 = r1.A02     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7Sf r0 = r1.A01     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            boolean r1 = r0 instanceof X.AnonymousClass6KC     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 == 0) goto L_0x0922
            X.6KC r0 = (X.AnonymousClass6KC) r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.6K7 r1 = new X.6K7     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1.<init>(r8, r0, r3, r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x091e:
            r12.add(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x092e
        L_0x0922:
            boolean r1 = r0 instanceof X.AnonymousClass6KB     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 == 0) goto L_0x0b66
            X.6KB r0 = (X.AnonymousClass6KB) r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.6K8 r1 = new X.6K8     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1.<init>(r8, r0, r3, r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x091e
        L_0x092e:
            int r9 = r9 + 1
            goto L_0x0890
        L_0x0932:
            X.7PZ r1 = new X.7PZ     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r122 = r1
            r126 = r12
            r127 = r54
            r128 = r57
            r129 = r58
            r122.<init>(r123, r124, r125, r126, r127, r128, r129, r130, r131)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r66
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0ad6
        L_0x0948:
            java.lang.String r12 = "EventStream"
            boolean r0 = X.C153837c6.A01(r12, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0a98
            java.lang.String r0 = "schemeIdUri"
            r39 = r68
            r38 = r68
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x095e
            r38 = r0
        L_0x095e:
            java.lang.String r0 = "value"
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0968
            r39 = r0
        L_0x0968:
            java.lang.String r2 = "timescale"
            r0 = 1
            long r14 = X.C177548g3.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = 512(0x200, float:7.175E-43)
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r10.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x097b:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r9 = "Event"
            boolean r0 = X.C153837c6.A01(r9, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0a5f
            r7 = 0
            r0 = r62
            long r43 = X.C177548g3.A04(r0, r4, r7)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r2 = r59
            r0 = r17
            long r45 = X.C177548g3.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "presentationTime"
            long r0 = X.C177548g3.A04(r0, r4, r7)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r47 = 1000(0x3e8, double:4.94E-321)
            r49 = r14
            long r41 = com.facebook.android.exoplayer2.util.Util.A07(r45, r47, r49)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            long r36 = com.facebook.android.exoplayer2.util.Util.A06(r0, r14)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "messageData"
            r7 = 0
            java.lang.String r0 = r4.getAttributeValue(r6, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x09b2
            r7 = r0
        L_0x09b2:
            r10.reset()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            org.xmlpull.v1.XmlSerializer r0 = android.util.Xml.newSerializer()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.setOutput(r10, r6)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r4.nextToken()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x09bf:
            boolean r1 = X.C153837c6.A00(r9, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 != 0) goto L_0x0a42
            int r1 = r4.getEventType()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            switch(r1) {
                case 0: goto L_0x0a3c;
                case 1: goto L_0x0a38;
                case 2: goto L_0x0a14;
                case 3: goto L_0x0a08;
                case 4: goto L_0x0a00;
                case 5: goto L_0x09f8;
                case 6: goto L_0x09f0;
                case 7: goto L_0x09e8;
                case 8: goto L_0x09e0;
                case 9: goto L_0x09d8;
                case 10: goto L_0x09d0;
                default: goto L_0x09cc;
            }     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x09cc:
            r4.nextToken()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x09bf
        L_0x09d0:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.docdecl(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x09cc
        L_0x09d8:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.comment(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x09cc
        L_0x09e0:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.processingInstruction(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x09cc
        L_0x09e8:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.ignorableWhitespace(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x09cc
        L_0x09f0:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.entityRef(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x09cc
        L_0x09f8:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.cdsect(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x09cc
        L_0x0a00:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.text(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x09cc
        L_0x0a08:
            java.lang.String r2 = r4.getNamespace()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r1 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.endTag(r2, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x09cc
        L_0x0a14:
            java.lang.String r2 = r4.getNamespace()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r1 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.startTag(r2, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1 = 0
        L_0x0a20:
            int r2 = r4.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 >= r2) goto L_0x09cc
            java.lang.String r5 = r4.getAttributeNamespace(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r3 = r4.getAttributeName(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r2 = r4.getAttributeValue(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.attribute(r5, r3, r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            int r1 = r1 + 1
            goto L_0x0a20
        L_0x0a38:
            r0.endDocument()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x09cc
        L_0x0a3c:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0.startDocument(r6, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x09cc
        L_0x0a42:
            r0.flush()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            byte[] r40 = r10.toByteArray()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.Long r1 = java.lang.Long.valueOf(r36)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r7 == 0) goto L_0x0a55
            java.nio.charset.Charset r0 = X.AnonymousClass79T.A05     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            byte[] r40 = r7.getBytes(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x0a55:
            X.81P r0 = new X.81P     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r37 = r0
            r37.<init>(r38, r39, r40, r41, r43)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.C18320x8.A1F(r1, r0, r13)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x0a5f:
            boolean r0 = X.C153837c6.A00(r12, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x097b
            int r0 = r13.size()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            long[] r3 = new long[r0]     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            int r0 = r13.size()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.81P[] r2 = new X.AnonymousClass81P[r0]     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1 = 0
        L_0x0a72:
            int r0 = r13.size()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 >= r0) goto L_0x0a8d
            java.lang.Object r0 = r13.get(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.Object r5 = r0.first     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            long r7 = X.C18320x8.A05(r5)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r3[r1] = r7     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.Object r0 = r0.second     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r2[r1] = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            int r1 = r1 + 1
            goto L_0x0a72
        L_0x0a8d:
            X.7FA r1 = new X.7FA     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1.<init>(r3, r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r67
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0ad6
        L_0x0a98:
            java.lang.String r0 = "SegmentBase"
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0aa7
            r0 = r71
            X.6KC r24 = r11.A0F(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0ad6
        L_0x0aa7:
            java.lang.String r0 = "SegmentList"
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0ab6
            r0 = r71
            X.6K9 r24 = r11.A0C(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0ad6
        L_0x0ab6:
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = X.C153837c6.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0ad6
            r1 = r71
            r0 = r22
            X.6KA r24 = r11.A0D(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0ad6
        L_0x0ac7:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r63
            java.lang.String r63 = X.C159207lN.A00(r0, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r25 = 1
        L_0x0ad6:
            r0 = r64
            boolean r0 = X.C153837c6.A00(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x01fd
            r3 = 0
            r8 = 0
        L_0x0ae0:
            int r0 = r66.size()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r3 >= r0) goto L_0x0b21
            r0 = r66
            java.lang.Object r1 = r0.get(r3)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7PZ r1 = (X.AnonymousClass7PZ) r1     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.util.List r0 = r1.A05     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0b1e
            r2 = 0
        L_0x0af3:
            java.util.List r0 = r1.A05     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            int r0 = r0.size()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r2 >= r0) goto L_0x0b1e
            java.util.List r0 = r1.A05     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7aP r0 = (X.C152937aP) r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            boolean r5 = r0 instanceof X.AnonymousClass6K7     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r5 == 0) goto L_0x0b08
            goto L_0x0b19
        L_0x0b08:
            X.6K8 r0 = (X.AnonymousClass6K8) r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.6KB r0 = r0.A00     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            boolean r5 = r0 instanceof X.AnonymousClass6KA     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r7 = 0
            if (r5 == 0) goto L_0x0b1a
            X.6KA r0 = (X.AnonymousClass6KA) r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.7FB r0 = r0.A00     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0b1a
            r7 = 1
            goto L_0x0b1a
        L_0x0b19:
            r7 = 0
        L_0x0b1a:
            r8 = r8 | r7
            int r2 = r2 + 1
            goto L_0x0af3
        L_0x0b1e:
            int r3 = r3 + 1
            goto L_0x0ae0
        L_0x0b21:
            X.7Se r5 = new X.7Se     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r3 = r66
            r2 = r67
            r0 = r60
            r5.<init>(r3, r2, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            long r0 = r5.A00     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x0b33
            goto L_0x0b47
        L_0x0b33:
            int r2 = (r26 > r17 ? 1 : (r26 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x0b3d
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0b41
        L_0x0b3d:
            long r0 = r0 + r26
            r19 = r0
        L_0x0b41:
            r0 = r69
            r0.add(r5)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0b4b
        L_0x0b47:
            if (r22 == 0) goto L_0x0b6e
            r29 = 1
        L_0x0b4b:
            r119 = r119 | r8
            goto L_0x0b5d
        L_0x0b4e:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r21
            java.lang.String r21 = X.C159207lN.A00(r0, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r28 = 1
        L_0x0b5d:
            r0 = r72
            boolean r0 = X.C153837c6.A00(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 == 0) goto L_0x0188
            goto L_0x0b83
        L_0x0b66:
            java.lang.String r0 = "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0c66
        L_0x0b6e:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r1 = "Unable to determine start of period "
            r0 = r69
            X.C18260x0.A19(r1, r2, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.6uD r0 = X.C140626uD.A00(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0c66
        L_0x0b83:
            int r0 = (r31 > r17 ? 1 : (r31 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x0b8c
            int r0 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0b8c
            goto L_0x0b8e
        L_0x0b8c:
            r19 = r31
        L_0x0b8e:
            boolean r0 = r69.isEmpty()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r0 != 0) goto L_0x0c49
            r0 = r69
            boolean r7 = r11.A0H(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "Before filterPeriod() for "
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r4 = r11.A03     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1.append(r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r3 = "\n"
            r1.append(r3)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r69
            java.lang.String r2 = r11.A0G(r1, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r5 = "->"
            if (r7 == 0) goto L_0x0bd8
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = "filterPeriod() for "
            X.AnonymousClass001.A1K(r0, r4, r3, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r0 = r69
            java.lang.String r3 = r11.A0G(r1, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            boolean r122 = r11.A0H(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            long r0 = r0 - r7
            r11.A00 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = X.C18260x0.A06(r2, r5, r3)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r11.A02 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0be8
        L_0x0bd8:
            r0 = 0
            r11.A00 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r2, r5)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = X.AnonymousClass000.A0X(r2, r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r11.A02 = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r122 = 0
        L_0x0be8:
            if (r35 != 0) goto L_0x0bee
            r117 = 0
            if (r118 == 0) goto L_0x0bf0
        L_0x0bee:
            r117 = 1
        L_0x0bf0:
            X.7a5 r0 = new X.7a5     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r99 = r0
            r101 = r70
            r105 = r69
            r106 = r19
            r116 = r22
            r99.<init>(r100, r101, r102, r103, r104, r105, r106, r108, r110, r112, r114, r116, r117, r118, r119, r120, r121, r122)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r16 == 0) goto L_0x0c16
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            if (r1 != 0) goto L_0x0c16
            monitor-enter(r16)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0c64 }
            if (r1 != 0) goto L_0x0c15
            r1 = r16
            android.util.LruCache r1 = r1.A00     // Catch:{ all -> 0x0c64 }
            r1.put(r4, r0)     // Catch:{ all -> 0x0c64 }
        L_0x0c15:
            monitor-exit(r16)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x0c16:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ 6uD | RuntimeException -> 0x0c7c, IOException -> 0x0c6e }
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ 6uD | RuntimeException -> 0x0c7c, IOException -> 0x0c6e }
            java.lang.Object[] r3 = X.AnonymousClass0x9.A1X()     // Catch:{ 6uD | RuntimeException -> 0x0c7c, IOException -> 0x0c6e }
            long r1 = r1 - r33
            r5 = r23
            X.AnonymousClass000.A1Q(r3, r5, r1)     // Catch:{ 6uD | RuntimeException -> 0x0c7c, IOException -> 0x0c6e }
            long r1 = r11.A00     // Catch:{ 6uD | RuntimeException -> 0x0c7c, IOException -> 0x0c6e }
            r5 = 1
            X.AnonymousClass000.A1Q(r3, r5, r1)     // Catch:{ 6uD | RuntimeException -> 0x0c7c, IOException -> 0x0c6e }
            r2 = 2
            java.lang.String r1 = r11.A02     // Catch:{ 6uD | RuntimeException -> 0x0c7c, IOException -> 0x0c6e }
            r3[r2] = r1     // Catch:{ 6uD | RuntimeException -> 0x0c7c, IOException -> 0x0c6e }
            java.lang.String r1 = "parse:%dms;filter:%dms;%s"
            java.lang.String.format(r4, r1, r3)     // Catch:{ 6uD | RuntimeException -> 0x0c7c, IOException -> 0x0c6e }
            r75.close()     // Catch:{ IOException -> 0x0c3b }
            goto L_0x0c48
        L_0x0c3b:
            r4 = move-exception
            r1 = r23
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ 6yQ -> 0x0ca4, IOException -> 0x0ca3 }
            r2 = r74
            r1 = r73
            X.AnonymousClass6C9.A15(r2, r1, r4, r3)     // Catch:{ 6yQ -> 0x0ca4, IOException -> 0x0ca3 }
            return r0
        L_0x0c48:
            return r0
        L_0x0c49:
            java.lang.String r0 = "No periods found."
            X.6uD r0 = X.C140626uD.A00(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0c66
        L_0x0c50:
            java.lang.String r2 = "inputStream does not contain a valid media presentation description, start tag %s"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            r1[r23] = r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            java.lang.String r0 = java.lang.String.format(r2, r1)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            X.6uD r0 = X.C140626uD.A00(r0)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
            goto L_0x0c66
        L_0x0c64:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x0c66:
            throw r0     // Catch:{ XmlPullParserException -> 0x0c67, 6uD | RuntimeException -> 0x0c7c }
        L_0x0c67:
            r1 = move-exception
            X.6uD r0 = new X.6uD     // Catch:{ 6uD | RuntimeException -> 0x0c7c, IOException -> 0x0c6e }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ 6uD | RuntimeException -> 0x0c7c, IOException -> 0x0c6e }
            throw r0     // Catch:{ 6uD | RuntimeException -> 0x0c7c, IOException -> 0x0c6e }
        L_0x0c6e:
            r3 = move-exception
            java.lang.String r2 = "I/O Error when parsing manifest: %s"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0c91 }
            r1[r23] = r30     // Catch:{ all -> 0x0c91 }
            r0 = r73
            X.AnonymousClass6C9.A15(r2, r0, r3, r1)     // Catch:{ all -> 0x0c91 }
            throw r3     // Catch:{ all -> 0x0c91 }
        L_0x0c7c:
            r3 = move-exception
            java.lang.String r2 = "Failed to parse manifest: %s"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0c91 }
            r1[r23] = r30     // Catch:{ all -> 0x0c91 }
            r0 = r73
            X.AnonymousClass6C9.A15(r2, r0, r3, r1)     // Catch:{ all -> 0x0c91 }
            X.6yQ r1 = new X.6yQ     // Catch:{ all -> 0x0c91 }
            r0 = r30
            r1.<init>(r0, r3)     // Catch:{ all -> 0x0c91 }
            throw r1     // Catch:{ all -> 0x0c91 }
        L_0x0c91:
            r4 = move-exception
            r75.close()     // Catch:{ IOException -> 0x0c96 }
            goto L_0x0ca2
        L_0x0c96:
            r3 = move-exception
            r0 = r23
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ 6yQ -> 0x0ca4, IOException -> 0x0ca3 }
            r1 = r74
            r0 = r73
            X.AnonymousClass6C9.A15(r1, r0, r3, r2)     // Catch:{ 6yQ -> 0x0ca4, IOException -> 0x0ca3 }
        L_0x0ca2:
            throw r4     // Catch:{ 6yQ -> 0x0ca4, IOException -> 0x0ca3 }
        L_0x0ca3:
            return r6
        L_0x0ca4:
            r0 = move-exception
            throw r0
        L_0x0ca6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153957cL.A01(android.net.Uri, X.8g3, java.lang.String):X.7a5");
    }
}
