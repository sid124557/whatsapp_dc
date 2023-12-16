package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment;
import com.whatsapp.contact.picker.SelectedListContactPickerFragment;
import com.whatsapp.contact.picker.VoipContactPickerFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4Wf  reason: invalid class name and case insensitive filesystem */
public final class C87814Wf extends AnonymousClass0R6 {
    public final List A00 = AnonymousClass001.A0s();
    public final /* synthetic */ SelectedListContactPickerFragment A01;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        return new AnonymousClass4YP(C18310x6.A0I(this.A01.A0I(), viewGroup, R.layout.f8nameremoved, false));
    }

    public C87814Wf(SelectedListContactPickerFragment selectedListContactPickerFragment) {
        this.A01 = selectedListContactPickerFragment;
    }

    public int A0G() {
        return this.A00.size();
    }

    public final void A0K(AnonymousClass3ZH r11) {
        C28011fL r1;
        Object obj;
        UserJid A03;
        List list = this.A00;
        int indexOf = list.indexOf(r11);
        if (indexOf > -1) {
            list.remove(indexOf);
            A08(indexOf);
        }
        if (list.isEmpty()) {
            SelectedListContactPickerFragment selectedListContactPickerFragment = this.A01;
            selectedListContactPickerFragment.A1W();
            selectedListContactPickerFragment.A2K(C08310eF.A09(selectedListContactPickerFragment).getDimensionPixelSize(R.dimen.f6nameremoved), 0);
        }
        SelectedListContactPickerFragment selectedListContactPickerFragment2 = this.A01;
        if (selectedListContactPickerFragment2 instanceof VoipContactPickerFragment) {
            VoipContactPickerFragment voipContactPickerFragment = (VoipContactPickerFragment) selectedListContactPickerFragment2;
            voipContactPickerFragment.A2O();
            C619532x A2N = voipContactPickerFragment.A2N();
            Jid A0M = AnonymousClass4L0.A0M(r11);
            if (A0M == null) {
                Log.e("VoipContactPickerFragment/deselected contact has no jid, skipping log");
            } else {
                A2N.A02.execute(new C71643cR(A2N, A0M, voipContactPickerFragment.A00, 13, C18320x8.A1U((CharSequence) voipContactPickerFragment.A3h.A07())));
            }
        } else if (selectedListContactPickerFragment2 instanceof AudienceSelectionContactPickerFragment) {
            AudienceSelectionContactPickerFragment audienceSelectionContactPickerFragment = (AudienceSelectionContactPickerFragment) selectedListContactPickerFragment2;
            if (list.isEmpty()) {
                audienceSelectionContactPickerFragment.A04.clear();
                audienceSelectionContactPickerFragment.A03.clear();
            } else {
                if (r11.A0U()) {
                    C95814uZ r12 = r11.A0H;
                    if ((r12 instanceof C28011fL) && (r1 = (C28011fL) r12) != null) {
                        C129526aS A04 = C56892sj.A01(audienceSelectionContactPickerFragment.A1i, r1).A04();
                        C162457s7.A0D(A04);
                        Iterator it = A04.iterator();
                        while (it.hasNext()) {
                            Map map = audienceSelectionContactPickerFragment.A03;
                            UserJid userJid = ((C60842zG) it.next()).A03;
                            if (map.containsKey(userJid)) {
                                Iterable iterable = (Iterable) map.get(userJid);
                                Object obj2 = null;
                                if (iterable != null) {
                                    obj = C73723fy.A01(iterable);
                                } else {
                                    obj = null;
                                }
                                Set set = (Set) map.get(userJid);
                                if (set != null) {
                                    set.remove(r11);
                                }
                                Iterable iterable2 = (Iterable) map.get(userJid);
                                if (iterable2 == null || (obj2 = C73723fy.A01(iterable2)) == null) {
                                    map.remove(userJid);
                                }
                                if (!C162457s7.A0P(obj, obj2) && (A03 = AnonymousClass32Y.A03(userJid)) != null) {
                                    audienceSelectionContactPickerFragment.A04.add(A03);
                                }
                            }
                        }
                    }
                }
                audienceSelectionContactPickerFragment.A2N();
            }
        }
        selectedListContactPickerFragment2.A1b();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r10, int i) {
        AnonymousClass4YP r102 = (AnonymousClass4YP) r10;
        C162457s7.A0J(r102, 0);
        AnonymousClass3ZH A0L = AnonymousClass4L0.A0L(this.A00, i);
        TextView textView = r102.A01;
        SelectedListContactPickerFragment selectedListContactPickerFragment = this.A01;
        AnonymousClass5ZU r1 = selectedListContactPickerFragment.A12;
        String str = null;
        String str2 = null;
        if (r1 != null) {
            str2 = C18300x5.A0h(r1, A0L);
        }
        textView.setText(str2);
        C105365Uq r12 = selectedListContactPickerFragment.A14;
        if (r12 != null) {
            r12.A0A(r102.A02, A0L, false);
        }
        View view = r102.A00;
        C18290x4.A1I(view, this, A0L, 41);
        Context A1D = selectedListContactPickerFragment.A1D();
        if (A1D != null) {
            Object[] A0L2 = AnonymousClass002.A0L();
            AnonymousClass5ZU r0 = selectedListContactPickerFragment.A12;
            if (r0 != null) {
                str = r0.A0H(A0L);
            }
            str = AnonymousClass002.A0F(A1D, str, A0L2, 0, R.string.f11nameremoved);
        }
        view.setContentDescription(str);
        C107295b4.A03(view, R.string.f11nameremoved);
    }
}
