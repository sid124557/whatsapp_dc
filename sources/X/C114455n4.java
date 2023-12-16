package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.5n4  reason: invalid class name and case insensitive filesystem */
public abstract class C114455n4 implements AnonymousClass4EN {
    public void AyP(AnonymousClass2SI r13) {
        IllegalStateException th;
        int i;
        try {
            JSONObject jSONObject = r13.A05;
            if (r13.A00 == 0) {
                Object obj = r13.A03.A00;
                if (obj != null) {
                    C95614ty r2 = (C95614ty) this;
                    AnonymousClass2PW r6 = r2.A04;
                    UserJid A03 = r2.A03();
                    int i2 = r2.A00;
                    r6.A03.BkM(new C70523ad(r6, A03, i2, 1, -1));
                    AnonymousClass7IB r7 = r2.A05;
                    UserJid A032 = r2.A03();
                    Integer A01 = C159477lu.A01(r2.A04(), i2);
                    if (A01 != null) {
                        AnonymousClass2QO r62 = new AnonymousClass2QO(A032, "graphql", false, false);
                        C41702Lg r5 = r7.A01;
                        C71713cY r1 = new C71713cY(r5, r62, A01.intValue(), 11);
                        if (r5.A00 != null) {
                            r1.run();
                        }
                    }
                    if (r2 instanceof C90484hO) {
                        C90484hO r22 = (C90484hO) r2;
                        C64533Dw r4 = (C64533Dw) obj;
                        StringBuilder A0X = C18270x1.A0X(r4);
                        A0X.append("GetSingleCollectionGraphQLService/sendRequest/success jid=");
                        AnonymousClass5TG r12 = r22.A01;
                        C18260x0.A0o(r12.A04, A0X);
                        r22.A08();
                        r22.A02.BdN(r4, r12);
                        return;
                    } else if (r2 instanceof C90464hM) {
                        C90464hM r23 = (C90464hM) r2;
                        C64543Dx r42 = (C64543Dx) obj;
                        C162457s7.A0J(r42, 0);
                        r23.A0A.A03("plm_details_view_tag");
                        UserJid userJid = r23.A03.A01;
                        C18260x0.A1P(AnonymousClass001.A0o(), "GetProductListGraphQLService/onSuccessResponse/jid=", userJid);
                        r23.A01.A0C(userJid, r42.A03);
                        List list = r42.A02;
                        if (list == null || list.isEmpty()) {
                            C86644Kx.A1K(r23.A04, 4);
                            r23.A00.A0A("GetProductListGraphQLService/onSuccessResponse error", true, "error_code=0");
                            return;
                        }
                        r23.A04.Bh3(r42);
                        return;
                    } else if (r2 instanceof C90454hL) {
                        C90454hL r24 = (C90454hL) r2;
                        AnonymousClass2JX r43 = (AnonymousClass2JX) obj;
                        C162457s7.A0J(r43, 0);
                        r24.A0B.A03("view_product_tag");
                        C620433g r3 = r24.A00;
                        AnonymousClass7PB r52 = r24.A07;
                        UserJid userJid2 = r52.A01;
                        r3.A0C(userJid2, r43.A01);
                        C109015dw r32 = r43.A00;
                        if (r32 == null) {
                            Log.d("GetProductGraphQLService/error empty response");
                            return;
                        }
                        Log.d("GetProductGraphQLService/onSuccessResponse/success");
                        r24.A01.A0E(r32, userJid2);
                        r24.A04.BT4(r52, r32.A0F);
                        return;
                    } else if (r2 instanceof C90494hP) {
                        C90494hP r25 = (C90494hP) r2;
                        AnonymousClass2JW r44 = (AnonymousClass2JW) obj;
                        C162457s7.A0J(r44, 0);
                        C160157n8 r63 = r25.A06;
                        if (r63.A08 == null) {
                            r25.A0A.A01();
                        }
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("GetProductCatalogGraphQLService/onSuccessResponse jid=");
                        UserJid userJid3 = r63.A07;
                        C18260x0.A0m(userJid3, A0o);
                        C64523Dv r33 = r44.A00;
                        r25.A01.A0C(userJid3, r44.A01);
                        C184068rC r0 = r25.A03;
                        if (r33 != null) {
                            r0.BdO(r33, r63);
                            return;
                        }
                        r0.BSo(r63, 0);
                        r25.A00.A0A("GetProductCatalogGraphQLService/get product catalog error", true, "error_code=0");
                        return;
                    } else if (r2 instanceof C90444hK) {
                        C90444hK r26 = (C90444hK) r2;
                        C148037Gr r45 = (C148037Gr) obj;
                        C162457s7.A0J(r45, 0);
                        r26.A08();
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("GetCollectionsGraphQLService/onSuccess jid=");
                        AnonymousClass7PS r14 = r26.A02;
                        C18260x0.A0m(r14.A05, A0o2);
                        r26.A00.A00(r45, r14);
                        return;
                    } else if (r2 instanceof C90474hN) {
                        C90474hN r27 = (C90474hN) r2;
                        C64553Dy r46 = (C64553Dy) obj;
                        C162457s7.A0J(r46, 0);
                        if (r46.A01.isEmpty()) {
                            Log.d("GetCategoriesGraphQLService/onSuccess/emptyResponse");
                            r27.A03.BSm(r27.A01, 0);
                            return;
                        }
                        Log.d("GetCategoriesGraphQLService/onSuccess");
                        r27.A03.Bd2(r27.A01, r46);
                        return;
                    } else {
                        C90434hJ r28 = (C90434hJ) r2;
                        C50742ih r47 = (C50742ih) obj;
                        C162457s7.A0J(r47, 0);
                        Log.d("GetCatalogPromotionsGraphQLService/onSuccess");
                        C148067Gu r64 = r28.A00;
                        C148077Gv r53 = r28.A01;
                        AnonymousClass5Y9 r34 = r64.A01;
                        C105405Uu r29 = r34.A0C;
                        List list2 = r47.A00;
                        AnonymousClass7OX A02 = r29.A02(r53.A00);
                        synchronized (r29) {
                            try {
                                A02.A02 = list2;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        r34.A07.A0S(new C172708Mj(r64.A00, r53, r47, 41));
                        return;
                    }
                } else {
                    th = AnonymousClass001.A0e("No GraphQL Response available");
                }
            } else {
                Map map = r13.A04.A00;
                if (map != null) {
                    C134626jM r210 = (C134626jM) this;
                    try {
                        if (!map.isEmpty()) {
                            C618532n r15 = (C618532n) AnonymousClass001.A0v(map).next();
                            switch (r15.A01) {
                                case 2498048:
                                    i = 451;
                                    break;
                                case 2498049:
                                case 2498050:
                                case 2498051:
                                case 2498052:
                                    i = 404;
                                    break;
                                case 2498053:
                                    i = 406;
                                    break;
                                case 2498054:
                                    i = 421;
                                    break;
                                case 2498055:
                                    i = 500;
                                    break;
                                case 2498056:
                                    i = 0;
                                    break;
                                default:
                                    i = -1;
                                    break;
                            }
                            r210.A02(r15, jSONObject, i);
                            return;
                        }
                        throw AnonymousClass001.A0c("GraphQL errors map is empty");
                    } catch (Exception e) {
                        r210.BSB(e);
                        return;
                    }
                } else {
                    th = AnonymousClass001.A0e("Error response received but no errors found");
                }
            }
            throw th;
        } catch (Exception e2) {
            BSB(e2);
        }
    }
}
