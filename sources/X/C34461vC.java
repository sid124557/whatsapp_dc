package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.1vC  reason: invalid class name and case insensitive filesystem */
public class C34461vC extends AnonymousClass361 implements C85004Eo {
    public C49472ga A00;
    public C72173dI A01;
    public Integer A02;
    public final C56972sr A03;
    public final C620633i A04;
    public final C56612sH A05;
    public final C620733j A06;
    public final AnonymousClass1VX A07;
    public final AnonymousClass2ML A08;
    public final AnonymousClass4FS A09;
    public final C183538qC A0A;
    public final Object A0B = AnonymousClass002.A0D();

    public C55502qS A0A(UserJid userJid) {
        Cursor A0A2;
        C55502qS r4 = null;
        if (userJid == null) {
            Log.w("contact-mgr-db/cannot get verified name details by null jid");
            return null;
        }
        AnonymousClass4GK A032 = C18630y0.A03(this);
        try {
            A0A2 = AnonymousClass361.A0A(A032, C39412Bw.A01, "CONTACT_VNAMES", C18270x1.A1a(userJid));
            if (!A0A2.isClosed() && A0A2.moveToNext()) {
                r4 = AnonymousClass25T.A00(A0A2);
            }
            A0A2.close();
            A032.close();
            return r4;
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

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0088, code lost:
        if (r4 != null) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3ZH A0B(com.whatsapp.jid.Jid r10) {
        /*
            r9 = this;
            r4 = 0
            if (r10 != 0) goto L_0x0009
            java.lang.String r0 = "contact-mgr-db/cannot get contact by null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r4
        L_0x0009:
            X.33M r3 = X.AnonymousClass33M.A00()
            r5 = 0
            X.4GK r8 = X.C18630y0.A03(r9)     // Catch:{ IllegalStateException -> 0x0060 }
            java.lang.String r2 = X.C58142um.A04     // Catch:{ all -> 0x0052 }
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0052 }
            X.C18280x3.A0w(r10, r1, r5)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "GET_CONTACT_BY_JID"
            android.database.Cursor r7 = X.AnonymousClass361.A0A(r8, r2, r0, r1)     // Catch:{ all -> 0x0052 }
            r6 = r4
            r2 = 0
        L_0x0023:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0039
            X.3ZH r1 = X.AnonymousClass25S.A00(r7)     // Catch:{ all -> 0x0044 }
            int r2 = r2 + 1
            X.3ZH r4 = A01(r1, r4)     // Catch:{ all -> 0x0044 }
            X.2k5 r0 = r1.A0F     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0023
            r6 = r1
            goto L_0x0023
        L_0x0039:
            int r5 = r7.getCount()     // Catch:{ all -> 0x0044 }
            r7.close()     // Catch:{ all -> 0x0050 }
            r8.close()     // Catch:{ IllegalStateException -> 0x005e }
            goto L_0x0068
        L_0x0044:
            r1 = move-exception
            if (r7 == 0) goto L_0x004f
            r7.close()     // Catch:{ all -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0050 }
        L_0x004f:
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            goto L_0x0055
        L_0x0052:
            r1 = move-exception
            r6 = r4
            r2 = 0
        L_0x0055:
            r8.close()     // Catch:{ all -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x005e }
        L_0x005d:
            throw r1     // Catch:{ IllegalStateException -> 0x005e }
        L_0x005e:
            r1 = move-exception
            goto L_0x0063
        L_0x0060:
            r1 = move-exception
            r6 = r4
            r2 = 0
        L_0x0063:
            java.lang.String r0 = "contactmanagerdb/getContactByJid/"
            A04(r1, r0, r5, r2)     // Catch:{ all -> 0x00b6 }
        L_0x0068:
            if (r6 == 0) goto L_0x0088
            if (r6 == r4) goto L_0x00ac
            r1 = r9
            monitor-enter(r1)
            X.3dI r2 = r9.A01     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x007e
            X.4FS r0 = r9.A09     // Catch:{ all -> 0x007b }
            X.3dI r2 = X.C72173dI.A00(r0)     // Catch:{ all -> 0x007b }
            r9.A01 = r2     // Catch:{ all -> 0x007b }
            goto L_0x007e
        L_0x007b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x007e:
            monitor-exit(r1)
            r1 = 2
            X.3a7 r0 = new X.3a7
            r0.<init>(r9, r1, r6)
            r2.execute(r0)
        L_0x0088:
            if (r4 != 0) goto L_0x00ac
        L_0x008a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contact fetched by jid="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " result="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " count="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " | time: "
            X.AnonymousClass33M.A04(r3, r0, r1)
            return r4
        L_0x00ac:
            X.33j r0 = r9.A06
            java.util.Locale r0 = X.C620733j.A02(r0)
            r9.A0P(r4, r0)
            goto L_0x008a
        L_0x00b6:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34461vC.A0B(com.whatsapp.jid.Jid):X.3ZH");
    }

    public static C28831hq A00(C34461vC r0) {
        return (C28831hq) r0.A0A.get();
    }

    public static final AnonymousClass3ZH A01(AnonymousClass3ZH r7, AnonymousClass3ZH r8) {
        C51602k5 r6;
        StringBuilder A0o;
        C51602k5 r0;
        if (r8 == null || ((r6 = r8.A0F) == null && r7.A0F != null)) {
            return r7;
        }
        if (!Build.MANUFACTURER.equalsIgnoreCase("lge") || r6 == null || r6.A00 != -2 || (r0 = r7.A0F) == null || r0.A00 == -2) {
            boolean z = r8.A10;
            boolean z2 = r7.A10;
            if (!z) {
                if (z2) {
                    return r7;
                }
            } else if (z2 && r7.A0F() < r8.A0F()) {
                A0o = AnonymousClass001.A0o();
                AnonymousClass000.A17(r8, "contact-mgr-db/replacing contact ", " with ", A0o);
                A0o.append(r7);
                A0o.append(" because of lower id ");
            }
            return r8;
        }
        A0o = AnonymousClass001.A0o();
        AnonymousClass000.A17(r6, "contact-mgr-db/replacing sim contact ", " with ", A0o);
        A0o.append(r7.A0F);
        AnonymousClass0x2.A18(A0o);
        return r7;
    }

    public static void A03(C64773Ex r1, AnonymousClass3ZH r2) {
        r1.A05.A0M(r2);
        r1.A04.A02(r2);
    }

    public final void A0I(C69833Yo r8, UserJid userJid) {
        C626936e.A0C(r8.A01());
        String rawString = userJid.getRawString();
        C626936e.A06(rawString);
        C85284Fq A072 = C18630y0.A07(this);
        try {
            AnonymousClass361.A08(A072, "wa_vnames", "jid = ?", new String[]{rawString});
            AnonymousClass361.A08(A072, "wa_vnames_localized", "jid = ?", new String[]{rawString});
            A072.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public final void A0O(AnonymousClass3ZH r25, C28011fL r26) {
        C69833Yo Axl;
        C28011fL r15 = r26;
        if (r26 != null && !(r15 instanceof C28001fK)) {
            try {
                C85284Fq A072 = C18630y0.A07(this);
                try {
                    Axl = A072.Axl();
                    AnonymousClass3ZH r1 = r25;
                    A07(Axl, A072, r15, r1.A0K);
                    boolean z = r1.A14;
                    boolean z2 = r1.A0e;
                    boolean z3 = r1.A12;
                    int i = r1.A02;
                    UserJid userJid = r1.A0I;
                    boolean z4 = r1.A0j;
                    boolean z5 = r1.A0s;
                    boolean z6 = r1.A13;
                    int i2 = r1.A04;
                    boolean z7 = r1.A0k;
                    int i3 = r1.A03;
                    boolean z8 = r1.A0v;
                    String str = r1.A0M;
                    boolean z9 = r1.A0q;
                    boolean z10 = r1.A0d;
                    boolean z11 = r1.A0w;
                    boolean z12 = r1.A11;
                    boolean z13 = r1.A0i;
                    boolean z14 = r1.A0f;
                    ContentValues A062 = AnonymousClass0x9.A06();
                    AnonymousClass0x2.A0n(A062, r15, "jid");
                    AnonymousClass0x2.A0o(A062, "restrict_mode", z);
                    AnonymousClass0x2.A0o(A062, "announcement_group", z2);
                    AnonymousClass0x2.A0o(A062, "no_frequently_forwarded", z3);
                    C18270x1.A0b(A062, "ephemeral_duration", i);
                    A062.put("creator_jid", C627336j.A07(userJid));
                    AnonymousClass0x2.A0o(A062, "in_app_support", z4);
                    AnonymousClass0x2.A0o(A062, "is_suspended", z5);
                    AnonymousClass0x2.A0o(A062, "require_membership_approval", z6);
                    C18270x1.A0b(A062, "member_add_mode", i2);
                    AnonymousClass0x2.A0o(A062, "incognito", z7);
                    C18270x1.A0b(A062, "group_state", i3);
                    AnonymousClass0x2.A0o(A062, "is_pending_requests_banner_acknowledged", z8);
                    A062.put("addressing_mode", str);
                    AnonymousClass0x2.A0o(A062, "is_report_to_admin_enabled", z9);
                    AnonymousClass0x2.A0o(A062, "allow_non_admin_subgroup_creation", z10);
                    AnonymousClass0x2.A0o(A062, "is_pending_suggestions_banner_acknowledged", z11);
                    AnonymousClass0x2.A0o(A062, "is_name_group_banner_dismissed", z12);
                    AnonymousClass0x2.A0o(A062, "history_enabled", z13);
                    AnonymousClass0x2.A0o(A062, "auto_add_disabled", z14);
                    AnonymousClass361.A0B(A062, A072, "wa_group_admin_settings");
                    Axl.A00();
                    Axl.close();
                    A072.close();
                    return;
                } catch (Throwable th) {
                    A072.close();
                    throw th;
                }
            } catch (IllegalArgumentException e) {
                C626936e.A08("contact-mgr-db/unable to update group settings ", e);
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            return;
        }
        throw th;
    }

    public final void A0R(String str, Set set) {
        C69833Yo Axl;
        C85284Fq A072 = C18630y0.A07(this);
        try {
            Axl = A072.Axl();
            AnonymousClass361.A08(A072, str, (String) null, (String[]) null);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                UserJid A0T = C18310x6.A0T(it);
                ContentValues A073 = AnonymousClass0x9.A07(1);
                AnonymousClass0x2.A0n(A073, A0T, "jid");
                AnonymousClass361.A06(A073, A072, str);
            }
            Axl.A00();
            Axl.close();
            A072.close();
            return;
        } catch (Throwable th) {
            try {
                A072.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final void A0S(Collection collection) {
        Locale A022 = C620733j.A02(this.A06);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0P(C18310x6.A0R(it), A022);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (r10 != 3) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x03ab, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        if (r10 == 2) goto L_0x0069;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:199:0x0393, B:209:0x03a2] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0353 A[Catch:{ all -> 0x03b4 }, LOOP:9: B:181:0x034d->B:183:0x0353, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x036a A[Catch:{ all -> 0x03b4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(java.util.List r32, int r33, boolean r34, boolean r35, boolean r36) {
        /*
            r31 = this;
            java.lang.String r28 = "contact-mgr-db/getContactPickerList"
            r3 = 1
            X.33M r27 = X.AnonymousClass33M.A02(r3)
            r9 = r31
            X.2sr r0 = r9.A03
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A04(r0)
            X.2ML r2 = r9.A08
            r10 = r33
            if (r10 == r3) goto L_0x0037
            r0 = 2
            if (r10 == r0) goto L_0x0032
            r26 = 0
        L_0x001a:
            java.util.HashMap r8 = X.AnonymousClass001.A0t()
            r7 = 0
            if (r1 != 0) goto L_0x002c
            java.lang.String[] r2 = new java.lang.String[r7]
        L_0x0023:
            java.util.ArrayList r25 = X.AnonymousClass001.A0s()
            long r16 = android.os.SystemClock.uptimeMillis()
            goto L_0x0042
        L_0x002c:
            java.lang.String[] r2 = new java.lang.String[r3]
            X.C18280x3.A0w(r1, r2, r7)
            goto L_0x0023
        L_0x0032:
            X.1VX r4 = r2.A01
            r2 = 3762(0xeb2, float:5.272E-42)
            goto L_0x003b
        L_0x0037:
            X.1VX r4 = r2.A01
            r2 = 3519(0xdbf, float:4.931E-42)
        L_0x003b:
            X.2vE r0 = X.C58422vE.A02
            boolean r26 = r4.A0Y(r0, r2)
            goto L_0x001a
        L_0x0042:
            r30 = r32
            X.1RI r0 = r9.A00     // Catch:{ IllegalArgumentException -> 0x03c1 }
            r29 = r0
            X.4GK r24 = r29.get()     // Catch:{ IllegalArgumentException -> 0x03c1 }
            X.1VX r6 = r9.A07     // Catch:{ all -> 0x03b1 }
            r0 = 5868(0x16ec, float:8.223E-42)
            X.2vE r5 = X.C58422vE.A02     // Catch:{ all -> 0x03b1 }
            boolean r13 = r6.A0Y(r5, r0)     // Catch:{ all -> 0x03b1 }
            r0 = 6699(0x1a2b, float:9.387E-42)
            boolean r4 = r6.A0Y(r5, r0)     // Catch:{ all -> 0x03b1 }
            r0 = 3
            if (r4 == 0) goto L_0x0062
            r12 = 1
            if (r10 == r0) goto L_0x0069
        L_0x0062:
            r12 = 0
            if (r10 == r3) goto L_0x0069
            r0 = 2
            r11 = 0
            if (r10 != r0) goto L_0x006a
        L_0x0069:
            r11 = 1
        L_0x006a:
            boolean r7 = X.AnonymousClass000.A1W(r1)
            r4 = 0
            java.lang.String r3 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)"
            java.lang.StringBuilder r1 = X.AnonymousClass0x2.A0h()     // Catch:{ IllegalStateException -> 0x033e }
            java.lang.String r0 = X.C66223Kn.A00     // Catch:{ IllegalStateException -> 0x033e }
            X.AnonymousClass0x2.A1O(r1, r0)     // Catch:{ IllegalStateException -> 0x033e }
            X.AnonymousClass0x2.A1P(r1, r3)     // Catch:{ IllegalStateException -> 0x033e }
            java.lang.String r0 = "is_whatsapp_user"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x033e }
            if (r34 == 0) goto L_0x0088
            java.lang.String r0 = " = 0"
            goto L_0x008a
        L_0x0088:
            java.lang.String r0 = " = 1"
        L_0x008a:
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IllegalStateException -> 0x033e }
            if (r7 == 0) goto L_0x009a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ IllegalStateException -> 0x033e }
            java.lang.String r0 = " AND wa_contacts.jid != ?"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IllegalStateException -> 0x033e }
        L_0x009a:
            if (r11 == 0) goto L_0x00dc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ IllegalStateException -> 0x033e }
            java.lang.String r0 = " AND (raw_contact_id > 0 OR raw_contact_id = -2 OR raw_contact_id = -3"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IllegalStateException -> 0x033e }
            if (r12 == 0) goto L_0x00b2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ IllegalStateException -> 0x033e }
            java.lang.String r0 = " OR wa_contacts.jid LIKE '%@g.us'"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IllegalStateException -> 0x033e }
        L_0x00b2:
            if (r26 == 0) goto L_0x00be
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ IllegalStateException -> 0x033e }
            java.lang.String r0 = " OR raw_contact_id = -4"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IllegalStateException -> 0x033e }
        L_0x00be:
            if (r13 == 0) goto L_0x00d4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ IllegalStateException -> 0x033e }
            java.lang.String r0 = " OR is_wa_created_contact = 1"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IllegalStateException -> 0x033e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ IllegalStateException -> 0x033e }
            java.lang.String r0 = " AND sync_policy != 2"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IllegalStateException -> 0x033e }
        L_0x00d4:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r0)     // Catch:{ IllegalStateException -> 0x033e }
            java.lang.String r0 = X.AnonymousClass000.A0e(r0)     // Catch:{ IllegalStateException -> 0x033e }
        L_0x00dc:
            if (r35 == 0) goto L_0x00e8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ IllegalStateException -> 0x033e }
            java.lang.String r0 = " AND is_starred = 1"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IllegalStateException -> 0x033e }
        L_0x00e8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ IllegalStateException -> 0x033e }
            java.lang.String r0 = " ORDER BY display_name, wa_contacts.jid, phone_type ASC"
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IllegalStateException -> 0x033e }
            java.lang.String r1 = "CONTACT_PICKER_LIST"
            r0 = r24
            android.database.Cursor r23 = X.AnonymousClass361.A0A(r0, r3, r1, r2)     // Catch:{ IllegalStateException -> 0x033e }
            r7 = 0
        L_0x00fb:
            boolean r0 = r23.moveToNext()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x032c
            int r7 = r7 + 1
            X.3ZH r11 = X.AnonymousClass25S.A00(r23)     // Catch:{ all -> 0x0330 }
            X.4uZ r1 = r11.A0H     // Catch:{ all -> 0x0330 }
            if (r1 == 0) goto L_0x00fb
            boolean r0 = r1 instanceof X.C135166kE     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x00fb
            boolean r0 = r1 instanceof X.C28001fK     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x00fb
            boolean r0 = r1 instanceof X.AnonymousClass1fX     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x00fb
            boolean r0 = r1 instanceof X.AnonymousClass1fY     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x00fb
            r0 = 3
            if (r10 != r0) goto L_0x0122
            boolean r0 = r1 instanceof X.AnonymousClass1fI     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x00fb
        L_0x0122:
            boolean r0 = X.C627336j.A0L(r1)     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x012b
            if (r26 != 0) goto L_0x012b
            goto L_0x00fb
        L_0x012b:
            boolean r0 = r8.containsKey(r1)     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x031b
            java.lang.Object r3 = r8.get(r1)     // Catch:{ all -> 0x0330 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0330 }
            X.C626936e.A06(r3)     // Catch:{ all -> 0x0330 }
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0330 }
            X.2k5 r0 = r11.A0F     // Catch:{ all -> 0x0330 }
            java.lang.String r13 = "contact-mgr-db/process-contact/removing duplicate contact with null key "
            r22 = 1
            if (r0 != 0) goto L_0x0175
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x0324
            java.lang.Object r12 = r3.get(r4)     // Catch:{ all -> 0x0330 }
            X.3ZH r12 = (X.AnonymousClass3ZH) r12     // Catch:{ all -> 0x0330 }
            X.2k5 r0 = r12.A0F     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x0168
            long r14 = r12.A0B     // Catch:{ all -> 0x0330 }
            long r0 = r11.A0B     // Catch:{ all -> 0x0330 }
            int r18 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r18 >= 0) goto L_0x016f
            r3.remove(r12)     // Catch:{ all -> 0x0330 }
            r2.add(r12)     // Catch:{ all -> 0x0330 }
            r3.add(r11)     // Catch:{ all -> 0x0330 }
            goto L_0x0172
        L_0x0168:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0330 }
            X.C18260x0.A1R(r0, r13, r11)     // Catch:{ all -> 0x0330 }
        L_0x016f:
            r2.add(r11)     // Catch:{ all -> 0x0330 }
        L_0x0172:
            r21 = 1
            goto L_0x0177
        L_0x0175:
            r21 = 0
        L_0x0177:
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0330 }
            if (r21 != 0) goto L_0x02cd
            java.util.Iterator r14 = r3.iterator()     // Catch:{ all -> 0x0330 }
        L_0x0181:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x01a1
            X.3ZH r1 = X.C18310x6.A0R(r14)     // Catch:{ all -> 0x0330 }
            X.2k5 r0 = r1.A0F     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x0181
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0330 }
            X.C18260x0.A1R(r0, r13, r1)     // Catch:{ all -> 0x0330 }
            r12.add(r1)     // Catch:{ all -> 0x0330 }
            r2.add(r1)     // Catch:{ all -> 0x0330 }
            r3.add(r11)     // Catch:{ all -> 0x0330 }
            goto L_0x02cb
        L_0x01a1:
            r0 = 5868(0x16ec, float:8.223E-42)
            boolean r14 = r6.A0Y(r5, r0)     // Catch:{ all -> 0x0330 }
            java.util.Iterator r13 = r3.iterator()     // Catch:{ all -> 0x0330 }
        L_0x01ab:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x01cb
            X.3ZH r0 = X.C18310x6.A0R(r13)     // Catch:{ all -> 0x0330 }
            X.2k5 r1 = r11.A0F     // Catch:{ all -> 0x0330 }
            X.2k5 r0 = r0.A0F     // Catch:{ all -> 0x0330 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x01ab
            if (r14 == 0) goto L_0x02bf
            X.2k5 r0 = r11.A0F     // Catch:{ all -> 0x0330 }
            long r0 = r0.A00     // Catch:{ all -> 0x0330 }
            r14 = -5
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x02bf
        L_0x01cb:
            java.util.Iterator r15 = r3.iterator()     // Catch:{ all -> 0x0330 }
        L_0x01cf:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x0200
            X.3ZH r13 = X.C18310x6.A0R(r15)     // Catch:{ all -> 0x0330 }
            X.2k5 r0 = r11.A0F     // Catch:{ all -> 0x0330 }
            long r0 = r0.A00     // Catch:{ all -> 0x0330 }
            r18 = -2
            int r14 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r14 == 0) goto L_0x01cf
            X.2k5 r0 = r13.A0F     // Catch:{ all -> 0x0330 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x0330 }
            long r0 = r0.A00     // Catch:{ all -> 0x0330 }
            int r14 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r14 != 0) goto L_0x01cf
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "contact-mgr-db/process-contact/removing sim card duplicate contact "
            X.C18260x0.A1R(r1, r0, r13)     // Catch:{ all -> 0x0330 }
            r12.add(r13)     // Catch:{ all -> 0x0330 }
            r2.add(r13)     // Catch:{ all -> 0x0330 }
            r21 = 1
            goto L_0x01cf
        L_0x0200:
            if (r21 != 0) goto L_0x02bb
            java.util.Iterator r14 = r3.iterator()     // Catch:{ all -> 0x0330 }
        L_0x0206:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x0237
            X.3ZH r13 = X.C18310x6.A0R(r14)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = r13.A0J()     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x021c
            java.lang.String r0 = r11.A0J()     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x0228
        L_0x021c:
            boolean r0 = X.AnonymousClass3ZH.A0E(r13)     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x0206
            boolean r0 = X.AnonymousClass3ZH.A0E(r11)     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x0206
        L_0x0228:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "contact-mgr-db/process-contact/deduping null/empty display name contact "
            X.C18260x0.A1R(r1, r0, r13)     // Catch:{ all -> 0x0330 }
            r12.add(r13)     // Catch:{ all -> 0x0330 }
            r21 = 1
            goto L_0x0206
        L_0x0237:
            if (r21 != 0) goto L_0x02bb
            boolean r0 = X.AnonymousClass3ZH.A0E(r11)     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x0259
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x0330 }
        L_0x0243:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x0259
            X.3ZH r0 = X.C18310x6.A0R(r1)     // Catch:{ all -> 0x0330 }
            boolean r0 = X.AnonymousClass3ZH.A0E(r0)     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x0243
            java.lang.String r0 = "contact-mgr-db/process-contact/ignoring empty name since we have non-empty one"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0330 }
            goto L_0x02cb
        L_0x0259:
            java.util.Iterator r20 = r3.iterator()     // Catch:{ all -> 0x0330 }
        L_0x025d:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x0296
            X.3ZH r13 = X.C18310x6.A0R(r20)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = r13.A0J()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x025d
            java.lang.String r1 = r13.A0J()     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = r11.A0J()     // Catch:{ all -> 0x0330 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x025d
            long r18 = r11.A0F()     // Catch:{ all -> 0x0330 }
            long r14 = r13.A0F()     // Catch:{ all -> 0x0330 }
            int r0 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x025d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "contact-mgr-db/process-contact/deduping duplicate contact with preference for lower id "
            X.C18260x0.A1P(r1, r0, r13)     // Catch:{ all -> 0x0330 }
            r12.add(r13)     // Catch:{ all -> 0x0330 }
            r21 = 1
            goto L_0x025d
        L_0x0296:
            if (r21 != 0) goto L_0x02bb
            java.lang.String r0 = r11.A0J()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x02cd
            java.util.Iterator r13 = r3.iterator()     // Catch:{ all -> 0x0330 }
        L_0x02a2:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x02d0
            X.3ZH r0 = X.C18310x6.A0R(r13)     // Catch:{ all -> 0x0330 }
            java.lang.String r1 = r11.A0J()     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = r0.A0J()     // Catch:{ all -> 0x0330 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x02a2
            goto L_0x02cd
        L_0x02bb:
            r3.add(r11)     // Catch:{ all -> 0x0330 }
            goto L_0x02cd
        L_0x02bf:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "contact-mgr-db/process-contact/removing duplicate contact with matching key "
            X.C18260x0.A1R(r1, r0, r11)     // Catch:{ all -> 0x0330 }
            r2.add(r11)     // Catch:{ all -> 0x0330 }
        L_0x02cb:
            r21 = 1
        L_0x02cd:
            r22 = r21
            goto L_0x02dc
        L_0x02d0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "contact-mgr-db/process-contact/adding contact for same jid because names are different "
            X.C18260x0.A1P(r1, r0, r11)     // Catch:{ all -> 0x0330 }
            r3.add(r11)     // Catch:{ all -> 0x0330 }
        L_0x02dc:
            r3.removeAll(r12)     // Catch:{ all -> 0x0330 }
            if (r22 != 0) goto L_0x0314
            java.lang.String r0 = "existing_contacts: "
            java.lang.StringBuilder r12 = X.C18330xA.A0A(r0)     // Catch:{ all -> 0x0330 }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x0330 }
        L_0x02eb:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x02fc
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0330 }
            r12.append(r0)     // Catch:{ all -> 0x0330 }
            X.AnonymousClass001.A1M(r12)     // Catch:{ all -> 0x0330 }
            goto L_0x02eb
        L_0x02fc:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "contact-mgr-db/process-contact/contacts are identical, yet not ("
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            r1.append(r12)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = " and "
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = X.C18260x0.A04(r11, r1)     // Catch:{ all -> 0x0330 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0330 }
        L_0x0314:
            r0 = r25
            r0.addAll(r2)     // Catch:{ all -> 0x0330 }
            goto L_0x00fb
        L_0x031b:
            java.util.ArrayList r0 = X.C18300x5.A0s(r11)     // Catch:{ all -> 0x0330 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0330 }
            goto L_0x00fb
        L_0x0324:
            java.lang.String r0 = "same jid contacts must not be empty"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x0330 }
            throw r0     // Catch:{ all -> 0x0330 }
        L_0x032c:
            r23.close()     // Catch:{ IllegalStateException -> 0x033c }
            goto L_0x0349
        L_0x0330:
            r1 = move-exception
            if (r23 == 0) goto L_0x033b
            r23.close()     // Catch:{ all -> 0x0337 }
            goto L_0x033b
        L_0x0337:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x033c }
        L_0x033b:
            throw r1     // Catch:{ IllegalStateException -> 0x033c }
        L_0x033c:
            r2 = move-exception
            goto L_0x0340
        L_0x033e:
            r2 = move-exception
            r7 = 0
        L_0x0340:
            java.lang.String r1 = "contactmanagerdb/getContactPickerList/"
            int r0 = r8.size()     // Catch:{ all -> 0x03b4 }
            A04(r2, r1, r7, r0)     // Catch:{ all -> 0x03b4 }
        L_0x0349:
            java.util.Iterator r2 = X.AnonymousClass001.A0u(r8)     // Catch:{ all -> 0x03b4 }
        L_0x034d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x03b4 }
            if (r0 == 0) goto L_0x035f
            java.lang.Object r1 = X.AnonymousClass0x2.A0W(r2)     // Catch:{ all -> 0x03b4 }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x03b4 }
            r0 = r30
            r0.addAll(r1)     // Catch:{ all -> 0x03b4 }
            goto L_0x034d
        L_0x035f:
            r0 = r30
            r9.A0S(r0)     // Catch:{ all -> 0x03b4 }
            boolean r0 = r25.isEmpty()     // Catch:{ all -> 0x03b4 }
            if (r0 != 0) goto L_0x03ad
            X.4Fq r3 = r29.A0C()     // Catch:{ all -> 0x03b4 }
            if (r36 == 0) goto L_0x0375
            X.3Yo r2 = r3.Axm()     // Catch:{ all -> 0x03a1 }
            goto L_0x0379
        L_0x0375:
            X.3Yo r2 = r3.Axl()     // Catch:{ all -> 0x03a1 }
        L_0x0379:
            java.util.Iterator r1 = r25.iterator()     // Catch:{ all -> 0x0397 }
        L_0x037d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0397 }
            if (r0 == 0) goto L_0x038d
            X.3ZH r0 = X.C18310x6.A0R(r1)     // Catch:{ all -> 0x0397 }
            int r0 = r9.A06(r2, r0, r3)     // Catch:{ all -> 0x0397 }
            int r4 = r4 + r0
            goto L_0x037d
        L_0x038d:
            r2.A00()     // Catch:{ all -> 0x0397 }
            r2.close()     // Catch:{ all -> 0x03a1 }
            r3.close()     // Catch:{ all -> 0x03ab }
            goto L_0x03ad
        L_0x0397:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x039c }
            goto L_0x03a0
        L_0x039c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03a1 }
        L_0x03a0:
            throw r1     // Catch:{ all -> 0x03a1 }
        L_0x03a1:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x03a6 }
            goto L_0x03aa
        L_0x03a6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03ab }
        L_0x03aa:
            throw r1     // Catch:{ all -> 0x03ab }
        L_0x03ab:
            r1 = move-exception
            goto L_0x03b6
        L_0x03ad:
            r24.close()     // Catch:{ IllegalArgumentException -> 0x03bf }
            goto L_0x03c8
        L_0x03b1:
            r1 = move-exception
            r7 = 0
            goto L_0x03b5
        L_0x03b4:
            r1 = move-exception
        L_0x03b5:
            r4 = 0
        L_0x03b6:
            r24.close()     // Catch:{ all -> 0x03ba }
            goto L_0x03be
        L_0x03ba:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalArgumentException -> 0x03bf }
        L_0x03be:
            throw r1     // Catch:{ IllegalArgumentException -> 0x03bf }
        L_0x03bf:
            r1 = move-exception
            goto L_0x03c3
        L_0x03c1:
            r1 = move-exception
            r4 = 0
        L_0x03c3:
            java.lang.String r0 = "contact-mgr-db/unable to apply contact picker list de-dupe batch "
            X.C626936e.A08(r0, r1)     // Catch:{ all -> 0x03fc }
        L_0x03c8:
            X.2ga r3 = r9.A00
            r1 = r16
            r0 = r28
            X.C49472ga.A00(r3, r0, r1)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "ContactManagerDatabase/getContactPickerList "
            r0 = r30
            X.AnonymousClass000.A1H(r1, r2, r0)
            java.lang.String r0 = " contacts selected for picker (context="
            r2.append(r0)
            r2.append(r10)
            java.lang.String r0 = ") from "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = " rows, "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r1 = " duplicates deleted | time: "
            r0 = r27
            X.AnonymousClass33M.A04(r0, r1, r2)
            return
        L_0x03fc:
            r4 = move-exception
            X.2ga r3 = r9.A00
            r1 = r16
            r0 = r28
            X.C49472ga.A00(r3, r0, r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34461vC.A0U(java.util.List, int, boolean, boolean, boolean):void");
    }

    public boolean A0V(AnonymousClass3ZH r4) {
        if (r4.A0H == null) {
            return false;
        }
        if (r4.A0Q()) {
            return true;
        }
        if (!r4.A0o || !this.A08.A01.A0Y(C58422vE.A02, 3519)) {
            return false;
        }
        return true;
    }

    public void BPs(AnonymousClass3ZH r5) {
        synchronized (this.A0B) {
            Integer num = this.A02;
            if (num != null) {
                Integer valueOf = Integer.valueOf(num.intValue() - 1);
                this.A02 = valueOf;
                C18260x0.A1R(AnonymousClass001.A0o(), "contact-mgr-db/onContactUnlinkedFromPhonebook individualContactCount = ", valueOf);
            }
        }
    }

    public void BPv(Collection collection) {
        Integer valueOf;
        synchronized (this.A0B) {
            int A082 = A08(collection);
            Integer num = this.A02;
            if (num == null) {
                valueOf = Integer.valueOf(A082);
                this.A02 = valueOf;
            } else {
                valueOf = Integer.valueOf(num.intValue() + A082);
                this.A02 = valueOf;
            }
            C18260x0.A1R(AnonymousClass001.A0o(), "contact-mgr-db/onContactsAddedOrUpdated individualContactCount = ", valueOf);
        }
    }

    public void BPx(Collection collection) {
        synchronized (this.A0B) {
            int A082 = A08(collection);
            Integer num = this.A02;
            if (num != null) {
                Integer valueOf = Integer.valueOf(num.intValue() - A082);
                this.A02 = valueOf;
                C18260x0.A1R(AnonymousClass001.A0o(), "contact-mgr-db/onContactsRemoved individualContactCount = ", valueOf);
            }
        }
    }

    public /* synthetic */ void BUu(Collection collection) {
    }

    public C34461vC(C56972sr r2, C620633i r3, C56612sH r4, C620733j r5, C49472ga r6, AnonymousClass1VX r7, AnonymousClass2ML r8, AnonymousClass4FS r9, AnonymousClass1RI r10, C183538qC r11) {
        super(r10);
        this.A05 = r4;
        this.A07 = r7;
        this.A03 = r2;
        this.A09 = r9;
        this.A04 = r3;
        this.A06 = r5;
        this.A00 = r6;
        this.A08 = r8;
        this.A0A = r11;
    }

    public static final Set A02(Cursor cursor, String str) {
        HashSet A0K = AnonymousClass002.A0K();
        if (cursor == null) {
            C626936e.A0D(false, str);
        } else {
            while (cursor.moveToNext()) {
                AnonymousClass32Y.A0C(UserJid.Companion, cursor.getString(0), A0K);
            }
        }
        return A0K;
    }

    public static final void A04(IllegalStateException illegalStateException, String str, int i, int i2) {
        if (illegalStateException.getMessage() == null || !illegalStateException.getMessage().contains("Make sure the Cursor is initialized correctly before accessing data from it")) {
            throw illegalStateException;
        }
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append("illegal-state-exception/cursor count=");
        A0l.append(i);
        C626936e.A08(AnonymousClass000.A0Y("; partial list size=", A0l, i2), illegalStateException);
    }

    public static void A05(IllegalStateException illegalStateException, String str, AbstractCollection abstractCollection, int i) {
        A04(illegalStateException, str, i, abstractCollection.size());
    }

    public final int A06(C69833Yo r9, AnonymousClass3ZH r10, C85284Fq r11) {
        C626936e.A0C(r9.A01());
        C95814uZ r6 = r10.A0H;
        String A072 = C627336j.A07(r6);
        String[] strArr = new String[1];
        char A1W = AnonymousClass0x7.A1W(strArr, r10.A0F());
        AnonymousClass361.A08(r11, "wa_contacts", "_id = ?", strArr);
        String[] A1a = AnonymousClass0x7.A1a(A072, A1W);
        A1a[1] = A072;
        AnonymousClass361.A08(r11, "wa_contact_storage_usage", "jid = ? AND NOT EXISTS (SELECT 1 FROM wa_contacts WHERE jid = ?)", A1a);
        int i = 3;
        if (r6 instanceof C27991fJ) {
            i = 3 + A07(r9, r11, (C28011fL) r6, (C60912zN) null);
        }
        String[] strArr2 = new String[1];
        strArr2[A1W] = A072;
        AnonymousClass361.A08(r11, "wa_group_admin_settings", "jid = ?", strArr2);
        return i;
    }

    public final int A07(C69833Yo r8, C85284Fq r9, C28011fL r10, C60912zN r11) {
        String str;
        String str2;
        C626936e.A0C(r8.A01());
        if (r10 == null || (r10 instanceof AnonymousClass1fI) || (r10 instanceof C28001fK)) {
            return 0;
        }
        String rawString = r10.getRawString();
        C626936e.A06(rawString);
        if (r11 == null || (str = r11.A04) == null) {
            AnonymousClass361.A08(r9, "wa_group_descriptions", "jid = ?", new String[]{rawString});
            return 1;
        }
        String str3 = r11.A03;
        if (str3 == null) {
            return 0;
        }
        AnonymousClass361.A08(r9, "wa_group_descriptions", "jid = ?", new String[]{rawString});
        ContentValues A072 = AnonymousClass0x9.A07(5);
        A072.put("jid", rawString);
        A072.put("description", str3);
        A072.put("description_id_string", str);
        A072.put("description_time", Long.valueOf(r11.A00));
        UserJid userJid = r11.A02;
        if (userJid != null) {
            str2 = userJid.getRawString();
        } else {
            str2 = "";
        }
        A072.put("description_setter_jid", str2);
        AnonymousClass361.A06(A072, r9, "wa_group_descriptions");
        return 2;
    }

    public final int A08(Collection collection) {
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            if (A0R != null && A0R.A10 && A0R.A0F != null && !C56972sr.A08(this.A03, A0R)) {
                i++;
            }
        }
        return i;
    }

    public Cursor A09() {
        AnonymousClass4GK A032 = C18630y0.A03(this);
        try {
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18280x3.A0v(C135166kE.A00, A1Y);
            Cursor A0A2 = AnonymousClass361.A0A(A032, "SELECT jid, conversation_size, conversation_message_count FROM wa_contact_storage_usage WHERE jid != ? ORDER BY conversation_size DESC, conversation_message_count DESC", "CONTACT_STORAGE_USAGES", A1Y);
            A032.close();
            return A0A2;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public ArrayList A0C() {
        Cursor A092;
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        try {
            AnonymousClass4GK A032 = C18630y0.A03(this);
            try {
                A092 = AnonymousClass361.A09(A032, C58142um.A01, "GET_ALL_GROUP_CHATS");
                i = A092.getCount();
                while (A092.moveToNext()) {
                    AnonymousClass3ZH A003 = AnonymousClass25S.A00(A092);
                    if (A003.A0H != null) {
                        A0s.add(A003);
                    }
                }
                A092.close();
                A032.close();
            } catch (Throwable th) {
                A032.close();
                throw th;
            }
        } catch (IllegalStateException e) {
            A05(e, "contactmanagerdb/getAllGroupChats/", A0s, i);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A19("returned ", A0o, A0s);
        AnonymousClass33M.A04(A002, " group chats | time: ", A0o);
        return A0s;
        throw th;
    }

    public ArrayList A0D(C95814uZ r8) {
        Cursor A0A2;
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        try {
            AnonymousClass4GK A032 = C18630y0.A03(this);
            try {
                String str = C58142um.A04;
                String[] A1Y = AnonymousClass0x9.A1Y();
                C18280x3.A0w(r8, A1Y, 0);
                A0A2 = AnonymousClass361.A0A(A032, str, "GET_CONTACTS_BY_JID", A1Y);
                i = A0A2.getCount();
                while (A0A2.moveToNext()) {
                    AnonymousClass3ZH A003 = AnonymousClass25S.A00(A0A2);
                    if (A003.A0H != null) {
                        A0s.add(A003);
                    }
                }
                A0A2.close();
                A032.close();
                A0S(A0s);
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A19("fetched ", A0o, A0s);
                A0o.append(" contacts by jid=");
                A0o.append(r8);
                AnonymousClass33M.A04(A002, " | time: ", A0o);
                return A0s;
            } catch (Throwable th) {
                A032.close();
                throw th;
            }
            throw th;
        } catch (IllegalStateException e) {
            A05(e, "contactmanagerdb/getContactsByJid/", A0s, i);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public List A0E() {
        int count;
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A032 = C18630y0.A03(this);
        try {
            Cursor A092 = AnonymousClass361.A09(A032, C58142um.A00, "GET_ALL_DB_CONTACTS_FOR_SYNC");
            try {
                count = A092.getCount();
                while (A092.moveToNext()) {
                    AnonymousClass3ZH A003 = AnonymousClass25S.A00(A092);
                    if (A0V(A003)) {
                        A0s.add(A003);
                    }
                }
            } catch (IllegalStateException e) {
                A05(e, "contactmanagerdb/getAllDBContactsForSync/", A0s, count);
            } catch (Throwable th) {
                if (A092 != null) {
                    A092.close();
                }
                throw th;
            }
            A092.close();
            StringBuilder A0f = C18280x3.A0f(A032);
            C18260x0.A19("returned ", A0f, A0s);
            AnonymousClass33M.A04(A002, " db contacts for sync | time: ", A0f);
            return A0s;
        } catch (Throwable th2) {
            try {
                A032.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public final List A0F(boolean z) {
        String str;
        C18260x0.A1D("contactmanagerdb/getSideListContacts isSynced=", AnonymousClass001.A0o(), z);
        ArrayList A0s = AnonymousClass001.A0s();
        String A072 = C627336j.A07(C56972sr.A04(this.A03));
        String[] A1Z = AnonymousClass0x9.A1Z();
        if (A072 == null) {
            A072 = C135206kI.A00.getRawString();
        }
        A1Z[0] = A072;
        C18310x6.A1D(C135216kJ.A00, A1Z);
        AnonymousClass4GK A032 = C18630y0.A03(this);
        try {
            StringBuilder A0h = AnonymousClass0x2.A0h();
            AnonymousClass0x2.A1O(A0h, C66223Kn.A00);
            AnonymousClass0x2.A1P(A0h, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
            String A0p = C18310x6.A0p("is_whatsapp_user = 1", A0h);
            A0h.append("wa_contacts.jid != 'broadcast'");
            A0h.append(A0p);
            A0h.append("wa_contacts.jid IS NOT NULL");
            A0h.append(A0p);
            A0h.append("wa_contacts.jid NOT LIKE '%@broadcast'");
            A0h.append(A0p);
            A0h.append("wa_contacts.jid NOT LIKE '%@g.us'");
            A0h.append(A0p);
            A0h.append("wa_contacts.jid NOT LIKE '%@temp'");
            A0h.append(A0p);
            A0h.append("wa_contacts.jid != ?");
            A0h.append(A0p);
            A0h.append("wa_contacts.jid != ?");
            A0h.append(" AND (");
            A0h.append("raw_contact_id IS NULL OR raw_contact_id< 0");
            A0h.append(") AND (");
            A0h.append("raw_contact_id");
            A0h.append(" != ");
            A0h.append(-5);
            String A0e = AnonymousClass000.A0e(A0h);
            StringBuilder A0o = AnonymousClass001.A0o();
            if (z) {
                A0o.append(A0e);
                str = " AND (is_sidelist_synced = 1)";
            } else {
                A0o.append(A0e);
                str = " AND (is_sidelist_synced = 0 OR is_sidelist_synced IS NULL)";
            }
            Cursor A0A2 = AnonymousClass361.A0A(A032, AnonymousClass000.A0X(str, A0o), "GET_SIDE_LIST_CONTACTS", A1Z);
            try {
                int count = A0A2.getCount();
                while (A0A2.moveToNext()) {
                    AnonymousClass3ZH A002 = AnonymousClass25S.A00(A0A2);
                    if (A002.A0H != null) {
                        A0s.add(A002);
                    }
                }
            } catch (IllegalStateException e) {
                A05(e, "contactmanagerdb/getSideListContacts/", A0s, 0);
            } catch (Throwable th) {
                if (A0A2 != null) {
                    A0A2.close();
                }
                throw th;
            }
            if (A0A2 != null) {
                A0A2.close();
            }
            C18260x0.A1A("contactmanagerdb/getSideListContacts loaded size=", C18280x3.A0f(A032), A0s);
            return A0s;
        } catch (Throwable th2) {
            try {
                A032.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public final void A0G(ContentValues contentValues, C95814uZ r8) {
        C85284Fq A072;
        try {
            A072 = C18630y0.A07(this);
            String[] A1Y = AnonymousClass0x9.A1Y();
            String A073 = C627336j.A07(r8);
            C626936e.A06(A073);
            A1Y[0] = A073;
            AnonymousClass361.A07(contentValues, A072, "wa_contacts", "jid = ?", A1Y);
            A072.close();
            return;
        } catch (IllegalArgumentException e) {
            C626936e.A08(AnonymousClass000.A0P(r8, "contact-mgr-db/unable to update contact by jid ", AnonymousClass001.A0o()), e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void A0H(C69833Yo r4, AnonymousClass3ZH r5, C85284Fq r6) {
        C626936e.A0C(r4.A01());
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        A06(r4, r5, r6);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("contact-mgr-db/delete contact ");
        A0o.append(r5);
        AnonymousClass33M.A04(A002, " | time : ", A0o);
    }

    public void A0J(AnonymousClass3ZS r11) {
        C69833Yo Axl;
        try {
            C85284Fq A072 = C18630y0.A07(this);
            try {
                Axl = A072.Axl();
                String rawString = r11.A01().getRawString();
                ContentValues A062 = AnonymousClass0x9.A06();
                C18270x1.A0c(A062, "conversation_size", r11.A00.A0I);
                C18270x1.A0b(A062, "conversation_message_count", r11.A00.A06);
                if (AnonymousClass361.A07(A062, A072, "wa_contact_storage_usage", "jid = ?", C18270x1.A1b(rawString)) == 0) {
                    A062.put("jid", rawString);
                    AnonymousClass361.A0B(A062, A072, "wa_contact_storage_usage");
                }
                Axl.A00();
                Axl.close();
                A072.close();
                return;
            } catch (Throwable th) {
                A072.close();
                throw th;
            }
            throw th;
        } catch (IllegalArgumentException e) {
            C626936e.A08("contact-mgr-db/unable to update batch on storage usage table", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A0K(AnonymousClass3ZH r8) {
        C85284Fq A072;
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        try {
            A072 = C18630y0.A07(this);
            ContentValues A073 = AnonymousClass0x9.A07(6);
            C18270x1.A0c(A073, "raw_contact_id", -4);
            AnonymousClass3ZH.A0B(A073, r8);
            AnonymousClass3ZH.A0A(A073, r8);
            A073.put("is_whatsapp_user", Boolean.TRUE);
            A073.put("wa_name", r8.A0b);
            String[] A1Y = AnonymousClass0x9.A1Y();
            C95814uZ r0 = r8.A0H;
            C626936e.A06(r0);
            C18280x3.A0v(r0, A1Y);
            AnonymousClass361.A07(A073, A072, "wa_contacts", "jid = ?", A1Y);
            A072.close();
        } catch (IllegalArgumentException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass3ZH.A0C(r8, "contact-mgr-db/unable to update contact ", A0o);
            C626936e.A08(A0o.toString(), e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        StringBuilder A003 = C28831hq.A00(this, r8);
        AnonymousClass3ZH.A0C(r8, "contact-mgr-db/updated contact jid=", A003);
        AnonymousClass33M.A04(A002, " | time: ", A003);
        return;
        throw th;
    }

    public void A0L(AnonymousClass3ZH r6) {
        C85284Fq A072;
        String str;
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        C95814uZ r2 = r6.A0H;
        if (r2 == null) {
            str = "contact-mgr-db/unable to add unknown contact with null jid";
        } else {
            C56972sr r1 = this.A03;
            if (C56972sr.A04(r1) == null) {
                str = "contact-mgr-db/unable to add unknown contact due to null me record";
            } else if (r6.A0U() || !r1.A0a(r2)) {
                ContentValues A062 = C18300x5.A06();
                AnonymousClass0x2.A0n(A062, r2, "jid");
                A062.put("is_whatsapp_user", Boolean.TRUE);
                A062.put("status", r6.A0X);
                A062.put("status_timestamp", Long.valueOf(r6.A0D));
                A062.put("status_emoji", r6.A0Y);
                try {
                    A072 = C18630y0.A07(this);
                    r6.A0N(AnonymousClass361.A06(A062, A072, "wa_contacts"));
                    A072.close();
                    StringBuilder A003 = C28831hq.A00(this, r6);
                    A003.append("contact-mgr-db/unknown contact added");
                    A003.append("");
                    AnonymousClass33M.A04(A002, " | time: ", A003);
                    return;
                } catch (IllegalArgumentException e) {
                    C626936e.A08(AnonymousClass000.A0P(r6, "contact-mgr-db/unable to add unknown contact ", AnonymousClass001.A0o()), e);
                    return;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                Log.i("contact-mgr-db/unable to add unknown contact due to matching jid prefix");
                return;
            }
        }
        Log.w(str);
        return;
        throw th;
    }

    public void A0M(AnonymousClass3ZH r5) {
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        ContentValues A072 = AnonymousClass0x9.A07(5);
        A072.put("display_name", r5.A0J());
        A072.put("phone_label", r5.A0V);
        A072.put("is_whatsapp_user", Boolean.valueOf(r5.A10));
        A072.put("history_sync_initial_phash", r5.A0S);
        A0G(A072, r5.A0H);
        A0O(r5, (C28011fL) AnonymousClass3ZH.A04(r5));
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass3ZH.A0C(r5, "updated group info for jid=", A0o);
        A0o.append(" | time: ");
        C18260x0.A1I(A0o, A002.A06());
        A00(this).A08(Collections.singleton(r5));
    }

    public final void A0N(AnonymousClass3ZH r4) {
        C69833Yo Axl;
        C85284Fq A072 = C18630y0.A07(this);
        try {
            Axl = A072.Axl();
            A0H(Axl, r4, A072);
            Axl.A00();
            Axl.close();
            A072.close();
            return;
        } catch (Throwable th) {
            try {
                A072.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        throw th;
    }

    public final void A0P(AnonymousClass3ZH r10, Locale locale) {
        Cursor A0A2;
        if (r10.A0V()) {
            String language = locale.getLanguage();
            String country = locale.getCountry();
            C95814uZ r0 = r10.A0H;
            AnonymousClass4GK A032 = C18630y0.A03(this);
            try {
                String[] A1Z = AnonymousClass0x9.A1Z();
                String A072 = C627336j.A07(r0);
                C626936e.A06(A072);
                AnonymousClass000.A16(A072, language, A1Z);
                A0A2 = AnonymousClass361.A0A(A032, "SELECT lc, verified_name FROM wa_vnames_localized WHERE jid = ? AND lg = ?", "CONTACT_VNAMES_LOCALIZED", A1Z);
                int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("lc");
                int columnIndexOrThrow2 = A0A2.getColumnIndexOrThrow("verified_name");
                String str = null;
                while (true) {
                    if (!A0A2.moveToNext()) {
                        break;
                    }
                    String string = A0A2.getString(columnIndexOrThrow);
                    String string2 = A0A2.getString(columnIndexOrThrow2);
                    if (TextUtils.isEmpty(string)) {
                        str = string2;
                    } else if (string.equals(country)) {
                        str = string2;
                        break;
                    }
                }
                if (str != null) {
                    if (r10 instanceof AnonymousClass1RT) {
                        C626936e.A0D(false, "Setting verified name for ServerContact not allowed");
                    } else {
                        r10.A0a = str;
                    }
                }
                r10.A0c = locale;
                A0A2.close();
                A032.close();
                return;
            } catch (Throwable th) {
                try {
                    A032.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            return;
        }
        throw th;
    }

    public void A0Q(UserJid userJid, String str, long j) {
        C85284Fq A072;
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        ContentValues A092 = C18280x3.A09();
        A092.put("status", str);
        C18270x1.A0c(A092, "status_timestamp", j);
        boolean z = true;
        try {
            A072 = C18630y0.A07(this);
            String[] strArr = new String[1];
            C18280x3.A0w(userJid, strArr, 0);
            AnonymousClass361.A07(A092, A072, "wa_contacts", "jid = ?", strArr);
            A072.close();
        } catch (IllegalArgumentException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("contact-mgr-db/unable to update contact status ");
            A0o.append(userJid);
            A0o.append(", statusNull=");
            if (str != null) {
                z = false;
            }
            C626936e.A08(C18300x5.A0m(A0o, z), e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("contact-mgr-db/updated contact status jid=");
        A0o2.append(userJid);
        AnonymousClass33M.A04(A002, " | time: ", A0o2);
        return;
        throw th;
    }

    public void A0T(List list) {
        C69833Yo Axl;
        ContentValues A062 = AnonymousClass0x9.A06();
        try {
            C85284Fq A072 = C18630y0.A07(this);
            try {
                Axl = A072.Axl();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C95814uZ A0P = C18300x5.A0P(it);
                    if (A0P != null) {
                        AnonymousClass0x2.A0n(A062, A0P, "jid");
                        A062.put("conversation_size", 0);
                        A062.put("conversation_message_count", 0);
                        AnonymousClass361.A0B(A062, A072, "wa_contact_storage_usage");
                    }
                }
                Axl.A00();
                Axl.close();
                A072.close();
                return;
            } catch (Throwable th) {
                A072.close();
                throw th;
            }
            throw th;
        } catch (IllegalArgumentException e) {
            C626936e.A08("contact-mgr-db/unable to insert batch to storage usage table", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }
}
