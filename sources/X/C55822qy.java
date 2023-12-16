package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Set;

/* renamed from: X.2qy  reason: invalid class name and case insensitive filesystem */
public abstract class C55822qy {
    public final AnonymousClass31C A00;
    public final C57442te A01;
    public final AnonymousClass4FS A02;
    public final String A03;

    public final AnonymousClass4UC A01(Set set) {
        C162457s7.A0J(set, 0);
        AnonymousClass4UC A0b = AnonymousClass0x9.A0b();
        C70353aM.A00(this.A02, this, set, A0b, 35);
        return A0b;
    }

    public String A02() {
        if (this instanceof AnonymousClass1kJ) {
            return C18280x3.A0Z(AnonymousClass0x2.A0F(((AnonymousClass1kJ) this).A01), "profile_photo_block_list_hash");
        }
        if (this instanceof AnonymousClass1kI) {
            return C18280x3.A0Z(AnonymousClass0x2.A0F(((AnonymousClass1kI) this).A01), "last_seen_block_list_hash");
        }
        if (this instanceof AnonymousClass1kH) {
            return C18280x3.A0Z(AnonymousClass0x2.A0F(((AnonymousClass1kH) this).A01), "group_add_blacklist_hash");
        }
        return C18280x3.A0Z(AnonymousClass0x2.A0F(((AnonymousClass1kG) this).A01), "about_block_list_hash");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        if (r3 != null) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A03() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.AnonymousClass1kJ
            if (r0 == 0) goto L_0x0020
            r0 = r4
            X.1kJ r0 = (X.AnonymousClass1kJ) r0
            X.3Ex r0 = r0.A00
            X.1vC r0 = r0.A05
            X.4GK r2 = X.C18630y0.A03(r0)
            java.lang.String r1 = "SELECT jid FROM wa_profile_photo_block_list"
            java.lang.String r0 = "CONTACT_PROFILE_PHOTO_BLOCK_LIST"
            android.database.Cursor r3 = X.AnonymousClass361.A09(r2, r1, r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "contact-mgr-db/unable to get profile photo block list"
            java.util.Set r0 = X.C34461vC.A02(r3, r0)     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x007e
            goto L_0x007b
        L_0x0020:
            boolean r0 = r4 instanceof X.AnonymousClass1kI
            if (r0 == 0) goto L_0x0040
            r0 = r4
            X.1kI r0 = (X.AnonymousClass1kI) r0
            X.3Ex r0 = r0.A00
            X.1vC r0 = r0.A05
            X.4GK r2 = X.C18630y0.A03(r0)
            java.lang.String r1 = "SELECT jid FROM wa_last_seen_block_list"
            java.lang.String r0 = "CONTACT_LAST_SEEN_BLOCK_LIST"
            android.database.Cursor r3 = X.AnonymousClass361.A09(r2, r1, r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "contact-mgr-db/unable to get last seen block list"
            java.util.Set r0 = X.C34461vC.A02(r3, r0)     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x007e
            goto L_0x007b
        L_0x0040:
            boolean r0 = r4 instanceof X.AnonymousClass1kH
            if (r0 == 0) goto L_0x0060
            r0 = r4
            X.1kH r0 = (X.AnonymousClass1kH) r0
            X.3Ex r0 = r0.A00
            X.1vC r0 = r0.A05
            X.4GK r2 = X.C18630y0.A03(r0)
            java.lang.String r1 = "SELECT jid FROM wa_group_add_black_list"
            java.lang.String r0 = "CONTACT_GROUP_ADD_BLACK_LIST"
            android.database.Cursor r3 = X.AnonymousClass361.A09(r2, r1, r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "contact-mgr-db/unable to get group add block list"
            java.util.Set r0 = X.C34461vC.A02(r3, r0)     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x007e
            goto L_0x007b
        L_0x0060:
            r0 = r4
            X.1kG r0 = (X.AnonymousClass1kG) r0
            X.3Ex r0 = r0.A00
            X.1vC r0 = r0.A05
            X.4GK r2 = X.C18630y0.A03(r0)
            java.lang.String r1 = "SELECT jid FROM wa_about_block_list"
            java.lang.String r0 = "CONTACT_ABOUT_BLOCK_LIST"
            android.database.Cursor r3 = X.AnonymousClass361.A09(r2, r1, r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "contact-mgr-db/unable to get about block list"
            java.util.Set r0 = X.C34461vC.A02(r3, r0)     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x007e
        L_0x007b:
            r3.close()     // Catch:{ all -> 0x008e }
        L_0x007e:
            r2.close()
            return r0
        L_0x0082:
            r1 = move-exception
            if (r3 == 0) goto L_0x008d
            r3.close()     // Catch:{ all -> 0x0089 }
            goto L_0x008d
        L_0x0089:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x008e }
        L_0x008d:
            throw r1     // Catch:{ all -> 0x008e }
        L_0x008e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0093 }
            throw r1
        L_0x0093:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55822qy.A03():java.util.Set");
    }

    public void A04(String str, Set set, boolean z) {
        if (this instanceof AnonymousClass1kJ) {
            AnonymousClass1kJ r3 = (AnonymousClass1kJ) this;
            C34461vC r1 = r3.A00.A05;
            AnonymousClass33M A002 = AnonymousClass33M.A00();
            r1.A0R("wa_profile_photo_block_list", set);
            AnonymousClass33M.A04(A002, "contact-mgr-db/updated profile photo block list | time: ", AnonymousClass001.A0o());
            AnonymousClass33p r32 = r3.A01;
            C18270x1.A0j(C18270x1.A03(r32), "profile_photo_block_list_hash", str);
            if (z) {
                C18270x1.A0h(C18270x1.A03(r32), "privacy_profile_photo", 3);
            }
        } else if (this instanceof AnonymousClass1kI) {
            AnonymousClass1kI r33 = (AnonymousClass1kI) this;
            C34461vC r12 = r33.A00.A05;
            AnonymousClass33M A003 = AnonymousClass33M.A00();
            r12.A0R("wa_last_seen_block_list", set);
            AnonymousClass33M.A04(A003, "contact-mgr-db/updated last seen block list | time: ", AnonymousClass001.A0o());
            AnonymousClass33p r34 = r33.A01;
            C18270x1.A0j(C18270x1.A03(r34), "last_seen_block_list_hash", str);
            if (z) {
                C18270x1.A0h(C18270x1.A03(r34), "privacy_last_seen", 3);
            }
        } else if (this instanceof AnonymousClass1kH) {
            AnonymousClass1kH r35 = (AnonymousClass1kH) this;
            C34461vC r13 = r35.A00.A05;
            AnonymousClass33M A004 = AnonymousClass33M.A00();
            r13.A0R("wa_group_add_black_list", set);
            AnonymousClass33M.A04(A004, "contact-mgr-db/updated group add black list | time: ", AnonymousClass001.A0o());
            AnonymousClass33p r36 = r35.A01;
            C18270x1.A0j(C18270x1.A03(r36), "group_add_blacklist_hash", str);
            if (z) {
                C18270x1.A0h(C18270x1.A03(r36), "privacy_groupadd", 3);
            }
        } else {
            AnonymousClass1kG r37 = (AnonymousClass1kG) this;
            C34461vC r14 = r37.A00.A05;
            AnonymousClass33M A005 = AnonymousClass33M.A00();
            r14.A0R("wa_about_block_list", set);
            AnonymousClass33M.A04(A005, "contact-mgr-db/updated about block list | time: ", AnonymousClass001.A0o());
            AnonymousClass33p r38 = r37.A01;
            C18270x1.A0j(C18270x1.A03(r38), "about_block_list_hash", str);
            if (z) {
                C18270x1.A0h(C18270x1.A03(r38), "privacy_status", 3);
            }
        }
    }

    public C55822qy(AnonymousClass31C r1, C57442te r2, AnonymousClass4FS r3, String str) {
        this.A03 = str;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final AnonymousClass4UC A00() {
        int i;
        AnonymousClass4UC A0b = AnonymousClass0x9.A0b();
        AnonymousClass31C r8 = this.A00;
        String A032 = r8.A03();
        String str = this.A03;
        String A022 = A02();
        C162457s7.A0J(str, 0);
        AnonymousClass36K A0F = AnonymousClass36K.A0F(AnonymousClass36K.A0I("list", C57442te.A00(str, A022)), "privacy", (AnonymousClass39V[]) null);
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W, 0);
        AnonymousClass39V.A0E(A1W, 1);
        AnonymousClass39V.A06("xmlns", "privacy", A1W);
        AnonymousClass36K A0E = AnonymousClass36K.A0E(A0F, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A1W);
        if (this instanceof AnonymousClass1kJ) {
            i = 291;
        } else if (this instanceof AnonymousClass1kI) {
            i = 288;
        } else if (this instanceof AnonymousClass1kH) {
            i = 227;
        } else {
            i = 293;
        }
        r8.A0E(new AnonymousClass4KT(this, 13, A0b), A0E, A032, i, 32000);
        return A0b;
    }
}
