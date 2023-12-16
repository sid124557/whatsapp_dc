package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2rW  reason: invalid class name and case insensitive filesystem */
public final class C56162rW {
    public final C55682qk A00;
    public final AnonymousClass2VI A01;
    public final C56612sH A02;
    public final C54402of A03;
    public final C23401Sx A04;
    public final AnonymousClass1Uc A05;
    public final C23651Ud A06;
    public final C23641Ub A07;
    public final AnonymousClass1VX A08;
    public final AnonymousClass4FS A09;
    public final C73853gB A0A;

    public final C41572Kt A00(UserJid userJid, Integer num) {
        int intValue;
        String str;
        C60742z5 r1;
        C23651Ud r5 = this.A06;
        r5.A09(num, "metadata_cache_start");
        C41572Kt r6 = null;
        if (A04(userJid, C56952sp.A05(this.A08, 2891))) {
            if (num != null) {
                intValue = num.intValue();
                r5.A05(intValue, "fetch_cache_hit", false);
                str = "cache_expired";
            }
            return r6;
        }
        C54402of r0 = this.A03;
        String rawString = userJid.getRawString();
        C162457s7.A0J(rawString, 0);
        String string = ((SharedPreferences) r0.A00.get()).getString(AnonymousClass000.A0V("extensions_metadata_", rawString, AnonymousClass001.A0o()), (String) null);
        if (string != null) {
            if (num != null) {
                try {
                    r5.A05(num.intValue(), "fetch_cache_hit", true);
                } catch (JSONException e) {
                    Log.w("ExtensionsLogger/ExtensionsMetadataManager/canReadFromSharedPref() - Json parsing exception", e);
                    if (num != null) {
                        int intValue2 = num.intValue();
                        r5.A05(intValue2, "fetch_cache_hit", false);
                        r5.A04(intValue2, "metadata_network_fetch_reason", "cache_parse_error");
                    }
                } catch (Throwable th) {
                    r5.A09(num, "metadata_cache_end");
                    throw th;
                }
            }
            JSONObject A1H = AnonymousClass0x9.A1H(string);
            ArrayList A0s = AnonymousClass001.A0s();
            JSONArray optJSONArray = A1H.optJSONArray("extensionIdLinks");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        A0s.add(AnonymousClass26k.A00(optJSONObject));
                    }
                }
            }
            JSONObject optJSONObject2 = A1H.optJSONObject("compatibility");
            if (optJSONObject2 != null) {
                r1 = C60742z5.A03.A01(optJSONObject2);
            } else {
                r1 = null;
            }
            r6 = new C41572Kt(r1, A0s);
            r5.A09(num, "metadata_cache_end");
            return r6;
        }
        if (num != null) {
            intValue = num.intValue();
            r5.A05(intValue, "fetch_cache_hit", false);
            str = "no_cache";
        }
        return r6;
        r5.A04(intValue, "metadata_network_fetch_reason", str);
        r5.A09(num, "metadata_cache_end");
        return r6;
    }

    public final void A03(UserJid userJid, String str, String str2, String str3, AnonymousClass4GR r22) {
        UserJid userJid2 = userJid;
        boolean A042 = A04(userJid2, C56952sp.A05(this.A08, 4849));
        AnonymousClass1Uc r4 = this.A05;
        String str4 = str;
        AnonymousClass4GR r3 = r22;
        if (A042) {
            int hashCode = str4.hashCode();
            r4.A05(hashCode, "metadata_cache_hit", false);
            r4.A09(Integer.valueOf(hashCode), "metadata_network_start");
            C23651Ud r11 = this.A06;
            int A0C = r11.A0C(userJid2, "screen_transition_integrity_check");
            r11.A07(userJid2, str2, str3, str4, A0C);
            r11.A05(A0C, "fetch_cache_hit", false);
            Integer valueOf = Integer.valueOf(A0C);
            this.A09.BkM(new C70833b8(new AnonymousClass4JN(this, r3, str4, A0C, 1), this, userJid2, valueOf, (String) null, (String) null, false));
            return;
        }
        r4.A05(str4.hashCode(), "metadata_cache_hit", true);
        r3.invoke(Boolean.TRUE, (Object) null);
    }

    public final C52912mF A01(AnonymousClass4AC r24, AnonymousClass2SI r25, UserJid userJid, Integer num, String str, String str2, boolean z) {
        JSONObject jSONObject;
        String str3;
        C23651Ud r8 = this.A06;
        Integer num2 = num;
        r8.A09(num2, "metadata_network_end");
        AnonymousClass2SI r1 = r25;
        AnonymousClass4AC r5 = r24;
        if (r1.A00 == 0) {
            AnonymousClass2WN r0 = r1.A03;
            C162457s7.A0D(r0);
            C51682kD r12 = (C51682kD) r0.A00;
            if (r12 != null) {
                List list = r12.A01;
                if (!list.isEmpty()) {
                    C41572Kt r2 = new C41572Kt(r12.A00, list);
                    C54402of r82 = this.A03;
                    UserJid userJid2 = userJid;
                    String rawString = userJid2.getRawString();
                    JSONArray A1F = AnonymousClass0x9.A1F();
                    for (C53832nk r13 : r2.A01) {
                        C162457s7.A0J(r13, 0);
                        JSONObject A1G = AnonymousClass0x9.A1G();
                        A1G.put("flow_id", r13.A03);
                        A1G.put("data_api_version", r13.A02);
                        A1G.put("state", r13.A00);
                        A1G.put("flow_version_ids", r13.A04);
                        A1G.put("psl_cdn_url", r13.A05);
                        A1G.put("psl_signature", r13.A06);
                        String[] strArr = r13.A07;
                        if (strArr != null) {
                            str3 = C73703fw.A01(", ", strArr);
                        } else {
                            str3 = null;
                        }
                        A1G.put("categories", str3);
                        A1G.put("well_version", r13.A01);
                        A1F.put(A1G);
                    }
                    C60742z5 r132 = r2.A00;
                    if (r132 != null) {
                        jSONObject = AnonymousClass0x9.A1G();
                        jSONObject.put("welj", C59832xZ.A00(r132.A02));
                        jSONObject.put("data_channel", C59832xZ.A00(r132.A00));
                        jSONObject.put("flow_message", C59832xZ.A00(r132.A01));
                    } else {
                        jSONObject = null;
                    }
                    JSONObject A1G2 = AnonymousClass0x9.A1G();
                    A1G2.put("extensionIdLinks", A1F);
                    String A0c = C18280x3.A0c(jSONObject, "compatibility", A1G2);
                    C162457s7.A0J(rawString, 0);
                    C72333dY r9 = r82.A00;
                    C18260x0.A0F(C72333dY.A00(r9), "extensions_metadata_", rawString, A0c, AnonymousClass001.A0o());
                    String rawString2 = userJid2.getRawString();
                    long currentTimeMillis = System.currentTimeMillis();
                    C162457s7.A0J(rawString2, 0);
                    SharedPreferences.Editor A002 = C72333dY.A00(r9);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("extensions_metadata_timestamp_");
                    C18270x1.A0k(A002, rawString2, A0o, currentTimeMillis);
                    if (z) {
                        ArrayList A0s = AnonymousClass001.A0s();
                        for (Object next : list) {
                            C18280x3.A18(((C53832nk) next).A00, "DRAFT", next, A0s);
                        }
                        Iterator it = A0s.iterator();
                        while (it.hasNext()) {
                            C53832nk r02 = (C53832nk) it.next();
                            String str4 = r02.A05;
                            if (str4 != null) {
                                C23641Ub r133 = this.A07;
                                String str5 = r02.A03;
                                String str6 = str5;
                                r133.A0D(C372521n.PREFETCH_CONVERSATION, userJid2, Boolean.FALSE, str6, str, str2, str5.hashCode());
                                C23401Sx r83 = this.A04;
                                r83.A08.add(new C53462n8((C85034Er) null, str5, str4, r02.A06, false, true));
                            }
                        }
                        this.A04.A0E();
                    }
                    if (r24 != null) {
                        r5.BLI(r2, 2, (String) null, false);
                    }
                    return new C52912mF(r2, 2, (String) null, false);
                }
            }
            r8.A0F(num2, "extensions-metadata-empty-response", (String) null);
            if (r24 != null) {
                r5.BLI(new C41572Kt((C60742z5) null, C72023d3.A00), 3, "extensions-metadata-empty-response", false);
            }
            this.A00.A0A("extensions-metadata-empty-response", true, "");
            Log.w("ExtensionsLogger/ExtensionsMetadataManager/makeExtensionsMetaDataRequest()/callbackResponse() - Extensions metadata response received is empty.");
            return new C52912mF((C41572Kt) null, 3, "extensions-metadata-empty-response", false);
        } else if (C162457s7.A0P(r1.A04.A00((Object) null), 2498098)) {
            r8.A08(num2);
            if (r24 != null) {
                r5.BLI((C41572Kt) null, 3, "extensions-metadata-response-error", true);
            }
            return new C52912mF((C41572Kt) null, 3, "extensions-metadata-response-error", true);
        } else {
            r8.A0F(num2, "extensions-metadata-response-error", (String) null);
            if (r24 != null) {
                r5.BLI((C41572Kt) null, 3, "extensions-metadata-response-error", false);
            }
            this.A00.A0A("extensions-metadata-response-error", true, "");
            Log.w("ExtensionsLogger/ExtensionsMetadataManager/makeExtensionsMetaDataRequest()/callbackResponse() - Response is not success");
            return new C52912mF((C41572Kt) null, 3, "extensions-metadata-response-error", false);
        }
    }

    public final C52912mF A02(AnonymousClass4AC r6, Integer num, Throwable th) {
        C23651Ud r1 = this.A06;
        r1.A09(num, "metadata_network_end");
        r1.A0F(num, "extensions-metadata-graphql-response-error", th.getMessage());
        if (r6 != null) {
            r6.BLI((C41572Kt) null, 3, "extensions-metadata-graphql-response-error", false);
        }
        this.A00.A0A("extensions-metadata-graphql-response-error", true, "");
        Log.w("ExtensionsLogger/ExtensionsMetadataManager/handleMetadataErrorResponse()", th);
        return new C52912mF((C41572Kt) null, 3, "extensions-metadata-graphql-response-error", false);
    }

    public final boolean A05(Integer num) {
        AnonymousClass1VX r2 = this.A08;
        C58422vE r1 = C58422vE.A02;
        if (!r2.A0Y(r1, 5333) || !r2.A0Y(r1, 1319)) {
            return false;
        }
        this.A06.A0F(num, "extensions-metadata-response-error", (String) null);
        Log.w("ExtensionsLogger/ExtensionsMetadataManager/makeExtensionsMetaDataRequest() - request sanctioned.");
        return true;
    }

    public C56162rW(C55682qk r2, AnonymousClass2VI r3, C56612sH r4, C54402of r5, C23401Sx r6, AnonymousClass1Uc r7, C23651Ud r8, C23641Ub r9, AnonymousClass1VX r10, AnonymousClass4FS r11, C73853gB r12) {
        C18260x0.A0V(r5, r2, r3);
        C162457s7.A0J(r10, 5);
        C18260x0.A0U(r11, r4);
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r6;
        this.A08 = r10;
        this.A09 = r11;
        this.A02 = r4;
        this.A06 = r8;
        this.A07 = r9;
        this.A05 = r7;
        this.A0A = r12;
    }

    public final boolean A04(UserJid userJid, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        C54402of r1 = this.A03;
        String rawString = userJid.getRawString();
        C162457s7.A0J(rawString, 0);
        return AnonymousClass001.A1W((currentTimeMillis > (AnonymousClass0x2.A0B((SharedPreferences) r1.A00.get(), AnonymousClass000.A0V("extensions_metadata_timestamp_", rawString, AnonymousClass001.A0o())) + j) ? 1 : (currentTimeMillis == (AnonymousClass0x2.A0B((SharedPreferences) r1.A00.get(), AnonymousClass000.A0V("extensions_metadata_timestamp_", rawString, AnonymousClass001.A0o())) + j) ? 0 : -1)));
    }
}
