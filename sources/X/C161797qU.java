package X;

import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7qU  reason: invalid class name and case insensitive filesystem */
public abstract class C161797qU {
    public List A00;
    public List A01;
    public Map A02;
    public Map A03;
    public final C141236vF A04;
    public final List A05;

    public static StringBuilder A06(C161797qU r2) {
        StringBuilder sb = new StringBuilder();
        sb.append(r2.A0E());
        return sb;
    }

    public static void A07(AnonymousClass7XT r1, C157267i1 r2, int i) {
        if (i != 0) {
            r1.A01(A05(r2.A00.B6x()));
        }
    }

    public static void A09(C157267i1 r3, List list, Map map) {
        Class<?> cls = r3.A00.getClass();
        if (map.put(cls, r3) != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                if (((C157267i1) list.get(size)).A00.getClass() == cls) {
                    list.remove(size);
                } else {
                    size--;
                }
            }
            throw AnonymousClass001.A0e("Binder Map and Binder List out of sync!");
        }
        list.add(r3);
    }

    public static void A0A(Object obj, Object obj2, List list, List list2, List list3, List list4, Map map) {
        if (list == null || list.isEmpty()) {
            if (list2 != null) {
                list3.addAll(list2);
            }
        } else if (list2 == null || list2.isEmpty()) {
            list4.addAll(list);
        } else {
            HashMap hashMap = new HashMap(list2.size());
            for (int i = 0; i < list2.size(); i++) {
                C157267i1 r5 = (C157267i1) list2.get(i);
                Class<?> cls = r5.A00.getClass();
                C157267i1 r0 = (C157267i1) map.get(cls);
                if (r0 != null) {
                    boolean Bob = r5.A00.Bob(r0.A01, r5.A01, obj, obj2);
                    hashMap.put(cls, Boolean.valueOf(Bob));
                    if (!Bob) {
                    }
                }
                list3.add(r5);
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                C157267i1 r2 = (C157267i1) list.get(i2);
                Class<?> cls2 = r2.A00.getClass();
                if (!hashMap.containsKey(cls2) || AnonymousClass001.A1Z(hashMap.get(cls2))) {
                    list4.add(r2);
                }
            }
        }
    }

    public long A0B() {
        if (this instanceof AnonymousClass6ND) {
            return ((AnonymousClass6ND) this).A03;
        }
        if (this instanceof AnonymousClass6NB) {
            return ((AnonymousClass6NB) this).A01;
        }
        if (this instanceof AnonymousClass6NC) {
            return ((AnonymousClass6NC) this).A00;
        }
        if (this instanceof AnonymousClass6NE) {
            return ((AnonymousClass6NE) this).A0C;
        }
        if (this instanceof AnonymousClass6N8) {
            return ((AnonymousClass6N8) this).A00.A00;
        }
        if (this instanceof AnonymousClass6N9) {
            return ((AnonymousClass6N9) this).A00.A0B();
        }
        return 0;
    }

    public C184838sd A0C() {
        if (this instanceof AnonymousClass6ND) {
            return (AnonymousClass6ND) this;
        }
        if (this instanceof AnonymousClass6NB) {
            return (AnonymousClass6NB) this;
        }
        if (this instanceof AnonymousClass6NC) {
            return (AnonymousClass6NC) this;
        }
        if (this instanceof AnonymousClass6NE) {
            return (AnonymousClass6NE) this;
        }
        if (this instanceof AnonymousClass6N8) {
            return ((AnonymousClass6N8) this).A00.A01;
        }
        if (!(this instanceof AnonymousClass6N9)) {
            return (AnonymousClass6NA) this;
        }
        C184838sd A0C = ((AnonymousClass6N9) this).A00.A0C();
        C162457s7.A0D(A0C);
        return A0C;
    }

    public Class A0D() {
        if (!(this instanceof AnonymousClass6N9)) {
            return getClass();
        }
        Class A0D = ((AnonymousClass6N9) this).A00.A0D();
        C162457s7.A0D(A0D);
        return A0D;
    }

    public String A0E() {
        String A0E;
        if (this instanceof AnonymousClass6N8) {
            A0E = C1443371d.A01(this);
        } else if (!(this instanceof AnonymousClass6N9)) {
            return C1443371d.A01(this);
        } else {
            A0E = ((AnonymousClass6N9) this).A00.A0E();
        }
        C162457s7.A0D(A0E);
        return A0E;
    }

    public void A0G(Context context, AnonymousClass7JD r9, AnonymousClass7XT r10, Object obj, Object obj2) {
        if (this.A00 != null) {
            boolean A022 = r10.A02();
            int size = this.A00.size();
            if (A022) {
                A08(r10, ":attach", A06(this));
            }
            for (int i = 0; i < size; i++) {
                C157267i1 r0 = (C157267i1) this.A00.get(i);
                A07(r10, r0, A022 ? 1 : 0);
                C185318tS r1 = r0.A00;
                Object Axn = r1.Axn(context, obj, r0.A01, obj2);
                Class<?> cls = r1.getClass();
                C162457s7.A0J(cls, 1);
                if (Axn != null) {
                    Map map = r9.A00;
                    if (map == null) {
                        map = new LinkedHashMap(size);
                    }
                    map.put(cls, Axn);
                    if (r9.A00 == null) {
                        r9.A00 = map;
                    }
                }
                if (A022) {
                    r10.A00();
                }
            }
            if (A022) {
                r10.A00();
            }
        }
    }

    public void A0H(Context context, AnonymousClass7JD r7, AnonymousClass7XT r8, Object obj, Object obj2) {
        Object obj3;
        if (this.A00 != null) {
            boolean A022 = r8.A02();
            if (A022) {
                A08(r8, ":detach", A06(this));
            }
            int size = this.A00.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C157267i1 r2 = (C157267i1) this.A00.get(size);
                A07(r8, r2, A022 ? 1 : 0);
                Class<?> cls = r2.A00.getClass();
                C162457s7.A0J(cls, 0);
                Map map = r7.A00;
                if (map != null) {
                    obj3 = map.remove(cls);
                } else {
                    obj3 = null;
                }
                r2.A01(context, obj, obj2, obj3);
                if (A022) {
                    r8.A00();
                }
            }
            if (A022) {
                r8.A00();
            }
        }
    }

    public void A0J(Context context, AnonymousClass7JD r9, AnonymousClass7XT r10, Object obj, Object obj2) {
        Object obj3;
        if (this.A01 != null) {
            boolean A022 = r10.A02();
            if (A022) {
                A08(r10, ":unmount-optional", A06(this));
            }
            int size = this.A01.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C157267i1 r2 = (C157267i1) this.A01.get(size);
                A07(r10, r2, A022 ? 1 : 0);
                Class<?> cls = r2.A00.getClass();
                C162457s7.A0J(cls, 0);
                Map map = r9.A01;
                if (map != null) {
                    obj3 = map.remove(cls);
                } else {
                    obj3 = null;
                }
                r2.A01(context, obj, obj2, obj3);
                if (A022) {
                    r10.A00();
                }
            }
            if (A022) {
                r10.A00();
            }
        }
        boolean A023 = r10.A02();
        if (A023) {
            A08(r10, ":unmount-fixed", A06(this));
        }
        List list = this.A05;
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            C157267i1 r3 = (C157267i1) list.get(size2);
            A07(r10, r3, A023 ? 1 : 0);
            Object[] objArr = r9.A02;
            Object obj4 = null;
            if (objArr != null) {
                Object obj5 = objArr[size2];
                objArr[size2] = null;
                obj4 = obj5;
            }
            r3.A01(context, obj, obj2, obj4);
            if (A023) {
                r10.A00();
            }
        }
        if (A023) {
            r10.A00();
        }
    }

    public void A0K(C157267i1 r3) {
        List list = this.A00;
        if (list == null) {
            list = AnonymousClass001.A0s();
            this.A00 = list;
            if (this.A02 == null) {
                this.A02 = AnonymousClass001.A0t();
            } else {
                throw AnonymousClass001.A0e("Binder Map and Binder List out of sync!");
            }
        }
        A09(r3, list, this.A02);
    }

    public void A0L(C157267i1 r3) {
        List list = this.A01;
        if (list == null) {
            list = AnonymousClass001.A0s();
            this.A01 = list;
            if (this.A03 == null) {
                this.A03 = AnonymousClass001.A0t();
            } else {
                throw AnonymousClass001.A0e("Binder Map and Binder List out of sync!");
            }
        }
        A09(r3, list, this.A03);
    }

    public C141236vF BC5() {
        return this.A04;
    }

    public C161797qU(C141236vF r4) {
        this(r4, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public static String A05(String str) {
        if (str.length() > 127) {
            return AnonymousClass0x7.A0r(str, 127);
        }
        return str;
    }

    public static void A08(AnonymousClass7XT r1, String str, StringBuilder sb) {
        sb.append(str);
        r1.A01(A05(sb.toString()));
    }

    public void A0I(Context context, AnonymousClass7JD r9, AnonymousClass7XT r10, Object obj, Object obj2) {
        Object[] objArr;
        boolean A022 = r10.A02();
        List list = this.A05;
        int size = list.size();
        if (A022) {
            A08(r10, ":mount-fixed", A06(this));
        }
        for (int i = 0; i < size; i++) {
            C157267i1 r0 = (C157267i1) list.get(i);
            A07(r10, r0, A022 ? 1 : 0);
            Object Axn = r0.A00.Axn(context, obj, r0.A01, obj2);
            if (Axn != null) {
                Object[] objArr2 = r9.A02;
                if (objArr2 == null) {
                    objArr = new Object[size];
                } else {
                    objArr = objArr2;
                }
                objArr[i] = Axn;
                if (objArr2 == null) {
                    r9.A02 = objArr;
                }
            }
            if (A022) {
                r10.A00();
            }
        }
        if (A022) {
            r10.A00();
        }
        if (this.A01 != null) {
            boolean A023 = r10.A02();
            int size2 = this.A01.size();
            if (A023) {
                A08(r10, ":mount-optional", A06(this));
            }
            for (int i2 = 0; i2 < size2; i2++) {
                C157267i1 r02 = (C157267i1) this.A01.get(i2);
                A07(r10, r02, A023 ? 1 : 0);
                C185318tS r1 = r02.A00;
                Object Axn2 = r1.Axn(context, obj, r02.A01, obj2);
                Class<?> cls = r1.getClass();
                C162457s7.A0J(cls, 1);
                if (Axn2 != null) {
                    Map map = r9.A01;
                    if (map == null) {
                        map = new LinkedHashMap(size2);
                    }
                    map.put(cls, Axn2);
                    if (r9.A01 == null) {
                        r9.A01 = map;
                    }
                }
                if (A023) {
                    r10.A00();
                }
            }
            if (A023) {
                r10.A00();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0113, code lost:
        if (r4 != false) goto L_0x0115;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x014c A[EDGE_INSN: B:157:0x014c->B:62:0x014c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(android.content.Context r33, X.AnonymousClass7JD r34, X.AnonymousClass7ON r35, X.AnonymousClass7XT r36, X.C161797qU r37, java.lang.Object r38, java.lang.Object r39, java.lang.Object r40, boolean r41) {
        /*
            r32 = this;
            r7 = r36
            boolean r4 = r7.A02()
            r10 = r32
            java.util.List r0 = r10.A00
            if (r0 != 0) goto L_0x00c4
            r0 = 0
        L_0x000d:
            java.util.ArrayList r24 = X.AnonymousClass002.A0I(r0)
            r12 = r37
            java.util.List r0 = r12.A00
            if (r0 != 0) goto L_0x00be
            r0 = 0
        L_0x0018:
            java.util.ArrayList r16 = X.AnonymousClass002.A0I(r0)
            java.util.List r0 = r10.A01
            if (r0 != 0) goto L_0x00b8
            r0 = 0
        L_0x0021:
            java.util.ArrayList r11 = X.AnonymousClass002.A0I(r0)
            java.util.List r0 = r12.A01
            if (r0 != 0) goto L_0x00b2
            r0 = 0
        L_0x002a:
            java.util.ArrayList r1 = X.AnonymousClass002.A0I(r0)
            java.util.List r3 = r12.A05
            java.util.List r2 = r10.A05
            boolean r0 = r3.isEmpty()
            r22 = 0
            r13 = r39
            r5 = r40
            if (r0 == 0) goto L_0x0081
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0081
        L_0x0044:
            java.util.List r8 = r12.A00
            java.util.List r6 = r10.A00
            java.util.Map r0 = r12.A02
            r25 = r13
            r26 = r5
            r27 = r8
            r28 = r6
            r29 = r24
            r30 = r16
            r31 = r0
            A0A(r25, r26, r27, r28, r29, r30, r31)
            java.util.List r8 = r12.A01
            java.util.List r6 = r10.A01
            java.util.Map r0 = r12.A03
            r27 = r8
            r28 = r6
            r29 = r11
            r30 = r1
            r31 = r0
            A0A(r25, r26, r27, r28, r29, r30, r31)
            r0 = r35
            if (r35 == 0) goto L_0x00ca
            java.util.List r8 = r0.A04
            int r6 = r8.size()
            r0 = 0
        L_0x0079:
            if (r0 >= r6) goto L_0x00ca
            r8.get(r0)
            int r0 = r0 + 1
            goto L_0x0079
        L_0x0081:
            int r6 = r3.size()
            int r0 = r2.size()
            if (r6 != r0) goto L_0x028c
            r6 = 0
        L_0x008c:
            int r0 = r3.size()
            if (r6 >= r0) goto L_0x0044
            java.lang.Object r8 = r3.get(r6)
            X.7i1 r8 = (X.C157267i1) r8
            java.lang.Object r0 = r2.get(r6)
            X.7i1 r0 = (X.C157267i1) r0
            X.8tS r9 = r0.A00
            java.lang.Object r8 = r8.A01
            java.lang.Object r0 = r0.A01
            boolean r0 = r9.Bob(r8, r0, r13, r5)
            if (r0 == 0) goto L_0x00af
            r8 = 1
            long r8 = r8 << r6
            long r22 = r22 | r8
        L_0x00af:
            int r6 = r6 + 1
            goto L_0x008c
        L_0x00b2:
            int r0 = r0.size()
            goto L_0x002a
        L_0x00b8:
            int r0 = r0.size()
            goto L_0x0021
        L_0x00be:
            int r0 = r0.size()
            goto L_0x0018
        L_0x00c4:
            int r0 = r0.size()
            goto L_0x000d
        L_0x00ca:
            r9 = r33
            r8 = r34
            r6 = r38
            if (r41 == 0) goto L_0x0113
            if (r4 == 0) goto L_0x00dd
            java.lang.StringBuilder r12 = A06(r10)
            java.lang.String r0 = ":detach"
            A08(r7, r0, r12)
        L_0x00dd:
            int r12 = r16.size()
        L_0x00e1:
            int r12 = r12 + -1
            if (r12 < 0) goto L_0x010d
            r0 = r16
            java.lang.Object r14 = r0.get(r12)
            X.7i1 r14 = (X.C157267i1) r14
            A07(r7, r14, r4)
            X.8tS r0 = r14.A00
            java.lang.Class r15 = r0.getClass()
            r0 = 0
            X.C162457s7.A0J(r15, r0)
            java.util.Map r0 = r8.A00
            if (r0 == 0) goto L_0x010b
            java.lang.Object r0 = r0.remove(r15)
        L_0x0102:
            r14.A01(r9, r6, r13, r0)
            if (r4 == 0) goto L_0x00e1
            r7.A00()
            goto L_0x00e1
        L_0x010b:
            r0 = 0
            goto L_0x0102
        L_0x010d:
            if (r4 == 0) goto L_0x011e
            r7.A00()
            goto L_0x0115
        L_0x0113:
            if (r4 == 0) goto L_0x011e
        L_0x0115:
            java.lang.StringBuilder r12 = A06(r10)
            java.lang.String r0 = ":unmount-optional"
            A08(r7, r0, r12)
        L_0x011e:
            int r14 = r1.size()
        L_0x0122:
            int r14 = r14 + -1
            if (r14 < 0) goto L_0x014c
            java.lang.Object r12 = r1.get(r14)
            X.7i1 r12 = (X.C157267i1) r12
            A07(r7, r12, r4)
            X.8tS r0 = r12.A00
            java.lang.Class r15 = r0.getClass()
            r0 = 0
            X.C162457s7.A0J(r15, r0)
            java.util.Map r0 = r8.A01
            if (r0 == 0) goto L_0x014a
            java.lang.Object r0 = r0.remove(r15)
        L_0x0141:
            r12.A01(r9, r6, r13, r0)
            if (r4 == 0) goto L_0x0122
            r7.A00()
            goto L_0x0122
        L_0x014a:
            r0 = 0
            goto L_0x0141
        L_0x014c:
            if (r4 == 0) goto L_0x0151
            r7.A00()
        L_0x0151:
            r20 = 1
            r18 = 0
            int r0 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x01dd
            if (r4 == 0) goto L_0x0164
            java.lang.StringBuilder r1 = A06(r10)
            java.lang.String r0 = ":unmount-fixed"
            A08(r7, r0, r1)
        L_0x0164:
            int r15 = X.AnonymousClass002.A03(r2)
        L_0x0168:
            if (r15 < 0) goto L_0x0190
            long r0 = r20 << r15
            long r16 = r22 & r0
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x018d
            java.lang.Object r14 = r3.get(r15)
            X.7i1 r14 = (X.C157267i1) r14
            A07(r7, r14, r4)
            java.lang.Object[] r12 = r8.A02
            r1 = 0
            if (r12 == 0) goto L_0x0185
            r0 = r12[r15]
            r12[r15] = r1
            r1 = r0
        L_0x0185:
            r14.A01(r9, r6, r13, r1)
            if (r4 == 0) goto L_0x018d
            r7.A00()
        L_0x018d:
            int r15 = r15 + -1
            goto L_0x0168
        L_0x0190:
            if (r4 == 0) goto L_0x0195
            r7.A00()
        L_0x0195:
            int r13 = r2.size()
            if (r4 == 0) goto L_0x01a4
            java.lang.StringBuilder r1 = A06(r10)
            java.lang.String r0 = ":mount-fixed"
            A08(r7, r0, r1)
        L_0x01a4:
            r12 = 0
        L_0x01a5:
            if (r12 >= r13) goto L_0x01d8
            long r0 = r20 << r12
            long r14 = r22 & r0
            int r0 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r0 = r2.get(r12)
            X.7i1 r0 = (X.C157267i1) r0
            A07(r7, r0, r4)
            X.8tS r1 = r0.A00
            java.lang.Object r0 = r0.A01
            java.lang.Object r3 = r1.Axn(r9, r6, r0, r5)
            if (r3 == 0) goto L_0x01ce
            java.lang.Object[] r1 = r8.A02
            if (r1 != 0) goto L_0x01d6
            java.lang.Object[] r0 = new java.lang.Object[r13]
        L_0x01c8:
            r0[r12] = r3
            if (r1 != 0) goto L_0x01ce
            r8.A02 = r0
        L_0x01ce:
            if (r4 == 0) goto L_0x01d3
            r7.A00()
        L_0x01d3:
            int r12 = r12 + 1
            goto L_0x01a5
        L_0x01d6:
            r0 = r1
            goto L_0x01c8
        L_0x01d8:
            if (r4 == 0) goto L_0x01dd
            r7.A00()
        L_0x01dd:
            java.util.List r0 = r10.A01
            if (r0 == 0) goto L_0x022c
            int r13 = r0.size()
        L_0x01e5:
            if (r4 == 0) goto L_0x01f0
            java.lang.StringBuilder r1 = A06(r10)
            java.lang.String r0 = ":mount-optional"
            A08(r7, r0, r1)
        L_0x01f0:
            r12 = 0
        L_0x01f1:
            int r0 = r11.size()
            if (r12 >= r0) goto L_0x022e
            java.lang.Object r0 = r11.get(r12)
            X.7i1 r0 = (X.C157267i1) r0
            A07(r7, r0, r4)
            X.8tS r1 = r0.A00
            java.lang.Object r0 = r0.A01
            java.lang.Object r3 = r1.Axn(r9, r6, r0, r5)
            java.lang.Class r2 = r1.getClass()
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            if (r3 == 0) goto L_0x0224
            java.util.Map r1 = r8.A01
            if (r1 != 0) goto L_0x021b
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r13)
        L_0x021b:
            r1.put(r2, r3)
            java.util.Map r0 = r8.A01
            if (r0 != 0) goto L_0x0224
            r8.A01 = r1
        L_0x0224:
            if (r4 == 0) goto L_0x0229
            r7.A00()
        L_0x0229:
            int r12 = r12 + 1
            goto L_0x01f1
        L_0x022c:
            r13 = 0
            goto L_0x01e5
        L_0x022e:
            if (r4 == 0) goto L_0x0233
            r7.A00()
        L_0x0233:
            java.util.List r0 = r10.A00
            if (r0 == 0) goto L_0x0284
            int r11 = r0.size()
        L_0x023b:
            if (r4 == 0) goto L_0x0246
            java.lang.StringBuilder r1 = A06(r10)
            java.lang.String r0 = ":attach"
            A08(r7, r0, r1)
        L_0x0246:
            r10 = 0
        L_0x0247:
            int r0 = r24.size()
            if (r10 >= r0) goto L_0x0286
            r0 = r24
            java.lang.Object r0 = r0.get(r10)
            X.7i1 r0 = (X.C157267i1) r0
            A07(r7, r0, r4)
            X.8tS r1 = r0.A00
            java.lang.Object r0 = r0.A01
            java.lang.Object r3 = r1.Axn(r9, r6, r0, r5)
            java.lang.Class r2 = r1.getClass()
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            if (r3 == 0) goto L_0x027c
            java.util.Map r1 = r8.A00
            if (r1 != 0) goto L_0x0273
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r11)
        L_0x0273:
            r1.put(r2, r3)
            java.util.Map r0 = r8.A00
            if (r0 != 0) goto L_0x027c
            r8.A00 = r1
        L_0x027c:
            if (r4 == 0) goto L_0x0281
            r7.A00()
        L_0x0281:
            int r10 = r10 + 1
            goto L_0x0247
        L_0x0284:
            r11 = 0
            goto L_0x023b
        L_0x0286:
            if (r4 == 0) goto L_0x028b
            r7.A00()
        L_0x028b:
            return
        L_0x028c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Current and new fixed Mount Binders are of sync: \ncurrentFixedBinders.size() = "
            X.AnonymousClass000.A1H(r0, r1, r3)
            java.lang.String r0 = "\nnewFixedBinders.size() = "
            X.AnonymousClass000.A1H(r0, r1, r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161797qU.A0F(android.content.Context, X.7JD, X.7ON, X.7XT, X.7qU, java.lang.Object, java.lang.Object, java.lang.Object, boolean):void");
    }

    public C161797qU(C141236vF r4, List list, List list2, List list3) {
        if (list == null || list.size() <= 64) {
            this.A04 = r4;
            this.A05 = list;
            for (int i = 0; i < list2.size(); i++) {
                A0L((C157267i1) list2.get(i));
            }
            for (int i2 = 0; i2 < list3.size(); i2++) {
                A0K((C157267i1) list3.get(i2));
            }
            return;
        }
        throw AnonymousClass001.A0e("Too many fixed mount binders. Max is 64");
    }
}
