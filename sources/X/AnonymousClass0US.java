package X;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResultRegistry$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* renamed from: X.0US  reason: invalid class name */
public class AnonymousClass0US {
    public ArrayList A00;
    public Random A01;
    public final Bundle A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final transient Map A07;
    public final /* synthetic */ C004805c A08;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass0US(C004805c r1) {
        this();
        this.A08 = r1;
    }

    public final void A02(int i, Object obj) {
        C15530rW r1;
        String str = (String) AnonymousClass001.A0i(this.A06, i);
        if (str != null) {
            C03610Kw r0 = (C03610Kw) this.A07.get(str);
            if (r0 == null || (r1 = r0.A00) == null) {
                this.A02.remove(str);
                this.A05.put(str, obj);
            } else if (this.A00.remove(str)) {
                r1.BM2(obj);
            }
        }
    }

    public void A03(C04520Op r12, C05880Vi r13, Object obj, int i) {
        Bundle bundle;
        C004805c r3 = this.A08;
        AnonymousClass0KE A062 = r12.A06(r3, obj);
        int i2 = i;
        if (A062 != null) {
            AnonymousClass000.A0A().post(new C12480lc(this, A062, i));
            return;
        }
        Intent A052 = r12.A05(r3, obj);
        if (A052.getExtras() != null && A052.getExtras().getClassLoader() == null) {
            A052.setExtrasClassLoader(r3.getClassLoader());
        }
        if (A052.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = A052.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            A052.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else if (r13 != null) {
            bundle = r13.A02();
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(A052.getAction())) {
            String[] stringArrayExtra = A052.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            C005205m.A02(r3, stringArrayExtra, i);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(A052.getAction())) {
            C06760Zc r0 = (C06760Zc) A052.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                C05680Um.A01(r3, r0.A02, r0.A03, bundle, i2, r0.A00, r0.A01, 0);
            } catch (IntentSender.SendIntentException e) {
                AnonymousClass000.A0A().post(new C12490ld(e, this, i));
            }
        } else {
            C05680Um.A02(r3, A052, bundle, i);
        }
    }

    public final void A04(String str) {
        Map map = this.A04;
        if (map.get(str) == null) {
            int nextInt = this.A01.nextInt(2147418112);
            while (true) {
                Map map2 = this.A06;
                Integer valueOf = Integer.valueOf(nextInt + 65536);
                if (map2.containsKey(valueOf)) {
                    nextInt = this.A01.nextInt(2147418112);
                } else {
                    map2.put(valueOf, str);
                    map.put(str, valueOf);
                    return;
                }
            }
        }
    }

    public final void A05(String str) {
        Object remove;
        if (!this.A00.contains(str) && (remove = this.A04.remove(str)) != null) {
            this.A06.remove(remove);
        }
        this.A07.remove(str);
        Map map = this.A05;
        if (map.containsKey(str)) {
            StringBuilder A0m = AnonymousClass000.A0m("Dropping pending result for request ", str);
            A0m.append(": ");
            Log.w("ActivityResultRegistry", AnonymousClass000.A0R(map.get(str), A0m));
            map.remove(str);
        }
        Bundle bundle = this.A02;
        if (bundle.containsKey(str)) {
            StringBuilder A0m2 = AnonymousClass000.A0m("Dropping pending result for request ", str);
            A0m2.append(": ");
            Log.w("ActivityResultRegistry", AnonymousClass000.A0R(bundle.getParcelable(str), A0m2));
            bundle.remove(str);
        }
        Map map2 = this.A03;
        C03620Kx r4 = (C03620Kx) map2.get(str);
        if (r4 != null) {
            ArrayList arrayList = r4.A01;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r4.A00.A01((C15110qn) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }

    public final boolean A06(Intent intent, int i, int i2) {
        C15530rW r1;
        String str = (String) AnonymousClass001.A0i(this.A06, i);
        if (str == null) {
            return false;
        }
        C03610Kw r2 = (C03610Kw) this.A07.get(str);
        if (r2 == null || (r1 = r2.A00) == null || !this.A00.contains(str)) {
            this.A05.remove(str);
            this.A02.putParcelable(str, new C06800Zg(i2, intent));
            return true;
        }
        r1.BM2(r2.A01.A07(intent, i2));
        this.A00.remove(str);
        return true;
    }

    public final AnonymousClass0O1 A00(C15530rW r6, C04520Op r7, C15910sA r8, String str) {
        AnonymousClass0O9 lifecycle = r8.getLifecycle();
        AnonymousClass08A r2 = (AnonymousClass08A) lifecycle;
        if (!AnonymousClass001.A1U(r2.A02.compareTo(AnonymousClass0GC.STARTED))) {
            A04(str);
            Map map = this.A03;
            C03620Kx r22 = (C03620Kx) map.get(str);
            if (r22 == null) {
                r22 = new C03620Kx(lifecycle);
            }
            ActivityResultRegistry$1 activityResultRegistry$1 = new ActivityResultRegistry$1(this, r6, r7, str);
            r22.A00.A00(activityResultRegistry$1);
            r22.A01.add(activityResultRegistry$1);
            map.put(str, r22);
            return new C17520vi(this, r7, str, 0);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LifecycleOwner ");
        A0o.append(r8);
        A0o.append(" is attempting to register while current state is ");
        A0o.append(r2.A02);
        throw AnonymousClass000.A0I(". LifecycleOwners must call register before they are STARTED.", A0o);
    }

    public final AnonymousClass0O1 A01(C15530rW r3, C04520Op r4, String str) {
        A04(str);
        this.A07.put(str, new C03610Kw(r3, r4));
        Map map = this.A05;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            r3.BM2(obj);
        }
        Bundle bundle = this.A02;
        C06800Zg r0 = (C06800Zg) bundle.getParcelable(str);
        if (r0 != null) {
            bundle.remove(str);
            r3.BM2(r4.A07(r0.A01, r0.A00));
        }
        return new C17520vi(this, r4, str, 1);
    }

    public AnonymousClass0US() {
        this.A01 = new Random();
        this.A06 = AnonymousClass001.A0t();
        this.A04 = AnonymousClass001.A0t();
        this.A03 = AnonymousClass001.A0t();
        this.A00 = AnonymousClass001.A0s();
        this.A07 = AnonymousClass001.A0t();
        this.A05 = AnonymousClass001.A0t();
        this.A02 = AnonymousClass002.A08();
    }
}
