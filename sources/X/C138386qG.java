package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import com.google.android.exoplayer2.Timeline;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.6qG  reason: invalid class name and case insensitive filesystem */
public final class C138386qG extends AnonymousClass5YG {
    public int A00;
    public int A01 = 0;
    public long A02;
    public Uri A03 = null;
    public Uri A04 = new Uri.Builder().build();
    public AnonymousClass6OD A05;
    public C126816Pk A06;
    public C180778lc A07;
    public C153387bE A08;
    public AnonymousClass561 A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final int A0I;
    public final Handler A0J = AnonymousClass000.A0A();
    public final C186488vR A0K = new C1685585w(this);
    public final C69263Wi A0L;
    public final AnonymousClass1VX A0M;
    public final C147457Ej A0N;
    public final C138426qL A0O;

    public void A0T(int i, int i2) {
        AnonymousClass6OD r2 = this.A05;
        if (r2 != null) {
            r2.Bl1(0, (long) i2);
        } else {
            this.A04 = C86604Kt.A0C(0, i2);
        }
    }

    public void A0i(AnonymousClass88V r3) {
        r3.A00 = new C1236969k(this, 0);
        this.A07 = r3;
    }

    public int A05() {
        AnonymousClass6OD r0 = this.A05;
        if (r0 != null) {
            return (int) r0.B6W();
        }
        return 0;
    }

    public int A06() {
        AnonymousClass6OD r0 = this.A05;
        if (r0 != null) {
            return (int) r0.B7A();
        }
        return 0;
    }

    public int A07() {
        AnonymousClass6OD r0 = this.A05;
        C626936e.A06(r0);
        return r0.BBS();
    }

    public Bitmap A08() {
        if (this.A0G || this.A05 == null || !this.A0F) {
            return null;
        }
        return this.A0O.getCurrentFrame();
    }

    public View A09() {
        A0Q(this.A0I);
        return this.A0O;
    }

    public AnonymousClass561 A0A() {
        return this.A09;
    }

    public void A0C() {
        AnonymousClass6OD r1 = this.A05;
        if (r1 != null) {
            r1.Bmw(false);
        }
    }

    public void A0D() {
        C153387bE r1 = this.A08;
        if (r1 != null) {
            r1.A00 = this.A01;
            r1.A03(this.A01);
        }
    }

