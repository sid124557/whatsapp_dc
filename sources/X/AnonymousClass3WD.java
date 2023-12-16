package X;

import android.app.Activity;
import com.whatsapp.support.DescribeProblemActivity;
import com.whatsapp.support.faq.SearchFAQ;
import java.util.Map;

/* renamed from: X.3WD  reason: invalid class name */
public class AnonymousClass3WD implements C84944Ei {
    public /* synthetic */ void BK1(String str) {
    }

    public void BK5(AnonymousClass2P4 r6) {
        int i;
        int i2;
        Object valueOf;
        Activity A00 = C621633u.A00(r6.A00);
        if (A00 != null) {
            if (A00 instanceof SearchFAQ) {
                SearchFAQ searchFAQ = (SearchFAQ) A00;
                i = searchFAQ.A00;
                i2 = searchFAQ.A0B.size();
                if (i == -1) {
                    return;
                }
            } else if (A00 instanceof DescribeProblemActivity) {
                i = 0;
                i2 = -1;
            } else {
                return;
            }
            Integer valueOf2 = Integer.valueOf(i);
            Map map = r6.A01;
            map.put("FAQ Results Returned", valueOf2);
            if (i == 0) {
                valueOf = "n/a";
            } else {
                valueOf = Integer.valueOf(i2);
            }
            map.put("FAQ Results Read", valueOf);
        }
    }

    public /* synthetic */ void BKL(String str) {
    }
}
