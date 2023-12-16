package X;

import android.util.Pair;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.990  reason: invalid class name */
public class AnonymousClass990 extends AnonymousClass54P {
    public final C29441ip A00;
    public final C64773Ex A01;
    public final C66413Li A02;
    public final AnonymousClass31C A03;
    public final List A04;

    public AnonymousClass990(C29441ip r1, C64773Ex r2, ContactPickerFragment contactPickerFragment, C66413Li r4, AnonymousClass31C r5, List list) {
        super(contactPickerFragment);
        this.A04 = list;
        this.A03 = r5;
        this.A01 = r2;
        this.A02 = r4;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PaymentMerchantListQueryContactsTask/querying contacts ");
        List list = this.A04;
        C18260x0.A1F(A0o, list.size());
        AnonymousClass5L3 r7 = new AnonymousClass5L3((C60122y2) null, AnonymousClass001.A0s(), AnonymousClass001.A0s(), (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Set) null);
        if (!this.A00.A0F()) {
            Log.d("PaymentMerchantListQueryContactsTask/doInBackground no n/w");
        } else {
            try {
                this.A03.A08(32000);
                Pair A012 = this.A02.A01(AnonymousClass227.A0D, list);
                int i = ((AnonymousClass304) A012.first).A00;
                if (i == 3 || i == 2) {
                    HashMap A0t = AnonymousClass001.A0t();
                    AnonymousClass2UJ[] r72 = (AnonymousClass2UJ[]) A012.second;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("PaymentMerchantListQueryContactsTask/doInBackground query success merchants: ");
                    C18260x0.A1F(A0o2, r6);
                    ArrayList A0s = AnonymousClass001.A0s();
                    for (AnonymousClass2UJ r0 : r72) {
                        UserJid userJid = r0.A0D;
                        if (userJid != null) {
                            AnonymousClass3ZH A0A = this.A01.A0A(userJid);
                            if (A0A.A0H != null) {
                                A0t.put(A0A.A0H.getRawString(), A0A);
                            }
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String A0m = AnonymousClass001.A0m(it);
                        try {
                            A0s.add(A0t.get(AnonymousClass32X.A00(A0m).getRawString()));
                        } catch (AnonymousClass24P unused) {
                            C18260x0.A0s("PaymentMerchantListQueryContactsTask/doInBackground unable to get phone num jid for contact: ", A0m, AnonymousClass001.A0o());
                        }
                    }
                    C18260x0.A1B("PaymentMerchantListQueryContactsTask/doInBackground query success merchants contacts: ", AnonymousClass001.A0o(), A0s);
                    return new AnonymousClass5L3((C60122y2) null, AnonymousClass001.A0s(), A0s, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Set) null);
                }
            } catch (C376223j unused2) {
            }
        }
        return r7;
    }
}
