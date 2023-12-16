package X;

import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Uu  reason: invalid class name and case insensitive filesystem */
public final class C105405Uu {
    public final C44202Vb A00;
    public final Map A01 = new C174218Tk(5);
    public final Map A02 = new C174218Tk(100);
    public final Map A03 = AnonymousClass001.A0t();

    public C105405Uu(C44202Vb r3) {
        C162457s7.A0J(r3, 1);
        this.A00 = r3;
    }

    public final int A01(UserJid userJid) {
        int i;
        C162457s7.A0J(userJid, 0);
        synchronized (this) {
            List A0B = A0B(userJid);
            i = 7;
            if (A0B != null) {
                Iterator it = A0B.iterator();
                while (it.hasNext()) {
                    i = AnonymousClass002.A02(C86664Kz.A12(it), i * 31);
                }
            }
        }
        return i;
    }

    public final AnonymousClass7OX A02(UserJid userJid) {
        AnonymousClass7OX r0;
        synchronized (this) {
            Map map = this.A01;
            r0 = (AnonymousClass7OX) map.get(userJid);
            if (r0 == null) {
                r0 = new AnonymousClass7OX();
                map.put(userJid, r0);
            }
        }
        return r0;
    }

    public final C148047Gs A03(UserJid userJid) {
        C148047Gs r0;
        C162457s7.A0J(userJid, 0);
        synchronized (this) {
            AnonymousClass7OX A002 = A00(this, userJid);
            if (A002 != null) {
                r0 = A002.A00;
            } else {
                r0 = null;
            }
        }
        return r0;
    }

    public final C148047Gs A04(UserJid userJid) {
        C148047Gs r0;
        C162457s7.A0J(userJid, 0);
        synchronized (this) {
            AnonymousClass7OX A002 = A00(this, userJid);
            if (A002 != null) {
                r0 = A002.A01;
            } else {
                r0 = null;
            }
        }
        return r0;
    }

    public final C148047Gs A05(UserJid userJid, String str) {
        C148047Gs r0;
        C148057Gt r02;
        C162457s7.A0J(userJid, 0);
        synchronized (this) {
            AnonymousClass7OX A002 = A00(this, userJid);
            if (A002 == null || (r02 = (C148057Gt) A002.A05.get(str)) == null) {
                r0 = null;
            } else {
                r0 = r02.A00;
            }
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0091, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        if (r9.length() == 0) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C109015dw A08(com.whatsapp.jid.UserJid r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r9 == 0) goto L_0x000a
            int r1 = r9.length()     // Catch:{ all -> 0x008d }
            r0 = 0
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            r6 = 0
            if (r0 != 0) goto L_0x0090
            java.util.Map r4 = r7.A02     // Catch:{ all -> 0x008d }
            X.2eo r0 = new X.2eo     // Catch:{ all -> 0x008d }
            r0.<init>(r8, r9)     // Catch:{ all -> 0x008d }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x008d }
            X.5dw r0 = (X.C109015dw) r0     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x001f
            monitor-exit(r7)
            return r0
        L_0x001f:
            java.util.Map r0 = r7.A03     // Catch:{ all -> 0x008d }
            java.lang.Object r3 = r0.get(r9)     // Catch:{ all -> 0x008d }
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ all -> 0x008d }
            if (r3 == 0) goto L_0x0090
            if (r8 == 0) goto L_0x0032
            boolean r0 = r3.equals(r8)     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x0032
            goto L_0x0090
        L_0x0032:
            X.7OX r2 = A00(r7, r3)     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x0090
            java.util.ArrayList r0 = r2.A03     // Catch:{ all -> 0x008d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x008d }
        L_0x003e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0059
            X.5dw r5 = X.C86664Kz.A12(r1)     // Catch:{ all -> 0x008d }
            java.lang.String r0 = r5.A0F     // Catch:{ all -> 0x008d }
            boolean r0 = X.C162457s7.A0P(r0, r9)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x003e
            X.2eo r0 = new X.2eo     // Catch:{ all -> 0x008d }
            r0.<init>(r3, r9)     // Catch:{ all -> 0x008d }
        L_0x0055:
            r4.put(r0, r5)     // Catch:{ all -> 0x008d }
            goto L_0x008b
        L_0x0059:
            java.util.Map r0 = r2.A05     // Catch:{ all -> 0x008d }
            java.util.Iterator r2 = X.AnonymousClass001.A0v(r0)     // Catch:{ all -> 0x008d }
        L_0x005f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0090
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x008d }
            X.7Gt r0 = (X.C148057Gt) r0     // Catch:{ all -> 0x008d }
            X.2gz r0 = r0.A01     // Catch:{ all -> 0x008d }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x008d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x008d }
        L_0x0073:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x005f
            X.5dw r5 = X.C86664Kz.A12(r1)     // Catch:{ all -> 0x008d }
            java.lang.String r0 = r5.A0F     // Catch:{ all -> 0x008d }
            boolean r0 = X.C162457s7.A0P(r0, r9)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0073
            X.2eo r0 = new X.2eo     // Catch:{ all -> 0x008d }
            r0.<init>(r3, r9)     // Catch:{ all -> 0x008d }
            goto L_0x0055
        L_0x008b:
            monitor-exit(r7)
            return r5
        L_0x008d:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0090:
            monitor-exit(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105405Uu.A08(com.whatsapp.jid.UserJid, java.lang.String):X.5dw");
    }

