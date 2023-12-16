package X;

import android.text.SpannableStringBuilder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.7oA  reason: invalid class name and case insensitive filesystem */
public final class C160707oA {
    public List A00;
    public final long A01;
    public final long A02;
    public final C160707oA A03;
    public final C151287Ud A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final HashMap A09 = AnonymousClass001.A0t();
    public final HashMap A0A = AnonymousClass001.A0t();
    public final boolean A0B;
    public final String[] A0C;

    public static C151287Ud A01(C151287Ud r3, Map map, String[] strArr) {
        int i;
        int i2 = 0;
        if (r3 == null) {
            if (strArr == null) {
                return null;
            }
            i = strArr.length;
            if (i == 1) {
                return (C151287Ud) map.get(strArr[0]);
            }
            if (i <= 1) {
                return r3;
            }
            r3 = new C151287Ud();
        } else if (strArr == null) {
            return r3;
        } else {
            i = strArr.length;
            if (i == 1) {
                r3.A00((C151287Ud) map.get(strArr[0]));
                return r3;
            } else if (i <= 1) {
                return r3;
            }
        }
        do {
            r3.A00((C151287Ud) map.get(strArr[i2]));
            i2++;
        } while (i2 < i);
        return r3;
    }

    public final void A04(String str, Map map, long j, boolean z) {
        boolean z2;
        String str2 = str;
        HashMap hashMap = this.A0A;
        hashMap.clear();
        HashMap hashMap2 = this.A09;
        hashMap2.clear();
        String str3 = this.A07;
        if (!"metadata".equals(str3)) {
            String str4 = this.A06;
            if (!"".equals(str4)) {
                str2 = str4;
            }
            Map map2 = map;
            if (this.A0B && z) {
                SpannableStringBuilder A002 = A00(str2, map);
                String str5 = this.A08;
                str5.getClass();
                A002.append(str5);
            } else if (!"br".equals(str3) || !z) {
                long j2 = j;
                if (A07(j)) {
                    Iterator A0q = AnonymousClass000.A0q(map);
                    while (A0q.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(A0q);
                        Object key = A0w.getKey();
                        CharSequence charSequence = ((C157757ip) A0w.getValue()).A0E;
                        charSequence.getClass();
                        AnonymousClass0x2.A1I(key, hashMap, charSequence.length());
                    }
                    boolean equals = "p".equals(str3);
                    for (int i = 0; i < C86614Ku.A08(this.A00); i++) {
                        C160707oA A022 = A02(i);
                        if (!z) {
                            z2 = false;
                            if (!equals) {
                                A022.A04(str2, map2, j2, z2);
                            }
                        }
                        z2 = true;
                        A022.A04(str2, map2, j2, z2);
                    }
                    if (equals) {
                        SpannableStringBuilder A003 = A00(str2, map);
                        int length = A003.length();
                        while (true) {
                            length--;
                            if (length < 0) {
                                break;
                            } else if (A003.charAt(length) != ' ') {
                                if (A003.charAt(length) != 10) {
                                    A003.append(10);
                                }
                            }
                        }
                    }
                    Iterator A0q2 = AnonymousClass000.A0q(map);
                    while (A0q2.hasNext()) {
                        Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
                        Object key2 = A0w2.getKey();
                        CharSequence charSequence2 = ((C157757ip) A0w2.getValue()).A0E;
                        charSequence2.getClass();
                        AnonymousClass0x2.A1I(key2, hashMap2, charSequence2.length());
                    }
                }
            } else {
                A00(str2, map).append(10);
            }
        }
    }

