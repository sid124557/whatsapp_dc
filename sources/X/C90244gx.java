package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4gx  reason: invalid class name and case insensitive filesystem */
public abstract class C90244gx extends AnonymousClass8JJ {
    public final UserJid A00;

    public void A02() {
        AnonymousClass36K A0G;
        C35361wk r15;
        C35361wk r8;
        C35361wk r1;
        C35261wa r0;
        if (this instanceof C90214gu) {
            C90214gu r2 = (C90214gu) this;
            String A03 = r2.A06.A03();
            r2.A07.A04("view_product_tag");
            C105915Wx r6 = r2.A05;
            AnonymousClass7PB r82 = r2.A04;
            C620433g r02 = r2.A01;
            UserJid userJid = r82.A01;
            String A01 = r02.A07.A01(userJid);
            String str = r82.A04;
            C626936e.A0E(!TextUtils.isEmpty(str), "catalog productId cannot be null or empty");
            ArrayList A0s = AnonymousClass001.A0s();
            AnonymousClass36K.A0P("product_id", str, A0s);
            Integer num = r82.A03;
            if (num != null) {
                AnonymousClass36K.A0P("width", num.toString(), A0s);
            }
            Integer num2 = r82.A02;
            if (num2 != null) {
                AnonymousClass36K.A0P("height", num2.toString(), A0s);
            }
            AnonymousClass36K.A0P("catalog_session_id", r82.A05, A0s);
            if (r82.A06) {
                AnonymousClass36K.A0P("fetch_compliance_info", "true", A0s);
            }
            AnonymousClass5V2.A00(r82.A00, A0s, false);
            if (!TextUtils.isEmpty(A01)) {
                AnonymousClass36K.A0P("direct_connection_encrypted_info", A01, A0s);
            }
            AnonymousClass39V[] r3 = new AnonymousClass39V[1];
            AnonymousClass39V.A02(userJid, "jid", r3, 0);
            AnonymousClass36K r4 = new AnonymousClass36K("product", r3, C18280x3.A1a(A0s, 0));
            AnonymousClass39V[] r32 = new AnonymousClass39V[4];
            AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A03, r32, 0);
            AnonymousClass39V.A09("xmlns", "w:biz:catalog", r32);
            r6.A02(r2, AnonymousClass36K.A0C(C135206kI.A00, r4, r32), A03, 196);
        } else if (this instanceof C90234gw) {
            C90234gw r22 = (C90234gw) this;
            String A032 = r22.A07.A03();
            AnonymousClass7PS r7 = r22.A01;
            String str2 = r7.A06;
            if (str2 == null) {
                AnonymousClass316 A002 = C105255Ue.A00(r22.A08, "catalog_collections_view_tag");
                if (A002 == null) {
                    Log.d("BizQPLManager/startCollectionsDataSourceBlock/pref tracker not found. Have you called startPrefTracker()?");
                } else {
                    A002.A0A("datasource_collections");
                }
            }
            C104705Sa r03 = r22.A09;
            UserJid userJid2 = r7.A05;
            r03.A00(userJid2, A032, 271);
            C105915Wx r42 = r22.A06;
            if (r22.A05.A0X(5886)) {
                String A012 = r22.A01.A07.A01(userJid2);
                C35361wk r13 = null;
                if (A012 != null) {
                    r15 = new C35361wk(A012, 10);
                } else {
                    r15 = null;
                }
                C52332lJ r9 = r7.A00;
                if (r9 != null) {
                    r8 = new C35361wk(C73723fy.A0A(",", r9.A02, C175608Za.A00), 13);
                    r1 = new C35361wk(AnonymousClass0x9.A0m(r9.A01), AnonymousClass0x9.A0m(r9.A00), 14);
                } else {
                    r8 = null;
                    r1 = null;
                }
                Long A0m = AnonymousClass0x9.A0m(r7.A01);
                Long A0m2 = AnonymousClass0x9.A0m(3);
                if (str2 != null) {
                    r0 = new C35261wa(str2, 2);
                } else {
                    r0 = null;
                }
                String str3 = r7.A07;
                if (str3 != null) {
                    r13 = new C35361wk(str3, 9);
                }
                C35661xE r11 = new C35661xE(userJid2, r13, new C35361wk(AnonymousClass0x9.A0m(r7.A03), AnonymousClass0x9.A0m(r7.A02), 15), r15, r8, r1, new C35361wk(new C35361wk(A032, 7)), r0, A0m, A0m2, A032);
                r22.A0A.A00.put(A032, r11);
                A0G = r11.A00;
                C162457s7.A0D(A0G);
            } else {
                ArrayList A0s2 = AnonymousClass001.A0s();
                AnonymousClass36K.A0P("width", String.valueOf(r7.A03), A0s2);
                AnonymousClass36K.A0P("height", String.valueOf(r7.A02), A0s2);
                if (str2 != null) {
                    AnonymousClass36K.A0P("after", str2, A0s2);
                }
                String str4 = r7.A07;
                if (str4 != null) {
                    AnonymousClass36K.A0P("catalog_session_id", str4, A0s2);
                }
                AnonymousClass36K.A0P("collection_limit", String.valueOf(r7.A01), A0s2);
                AnonymousClass36K.A0P("item_limit", String.valueOf(3), A0s2);
                String A013 = r22.A01.A07.A01(userJid2);
                if (A013 != null) {
                    AnonymousClass36K.A0P("direct_connection_encrypted_info", A013, A0s2);
                }
                AnonymousClass5V2.A00(r7.A00, A0s2, false);
                AnonymousClass39V[] r62 = new AnonymousClass39V[1];
                AnonymousClass39V.A02(userJid2, "biz_jid", r62, 0);
                AnonymousClass36K r92 = new AnonymousClass36K("collections", r62, C18280x3.A1a(A0s2, 0));
                AnonymousClass39V[] r63 = new AnonymousClass39V[5];
                AnonymousClass39V.A02(r7.A04, "to", r63, 0);
                AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, r63, 1);
                AnonymousClass39V.A06("smax_id", "35", r63);
                AnonymousClass39V.A07("xmlns", "w:biz:catalog", r63);
                AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r63, 4);
                A0G = AnonymousClass36K.A0G(r92, r63);
            }
            r42.A02(r22, A0G, A032, 271);
            Log.d("GetCollectionsProtocol/doSendRequest/sent");
        } else if (this instanceof C90204gt) {
            C90204gt r23 = (C90204gt) this;
            C86644Kx.A1K(r23.A02, 0);
            String A033 = r23.A05.A03();
            C620433g r04 = r23.A01;
            UserJid userJid3 = r23.A00;
            String A014 = r04.A07.A01(userJid3);
            r23.A06.A04("plm_details_view_tag");
            C105915Wx r64 = r23.A04;
            List list = r23.A09;
            String str5 = r23.A08;
            String str6 = r23.A07;
            ArrayList A0s3 = AnonymousClass001.A0s();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0s3.add(new AnonymousClass36K(new AnonymousClass36K(PublicKeyCredentialControllerUtility.JSON_KEY_ID, AnonymousClass001.A0m(it), (AnonymousClass39V[]) null), "product", (AnonymousClass39V[]) null));
            }
            AnonymousClass36K.A0P("width", str5, A0s3);
            AnonymousClass36K.A0P("height", str6, A0s3);
            if (A014 != null) {
                AnonymousClass36K.A0P("direct_connection_encrypted_info", A014, A0s3);
            }
            AnonymousClass36K r43 = new AnonymousClass36K("product_list", new AnonymousClass39V[]{new AnonymousClass39V((Jid) userJid3, "jid")}, C18280x3.A1a(A0s3, 0));
            AnonymousClass39V[] r33 = new AnonymousClass39V[5];
            AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A033, r33, 0);
            AnonymousClass39V.A09("xmlns", "w:biz:catalog", r33);
            AnonymousClass39V.A07("smax_id", "21", r33);
            r33[4] = AnonymousClass39V.A00();
            r64.A02(r23, AnonymousClass36K.A0G(r43, r33), A033, 164);
            C18260x0.A1R(AnonymousClass001.A0o(), "RequestBizProductListProtocolHelper/doSendRequest/jid=", userJid3);
        } else {
            C90224gv r24 = (C90224gv) this;
            String A034 = r24.A06.A03();
            C160157n8 r10 = r24.A04;
            String str7 = r10.A08;
            if (str7 == null) {
                AnonymousClass316 A003 = C105255Ue.A00(r24.A07, "catalog_collections_view_tag");
                if (A003 == null) {
                    Log.d("BizQPLManager/startCatalogDataSourceBlock/pref tracker not found. Have you called startPrefTracker()?");
                } else {
                    A003.A0A("datasource_catalog");
                }
            }
            C105915Wx r72 = r24.A05;
            C620433g r05 = r24.A01;
            UserJid userJid4 = r10.A07;
            String A015 = r05.A07.A01(userJid4);
            ArrayList A0s4 = AnonymousClass001.A0s();
            AnonymousClass36K.A0P("limit", Integer.toString(r10.A04), A0s4);
            AnonymousClass36K.A0P("width", Integer.toString(r10.A06), A0s4);
            AnonymousClass36K.A0P("height", Integer.toString(r10.A05), A0s4);
            if (str7 != null) {
                AnonymousClass36K.A0P("after", str7, A0s4);
            }
            String str8 = r10.A09;
            if (str8 != null) {
                AnonymousClass36K.A0P("catalog_session_id", str8, A0s4);
            }
            if (A015 != null) {
                AnonymousClass36K.A0P("direct_connection_encrypted_info", A015, A0s4);
            }
            AnonymousClass5V2.A00(r10.A01, A0s4, false);
            ArrayList A0s5 = AnonymousClass001.A0s();
            A0s5.add(new AnonymousClass39V((Jid) userJid4, "jid"));
            Boolean bool = Boolean.TRUE;
            if (bool == r10.A02) {
                AnonymousClass39V.A03("allow_shop_source", bool.toString(), A0s5);
            }
            AnonymousClass36K r44 = new AnonymousClass36K("product_catalog", (AnonymousClass39V[]) A0s5.toArray(new AnonymousClass39V[A0s5.size()]), C18280x3.A1a(A0s4, 0));
            AnonymousClass39V[] r34 = new AnonymousClass39V[4];
            AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A034, r34, 0);
            AnonymousClass39V.A05("xmlns", "w:biz:catalog", r34);
            AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r34);
            r72.A02(r24, AnonymousClass36K.A0C(C135206kI.A00, r44, r34), A034, 164);
        }
    }

    public void A03() {
        if (this instanceof C90214gu) {
            Log.i("ProductRequestProtocolHelper/onDirectConnectionRevokeKey");
            ((C90214gu) this).A07.A03("view_product_tag");
        } else if (this instanceof C90234gw) {
            C90234gw r2 = (C90234gw) this;
            r2.A06();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GetCollectionsProtocol/onDirectConnectionRevokeKey/jid - ");
            C18260x0.A0o(r2.A01.A05, A0o);
        } else if (this instanceof C90204gt) {
            C90204gt r22 = (C90204gt) this;
            r22.A06.A03("plm_details_view_tag");
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("RequestBizProductListProtocolHelper/onDirectConnectionRevokeKey, jid = ");
            C18260x0.A1L(A0o2, r22.A00.getRawString());
        } else {
            C90224gv r23 = (C90224gv) this;
            if (r23.A04.A08 == null) {
                r23.A07.A01();
            }
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("sendGetBizProductCatalog/onDirectConnectionRevokeKey/jid=");
            C18260x0.A0o(r23.A00, A0o3);
        }
    }

    public void A04(C108985dt r4) {
        if (r4 == null || !r4.A0X) {
            A02();
            return;
        }
        C166057y4 r2 = r4.A02;
        if (r2 != null) {
            C620433g r1 = this.A01;
            UserJid userJid = this.A00;
            r1.A0C.A1g(userJid.getRawString(), r2.A00);
        }
        this.A01.A07(this, this.A00, false);
    }

    public void A05(UserJid userJid, String str, int i) {
        C55682qk r3;
        String A0Y;
        boolean z;
        String str2;
        if (this instanceof C90214gu) {
            C90214gu r2 = (C90214gu) this;
            C18260x0.A0x("ProductRequestProtocolHelper/onError/error - ", AnonymousClass001.A0o(), i);
            r2.A07.A03("view_product_tag");
            r2.A01.BT2(r2.A04, i);
        } else if (this instanceof C90234gw) {
            C90234gw r22 = (C90234gw) this;
            if (str != null) {
                r22.A0A.A00.remove(str);
            }
            r22.A06();
            if (str != null) {
                r22.A09.A01(str);
            }
            C18260x0.A0x("GetCollectionsProtocol/onError/error - ", AnonymousClass001.A0o(), i);
            r22.A00.A01(r22.A01, i);
        } else {
            if (this instanceof C90204gt) {
                C90204gt r23 = (C90204gt) this;
                r23.A06.A03("plm_details_view_tag");
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("RequestBizProductListProtocolHelper/onError/response-error, jid = ");
                C18260x0.A1K(A0o, userJid.getRawString());
                C86644Kx.A1K(r23.A02, 2);
                r3 = r23.A00;
                A0Y = AnonymousClass000.A0Y("error_code=", AnonymousClass001.A0o(), i);
                z = true;
                str2 = "RequestBizProductListProtocolHelper/get product list error";
            } else {
                C90224gv r32 = (C90224gv) this;
                C160157n8 r24 = r32.A04;
                if (r24.A08 == null) {
                    r32.A07.A01();
                }
                C18260x0.A1Q(AnonymousClass001.A0o(), "sendGetBizProductCatalog/response-error/jid=", userJid);
                r32.A01.BSo(r24, i);
                r3 = r32.A00;
                A0Y = AnonymousClass000.A0Y("error_code=", AnonymousClass001.A0o(), i);
                z = true;
                str2 = "RequestBizProductCatalogProtocolHelper/get product catalog error";
            }
            r3.A0A(str2, z, A0Y);
        }
    }

    public C90244gx(C620433g r1, UserJid userJid) {
        super(r1);
        this.A00 = userJid;
    }

    public static void A00(C620433g r3, C90244gx r4) {
        if (r3.A0F()) {
            C620433g r32 = r4.A01;
            UserJid userJid = r4.A00;
            C56192ra r1 = r32.A07;
            if (r1.A01(userJid) == null || r1.A06(userJid)) {
                r32.A06(new C1898092s(r4, 0), userJid);
                return;
            }
        }
        r4.A02();
    }

    public final void BRC(UserJid userJid) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DirectConnectionProtocolHelperEntryPoint/onDirectConnectionError, jid = ");
        C18260x0.A1K(A0o, userJid.getRawString());
        A05(userJid, (String) null, 422);
    }

    public final void BRD(UserJid userJid) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DirectConnectionProtocolHelperEntryPoint/onDirectConnectionSucceeded, jid = ");
        C18260x0.A1L(A0o, userJid.getRawString());
        A02();
    }

    public final void BSN(AnonymousClass36K r4, String str) {
        int A01 = C57492tj.A01(r4);
        if (A01 != 421 || this.A00) {
            A05(this.A00, str, A01);
            return;
        }
        A03();
        this.A00 = true;
        this.A01.A07(this, this.A00, true);
    }
}
