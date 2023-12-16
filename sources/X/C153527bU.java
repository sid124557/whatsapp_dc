package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7bU  reason: invalid class name and case insensitive filesystem */
public final class C153527bU {
    public Set A00 = AnonymousClass0x9.A17();
    public final AnonymousClass1VX A01;
    public final C196629bS A02;

    public final synchronized C166157yE A00() {
        Object obj;
        Iterator it = this.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C166157yE r2 = (C166157yE) obj;
            if (C162457s7.A0P(r2.A03, "numeric_id") && C162457s7.A0P(r2.A02, "available")) {
                break;
            }
        }
        return (C166157yE) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (X.C162457s7.A0P(r1, "blocked") != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List A01() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Set r0 = r5.A00     // Catch:{ all -> 0x0038 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0038 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0038 }
        L_0x000b:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0032
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0038 }
            r0 = r2
            X.7yE r0 = (X.C166157yE) r0     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = r0.A02     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "deregistered"
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "blocked"
            boolean r1 = X.C162457s7.A0P(r1, r0)     // Catch:{ all -> 0x0038 }
            r0 = 1
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r0 == 0) goto L_0x000b
            r4.add(r2)     // Catch:{ all -> 0x0038 }
            goto L_0x000b
        L_0x0032:
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r4)     // Catch:{ all -> 0x0038 }
            monitor-exit(r5)
            return r0
        L_0x0038:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153527bU.A01():java.util.List");
    }

    public synchronized void A02(C166157yE r6) {
        Object obj;
        Set set = this.A00;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C162457s7.A0P(((C166157yE) obj).A01, r6.A01)) {
                break;
            }
        }
        C166157yE r3 = (C166157yE) obj;
        if (r3 != null) {
            Set A022 = C73823g8.A02(r3, set);
            LinkedHashSet linkedHashSet = new LinkedHashSet(AnonymousClass8UG.A0I(A022.size() + 1));
            linkedHashSet.addAll(A022);
            linkedHashSet.add(r6);
            if (A07(linkedHashSet)) {
                set.remove(r3);
                set.add(r6);
            }
        }
    }

    public final synchronized void A03(C166157yE r7) {
        Object obj;
        synchronized (this) {
            C162457s7.A0J(r7, 0);
            Set set = this.A00;
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C162457s7.A0P(((C166157yE) obj).A01, r7.A01)) {
                    break;
                }
            }
            if (((C166157yE) obj) != null) {
                A02(r7);
            } else if (!C162457s7.A0P(r7.A03, "mobile_number") || !A06()) {
                if (A01().size() != this.A01.A0N(3114) + 1 && !set.contains(r7)) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(AnonymousClass8UG.A0I(set.size() + 1));
                    linkedHashSet.addAll(set);
                    linkedHashSet.add(r7);
                    if (A07(linkedHashSet)) {
                        set.add(r7);
                    }
                }
            }
        }
    }

    public final synchronized boolean A05() {
        boolean z;
        int i;
        int A0N = this.A01.A0N(3114);
        List<C166157yE> A012 = A01();
        z = false;
        if (!(A012 instanceof Collection) || !A012.isEmpty()) {
            i = 0;
            for (C166157yE r0 : A012) {
                if (C162457s7.A0P(r0.A03, "numeric_id") && (i = i + 1) < 0) {
                    AnonymousClass8UF.A0q();
                    throw AnonymousClass000.A0L();
                }
            }
        } else {
            i = 0;
        }
        if (A0N > i) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r2 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A06() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.List r0 = r4.A01()     // Catch:{ all -> 0x0026 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0026 }
        L_0x0009:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0023
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0026 }
            r0 = r2
            X.7yE r0 = (X.C166157yE) r0     // Catch:{ all -> 0x0026 }
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x0026 }
            java.lang.String r0 = "mobile_number"
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0009
            r0 = 1
            if (r2 != 0) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            monitor-exit(r4)
            return r0
        L_0x0026:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153527bU.A06():boolean");
    }

    public final boolean A04() {
        String A0Q = this.A01.A0Q(2965);
        C162457s7.A0D(A0Q);
        if (A0Q.length() != 0) {
            List A022 = AnonymousClass2AB.A02(A0Q, ",");
            String A07 = this.A02.A07();
            if (A07 != null) {
                return A022.contains(A07);
            }
        }
        return false;
    }

    public C153527bU(AnonymousClass1VX r10, C196629bS r11) {
        C18260x0.A0Q(r11, r10);
        this.A02 = r11;
        this.A01 = r10;
        String A08 = r11.A08();
        if (A08 != null && A08.length() != 0) {
            JSONArray jSONArray = new JSONArray(A08);
            Iterator it = C175708Zk.A02(0, jSONArray.length()).iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = jSONArray.getJSONObject(((C72013d2) it).A00());
                this.A00.add(new C166157yE(new C166557yt(AnonymousClass3QD.A00(), String.class, jSONObject.getString("alias"), "upiAlias"), C18290x4.A0r("aliasType", jSONObject), C18290x4.A0r("aliasId", jSONObject), C18290x4.A0r("aliasStatus", jSONObject)));
            }
        }
    }

    public final boolean A07(Set set) {
        JSONArray A1F = AnonymousClass0x9.A1F();
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C166157yE r3 = (C166157yE) it.next();
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put("alias", r3.A00.A00);
                A1G.put("aliasType", r3.A03);
                A1G.put("aliasId", r3.A01);
                A1G.put("aliasStatus", r3.A02);
                A1F.put(A1G);
            }
            this.A02.A0L(A1F);
            return true;
        } catch (JSONException unused) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs setAlias threw: an exception ");
            return false;
        }
    }
}
