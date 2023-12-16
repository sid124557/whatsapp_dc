package X;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2do  reason: invalid class name and case insensitive filesystem */
public class C47782do {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A[SYNTHETIC, Splitter:B:11:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[Catch:{ IllegalArgumentException -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C58682ve A00(X.C21531Ce r10) {
        /*
            r9 = this;
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            int r1 = r10.clauseType_
            r0 = 1
            if (r1 == r0) goto L_0x001f
            r0 = 2
            if (r1 == r0) goto L_0x001c
            r0 = 3
            if (r1 != r0) goto L_0x001f
            X.22q r0 = X.C374422q.NOR
        L_0x0015:
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L_0x0025
            goto L_0x0022
        L_0x001c:
            X.22q r0 = X.C374422q.OR
            goto L_0x0015
        L_0x001f:
            X.22q r0 = X.C374422q.AND
            goto L_0x0015
        L_0x0022:
            X.21H r4 = X.AnonymousClass21H.UNKNOWN     // Catch:{ IllegalArgumentException -> 0x0036 }
            goto L_0x0038
        L_0x0025:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x0036 }
            X.C162457s7.A0F(r0)     // Catch:{ IllegalArgumentException -> 0x0036 }
            java.lang.String r0 = r1.toUpperCase(r0)     // Catch:{ IllegalArgumentException -> 0x0036 }
            X.C162457s7.A0D(r0)     // Catch:{ IllegalArgumentException -> 0x0036 }
            X.21H r4 = X.AnonymousClass21H.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0036 }
            goto L_0x0038
        L_0x0036:
            X.21H r4 = X.AnonymousClass21H.UNKNOWN
        L_0x0038:
            X.8ya r0 = r10.filters_
            if (r0 == 0) goto L_0x0079
            java.util.Iterator r8 = r0.iterator()
        L_0x0040:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r2 = r8.next()
            X.6cM r2 = (X.C130676cM) r2
            java.lang.String r7 = r2.filterName_
            if (r7 != 0) goto L_0x0052
            java.lang.String r7 = ""
        L_0x0052:
            int r1 = r2.clientNotSupportedConfig_
            r0 = 1
            if (r1 == r0) goto L_0x0076
            r0 = 2
            if (r1 != r0) goto L_0x0076
            X.22b r0 = X.AnonymousClass22b.FAIL_BY_DEFAULT
        L_0x005c:
            int r0 = r0.value
            boolean r3 = X.AnonymousClass001.A1T(r0)
            X.8Tq r0 = r2.parameters_
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r0)
            X.2It r1 = new X.2It
            r1.<init>(r7)
            X.2PJ r0 = new X.2PJ
            r0.<init>(r1, r2, r3)
            r6.add(r0)
            goto L_0x0040
        L_0x0076:
            X.22b r0 = X.AnonymousClass22b.PASS_BY_DEFAULT
            goto L_0x005c
        L_0x0079:
            X.8ya r0 = r10.clauses_
            if (r0 == 0) goto L_0x0095
            java.util.Iterator r1 = r0.iterator()
        L_0x0081:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r1.next()
            X.1Ce r0 = (X.C21531Ce) r0
            X.2ve r0 = r9.A00(r0)
            r5.add(r0)
            goto L_0x0081
        L_0x0095:
            X.2ve r0 = new X.2ve
            r0.<init>(r4, r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47782do.A00(X.1Ce):X.2ve");
    }

    public List A01(List list) {
        AnonymousClass2PK r9;
        C43352Ru r20;
        C43352Ru r21;
        C41072Iv r11;
        byte[] bArr;
        byte[] bArr2;
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C34981w8 r0 = (C34981w8) it.next();
                HashMap A0t = AnonymousClass001.A0t();
                String str = r0.A01;
                Iterator A0q = C18320x8.A0q(r0.A00);
                while (A0q.hasNext()) {
                    C35061wG r02 = (C35061wG) A0q.next();
                    List<C34811vr> list2 = r02.A0T;
                    HashSet A0K = AnonymousClass002.A0K();
                    for (C34811vr r1 : list2) {
                        A0K.add(r1.A00);
                    }
                    for (C34811vr r12 : list2) {
                        String str2 = r12.A00;
                        C58682ve r13 = new C58682ve(AnonymousClass21H.UNKNOWN, AnonymousClass001.A0s(), AnonymousClass001.A0s());
                        C34821vs r6 = r02.A07;
                        if (r6 != null) {
                            r13 = A00((C21531Ce) C130786cX.A05(C21531Ce.DEFAULT_INSTANCE, (byte[]) r6.A00));
                        }
                        HashMap A0t2 = AnonymousClass001.A0t();
                        C34891vz r92 = r02.A09;
                        if (r92 != null) {
                            String str3 = r92.A04;
                            if (str3 != null) {
                                A0t2.put("colors_LightBackground", str3);
                            }
                            String str4 = r92.A05;
                            if (str4 != null) {
                                A0t2.put("colors_LightHighlight", str4);
                            }
                            String str5 = r92.A02;
                            if (str5 != null) {
                                A0t2.put("colors_DarkBackground", str5);
                            }
                            String str6 = r92.A03;
                            if (str6 != null) {
                                A0t2.put("colors_DarkHighlight", str6);
                            }
                        }
                        C34821vs r62 = r02.A08;
                        if (r62 != null) {
                            A0t2.put("instance_log_data", new String((byte[]) r62.A00, StandardCharsets.UTF_8));
                        }
                        C34821vs r63 = r02.A06;
                        if (r63 != null) {
                            Iterator A0q2 = C18320x8.A0q(r63.A00);
                            while (A0q2.hasNext()) {
                                C34831vt r64 = (C34831vt) A0q2.next();
                                A0t2.put(r64.A00, r64.A01);
                            }
                        }
                        C41062Iu r7 = new C41062Iu(A0t2);
                        AnonymousClass56S r93 = r02.A03;
                        if (r93 != null) {
                            C34821vs r65 = (C34821vs) r93.A01;
                            if (r65 != null) {
                                bArr = (byte[]) r65.A00;
                            } else {
                                bArr = null;
                            }
                            C34821vs r66 = (C34821vs) r93.A00;
                            if (r66 != null) {
                                bArr2 = (byte[]) r66.A00;
                            } else {
                                bArr2 = null;
                            }
                            r9 = new AnonymousClass2PK(r93.A02, bArr, bArr2);
                        } else {
                            r9 = null;
                        }
                        C34841vu r67 = r02.A04;
                        if (r67 != null) {
                            String str7 = r67.A01;
                            String str8 = r67.A00;
                            if (str8 == null) {
                                str8 = null;
                            }
                            String str9 = r67.A02;
                            if (str9 == null) {
                                str9 = null;
                            }
                            r20 = new C43352Ru(str7, str8, str9, 0, false);
                        } else {
                            r20 = null;
                        }
                        C34841vu r68 = r02.A05;
                        if (r68 != null) {
                            String str10 = r68.A01;
                            String str11 = r68.A00;
                            if (str11 == null) {
                                str11 = null;
                            }
                            String str12 = r68.A02;
                            if (str12 == null) {
                                str12 = null;
                            }
                            r21 = new C43352Ru(str10, str11, str12, 0, false);
                        } else {
                            r21 = null;
                        }
                        C34801vq r69 = r02.A02;
                        if (r69 != null) {
                            r11 = new C41072Iv(r69.A00);
                        } else {
                            r11 = null;
                        }
                        AnonymousClass2TD r19 = new AnonymousClass2TD(r20, r21, (C43352Ru) null, r11, r9, r02.A0S, r02.A0R);
                        String str13 = r02.A0I;
                        boolean equals = r02.A0O.equals("true");
                        long longValue = r02.A0F.longValue();
                        long longValue2 = r02.A0B.longValue();
                        long longValue3 = r02.A0H.longValue();
                        boolean equals2 = r02.A0K.equals("true");
                        boolean equals3 = r02.A0N.equals("true");
                        int intValue = r02.A0D.intValue();
                        C41112Iz r610 = new C41112Iz(r13);
                        long longValue4 = r02.A0E.longValue();
                        String str14 = r02.A0Q;
                        int intValue2 = r02.A0A.intValue();
                        Boolean valueOf = Boolean.valueOf(r02.A0L.equals("true"));
                        Integer valueOf2 = Integer.valueOf(r02.A0G.intValue());
                        String str15 = r02.A0M;
                        C41062Iu r18 = r7;
                        AnonymousClass3YL r17 = new AnonymousClass3YL(r18, r19, r610, valueOf, valueOf2, Integer.valueOf(r02.A0C.intValue()), str13, "", str14, str15, r02.A0J, A0K, intValue, intValue2, longValue, longValue2, longValue3, longValue4, equals, false, equals2, equals3, false, false, false, r02.A0P.equals("true"));
                        List A0s2 = AnonymousClass001.A0s();
                        if (A0t.containsKey(str2)) {
                            A0s2 = (List) A0t.get(str2);
                        }
                        A0s2.add(r17);
                        A0t.put(str2, A0s2);
                    }
                }
                A0s.add(new C41932Md(str, A0t));
            }
        } catch (Exception e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "PSANotificationHandler/QpSurface corrupted : ", e);
        }
        return A0s;
    }
}
