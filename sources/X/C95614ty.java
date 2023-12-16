package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.4ty  reason: invalid class name and case insensitive filesystem */
public abstract class C95614ty extends C134626jM implements AnonymousClass4CL {
    public final int A00;
    public final AnonymousClass7RW A01;
    public final C59012wB A02;
    public final AnonymousClass7MY A03;
    public final AnonymousClass2PW A04;
    public final AnonymousClass7IB A05;
    public final AnonymousClass4FS A06;

    public static void A00(C95614ty r2, int i) {
        r2.A06.BkM(new C117115rP(r2, i));
    }

    public static void A01(C95614ty r4, UserJid userJid) {
        AnonymousClass7RW r3 = r4.A01;
        C620433g r2 = r3.A00;
        if (r2.A0F()) {
            C56192ra r1 = r2.A07;
            if (r1.A01(userJid) == null || r1.A06(userJid)) {
                r2.A06(new C1898192t(r4, r3, userJid, 2), userJid);
                return;
            }
        }
        r4.A05();
    }

    public UserJid A03() {
        UserJid userJid;
        if (this instanceof C90484hO) {
            return ((C90484hO) this).A01.A04;
        }
        if (this instanceof C90464hM) {
            return ((C90464hM) this).A03.A01;
        }
        if (this instanceof C90454hL) {
            userJid = ((C90454hL) this).A07.A01;
        } else if (this instanceof C90494hP) {
            userJid = ((C90494hP) this).A06.A07;
        } else if (this instanceof C90444hK) {
            return ((C90444hK) this).A02.A05;
        } else {
            if (!(this instanceof C90474hN)) {
                return ((C90434hJ) this).A01.A00;
            }
            userJid = ((C90474hN) this).A01.A02;
        }
        C162457s7.A0C(userJid);
        return userJid;
    }

    public AnonymousClass755 A04() {
        if (this instanceof C90484hO) {
            if (((C90484hO) this).A01.A08) {
                return new C137426of();
            }
        } else if ((this instanceof C90494hP) && ((C90494hP) this).A06.A00 != null) {
            return new C137416oe();
        }
        return new C137446oh();
    }

    public void A05() {
        if (this instanceof C90484hO) {
            A00(this, 30);
        } else if (this instanceof C90464hM) {
            C90464hM r2 = (C90464hM) this;
            C86644Kx.A1K(r2.A04, 0);
            r2.A0A.A04("plm_details_view_tag");
            A00(r2, 29);
        } else if (this instanceof C90454hL) {
            C90454hL r22 = (C90454hL) this;
            r22.A0B.A04("view_product_tag");
            A00(r22, 28);
        } else if (this instanceof C90494hP) {
            C90494hP r23 = (C90494hP) this;
            if (r23.A06.A08 == null) {
                AnonymousClass316 A002 = C105255Ue.A00(r23.A0A, "catalog_collections_view_tag");
                if (A002 == null) {
                    Log.d("BizQPLManager/startCatalogDataSourceBlock/pref tracker not found. Have you called startPrefTracker()?");
                } else {
                    A002.A0A("datasource_catalog");
                }
            }
            A00(r23, 27);
        } else if (this instanceof C90444hK) {
            C90444hK r24 = (C90444hK) this;
            if (r24.A02.A06 == null) {
                AnonymousClass316 A003 = C105255Ue.A00(r24.A06, "catalog_collections_view_tag");
                if (A003 == null) {
                    Log.d("BizQPLManager/startCollectionsDataSourceBlock/pref tracker not found. Have you called startPrefTracker()?");
                } else {
                    A003.A0A("datasource_collections");
                }
            }
            A00(r24, 26);
        } else if (this instanceof C90474hN) {
            Log.d("GetCategoriesGraphQLService/sendRequestNow");
            A00(this, 25);
        } else {
            Log.d("GetCatalogPromotionsGraphQLService/sendRequestNow");
            A00(this, 24);
        }
    }