    public void A0K() {
        C153387bE r0 = this.A08;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void A0L() {
        C153387bE r0 = this.A08;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void A0M() {
        if (this.A05 != null) {
            Log.d("ExoPlayerVideoPlayer/reinitializeWithNewVideo=");
            A0O();
            this.A0D = false;
            this.A0A = false;
            this.A0F = false;
            this.A0E = false;
            C153387bE r0 = this.A08;
            if (r0 != null) {
                r0.A00();
            }
            this.A05.A08(A0f(), true);
            this.A0B = true;
        }
    }

    public void A0N() {
        AnonymousClass6OD r1 = this.A05;
        if (r1 != null) {
            r1.Bmw(true);
        }
    }

    public void A0O() {
        AnonymousClass6OD r0 = this.A05;
        if (r0 == null || r0.BBS() == 1) {
            this.A0G = false;
            return;
        }
        this.A0G = true;
        this.A05.A0A(false);
    }

    public void A0P(int i) {
        AnonymousClass6OD r3 = this.A05;
        if (r3 != null) {
            r3.Bl1(r3.B6d(), (long) i);
            return;
        }
        this.A04 = C86604Kt.A0C(-1, i);
    }

    public void A0Q(int i) {
        this.A0O.setLayoutResizeMode(i);
    }

    public void A0R(int i) {
        this.A00 = i;
    }

    public void A0S(int i) {
        this.A01 = i;
    }

    public void A0U(C53302ms r2) {
        this.A0O.A01 = r2;
    }

    public void A0W(AnonymousClass561 r3) {
        this.A09 = r3;
        this.A0O.A01(r3, false);
    }

    public void A0Z(boolean z) {
        this.A0D = z;
        AnonymousClass6OD r1 = this.A05;
        if (r1 != null) {
            float f = 1.0f;
            if (z) {
                f = 0.0f;
            }
            r1.A04(f);
        }
    }

    public boolean A0a() {
        AnonymousClass6OD r1 = this.A05;
        if (r1 == null || this.A0G) {
            return false;
        }
        int BBS = r1.BBS();
        if ((BBS == 3 || BBS == 2) && this.A05.BBP()) {
            return true;
        }
        return false;
    }

    public boolean A0b() {
        return this.A0D;
    }

    public boolean A0c() {
        return this.A0C;
    }

    public boolean A0d() {
        AnonymousClass6OD r0 = this.A05;
        C626936e.A06(r0);
        return r0.BBP();
    }

    public boolean A0e() {
        return this.A0B;
    }

    public final C186428vI A0f() {
        C186428vI r6;
        Uri uri = this.A04;
        C180778lc r62 = this.A07;
        if (r62 == null) {
            Activity activity = this.A02;
            r62 = new AnonymousClass88Y(activity, C162387ry.A07(activity, activity.getString(R.string.f11nameremoved)));
            this.A07 = r62;
        }
        AnonymousClass6PL r3 = new AnonymousClass6PL(uri, C1687686r.A0M, r62, new C1691688g(), (Object) null);
        if (this.A0C) {
            r6 = new AnonymousClass6PM(r3, this.A00);
        } else {
            r6 = r3;
        }
        Uri uri2 = this.A03;
        if (uri2 == null) {
            return r6;
        }
        C157057he A002 = C157057he.A00();
        A002.A0O = null;
        A002.A0Q = null;
        A002.A0E = 1;
        A002.A0R = "application/x-subrip";
        C166527yp A003 = C166527yp.A00(A002);
        Activity activity2 = this.A02;
        AnonymousClass7G5 r5 = new AnonymousClass7G5(new AnonymousClass88Y(activity2, C162387ry.A07(activity2, activity2.getString(R.string.f11nameremoved))));
        String str = A003.A0Q;
        if (str == null) {
            str = null;
        }
        String str2 = A003.A0T;
        str2.getClass();
        C186428vI[] r1 = new C186428vI[2];
        AnonymousClass001.A1I(r6, new AnonymousClass6PI(new AnonymousClass7WX(uri2, str2, A003.A0S, A003.A0G), r5.A01, r5.A00, str), r1);
        return new AnonymousClass6PO(r1);
    }

    public final void A0g() {
        AnonymousClass6OD A002;
        boolean z;
        if (this.A05 == null) {
            C138426qL r8 = this.A0O;
            this.A06 = new C126816Pk(r8.getContext());
            C147457Ej r0 = this.A0N;
            if (r0 != null) {
                Context context = r8.getContext();
                C126816Pk r6 = this.A06;
                AnonymousClass5WI r9 = r0.A00;
                int i = r9.A00;
                if (i < AnonymousClass5WI.A0C) {
                    int i2 = i + 1;
                    r9.A00 = i2;
                    C18260x0.A0w("ExoPlayerVideoPlayerPoolManager/useHardwareDecoder numHardwareDecoders=", AnonymousClass001.A0o(), i2);
                    z = true;
                } else {
                    z = false;
                }
                AnonymousClass88T r4 = new AnonymousClass88T(32768);
                C151947Wx r3 = new C151947Wx();
                r3.A01(700, 1000, 100, 100);
                C161487pm.A04(!r3.A05);
                r3.A04 = r4;
                A002 = AnonymousClass75G.A00(context, r3.A00(), new AnonymousClass864(context, z), r6, r9.A05);
            } else {
                AnonymousClass1VX r7 = this.A0M;
                Context context2 = r8.getContext();
                AnonymousClass863 r5 = new AnonymousClass863(r8.getContext());
                C126816Pk r42 = this.A06;
                AnonymousClass88T r32 = new AnonymousClass88T(32768);
                C151947Wx r2 = new C151947Wx();
                r2.A01(1000, 2000, 1000, 1000);
                C161487pm.A04(!r2.A05);
                r2.A04 = r32;
                A002 = AnonymousClass75G.A00(context2, r2.A00(), r5, r42, r7);
            }
            this.A05 = A002;
            float f = 1.0f;
            if (this.A0D) {
                f = 0.0f;
            }
            A002.A04(f);
            this.A05.AwU(this.A0K);
            r8.setPlayer(this.A05);
            if (this.A0E) {
                long j = this.A02;
                int i3 = (j > -9223372036854775807L ? 1 : (j == -9223372036854775807L ? 0 : -1));
                AnonymousClass6OD r1 = this.A05;
                int i4 = this.A00;
                if (i3 == 0) {
                    r1.Bl1(i4, -9223372036854775807L);
                } else {
                    r1.Bl1(i4, j);
                }
            } else {
                Pair pair = this.A04;
                if (pair != null) {
                    int A032 = C18280x3.A03(pair);
                    if (A032 >= 0) {
                        this.A05.Bl1(A032, (long) C18290x4.A03(pair));
                    } else {
                        int A033 = C18290x4.A03(pair);
                        if (A033 >= 0) {
                            AnonymousClass6OD r33 = this.A05;
                            r33.Bl1(r33.B6d(), (long) A033);
                        }
                    }
                    this.A04 = null;
                }
            }
        }
    }

    public final void A0h(C186428vI r3) {
        AnonymousClass561 r1 = this.A09;
        if (r1 != null) {
            r1.A04 = null;
            r1.A05 = null;
        }
        A0g();
        C153387bE r0 = this.A08;
        if (r0 != null) {
            r0.A00();
        }
        AnonymousClass6OD r02 = this.A05;
        if (r02 != null && r02.BBS() == 1) {
            this.A05.A08(r3, true);
        }
        A0E();
    }

    public C138386qG(Activity activity, C69263Wi r3, C620633i r4, AnonymousClass1VX r5, C147457Ej r6, C153387bE r7, int i, boolean z) {
        this.A0M = r5;
        this.A0L = r3;
        this.A05 = r4;
        this.A02 = activity;
        C138426qL r0 = new C138426qL(activity, z);
        this.A0O = r0;
        this.A0I = i;
        r0.setLayoutResizeMode(i);
        this.A0N = r6;
        this.A08 = r7;
    }

    public void A0F() {
        C86604Kt.A1V(AnonymousClass001.A0o(), "ExoPlayerVideoPlayer/start  playerid=", this);
        if (this.A05 != null) {
            A0E();
            this.A05.Bmw(true);
            return;
        }
        this.A0H = true;
        A0J();
    }

    public void A0G() {
        long j;
        C86604Kt.A1V(AnonymousClass001.A0o(), "ExoPlayerVideoPlayer/stop playerid=", this);
        this.A0D = false;
        this.A0B = false;
        AnonymousClass6OD r0 = this.A05;
        if (r0 != null) {
            this.A0H = r0.BBP();
            this.A05.Bmw(false);
            this.A0E = false;
            Timeline B6b = this.A05.B6b();
            if (B6b != null && !AnonymousClass000.A1T(B6b.A01())) {
                int B6d = this.A05.B6d();
                this.A00 = B6d;
                C158647kK A0X = AnonymousClass6C8.A0X(new C158647kK(), B6b, B6d);
                if (!A0X.A0A) {
                    this.A0E = true;
                    if (A0X.A0D) {
                        j = this.A05.B6W();
                    } else {
                        j = -9223372036854775807L;
                    }
                    this.A02 = j;
                }
            }
            this.A05.A0A(false);
            AnonymousClass6OD r02 = this.A05;
            r02.A03();
            r02.A02();
            r02.A07((Surface) null, false);
            r02.A05(0, 0);
            this.A05.BjC(this.A0K);
            this.A05.A01();
            this.A05 = null;
            C183348pt r03 = this.A0A;
            if (r03 != null) {
                r03.BYM(false, 1);
            }
            C138426qL r1 = this.A0O;
            C53302ms r04 = r1.A01;
            if (r04 != null) {
                r04.A00();
            }
            r1.A00 = null;
            this.A06 = null;
            AnonymousClass561 r05 = this.A09;
            if (r05 != null) {
                r05.setPlayer((Object) null);
                AnonymousClass561 r12 = this.A09;
                r12.removeCallbacks(r12.A0M);
                r12.removeCallbacks(r12.A0N);
            }
            A0B();
        }
    }

    public void A0J() {
        C86604Kt.A1V(AnonymousClass001.A0o(), "ExoPlayerVideoPlayer/initialize  playerid=", this);
        if (this.A05 == null) {
            AnonymousClass561 r1 = this.A09;
            if (r1 != null) {
                Activity activity = this.A02;
                C626936e.A06(activity);
                if ((activity.getWindow().getDecorView().getSystemUiVisibility() & 4) == 0) {
                    r1.A07();
                } else {
                    r1.A06();
                }
            }
            A0g();
            this.A0B = true;
            if (this.A0H) {
                AnonymousClass6OD r12 = this.A05;
                if (r12 != null) {
                    r12.Bmw(true);
                    AnonymousClass561 r2 = this.A09;
                    if (r2 != null) {
                        r2.A04 = null;
                        r2.A05 = new C159447lq(this, 1);
                    }
                    this.A0L.A0S(new C117095rN(this, 34));
                }
            } else if (this.A09 == null) {
                C153387bE r0 = this.A08;
                if (r0 != null) {
                    r0.A00();
                }
                this.A05.A08(A0f(), true);
            } else {
                AnonymousClass6OD r13 = this.A05;
                C626936e.A06(r13);
                r13.Bmw(false);
                AnonymousClass561 r22 = this.A09;
                if (r22 != null) {
                    r22.A04 = new AnonymousClass915(this, 0);
                    r22.A05 = new C159447lq(this, 0);
                }
            }
        }
    }

    public void A0X(File file) {
        this.A04 = Uri.fromFile(file);
        this.A07 = null;
    }
}
