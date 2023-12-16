package X;

import android.app.Activity;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.98h  reason: invalid class name */
public class AnonymousClass98h extends AnonymousClass3CG {
    public final C45412Zy A00;

    public AnonymousClass98h(C45412Zy r8) {
        super("wa.action.phoenix.FcsReturnResult", "wa.action.phoenix.FcsReturnResultV2", "wa.action.phoenix.FdsIq", "wa.action.phoenix.FdsIqV2", "wa.action.phoenix.statemachine.GoBack", "wa.action.phoenix.statemachine.GoBackV2", "wa.action.phoenix.FcsReturnResumableData");
        this.A00 = r8;
    }

    public static final String A01(C131266dJ r1) {
        Object obj = r1.A00.A02.A00().get(R.id.bloks_data_module_namespace_manager);
        obj.getClass();
        return ((AnonymousClass2MQ) obj).A00;
    }

    public /* bridge */ /* synthetic */ Object B2m(C157967jD r13, C146787Bp r14, C151147Tp r15) {
        C152677Zw r0;
        C159127lA r02;
        C159127lA r03;
        AnonymousClass8DF r8;
        AnonymousClass8DF r6;
        AnonymousClass8DF r5;
        C204719po r04;
        C204719po r05;
        C204719po r06;
        AnonymousClass4G9 r1;
        C003203q r52;
        BkFcsPreloadingScreenFragment A002;
        C131266dJ r152 = (C131266dJ) r15;
        String str = r14.A00;
        short s = -1;
        switch (str.hashCode()) {
            case -1883695124:
                s = C1899693i.A0g("wa.action.phoenix.FcsReturnResultV2", str);
                break;
            case -579883706:
                s = C1899693i.A0h("wa.action.phoenix.FdsIqV2", str);
                break;
            case -574422768:
                s = C1899693i.A0i("wa.action.phoenix.statemachine.GoBackV2", str);
                break;
            case -266954039:
                if (str.equals("wa.action.phoenix.FcsReturnResumableData")) {
                    s = 3;
                    break;
                }
                break;
            case 775692624:
                if (str.equals("wa.action.phoenix.FcsReturnResult")) {
                    s = 4;
                    break;
                }
                break;
        }
        switch (s) {
            case 0:
            case 4:
                List list = r13.A00;
                Map A0k = AnonymousClass6C9.A0k(list, 0);
                Object obj = list.get(1);
                if (obj == null) {
                    r8 = null;
                } else {
                    r8 = ((C155787fV) obj).A00;
                }
                Object obj2 = list.get(2);
                if (obj2 == null) {
                    r6 = null;
                } else {
                    r6 = ((C155787fV) obj2).A00;
                }
                Object obj3 = list.get(3);
                if (obj3 == null) {
                    r5 = null;
                } else {
                    r5 = ((C155787fV) obj3).A00;
                }
                HashMap A0t = AnonymousClass001.A0t();
                if (r8 != null) {
                    r04 = new C204719po(r8, 4);
                } else {
                    r04 = null;
                }
                A0t.put("onStartLoading", r04);
                if (r6 != null) {
                    r05 = new C204719po(r6, 4);
                } else {
                    r05 = null;
                }
                A0t.put("onLoadingCompletion", r05);
                if (r5 != null) {
                    r06 = new C204719po(r5, 4);
                } else {
                    r06 = null;
                }
                A0t.put("onLoadingFailure", r06);
                C45412Zy r62 = this.A00;
                Activity A01 = AnonymousClass8DJ.A01(r152);
                C196229aV r2 = new C196229aV(r152);
                String A012 = A01(r152);
                C18270x1.A11(A01, 0, A012);
                C161447pg A003 = r62.A00.A00(A012);
                if (A003 != null) {
                    if (!(!(A01 instanceof C009707r) || (r52 = (C003203q) A01) == null || (A002 = r62.A00(r52.getSupportFragmentManager())) == null)) {
                        A002.A08 = A0t;
                        A002.A00 = r2;
                    }
                    if (A0k != null) {
                        C159127lA r22 = A003.A00;
                        AnonymousClass7SR r12 = null;
                        if (r22 != null) {
                            r12 = r22.A06;
                        }
                        if (r12 instanceof C137066ni) {
                            String str2 = ((C137066ni) r12).A04;
                            if (!(r22 == null || (r1 = (AnonymousClass4G9) r22.A00(str2)) == null || !(r1 instanceof AnonymousClass4G8))) {
                                r1.B3J(A0k);
                                return null;
                            }
                        }
                        Log.e("WaBkPhoenixInterpreterExtImpl: current resource is not a Bloks resource");
                        return null;
                    }
                }
                break;
            case 1:
                List list2 = r13.A00;
                String A0n = AnonymousClass001.A0n(list2, 0);
                String A0n2 = AnonymousClass001.A0n(list2, 1);
                String A0n3 = AnonymousClass001.A0n(list2, 2);
                Map A0k2 = AnonymousClass6C9.A0k(list2, 3);
                C45412Zy r16 = this.A00;
                String A013 = A01(r152);
                C196259aY r53 = new C196259aY(r152, r13, this);
                C162457s7.A0J(A0n, 0);
                C18270x1.A11(A0n2, 1, A013);
                C54522or r9 = null;
                try {
                    AnonymousClass20N valueOf = AnonymousClass20N.valueOf(A0n2);
                    C161447pg A004 = r16.A00.A00(A013);
                    if (A004 != null) {
                        C159127lA r07 = A004.A00;
                        if (r07 != null) {
                            r9 = r16.A02.A02(r07.A0a);
                            r9.A01(new C197929e6(false));
                        }
                        A004.A06(new C197179ch(r53, A004, r9, A0n), valueOf, new C52622lm(A0n, A0n3, A0k2), A0n);
                        return null;
                    }
                    r53.BSy(C160967ok.A01((Integer) null, (String) null, (String) null, (Map) null));
                    return null;
                } catch (IllegalArgumentException unused) {
                    r53.BSy(C160967ok.A01((Integer) null, (String) null, (String) null, (Map) null));
                    return null;
                }
            case 2:
                String A014 = C157967jD.A01(r13, 0);
                C45412Zy r23 = this.A00;
                String A015 = A01(r152);
                C162457s7.A0J(A015, 1);
                C161447pg A005 = r23.A00.A00(A015);
                if (!(A005 == null || (r03 = A005.A00) == null)) {
                    r03.A09(A014);
                    return null;
                }
            case 3:
                List list3 = r13.A00;
                Map A0k3 = AnonymousClass6C9.A0k(list3, 0);
                String A0n4 = AnonymousClass001.A0n(list3, 1);
                C45412Zy r24 = this.A00;
                String A016 = A01(r152);
                C18270x1.A10(A0n4, 1, A016);
                if (A0k3 == null) {
                    A0k3 = null;
                }
                C161447pg A006 = r24.A00.A00(A016);
                if (A006 == null || (r02 = A006.A00) == null) {
                    Map map = r24.A01.A00;
                    Iterator it = map.keySet().iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        while (it.hasNext()) {
                            String A0m = AnonymousClass001.A0m(it);
                            next = (String) next;
                            C152677Zw r17 = (C152677Zw) map.get(next);
                            C152677Zw r08 = (C152677Zw) map.get(A0m);
                            if (!(r17 == null || r08 == null || r17.A00 > r08.A00)) {
                                next = A0m;
                            }
                        }
                        r0 = (C152677Zw) map.get(next);
                    } else {
                        throw AnonymousClass002.A0G("Empty collection can't be reduced.");
                    }
                } else {
                    r0 = r02.A07;
                }
                if (r0 != null) {
                    r0.A02(A0n4, A0k3);
                    return null;
                }
                break;
        }
        return null;
    }
}
