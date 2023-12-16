package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.whatsapp.mediacomposer.doodle.DoodleView;

/* renamed from: X.5Ut  reason: invalid class name and case insensitive filesystem */
public abstract class C105395Ut {
    public final C184988ss A00;
    public final C69263Wi A01;
    public final C620633i A02;
    public final C620733j A03;
    public final C48132eP A04;
    public final C104035Pj A05;

    public abstract long A02();

    public abstract void A07();

    public abstract void A08();

    public static void A01(C104835Sn r2, C105395Ut r3) {
        r2.A01 = 0;
        r2.A02 = SystemClock.elapsedRealtime();
        r2.A01();
        r3.A05.A01();
    }

    public final Context A03() {
        View view = this.A05.A00.A00;
        C626936e.A04(view);
        return view.getContext();
    }

    public View A04() {
        if (this instanceof C985351g) {
            return ((C985351g) this).A0A;
        }
        if (this instanceof C985551i) {
            return ((C985551i) this).A09;
        }
        if (this instanceof C985151e) {
            return ((C985151e) this).A00;
        }
        if (this instanceof C985651j) {
            return ((C985651j) this).A0E;
        }
        if (this instanceof C985251f) {
            return ((C985251f) this).A06;
        }
        return ((C985051d) this).A00;
    }

    public void A05() {
        C104835Sn r0;
        Handler handler;
        if (this instanceof C985351g) {
            C985351g r3 = (C985351g) this;
            C86884Mf r2 = r3.A01;
            if (!(r2 == null || (handler = r2.A02) == null)) {
                C117635sF.A00(handler, r2, 6);
            }
            r3.A0B.A02(r3);
            r3.A02 = false;
        } else if (this instanceof C985551i) {
            C985551i r32 = (C985551i) this;
            r32.A0J("pausePlayback");
            AnonymousClass5YG r02 = r32.A02;
            if (r02 != null) {
                r02.A0C();
            }
            DoodleView doodleView = r32.A0F;
            if (doodleView != null) {
                doodleView.A0F.A0A = false;
                doodleView.invalidate();
            }
            r32.A0K.A02(r32);
            r32.A03 = false;
            AnonymousClass5NW r03 = r32.A01;
            if (r03 != null) {
                r03.A02.dismiss();
            }
        } else {
            if (this instanceof C985151e) {
                r0 = ((C985151e) this).A06;
            } else if (this instanceof C985651j) {
                r0 = ((C985651j) this).A0D;
            } else if (this instanceof C985251f) {
                C985251f r1 = (C985251f) this;
                r1.A09.A02();
                r1.A02 = false;
                return;
            } else {
                r0 = ((C985051d) this).A01;
            }
            r0.A02();
        }
    }

    public void A06() {
        C104835Sn r0;
        Handler handler;
        if (this instanceof C985351g) {
            C985351g r3 = (C985351g) this;
            C86884Mf r2 = r3.A01;
            if (!(r2 == null || (handler = r2.A02) == null)) {
                C117635sF.A00(handler, r2, 5);
            }
            if (!r3.A02 && r3.A05.A00.A06) {
                r3.A02 = true;
                r3.A0B.A03(r3);
            }
        } else if (this instanceof C985551i) {
            C985551i r32 = (C985551i) this;
            r32.A0J("resumePlayback");
            if (!r32.A04) {
                r32.A0E();
                if (r32.A02 != null) {
                    r32.A0J("resumePlayback/player not null");
                    AnonymousClass5YG r02 = r32.A02;
                    if (r02 != null) {
                        r02.A0F();
                    }
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("statusplaybackvideo/no player for ");
                    C18270x1.A17(r32.A0I.A1J, A0o);
                }
                DoodleView doodleView = r32.A0F;
                if (doodleView != null) {
                    doodleView.A0F.A0A = true;
                    SystemClock.elapsedRealtime();
                    doodleView.invalidate();
                }
                r32.A0G();
            }
        } else {
            if (this instanceof C985151e) {
                r0 = ((C985151e) this).A06;
            } else if (this instanceof C985651j) {
                r0 = ((C985651j) this).A0D;
            } else if (this instanceof C985251f) {
                r0 = ((C985251f) this).A09;
            } else {
                r0 = ((C985051d) this).A01;
            }
            r0.A01();
        }
    }

    public void A09(boolean z) {
        if (this instanceof C985351g) {
            ((C985351g) this).A04 = z;
        } else if (this instanceof C985551i) {
            C985551i r2 = (C985551i) this;
            r2.A04 = z;
            AnonymousClass51x r1 = r2.A05.A00;
            if (r1.A06) {
                AnonymousClass5YG r0 = r2.A02;
                if (z) {
                    if (r0 != null) {
                        r0.A0C();
                        Bitmap A08 = r0.A08();
                        if (A08 != null) {
                            r2.A0G.A06(A08);
                            r2.A06 = true;
                        }
                    }
                    r2.A08.setVisibility(0);
                    r2.A0H();
                } else if (r0 == null) {
                    r2.A0J("onDragEnd/startPlayback");
                    r2.A07();
                } else {
                    r2.A0J("onDragEnd/resumePlayback");
                    r1.A0C();
                }
            }
        }
    }

    public boolean A0A() {
        C48132eP r2;
        C624134x r1;
        if (this instanceof C985351g) {
            C985351g r0 = (C985351g) this;
            r2 = r0.A04;
            r1 = r0.A09;
        } else if (this instanceof C985551i) {
            C985551i r02 = (C985551i) this;
            return AnonymousClass5VM.A01(r02.A0D, r02.A04, r02.A0I);
        } else if (this instanceof C985151e) {
            C985151e r03 = (C985151e) this;
            return AnonymousClass5VM.A01(r03.A04, r03.A04, r03.A05);
        } else if (this instanceof C985651j) {
            C985651j r04 = (C985651j) this;
            r2 = r04.A04;
            r1 = r04.A0C;
        } else if (!(this instanceof C985251f)) {
            return true;
        } else {
            C985251f r05 = (C985251f) this;
            r2 = r05.A04;
            r1 = r05.A08;
        }
        C162457s7.A0J(r1, 1);
        return AnonymousClass5VM.A01((AnonymousClass1VX) null, r2, r1);
    }

    public C105395Ut(C184988ss r1, C69263Wi r2, C620633i r3, C620733j r4, C48132eP r5, C104035Pj r6) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r1;
        this.A05 = r6;
    }
}
