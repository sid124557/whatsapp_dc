package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.30S  reason: invalid class name */
public final class AnonymousClass30S {
    public C40072Ek A00 = new C40072Ek(this);
    public final AnonymousClass3TY A01;
    public final AnonymousClass33p A02;
    public final C620733j A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass2TC A05;
    public final AtomicBoolean A06 = C18280x3.A0l();
    public final AnonymousClass66R A07 = C154517dI.A01(new C76813sO(this));

    public static final C61252zx A00(JSONObject jSONObject) {
        String str;
        String str2;
        List list;
        JSONObject jSONObject2 = jSONObject;
        C162457s7.A0J(jSONObject2, 0);
        String optString = jSONObject2.optString("url");
        String optString2 = jSONObject2.optString("locale");
        long A062 = C18320x8.A06("expiresData", jSONObject2);
        String optString3 = jSONObject2.optString("appId");
        String optString4 = jSONObject2.optString("version");
        String optString5 = jSONObject2.optString("platform");
        String optString6 = jSONObject2.optString("bizJid");
        long optLong = jSONObject2.optLong("flowVersionId");
        String optString7 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
        if (!jSONObject2.has("minAppVersion") || jSONObject2.isNull("minAppVersion")) {
            str = null;
        } else {
            str = jSONObject2.getString("minAppVersion");
        }
        if (!jSONObject2.has("bloksVersionId") || jSONObject2.isNull("bloksVersionId")) {
            str2 = null;
        } else {
            str2 = jSONObject2.getString("bloksVersionId");
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("extraVersions");
        if (optJSONArray != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator A012 = C57282tO.A01(optJSONArray);
            while (A012.hasNext()) {
                A0s.add(A00((JSONObject) A012.next()));
            }
            list = C73723fy.A0F(A0s);
        } else {
            list = null;
        }
        C18280x3.A16(optString, optString2, optString3);
        C162457s7.A0H(optString5);
        return new C61252zx(Long.valueOf(optLong), optString, optString2, optString3, optString4, optString5, optString6, optString7, str, str2, list, A062);
    }

    public final C40062Ej A04() {
        String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(this.A02), "commerce_metadata");
        if (A0Z != null) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(A0Z);
                ArrayList A0s = AnonymousClass001.A0s();
                JSONArray optJSONArray = A1H.optJSONArray("bloksLinks");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            A0s.add(A00(optJSONObject));
                        }
                    }
                }
                return new C40062Ej(A0s);
            } catch (JSONException e) {
                Log.d("CommerceMetadataManager/commerceMetadata/invalid json ", e);
            }
        }
        return null;
    }

    public final void A05(AnonymousClass49B r13) {
        if (this.A06.compareAndSet(false, true)) {
            AnonymousClass3TY r6 = this.A01;
            C40072Ek r0 = this.A00;
            C162457s7.A0J(r0, 0);
            r6.A01 = r0;
            r6.A00 = r13;
            AnonymousClass31C r5 = r6.A03;
            String A032 = r5.A03();
            AnonymousClass36K A0F = AnonymousClass36K.A0F(AnonymousClass36K.A0I("bloks_links", new AnonymousClass39V[0]), "commerce_metadata", new AnonymousClass39V[0]);
            AnonymousClass39V[] r2 = new AnonymousClass39V[5];
            AnonymousClass39V.A0E(r2, 0);
            AnonymousClass39V.A09("xmlns", "fb:thrift_iq", r2);
            AnonymousClass39V.A07("smax_id", "91", r2);
            AnonymousClass39V.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, r2);
            r5.A0D(r6, AnonymousClass36K.A0G(A0F, r2), A032, 326, 32000);
        }
    }

    public final void A06(AnonymousClass49B r5, UserJid userJid) {
        String A08 = C56952sp.A08(this.A04, 1693);
        boolean z = false;
        if (userJid != null && C175728Zm.A0S(A08, userJid.user, false)) {
            z = true;
        }
        AnonymousClass33p r1 = this.A02;
        Log.d("wa-shared-prefs/isBloksLayoutGraphQLFetcherEnable");
        if (AnonymousClass0x2.A0F(r1).getBoolean("pref_commerce_metadata_cache_enable", true)) {
            if (z) {
                C40062Ej A042 = A04();
                if (A042 != null) {
                    List<C61252zx> list = A042.A00;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (C61252zx r0 : list) {
                            if (A02(r0.A03) == null) {
                            }
                        }
                    }
                }
            }
            if (r5 != null) {
                r5.BLH();
                return;
            }
            return;
        }
        A05(r5);
    }

    public AnonymousClass30S(AnonymousClass3TY r2, AnonymousClass33p r3, C620733j r4, AnonymousClass1VX r5, AnonymousClass2TC r6) {
        C18260x0.A0d(r3, r4, r5, r6);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C61252zx A01(long r8) {
        /*
            r7 = this;
            X.2Ej r0 = r7.A04()
            if (r0 == 0) goto L_0x0031
            java.util.List r0 = r0.A00
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r5 = r0.iterator()
        L_0x0010:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r4 = r5.next()
            r3 = r4
            X.2zx r3 = (X.C61252zx) r3
            java.lang.Long r0 = r3.A02
            if (r0 == 0) goto L_0x0010
            long r1 = r0.longValue()
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0010
            java.lang.String r1 = r3.A08
            java.lang.String r0 = "android"
            X.C18280x3.A17(r1, r0, r4, r6)
            goto L_0x0010
        L_0x0031:
            X.3d3 r6 = X.C72023d3.A00
        L_0x0033:
            X.2zx r0 = r7.A03(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30S.A01(long):X.2zx");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C61252zx A02(java.lang.String r7) {
        /*
            r6 = this;
            X.2Ej r0 = r6.A04()
            r5 = 0
            if (r0 == 0) goto L_0x002e
            java.util.List r0 = r0.A00
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r0.iterator()
        L_0x0011:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.2zx r1 = (X.C61252zx) r1
            java.lang.String r0 = r1.A03
            boolean r0 = X.C162457s7.A0P(r0, r7)
            if (r0 == 0) goto L_0x0011
            java.lang.String r1 = r1.A08
            java.lang.String r0 = "android"
            X.C18280x3.A17(r1, r0, r2, r4)
            goto L_0x0011
        L_0x002e:
            X.3d3 r4 = X.C72023d3.A00
        L_0x0030:
            X.2zx r2 = r6.A03(r4)
            X.66R r0 = r6.A07
            java.lang.Object r1 = X.C18280x3.A0V(r7, r0)
            if (r1 == 0) goto L_0x0047
            if (r2 == 0) goto L_0x0047
            java.lang.String r0 = r2.A00
            boolean r0 = X.C162457s7.A0P(r0, r1)
            if (r0 != 0) goto L_0x0047
            return r5
        L_0x0047:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30S.A02(java.lang.String):X.2zx");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (r3 == null) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C61252zx A03(java.util.List r9) {
        /*
            r8 = this;
            java.util.Iterator r2 = r9.iterator()
        L_0x0004:
            boolean r0 = r2.hasNext()
            r7 = 0
            if (r0 == 0) goto L_0x008e
            java.lang.Object r3 = r2.next()
            r0 = r3
            X.2zx r0 = (X.C61252zx) r0
            java.lang.String r1 = r0.A06
            X.33j r0 = r8.A03
            java.lang.String r0 = r0.A08()
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0004
        L_0x0020:
            X.2zx r3 = (X.C61252zx) r3
            if (r3 != 0) goto L_0x0072
            java.util.Iterator r2 = r9.iterator()
        L_0x0028:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r3 = r2.next()
            r0 = r3
            X.2zx r0 = (X.C61252zx) r0
            java.lang.String r1 = r0.A06
            X.33j r0 = r8.A03
            java.util.Locale r0 = X.C620733j.A02(r0)
            java.lang.String r0 = r0.getLanguage()
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0028
        L_0x0047:
            X.2zx r3 = (X.C61252zx) r3
            if (r3 != 0) goto L_0x0072
            java.util.Iterator r2 = r9.iterator()
        L_0x004f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r3 = r2.next()
            r0 = r3
            X.2zx r0 = (X.C61252zx) r0
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "en"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x004f
        L_0x0066:
            X.2zx r3 = (X.C61252zx) r3
            if (r3 != 0) goto L_0x0072
            java.lang.Object r3 = X.C73723fy.A04(r9)
            X.2zx r3 = (X.C61252zx) r3
            if (r3 == 0) goto L_0x0090
        L_0x0072:
            X.2zx r6 = r3.A01()
            long r4 = r6.A01
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r2 = r0.getTime()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 / r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0090
            return r6
        L_0x008a:
            r3 = r7
            goto L_0x0066
        L_0x008c:
            r3 = r7
            goto L_0x0047
        L_0x008e:
            r3 = r7
            goto L_0x0020
        L_0x0090:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30S.A03(java.util.List):X.2zx");
    }
}
