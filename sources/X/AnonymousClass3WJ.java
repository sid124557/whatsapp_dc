package X;

import android.app.NotificationManager;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3WJ  reason: invalid class name */
public class AnonymousClass3WJ implements C84944Ei {
    public C620633i A00;
    public AnonymousClass1R1 A01;

    public /* synthetic */ void BK1(String str) {
    }

    public /* synthetic */ void BK5(AnonymousClass2P4 r1) {
    }

    public void BKL(String str) {
        NotificationManager A0A;
        Cursor A012;
        AnonymousClass1R1 r5 = this.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            AnonymousClass4GK A02 = C18630y0.A02(r5);
            try {
                A012 = C56862sg.A01(((AnonymousClass3H0) A02).A03, C39332Bo.A00, "getSettings/QUERY_CHAT_SETTINGS");
                while (A012.moveToNext()) {
                    A0s.add(r5.A0K(A012));
                }
                A012.close();
                A02.close();
            } catch (Throwable th) {
                A02.close();
                throw th;
            }
        } catch (Exception e) {
            Log.e("getSettings/QUERY_CHAT_SETTINGS/settings/exception", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            StringBuilder A0l = AnonymousClass000.A0l(str);
            C18260x0.A1L(A0l, C18300x5.A0k((C56802sa) it.next(), " /settings/", A0l));
        }
        if (AnonymousClass2BF.A00 && (A0A = this.A00.A0A()) != null) {
            for (Object next : AnonymousClass354.A01(A0A)) {
                StringBuilder A0l2 = AnonymousClass000.A0l(str);
                C18260x0.A1L(A0l2, C18300x5.A0k(next, "/setting/channel:", A0l2));
            }
            return;
        }
        return;
        throw th;
    }

    public AnonymousClass3WJ(C620633i r1, AnonymousClass1R1 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
