package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2oS  reason: invalid class name and case insensitive filesystem */
public abstract class C54272oS {
    public final String A00;

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A00(org.json.JSONObject r12) {
        /*
            r11 = this;
            java.lang.String r2 = r11.A00
            boolean r0 = r12.has(r2)
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r5 = r12.get(r2)
            boolean r0 = r5 instanceof org.json.JSONArray
            if (r0 == 0) goto L_0x00e4
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            int r0 = r5.length()
            java.util.ArrayList r4 = X.AnonymousClass002.A0I(r0)
            r3 = 0
        L_0x001b:
            int r0 = r5.length()
            if (r3 >= r0) goto L_0x00e3
            boolean r0 = r11 instanceof X.AnonymousClass1Ik
            if (r0 == 0) goto L_0x0064
            org.json.JSONObject r9 = r5.getJSONObject(r3)
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            java.util.Iterator r10 = r9.keys()
        L_0x0031:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.String r8 = X.AnonymousClass001.A0m(r10)
            java.lang.Object r7 = r9.get(r8)
            boolean r0 = r7 instanceof org.json.JSONArray
            if (r0 == 0) goto L_0x0060
            org.json.JSONArray r7 = (org.json.JSONArray) r7
            int r0 = r7.length()
            byte[] r6 = new byte[r0]
            r1 = 0
        L_0x004c:
            int r0 = r7.length()
            if (r1 >= r0) goto L_0x005c
            int r0 = r7.getInt(r1)
            byte r0 = (byte) r0
            r6[r1] = r0
            int r1 = r1 + 1
            goto L_0x004c
        L_0x005c:
            r2.put(r8, r6)
            goto L_0x0031
        L_0x0060:
            r2.put(r8, r7)
            goto L_0x0031
        L_0x0064:
            boolean r0 = r11 instanceof X.C22191Ij
            if (r0 == 0) goto L_0x0074
            java.lang.String r2 = r5.getString(r3)
        L_0x006c:
            if (r2 == 0) goto L_0x0071
        L_0x006e:
            r4.add(r2)
        L_0x0071:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0074:
            boolean r0 = r11 instanceof X.C22181Ii
            if (r0 == 0) goto L_0x0081
            long r0 = r5.getLong(r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            goto L_0x006c
        L_0x0081:
            org.json.JSONObject r6 = r5.getJSONObject(r3)
            java.lang.String r0 = "table_name"
            java.lang.String r8 = r6.getString(r0)
            java.lang.String r0 = "table_id_field"
            java.lang.String r7 = r6.getString(r0)
            java.lang.String r1 = "lookup_field"
            boolean r0 = r6.has(r1)
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = r6.optString(r1)
        L_0x009f:
            X.2vt r2 = new X.2vt
            r2.<init>(r8, r7, r0)
            java.lang.String r1 = "deleted_id_files"
            boolean r0 = r6.has(r1)
            if (r0 == 0) goto L_0x00ba
            X.1Ij r0 = new X.1Ij
            r0.<init>(r1)
            java.util.List r1 = r0.A00(r6)
            java.util.List r0 = r2.A04
            r0.addAll(r1)
        L_0x00ba:
            java.lang.String r1 = "modified_entity_files"
            boolean r0 = r6.has(r1)
            if (r0 == 0) goto L_0x00d1
            X.1Ij r0 = new X.1Ij
            r0.<init>(r1)
            java.util.List r1 = r0.A00(r6)
            java.util.List r0 = r2.A05
            r0.addAll(r1)
        L_0x00d1:
            java.lang.String r1 = "records_count_in_db"
            boolean r0 = r6.has(r1)
            if (r0 == 0) goto L_0x006e
            long r0 = X.C18320x8.A06(r1, r6)
            r2.A00 = r0
            goto L_0x006e
        L_0x00e1:
            r0 = 0
            goto L_0x009f
        L_0x00e3:
            return r4
        L_0x00e4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid type of element '"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "' - expect JSONArray."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x00fc:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Missing root element '"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "'"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54272oS.A00(org.json.JSONObject):java.util.List");
    }

    public C54272oS(String str) {
        this.A00 = str;
    }

    public JSONObject A01(List list) {
        boolean z;
        JSONArray A1F = AnonymousClass0x9.A1F();
        for (Object next : list) {
            if (this instanceof AnonymousClass1Ik) {
                A1F.put(new JSONObject((Map) next));
            } else if ((this instanceof C22191Ij) || (this instanceof C22181Ii)) {
                A1F.put(next);
            } else {
                C58832vt r5 = (C58832vt) next;
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put("table_name", r5.A03);
                A1G.put("table_id_field", r5.A02);
                String str = r5.A01;
                if (str != null) {
                    A1G.put("lookup_field", str);
                }
                List list2 = r5.A04;
                boolean z2 = true;
                if (Collections.unmodifiableList(list2).size() > 0) {
                    List unmodifiableList = Collections.unmodifiableList(list2);
                    if (unmodifiableList.size() != 0) {
                        A1G.put("deleted_id_files", new C22191Ij("deleted_id_files").A01(unmodifiableList).get("deleted_id_files"));
                    }
                    z = true;
                } else {
                    z = false;
                }
                List list3 = r5.A05;
                if (Collections.unmodifiableList(list3).size() > 0) {
                    List unmodifiableList2 = Collections.unmodifiableList(list3);
                    if (unmodifiableList2.size() != 0) {
                        A1G.put("modified_entity_files", new C22191Ij("modified_entity_files").A01(unmodifiableList2).get("modified_entity_files"));
                    }
                } else {
                    z2 = z;
                }
                A1G.put("records_count_in_db", r5.A00);
                if (z2) {
                    A1F.put(A1G);
                }
            }
        }
        JSONObject A1G2 = AnonymousClass0x9.A1G();
        A1G2.put(this.A00, A1F);
        return A1G2;
    }
}
