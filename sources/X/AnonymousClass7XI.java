package X;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
/* renamed from: X.7XI  reason: invalid class name */
public final class AnonymousClass7XI {
    public Looper A00;
    public AnonymousClass6Q8 A01 = AnonymousClass6Q8.A00;
    public AnonymousClass6QU A02 = AnonymousClass79S.A00;
    public String A03;
    public String A04;
    public final Context A05;
    public final ArrayList A06 = AnonymousClass001.A0s();
    public final ArrayList A07 = AnonymousClass001.A0s();
    public final Map A08 = new AnonymousClass05C();
    public final Map A09 = new AnonymousClass05C();
    public final Set A0A = AnonymousClass002.A0K();
    public final Set A0B = AnonymousClass002.A0K();

    public C159087l6 A00() {
        Map map = this.A09;
        if (!map.isEmpty()) {
            AnonymousClass891 r3 = AnonymousClass891.A00;
            C148727Jm r1 = AnonymousClass79S.A04;
            if (map.containsKey(r1)) {
                r3 = (AnonymousClass891) map.get(r1);
            }
            Set set = this.A0A;
            Map map2 = this.A08;
            AnonymousClass7P4 r17 = new AnonymousClass7P4(r3, this.A03, this.A04, map2, set);
            Map map3 = r17.A04;
            AnonymousClass05C r4 = new AnonymousClass05C();
            AnonymousClass05C r32 = new AnonymousClass05C();
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator A0i = C18280x3.A0i(map);
            C148727Jm r8 = null;
            while (A0i.hasNext()) {
                C148727Jm r7 = (C148727Jm) A0i.next();
                Object obj = map.get(r7);
                boolean A1W = AnonymousClass000.A1W(map3.get(r7));
                r4.put(r7, Boolean.valueOf(A1W));
                AnonymousClass899 r14 = new AnonymousClass899(r7, A1W);
                A0s.add(r14);
                AnonymousClass6QU r13 = r7.A00;
                C162177rO.A02(r13);
                C187688xe A002 = r13.A00(this.A05, this.A00, r14, r14, r17, obj);
                r32.put(r7.A01, A002);
                if (A002.Bhi()) {
                    if (r8 == null) {
                        r8 = r7;
                    } else {
                        String str = r7.A02;
                        String str2 = r8.A02;
                        StringBuilder A0l = AnonymousClass000.A0l(str);
                        A0l.append(" cannot be used with ");
                        throw AnonymousClass000.A0I(str2, A0l);
                    }
                }
            }
            if (r8 != null) {
                String str3 = r8.A02;
                Object[] objArr = {str3};
                if (!set.equals(this.A0B)) {
                    throw AnonymousClass001.A0e(String.format("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", objArr));
                }
            }
            for (C187688xe Bjs : r32.values()) {
                Bjs.Bjs();
            }
            Context context = this.A05;
            ReentrantLock reentrantLock = new ReentrantLock();
            AnonymousClass7P4 r11 = r17;
            C127086Qo r6 = new C127086Qo(context, this.A00, this.A01, this.A02, r11, A0s, this.A06, this.A07, r4, r32, reentrantLock);
            Set set2 = C159087l6.A00;
            synchronized (set2) {
                set2.add(r6);
            }
            return r6;
        }
        throw AnonymousClass6C7.A0U("must call addApi() to add at least one API");
    }

    public void A01(C148727Jm r3) {
        C162177rO.A03(r3, "Api must not be null");
        this.A09.put(r3, (Object) null);
        C162177rO.A03(r3.A00, "Base client builder must not be null");
        List emptyList = Collections.emptyList();
        this.A0B.addAll(emptyList);
        this.A0A.addAll(emptyList);
    }

    public AnonymousClass7XI(Context context) {
        this.A05 = context;
        this.A00 = context.getMainLooper();
        this.A03 = context.getPackageName();
        this.A04 = AnonymousClass000.A0O(context);
    }
}
