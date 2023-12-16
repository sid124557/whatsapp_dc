package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.util.EnumMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3ML  reason: invalid class name */
public final class AnonymousClass3ML implements AnonymousClass4EH {
    public final /* synthetic */ C60272yH A00;
    public final /* synthetic */ C54662p5 A01;
    public final /* synthetic */ C84964Ek A02;
    public final /* synthetic */ AnonymousClass2MY A03;
    public final /* synthetic */ C46882cM A04;
    public final /* synthetic */ C60942zQ A05;
    public final /* synthetic */ PrivateKey A06;

    public AnonymousClass3ML(C60272yH r1, C54662p5 r2, C84964Ek r3, AnonymousClass2MY r4, C46882cM r5, C60942zQ r6, PrivateKey privateKey) {
        this.A05 = r6;
        this.A06 = privateKey;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
    }

    public void BQp() {
        this.A02.BQp();
    }

    public void BS9(AnonymousClass24F r9) {
        C60942zQ r6 = this.A05;
        C60272yH r1 = this.A00;
        C84964Ek r4 = this.A02;
        C60942zQ.A00(r1, this.A01, r9.node, r4, this.A04, r6, C57492tj.A01(r9.node));
    }

    public void BdS(AnonymousClass2Q4 r19, Integer num) {
        Object obj;
        Throwable jSONException;
        List list;
        try {
            C60942zQ r5 = this.A05;
            JSONObject A012 = C50672ia.A01(r19, r5.A01, this.A06);
            if (A012.has("data")) {
                JSONObject A10 = C18300x5.A10("data", A012);
                AnonymousClass2MY r0 = this.A03;
                C84964Ek r9 = r0.A00;
                C60942zQ r1 = r0.A01;
                if (r1 instanceof C34711vb) {
                    JSONArray jSONArray = A10.getJSONArray("waffle_ialsv");
                    int length = jSONArray.length();
                    int i = 0;
                    boolean z = false;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (jSONArray.getJSONObject(i2).getBoolean("is_valid")) {
                            z = true;
                        }
                    }
                    Class<AnonymousClass223> cls = AnonymousClass223.class;
                    Integer num2 = num;
                    if (!z) {
                        obj = new C52712lv(num2, new EnumMap(cls), false);
                    } else {
                        EnumMap enumMap = new EnumMap(cls);
                        JSONArray jSONArray2 = A10.getJSONArray("waffle_xr");
                        int length2 = jSONArray2.length();
                        while (i < length2) {
                            JSONObject jSONObject = jSONArray2.getJSONObject(i);
                            C162457s7.A0D(jSONObject);
                            long j = jSONObject.getLong("waffle_unique_id");
                            int i3 = jSONObject.getInt("response_code");
                            String A0r = C18290x4.A0r("waffle_da", jSONObject);
                            if ("story".equalsIgnoreCase(C18290x4.A0r("waffle_ds", jSONObject))) {
                                AnonymousClass223[] values = AnonymousClass223.values();
                                int length3 = values.length;
                                int i4 = 0;
                                while (i4 < length3) {
                                    AnonymousClass223 r14 = values[i4];
                                    if (C162457s7.A0P(r14.iqValue, A0r)) {
                                        C52702lu r11 = (C52702lu) enumMap.get(r14);
                                        if (r11 == null) {
                                            r11 = new C52702lu(AnonymousClass001.A0s(), AnonymousClass001.A0s(), AnonymousClass001.A0s());
                                            enumMap.put(r14, r11);
                                        }
                                        if (i3 != 0) {
                                            if (i3 != 1) {
                                                if (i3 == 2) {
                                                    list = r11.A00;
                                                    list.add(Long.valueOf(j));
                                                    i++;
                                                } else if (i3 != 3) {
                                                    if (i3 != 4) {
                                                        i++;
                                                    }
                                                }
                                            }
                                            list = r11.A01;
                                            list.add(Long.valueOf(j));
                                            i++;
                                        }
                                        list = r11.A02;
                                        list.add(Long.valueOf(j));
                                        i++;
                                    } else {
                                        i4++;
                                    }
                                }
                                jSONException = C18320x8.A0t();
                            } else {
                                jSONException = new JSONException("Error: unexpected response");
                            }
                            throw jSONException;
                        }
                        obj = new C52712lv(num2, enumMap, true);
                    }
                } else {
                    obj = A10;
                    if (!(r1 instanceof C34701va)) {
                        obj = Boolean.valueOf(A10.optBoolean("success", false));
                    }
                }
                r9.onSuccess(obj);
            } else if (A012.has("error")) {
                int optInt = C18300x5.A10("error", A012).optInt("code", -1);
                C60942zQ.A00(this.A00, this.A01, (AnonymousClass36K) null, this.A02, this.A04, r5, optInt);
            }
        } catch (GeneralSecurityException e) {
            this.A02.BSC(e, (Integer) null);
        } catch (UnsupportedEncodingException e2) {
            this.A02.BSC(e2, (Integer) null);
        } catch (JSONException e3) {
            this.A02.BSC(e3, (Integer) null);
        }
    }
}
