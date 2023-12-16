package X;

import com.whatsapp.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1te  reason: invalid class name and case insensitive filesystem */
public class C33761te extends AnonymousClass5ZM {
    public final C64773Ex A00;
    public final C64223Cq A01;
    public final AnonymousClass314 A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass304 r5 = (AnonymousClass304) obj;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A03.get();
        if (contactPickerFragment != null && contactPickerFragment.A16()) {
            contactPickerFragment.A19.A00.A5n(false);
            Log.d("contactpicker/finish_sync_all_in_contactpicker");
            contactPickerFragment.A1d();
            int i = r5.A00;
            if (i == 0) {
                contactPickerFragment.A19.Bot(R.string.f11nameremoved);
            } else if (i == 1 || i == 2 || i == 3) {
                if (contactPickerFragment.A0v.A00()) {
                    C88694ab r0 = contactPickerFragment.A0Q;
                    if (r0 == null || !r0.A0B()) {
                        contactPickerFragment.A0a.A0H(R.string.f11nameremoved, 0);
                    }
                }
            } else if (i == 4 || i == 6) {
                contactPickerFragment.A19.Bot(R.string.f11nameremoved);
                contactPickerFragment.A1K.A06();
            }
        }
    }

    public final void A0G() {
        List A05 = this.A02.A05();
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            if (this.A00.A0A(A0P).A0F != null || !(A0P instanceof UserJid)) {
                C18260x0.A1P(AnonymousClass001.A0o(), "contactpicker/missingnames/skip/jid ", A0P);
            } else {
                C18260x0.A1P(AnonymousClass001.A0o(), "contactpicker/missingnames/jid ", A0P);
                A0s.add(A0P);
            }
        }
        C18260x0.A1A("contactpicker/missingnames/count ", AnonymousClass001.A0o(), A0s);
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            C95814uZ A0P2 = C18300x5.A0P(it2);
            Iterator it3 = this.A00.A05.A0D(A0P2).iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("contactpicker/missingnames/");
                A0o.append(A0P2);
                C18260x0.A1P(A0o, "/", next);
            }
        }
        if (A0s.size() > 0) {
            Object A0t = AnonymousClass0x9.A0t(A0s);
            ArrayList A0E = this.A00.A0E();
            Iterator it4 = A0E.iterator();
            while (it4.hasNext()) {
                AnonymousClass3ZH A0R = C18310x6.A0R(it4);
                C95814uZ r0 = A0R.A0H;
                if (r0 != null && r0.equals(A0t)) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    C18260x0.A1J(A0o2, C18300x5.A0k(A0R, "contactpicker/firstmissingjid ", A0o2));
                }
            }
            A0E.clear();
        }
    }

    public C33761te(C64773Ex r2, ContactPickerFragment contactPickerFragment, C64223Cq r4, AnonymousClass314 r5) {
        this.A03 = AnonymousClass0x9.A14(contactPickerFragment);
        this.A00 = r2;
        this.A01 = r4;
        this.A02 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        A0G();
        C60982zU r1 = new C60982zU(AnonymousClass227.A0B);
        r1.A00 = C59812xW.A0C;
        r1.A02 = true;
        AnonymousClass304 A012 = this.A01.A01(r1.A02());
        A0G();
        return A012;
    }
}
