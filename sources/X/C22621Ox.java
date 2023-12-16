package X;

import android.content.ContentValues;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Ox  reason: invalid class name and case insensitive filesystem */
public class C22621Ox extends C56822sc {
    public Runnable A00;
    public List A01 = AnonymousClass001.A0s();
    public final C56972sr A02;
    public final C64773Ex A03;
    public final AnonymousClass5ZU A04;
    public final C64223Cq A05;
    public final C55262q4 A06;
    public final C56612sH A07;
    public final C56892sj A08;
    public final C56662sM A09;
    public final C623934v A0A;
    public final AnonymousClass4FS A0B;

    public /* bridge */ /* synthetic */ void A0A(AnonymousClass33W r15, AnonymousClass33W r16) {
        C69833Yo Axl;
        C69833Yo Axl2;
        AnonymousClass1SN r152 = (AnonymousClass1SN) r15;
        C56972sr r2 = this.A02;
        if (r2.A0Y()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ContactMutationHandler/handleMutation handling jid = ");
            UserJid userJid = r152.A01;
            C18260x0.A0m(userJid, A0o);
            C60642yt r1 = r152.A05;
            if (r1 == C60642yt.A03) {
                Log.d("ContactMutationHandler/handleMutation SET operation");
                if (r2.A0a(userJid)) {
                    C55262q4 r0 = this.A06;
                    C18270x1.A0j(C55262q4.A00(r0), "self_contact_name", r152.A02);
                } else {
                    C64773Ex r22 = this.A03;
                    r22.A0A(userJid);
                    String str = r152.A03;
                    String str2 = r152.A02;
                    if (str.trim().length() == 0) {
                        String[] split = str2.split(" ");
                        if (split.length > 0) {
                            str = split[0];
                        } else {
                            str = "";
                        }
                    }
                    String str3 = userJid.user;
                    AnonymousClass3ZH A072 = r22.A07(userJid);
                    if (A072 != null) {
                        C34461vC r3 = r22.A05;
                        ContentValues A062 = C18300x5.A06();
                        A062.put("number", str3);
                        A062.put("raw_contact_id", -3L);
                        A062.put("given_name", str);
                        A062.put("display_name", str2);
                        r3.A0G(A062, A072.A0H);
                        C34461vC.A00(r3).A08(Collections.singleton(A072));
                    } else {
                        C18260x0.A1Q(AnonymousClass001.A0o(), "ContactManager/updateContactSyncd attempting to update contact that is not in db with jid=", userJid);
                    }
                    int A022 = C18280x3.A02(this.A06.A01(), "companion_syncd_critical_bootstrap_state");
                    if (!(A022 == 1 || A022 == 2)) {
                        synchronized (this) {
                            this.A01.add(userJid);
                            if (this.A00 == null) {
                                this.A00 = this.A0B.Bkn(C69963Zi.A00(this, 23), "ContactMutationHandler/syncNewContacts", 10000);
                            }
                        }
                    }
                }
            } else if (r1 == C60642yt.A02) {
                Log.d("ContactMutationHandler/handleMutation REMOVE operation");
                if (r2.A0a(userJid)) {
                    C18270x1.A0j(C55262q4.A00(this.A06), "self_contact_name", (String) null);
                } else {
                    C64773Ex r32 = this.A03;
                    AnonymousClass3ZH A073 = r32.A07(userJid);
                    if (A073 != null) {
                        C34461vC r7 = r32.A05;
                        ContentValues A0E = C18290x4.A0E();
                        A0E.put("raw_contact_id", AnonymousClass0x7.A0f());
                        A0E.put("given_name", (String) null);
                        A0E.put("display_name", (String) null);
                        boolean z = false;
                        try {
                            C85284Fq A074 = C18630y0.A07(r7);
                            try {
                                Axl = A074.Axl();
                                String[] A1Y = AnonymousClass0x9.A1Y();
                                AnonymousClass0x2.A1S(A1Y, 0, A073.A0F());
                                if (AnonymousClass361.A07(A0E, A074, "wa_contacts", "wa_contacts._id = ?", A1Y) == 1) {
                                    z = true;
                                }
                                Axl.A00();
                                Axl.close();
                                A074.close();
                            } catch (Throwable th) {
                                A074.close();
                                throw th;
                            }
                        } catch (IllegalArgumentException e) {
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            AnonymousClass3ZH.A0C(A073, "contact-mgr-db/unable to remove contact from syncd mutation ", A0o2);
                            C626936e.A08(A0o2.toString(), e);
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        A073.A0P = null;
                        A073.A0R = null;
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        A0o3.append("contact-mgr-db/removed contact from syncd mutation ");
                        C18260x0.A0m(A073.A0H, A0o3);
                        if (z) {
                            C34461vC.A00(r7).A09(Collections.singleton(A073));
                        }
                    } else {
                        C18260x0.A1Q(AnonymousClass001.A0o(), "ContactManager/removeContactSyncd attempting to remove contact that is not in db with jid=", userJid);
                    }
                    C48452ev.A00(r32, userJid);
                }
                C85284Fq A0C = this.A0A.A01.A0C();
                try {
                    Axl2 = A0C.Axl();
                    C623934v.A02(((AnonymousClass3H0) A0C).A03, AnonymousClass34E.A02(Collections.singleton(r152)));
                    Axl2.A00();
                    Axl2.close();
                    A0C.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        A0C.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } else {
                Log.e("ContactMutationHandler/handleMutation received undefined SyncD operation");
                return;
            }
        }
        A08(r152);
        return;
        throw th;
        throw th;
    }

    public List A0E(List list) {
        PhoneUserJid A042 = C56972sr.A04(this.A02);
        if (A042 == null) {
            Log.e("contact-mutation-handler/createBootstrapMutations me is null");
            return Collections.emptyList();
        }
        ArrayList A0s = AnonymousClass001.A0s();
        C64773Ex r2 = this.A03;
        r2.A0b(A0s);
        AnonymousClass3ZH A0B2 = r2.A0B(A042, false);
        if (A0B2 != null && r2.A05.A0V(A0B2) && !A0s.contains(A0B2)) {
            A0s.add(A0B2);
        }
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            UserJid A032 = AnonymousClass32Y.A03(A0R.A0H);
            if (A032 != null) {
                A0t.put(A032, A0R);
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        ArrayList A0s3 = AnonymousClass001.A0s();
        ArrayList A0s4 = AnonymousClass001.A0s();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AnonymousClass2NQ r22 = (AnonymousClass2NQ) it2.next();
            C95814uZ r8 = r22.A00.A06;
            if (r8 instanceof PhoneUserJid) {
                Log.i("contact-mutation-handler/createBootstrapMutations attempting to add jid from 1:1 chat");
                A00(r8, A042, A0s2, A0t);
            } else if (C627336j.A0K(r8)) {
                C18260x0.A1R(AnonymousClass001.A0o(), "contact-mutation-handler/createBootstrapMutations attempting to add jids that messaged in group or were mentioned: ", r8);
                Iterator it3 = r22.A02.iterator();
                while (it3.hasNext()) {
                    C624134x A0T = C18300x5.A0T(it3);
                    A00(A0T.A0n(), A042, A0s3, A0t);
                    Iterator it4 = C624435a.A02(UserJid.class, A0T.A18).iterator();
                    while (it4.hasNext()) {
                        A00(AnonymousClass0x7.A0S(it4), A042, A0s3, A0t);
                    }
                }
                C56892sj r1 = this.A08;
                GroupJid A002 = AnonymousClass32V.A00(r8);
                C626936e.A06(A002);
                C129526aS A033 = C56892sj.A01(r1, A002).A03();
                C18260x0.A1R(AnonymousClass001.A0o(), "contact-mutation-handler/createBootstrapMutations attempting to add all participant jids for group: ", r8);
                C172878Nf it5 = A033.iterator();
                while (it5.hasNext()) {
                    A00(AnonymousClass0x7.A0S(it5), A042, A0s4, A0t);
                }
            }
        }
        Collection[] collectionArr = new Collection[4];
        C18280x3.A19(A0s2, A0s3, collectionArr);
        collectionArr[2] = A0s4;
        List<Collection> A1A = AnonymousClass0x9.A1A(A0t.keySet(), collectionArr, 3);
        ArrayList A0s5 = AnonymousClass001.A0s();
        for (Collection addAll : A1A) {
            A0s5.addAll(addAll);
        }
        return A0D(C60642yt.A03, A0s5);
    }

    public C22621Ox(C56972sr r2, C64773Ex r3, AnonymousClass5ZU r4, C64223Cq r5, C55262q4 r6, C56612sH r7, C56892sj r8, C56662sM r9, C623934v r10, AnonymousClass4FS r11) {
        super(r10);
        this.A07 = r7;
        this.A02 = r2;
        this.A0B = r11;
        this.A03 = r3;
        this.A04 = r4;
        this.A09 = r9;
        this.A05 = r5;
        this.A0A = r10;
        this.A08 = r8;
        this.A06 = r6;
    }

    public static final void A00(Jid jid, UserJid userJid, List list, Map map) {
        UserJid A032 = AnonymousClass32Y.A03(jid);
        if (A032 != null && !userJid.equals(jid) && map.containsKey(A032)) {
            C18260x0.A1R(AnonymousClass001.A0o(), "contact-mutation-handler/populateJidList adding jid: ", A032);
            list.add(A032);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r5 == null) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0D(X.C60642yt r19, java.util.Collection r20) {
        /*
            r18 = this;
            java.util.HashSet r4 = X.AnonymousClass002.A0K()
            java.util.ArrayList r3 = X.C18300x5.A0u(r20)
            r2 = r18
            X.2sH r0 = r2.A07
            long r16 = r0.A0H()
            java.util.Iterator r7 = r20.iterator()
        L_0x0014:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x007b
            com.whatsapp.jid.UserJid r12 = X.C18310x6.A0T(r7)
            boolean r0 = r4.contains(r12)
            if (r0 != 0) goto L_0x0014
            X.2yt r6 = X.C60642yt.A03
            r9 = r19
            boolean r0 = r9.equals(r6)
            r14 = 0
            if (r0 == 0) goto L_0x0079
            X.3Ex r1 = r2.A03
            r0 = 1
            X.3ZH r5 = r1.A0B(r12, r0)
            if (r5 != 0) goto L_0x0050
        L_0x0038:
            boolean r0 = r9.equals(r6)
            if (r0 == 0) goto L_0x0050
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contact-sync-handler/create-contact-mutations given contact "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " doesn't exist in DB but should"
            X.C18260x0.A1K(r1, r0)
            goto L_0x0014
        L_0x0050:
            boolean r0 = r12 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0077
            X.2sM r1 = r2.A09
            r0 = r12
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0
            X.1fH r11 = r1.A01(r0)
        L_0x005d:
            if (r5 == 0) goto L_0x0075
            java.lang.String r14 = r5.A0R
            X.5ZU r0 = r2.A04
            java.lang.String r15 = r0.A0H(r5)
        L_0x0067:
            r10 = 0
            X.1SN r8 = new X.1SN
            r13 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r3.add(r8)
            r4.add(r12)
            goto L_0x0014
        L_0x0075:
            r15 = r14
            goto L_0x0067
        L_0x0077:
            r11 = r14
            goto L_0x005d
        L_0x0079:
            r5 = r14
            goto L_0x0038
        L_0x007b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22621Ox.A0D(X.2yt, java.util.Collection):java.util.List");
    }
}
