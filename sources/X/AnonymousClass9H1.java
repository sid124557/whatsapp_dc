package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9H1  reason: invalid class name */
public class AnonymousClass9H1 extends AnonymousClass5ZM {
    public final C29441ip A00;
    public final C64773Ex A01;
    public final C66413Li A02;
    public final AnonymousClass31C A03;
    public final WeakReference A04;
    public final List A05;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        if (!this.A00.A0F()) {
            return AnonymousClass0x9.A0C(AnonymousClass304.A04, (Object) null);
        }
        try {
            this.A03.A08(32000);
            return this.A02.A01(AnonymousClass227.A0D, this.A05);
        } catch (C376223j unused) {
            return AnonymousClass0x9.A0C(AnonymousClass304.A04, (Object) null);
        }
    }

    public void A09() {
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this.A04.get();
        if (indiaUpiPaymentSettingsFragment != null) {
            indiaUpiPaymentSettingsFragment.A1r(indiaUpiPaymentSettingsFragment.A0V);
        }
    }

    public void A0A() {
        this.A04.get();
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str;
        String str2;
        Pair pair = (Pair) obj;
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this.A04.get();
        if (indiaUpiPaymentSettingsFragment != null) {
            if (pair == null) {
                str2 = "handlecontactlesssync/fetchContactUsingNumbers/disconnected/";
            } else {
                int i = ((AnonymousClass304) pair.first).A00;
                if (i == 3 || i == 2) {
                    AnonymousClass2UJ[] r7 = (AnonymousClass2UJ[]) pair.second;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("handlecontactlesssync/onPostExecute query success merchants: ");
                    C18260x0.A1F(A0o, r3);
                    ArrayList A0s = AnonymousClass001.A0s();
                    HashMap A0t = AnonymousClass001.A0t();
                    for (AnonymousClass2UJ r0 : r7) {
                        UserJid userJid = r0.A0D;
                        if (userJid != null) {
                            AnonymousClass3ZH A0A = this.A01.A0A(userJid);
                            if (A0A.A0H != null) {
                                A0t.put(A0A.A0H.getRawString(), A0A);
                            }
                        }
                    }
                    Iterator it = this.A05.iterator();
                    while (it.hasNext()) {
                        String A0m = AnonymousClass001.A0m(it);
                        try {
                            A0s.add(A0t.get(AnonymousClass32X.A00(A0m).getRawString()));
                        } catch (AnonymousClass24P unused) {
                            C18260x0.A0s("handlecontactlesssync/onPostExecute unable to get phone num jid for contact: ", A0m, AnonymousClass001.A0o());
                        }
                    }
                    if (!A0s.isEmpty()) {
                        List list = indiaUpiPaymentSettingsFragment.A0V;
                        if (list == null) {
                            list = AnonymousClass001.A0s();
                            indiaUpiPaymentSettingsFragment.A0V = list;
                        }
                        list.addAll(A0s);
                    }
                } else {
                    if (i == 0) {
                        str = "handlecontactlesssync/fetchContactUsingNumbers/network-unavailable/";
                    } else if (i == 5) {
                        str = "handlecontactlesssync/fetchContactUsingNumbers/rateLimited/try-again-later/";
                    } else if (i == 4) {
                        str = "handlecontactlesssync/fetchContactUsingNumbers/try-again/";
                    } else if (i == 1) {
                        str2 = "handlecontactlesssync/fetchContactUsingNumbers/existing request ongoing/";
                    } else if (i == 6) {
                        str = "handlecontactlesssync/fetchContactUsingNumbers/exception-occurred/";
                    } else {
                        return;
                    }
                    Log.w(str);
                }
                indiaUpiPaymentSettingsFragment.A1r(indiaUpiPaymentSettingsFragment.A0V);
                return;
            }
            Log.w(str2);
        }
    }

    public AnonymousClass9H1(C29441ip r2, C64773Ex r3, C66413Li r4, AnonymousClass31C r5, IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment, List list) {
        this.A04 = AnonymousClass0x9.A14(indiaUpiPaymentSettingsFragment);
        this.A05 = list;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }
}
