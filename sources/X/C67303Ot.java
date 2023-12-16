package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Ot  reason: invalid class name and case insensitive filesystem */
public abstract class C67303Ot implements C84594Cy {
    public String A00 = "";
    public final long A01;
    public final C56492s4 A02;
    public final AnonymousClass33p A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass28T A05;
    public final C183538qC A06;
    public final String A07;
    public final Map A08;
    public final AnonymousClass4C1 A09;
    public final AnonymousClass4C1 A0A;

    public String A01() {
        int i;
        String string;
        if (this instanceof C27301db) {
            string = String.format(Locale.ENGLISH, "%sfacebook.com", Arrays.copyOf(new Object[]{""}, 1));
        } else if (this instanceof AnonymousClass1MU) {
            return null;
        } else {
            if (this instanceof C27281dZ) {
                string = AnonymousClass0x2.A0F(this.A03).getString("pref_fb_graphql_domain", "facebook.com");
            } else {
                if (this instanceof C34671vX) {
                    i = ((C34671vX) this).A00;
                } else if (this instanceof C34661vW) {
                    i = ((C34661vW) this).A00;
                } else if (!(this instanceof C34651vV)) {
                    return null;
                } else {
                    i = ((C34651vV) this).A00;
                }
                if (i == 0) {
                    return "facebook.com";
                }
                return "instagram.com";
            }
        }
        C162457s7.A0D(string);
        return string;
    }

    public String A02() {
        AnonymousClass3FI r2;
        Map A052;
        AnonymousClass3FI r4;
        String str;
        if (this instanceof C27301db) {
            return "WhatsApp";
        }
        if (this instanceof C27221dT) {
            r4 = ((C27221dT) this).A00;
        } else if ((this instanceof C27331de) || (this instanceof C27311dc)) {
            return "";
        } else {
            if (this instanceof C27341df) {
                C27341df r0 = (C27341df) this;
                r2 = r0.A01;
                A052 = r0.A05();
            } else if ((this instanceof C27291da) || (this instanceof C27271dY)) {
                return "";
            } else {
                if (!(this instanceof C27351dg)) {
                    return null;
                }
                C27351dg r1 = (C27351dg) this;
                if ((r1 instanceof AnonymousClass1MU) || (r1 instanceof AnonymousClass1MO)) {
                    return "";
                }
                if (r1 instanceof AnonymousClass1MR) {
                    r4 = r1.A00;
                } else {
                    r2 = r1.A00;
                    A052 = r1.A05();
                }
            }
            return r2.A05(A052);
        }
        synchronized (r4) {
            str = r4.A04;
            if (str == null) {
                C60002xq r3 = new C60002xq(false);
                Map map = r3.A01;
                map.put("FBAN", "WhatsAppAndroid");
                map.put("FBAV", AnonymousClass3FI.A07);
                map.put("FBLC", r4.A06.A08());
                str = r3.A00();
                r4.A04 = str;
            }
        }
        return str;
    }

