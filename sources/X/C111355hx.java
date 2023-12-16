package X;

import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5hx  reason: invalid class name and case insensitive filesystem */
public class C111355hx implements AnonymousClass4FU {
    public final AnonymousClass1FB A00;

    public static AnonymousClass0R8 A00(ContactPickerFragment contactPickerFragment) {
        return contactPickerFragment.A19.A00.getSupportActionBar();
    }

    public static void A01(ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A19.A02();
    }

    public void A02() {
        String str;
        List list;
        CallInfo A7D;
        UserJid A08;
        if (this instanceof C91894lM) {
            C91894lM r0 = (C91894lM) this;
            VoipActivityV2 voipActivityV2 = r0.A01;
            voipActivityV2.A7K();
            Intent intent = r0.A00;
            boolean A0X = voipActivityV2.A0D.A0X(5411);
            List list2 = null;
            if (intent != null) {
                if (!A0X) {
                    String stringExtra = intent.getStringExtra("contact");
                    if (!(stringExtra == null || (A08 = AnonymousClass32Y.A08(stringExtra)) == null)) {
                        list = C18290x4.A12(A08);
                    }
                } else {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("jids");
                    if (stringArrayListExtra != null) {
                        ArrayList A0s = AnonymousClass001.A0s();
                        Iterator<String> it = stringArrayListExtra.iterator();
                        while (it.hasNext()) {
                            UserJid A082 = AnonymousClass32Y.A08(AnonymousClass001.A0m(it));
                            if (A082 != null) {
                                A0s.add(A082);
                            }
                        }
                        list = A0s;
                    }
                }
                boolean isEmpty = list.isEmpty();
                list2 = list;
                if (!isEmpty) {
                    if (!A0X) {
                        C626936e.A0D(AnonymousClass001.A1T(list.size()), "You can't invite more than one user when multiselect is off");
                        AnonymousClass4SG.A3k((UserJid) list.get(0), voipActivityV2, false);
                        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = voipActivityV2.A1t;
                        if (voipCallControlBottomSheetV2 != null) {
                            UserJid userJid = (UserJid) list.get(0);
                            AnonymousClass4WF r02 = voipCallControlBottomSheetV2.A0O;
                            if (r02 != null) {
                                r02.A0O(userJid);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!list.isEmpty() && voipActivityV2.A16 != null && (A7D = voipActivityV2.A7D()) != null && A7D.callState != CallState.NONE) {
                        if (voipActivityV2.A0D.A0X(5633)) {
                            C107285b3 r4 = voipActivityV2.A16;
                            C626936e.A0D(!list.isEmpty(), "voip/invite: Empty list of peers to invite");
                            r4.A13.execute(new C71643cR(r4, list, A7D, 5, false));
                            return;
                        }
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            voipActivityV2.A16.A0Y(C18310x6.A0T(it2), A7D, false);
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("VoipActivityV2/handlePickerDismiss/");
            if (list2 == null) {
                str = "null";
            } else {
                str = "empty";
            }
            A0o.append(str);
            C18260x0.A1M(A0o, " user list");
            return;
        }
        this.A00.finish();
    }

    public void A03(Intent intent) {
        if (this instanceof C91894lM) {
            ((C91894lM) this).A00 = intent;
        } else {
            this.A00.setResult(-1, intent);
        }
    }

    public boolean BHW() {
        return this.A00.BHW();
    }

    public void BjL() {
        this.A00.BjL();
    }

    public void Bon(DialogFragment dialogFragment, String str) {
        this.A00.Bon(dialogFragment, str);
    }

    public void Boo(DialogFragment dialogFragment) {
        this.A00.Boo(dialogFragment);
    }

    public void Bot(int i) {
        this.A00.Bot(i);
    }

    public void Bou(String str) {
        this.A00.Bou(str);
    }

    public void Bov(String str, String str2) {
        this.A00.Bov(str, str2);
    }

    public void Bow(C181548mw r7, Object[] objArr, int i, int i2, int i3) {
        this.A00.Bow(r7, objArr, i, i2, i3);
    }

    public void Box(Object[] objArr, int i, int i2) {
        this.A00.Box(objArr, i, i2);
    }

    public void BpA(int i, int i2) {
        this.A00.BpA(i, i2);
    }

    public void Bru(String str) {
        this.A00.Bru(str);
    }

    public C111355hx(AnonymousClass1FB r1) {
        this.A00 = r1;
    }
}
