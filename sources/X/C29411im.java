package X;

import android.os.ConditionVariable;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.1im  reason: invalid class name and case insensitive filesystem */
public class C29411im extends C29451iq {
    public int A00;
    public boolean A01;
    public final ConditionVariable A02;
    public volatile int A03;
    public volatile int A04;
    public volatile boolean A05;
    public volatile boolean A06;

    public void A08(AnonymousClass4F2 r3) {
        int i = this.A04;
        if (i == 1) {
            r3.BUC();
        } else if (i == 2) {
            r3.BUB();
        } else if (i == 3) {
            r3.BUD();
        } else if (i == 4) {
            r3.BUF();
        }
        A06(r3);
    }

    public void A09(boolean z) {
        Log.d("XmppStateManager/onHandlerConnected");
        this.A04 = 2;
        this.A01 = true;
        this.A05 = z;
        this.A02.open();
        C626936e.A01();
        Iterator A032 = C61102zi.A03(this);
        while (A032.hasNext()) {
            ((AnonymousClass4F2) A032.next()).BUB();
        }
    }

    public boolean A0A() {
        if (!AnonymousClass000.A1U(this.A04, 2) || !this.A01) {
            return false;
        }
        return true;
    }

    public boolean A0C() {
        return AnonymousClass000.A1U(this.A04, 2);
    }

    public C29411im(C183538qC r3) {
        super(r3);
        this.A04 = 3;
        this.A02 = new ConditionVariable(false);
        this.A03 = -1;
    }

    public boolean A0B() {
        return this.A06;
    }

    public C29411im() {
        this(C72333dY.A02());
    }
}