    public final void A06(String str) {
        if (!AnonymousClass2AB.A05(str, "/")) {
            str = AnonymousClass0x2.A0e(str, AnonymousClass001.A0o(), '/');
        }
        this.A00 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0749, code lost:
        if (r0 != null) goto L_0x074b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(org.json.JSONObject r13) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.C36651zf
            if (r0 == 0) goto L_0x004e
            r3 = r12
            X.1zf r3 = (X.C36651zf) r3
            org.json.JSONObject r2 = X.AnonymousClass0x2.A0l(r13)
            org.json.JSONArray r7 = X.AnonymousClass0x9.A1F()
            org.json.JSONArray r6 = X.AnonymousClass0x9.A1F()
            java.util.List r8 = r3.A03
            java.util.Iterator r9 = r8.iterator()
        L_0x0019:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0788
            java.lang.Object r1 = r9.next()
            X.2kt r1 = (X.C52102kt) r1
            int r0 = r1.A00
            r7.put(r0)
            X.5dj r5 = r1.A01
            X.2gK r4 = r3.A00
            java.lang.String r1 = "XFAM_CROSSPOSTING_ELIGIBILITY_GQL"
            X.3zg r0 = new X.3zg
            r0.<init>(r5, r1)
            java.lang.Object r1 = X.C617031x.A00(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x004b
            int r0 = r1.length()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r4.A00(r1)
        L_0x0047:
            r6.put(r0)
            goto L_0x0019
        L_0x004b:
            java.lang.String r0 = "0"
            goto L_0x0047
        L_0x004e:
            boolean r0 = r12 instanceof X.C36641ze
            if (r0 == 0) goto L_0x00e9
            r4 = r12
            X.1ze r4 = (X.C36641ze) r4
            org.json.JSONObject r3 = X.AnonymousClass0x2.A0l(r13)
            org.json.JSONArray r5 = X.AnonymousClass0x9.A1F()
            java.util.List r0 = r4.A02
            java.util.Iterator r8 = r0.iterator()
        L_0x0063:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r6 = r8.next()
            X.2my r6 = (X.C53362my) r6
            X.2gK r7 = r4.A00
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            X.5dj r2 = r6.A00
            java.lang.String r1 = "XFAM_CROSSPOSTING_REQUEST_GQL"
            X.3zg r0 = new X.3zg
            r0.<init>(r2, r1)
            java.lang.Object r1 = X.C617031x.A00(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00c2
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00c2
            java.lang.String r2 = r7.A00(r1)
        L_0x0090:
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()
            java.lang.String r0 = "wa_status_id"
            org.json.JSONObject r2 = r1.put(r0, r2)
            java.lang.String r1 = "message"
            java.lang.String r0 = r6.A04
            org.json.JSONObject r2 = r2.put(r1, r0)
            java.lang.String r1 = "link_url"
            java.lang.String r0 = r6.A01
            org.json.JSONObject r2 = r2.put(r1, r0)
            java.lang.String r1 = "media_type"
            java.lang.String r0 = r6.A03
            org.json.JSONObject r2 = r2.put(r1, r0)
            java.lang.String r1 = "media_everstore_direct_path"
            java.lang.String r0 = r6.A02
            org.json.JSONObject r0 = r2.put(r1, r0)
            X.C162457s7.A0D(r0)
            r5.put(r0)
            goto L_0x0063
        L_0x00c2:
            r2 = 0
            goto L_0x0090
        L_0x00c4:
            java.lang.String r0 = "statuses"
            r3.put(r0, r5)
            java.lang.String r1 = "session_id"
            java.lang.String r0 = r4.A01
            r3.put(r1, r0)
            java.lang.String r1 = "wa_device_os"
            java.lang.String r0 = "android"
            r3.put(r1, r0)
            java.lang.String r1 = "wa_mobile_app_version"
            java.lang.String r0 = "2.23.26.14"
            org.json.JSONObject r1 = X.C18300x5.A0z(r0, r1, r3)
            java.lang.String r0 = "input_params"
            A00(r3, r0, r1, r13)
            return
        L_0x00e9:
            boolean r0 = r12 instanceof X.C36631zd
            if (r0 == 0) goto L_0x0112
            r3 = r12
            X.1zd r3 = (X.C36631zd) r3
            org.json.JSONObject r2 = X.AnonymousClass0x2.A0l(r13)
            java.lang.String r1 = "app_id"
            java.lang.String r0 = "3402315746664947"
            r2.put(r1, r0)
            java.lang.String r1 = "request_token"
            java.lang.String r0 = r3.A01
            r2.put(r1, r0)
            java.lang.String r1 = "blob"
            java.lang.String r0 = r3.A00
            org.json.JSONObject r1 = X.C18300x5.A0z(r0, r1, r2)
            java.lang.String r0 = "web_auth_params"
            A00(r2, r0, r1, r13)
            return
        L_0x0112:
            boolean r0 = r12 instanceof X.C36621zc
            if (r0 == 0) goto L_0x0128
            org.json.JSONObject r2 = X.AnonymousClass0x2.A0l(r13)
            java.lang.String r1 = "app_id"
            java.lang.String r0 = "3402315746664947"
            org.json.JSONObject r1 = X.C18300x5.A0z(r0, r1, r2)
            java.lang.String r0 = "input_params"
            A00(r2, r0, r1, r13)
            return
        L_0x0128:
            boolean r0 = r12 instanceof X.C27321dd
            if (r0 == 0) goto L_0x020a
            r8 = r12
            X.1dd r8 = (X.C27321dd) r8
            r3 = 0
            X.C162457s7.A0J(r13, r3)
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r7 = "app_id"
            java.lang.String r6 = X.C58172up.A0B
            r2.put(r7, r6)
            java.lang.String r1 = "name"
            java.lang.String r0 = "mobile_uitracker_events"
            org.json.JSONObject r5 = X.C18300x5.A0z(r0, r1, r2)
            java.lang.String r4 = "batches"
            X.5Wc r0 = r8.A01
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getCacheDir()
            java.lang.String r0 = "wds_metrics"
            java.io.File r2 = X.AnonymousClass002.A0A(r1, r0)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x016b
            r1 = 3
            X.6Ab r0 = new X.6Ab
            r0.<init>(r1)
            java.io.File[] r11 = r2.listFiles(r0)
            if (r11 != 0) goto L_0x016d
        L_0x016b:
            java.io.File[] r11 = new java.io.File[r3]
        L_0x016d:
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            int r9 = r11.length
            r8 = 0
        L_0x0173:
            if (r8 >= r9) goto L_0x0193
            r0 = r11[r8]
            byte[] r2 = X.C382926u.A00(r0)     // Catch:{ IOException -> 0x0186 }
            X.C162457s7.A0D(r2)     // Catch:{ IOException -> 0x0186 }
            java.nio.charset.Charset r1 = X.AnonymousClass79X.A05     // Catch:{ IOException -> 0x0186 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x0186 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0186 }
            goto L_0x018d
        L_0x0186:
            r1 = move-exception
            java.lang.String r0 = "FileUtils/readFile/ioerror"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0190
        L_0x018d:
            r10.add(r0)
        L_0x0190:
            int r8 = r8 + 1
            goto L_0x0173
        L_0x0193:
            org.json.JSONArray r2 = X.AnonymousClass0x9.A1F()
            java.util.Iterator r1 = r10.iterator()
        L_0x019b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r0)
            r2.put(r0)
            goto L_0x019b
        L_0x01ad:
            r5.put(r4, r2)
            java.lang.String r4 = "config"
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "app_ver"
            java.lang.String r0 = "2.23.26.14"
            r2.put(r1, r0)
            r2.put(r7, r6)
            java.lang.String r1 = "config_version"
            java.lang.String r0 = "v2"
            r2.put(r1, r0)
            r5.put(r4, r2)
            java.lang.String r4 = "request_info"
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "channel"
            java.lang.String r0 = "unified_micro_batch"
            r2.put(r1, r0)
            java.lang.String r1 = X.AnonymousClass0x9.A0y(r2, r4, r5)
            java.lang.String r0 = "message"
            r13.put(r0, r1)
            java.lang.String r1 = "format"
            java.lang.String r0 = "json"
            r13.put(r1, r0)
            java.lang.String r1 = "multi_batch"
            r0 = 1
            r13.put(r1, r0)
            long r1 = android.os.SystemClock.uptimeMillis()
            java.lang.String r0 = "system_uptime"
            r13.put(r0, r1)
            java.lang.String r0 = "requestType"
            r13.put(r0, r3)
            java.lang.String r1 = "sdk"
            java.lang.String r0 = "android"
            r13.put(r1, r0)
            return
        L_0x020a:
            boolean r0 = r12 instanceof X.C27331de
            if (r0 == 0) goto L_0x02ca
            r4 = r12
            X.1de r4 = (X.C27331de) r4
            java.lang.String r3 = "variables"
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r8 = r4.A00
            java.lang.String r0 = "AesKey="
            r6 = 2
            boolean r0 = X.AnonymousClass2AB.A05(r8, r0)
            if (r0 == 0) goto L_0x0286
            java.lang.String r0 = ";IV="
            r5 = 0
            int r1 = X.C175728Zm.A0G(r8, r0, r5, r5)
            if (r1 <= 0) goto L_0x0286
            java.lang.String r0 = ";Data="
            int r7 = X.C175728Zm.A0G(r8, r0, r5, r5)
            if (r7 <= 0) goto L_0x0286
            r0 = 7
            java.lang.String r5 = r8.substring(r0, r1)
            X.C162457s7.A0D(r5)
            int r0 = r1 + 4
            java.lang.String r1 = r8.substring(r0, r7)
            X.C162457s7.A0D(r1)
            int r0 = r7 + 6
            java.lang.String r0 = r8.substring(r0)
            X.C162457s7.A0D(r0)
            byte[] r7 = android.util.Base64.decode(r5, r6)
            byte[] r1 = android.util.Base64.decode(r1, r6)
            byte[] r0 = android.util.Base64.decode(r0, r6)
            if (r7 == 0) goto L_0x0286
            if (r1 == 0) goto L_0x0286
            if (r0 == 0) goto L_0x0286
            X.2Nz r5 = new X.2Nz
            r5.<init>(r7, r0, r1)
            byte[] r0 = r5.A00
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r6)
            java.lang.String r0 = "encrypted_flow_data"
            r2.put(r0, r1)
            byte[] r0 = r5.A01
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r6)
            java.lang.String r0 = "encrypted_aes_key"
            r2.put(r0, r1)
            byte[] r0 = r5.A02
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r6)
            java.lang.String r0 = "initial_vector"
            r2.put(r0, r1)
        L_0x0286:
            java.lang.String r1 = r4.A03
            java.lang.String r0 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x029b
            java.lang.String r1 = "flow_data_endpoint"
            java.lang.String r0 = r4.A02
            r2.put(r1, r0)
        L_0x0297:
            X.C18300x5.A1L(r2, r3, r13)
            return
        L_0x029b:
            java.lang.String r0 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02ab
            java.lang.String r0 = "3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0297
        L_0x02ab:
            java.lang.String r5 = "extension_id"
            java.lang.String r0 = r4.A01     // Catch:{ NumberFormatException -> 0x02ba }
            X.C626936e.A06(r0)     // Catch:{ NumberFormatException -> 0x02ba }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x02ba }
            r2.put(r5, r0)     // Catch:{ NumberFormatException -> 0x02ba }
            goto L_0x0297
        L_0x02ba:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExtensionsLogger/ExtensionsDataExchangeGraphqlRequest/addVersionSpecificVariables: Exception when parsing extensionId:"
            r1.append(r0)
            java.lang.String r0 = r4.A01
            X.C18260x0.A14(r0, r1, r5)
            goto L_0x0297
        L_0x02ca:
            boolean r0 = r12 instanceof X.C27311dc
            if (r0 == 0) goto L_0x0338
            r7 = r12
            X.1dc r7 = (X.C27311dc) r7
            org.json.JSONObject r3 = X.AnonymousClass0x2.A0l(r13)
            X.2zH r5 = r7.A00
            com.whatsapp.jid.UserJid r0 = r5.A01
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "jid"
            r3.put(r0, r1)
            org.json.JSONArray r6 = X.AnonymousClass0x9.A1F()
            java.util.List r0 = r5.A04
            java.util.Iterator r4 = r0.iterator()
        L_0x02ec:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0304
            java.lang.Object r2 = r4.next()
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()
            java.lang.String r0 = "retailer_id"
            r1.put(r0, r2)
            r6.put(r1)
            goto L_0x02ec
        L_0x0304:
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "id"
            java.lang.String r0 = r7.A01
            r2.put(r1, r0)
            java.lang.String r0 = "catalog"
            r3.put(r0, r2)
            java.lang.String r0 = "products"
            r3.put(r0, r6)
            java.lang.String r1 = r5.A03
            java.lang.String r0 = "width"
            r3.put(r0, r1)
            java.lang.String r1 = r5.A02
            java.lang.String r0 = "height"
            org.json.JSONObject r2 = X.C18300x5.A0z(r1, r0, r3)
            java.lang.String r0 = "product_list"
            org.json.JSONObject r1 = X.C18300x5.A0z(r3, r0, r2)
            java.lang.String r0 = "request"
            A00(r2, r0, r1, r13)
            return
        L_0x0338:
            boolean r0 = r12 instanceof X.C27251dW
            if (r0 == 0) goto L_0x036e
            r4 = r12
            X.1dW r4 = (X.C27251dW) r4
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "app_id"
            java.lang.String r0 = "dev.app.id"
            r3.put(r1, r0)
            java.lang.String r1 = "request_token"
            java.lang.String r0 = r4.A02
            org.json.JSONObject r2 = X.C18300x5.A0z(r0, r1, r3)
            java.lang.String r1 = "description"
            java.lang.String r0 = r4.A01
            r2.put(r1, r0)
            java.lang.String r1 = "debug_info"
            java.lang.String r0 = r4.A00
            r2.put(r1, r0)
            java.lang.String r0 = "user_request"
            r3.put(r0, r2)
            java.lang.String r0 = "variables"
            X.C18300x5.A1L(r3, r0, r13)
            return
        L_0x036e:
            boolean r0 = r12 instanceof X.C27211dS
            if (r0 == 0) goto L_0x038f
            r3 = r12
            X.1dS r3 = (X.C27211dS) r3
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "app_id"
            java.lang.String r0 = "dev.app.id"
            r2.put(r1, r0)
            java.lang.String r1 = "request_token"
            java.lang.String r0 = r3.A00
            r2.put(r1, r0)
            java.lang.String r0 = "variables"
            X.C18300x5.A1L(r2, r0, r13)
            return
        L_0x038f:
            boolean r0 = r12 instanceof X.C27241dV
            if (r0 == 0) goto L_0x03c9
            r3 = r12
            X.1dV r3 = (X.C27241dV) r3
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L_0x03c2
            java.lang.String r0 = "fbid"
            r2.put(r0, r1)
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "stitch_images"
            r2.put(r0, r1)
            java.lang.String r1 = r3.A00
            if (r1 == 0) goto L_0x03bb
            java.lang.String r0 = "ent_type"
            r2.put(r0, r1)
        L_0x03bb:
            java.lang.String r0 = "variables"
            r13.put(r0, r2)
            return
        L_0x03c2:
            java.lang.String r0 = "GraphqlRequest: fbId is required"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x03c9:
            boolean r0 = r12 instanceof X.C27231dU
            if (r0 == 0) goto L_0x040e
            r3 = r12
            X.1dU r3 = (X.C27231dU) r3
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L_0x0407
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0407
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            byte[] r0 = r1.getBytes()
            java.lang.String r1 = X.C18290x4.A0t(r0)
            java.lang.String r0 = "auth_token"
            r2.put(r0, r1)
            java.lang.String r1 = "app_id"
            java.lang.String r0 = "com.whatsapp.w4b"
            r2.put(r1, r0)
            X.3FI r0 = r3.A00
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "user_agent"
            r2.put(r0, r1)
            java.lang.String r1 = "version"
            java.lang.String r0 = "1"
            A00(r0, r1, r2, r13)
            return
        L_0x0407:
            java.lang.String r0 = "GetBanReportRequest: auth_token cannot be null. "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x040e:
            boolean r0 = r12 instanceof X.C27261dX
            if (r0 == 0) goto L_0x04aa
            r3 = r12
            X.1dX r3 = (X.C27261dX) r3
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            X.1VX r5 = r3.A04
            r0 = 3231(0xc9f, float:4.528E-42)
            X.2vE r2 = X.C58422vE.A02
            java.lang.String r4 = r5.A0R(r2, r0)
            r0 = 4821(0x12d5, float:6.756E-42)
            boolean r1 = r5.A0Y(r2, r0)
            r0 = 6058(0x17aa, float:8.489E-42)
            boolean r5 = r5.A0Y(r2, r0)
            if (r4 == 0) goto L_0x046a
            boolean r0 = X.C175738Zn.A0V(r4)
            if (r0 != 0) goto L_0x046a
        L_0x0437:
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r0 = "sticker_pack"
            r2.put(r0, r4)
            java.lang.String r1 = "default_pack"
            boolean r0 = r3.A03
            r2.put(r1, r0)
            java.util.Set r1 = r3.A02
            boolean r0 = X.C18310x6.A1X(r1)
            if (r0 == 0) goto L_0x047a
            org.json.JSONArray r4 = X.AnonymousClass0x9.A1F()
            java.util.Iterator r1 = r1.iterator()
        L_0x0458:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0474
            java.lang.Object r0 = r1.next()
            X.2jB r0 = (X.C51042jB) r0
            java.lang.String r0 = r0.A00
            r4.put(r0)
            goto L_0x0458
        L_0x046a:
            if (r1 == 0) goto L_0x0470
            java.lang.String r4 = "v5_stickers"
            goto L_0x0437
        L_0x0470:
            java.lang.String r4 = "v4_stickers"
            goto L_0x0437
        L_0x0474:
            java.lang.String r0 = "stable_ids"
            r2.put(r0, r4)
        L_0x047a:
            X.21f r0 = r3.A00
            java.lang.String r1 = r0.value
            java.lang.String r0 = "request_type"
            r2.put(r0, r1)
            if (r5 == 0) goto L_0x0495
            org.json.JSONArray r1 = X.AnonymousClass0x9.A1F()
            java.lang.String r0 = "expresso"
            org.json.JSONArray r1 = r1.put(r0)
            java.lang.String r0 = "experiments"
            r2.put(r0, r1)
        L_0x0495:
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L_0x049f
            java.lang.String r0 = "revision_id"
            r2.put(r0, r1)
        L_0x049f:
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()
            java.lang.String r0 = "params"
            A00(r2, r0, r1, r13)
            return
        L_0x04aa:
            boolean r0 = r12 instanceof X.C27191dQ
            if (r0 == 0) goto L_0x04f7
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            X.1VX r3 = r12.A04
            r0 = 4821(0x12d5, float:6.756E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r1 = r3.A0Y(r2, r0)
            r0 = 6058(0x17aa, float:8.489E-42)
            boolean r4 = r3.A0Y(r2, r0)
            if (r1 == 0) goto L_0x04f3
            java.lang.String r3 = "v4_profile_photos"
        L_0x04c7:
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "default_pack"
            r0 = 1
            r2.put(r1, r0)
            java.lang.String r0 = "sticker_pack"
            r2.put(r0, r3)
            if (r4 == 0) goto L_0x04e8
            org.json.JSONArray r1 = X.AnonymousClass0x9.A1F()
            java.lang.String r0 = "expresso"
            org.json.JSONArray r1 = r1.put(r0)
            java.lang.String r0 = "experiments"
            r2.put(r0, r1)
        L_0x04e8:
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()
            java.lang.String r0 = "params"
            A00(r2, r0, r1, r13)
            return
        L_0x04f3:
            java.lang.String r3 = "v3_profile_photos"
            goto L_0x04c7
        L_0x04f7:
            boolean r0 = r12 instanceof X.C27181dP
            if (r0 == 0) goto L_0x0511
            org.json.JSONObject r2 = X.AnonymousClass0x2.A0l(r13)
            java.lang.String r1 = "version"
            r0 = 1
            r2.put(r1, r0)
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()
            java.lang.String r0 = "params"
            A00(r2, r0, r1, r13)
            return
        L_0x0511:
            boolean r0 = r12 instanceof X.C27171dO
            if (r0 != 0) goto L_0x07d7
            boolean r0 = r12 instanceof X.C27281dZ
            if (r0 != 0) goto L_0x07d7
            boolean r0 = r12 instanceof X.C27341df
            if (r0 == 0) goto L_0x0585
            r0 = r12
            X.1df r0 = (X.C27341df) r0
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            X.2nU r4 = r0.A04
            com.whatsapp.jid.UserJid r0 = r4.A03
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "wa_business_jid"
            org.json.JSONObject r5 = X.C18300x5.A0z(r1, r0, r2)
            int r1 = r4.A01
            java.lang.String r0 = "height"
            r5.put(r0, r1)
            int r1 = r4.A02
            java.lang.String r0 = "width"
            r5.put(r0, r1)
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()
            r1 = 12
            java.lang.String r0 = "limit"
            r3.put(r0, r1)
            java.lang.String r0 = "image_dimensions"
            org.json.JSONObject r1 = X.C18300x5.A0z(r5, r0, r3)
            java.lang.String r0 = "posts"
            r1.put(r0, r3)
            int r0 = r4.A00
            if (r0 != 0) goto L_0x0582
            java.lang.String r0 = "linked_fb_page"
        L_0x055f:
            r2.put(r0, r1)
            boolean r1 = r4.A06
            java.lang.String r0 = "filter_sensitive_content"
            r2.put(r0, r1)
            boolean r1 = r4.A05
            java.lang.String r0 = "filter_ineligible_posts"
            r2.put(r0, r1)
            boolean r1 = r4.A04
            java.lang.String r0 = "is_trust_card"
            r2.put(r0, r1)
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()
            java.lang.String r0 = "request"
            A00(r2, r0, r1, r13)
            return
        L_0x0582:
            java.lang.String r0 = "linked_ig_professional"
            goto L_0x055f
        L_0x0585:
            boolean r0 = r12 instanceof X.C27201dR
            if (r0 == 0) goto L_0x05ba
            r2 = r12
            X.1dR r2 = (X.C27201dR) r2
            org.json.JSONObject r4 = X.AnonymousClass0x2.A0l(r13)
            java.lang.String r1 = "prompt"
            java.lang.String r0 = r2.A00
            r4.put(r1, r0)
            X.1VX r3 = r2.A04
            r0 = 4889(0x1319, float:6.851E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r1 = r3.A0Y(r2, r0)
            java.lang.String r0 = "include_animated"
            r4.put(r0, r1)
            r0 = 6469(0x1945, float:9.065E-42)
            int r1 = r3.A0O(r2, r0)
            java.lang.String r0 = "version"
            r4.put(r0, r1)
            java.lang.String r0 = "variables"
            r13.put(r0, r4)
            return
        L_0x05ba:
            boolean r0 = r12 instanceof X.C27291da
            if (r0 == 0) goto L_0x05e8
            r5 = r12
            X.1da r5 = (X.C27291da) r5
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            java.lang.String r4 = "variables"
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "biz_jid"
            java.lang.String r0 = r5.A00
            org.json.JSONObject r1 = X.C18300x5.A0z(r0, r1, r2)
            java.lang.String r0 = "extensions"
            r1.put(r0, r2)
            java.lang.String r0 = "request"
            java.lang.String r0 = X.C18280x3.A0c(r1, r0, r3)
            r13.put(r4, r0)
            return
        L_0x05e8:
            boolean r0 = r12 instanceof X.C27271dY
            if (r0 != 0) goto L_0x07d7
            boolean r0 = r12 instanceof X.C27161dN
            if (r0 == 0) goto L_0x05fc
            org.json.JSONObject r2 = X.AnonymousClass0x2.A0l(r13)
            java.lang.String r1 = "device_model"
            java.lang.String r0 = android.os.Build.MODEL
            A00(r0, r1, r2, r13)
            return
        L_0x05fc:
            boolean r0 = r12 instanceof X.C34641vU
            if (r0 == 0) goto L_0x06a2
            r6 = r12
            X.1vU r6 = (X.C34641vU) r6
            org.json.JSONObject r2 = X.AnonymousClass0x2.A0l(r13)
            org.json.JSONArray r5 = X.AnonymousClass0x9.A1F()
            java.util.List r0 = r6.A01
            java.util.Iterator r4 = r0.iterator()
        L_0x0611:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0635
            java.lang.Object r0 = r4.next()
            X.223 r0 = (X.AnonymousClass223) r0
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "waffle_xan"
            java.lang.String r0 = r0.gqlValue
            r3.put(r1, r0)
            java.lang.String r1 = "waffle_xs"
            java.lang.String r0 = "S"
            r3.put(r1, r0)
            r5.put(r3)
            goto L_0x0611
        L_0x0635:
            java.lang.String r0 = "waffle_xas"
            r2.put(r0, r5)
            java.util.List r3 = r6.A02
            int r1 = r3.size()
            java.lang.String r0 = "waffle_unique_id_count"
            r2.put(r0, r1)
            org.json.JSONArray r5 = X.AnonymousClass0x9.A1F()
            org.json.JSONArray r4 = X.AnonymousClass0x9.A1F()
            java.util.Iterator r3 = r3.iterator()
        L_0x0653:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x066e
            java.lang.Object r1 = r3.next()
            X.2kr r1 = (X.C52082kr) r1
            int r0 = r1.A00
            r5.put(r0)
            java.lang.String r0 = r1.A01
            if (r0 != 0) goto L_0x066a
            java.lang.String r0 = "0"
        L_0x066a:
            r4.put(r0)
            goto L_0x0653
        L_0x066e:
            java.lang.String r0 = "exp_time"
            r2.put(r0, r5)
            java.lang.String r0 = "waffle_unique_ids"
            r2.put(r0, r4)
            X.3dd r1 = r6.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A00
            boolean r0 = r0.get()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x069b
            byte[] r0 = r1.A02
            java.lang.String r1 = X.AnonymousClass0x7.A0s(r0)
            X.C162457s7.A0D(r1)
            java.lang.String r0 = "purpose_client_pub_key"
            org.json.JSONObject r1 = X.C18300x5.A0z(r1, r0, r2)
            java.lang.String r0 = "input_params"
            A00(r2, r0, r1, r13)
            return
        L_0x069b:
            java.lang.String r0 = "key has been destroyed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x06a2:
            boolean r0 = r12 instanceof X.C34671vX
            if (r0 == 0) goto L_0x06bd
            r3 = r12
            X.1vX r3 = (X.C34671vX) r3
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            int r0 = r3.A00
            if (r0 == 0) goto L_0x07d7
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "ACCESS_TOKEN"
            java.lang.String r0 = r3.A07
            A00(r0, r1, r2, r13)
            return
        L_0x06bd:
            boolean r0 = r12 instanceof X.C34661vW
            if (r0 == 0) goto L_0x06d8
            r3 = r12
            X.1vW r3 = (X.C34661vW) r3
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            int r0 = r3.A00
            if (r0 == 0) goto L_0x07d7
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "ACCESS_TOKEN"
            java.lang.String r0 = r3.A07
            A00(r0, r1, r2, r13)
            return
        L_0x06d8:
            boolean r0 = r12 instanceof X.C34631vT
            if (r0 == 0) goto L_0x06e8
            org.json.JSONObject r2 = X.AnonymousClass0x2.A0l(r13)
            java.lang.String r1 = "caller_name"
            java.lang.String r0 = "cross_app_creation_wa_crossposting"
            A00(r0, r1, r2, r13)
            return
        L_0x06e8:
            boolean r0 = r12 instanceof X.C34651vV
            if (r0 == 0) goto L_0x0703
            r3 = r12
            X.1vV r3 = (X.C34651vV) r3
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            int r0 = r3.A00
            if (r0 == 0) goto L_0x07d7
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "ACCESS_TOKEN"
            java.lang.String r0 = r3.A07
            A00(r0, r1, r2, r13)
            return
        L_0x0703:
            r2 = r12
            X.1dg r2 = (X.C27351dg) r2
            boolean r0 = r2 instanceof X.AnonymousClass1MU
            if (r0 == 0) goto L_0x077a
            X.1MU r2 = (X.AnonymousClass1MU) r2
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            java.util.Map r4 = r2.A01
            java.lang.String r0 = "flow_message_version"
            java.lang.Object r5 = r4.get(r0)
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "bloks_version"
            java.lang.String r0 = "6c404196454966428d798beeeffa89a9ea5cf915e4ff8a7448ab0b8135b0a3f9"
            r3.put(r1, r0)
            java.lang.String r0 = "3"
            boolean r0 = X.C162457s7.A0P(r5, r0)
            if (r0 == 0) goto L_0x0773
            r0 = 1
        L_0x072c:
            java.lang.String r1 = "extension_id"
            java.lang.String r2 = "screen_id"
            if (r0 == 0) goto L_0x0755
            java.lang.String r0 = "flow_id"
            java.lang.Object r0 = r4.get(r0)
            r3.put(r1, r0)
            java.lang.String r1 = "business_jid"
            java.lang.Object r0 = r4.get(r1)
            r3.put(r1, r0)
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L_0x074e
        L_0x074b:
            r3.put(r2, r0)
        L_0x074e:
            java.lang.String r0 = "variables"
            X.C18300x5.A1L(r3, r0, r13)
            return
        L_0x0755:
            java.lang.String r0 = "1"
            boolean r0 = X.C162457s7.A0P(r5, r0)
            if (r0 == 0) goto L_0x0767
            java.lang.String r1 = "flow_version_id"
            java.lang.Object r0 = r4.get(r1)
            r3.put(r1, r0)
            goto L_0x074e
        L_0x0767:
            java.lang.Object r0 = r4.get(r1)
            r3.put(r1, r0)
            java.lang.Object r0 = r4.get(r2)
            goto L_0x074b
        L_0x0773:
            java.lang.String r0 = "2"
            boolean r0 = X.C162457s7.A0P(r5, r0)
            goto L_0x072c
        L_0x077a:
            java.lang.String r1 = "variables"
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1G()
            r2.A09(r0)
            X.C18300x5.A1L(r0, r1, r13)
            return
        L_0x0788:
            int r1 = r8.size()
            java.lang.String r0 = "whatsapp_status_unique_fbids_count"
            r2.put(r0, r1)
            java.lang.String r0 = "whatsapp_status_object_expiration_time"
            r2.put(r0, r7)
            java.lang.String r0 = "whatsapp_status_unique_fbids"
            r2.put(r0, r6)
            X.3de r1 = r3.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A00
            boolean r0 = r0.get()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x07d8
            byte[] r0 = r1.A02
            java.lang.String r1 = X.AnonymousClass0x7.A0s(r0)
            X.C162457s7.A0D(r1)
            java.lang.String r0 = "purpose_client_pub_key"
            r2.put(r0, r1)
            java.lang.String r1 = "session_id"
            java.lang.String r0 = r3.A02
            r2.put(r1, r0)
            java.lang.String r1 = "wa_device_os"
            java.lang.String r0 = "android"
            r2.put(r1, r0)
            java.lang.String r1 = "wa_mobile_app_version"
            java.lang.String r0 = "2.23.26.14"
            org.json.JSONObject r1 = X.C18300x5.A0z(r0, r1, r2)
            java.lang.String r0 = "input_params"
            A00(r2, r0, r1, r13)
        L_0x07d7:
            return
        L_0x07d8:
            java.lang.String r0 = "key has been destroyed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67303Ot.A07(org.json.JSONObject):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:109|110|111|112|(6:114|(1:116)|117|118|119|120)(3:121|122|123)) */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01ee, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        X.AnonymousClass2A8.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r4 = r9.B46(r4.A02, 1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r0 = X.C624535b.A02(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0201, code lost:
        if (r0 != null) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0203, code lost:
        r1 = new X.C618532n(r0.getJSONObject("error"));
        r0 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020e, code lost:
        if (r0 != 190) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0210, code lost:
        X.C626936e.A0D(false, X.C18260x0.A05("unknown error: ", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0217, code lost:
        r3.BSB(new X.AnonymousClass244(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0222, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0227, code lost:
        throw X.AnonymousClass001.A0e("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x022a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x022e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x022f, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0230, code lost:
        r1 = X.AnonymousClass001.A0o();
        r0 = "Failed to parse the error response: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        X.AnonymousClass2A8.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0109, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r4.A04.A0Y(X.C58422vE.A02, 539) != false) goto L_0x0022;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x01f3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00cd */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e2 A[Catch:{ all -> 0x0109 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0102 A[SYNTHETIC, Splitter:B:60:0x0102] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bh4(X.AnonymousClass4EN r24) {
        /*
            r23 = this;
            r4 = r23
            r3 = r24
            java.lang.String r0 = r4.A04()     // Catch:{ MalformedURLException -> 0x025e }
            java.net.URL r7 = X.C18330xA.A0B(r0)     // Catch:{ MalformedURLException -> 0x025e }
            boolean r0 = r4 instanceof X.C27321dd
            if (r0 == 0) goto L_0x0025
            r0 = 1
        L_0x0011:
            r13 = 1
            if (r0 != 0) goto L_0x0022
            X.1VX r2 = r4.A04
            r1 = 539(0x21b, float:7.55E-43)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r21 = 0
            if (r0 == 0) goto L_0x0027
        L_0x0022:
            r21 = 1
            goto L_0x0027
        L_0x0025:
            r0 = 0
            goto L_0x0011
        L_0x0027:
            org.json.JSONObject r6 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            r4.A07(r6)     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            java.lang.String r1 = r4.A07     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            if (r1 != 0) goto L_0x0034
            java.lang.String r1 = "WA|1015890928915437|3201f239340c1c8ec6262a6dad04200e"
        L_0x0034:
            java.lang.String r0 = "access_token"
            r6.put(r0, r1)     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            java.lang.String r2 = "doc_id"
            long r0 = r4.A01     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            r6.put(r2, r0)     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            java.lang.String r5 = "lang"
            java.lang.String r2 = r4.A03()     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            r6.put(r5, r2)     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            java.lang.String r5 = "Content-Type"
            java.lang.String r2 = "application/json"
            java.lang.String r17 = X.C18280x3.A0c(r2, r5, r6)     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            r2 = 22
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            X.8qC r2 = r4.A06     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            java.lang.Object r14 = r2.get()     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            X.33K r14 = (X.AnonymousClass33K) r14     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            java.lang.String r16 = r7.toString()     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            java.lang.String r18 = r4.A02()     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            boolean r2 = r4 instanceof X.AnonymousClass1MU     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            if (r2 != 0) goto L_0x0071
            boolean r2 = r4 instanceof X.AnonymousClass1MR     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            if (r2 != 0) goto L_0x0071
            r20 = 0
            goto L_0x0073
        L_0x0071:
            r20 = 1
        L_0x0073:
            java.util.Map r6 = r4.A08     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            java.lang.Integer r15 = X.AnonymousClass0x9.A0j()     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            r2 = 0
            if (r18 != 0) goto L_0x0082
            X.3FI r5 = r14.A01     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            java.lang.String r18 = r5.A02()     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
        L_0x0082:
            r19 = r6
            r22 = r2
            X.4GL r9 = r14.A02(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ JSONException -> 0x024e, IOException -> 0x0249 }
            android.net.TrafficStats.clearThreadStatsTag()
            r5 = r9
            X.3PZ r5 = (X.AnonymousClass3PZ) r5     // Catch:{ OutOfMemoryError -> 0x0237 }
            java.net.HttpURLConnection r8 = r5.A01     // Catch:{ OutOfMemoryError -> 0x0237 }
            java.lang.String r11 = r8.getContentEncoding()     // Catch:{ OutOfMemoryError -> 0x0237 }
            java.lang.String r7 = "unknown error: "
            r5 = 190(0xbe, float:2.66E-43)
            java.lang.String r6 = "error"
            java.lang.String r12 = "Required value was null."
            if (r11 == 0) goto L_0x0116
            int r10 = r11.length()
            if (r10 == 0) goto L_0x0116
            java.lang.String r10 = "gzip"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x010e
            X.2s4 r11 = r4.A02     // Catch:{ Exception -> 0x00cd }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x00cd }
            java.io.InputStream r11 = r9.B47(r11, r10, r15)     // Catch:{ Exception -> 0x00cd }
            java.util.zip.GZIPInputStream r10 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x00cd }
            r10.<init>(r11)     // Catch:{ Exception -> 0x00cd }
            org.json.JSONObject r16 = X.C624535b.A02(r10)     // Catch:{ all -> 0x00c6 }
            r10.close()     // Catch:{ Exception -> 0x00cd }
            goto L_0x0127
        L_0x00c6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r10, r1)     // Catch:{ Exception -> 0x00cd }
            throw r0     // Catch:{ Exception -> 0x00cd }
        L_0x00cd:
            X.2s4 r1 = r4.A02     // Catch:{ Exception -> 0x0263 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0263 }
            java.io.InputStream r0 = r9.B46(r1, r0, r15)     // Catch:{ Exception -> 0x0263 }
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x0263 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0263 }
            org.json.JSONObject r0 = X.C624535b.A02(r4)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0102
            org.json.JSONObject r0 = r0.getJSONObject(r6)     // Catch:{ all -> 0x0107 }
            X.32n r1 = new X.32n     // Catch:{ all -> 0x0107 }
            r1.<init>((org.json.JSONObject) r0)     // Catch:{ all -> 0x0107 }
            int r0 = r1.A01     // Catch:{ all -> 0x0107 }
            if (r0 == r5) goto L_0x00f6
            java.lang.String r0 = X.C18260x0.A05(r7, r0)     // Catch:{ all -> 0x0107 }
            X.C626936e.A0D(r2, r0)     // Catch:{ all -> 0x0107 }
        L_0x00f6:
            X.244 r0 = new X.244     // Catch:{ all -> 0x0107 }
            r0.<init>(r1)     // Catch:{ all -> 0x0107 }
            r3.BSB(r0)     // Catch:{ all -> 0x0107 }
            r4.close()     // Catch:{ Exception -> 0x0263 }
            return
        L_0x0102:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r12)     // Catch:{ all -> 0x0107 }
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x0107:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ Exception -> 0x0263 }
            throw r0     // Catch:{ Exception -> 0x0263 }
        L_0x010e:
            java.lang.String r0 = "Unknown Content-Encoding sent by server"
            java.lang.IllegalStateException r4 = X.AnonymousClass001.A0e(r0)
            goto L_0x026d
        L_0x0116:
            X.2s4 r11 = r4.A02     // Catch:{ Exception -> 0x01f3 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x01f3 }
            java.io.InputStream r10 = r9.B47(r11, r10, r15)     // Catch:{ Exception -> 0x01f3 }
            org.json.JSONObject r16 = X.C624535b.A02(r10)     // Catch:{ all -> 0x01ec }
            r10.close()     // Catch:{ Exception -> 0x01f3 }
        L_0x0127:
            X.4C1 r5 = r4.A09
            java.lang.Object r14 = r5.get()
            X.2WN r14 = (X.AnonymousClass2WN) r14
            X.4C1 r4 = r4.A0A
            java.lang.Object r15 = r4.get()
            X.2fE r15 = (X.C48642fE) r15
            if (r16 == 0) goto L_0x01e7
            int r4 = r8.getContentLength()
            long r4 = (long) r4
            X.2SI r13 = new X.2SI
            r17 = r4
            r13.<init>(r14, r15, r16, r17)
            r13.A01 = r0
            org.json.JSONObject r1 = r13.A05     // Catch:{ JSONException -> 0x01e2 }
            java.lang.String r0 = "errors"
            org.json.JSONArray r7 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x01e2 }
            r5 = 1
            if (r7 == 0) goto L_0x0189
            r13.A00 = r5     // Catch:{ JSONException -> 0x01e2 }
            X.2fE r8 = r13.A04     // Catch:{ JSONException -> 0x01e2 }
            java.util.HashMap r0 = X.AnonymousClass001.A0t()     // Catch:{ JSONException -> 0x01e2 }
            r8.A00 = r0     // Catch:{ JSONException -> 0x01e2 }
            int r6 = r7.length()     // Catch:{ JSONException -> 0x01e2 }
        L_0x0160:
            if (r2 >= r6) goto L_0x01a9
            org.json.JSONObject r5 = r7.getJSONObject(r2)     // Catch:{ JSONException -> 0x01e2 }
            X.32n r4 = new X.32n     // Catch:{ JSONException -> 0x01e2 }
            r4.<init>((org.json.JSONObject) r5)     // Catch:{ JSONException -> 0x01e2 }
            java.util.Map r1 = r8.A00     // Catch:{ JSONException -> 0x01e2 }
            int r0 = r4.A01     // Catch:{ JSONException -> 0x01e2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x01e2 }
            r1.put(r0, r4)     // Catch:{ JSONException -> 0x01e2 }
            X.1d7 r4 = new X.1d7     // Catch:{ JSONException -> 0x01e2 }
            r4.<init>(r5)     // Catch:{ JSONException -> 0x01e2 }
            java.util.Map r1 = r8.A01     // Catch:{ JSONException -> 0x01e2 }
            int r0 = r4.A00     // Catch:{ JSONException -> 0x01e2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x01e2 }
            r1.put(r0, r4)     // Catch:{ JSONException -> 0x01e2 }
            int r2 = r2 + 1
            goto L_0x0160
        L_0x0189:
            org.json.JSONObject r4 = r1.optJSONObject(r6)     // Catch:{ JSONException -> 0x01e2 }
            if (r4 == 0) goto L_0x01ad
            r13.A00 = r5     // Catch:{ JSONException -> 0x01e2 }
            X.2fE r1 = r13.A04     // Catch:{ JSONException -> 0x01e2 }
            java.util.HashMap r0 = X.AnonymousClass001.A0t()     // Catch:{ JSONException -> 0x01e2 }
            r1.A00 = r0     // Catch:{ JSONException -> 0x01e2 }
            X.32n r2 = new X.32n     // Catch:{ JSONException -> 0x01e2 }
            r2.<init>((org.json.JSONObject) r4)     // Catch:{ JSONException -> 0x01e2 }
            java.util.Map r1 = r1.A00     // Catch:{ JSONException -> 0x01e2 }
            int r0 = r2.A01     // Catch:{ JSONException -> 0x01e2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x01e2 }
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x01e2 }
        L_0x01a9:
            r3.AyP(r13)     // Catch:{ JSONException -> 0x01e2 }
            goto L_0x01e1
        L_0x01ad:
            java.lang.String r0 = "data"
            org.json.JSONObject r6 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x01bd }
            X.2WN r4 = r13.A03     // Catch:{ JSONException -> 0x01bd }
            long r0 = r13.A01     // Catch:{ JSONException -> 0x01bd }
            r4.A02(r6, r0)     // Catch:{ JSONException -> 0x01bd }
            r13.A00 = r2     // Catch:{ JSONException -> 0x01bd }
            goto L_0x01a9
        L_0x01bd:
            r2 = move-exception
            X.2fE r4 = r13.A04     // Catch:{ JSONException -> 0x01e2 }
            java.util.HashMap r0 = X.AnonymousClass001.A0t()     // Catch:{ JSONException -> 0x01e2 }
            r4.A00 = r0     // Catch:{ JSONException -> 0x01e2 }
            java.lang.String r1 = r2.getMessage()     // Catch:{ JSONException -> 0x01e2 }
            java.lang.String r0 = android.util.Log.getStackTraceString(r2)     // Catch:{ JSONException -> 0x01e2 }
            X.32n r2 = new X.32n     // Catch:{ JSONException -> 0x01e2 }
            r2.<init>(r1, r0)     // Catch:{ JSONException -> 0x01e2 }
            java.util.Map r1 = r4.A00     // Catch:{ JSONException -> 0x01e2 }
            r0 = -20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x01e2 }
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x01e2 }
            r13.A00 = r5     // Catch:{ JSONException -> 0x01e2 }
            goto L_0x01a9
        L_0x01e1:
            return
        L_0x01e2:
            r0 = move-exception
            r3.BSB(r0)
            return
        L_0x01e7:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r12)
            throw r0
        L_0x01ec:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01ee }
        L_0x01ee:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r10, r1)     // Catch:{ Exception -> 0x01f3 }
            throw r0     // Catch:{ Exception -> 0x01f3 }
        L_0x01f3:
            X.2s4 r1 = r4.A02     // Catch:{ Exception -> 0x022f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x022f }
            java.io.InputStream r4 = r9.B46(r1, r0, r15)     // Catch:{ Exception -> 0x022f }
            org.json.JSONObject r0 = X.C624535b.A02(r4)     // Catch:{ all -> 0x0228 }
            if (r0 == 0) goto L_0x0223
            org.json.JSONObject r0 = r0.getJSONObject(r6)     // Catch:{ all -> 0x0228 }
            X.32n r1 = new X.32n     // Catch:{ all -> 0x0228 }
            r1.<init>((org.json.JSONObject) r0)     // Catch:{ all -> 0x0228 }
            int r0 = r1.A01     // Catch:{ all -> 0x0228 }
            if (r0 == r5) goto L_0x0217
            java.lang.String r0 = X.C18260x0.A05(r7, r0)     // Catch:{ all -> 0x0228 }
            X.C626936e.A0D(r2, r0)     // Catch:{ all -> 0x0228 }
        L_0x0217:
            X.244 r0 = new X.244     // Catch:{ all -> 0x0228 }
            r0.<init>(r1)     // Catch:{ all -> 0x0228 }
            r3.BSB(r0)     // Catch:{ all -> 0x0228 }
            r4.close()     // Catch:{ Exception -> 0x022f }
            return
        L_0x0223:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r12)     // Catch:{ all -> 0x0228 }
            throw r0     // Catch:{ all -> 0x0228 }
        L_0x0228:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x022a }
        L_0x022a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ Exception -> 0x022f }
            throw r0     // Catch:{ Exception -> 0x022f }
        L_0x022f:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to parse the error response: "
            goto L_0x026a
        L_0x0237:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "OutOfMemoryError in parsing the response: "
            X.C18260x0.A1Q(r1, r0, r2)
            java.lang.String r0 = "OutOfMemoryError while parsing response "
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r0, r2)
            goto L_0x026d
        L_0x0249:
            r0 = move-exception
            r3.BQq(r0)     // Catch:{ all -> 0x0259 }
            goto L_0x0255
        L_0x024e:
            r0 = move-exception
            X.C626936e.A0A(r0)     // Catch:{ all -> 0x0259 }
            r3.BSB(r0)     // Catch:{ all -> 0x0259 }
        L_0x0255:
            android.net.TrafficStats.clearThreadStatsTag()
            return
        L_0x0259:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x025e:
            r4 = move-exception
            X.C626936e.A0A(r4)
            goto L_0x026d
        L_0x0263:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Exception in Decompression: "
        L_0x026a:
            X.C18260x0.A1Q(r1, r0, r4)
        L_0x026d:
            r3.BSB(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67303Ot.Bh4(X.4EN):void");
    }

    public C67303Ot(C56492s4 r2, AnonymousClass33p r3, AnonymousClass1VX r4, AnonymousClass28T r5, C183538qC r6, String str, Map map, AnonymousClass4C1 r9, AnonymousClass4C1 r10, long j) {
        C18260x0.A0f(r4, r2, r3, r6, r9);
        C162457s7.A0J(r10, 6);
        this.A04 = r4;
        this.A02 = r2;
        this.A03 = r3;
        this.A06 = r6;
        this.A09 = r9;
        this.A0A = r10;
        this.A01 = j;
        this.A07 = str;
        this.A08 = map;
        this.A05 = r5;
    }

    public static void A00(Object obj, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        jSONObject.put(str, obj);
        jSONObject2.put("variables", jSONObject);
    }

    public String A03() {
        return C18290x4.A0o(Locale.getDefault());
    }

    public String A04() {
        String str;
        String str2;
        String A012 = A01();
        if (A012 == null || A012.length() == 0) {
            A012 = AnonymousClass0x2.A0F(this.A03).getString("pref_graphql_domain", "whatsapp.com");
        }
        C162457s7.A0H(A012);
        if (this.A04.A0Y(C58422vE.A02, 549)) {
            str = "?_emp=1";
        } else {
            str = "";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("https://graph.");
        A0o.append(A012);
        if (this instanceof C27321dd) {
            str2 = "";
        } else {
            str2 = "/graphql";
        }
        A0o.append(str2);
        return AnonymousClass000.A0V(this.A00, str, A0o);
    }

    public final Map A05() {
        HashMap A0t = AnonymousClass001.A0t();
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(C56952sp.A08(this.A04, 2014));
            Iterator<String> keys = A1H.keys();
            C162457s7.A0D(keys);
            while (keys.hasNext()) {
                String A0m = AnonymousClass001.A0m(keys);
                JSONArray jSONArray = A1H.getJSONArray(A0m);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    C162457s7.A0D(string);
                    C162457s7.A0H(A0m);
                    A0t.put(string, A0m);
                }
            }
        } catch (JSONException e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "GraphqlRequestBase/getLocaleFallbackMap/failed to parse locale fallback map from JSON/", e);
        }
        return A0t;
    }
}
