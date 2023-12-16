package X;

import android.app.Activity;
import android.database.Cursor;
import android.text.Html;
import android.text.TextUtils;
import android.widget.TextSwitcher;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.9oe  reason: invalid class name and case insensitive filesystem */
public class C203999oe extends AnonymousClass5ZM {
    public Object A00;
    public Object A01;
    public final int A02;

    public C203999oe(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Cursor A0E;
        long j;
        AnonymousClass36K[] r7;
        switch (this.A02) {
            case 0:
                ArrayList A0s = AnonymousClass001.A0s();
                AnonymousClass36K A0T = C1899693i.A0T((AnonymousClass36K) this.A01);
                if (A0T == null || (r7 = A0T.A03) == null) {
                    return A0s;
                }
                HashSet A0K = AnonymousClass002.A0K();
                AnonymousClass9VD r5 = (AnonymousClass9VD) ((C203919oW) this.A00).A00;
                Iterator it = AnonymousClass9U4.A08(r5.A0E).iterator();
                while (it.hasNext()) {
                    A0K.add(C1899693i.A0C(it).A0A);
                }
                for (AnonymousClass36K r9 : r7) {
                    if (r9 != null && "upi".equals(r9.A00)) {
                        AnonymousClass99H r2 = new AnonymousClass99H();
                        r2.A04(r5.A07, r9, 3);
                        if (!TextUtils.isEmpty(r2.A06)) {
                            r2.A0J = A0K.contains(r2.A06);
                        }
                        A0s.add(r2);
                    }
                }
                return A0s;
            case 1:
                return ((C194589Tn) this.A00).A07.A00();
            case 2:
                AnonymousClass8EA A03 = AnonymousClass9U4.A03(((AnonymousClass9DC) this.A00).A0P);
                int[] iArr = {3};
                synchronized (A03) {
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    for (char c = 0; c < 1; c = 1) {
                        A0s2.add(Long.toString((long) (iArr[c] << 12)));
                    }
                    AnonymousClass4GK A0B = A03.A00.get();
                    try {
                        C56862sg r6 = ((AnonymousClass3H0) A0B).A03;
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("SELECT COUNT(*) as count FROM contacts");
                        A0E = r6.A0E(AnonymousClass000.A0X(C57812uF.A00(A0s2, 15 << 12, false), A0o), "getActivePaymentContactsCount/QUERY_SCHEMA_PAY_CONTACTS_COUNT", (String[]) null);
                        if (A0E.moveToNext()) {
                            j = A0E.getLong(A0E.getColumnIndexOrThrow("count"));
                        } else {
                            j = 0;
                        }
                        A0E.close();
                        A0B.close();
                    } catch (Throwable th) {
                        try {
                            A0B.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return Long.valueOf(j);
            default:
                return AnonymousClass9U4.A08(((AnonymousClass9DC) this.A00).A0P);
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C166587yw A012;
        C133796hx r0;
        switch (this.A02) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                C203039n1 r1 = ((AnonymousClass9VD) ((C203919oW) this.A00).A00).A01;
                if (r1 != null) {
                    r1.BNT((AnonymousClass34V) null, arrayList);
                    return;
                }
                return;
            case 1:
                Set set = (Set) obj;
                C194589Tn r4 = (C194589Tn) this.A00;
                if (set != null) {
                    AnonymousClass33p r3 = r4.A02;
                    C18270x1.A0l(r3.A0U(), "payment_background_batch_require_fetch", false);
                    r3.A1Y("payment_backgrounds_batch_last_fetch_timestamp");
                    r4.A0A.A0A(set);
                } else {
                    Iterator A03 = C61102zi.A03(r4.A0A);
                    while (A03.hasNext()) {
                        A03.next();
                    }
                }
                C197079cU r5 = (C197079cU) this.A01;
                if (r5 != null && set != null) {
                    AnonymousClass39R r42 = r5.A03;
                    if (set.contains(r42.A0F)) {
                        r5.A04.A08.A00(r5.A02, r42, r5.A01, r5.A00);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                Long l = (Long) obj;
                if (l.longValue() >= 10) {
                    Activity activity = (Activity) this.A00;
                    if (!activity.isFinishing()) {
                        Object[] A0L = AnonymousClass002.A0L();
                        AnonymousClass0x7.A1E(l, A0L, 0);
                        ((TextSwitcher) this.A01).setText(Html.fromHtml(activity.getString(R.string.f11nameremoved, A0L)));
                    }
                }
                ((AnonymousClass9Ba) this.A00).A7Z(l);
                return;
            default:
                List list = (List) obj;
                if (list != null && list.size() > 0) {
                    AnonymousClass9DA r32 = (AnonymousClass9DA) this.A00;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            A012 = C1899693i.A0C(it);
                            if (!(A012 instanceof C133686hm) || (r0 = A012.A08) == null || !((AnonymousClass99H) r0).A0H) {
                            }
                        } else {
                            A012 = AnonymousClass8EA.A01(list);
                        }
                    }
                    r32.A0B = A012;
                }
                AnonymousClass9QL r33 = (AnonymousClass9QL) this.A01;
                String str = r33.A0L;
                if (str == null) {
                    ((IndiaUpiCheckOrderDetailsActivity) this.A00).BbI(r33.A06);
                    return;
                } else {
                    ((IndiaUpiCheckOrderDetailsActivity) this.A00).A07.A04.A00(new C200419iI(r33, this), str);
                    return;
                }
        }
    }
}
