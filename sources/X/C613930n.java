package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.30n  reason: invalid class name and case insensitive filesystem */
public class C613930n {
    public final C621033m A00;
    public final WfalManager A01;
    public final AnonymousClass30E A02;
    public final AnonymousClass5YA A03;
    public final C104745Se A04;
    public final C183538qC A05;
    public final Map A06;

    public static final boolean A00(C624134x r1) {
        if ((r1 instanceof C30481mW) || (r1 instanceof C31961pA) || (r1 instanceof AnonymousClass1n2) || (r1 instanceof C31971pB) || (r1 instanceof C30721mu)) {
            return true;
        }
        return false;
    }

    public void A01() {
        if (this.A01.A02()) {
            ((C65183Gn) this.A02.A09.get()).A00 = false;
        } else if (this.A04.A00()) {
            ((C65153Gk) this.A03.A0G.get()).A00 = false;
        }
    }

    public void A02() {
        if (this.A01.A02()) {
            ((C65183Gn) this.A02.A09.get()).A00 = true;
        } else if (this.A04.A00()) {
            ((C65153Gk) this.A03.A0G.get()).A00 = true;
        }
    }

    public void A04(Context context, C624134x r11) {
        C108845de r1;
        Map map = this.A06;
        C624134x r6 = r11;
        String str = r11.A1J.A01;
        if (!map.containsKey(str)) {
            if (A00(r11)) {
                map.put(str, r11);
            }
            if (AnonymousClass36X.A07(r11) && (r11 instanceof C30481mW) && (r1 = r11.A0O) != null) {
                if (r1.A03 || r1.A04) {
                    Context context2 = context;
                    if (this.A01.A02()) {
                        AnonymousClass30E r4 = this.A02;
                        C108845de r3 = r11.A0O;
                        AnonymousClass8U9 r2 = new AnonymousClass8U9();
                        if (r3 != null) {
                            if (r3.A03) {
                                r2.add(AnonymousClass223.FACEBOOK);
                            }
                            if (r3.A04) {
                                r2.add(AnonymousClass223.INSTAGRAM);
                            }
                        }
                        r4.A02.BkM(new C70513ac(r4, context2, r6, C159507lx.A0h(r2), 22));
                    } else if (this.A04.A00()) {
                        AnonymousClass5YA r32 = this.A03;
                        r32.A03.BkM(new C70363aN(r32, context, r11, 42));
                    }
                }
            }
        }
    }

