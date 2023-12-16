package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9ao  reason: invalid class name and case insensitive filesystem */
public class C196419ao implements C182168ny {
    public HashSet A00 = AnonymousClass002.A0K();
    public HashSet A01 = AnonymousClass002.A0K();
    public List A02 = AnonymousClass001.A0s();
    public final C69263Wi A03;
    public final C56972sr A04;
    public final AnonymousClass9U4 A05;
    public final AnonymousClass9b0 A06;

    public static /* synthetic */ void A00(C202669mO r1, C196419ao r2, String str) {
        r2.A00.add(str);
        r2.A01.remove(str);
        if (r1 != null) {
            r1.BQa(str);
        }
        List<Reference> list = r2.A02;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((Reference) list.get(size)).get() == null) {
                list.remove(size);
            }
        }
        for (Reference reference : list) {
            C202669mO r0 = (C202669mO) reference.get();
            if (r0 != null) {
                r0.BQa(str);
            }
        }
    }

    public void A01() {
        this.A00.clear();
    }

    public void A02(C202669mO r3) {
        this.A02.add(AnonymousClass0x9.A14(r3));
    }

    public void A03(C202669mO r4) {
        List list = this.A02;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                Object obj = ((Reference) list.get(size)).get();
                if (obj == null || obj == r4) {
                    list.remove(size);
                }
            } else {
                return;
            }
        }
    }

    public void A05(C624134x r4) {
        C624034w r2 = r4.A0P;
        if (r2 != null && r2.A0K != null && r2.A03 == 1000) {
            C56972sr r1 = this.A04;
            if (!r1.A0a(r2.A0D) && !r1.A0a(r4.A0P.A0E)) {
                this.A00.remove(r4.A0P.A0K);
                A06(r4.A1J, r4.A0P.A0K);
            }
        }
    }

    public final void A06(AnonymousClass2z0 r16, String str) {
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            AnonymousClass2z0 r7 = r16;
            if (r16 != null) {
                C95814uZ r3 = r7.A00;
                if (C627336j.A0K(r3)) {
                    HashSet hashSet = this.A01;
                    if (!hashSet.contains(str2) && !this.A00.contains(str2)) {
                        hashSet.add(str2);
                        AnonymousClass9b0 r6 = this.A06;
                        AnonymousClass9bJ r5 = new AnonymousClass9bJ(this, str2);
                        AnonymousClass39V[] r2 = new AnonymousClass39V[3];
                        AnonymousClass39V.A04("action", "get-missing-group-transaction-details", r2);
                        AnonymousClass39V.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2, r2);
                        r2[2] = new AnonymousClass39V((Jid) r3, "group");
                        AnonymousClass36K A0U = C1899693i.A0U(r2);
                        r6.A07.A0G(new C203909oV(r6.A01.A00, r6.A04, r6.A00, r5, r6, r7, 5), A0U, "get", 0);
                    }
                }
            }
        }
    }

    public void BYb(C624134x r4) {
        C624034w r2;
        if (r4 != null && (r2 = r4.A0P) != null && r2.A03 == 1000) {
            C56972sr r1 = this.A04;
            if (r1.A0a(r2.A0D) || r1.A0a(r4.A0P.A0E)) {
                String str = r4.A0P.A0K;
                if (!TextUtils.isEmpty(str)) {
                    A04((C202669mO) null, C18300x5.A0s(str));
                    return;
                }
                return;
            }
            A06(r4.A1J, r4.A0P.A0K);
        }
    }

    public C196419ao(C69263Wi r2, C56972sr r3, AnonymousClass9U4 r4, AnonymousClass9b0 r5) {
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r5;
    }

    public final void A04(C202669mO r7, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            HashSet hashSet = this.A01;
            if (!hashSet.contains(A0m) && !this.A00.contains(A0m)) {
                hashSet.add(A0m);
                AnonymousClass9b0 r3 = this.A06;
                r3.A00(new AnonymousClass9bK(r7, this, A0m), r3.A08.A0G(), A0m, true);
            }
        }
    }

    public void A07(List list) {
        AnonymousClass1S4 r0;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624034w A0E = C1899693i.A0E(it);
            if ((A0E.A03 == 1000 && !TextUtils.isEmpty(A0E.A0K)) || ((r0 = A0E.A0A) != null && r0.A0d())) {
                A0s.add(A0E.A0K);
            }
        }
        if (!A0s.isEmpty()) {
            A04((C202669mO) null, A0s);
        }
    }

    public boolean A08(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.A00.contains(str);
    }
}