    public final void A06() {
        AnonymousClass7IB r2 = this.A05;
        Integer A012 = C159477lu.A01(A04(), this.A00);
        if (A012 != null) {
            C41702Lg r22 = r2.A01;
            r22.A00 = Integer.valueOf(r22.A01.A00(A012.intValue()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
        if (r12 != 2498054) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07(com.whatsapp.jid.UserJid r11, int r12, boolean r13) {
        /*
            r10 = this;
            X.2PW r4 = r10.A04
            int r6 = r10.A00
            long r8 = (long) r12
            r7 = 2
            X.4FS r0 = r4.A03
            X.3ad r3 = new X.3ad
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.BkM(r3)
            X.7IB r3 = r10.A05
            X.755 r0 = r10.A04()
            java.lang.Integer r2 = X.C159477lu.A01(r0, r6)
            if (r2 == 0) goto L_0x0039
            java.lang.String r1 = "graphql"
            r0 = 0
            X.2QO r4 = new X.2QO
            r4.<init>(r11, r1, r0, r0)
            X.2Lg r3 = r3.A01
            int r2 = r2.intValue()
            r0 = 10
            X.3cY r1 = new X.3cY
            r1.<init>(r3, r4, r2, r0)
            java.lang.Integer r0 = r3.A00
            if (r0 == 0) goto L_0x0039
            r1.run()
        L_0x0039:
            X.7MY r2 = r10.A03
            if (r13 == 0) goto L_0x0043
            r1 = 2498054(0x261e06, float:3.500519E-39)
            r0 = 1
            if (r12 == r1) goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            r1 = 1
            if (r0 == 0) goto L_0x006a
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0050
            r10.BRC(r11)
        L_0x004e:
            r0 = 1
            return r0
        L_0x0050:
            r2.A01 = r1
            X.7RW r3 = r2.A02
            X.33g r2 = r3.A00
            X.2ra r1 = r2.A07
            java.lang.String r0 = r1.A01(r11)
            if (r0 == 0) goto L_0x0061
            r1.A06(r11)
        L_0x0061:
            X.92t r0 = new X.92t
            r0.<init>(r10, r3, r11, r7)
            r2.A06(r0, r11)
            goto L_0x004e
        L_0x006a:
            int r0 = r2.A00
            int r0 = r0 + 1
            r2.A00 = r0
            if (r0 != r1) goto L_0x017f
            X.2wB r0 = r2.A03
            boolean r0 = r0.A00(r12)
            if (r0 == 0) goto L_0x017f
            r3 = r10
            boolean r0 = r10 instanceof X.C90484hO
            if (r0 == 0) goto L_0x009f
            X.4hO r3 = (X.C90484hO) r3
            X.1VX r1 = r3.A05
            r0 = 2503(0x9c7, float:3.507E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = "GetSingleCollectionGraphQLService/sendFallbackRequest - GraphQL request failed, calling onFailure instead of falling back on SMAX"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.8rE r2 = r3.A02
            X.5TG r1 = r3.A01
            r0 = 0
            r2.BSn(r1, r0)
            goto L_0x004e
        L_0x0099:
            X.4gq r0 = r3.A03
            r0.A02()
            goto L_0x004e
        L_0x009f:
            boolean r0 = r10 instanceof X.C90464hM
            if (r0 == 0) goto L_0x00c3
            X.4hM r3 = (X.C90464hM) r3
            X.1VX r1 = r3.A07
            r0 = 2503(0x9c7, float:3.507E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = "GetProductListGraphQLService/sendFallbackRequest - GraphQL request failed, calling onFailure instead of falling back on SMAX"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.8nK r1 = r3.A04
            r0 = 4
            X.C86644Kx.A1K(r1, r0)
            goto L_0x004e
        L_0x00bb:
            X.4gt r1 = r3.A05
            X.33g r0 = r1.A01
            X.C90244gx.A00(r0, r1)
            goto L_0x004e
        L_0x00c3:
            boolean r0 = r10 instanceof X.C90454hL
            if (r0 == 0) goto L_0x00fd
            X.4hL r3 = (X.C90454hL) r3
            X.1VX r1 = r3.A08
            r0 = 2503(0x9c7, float:3.507E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = "GetProductGraphQLService/sendFallbackRequest - GraphQL request failed, calling onFailure instead of falling back on SMAX"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.8rF r2 = r3.A04
            X.7PB r1 = r3.A07
            r0 = 0
            r2.BT2(r1, r0)
            goto L_0x004e
        L_0x00e2:
            X.4gu r1 = r3.A05
            X.1ip r0 = r1.A03
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x00f6
            X.8rF r2 = r1.A01
            X.7PB r1 = r1.A04
            r0 = -1
            r2.BT2(r1, r0)
            goto L_0x004e
        L_0x00f6:
            X.33g r0 = r1.A01
            X.C90244gx.A00(r0, r1)
            goto L_0x004e
        L_0x00fd:
            boolean r0 = r10 instanceof X.C90494hP
            if (r0 == 0) goto L_0x0127
            X.4hP r3 = (X.C90494hP) r3
            X.7n8 r2 = r3.A06
            X.2Ng r0 = r2.A00
            if (r0 != 0) goto L_0x011a
            X.1VX r1 = r3.A07
            r0 = 2503(0x9c7, float:3.507E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x011a
            X.4gv r0 = r3.A04
            r0.A06()
            goto L_0x004e
        L_0x011a:
            java.lang.String r0 = "GetProductCatalogGraphQLService/sendFallbackRequest - GraphQL request failed, calling onFailure instead of falling back on SMAX"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.8rC r1 = r3.A03
            r0 = 0
            r1.BSo(r2, r0)
            goto L_0x004e
        L_0x0127:
            boolean r0 = r10 instanceof X.C90444hK
            if (r0 == 0) goto L_0x0161
            X.4hK r3 = (X.C90444hK) r3
            X.1VX r1 = r3.A05
            r0 = 2503(0x9c7, float:3.507E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0146
            java.lang.String r0 = "GetCollectionsGraphQLService/sendFallbackRequest - GraphQL request failed, calling onFailure instead of falling back on SMAX"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.5PW r2 = r3.A00
            X.7PS r1 = r3.A02
            r0 = 0
            r2.A01(r1, r0)
            goto L_0x004e
        L_0x0146:
            X.4gw r1 = r3.A03
            X.1ip r0 = r1.A04
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x015a
            X.5PW r2 = r1.A00
            X.7PS r1 = r1.A01
            r0 = -1
            r2.A01(r1, r0)
            goto L_0x004e
        L_0x015a:
            X.33g r0 = r1.A01
            X.C90244gx.A00(r0, r1)
            goto L_0x004e
        L_0x0161:
            boolean r0 = r10 instanceof X.C90474hN
            if (r0 == 0) goto L_0x0172
            X.4hN r3 = (X.C90474hN) r3
            java.lang.String r0 = "GetCategoriesGraphQLService/sendFallbackRequest"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 0
            r3.A09(r0)
            goto L_0x004e
        L_0x0172:
            X.4hJ r3 = (X.C90434hJ) r3
            java.lang.String r0 = "GetCatalogPromotionsGraphQLService/sendFallbackRequest"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 0
            r3.A08(r0)
            goto L_0x004e
        L_0x017f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95614ty.A07(com.whatsapp.jid.UserJid, int, boolean):boolean");
    }

    public C95614ty(AnonymousClass7RW r1, C59012wB r2, AnonymousClass7MY r3, AnonymousClass2PW r4, AnonymousClass7IB r5, AnonymousClass4FS r6, int i) {
        super(r2);
        this.A02 = r2;
        this.A06 = r6;
        this.A03 = r3;
        this.A01 = r1;
        this.A04 = r4;
        this.A00 = i;
        this.A05 = r5;
    }
}
