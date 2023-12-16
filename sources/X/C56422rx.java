package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Handler;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2rx  reason: invalid class name and case insensitive filesystem */
public class C56422rx {
    public final Handler A00 = AnonymousClass000.A0A();
    public final C56972sr A01;
    public final C66663Mh A02;
    public final C64773Ex A03;
    public final C34461vC A04;
    public final C29421in A05;
    public final C28741hh A06 = new C28741hh();
    public final C621133n A07;
    public final C48972fm A08;
    public final Object A09 = AnonymousClass002.A0D();
    public final Map A0A = AnonymousClass0x7.A0y();
    public final Set A0B;

    public C55502qS A01(UserJid userJid) {
        Integer num = null;
        C55502qS A002 = A00(userJid);
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A17(userJid, "VerifiedNameManager/getVerifiedNameDeprecated, jid: ", ", vlevel:", A0o);
        if (A002 != null) {
            num = Integer.valueOf(A002.A03);
        }
        C18260x0.A0o(num, A0o);
        return A002;
    }

    public final boolean A06(UserJid userJid, AnonymousClass3ZC r22, byte[] bArr, int i) {
        Long l;
        String str;
        Integer num;
        C69833Yo Axm;
        ArrayList A0D;
        String str2;
        boolean z = false;
        UserJid userJid2 = userJid;
        if (userJid == null) {
            return false;
        }
        try {
            AnonymousClass1CQ r1 = (AnonymousClass1CQ) C130786cX.A05(AnonymousClass1CQ.DEFAULT_INSTANCE, bArr);
            if ((r1.bitField0_ & 1) != 0) {
                AnonymousClass3ZC r7 = null;
                AnonymousClass1DL r10 = (AnonymousClass1DL) C130786cX.A05(AnonymousClass1DL.DEFAULT_INSTANCE, r1.details_.A07());
                if (r10 != null) {
                    synchronized (this.A09) {
                        C18260x0.A1P(AnonymousClass001.A0o(), "VerifiedNameManager/storeVerifiedNameCert waContact:", this.A03.A0A(userJid2));
                        C55502qS A012 = A01(userJid2);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("VerifiedNameManager/storeVerifiedNameCert, userjid: ");
                        A0o.append(userJid2);
                        A0o.append(", old serial: ");
                        if (A012 == null) {
                            l = null;
                        } else {
                            l = Long.valueOf(A012.A05);
                        }
                        A0o.append(l);
                        A0o.append(", issuer: ");
                        if (A012 == null) {
                            str = null;
                        } else {
                            str = A012.A07;
                        }
                        A0o.append(str);
                        A0o.append(", vlevel: ");
                        if (A012 == null) {
                            num = null;
                        } else {
                            num = Integer.valueOf(A012.A03);
                        }
                        A0o.append(num);
                        A0o.append(", privacyState: ");
                        if (A012 != null) {
                            r7 = A012.A01();
                        }
                        C18260x0.A0o(r7, A0o);
                        AnonymousClass3ZC r9 = r22;
                        int i2 = i;
                        if (A012 == null || A012.A05 != r10.serial_ || A012.A02 > 0) {
                            ArrayList A0s = AnonymousClass001.A0s();
                            for (AnonymousClass1CP r6 : r10.localizedNames_) {
                                if (!TextUtils.isEmpty(r6.lg_)) {
                                    String str3 = r6.lg_;
                                    if (!TextUtils.isEmpty(r6.lc_)) {
                                        str2 = r6.lc_;
                                    } else {
                                        str2 = "";
                                    }
                                    AnonymousClass0x2.A1G(new Locale(str3, str2), r6.verifiedName_, A0s);
                                }
                            }
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("VerifiedNameManager/storeVerifiedNameCert, new or updated cert. jid: ");
                            A0o2.append(userJid2);
                            A0o2.append("new serial:");
                            A0o2.append(r10.serial_);
                            A0o2.append(", issuer: ");
                            A0o2.append(r10.issuer_);
                            A0o2.append(", vlevel: ");
                            A0o2.append(i2);
                            C18260x0.A1R(A0o2, ", privacyState: ", r9);
                            C34461vC r62 = this.A04;
                            long j = r10.serial_;
                            String str4 = r10.issuer_;
                            String str5 = r10.verifiedName_;
                            C18260x0.A1P(AnonymousClass001.A0o(), "contact-mgr-db/saveVerifiedNameDetails: update; jid=", userJid2);
                            try {
                                C85284Fq A072 = C18630y0.A07(r62);
                                try {
                                    Axm = A072.Axm();
                                    r62.A0I(Axm, userJid2);
                                    String rawString = userJid2.getRawString();
                                    boolean z2 = false;
                                    int i3 = 7;
                                    if (r22 != null) {
                                        z2 = true;
                                        i3 = 10;
                                    }
                                    ContentValues A073 = AnonymousClass0x9.A07(i3);
                                    A073.put("jid", rawString);
                                    C18270x1.A0c(A073, "serial", j);
                                    A073.put("issuer", str4);
                                    A073.put("verified_name", str5);
                                    C18270x1.A0b(A073, "verified_level", i2);
                                    A073.put("cert_blob", (byte[]) null);
                                    A073.put("identity_unconfirmed_since", (Long) null);
                                    if (z2) {
                                        C18270x1.A0b(A073, "host_storage", r9.hostStorage);
                                        C18270x1.A0b(A073, "actual_actors", r9.actualActors);
                                        C18270x1.A0c(A073, "privacy_mode_ts", r9.privacyModeTs);
                                    }
                                    AnonymousClass361.A06(A073, A072, "wa_vnames");
                                    A073.clear();
                                    Iterator it = A0s.iterator();
                                    while (it.hasNext()) {
                                        AnonymousClass0PJ r92 = (AnonymousClass0PJ) it.next();
                                        A073.put("jid", rawString);
                                        Locale locale = (Locale) r92.A00;
                                        C626936e.A06(locale);
                                        A073.put("lg", locale.getLanguage());
                                        A073.put("lc", locale.getCountry());
                                        A073.put("verified_name", (String) r92.A01);
                                        AnonymousClass361.A06(A073, A072, "wa_vnames_localized");
                                    }
                                    A0D = r62.A0D(userJid2);
                                    Axm.A00();
                                    Axm.close();
                                    A072.close();
                                } catch (Throwable th) {
                                    A072.close();
                                    throw th;
                                }
                            } catch (IllegalArgumentException e) {
                                C626936e.A08(AnonymousClass000.A0P(userJid2, "contact-mgr-db/unable to store vname details ", AnonymousClass001.A0o()), e);
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            if (A0D != null && !A0D.isEmpty()) {
                                C34461vC.A00(r62).A08(A0D);
                            }
                            z = true;
                        } else {
                            C18260x0.A1R(AnonymousClass001.A0o(), "VerifiedNameManager/storeVerifiedNameCert, cert unchanged but level or privacy changed, jid: ", userJid2);
                            z = A04(userJid2, r9, i2, false);
                        }
                    }
                    AnonymousClass0x2.A1K(userJid2, this.A0A, System.currentTimeMillis());
                    C28741hh r12 = this.A06;
                    new AnonymousClass2WG(userJid2);
                    r12.A08();
                    return z;
                }
            }
        } catch (AnonymousClass6u5 e2) {
            C18260x0.A0k(userJid2, "VerifiedNameManager/storeVerifiedNameCert, vname invalidproto for jid: ", AnonymousClass001.A0o(), e2);
        } catch (IllegalArgumentException e3) {
            C18260x0.A0k(userJid2, "VerifiedNameManager/storeVerifiedNameCert vname failed to get identity entry for jid = ", AnonymousClass001.A0o(), e3);
        } catch (Throwable th3) {
            C18260x0.A1S(AnonymousClass001.A0o(), "VerifiedNameManager/storeVerifiedNameCert, vname certificate details could no be found or validated for jid ", userJid2);
            AnonymousClass0x2.A1K(userJid2, this.A0A, System.currentTimeMillis());
            C28741hh r13 = this.A06;
            new AnonymousClass2WG(userJid2);
            r13.A08();
            throw th3;
        }
        C18260x0.A1S(AnonymousClass001.A0o(), "VerifiedNameManager/storeVerifiedNameCert, vname certificate details could no be found or validated for jid ", userJid2);
        AnonymousClass0x2.A1K(userJid2, this.A0A, System.currentTimeMillis());
        C28741hh r122 = this.A06;
        new AnonymousClass2WG(userJid2);
        r122.A08();
        return z;
        throw th;
    }

    public C55502qS A00(UserJid userJid) {
        if (this.A01.A0a(userJid)) {
            return this.A04.A0A(userJid);
        }
        if (userJid != null) {
            return this.A03.A0A(userJid).A0E;
        }
        return null;
    }

    public boolean A03(UserJid userJid) {
        AnonymousClass3ZH A072;
        String str;
        if (userJid == null || (A072 = this.A03.A07(userJid)) == null || (str = A072.A0T) == null || !str.startsWith("ent:")) {
            return false;
        }
        return true;
    }

    public byte[] A07(UserJid userJid) {
        Cursor A0A2;
        AnonymousClass4GK A032 = C18630y0.A03(this.A04);
        try {
            A0A2 = AnonymousClass361.A0A(A032, "SELECT cert_blob FROM wa_vnames WHERE jid = ?", "CONTACT_VNAMES_CERT_BLOB", C18270x1.A1a(userJid));
            if (A0A2.isClosed() || !A0A2.moveToNext()) {
                A0A2.close();
                A032.close();
                return null;
            }
            byte[] A1Z = C18280x3.A1Z(A0A2, "cert_blob");
            A0A2.close();
            A032.close();
            return A1Z;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C56422rx(C56972sr r2, C66663Mh r3, C64773Ex r4, C34461vC r5, C29421in r6, C621133n r7, C48972fm r8, Set set) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A07 = r7;
        this.A04 = r5;
        this.A08 = r8;
        this.A0B = set;
    }

    public void A02(UserJid userJid) {
        C69833Yo Axl;
        ArrayList A0D;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VerifiedNameManager/clearVerifiedName, userjid: ");
        A0o.append(userJid);
        C18260x0.A1L(A0o, " UI change");
        synchronized (this.A09) {
            C34461vC r5 = this.A04;
            if (userJid != null) {
                try {
                    C85284Fq A072 = C18630y0.A07(r5);
                    try {
                        Axl = A072.Axl();
                        r5.A0I(Axl, userJid);
                        A0D = r5.A0D(userJid);
                        Axl.A00();
                        Axl.close();
                        A072.close();
                    } catch (Throwable th) {
                        A072.close();
                        throw th;
                    }
                } catch (IllegalArgumentException e) {
                    C626936e.A08(AnonymousClass000.A0P(userJid, "contact-mgr-db/unable to delete vname details ", AnonymousClass001.A0o()), e);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                if (A0D != null && !A0D.isEmpty()) {
                    C34461vC.A00(r5).A08(A0D);
                }
            }
        }
        this.A0A.remove(userJid);
        this.A03.A0K();
        this.A00.post(new C70203a7(this, 7, userJid));
        return;
        throw th;
    }

    public boolean A04(UserJid userJid, AnonymousClass3ZC r14, int i, boolean z) {
        Object obj;
        boolean z2;
        int i2;
        long j;
        C85284Fq A072;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VerifiedNameManager/updateContactBizField, userjid: ");
        A0o.append(userJid);
        A0o.append("new verifiedLevel: ");
        A0o.append(i);
        A0o.append(" privacyMode: ");
        if (r14 == null) {
            obj = "null";
        } else {
            obj = r14;
        }
        C18260x0.A0o(obj, A0o);
        synchronized (this.A09) {
            C55502qS A012 = A01(userJid);
            z2 = false;
            if (A012 != null) {
                i2 = A012.A03;
            } else {
                i2 = 0;
            }
            if (A012 != null) {
                j = A012.A04;
            } else {
                j = 0;
            }
            ContentValues A062 = AnonymousClass0x9.A06();
            if (i2 != i) {
                C18270x1.A0b(A062, "verified_level", i);
            }
            if (r14 != null) {
                long j2 = r14.privacyModeTs;
                if (j < j2 || (j > 0 && j2 == 0)) {
                    C18270x1.A0b(A062, "host_storage", r14.hostStorage);
                    C18270x1.A0b(A062, "actual_actors", r14.actualActors);
                    C18270x1.A0c(A062, "privacy_mode_ts", r14.privacyModeTs);
                }
            }
            if (A062.size() > 0) {
                z2 = true;
            }
            C18260x0.A1E(", isUpdate: ", AnonymousClass000.A0k(userJid, "VerifiedNameManager/updateContactBizField, userjid: "), z2);
            if (z2) {
                C34461vC r8 = this.A04;
                try {
                    A072 = C18630y0.A07(r8);
                    String[] A1Y = AnonymousClass0x9.A1Y();
                    A1Y[0] = C627336j.A07(userJid);
                    AnonymousClass361.A07(A062, A072, "wa_vnames", "jid = ?", A1Y);
                    A072.close();
                } catch (IllegalArgumentException e) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    AnonymousClass000.A17(userJid, "wadbhelper/update-multi-fields/unable to update fields", ", ", A0o2);
                    AnonymousClass000.A1B(A062, A0o2);
                    C626936e.A08(A0o2.toString(), e);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
                C34461vC.A00(r8).A08(r8.A0D(userJid));
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("contact-mgr-db/wadbhelper/update-multi-fields/updated fields jid=");
                A0o3.append(userJid);
                C18260x0.A1P(A0o3, ", ", A062);
                if (z && i2 != i) {
                    this.A03.A0K();
                    Iterator it = this.A0B.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw AnonymousClass001.A0g("onLevelChanged");
                    }
                }
                C18260x0.A1R(AnonymousClass001.A0o(), "VerifiedNameManager/updateContactBizField, ui change, userjid: ", userJid);
                this.A00.post(new C70203a7(this, 9, userJid));
            }
        }
        return z2;
        throw th;
    }

    public boolean A05(UserJid userJid, AnonymousClass3ZC r6, byte[] bArr, int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VerifiedNameManager/storeAndConfirmVerifiedNameCert, jid: ");
        A0o.append(userJid);
        C18260x0.A0y(", new vlevel: ", A0o, i);
        synchronized (this.A09) {
            A06(userJid, r6, bArr, i);
            C55502qS A012 = A01(userJid);
            C626936e.A06(A012);
            StringBuilder A0k = AnonymousClass000.A0k(userJid, "VerifiedNameManager/storeAndConfirmVerifiedNameCert, jid: ");
            A0k.append(", verifiedName.identityUnconfirmedSince: ");
            int i2 = A012.A02;
            C18260x0.A1G(A0k, i2);
            if (i2 != 0) {
                return false;
            }
            C18260x0.A1R(AnonymousClass001.A0o(), "VerifiedNameManager/storeAndConfirmVerifiedNameCert, updating UI, userjid: ", userJid);
            this.A00.post(new C70203a7(this, 8, userJid));
            return true;
        }
    }
}
