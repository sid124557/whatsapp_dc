package X;

import android.os.RemoteException;
import com.google.android.exoplayer2.Timeline;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.74M  reason: invalid class name */
public class AnonymousClass74M implements C186478vP {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass74M(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public long B4x() {
        if (this.A02 == 0) {
            return ((C186498vS) this.A01).B4x();
        }
        C162997t6 r5 = (C162997t6) this.A01;
        if (AnonymousClass000.A1S((r5.A0O > 0 ? 1 : (r5.A0O == 0 ? 0 : -1)))) {
            return AnonymousClass6C8.A0W(r5).A0C;
        }
        return 0;
    }

    public long B6W() {
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            return ((C162997t6) obj).A02();
        }
        return ((C186498vS) obj).B6W();
    }

    public Object B6c() {
        C161787qS r0;
        C153737br r02;
        int i = this.A02;
        Object obj = this.A01;
        if (i == 0) {
            return ((C186498vS) obj).B6b();
        }
        C158967ks r8 = ((C162997t6) obj).A0D;
        try {
            C162997t6 r3 = r8.A0B;
            if (!AnonymousClass000.A1S((r3.A0O > 0 ? 1 : (r3.A0O == 0 ? 0 : -1)))) {
                AnonymousClass6C8.A0z(r3, "Before isSeekable, service player was evicted. Skip refreshing service player state");
                return null;
            }
            C162987t5 A002 = C151857Wo.A00(r8, r3);
            if (!(A002 == null || (r0 = A002.A12) == null || (r02 = r0.A01) == null)) {
                return r02.A08.A03;
            }
            return null;
        } catch (RemoteException e) {
            r8.A0B.A0I("Error occurs while getCurrentWindowIndex", e, new Object[0]);
        }
    }

    public int B6d() {
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            return AnonymousClass6C8.A0W((C162997t6) obj).A0W;
        }
        return ((C186498vS) obj).B6d();
    }

    public long B7A() {
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            return ((C162997t6) obj).A03();
        }
        return ((C186498vS) obj).B7A();
    }

    public boolean BBP() {
        if (this.A02 == 0) {
            return ((C186498vS) this.A01).BBP();
        }
        C162997t6 r1 = (C162997t6) this.A01;
        if (r1.A0A || r1.A0D.A08) {
            return true;
        }
        return false;
    }

    public int BBT() {
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            return ((C162997t6) obj).A01();
        }
        return ((C186498vS) obj).BBS();
    }

    public boolean BIq() {
        if (this.A02 != 0) {
            C162997t6 r0 = (C162997t6) this.A01;
            if (r0 != null) {
                AtomicReference atomicReference = r0.A08;
                if (atomicReference.get() == null || !((C166537yr) atomicReference.get()).A0T) {
                    return false;
                }
                return true;
            }
        } else {
            C186498vS r1 = (C186498vS) this.A01;
            Timeline B6b = r1.B6b();
            if (!AnonymousClass000.A1T(B6b.A01())) {
                int B6d = r1.B6d();
                C158647kK r2 = ((ExoPlaybackControlView) this.A00).A01;
                B6b.A0B(r2, B6d, 0);
                return r2.A0D;
            }
        }
        return false;
    }

    public void Bl2(long j) {
        if (this.A02 != 0) {
            C146527Ap r1 = new C146527Ap();
            r1.A00 = (int) j;
            ((C162997t6) this.A01).A0E(new AnonymousClass7RE(r1));
            return;
        }
        C186498vS r12 = (C186498vS) this.A01;
        r12.Bl1(r12.B6d(), j);
    }

    public void Bl3() {
        C162987t5 A002;
        if (this.A02 != 0) {
            C158967ks r6 = ((C162997t6) this.A01).A0D;
            try {
                C162997t6 r5 = r6.A0B;
                if (AnonymousClass000.A1S((r5.A0O > 0 ? 1 : (r5.A0O == 0 ? 0 : -1))) && (A002 = C151857Wo.A00(r6, r5)) != null) {
                    A002.A0G(A002.A0l.obtainMessage(47));
                }
            } catch (RemoteException e) {
                r6.A0B.A0I("Error occurs while seek to default position", e, AnonymousClass4L0.A0U());
            }
        } else {
            C186498vS r3 = (C186498vS) this.A01;
            r3.Bl1(r3.B6d(), -9223372036854775807L);
        }
    }

    public void Bl4(int i) {
        int i2 = this.A02;
        Object obj = this.A01;
        if (i2 != 0) {
            ((C162997t6) obj).A09();
        } else {
            ((C186498vS) obj).Bl1(i, -9223372036854775807L);
        }
    }

    public void Bmw(boolean z) {
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            C162997t6 r0 = (C162997t6) obj;
            if (z) {
                r0.A07();
            } else {
                r0.A06();
            }
        } else {
            ((C186498vS) obj).Bmw(z);
        }
    }
}
