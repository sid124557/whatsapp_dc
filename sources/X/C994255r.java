package X;

import com.whatsapp.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.55r  reason: invalid class name and case insensitive filesystem */
public abstract class C994255r extends AnonymousClass5ZM {
    public final C56972sr A00;
    public final C64773Ex A01;
    public final C56422rx A02;
    public final AnonymousClass5ZU A03;
    public final C620733j A04;
    public final String A05;
    public final WeakReference A06;
    public final ArrayList A07;
    public final HashSet A08;
    public final List A09;
    public final List A0A;
    public final List A0B;
    public final Set A0C;

    public boolean A0O(AnonymousClass3ZH r6) {
        C91874lI r1 = (C91874lI) this;
        if (!r1.A0R) {
            return true;
        }
        if (!r1.A0d && !r1.A0f && !r1.A0Z && !r1.A0T) {
            return true;
        }
        UserJid A072 = AnonymousClass3ZH.A07(r6);
        if (C615031a.A02(r1.A08, A072) || !new C623134n(r1.A02, (C48952fk) null, A072).A02()) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass7HS r3 = (AnonymousClass7HS) obj;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A06.get();
        if (contactPickerFragment != null && contactPickerFragment.A16()) {
            contactPickerFragment.A16 = null;
            contactPickerFragment.A1q(r3);
        }
    }

    public String A0H(ContactPickerFragment contactPickerFragment) {
        if (this instanceof C91874lI) {
            C91874lI r4 = (C91874lI) this;
            if (r4.A07 != null) {
                return AnonymousClass0x7.A0n(contactPickerFragment, r4.A05, AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
            }
            boolean z = r4.A0e;
            int i = R.string.f11nameremoved;
            if (z) {
                i = R.string.f11nameremoved;
            }
            return C08310eF.A09(contactPickerFragment).getString(i);
        } else if (this.A07 == null) {
            return C08310eF.A09(contactPickerFragment).getString(R.string.f11nameremoved);
        } else {
            return AnonymousClass0x7.A0n(contactPickerFragment, this.A05, AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
        }
    }

    public void A0I(ArrayList arrayList) {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A06.get();
        if (contactPickerFragment != null && contactPickerFragment.A16()) {
            arrayList.add(new AnonymousClass8Fr(A0H(contactPickerFragment)));
        }
    }

    public void A0J(ArrayList arrayList, List list, int i, boolean z) {
        C08310eF r1 = (C08310eF) this.A06.get();
        if (r1 != null && r1.A16() && !list.isEmpty()) {
            if (!z) {
                C91874lI.A00(r1, arrayList, i);
            }
            AnonymousClass1RR A012 = C56972sr.A01(this.A00);
            if (A012 != null && A0N() && !list.isEmpty() && list.remove(A012)) {
                list.add(0, A012);
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C171078Fq(C18310x6.A0R(it)));
        }
    }

    public void A0K(ArrayList arrayList, List list, List list2, List list3, List list4, List list5) {
        AnonymousClass1RR A012;
        C08310eF r1 = (C08310eF) this.A06.get();
        if (r1 != null && r1.A16()) {
            if ((!list.isEmpty() || !list2.isEmpty() || !list3.isEmpty() || !list4.isEmpty()) && !list5.isEmpty()) {
                C91874lI.A00(r1, arrayList, A0G());
                if (A0N() && (A012 = C56972sr.A01(this.A00)) != null && !list.contains(A012) && !list2.contains(A012)) {
                    arrayList.add(new C171078Fq(A012));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0M() {
        /*
            r4 = this;
            java.util.HashSet r1 = r4.A08
            boolean r0 = r1.isEmpty()
            r3 = 1
            if (r0 != 0) goto L_0x0021
            java.util.Iterator r2 = r1.iterator()
        L_0x000d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0021
            int r1 = X.C18280x3.A05(r2)
            r0 = 42
            if (r1 == r0) goto L_0x001f
            r0 = 43
            if (r1 != r0) goto L_0x000d
        L_0x001f:
            r0 = 0
            return r0
        L_0x0021:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C994255r.A0M():boolean");
    }

    public boolean A0N() {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A06.get();
        if (contactPickerFragment != null && (contactPickerFragment.A3Y || contactPickerFragment.A3V || contactPickerFragment.A3d)) {
            AnonymousClass1VX r1 = contactPickerFragment.A1x;
            if (!C86644Kx.A1Z(r1) || !r1.A0X(2630)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C994255r(C56972sr r2, C64773Ex r3, C56422rx r4, AnonymousClass5ZU r5, ContactPickerFragment contactPickerFragment, C620733j r7, String str, HashSet hashSet, List list, List list2, List list3, List list4, Set set) {
        ArrayList arrayList;
        this.A06 = AnonymousClass0x9.A14(contactPickerFragment);
        this.A09 = list2;
        this.A0A = list3;
        this.A0B = list4;
        if (list != null) {
            arrayList = AnonymousClass002.A0J(list);
        } else {
            arrayList = null;
        }
        this.A07 = arrayList;
        this.A05 = str;
        this.A08 = hashSet;
        this.A0C = set;
        this.A00 = r2;
        this.A04 = r7;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }

    public static void A01(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C171078Fq(C18310x6.A0R(it)));
        }
        list.size();
        arrayList.size();
    }

    public void A0L(List list, List list2, Set set, Set set2, boolean z) {
        C95814uZ r2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            if (A0R != null && (r2 = A0R.A0H) != null && !set.contains(r2) && !set2.contains(r2) && A0R.A10 && AnonymousClass5ZU.A04(this.A03, A0R, this.A07)) {
                C95814uZ r1 = A0R.A0H;
                if (C627336j.A0I(r1) && !(r1 instanceof C135216kJ)) {
                    set.add(r2);
                    if (A0P(A0R, z)) {
                        list2.add(A0R);
                    } else {
                        set2.add(r2);
                    }
                }
            }
        }
    }

    public boolean A0P(AnonymousClass3ZH r3, boolean z) {
        UserJid A072;
        if (r3.A0U()) {
            A072 = r3.A0I;
        } else {
            A072 = AnonymousClass3ZH.A07(r3);
        }
        if ((z || A072 == null || !this.A02.A03(A072)) && A0O(r3)) {
            return true;
        }
        return false;
    }

    public int A0G() {
        return R.string.f11nameremoved;
    }
}
