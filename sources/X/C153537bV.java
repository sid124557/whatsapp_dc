package X;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7bV  reason: invalid class name and case insensitive filesystem */
public class C153537bV {
    public HashMap A00;
    public HashMap A01;
    public HashMap A02 = AnonymousClass001.A0t();
    public HashMap A03;
    public boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C153537bV r5 = (C153537bV) obj;
            HashMap hashMap = this.A03;
            HashMap hashMap2 = r5.A03;
            if (hashMap != hashMap2 && !hashMap.equals(hashMap2)) {
                return false;
            }
            HashMap hashMap3 = this.A00;
            HashMap hashMap4 = r5.A00;
            return hashMap3 == hashMap4 || hashMap3.equals(hashMap4);
        }
    }

    public final void A04() {
        if (!this.A04) {
            Iterator A10 = C18290x4.A10(this.A03);
            while (A10.hasNext()) {
                HashMap A0t = AnonymousClass001.A0t();
                Iterator A0u = AnonymousClass001.A0u((AbstractMap) A10.next());
                while (A0u.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0u);
                    Object key = A0w.getKey();
                    C153007aW r2 = (C153007aW) A0w.getValue();
                    A0t.put(key, AnonymousClass002.A0J(r2.A02));
                    this.A02.put(r2.A00, A0t);
                }
            }
            this.A04 = true;
        }
    }

    public C153537bV(C150867Sn r3) {
        HashMap A0t = AnonymousClass001.A0t();
        this.A03 = A0t;
        A0t.putAll(r3.A02);
        HashMap A0t2 = AnonymousClass001.A0t();
        this.A00 = A0t2;
        A0t2.putAll(r3.A00);
        HashMap A0t3 = AnonymousClass001.A0t();
        this.A01 = A0t3;
        A0t3.putAll(r3.A01);
    }

    public C153007aW A00(C142366x5 r2, int i) {
        A04();
        AbstractMap abstractMap = (AbstractMap) this.A03.get(r2);
        if (abstractMap != null) {
            return (C153007aW) C18290x4.A0j(abstractMap, i);
        }
        return null;
    }

    public HashMap A01(C142366x5 r6) {
        HashMap A0t = AnonymousClass001.A0t();
        List list = (List) this.A00.get(r6);
        if (list != null && !list.isEmpty()) {
            AnonymousClass0x2.A1H(list, A0t, -1);
        }
        HashMap A022 = A02(r6);
        if (A022 != null) {
            Iterator A0u = AnonymousClass001.A0u(A022);
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                Object key = A0w.getKey();
                List list2 = ((C153007aW) A0w.getValue()).A03;
                if (!list2.isEmpty()) {
                    A0t.put(key, list2);
                }
            }
        }
        return A0t;
    }

    public HashMap A02(C142366x5 r3) {
        A04();
        HashMap hashMap = this.A03;
        if (hashMap.get(r3) != null) {
            return (HashMap) hashMap.get(r3);
        }
        return null;
    }

    public List A03(C142366x5 r2, int i) {
        A04();
        AbstractMap abstractMap = (AbstractMap) this.A02.get(r2);
        if (abstractMap != null) {
            return (List) C18290x4.A0j(abstractMap, i);
        }
        return null;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A03;
        return C18310x6.A08(this.A00, A0M, 1);
    }

    public String toString() {
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            HashMap hashMap = this.A03;
            JSONArray A1F = AnonymousClass0x9.A1F();
            Iterator A0u = AnonymousClass001.A0u(hashMap);
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                JSONObject A1G2 = AnonymousClass0x9.A1G();
                A1G2.put("TrackType", ((C142366x5) A0w.getKey()).mValue);
                JSONArray A1F2 = AnonymousClass0x9.A1F();
                Iterator A0u2 = AnonymousClass001.A0u((AbstractMap) A0w.getValue());
                while (A0u2.hasNext()) {
                    Map.Entry A0w2 = AnonymousClass001.A0w(A0u2);
                    JSONObject A1G3 = AnonymousClass0x9.A1G();
                    A1G3.put("TrackIndex", A0w2.getKey());
                    A1G3.put("MediaTrackComposition", ((C153007aW) A0w2.getValue()).A00());
                    A1F2.put(A1G3);
                }
                A1G2.put("TrackMap", A1F2);
                A1F.put(A1G2);
            }
            A1G.put("mTypeToTracksMap", A1F);
            HashMap hashMap2 = this.A00;
            JSONArray A1F3 = AnonymousClass0x9.A1F();
            Iterator A0u3 = AnonymousClass001.A0u(hashMap2);
            while (A0u3.hasNext()) {
                Map.Entry A0w3 = AnonymousClass001.A0w(A0u3);
                JSONObject A1G4 = AnonymousClass0x9.A1G();
                A1G4.put("TrackType", ((C142366x5) A0w3.getKey()).mValue);
                JSONArray A1F4 = AnonymousClass0x9.A1F();
                Iterator it = ((List) A0w3.getValue()).iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0g("toJSON");
                }
                A1G4.put("TimelineEffects", A1F4);
                A1F3.put(A1G4);
            }
            return AnonymousClass0x9.A0y(A1F3, "mTrackTypeToTimelineEffects", A1G);
        } catch (JSONException unused) {
            return "";
        }
    }
}
