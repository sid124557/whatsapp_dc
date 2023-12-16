package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7ol  reason: invalid class name and case insensitive filesystem */
public final class C160977ol {
    public static final Map A01(String str, Map map, Map map2) {
        C162457s7.A0J(map, 0);
        if (str == null) {
            return map;
        }
        if (str.equals("$")) {
            return map2;
        }
        if (str.equals("#")) {
            if (map2 == null) {
                map2 = C73813g7.A0A();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.putAll(map2);
            return linkedHashMap;
        } else if (!str.startsWith("$.")) {
            throw AnonymousClass0x9.A0i("FcsStateIoUtils/createPath/path should start with '$.'");
        } else if (!C175728Zm.A0S(str, "[", false)) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
            Map map3 = linkedHashMap2;
            for (Object next : AnonymousClass2AB.A02(C175728Zm.A0J("$.", str), ".")) {
                if (!map3.containsKey(next) || !(map3.get(next) instanceof Map)) {
                    map3.put(next, C18320x8.A0r());
                }
                Object obj = map3.get(next);
                C162457s7.A0K(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                map3 = AnonymousClass360.A02(obj);
            }
            C157307i5 A00 = C159957ml.A00(linkedHashMap2);
            C159957ml A002 = C157307i5.A00(str, new C181468mo[0]);
            Object obj2 = A00.A01;
            AnonymousClass7TV r7 = A00.A00;
            C141926wM r8 = C141926wM.AS_PATH_LIST;
            EnumSet<E> noneOf = EnumSet.noneOf(C141926wM.class);
            noneOf.addAll(r7.A03);
            noneOf.addAll(Arrays.asList(new C141926wM[]{r8}));
            AnonymousClass7TU r1 = new AnonymousClass7TU();
            r1.A00 = r7.A00;
            r1.A01 = r7.A01;
            r1.A03.addAll(noneOf);
            Collection collection = r7.A02;
            if (collection == null) {
                collection = Collections.emptyList();
            }
            r1.A02 = collection;
            AnonymousClass7TV A003 = r1.A00();
            C160947oi.A03(obj2, "json can not be null");
            C160947oi.A03(A003, "configuration can not be null");
            C151637Vo r3 = A002.A00;
            C158627kI r72 = new C158627kI(A003, r3, obj2, true);
            try {
                r3.A00.A03(new C131336dQ(obj2), r72, obj2, "");
            } catch (AnonymousClass8RU unused) {
            }
            if (r72.A01().isEmpty()) {
                C141926wM r0 = C141926wM.SUPPRESS_EXCEPTIONS;
                Set set = A003.A03;
                if (set.contains(r0)) {
                    boolean contains = set.contains(r8);
                    boolean contains2 = set.contains(C141926wM.ALWAYS_RETURN_LIST);
                    if (contains || contains2 || !r3.A00.A06()) {
                        ((C170598Du) A003.A00).A00.A01();
                    }
                } else {
                    throw new C131276dK();
                }
            } else {
                List list = r72.A07;
                Collections.sort(list);
                for (C172478Lh r10 : Collections.unmodifiableCollection(list)) {
                    if (r10 instanceof C131336dQ) {
                        throw new C131286dL();
                    } else if (r10 instanceof C131356dS) {
                        C131356dS r102 = (C131356dS) r10;
                        A003.A00.Bn8(r102.A00, r102.A00, map2);
                    } else if (r10 instanceof C131346dR) {
                        C131346dR r103 = (C131346dR) r10;
                        for (Object Bn8 : r103.A00) {
                            A003.A00.Bn8(r103.A00, Bn8, map2);
                        }
                    } else if (r10 instanceof C131366dT) {
                        C131366dT r104 = (C131366dT) r10;
                        A003.A00.Bli(r104.A00, r104.A00, map2);
                    }
                }
                if (A003.A03.contains(r8)) {
                    r72.A01();
                }
            }
            return (Map) A00.A01("$", new C181468mo[0]);
        } else {
            throw AnonymousClass0x9.A0i("FcsStateIoUtils/createPath/currently lacking support for arrays, filters, or multiple targets");
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.LinkedHashMap, java.util.AbstractMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass7I6 r10, java.lang.Object r11) {
        /*
            boolean r0 = r11 instanceof java.util.Map
            if (r0 == 0) goto L_0x00da
            java.util.LinkedHashMap r3 = X.C18320x8.A0r()
            java.util.Map r11 = (java.util.Map) r11
            java.util.Iterator r9 = X.AnonymousClass000.A0q(r11)
        L_0x000e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00f4
            java.util.Map$Entry r8 = X.AnonymousClass001.A0w(r9)
            java.lang.Object r0 = r8.getKey()
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r0 = r8.getKey()
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            X.C162457s7.A0K(r0, r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = ".$"
            r7 = 0
            X.C162457s7.A0J(r0, r7)
            boolean r0 = r0.endsWith(r6)
            if (r0 == 0) goto L_0x0078
            java.lang.Object r2 = r8.getValue()
            X.C162457s7.A0K(r2, r5)
            java.lang.String r2 = (java.lang.String) r2
            X.C162457s7.A0J(r2, r7)
            X.7i5 r1 = r10.A00
            if (r1 != 0) goto L_0x004f
            java.util.Map r0 = r10.A01
            X.7i5 r1 = X.C159957ml.A00(r0)
            r10.A00 = r1
        L_0x004f:
            r4 = 0
            X.8mo[] r0 = new X.C181468mo[r7]     // Catch:{ 6dK -> 0x0056 }
            java.lang.Object r4 = r1.A01(r2, r0)     // Catch:{ 6dK -> 0x0056 }
        L_0x0056:
            if (r4 != 0) goto L_0x00ad
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FcsStateIoUtils/evaluate/required path failed to evaluate. Found a null value for '"
            r1.append(r0)
            java.lang.Object r0 = r8.getKey()
            X.C162457s7.A0K(r0, r5)
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = "'."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        L_0x0078:
            java.lang.Object r0 = r8.getKey()
            X.C162457s7.A0K(r0, r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = ".$?"
            X.C162457s7.A0J(r0, r7)
            boolean r0 = r0.endsWith(r6)
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r2 = r8.getValue()
            X.C162457s7.A0K(r2, r5)
            java.lang.String r2 = (java.lang.String) r2
            X.C162457s7.A0J(r2, r7)
            X.7i5 r1 = r10.A00
            if (r1 != 0) goto L_0x00a4
            java.util.Map r0 = r10.A01
            X.7i5 r1 = X.C159957ml.A00(r0)
            r10.A00 = r1
        L_0x00a4:
            r4 = 0
            X.8mo[] r0 = new X.C181468mo[r7]     // Catch:{ 6dK -> 0x00ab }
            java.lang.Object r4 = r1.A01(r2, r0)     // Catch:{ 6dK -> 0x00ab }
        L_0x00ab:
            if (r4 == 0) goto L_0x000e
        L_0x00ad:
            java.lang.Object r0 = r8.getKey()
            X.C162457s7.A0K(r0, r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.C175728Zm.A0K(r6, r0)
            r3.put(r0, r4)
            goto L_0x000e
        L_0x00bf:
            java.lang.Object r1 = r8.getKey()
            X.C162457s7.A0K(r1, r5)
            java.lang.Object r0 = r8.getValue()
            java.lang.Object r0 = A00(r10, r0)
            r3.put(r1, r0)
            goto L_0x000e
        L_0x00d3:
            java.lang.String r0 = "FcsStateIoUtils/evaluate/key in map is not string"
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        L_0x00da:
            boolean r0 = r11 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x00f5
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            int r2 = r11.length
            r1 = 0
        L_0x00e6:
            if (r1 >= r2) goto L_0x00f4
            r0 = r11[r1]
            java.lang.Object r0 = A00(r10, r0)
            r3.add(r0)
            int r1 = r1 + 1
            goto L_0x00e6
        L_0x00f4:
            return r3
        L_0x00f5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160977ol.A00(X.7I6, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r1 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map A02(java.util.Map r3, java.util.Map r4) {
        /*
            X.7I6 r2 = new X.7I6
            r2.<init>(r3)
            if (r4 == 0) goto L_0x0012
            java.lang.Object r1 = A00(r2, r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            X.C162457s7.A0K(r1, r0)
            if (r1 != 0) goto L_0x0014
        L_0x0012:
            java.util.Map r1 = r2.A01
        L_0x0014:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.C162457s7.A0K(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160977ol.A02(java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r1 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map A03(java.util.Map r3, java.util.Map r4) {
        /*
            X.7I6 r2 = new X.7I6
            r2.<init>(r3)
            if (r4 == 0) goto L_0x0012
            java.lang.Object r1 = A00(r2, r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            X.C162457s7.A0K(r1, r0)
            if (r1 != 0) goto L_0x0014
        L_0x0012:
            java.util.Map r1 = r2.A01
        L_0x0014:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.C162457s7.A0K(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160977ol.A03(java.util.Map, java.util.Map):java.util.Map");
    }
}
