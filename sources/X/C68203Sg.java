package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3Sg  reason: invalid class name and case insensitive filesystem */
public final class C68203Sg implements AnonymousClass4EZ {
    public C40002Ed A00;
    public final C620733j A01;
    public final AnonymousClass31C A02;

    public void BQs(String str) {
        C18260x0.A0r("GetCommerceTranslationsMetadataProtocolHelper/onDeliveryFailure: Network failed  while sending the payload: ", str, C18280x3.A0g(str, 0));
        C40002Ed r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("listener");
        }
        r0.A00.A07.set(false);
    }

    public void BSN(AnonymousClass36K r4, String str) {
        C162457s7.A0J(r4, 1);
        Log.e("GetCommerceTranslationsMetadataProtocolHelper/response-error");
        AnonymousClass36K A0l = r4.A0l("error");
        if (A0l != null) {
            A0l.A0b("code", 0);
        }
        C40002Ed r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("listener");
        }
        r0.A00.A07.set(false);
    }

    public void BdM(AnonymousClass36K r13, String str) {
        String str2;
        AnonymousClass36K A0l;
        AnonymousClass36K[] r9;
        AnonymousClass36K A0l2;
        String A0L;
        Long A07;
        AnonymousClass36K A0l3;
        C162457s7.A0J(r13, 1);
        AnonymousClass36K A0l4 = r13.A0l("commerce_metadata");
        if (A0l4 == null || (A0l3 = A0l4.A0l("translations")) == null || (str2 = AnonymousClass36K.A0L(A0l3, "locale")) == null) {
            str2 = "";
        }
        if (AnonymousClass000.A1T(str2.length())) {
            Log.e("GetCommerceTranslationsMetadataProtocolHelper/onSuccess can not find locale value in response!");
            C40002Ed r0 = this.A00;
            if (r0 == null) {
                throw C18270x1.A0S("listener");
            }
            r0.A00.A07.set(false);
            return;
        }
        long A0B = C18290x4.A0B(new Date().getTime()) + 86400000;
        if (!(A0l4 == null || (A0l2 = A0l4.A0l("translations")) == null || (A0L = AnonymousClass36K.A0L(A0l2, "expires_at")) == null || (A07 = C829745q.A07(A0L)) == null)) {
            A0B = A07.longValue();
        }
        HashMap A0t = AnonymousClass001.A0t();
        if (!(A0l4 == null || (A0l = A0l4.A0l("translations")) == null || (r9 = A0l.A03) == null)) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (AnonymousClass36K r4 : r9) {
                C18280x3.A17(r4.A00, "string", r4, A0s);
            }
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                AnonymousClass36K A0Y = C18310x6.A0Y(it);
                if (!(A0Y.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null) == null || A0Y.A0r("value", (String) null) == null)) {
                    String A0r = A0Y.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null);
                    C162457s7.A0H(A0r);
                    String A0r2 = A0Y.A0r("value", (String) null);
                    C162457s7.A0H(A0r2);
                    A0t.put(A0r, A0r2);
                }
                A0s2.add(C59022wD.A00);
            }
        }
        C40002Ed r02 = this.A00;
        if (r02 == null) {
            throw C18270x1.A0S("listener");
        }
        C42132Mx r3 = new C42132Mx(str2, A0t, A0B);
        C53762nc r1 = r02.A00;
        r1.A07.set(false);
        AnonymousClass33p r6 = r1.A04;
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("locale", r3.A01);
        A1G.put("expiresAt", r3.A00);
        JSONArray A1F = AnonymousClass0x9.A1F();
        Iterator A0q = AnonymousClass000.A0q(r3.A02);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            JSONObject A1G2 = AnonymousClass0x9.A1G();
            A1G2.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0w.getKey());
            A1G2.put("value", A0w.getValue());
            A1F.put(A1G2);
        }
        C18270x1.A0j(C18270x1.A03(r6), "commerce_metadata_tanslations", AnonymousClass0x9.A0y(A1F, "strings", A1G));
    }

    public C68203Sg(C620733j r1, AnonymousClass31C r2) {
        C18260x0.A0Q(r2, r1);
        this.A02 = r2;
        this.A01 = r1;
    }
}
