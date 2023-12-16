package X;

import android.app.Activity;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import org.json.JSONObject;

/* renamed from: X.4Kd  reason: invalid class name and case insensitive filesystem */
public class C86444Kd implements AnonymousClass4EN {
    public Object A00;
    public Object A01;
    public final int A02;

    public C86444Kd(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public void AyP(AnonymousClass2SI r38) {
        Set set;
        String str;
        boolean z;
        Set set2;
        boolean z2;
        Set set3;
        boolean z3;
        String str2;
        String str3;
        Set set4;
        String str4;
        boolean z4;
        Set set5;
        boolean z5;
        Set set6;
        boolean z6;
        String str5;
        AnonymousClass2SI r3 = r38;
        switch (this.A02) {
            case 0:
                C162457s7.A0J(r3, 0);
                C46722c6 r5 = (C46722c6) this.A01;
                r5.A05.set(false);
                if (r3.A00 == 0) {
                    C60732z4 r2 = (C60732z4) r3.A03.A00;
                    if (r2 != null) {
                        AnonymousClass2GM r4 = (AnonymousClass2GM) this.A00;
                        C54402of r6 = r5.A03;
                        JSONObject A1G = AnonymousClass0x9.A1G();
                        A1G.put("pub_key", r2.A02);
                        A1G.put("prev_pub_key", r2.A01);
                        Long l = r2.A00;
                        if (l != null) {
                            try {
                                str3 = AnonymousClass0x7.A0u("yyyyMMdd'T'HHmmss'Z'").format(new Date(l.longValue()));
                            } catch (ParseException unused) {
                                str3 = null;
                            }
                        } else {
                            str3 = null;
                        }
                        C18270x1.A0j(C72333dY.A00(r6.A00), "extensions_asset_verification", C18280x3.A0c(str3, "prev_pub_key_expiry", A1G));
                        r4.A00.countDown();
                        return;
                    }
                    return;
                }
                r5.A00(AnonymousClass1UU.A00, (AnonymousClass2GM) this.A00, "Asset verification response is not in expected format.", (Throwable) null);
                return;
            case 1:
                C162457s7.A0J(r3, 0);
                ((C67313Ou) this.A01).A05.markerEnd(386138113, 2);
                ((AnonymousClass4EN) this.A00).AyP(r3);
                return;
            case 2:
                C162457s7.A0J(r3, 0);
                AnonymousClass438 r52 = new AnonymousClass438((AnonymousClass4GQ) this.A00);
                C48642fE r22 = r3.A04;
                C162457s7.A0D(r22);
                AnonymousClass2WN r1 = r3.A03;
                C162457s7.A0D(r1);
                if (r3.A00 == 0) {
                    Object obj = r1.A00;
                    if (obj != null) {
                        ((AnonymousClass4GQ) this.A01).invoke(obj);
                        return;
                    }
                    return;
                }
                Object A002 = r22.A00((Object) null);
                if ((A002 instanceof AnonymousClass28J) && A002 != null) {
                    r52.invoke(A002);
                    return;
                }
                return;
            case 3:
                C53742na r53 = (C53742na) this.A00;
                C84684Dh r42 = (C84684Dh) this.A01;
                C26991d6 r12 = (C26991d6) r3.A03;
                if (r3.A00 == 0) {
                    try {
                        AnonymousClass2P7 A03 = r12.A03((JSONObject) r12.A00);
                        r53.A02(A03);
                        Log.i("BanAppealRepository/clearFormReviewDraft");
                        C18270x1.A0g(C18270x1.A03(r53.A04), "support_ban_appeal_form_review_draft");
                        r42.Bd9(A03);
                        return;
                    } catch (Exception unused2) {
                        r53.A01(r3, r42);
                        return;
                    }
                } else {
                    r53.A01(r3, r42);
                    return;
                }
            case 4:
                C53742na r54 = (C53742na) this.A00;
                C84684Dh r23 = (C84684Dh) this.A01;
                C26991d6 r13 = (C26991d6) r3.A03;
                if (r3.A00 == 0) {
                    try {
                        AnonymousClass2P7 A032 = r13.A03((JSONObject) r13.A00);
                        r54.A02(A032);
                        r23.Bd9(A032);
                        return;
                    } catch (Exception unused3) {
                        r54.A01(r3, r23);
                        return;
                    }
                } else {
                    r54.A01(r3, r23);
                    return;
                }
            case 5:
                C162457s7.A0J(r3, 0);
                if (r3.A00 == 0) {
                    AnonymousClass2WN r24 = r3.A03;
                    C162457s7.A0K(r24, "null cannot be cast to non-null type com.whatsapp.wabloks.commerce.network.extensions.dataexchange.ExtensionsDataExchangeGraphqlDataProcessor");
                    AnonymousClass1M8 r25 = (AnonymousClass1M8) r24;
                    AnonymousClass3ME r32 = (AnonymousClass3ME) this.A01;
                    C49702gx r7 = r32.A08;
                    Object obj2 = r25.A00;
                    C162457s7.A0H(obj2);
                    String A003 = r7.A00((String) obj2, r32.A0D, r32.A0G, -1, false, false);
                    if (r25.A00 == 0) {
                        if (A003 == null) {
                            z3 = true;
                            str2 = "extensions-decryption-failed-exception";
                        } else {
                            z3 = false;
                            str2 = null;
                        }
                        r32.A00(r32.A00, r32.A03, (C27091dG) null, str2, A003, (String) null, z3, false);
                        return;
                    }
                    String A004 = C60032xt.A00(A003);
                    if (A004 == null) {
                        A004 = C18290x4.A0l(r32.A00, R.string.f11nameremoved);
                    }
                    r32.A00(r32.A00, r32.A03, (C27091dG) null, "extensions-invalid-flow-token-error", (String) null, A004, true, true);
                    return;
                }
                AnonymousClass3ME r14 = (AnonymousClass3ME) this.A01;
                UserJid userJid = (UserJid) this.A00;
                C48642fE r43 = r3.A04;
                C162457s7.A0K(r43, "null cannot be cast to non-null type com.whatsapp.wabloks.commerce.network.extensions.dataexchange.ExtensionsDataExchangeGraphqlErrorProcessor");
                C27091dG r44 = (C27091dG) r43;
                Map map = r44.A00;
                Boolean bool = null;
                if (map != null) {
                    set = map.keySet();
                } else {
                    set = null;
                }
                C162457s7.A0H(set);
                if (set.contains(2498061)) {
                    str = "extensions-business-decryption-error";
                } else {
                    str = "extensions-business-endpoint-response-error";
                }
                if (r14.A0E) {
                    Map map2 = r44.A00;
                    if (map2 != null) {
                        set3 = map2.keySet();
                    } else {
                        set3 = null;
                    }
                    C162457s7.A0H(set3);
                    if (set3.contains(2498061)) {
                        Activity activity = r14.A00;
                        AnonymousClass2ZN r122 = r14.A03;
                        String str6 = r14.A0C;
                        String str7 = r14.A0B;
                        String str8 = r14.A0A;
                        String str9 = r14.A09;
                        boolean z7 = r14.A0F;
                        SecretKey secretKey = r14.A0D;
                        byte[] bArr = r14.A0G;
                        C49702gx r62 = r14.A08;
                        C59062wH r55 = r14.A01;
                        C69263Wi r45 = r14.A02;
                        AnonymousClass4FS r33 = r14.A07;
                        C66543Lv r26 = r14.A05;
                        AnonymousClass1VX r232 = r14.A06;
                        AnonymousClass4FS r242 = r33;
                        C49702gx r252 = r62;
                        AnonymousClass2ZN r20 = r122;
                        C60032xt r21 = r14.A04;
                        C66543Lv r222 = r26;
                        Activity activity2 = activity;
                        C59062wH r18 = r55;
                        C69263Wi r19 = r45;
                        r62.A01(new AnonymousClass3ME(activity2, r18, r19, r20, r21, r222, r232, r242, r252, str6, str7, str8, str9, secretKey, bArr, false, z7), userJid, str9, str6, "UNKNOWN", secretKey, bArr, true, false, false);
                        return;
                    }
                }
                String A0R = r14.A06.A0R(C58422vE.A02, 3192);
                if (A0R != null) {
                    List A022 = AnonymousClass2AB.A02(A0R, ",");
                    if (!(A022 instanceof Collection) || !A022.isEmpty()) {
                        Iterator it = A022.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                String A0m = AnonymousClass001.A0m(it);
                                Map map3 = r44.A00;
                                if (map3 != null) {
                                    set2 = map3.keySet();
                                } else {
                                    set2 = null;
                                }
                                C162457s7.A0H(set2);
                                if (C18300x5.A1X(set2, Integer.parseInt(A0m))) {
                                    z2 = true;
                                }
                            }
                        }
                        bool = Boolean.valueOf(z2);
                    }
                    z2 = false;
                    bool = Boolean.valueOf(z2);
                }
                Activity activity3 = r14.A00;
                AnonymousClass2ZN r0 = r14.A03;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                r14.A00(activity3, r0, r44, str, (String) null, (String) null, true, z);
                return;
            default:
                C162457s7.A0J(r3, 0);
                if (r3.A00 == 0) {
                    AnonymousClass2WN r27 = r3.A03;
                    C162457s7.A0K(r27, "null cannot be cast to non-null type com.whatsapp.wabloks.commerce.network.extensions.dataexchange.ExtensionsDataExchangeGraphqlDataProcessor");
                    AnonymousClass1M8 r28 = (AnonymousClass1M8) r27;
                    AnonymousClass3MF r34 = (AnonymousClass3MF) this.A01;
                    C49702gx r72 = r34.A0B;
                    Object obj3 = r28.A00;
                    C162457s7.A0H(obj3);
                    String A005 = r72.A00((String) obj3, r34.A0G, r34.A0J, -1, false, false);
                    if (r28.A00 == 0) {
                        if (A005 == null) {
                            z6 = true;
                            str5 = "extensions-decryption-failed-exception";
                        } else {
                            z6 = false;
                            str5 = null;
                        }
                        r34.A00(r34.A00, r34.A04, (C27091dG) null, str5, A005, (String) null, z6, false);
                        return;
                    }
                    String A006 = C60032xt.A00(A005);
                    if (A006 == null) {
                        A006 = C18290x4.A0l(r34.A00, R.string.f11nameremoved);
                    }
                    r34.A00(r34.A00, r34.A04, (C27091dG) null, "extensions-invalid-flow-token-error", (String) null, A006, true, true);
                    return;
                }
                AnonymousClass3MF r142 = (AnonymousClass3MF) this.A01;
                UserJid userJid2 = (UserJid) this.A00;
                C48642fE r46 = r3.A04;
                C162457s7.A0K(r46, "null cannot be cast to non-null type com.whatsapp.wabloks.commerce.network.extensions.dataexchange.ExtensionsDataExchangeGraphqlErrorProcessor");
                C27091dG r47 = (C27091dG) r46;
                Map map4 = r47.A00;
                Boolean bool2 = null;
                if (map4 != null) {
                    set4 = map4.keySet();
                } else {
                    set4 = null;
                }
                C162457s7.A0H(set4);
                if (set4.contains(2498061)) {
                    str4 = "extensions-business-decryption-error";
                } else {
                    str4 = "extensions-business-endpoint-response-error";
                }
                if (r142.A0H) {
                    Map map5 = r47.A00;
                    if (map5 != null) {
                        set6 = map5.keySet();
                    } else {
                        set6 = null;
                    }
                    C162457s7.A0H(set6);
                    if (set6.contains(2498061)) {
                        Activity activity4 = r142.A00;
                        C41182Jg r132 = r142.A04;
                        AnonymousClass2XW r123 = r142.A03;
                        String str10 = r142.A0F;
                        String str11 = r142.A0E;
                        String str12 = r142.A0D;
                        String str13 = r142.A0C;
                        boolean z8 = r142.A0I;
                        SecretKey secretKey2 = r142.A0G;
                        byte[] bArr2 = r142.A0J;
                        C49702gx r282 = r142.A0B;
                        C59062wH r73 = r142.A01;
                        C69263Wi r63 = r142.A02;
                        AnonymousClass4FS r56 = r142.A0A;
                        C66543Lv r48 = r142.A07;
                        AnonymousClass1VX r35 = r142.A09;
                        C59652xG r29 = r142.A08;
                        C56612sH r15 = r142.A06;
                        Activity activity5 = activity4;
                        C59062wH r182 = r73;
                        C69263Wi r192 = r63;
                        r282.A01(new AnonymousClass3MF(activity5, r182, r192, r123, r132, r142.A05, r15, r48, r29, r35, r56, r282, str10, str11, str12, str13, secretKey2, bArr2, false, z8), userJid2, str13, str10, "UNKNOWN", secretKey2, bArr2, true, false, false);
                        return;
                    }
                }
                String A0R2 = r142.A09.A0R(C58422vE.A02, 3192);
                if (A0R2 != null) {
                    List A023 = AnonymousClass2AB.A02(A0R2, ",");
                    if (!(A023 instanceof Collection) || !A023.isEmpty()) {
                        Iterator it2 = A023.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                String A0m2 = AnonymousClass001.A0m(it2);
                                Map map6 = r47.A00;
                                if (map6 != null) {
                                    set5 = map6.keySet();
                                } else {
                                    set5 = null;
                                }
                                C162457s7.A0H(set5);
                                if (C18300x5.A1X(set5, Integer.parseInt(A0m2))) {
                                    z5 = true;
                                }
                            }
                        }
                        bool2 = Boolean.valueOf(z5);
                    }
                    z5 = false;
                    bool2 = Boolean.valueOf(z5);
                }
                Activity activity6 = r142.A00;
                C41182Jg r02 = r142.A04;
                if (bool2 != null) {
                    z4 = bool2.booleanValue();
                } else {
                    z4 = false;
                }
                r142.A00(activity6, r02, r47, str4, (String) null, (String) null, true, z4);
                return;
        }
    }

    public void BQq(IOException iOException) {
        switch (this.A02) {
            case 0:
                C162457s7.A0J(iOException, 0);
                C46722c6 r3 = (C46722c6) this.A01;
                r3.A05.set(false);
                r3.A00(AnonymousClass1UV.A00, (AnonymousClass2GM) this.A00, iOException.getMessage(), iOException);
                return;
            case 1:
                C162457s7.A0J(iOException, 0);
                ((C67313Ou) this.A01).A05.markerEnd(386138113, 3);
                ((AnonymousClass4EN) this.A00).BQq(iOException);
                return;
            case 2:
                C162457s7.A0J(iOException, 0);
                ((AnonymousClass4GQ) this.A00).invoke(new AnonymousClass1kp(iOException));
                return;
            case 5:
                AnonymousClass3ME r0 = (AnonymousClass3ME) this.A01;
                r0.A00(r0.A00, r0.A03, (C27091dG) null, "extensions-data-exchange-graphql-response-error", (String) null, (String) null, true, false);
                return;
            case 6:
                AnonymousClass3MF r02 = (AnonymousClass3MF) this.A01;
                r02.A00(r02.A00, r02.A04, (C27091dG) null, "extensions-data-exchange-graphql-response-error", (String) null, (String) null, true, false);
                return;
            default:
                ((C84684Dh) this.A01).BSq(C18280x3.A0S());
                return;
        }
    }

    public void BSB(Exception exc) {
        switch (this.A02) {
            case 0:
                C162457s7.A0J(exc, 0);
                C46722c6 r3 = (C46722c6) this.A01;
                r3.A05.set(false);
                r3.A00(AnonymousClass1UV.A00, (AnonymousClass2GM) this.A00, exc.getMessage(), exc);
                return;
            case 1:
                C162457s7.A0J(exc, 0);
                ((C67313Ou) this.A01).A05.markerEnd(386138113, 3);
                ((AnonymousClass4EN) this.A00).BSB(exc);
                return;
            case 2:
                C162457s7.A0J(exc, 0);
                ((AnonymousClass4GQ) this.A00).invoke(new C29651ks(exc));
                return;
            case 5:
                AnonymousClass3ME r0 = (AnonymousClass3ME) this.A01;
                r0.A00(r0.A00, r0.A03, (C27091dG) null, "extensions-data-exchange-graphql-response-error", (String) null, (String) null, true, false);
                return;
            case 6:
                AnonymousClass3MF r02 = (AnonymousClass3MF) this.A01;
                r02.A00(r02.A00, r02.A04, (C27091dG) null, "extensions-data-exchange-graphql-response-error", (String) null, (String) null, true, false);
                return;
            default:
                ((C84684Dh) this.A01).BSq(C18280x3.A0S());
                return;
        }
    }
}
