package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7aW  reason: invalid class name and case insensitive filesystem */
public class C153007aW {
    public final C142366x5 A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final List A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C153007aW r5 = (C153007aW) obj;
            if (!this.A01.equals(r5.A01) || !this.A02.equals(r5.A02) || this.A00 != r5.A00 || !this.A05.equals(r5.A05) || !this.A03.equals(r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A01;
        objArr[1] = this.A02;
        objArr[2] = this.A00;
        objArr[3] = this.A05;
        objArr[4] = this.A03;
        return C18310x6.A08(AnonymousClass0x2.A0T(), objArr, 5);
    }

    public C153007aW(C156867hL r3) {
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        this.A02 = r3.A02;
        this.A03 = r3.A03;
        List list = r3.A04;
        Collections.sort(list, AnonymousClass8NP.A00);
        this.A04 = list;
        List list2 = r3.A05;
        Collections.sort(list2, AnonymousClass8NQ.A00);
        this.A05 = list2;
    }

    public JSONObject A00() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("mName", this.A01);
        A1G.put("mStartAtTimeUs", 0);
        A1G.put("mTrackType", this.A00.mValue);
        List<C153257aw> list = this.A02;
        JSONArray A1F = AnonymousClass0x9.A1F();
        for (C153257aw A002 : list) {
            A1F.put(A002.A00());
        }
        A1G.put("mSegments", A1F);
        List list2 = this.A05;
        JSONArray A1F2 = AnonymousClass0x9.A1F();
        Iterator it = list2.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0g("toJSON");
        }
        A1G.put("mTimelineSpeedList", A1F2);
        List list3 = this.A04;
        JSONArray A1F3 = AnonymousClass0x9.A1F();
        Iterator it2 = list3.iterator();
        if (it2.hasNext()) {
            it2.next();
            throw AnonymousClass001.A0g("toJSON");
        }
        A1G.put("mTimelinePtsMutatorList", A1F3);
        List list4 = this.A03;
        JSONArray A1F4 = AnonymousClass0x9.A1F();
        Iterator it3 = list4.iterator();
        if (it3.hasNext()) {
            it3.next();
            throw AnonymousClass001.A0g("toJSON");
        }
        A1G.put("mTimelineEffects", A1F4);
        return A1G;
    }

    public String toString() {
        try {
            return A00().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