    public final void A05(Context context, C624134x r20, C1228966g r21) {
        AnonymousClass5XP r1;
        int i;
        int i2;
        Map map = this.A06;
        HashSet A15 = AnonymousClass0x9.A15(map.values());
        ArrayList A0s = AnonymousClass001.A0s();
        C108845de r12 = r20.A0O;
        if (r12 != null) {
            if (r12.A03) {
                A0s.add(AnonymousClass223.FACEBOOK);
            }
            if (r12.A04) {
                A0s.add(AnonymousClass223.INSTAGRAM);
            }
        }
        AnonymousClass30E r10 = this.A02;
        ArrayList A0v = C18300x5.A0v(map);
        Context context2 = context;
        C116715qk r9 = new C116715qk(context2, r21, this, A15);
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A19("CrosspostManager/checkEligibilityAndShowAutoCrosspostingSnackBar messages: ", A0o, A0v);
        AnonymousClass356.A01(AnonymousClass000.A0Y(", Crosspost entry point: ", A0o, 1));
        ArrayList A0s2 = AnonymousClass001.A0s();
        ArrayList A0s3 = AnonymousClass001.A0s();
        Iterator it = A0v.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C108845de r13 = ((C624134x) next).A0O;
            if (r13 != null && (r13.A03 || r13.A04)) {
                A0s3.add(next);
            }
        }
        A0s2.addAll(A0s3);
        if (!A0s2.isEmpty()) {
            C614430u A0c = AnonymousClass0x9.A0c(r10.A01.A06);
            if (!A0c.A08()) {
                r1 = new AnonymousClass5XP(false, false);
            } else {
                r1 = new AnonymousClass5XP(A0c.A00().getBoolean("e2ee_popup_fb_auto_crossposting", false), A0c.A00().getBoolean("e2ee_popup_ig_auto_crossposting", false));
            }
            boolean z = r1.A00;
            boolean z2 = r1.A01;
            if (z) {
                i = R.string.f11nameremoved;
                i2 = R.string.f11nameremoved;
                if (z2) {
                    i = R.string.f11nameremoved;
                    i2 = R.string.f11nameremoved;
                }
            } else if (z2) {
                i = R.string.f11nameremoved;
                i2 = R.string.f11nameremoved;
            } else {
                r10.A02.BkM(new C71493cC(context2, r10, r9, A0s, A0v));
            }
            C19340zH A002 = AnonymousClass5V0.A00(context2);
            A002.A0U(i);
            A002.A0T(i2);
            A002.A0i(false);
            A002.A0Y(new AnonymousClass4I6(A0s, A0v, r9, r10, context2, 1), R.string.f11nameremoved);
            A002.A0W(new AnonymousClass4I8(context2, 25, r10), R.string.f11nameremoved);
            C18280x3.A0q(A002);
        }
        map.clear();
    }

    public final void A06(Context context, C1228966g r13) {
        Log.d("StatusUndoHandler/statusUpdateDelivered show auto-crossposting action snackbar");
        Map map = this.A06;
        Context context2 = context;
        AnonymousClass5JT r7 = new AnonymousClass5JT(context, r13, this, AnonymousClass0x9.A15(map.values()));
        Collection values = map.values();
        ArrayList A0r = C18300x5.A0r(values);
        for (Object next : values) {
            C108845de r0 = ((C624134x) next).A0O;
            if (r0 != null && r0.A03) {
                A0r.add(next);
            }
        }
        AnonymousClass5YA r8 = this.A03;
        Integer A0f = AnonymousClass001.A0f();
        C183538qC r5 = r8.A0J;
        ((C111135hb) r5.get()).A03(927599499, "auto_xpost_status_share_view", "INIT_CROSSPOST");
        ((C111135hb) r5.get()).A06("is_auto_crosspost", Boolean.valueOf(AnonymousClass0x9.A1Q(((C56042rK) r8.A0E.get()).A01(AnonymousClass5YA.A0K))));
        r8.A03.BkM(new C71623cP(context2, r7, r8, A0f, A0r));
        map.clear();
    }

    public final boolean A08() {
        Collection values = this.A06.values();
        C162457s7.A0J(values, 0);
        Iterator it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C108845de r0 = C18300x5.A0T(it).A0O;
            if (r0 != null && r0.A03) {
                if (!this.A04.A00() || this.A01.A02()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C613930n(C621033m r2, WfalManager wfalManager, AnonymousClass30E r4, AnonymousClass5YA r5, C104745Se r6, C183538qC r7) {
        LinkedHashMap A0r = C18320x8.A0r();
        this.A00 = r2;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = wfalManager;
        this.A03 = r5;
        this.A05 = r7;
        this.A06 = A0r;
    }

    public final void A03(Context context, View.OnClickListener onClickListener, C88674aZ r7, C1228966g r8) {
        C110065fd BD8 = r8.BD8(R.string.f11nameremoved, 3500, true);
        if (r7 != null) {
            BD8.A03.A0A(r7);
        }
        BD8.A04(new C109525el(r7, BD8, onClickListener, 13), R.string.f11nameremoved);
        C18300x5.A0G(BD8.A03.A0J, R.id.snackbar_action).setTextColor(C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved));
        BD8.A01();
        this.A06.clear();
    }

    public final void A07(C1228966g r7, Set set) {
        set.size();
        r7.BD8(R.string.f11nameremoved, 2000, false).A01();
        C621033m r5 = this.A00;
        if (r5.A1j.A00()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C624134x A0T = C18300x5.A0T(it);
                if (!C627636p.A0l(A0T)) {
                    AnonymousClass2z0 r1 = A0T.A1J;
                    if (r1.A02 && (r1.A00 instanceof C135166kE)) {
                        r5.A1k.A0C.A02(A0T, (Long) null, (String) null, 20);
                    }
                }
            }
        }
        r5.A0Z(set, true);
    }
}
