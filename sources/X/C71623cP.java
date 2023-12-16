package X;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.SecretKey;

/* renamed from: X.3cP  reason: invalid class name and case insensitive filesystem */
public class C71623cP implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    public C71623cP(Context context, AnonymousClass5JT r3, AnonymousClass5YA r4, Integer num, List list) {
        this.A06 = 3;
        this.A00 = r4;
        this.A01 = context;
        this.A02 = list;
        this.A03 = num;
        this.A05 = "status_fragment";
        this.A04 = r3;
    }

    public final void run() {
        AnonymousClass2z0 r3;
        C624134x A012;
        String str;
        String A002;
        switch (this.A06) {
            case 0:
                C621033m r1 = (C621033m) this.A00;
                C624134x r5 = (C624134x) this.A02;
                String str2 = this.A05;
                List list = (List) this.A04;
                C66513Ls r8 = (C66513Ls) this.A03;
                C55592qb r4 = ((AnonymousClass4UA) this.A01).A05;
                if (r5 instanceof C30471mV) {
                    C55972rD r11 = r1.A1H;
                    r3 = r5.A1J;
                    C95814uZ r15 = r3.A00;
                    C30471mV r0 = (C30471mV) r5;
                    AnonymousClass33C r13 = r0.A01;
                    byte b = r5.A1I;
                    int i = r5.A09;
                    List list2 = list;
                    String str3 = r0.A08;
                    String str4 = str2;
                    A012 = r11.A04((Uri) null, r13, (C108845de) null, r15, (C624134x) null, str4, str3, list2, (List) null, b, i, 0, AnonymousClass000.A1U(r5.A0A & 4, 4));
                } else {
                    r3 = r5.A1J;
                    A012 = r1.A01(r8, (C108845de) null, r3.A00, (AnonymousClass2U8) null, (C624134x) null, r4, str2, list, false, false, false);
                }
                if (r5.A11() != null) {
                    r3 = r5.A11().A02;
                }
                C56612sH r02 = r1.A0V;
                A012.A1V(new C42602Ou(r3, r02.A0H(), r02.A0H()));
                A012.A1B(AnonymousClass35S.A0F);
                C55672qj r32 = r1.A0n;
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A0m(C624134x.A08(A012, "EditedMessageManager/handleOutgoingEditedMessage key=", A0o), A0o);
                try {
                    C624134x A003 = r32.A00(A012, true, false);
                    if (A003 != null) {
                        ((C66423Lj) r32.A0e.get()).A01(A003);
                        return;
                    } else {
                        Log.e("EditMessageManager/handleOutgoingEditedMessage message failed to store");
                        return;
                    }
                } catch (IllegalArgumentException e) {
                    Log.e("EditMessageManager/handleOutgoingEditedMessage", e);
                    r32.A01.A0A("EditMessageManager/handleOutgoingEditedMessage/invalidMessage", false, (String) null);
                    return;
                }
            case 1:
                C105145Tt r7 = (C105145Tt) this.A00;
                String str5 = this.A05;
                C25261aE r12 = new C25261aE();
                r12.A04 = r7.A08.A00((Jid) this.A01);
                r12.A05 = r7.A02;
                r12.A06 = str5;
                r12.A03 = AnonymousClass0x9.A0m(r7.A0D.getAndIncrement());
                r12.A01 = (Integer) this.A02;
                r12.A00 = (Integer) this.A03;
                r12.A02 = (Long) this.A04;
                r7.A07.BhD(r12);
                return;
            case 2:
                C47392dB r132 = (C47392dB) this.A00;
                UserJid userJid = (UserJid) this.A01;
                C51322jd r14 = (C51322jd) this.A02;
                String str6 = this.A05;
                AnonymousClass4GQ r6 = (AnonymousClass4GQ) this.A03;
                C108985dt r152 = (C108985dt) this.A04;
                C162457s7.A0J(userJid, 1);
                C56192ra r52 = r132.A04;
                AnonymousClass33p r33 = r52.A0A;
                String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(r33), AnonymousClass000.A0V("dc_business_domain_", userJid.getRawString(), AnonymousClass001.A0o()));
                String str7 = r14.A01;
                if (A0Z != null) {
                    if (!r132.A09.A0Y(C58422vE.A02, 3401) || !C162457s7.A0P(str7, r132.A01) || (A002 = r132.A00) == null || str6 == null) {
                        try {
                            String A004 = r52.A00(userJid);
                            if (A004 == null) {
                                Log.e("DirectConnectionManager/generateEncryptionStringFromSearchQuery/Null certificate");
                                r52.A04.A0A("direct-connection-failed-to-load-certificate-from-preferences", false, "");
                            } else {
                                X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(AnonymousClass0x9.A0d(AnonymousClass0x7.A1X(A004)));
                                if (!A0Z.equals(AnonymousClass34Q.A01(x509Certificate.getSubjectX500Principal().getName()))) {
                                    Log.e("DirectConnectionManager/generateEncryptionStringFromSearchQuery/Incorrect CN in certificate");
                                    r52.A04.A0A("direct-connection-certificate-common-name-mismatch", false, "");
                                    r33.A1N(userJid.getRawString());
                                } else {
                                    AnonymousClass34Q r112 = r52.A07;
                                    PublicKey publicKey = x509Certificate.getPublicKey();
                                    C42152Mz A005 = AnonymousClass34Q.A00(str7);
                                    SecretKey secretKey = A005.A00;
                                    byte[] A022 = AnonymousClass34Q.A02(publicKey, secretKey);
                                    r112.A00 = secretKey.getEncoded();
                                    byte[] bArr = A005.A02;
                                    r112.A01 = bArr;
                                    A002 = AnonymousClass254.A00(A005.A01, A022, bArr);
                                    if (A002 != null) {
                                    }
                                }
                            }
                        } catch (IllegalArgumentException | GeneralSecurityException e2) {
                            Log.e("DirectConnectionManager/generateEncryptionStringFromSearchQuery/", e2);
                            r52.A04.A0A("direct-connection-fail-to-generate-encryption-string", false, e2.toString());
                        }
                        str = "CatalogSearchCatalogPageRequestFactory/createRequest/EN";
                    }
                    r132.A01 = str7;
                    r132.A00 = A002;
                    r6.invoke(r132.A00(r14, r152, A002, "V1", str6));
                    return;
                }
                str = "CatalogSearchCatalogPageRequestFactory/createRequest/DN";
                Log.e(str);
                r52.A02(new C64463Dp(r132), r152, userJid, false);
                r6.invoke((Object) null);
                return;
            case 3:
                AnonymousClass5YA r9 = (AnonymousClass5YA) this.A00;
                Context context = (Context) this.A01;
                List list3 = (List) this.A02;
                AnonymousClass5JT r82 = (AnonymousClass5JT) this.A04;
                String A023 = AnonymousClass36X.A02();
                AnonymousClass57Q r62 = new AnonymousClass57Q(context, r82, r9, (Integer) this.A03, A023, list3);
                C55932r9 r53 = (C55932r9) r9.A0H.get();
                C18270x1.A0j(((AnonymousClass2ZB) r53.A09.get()).A00().edit(), "pref_debug_session_id", A023);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("XFamilyCrosspostRequestSessionManager/handleNewAutoShareEligibilityRequest called for session: ");
                A0o2.append(A023);
                A0o2.append(" with message ");
                ArrayList A0d = C73783g4.A0d(list3);
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    C624134x.A0Z(A0d, it);
                }
                C106245Ye.A00(AnonymousClass000.A0R(A0d, A0o2));
                if (AnonymousClass36X.A09(list3)) {
                    C106245Ye.A00("XFamilyCrosspostRequestSessionManager/handleNewAutoShareEligibilityRequest skip for audio status");
                    r62.A03((Integer) null, A023, -4, true);
                    return;
                }
                ((C48582f8) r53.A0C.get()).A00(A023);
                AnonymousClass30J r42 = (AnonymousClass30J) r53.A0B.get();
                ArrayList A0d2 = C73783g4.A0d(list3);
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    C624134x.A0Z(A0d2, it2);
                }
                ContentValues A062 = AnonymousClass0x9.A06();
                C18270x1.A0b(A062, "state", 1);
                A062.put("crossposting_session_id", A023);
                C54592oy r03 = r42.A01;
                r03.A01();
                r03.A02(A0d2, 1);
                r42.A02(A062, A0d2);
                AnonymousClass3YP r16 = new AnonymousClass3YP(r62, A023);
                C106245Ye.A00("XFamilyCrosspostRequestSessionManager/handleNewAutoShareEligibilityRequest start text status re-burning and eligibility");
                r53.A00(context, r16, A023, list3);
                return;
            default:
                C108895dj r34 = (C108895dj) this.A01;
                C45732aU r43 = (C45732aU) this.A03;
                C54662p5 r2 = (C54662p5) this.A04;
                AnonymousClass0x2.A1A(r34, 1, r2);
                ((C46232bI) this.A00).A00(r2, r34, r43, this.A05, (List) this.A02);
                return;
        }
    }

    public C71623cP(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.A06 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A05 = str;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
    }

    public C71623cP(C621033m r2, C66513Ls r3, AnonymousClass4UA r4, C624134x r5, String str, List list) {
        this.A06 = 0;
        this.A00 = r2;
        this.A01 = r4;
        this.A02 = r5;
        this.A05 = str;
        this.A04 = list;
        this.A03 = r3;
    }
}