    public final C108815db A09(UserJid userJid) {
        C108815db r0;
        Object obj;
        List list;
        C162457s7.A0J(userJid, 0);
        synchronized (this) {
            List A0B = A0B(userJid);
            r0 = null;
            if (A0B != null) {
                Iterator it = A0B.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    C109015dw r2 = (C109015dw) obj;
                    C633238u r1 = r2.A01;
                    if (r1 != null && r1.A00 == 0 && !r2.A08) {
                        List list2 = r2.A07;
                        C162457s7.A0C(list2);
                        if (C18310x6.A1X(list2)) {
                            break;
                        }
                    }
                }
                C109015dw r3 = (C109015dw) obj;
                if (!(r3 == null || (list = r3.A07) == null)) {
                    r0 = (C108815db) C73723fy.A04(list);
                }
            }
        }
        return r0;
    }

    public final List A0A(UserJid userJid) {
        ArrayList A0s;
        synchronized (this) {
            A0s = AnonymousClass001.A0s();
            AnonymousClass7OX A002 = A00(this, userJid);
            if (A002 != null) {
                Iterator it = A002.A04.iterator();
                while (it.hasNext()) {
                    C148057Gt r0 = (C148057Gt) A002.A05.get(AnonymousClass001.A0m(it));
                    if (r0 != null) {
                        C49722gz r02 = r0.A01;
                        C162457s7.A0C(r02);
                        A0s.add(r02);
                    }
                }
            }
        }
        return A0s;
    }

    public final List A0B(UserJid userJid) {
        C162457s7.A0J(userJid, 0);
        synchronized (this) {
            AnonymousClass7OX A002 = A00(this, userJid);
            if (A002 == null) {
                return null;
            }
            List unmodifiableList = Collections.unmodifiableList(A002.A03);
            return unmodifiableList;
        }
    }

    public final void A0C(C148037Gr r10, UserJid userJid, boolean z) {
        C162457s7.A0J(userJid, 0);
        synchronized (this) {
            AnonymousClass7OX A022 = A02(userJid);
            if (!z) {
                A022.A04.clear();
            }
            for (C49722gz r7 : r10.A01) {
                C148057Gt r6 = new C148057Gt(r7);
                Iterator it = r7.A04.iterator();
                while (it.hasNext()) {
                    C109015dw A12 = C86664Kz.A12(it);
                    Map map = this.A02;
                    String str = A12.A0F;
                    map.put(new C48382eo(userJid, str), A12);
                    Map map2 = this.A03;
                    C162457s7.A0C(str);
                    map2.put(str, userJid);
                }
                List list = A022.A04;
                String str2 = r7.A03;
                list.add(str2);
                A022.A05.put(str2, r6);
            }
            A022.A00 = r10.A00;
        }
    }

    public final void A0D(C64523Dv r7, UserJid userJid, boolean z) {
        C162457s7.A0J(userJid, 0);
        synchronized (this) {
            AnonymousClass7OX A022 = A02(userJid);
            if (!z) {
                ArrayList arrayList = A022.A03;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.A03.remove(C86664Kz.A12(it).A0F);
                }
                arrayList.clear();
            }
            Iterator it2 = r7.A02.iterator();
            while (it2.hasNext()) {
                C109015dw A12 = C86664Kz.A12(it2);
                C162457s7.A0H(A12);
                C109015dw A07 = A07(A12, userJid);
                A022.A03.add(A07);
                this.A02.put(new C48382eo(userJid, A12.A0F), A07);
                Map map = this.A03;
                String str = A07.A0F;
                C162457s7.A0C(str);
                map.put(str, userJid);
            }
            A022.A01 = r7.A01;
            this.A00.A00().A00(userJid);
        }
    }

    public final void A0E(C109015dw r10, UserJid userJid) {
        C162457s7.A0J(r10, 0);
        synchronized (this) {
            C109015dw A07 = A07(r10, userJid);
            Map map = this.A02;
            String str = A07.A0F;
            map.put(new C48382eo(userJid, str), A07);
            Object obj = userJid;
            if (userJid == null) {
                obj = this.A03.get(str);
            }
            UserJid userJid2 = (UserJid) obj;
            if (userJid2 != null) {
                AnonymousClass7OX A022 = A02(userJid2);
                Iterator A0v = AnonymousClass001.A0v(A022.A05);
                while (true) {
                    int i = 0;
                    if (!A0v.hasNext()) {
                        break;
                    }
                    List list = ((C148057Gt) A0v.next()).A01.A04;
                    int size = list.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (C162457s7.A0P(str, ((C109015dw) list.get(i)).A0F)) {
                            list.set(i, A07);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                ArrayList arrayList = A022.A03;
                int size2 = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        arrayList.add(0, A07);
                        Map map2 = this.A03;
                        C162457s7.A0C(str);
                        map2.put(str, userJid2);
                        break;
                    } else if (C162457s7.A0P(str, ((C109015dw) arrayList.get(i2)).A0F)) {
                        arrayList.set(i2, A07);
                        break;
                    } else {
                        i2++;
                    }
                }
                this.A00.A00().A00(userJid2);
            }
        }
    }

    public final void A0F(UserJid userJid) {
        C162457s7.A0J(userJid, 0);
        synchronized (this) {
            Map map = this.A01;
            AnonymousClass7OX r4 = (AnonymousClass7OX) map.get(userJid);
            if (r4 != null) {
                Iterator it = r4.A03.iterator();
                while (it.hasNext()) {
                    C109015dw A12 = C86664Kz.A12(it);
                    Map map2 = this.A03;
                    String str = A12.A0F;
                    map2.remove(str);
                    this.A02.remove(new C48382eo(userJid, str));
                }
                Iterator A0v = AnonymousClass001.A0v(r4.A05);
                while (A0v.hasNext()) {
                    Iterator it2 = ((C148057Gt) A0v.next()).A01.A04.iterator();
                    while (it2.hasNext()) {
                        C109015dw A122 = C86664Kz.A12(it2);
                        Map map3 = this.A03;
                        String str2 = A122.A0F;
                        map3.remove(str2);
                        this.A02.remove(new C48382eo(userJid, str2));
                    }
                }
            }
            map.remove(userJid);
            this.A00.A00().A00(userJid);
        }
    }

    public final void A0G(UserJid userJid, int i) {
        C162457s7.A0J(userJid, 0);
        if (i < 0) {
            C18260x0.A0x("CatalogCacheManager/trimProductsInCatalogCache/Invalid size argument - ", AnonymousClass001.A0o(), i);
            return;
        }
        synchronized (this) {
            AnonymousClass7OX A002 = A00(this, userJid);
            if (A002 != null) {
                A002.A01 = new C148047Gs(true, (String) null);
                ArrayList arrayList = A002.A03;
                int A032 = AnonymousClass0x9.A03(arrayList, i);
                for (int i2 = 0; i2 < A032; i2++) {
                    int A033 = AnonymousClass0x9.A03(arrayList, 1);
                    String str = ((C109015dw) arrayList.get(A033)).A0F;
                    C162457s7.A0C(str);
                    this.A03.remove(str);
                    this.A02.remove(new C48382eo(userJid, str));
                    arrayList.remove(A033);
                }
            }
        }
    }

    public final void A0H(UserJid userJid, boolean z) {
        C162457s7.A0J(userJid, 0);
        synchronized (this) {
            AnonymousClass7OX A002 = A00(this, userJid);
            if (A002 != null) {
                A002.A04.clear();
                A002.A05.clear();
                if (z) {
                    A002.A00 = new C148047Gs(true, (String) null);
                }
            }
        }
    }

    public final boolean A0I(UserJid userJid) {
        boolean containsKey;
        C162457s7.A0J(userJid, 0);
        synchronized (this) {
            containsKey = this.A01.containsKey(userJid);
        }
        return containsKey;
    }

    public final boolean A0J(UserJid userJid) {
        boolean z;
        C162457s7.A0J(userJid, 0);
        synchronized (this) {
            AnonymousClass7OX A002 = A00(this, userJid);
            if (A002 != null) {
                ArrayList arrayList = A002.A03;
                C162457s7.A0H(arrayList);
                z = AnonymousClass0x7.A1S(arrayList);
            } else {
                z = false;
            }
        }
        return z;
    }

    public static AnonymousClass7OX A00(C105405Uu r0, Object obj) {
        return (AnonymousClass7OX) r0.A01.get(obj);
    }

    public final C109015dw A07(C109015dw r36, UserJid userJid) {
        C108755dV r13;
        List list;
        C109015dw r1 = r36;
        String str = r1.A0F;
        C109015dw A08 = A08(userJid, str);
        if (A08 == null || (r13 = A08.A0B) == null) {
            r13 = r1.A0B;
        } else {
            C108755dV r2 = r1.A0B;
            if (r2 != null) {
                List list2 = r2.A03;
                if (list2 == null || list2.isEmpty()) {
                    list2 = r13.A03;
                }
                List list3 = r2.A02;
                if (list3 == null || list3.isEmpty()) {
                    list3 = r13.A02;
                }
                C108695dP r3 = r2.A01;
                if (r3 == null) {
                    r3 = r13.A01;
                }
                C108665dM r22 = r2.A00;
                if (r22 == null || (list = r22.A00) == null || !C18310x6.A1X(list)) {
                    r22 = r13.A00;
                }
                r13 = new C108755dV(r22, r3, list2, list3);
            }
        }
        String str2 = r1.A05;
        String str3 = r1.A0C;
        BigDecimal bigDecimal = r1.A06;
        C160617ny r12 = r1.A04;
        String str4 = r1.A0E;
        String str5 = r1.A0G;
        List list4 = r1.A07;
        C633238u r8 = r1.A01;
        C108745dU r7 = r1.A02;
        String str6 = r1.A0D;
        int i = r1.A00;
        boolean z = r1.A0H;
        boolean z2 = r1.A08;
        BigDecimal bigDecimal2 = bigDecimal;
        List list5 = list4;
        int i2 = i;
        String str7 = str4;
        String str8 = str5;
        String str9 = str6;
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        C108745dU r19 = r7;
        C108755dV r20 = r13;
        C160617ny r21 = r12;
        return new C109015dw(r1.A0A, r8, r19, r20, r21, str10, str11, str12, str7, str8, str9, bigDecimal2, list5, i2, r1.A09, z, z2);
    }

    public final C49722gz A06(UserJid userJid, String str) {
        C49722gz r0;
        C148057Gt r02;
        C18260x0.A0O(userJid, str);
        synchronized (this) {
            AnonymousClass7OX A002 = A00(this, userJid);
            if (A002 == null || (r02 = (C148057Gt) A002.A05.get(str)) == null) {
                r0 = null;
            } else {
                r0 = r02.A01;
            }
        }
        return r0;
    }
}
