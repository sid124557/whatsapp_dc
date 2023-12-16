package X;

import android.database.Cursor;
import android.os.Bundle;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.1tD  reason: invalid class name and case insensitive filesystem */
public class C33491tD extends AnonymousClass5ZM {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C65203Gp A01;
    public final C55622qe A02;
    public final C95814uZ A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Set set;
        Cursor B9f;
        C65203Gp r5 = this.A01;
        C95814uZ r6 = this.A03;
        C22591Ou r4 = (C22591Ou) r5.A0c.A00("star");
        if (r4 == null || C56972sr.A04(r5.A06) == null) {
            set = Collections.emptySet();
        } else {
            AnonymousClass4GK A032 = r4.A05.get();
            try {
                B9f = r4.A04.B9f((AnonymousClass0QU) null, r6, (C56532s8) null);
                List A0D = r4.A0D(B9f, false);
                B9f.close();
                A032.close();
                set = r5.A0B(A0D);
            } catch (Throwable th) {
                try {
                    A032.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        boolean A033 = this.A02.A03(r6, (Long) null);
        if (A033) {
            r5.A0O(set);
        } else {
            r5.A0N(set);
        }
        C89654ea.A4P(this.A00, 300);
        return Boolean.valueOf(A033);
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Boolean bool = (Boolean) obj;
        C93544ok r3 = (C93544ok) this.A04.get();
        if (r3 != null && !r3.BHW()) {
            r3.BjL();
            if (bool.booleanValue()) {
                AnonymousClass0WA.A00(r3).A01((Bundle) null, r3);
                r3.A78();
                return;
            }
            r3.A05.A0H(R.string.f11nameremoved, 0);
        }
    }

    public C33491tD(C65203Gp r3, StarredMessagesActivity starredMessagesActivity, C55622qe r5, C95814uZ r6) {
        this.A01 = r3;
        this.A02 = r5;
        this.A04 = AnonymousClass0x9.A14(starredMessagesActivity);
        this.A03 = r6;
    }
}
