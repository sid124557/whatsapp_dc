package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2nc  reason: invalid class name and case insensitive filesystem */
public class C53762nc {
    public C40002Ed A00 = new C40002Ed(this);
    public boolean A01;
    public final C68203Sg A02;
    public final C54292oU A03;
    public final AnonymousClass33p A04;
    public final C620733j A05;
    public final AnonymousClass1VX A06;
    public final AtomicBoolean A07 = C18280x3.A0l();

    public final C42132Mx A00() {
        String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(this.A04), "commerce_metadata_tanslations");
        if (A0Z == null) {
            return null;
        }
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(A0Z);
            LinkedHashMap A0r = C18320x8.A0r();
            JSONArray optJSONArray = A1H.optJSONArray("strings");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        A0r.put(C18290x4.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, optJSONObject), C18290x4.A0r("value", optJSONObject));
                    }
                }
            }
            C42132Mx r2 = new C42132Mx(C18290x4.A0r("locale", A1H), A0r, A1H.getLong("expiresAt"));
            if (C162457s7.A0P(r2.A01, C620733j.A02(this.A05).getLanguage())) {
                return r2;
            }
            Log.e("CommerceTranslationsMetadataManager/CommerceMetadataTranslations/translation locale is different than system locale ");
            return null;
        } catch (JSONException e) {
            Log.d("CommerceTranslationsMetadataManager/CommerceMetadataTranslations/invalid json ", e);
            return null;
        }
    }

    public final void A01() {
        AtomicBoolean atomicBoolean = this.A07;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            C68203Sg r6 = this.A02;
            C40002Ed r0 = this.A00;
            C162457s7.A0J(r0, 0);
            r6.A00 = r0;
            AnonymousClass31C r5 = r6.A02;
            String A032 = r5.A03();
            AnonymousClass39V[] r2 = new AnonymousClass39V[1];
            String A072 = r6.A01.A07();
            C162457s7.A0D(A072);
            AnonymousClass39V.A0B("locale", A072, r2, 0);
            AnonymousClass36K A0F = AnonymousClass36K.A0F(AnonymousClass36K.A0I("translations", r2), "commerce_metadata", new AnonymousClass39V[0]);
            AnonymousClass39V[] r22 = new AnonymousClass39V[5];
            AnonymousClass39V.A0E(r22, 0);
            AnonymousClass39V.A09("xmlns", "fb:thrift_iq", r22);
            AnonymousClass39V.A07("smax_id", "91", r22);
            AnonymousClass39V.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, r22);
            r5.A0D(r6, AnonymousClass36K.A0G(A0F, r22), A032, 334, 32000);
        }
    }

    public C53762nc(C68203Sg r2, C54292oU r3, AnonymousClass33p r4, C620733j r5, AnonymousClass1VX r6) {
        C18260x0.A0d(r4, r5, r6, r3);
        this.A04 = r4;
        this.A05 = r5;
        this.A02 = r2;
        this.A06 = r6;
        this.A03 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r0.A00 < X.C18290x4.A0B(new java.util.Date().getTime())) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02() {
        /*
            r6 = this;
            X.2Mx r0 = r6.A00()
            r5 = 0
            if (r0 == 0) goto L_0x001b
            long r3 = r0.A00
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            long r1 = X.C18290x4.A0B(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L_0x001c
        L_0x001b:
            r2 = 1
        L_0x001c:
            X.2Mx r0 = r6.A00()
            if (r0 == 0) goto L_0x0038
            java.lang.String r1 = r0.A01
            X.33j r0 = r6.A05
            java.util.Locale r0 = X.C620733j.A02(r0)
            java.lang.String r0 = r0.getLanguage()
            boolean r0 = X.C162457s7.A0P(r1, r0)
        L_0x0032:
            if (r2 != 0) goto L_0x0036
            if (r0 != 0) goto L_0x0037
        L_0x0036:
            r5 = 1
        L_0x0037:
            return r5
        L_0x0038:
            r0 = 0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53762nc.A02():boolean");
    }
}