    public C160707oA A02(int i) {
        List list = this.A00;
        if (list != null) {
            return (C160707oA) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final void A03(String str, List list, long j) {
        String str2;
        String str3 = this.A06;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (!A07(j) || !"div".equals(this.A07) || (str2 = this.A05) == null) {
            for (int i = 0; i < C86614Ku.A08(this.A00); i++) {
                A02(i).A03(str, list, j);
            }
            return;
        }
        list.add(AnonymousClass0x9.A0C(str, str2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r13 == 1) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.lang.String r27, java.util.Map r28, java.util.Map r29, java.util.Map r30, long r31) {
        /*
            r26 = this;
            r25 = r27
            r11 = r26
            r23 = r31
            r0 = r23
            boolean r0 = r11.A07(r0)
            if (r0 == 0) goto L_0x01ff
            java.lang.String r0 = ""
            java.lang.String r1 = r11.A06
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001a
            r25 = r1
        L_0x001a:
            java.util.HashMap r0 = r11.A09
            java.util.Iterator r17 = X.AnonymousClass001.A0u(r0)
        L_0x0020:
            boolean r0 = r17.hasNext()
            r10 = 0
            r18 = r28
            r5 = r29
            r4 = r30
            if (r0 == 0) goto L_0x01f6
            java.util.Map$Entry r3 = X.AnonymousClass001.A0w(r17)
            java.lang.Object r2 = r3.getKey()
            java.util.HashMap r1 = r11.A0A
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0041
            int r10 = X.AnonymousClass6C8.A0D(r2, r1)
        L_0x0041:
            int r12 = X.AnonymousClass0x2.A08(r3)
            if (r10 == r12) goto L_0x0020
            java.lang.Object r9 = r4.get(r2)
            r9.getClass()
            X.7ip r9 = (X.C157757ip) r9
            r0 = r25
            java.lang.Object r0 = r5.get(r0)
            r0.getClass()
            X.7Po r0 = (X.C150177Po) r0
            int r13 = r0.A08
            X.7Ud r2 = r11.A04
            java.lang.String[] r1 = r11.A0C
            r0 = r18
            X.7Ud r8 = A01(r2, r0, r1)
            java.lang.CharSequence r7 = r9.A0E
            android.text.SpannableStringBuilder r7 = (android.text.SpannableStringBuilder) r7
            if (r7 != 0) goto L_0x0074
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            r9.A0E = r7
        L_0x0074:
            if (r8 == 0) goto L_0x0020
            X.7oA r6 = r11.A03
            int r4 = r8.A03
            r1 = -1
            if (r4 != r1) goto L_0x01d7
            int r0 = r8.A06
            if (r0 != r1) goto L_0x01d7
        L_0x0081:
            r5 = 33
            r4 = -1
            if (r1 == r4) goto L_0x008e
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            r7.setSpan(r0, r10, r12, r5)
        L_0x008e:
            int r0 = r8.A07
            r15 = 1
            if (r0 != r15) goto L_0x009b
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r7.setSpan(r0, r10, r12, r5)
        L_0x009b:
            int r0 = r8.A0B
            if (r0 != r15) goto L_0x00a7
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r7.setSpan(r0, r10, r12, r5)
        L_0x00a7:
            boolean r0 = r8.A0H
            if (r0 == 0) goto L_0x00b5
            int r1 = r8.A04
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            X.C1001259n.A00(r7, r0, r10, r12)
        L_0x00b5:
            boolean r0 = r8.A0G
            if (r0 == 0) goto L_0x00c3
            int r1 = r8.A02
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            r0.<init>(r1)
            X.C1001259n.A00(r7, r0, r10, r12)
        L_0x00c3:
            java.lang.String r1 = r8.A0E
            if (r1 == 0) goto L_0x00cf
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r1)
            X.C1001259n.A00(r7, r0, r10, r12)
        L_0x00cf:
            X.7go r0 = r8.A0D
            r3 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x00ee
            int r14 = r0.A01
            if (r14 != r4) goto L_0x01d3
            if (r13 == r2) goto L_0x00df
            r14 = 1
            if (r13 != r15) goto L_0x00e0
        L_0x00df:
            r14 = 3
        L_0x00e0:
            int r13 = r0.A02
            r0 = -2
            if (r13 != r0) goto L_0x00e6
            r13 = 1
        L_0x00e6:
            X.7Jg r0 = new X.7Jg
            r0.<init>(r14, r15, r13)
            X.C1001259n.A00(r7, r0, r10, r12)
        L_0x00ee:
            int r13 = r8.A09
            if (r13 == r2) goto L_0x014b
            if (r13 == r3) goto L_0x0145
            r0 = 4
            if (r13 == r0) goto L_0x0145
        L_0x00f7:
            int r0 = r8.A0A
            if (r0 != r1) goto L_0x0103
            X.72D r0 = new X.72D
            r0.<init>()
            X.C1001259n.A00(r7, r0, r10, r12)
        L_0x0103:
            int r0 = r8.A05
            if (r0 == r1) goto L_0x013c
            if (r0 == r2) goto L_0x0139
            if (r0 != r3) goto L_0x0118
            float r1 = r8.A00
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
        L_0x0110:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            r0.<init>(r1)
        L_0x0115:
            X.C1001259n.A00(r7, r0, r10, r12)
        L_0x0118:
            float r2 = r8.A01
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0133
            java.lang.String r1 = "p"
            java.lang.String r0 = r11.A07
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0133
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r0
            r9.A03 = r2
        L_0x0133:
            android.text.Layout$Alignment r0 = r8.A0C
            r9.A0D = r0
            goto L_0x0020
        L_0x0139:
            float r1 = r8.A00
            goto L_0x0110
        L_0x013c:
            float r0 = r8.A00
            int r2 = (int) r0
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            r0.<init>(r2, r1)
            goto L_0x0115
        L_0x0145:
            X.72E r0 = new X.72E
            r0.<init>()
            goto L_0x01ac
        L_0x014b:
            if (r6 == 0) goto L_0x00f7
            X.7Ud r14 = r6.A04
            java.lang.String[] r13 = r6.A0C
            r0 = r18
            X.7Ud r0 = A01(r14, r0, r13)
            if (r0 == 0) goto L_0x01c7
            int r0 = r0.A09
            if (r0 != r1) goto L_0x01c7
            java.util.ArrayDeque r16 = X.AnonymousClass6CA.A0a()
            r0 = r16
            r0.push(r6)
        L_0x0166:
            boolean r0 = r16.isEmpty()
            if (r0 != 0) goto L_0x00f7
            java.lang.Object r13 = r16.pop()
            X.7oA r13 = (X.C160707oA) r13
            X.7Ud r0 = r13.A04
            r14 = r0
            java.lang.String[] r0 = r13.A0C
            r19 = r0
            r0 = r18
            r15 = r0
            r0 = r19
            X.7Ud r0 = A01(r14, r15, r0)
            if (r0 == 0) goto L_0x01b1
            int r0 = r0.A09
            if (r0 != r3) goto L_0x01b1
            java.util.List r0 = r13.A00
            if (r0 == 0) goto L_0x01ca
            int r0 = r0.size()
            if (r0 != r1) goto L_0x01ca
            r14 = 0
            X.7oA r0 = r13.A02(r14)
            java.lang.String r0 = r0.A08
            if (r0 == 0) goto L_0x01ca
            X.7oA r0 = r13.A02(r14)
            java.lang.String r13 = r0.A08
            X.7Ud r0 = r6.A04
            if (r0 == 0) goto L_0x01a7
            int r4 = r0.A08
        L_0x01a7:
            X.7G8 r0 = new X.7G8
            r0.<init>(r13, r4)
        L_0x01ac:
            r7.setSpan(r0, r10, r12, r5)
            goto L_0x00f7
        L_0x01b1:
            java.util.List r0 = r13.A00
            if (r0 == 0) goto L_0x0166
            int r15 = r0.size()
        L_0x01b9:
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x0166
            X.7oA r14 = r13.A02(r15)
            r0 = r16
            r0.push(r14)
            goto L_0x01b9
        L_0x01c7:
            X.7oA r6 = r6.A03
            goto L_0x014b
        L_0x01ca:
            java.lang.String r4 = "TtmlRenderUtil"
            java.lang.String r0 = "Skipping rubyText node without exactly one text child."
            android.util.Log.i(r4, r0)
            goto L_0x00f7
        L_0x01d3:
            int r15 = r0.A00
            goto L_0x00e0
        L_0x01d7:
            r3 = 0
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1U(r4, r2)
            int r0 = r8.A06
            if (r0 != r2) goto L_0x01e2
            r3 = 2
        L_0x01e2:
            r1 = r1 | r3
            goto L_0x0081
        L_0x01e5:
            X.7oA r16 = r11.A02(r10)
            r17 = r25
            r19 = r5
            r20 = r4
            r21 = r23
            r16.A05(r17, r18, r19, r20, r21)
            int r10 = r10 + 1
        L_0x01f6:
            java.util.List r0 = r11.A00
            int r0 = X.C86614Ku.A08(r0)
            if (r10 >= r0) goto L_0x01ff
            goto L_0x01e5
        L_0x01ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160707oA.A05(java.lang.String, java.util.Map, java.util.Map, java.util.Map, long):void");
    }

    public final void A06(TreeSet treeSet, boolean z) {
        boolean z2;
        String str = this.A07;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.A05 != null)) {
            long j = this.A02;
            if (j != -9223372036854775807L) {
                AnonymousClass0x2.A1Q(treeSet, j);
            }
            long j2 = this.A01;
            if (j2 != -9223372036854775807L) {
                AnonymousClass0x2.A1Q(treeSet, j2);
            }
        }
        if (this.A00 != null) {
            for (int i = 0; i < this.A00.size(); i++) {
                C160707oA r1 = (C160707oA) this.A00.get(i);
                if (!z) {
                    z2 = false;
                    if (!equals) {
                        r1.A06(treeSet, z2);
                    }
                }
                z2 = true;
                r1.A06(treeSet, z2);
            }
        }
    }

    public boolean A07(long j) {
        long j2 = this.A02;
        if (j2 == -9223372036854775807L && this.A01 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && this.A01 == -9223372036854775807L) {
            return true;
        }
        if (j2 == -9223372036854775807L && j < this.A01) {
            return true;
        }
        if (j2 > j || j >= this.A01) {
            return false;
        }
        return true;
    }

    public C160707oA(C160707oA r2, C151287Ud r3, String str, String str2, String str3, String str4, String[] strArr, long j, long j2) {
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str4;
        this.A04 = r3;
        this.A0C = strArr;
        this.A0B = AnonymousClass000.A1W(str2);
        this.A02 = j;
        this.A01 = j2;
        str3.getClass();
        this.A06 = str3;
        this.A03 = r2;
    }

    public static SpannableStringBuilder A00(String str, Map map) {
        if (!map.containsKey(str)) {
            C157757ip r1 = new C157757ip();
            r1.A0E = new SpannableStringBuilder();
            map.put(str, r1);
        }
        CharSequence charSequence = ((C157757ip) map.get(str)).A0E;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }
}
