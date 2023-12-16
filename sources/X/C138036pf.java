package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Iterator;

/* renamed from: X.6pf  reason: invalid class name and case insensitive filesystem */
public final class C138036pf extends AnonymousClass5ZQ {
    public int A00 = 0;
    public C166387yb A01;
    public C180778lc A02;
    public C55682qk A03;
    public C147237Di A04;
    public C183238pi A05;
    public boolean A06;
    public final Uri A07;
    public final AnonymousClass6OD A08;
    public final C126816Pk A09;

    public void A06() {
        this.A04 = null;
        AnonymousClass6OD r1 = this.A08;
        r1.A0A(true);
        r1.A01();
    }

    public int A02() {
        return (int) this.A08.B6W();
    }

    public int A03() {
        return this.A00;
    }

    public void A04() {
        this.A08.Bmw(false);
    }

    public void A05() {
        AnonymousClass6OD r3 = this.A08;
        C180778lc r7 = this.A02;
        if (r7 == null) {
            r7 = new AnonymousClass88W();
            this.A02 = r7;
        }
        C1686686h r6 = new C1686686h();
        C1691688g r8 = new C1691688g();
        Uri uri = this.A07;
        AnonymousClass7UC r0 = new AnonymousClass7UC();
        r0.A00 = uri;
        AnonymousClass7WW r02 = r0.A00().A02;
        r02.getClass();
        Uri uri2 = r02.A00;
        Object obj = r02.A01;
        if (obj == null) {
            obj = null;
        }
        r3.A08(new AnonymousClass6PL(uri2, r6, r7, r8, obj), true);
    }

    public void A07() {
        this.A08.Bmw(true);
    }

    public void A08() {
        this.A08.Bmw(true);
    }

    public void A09() {
        this.A08.A0A(true);
        C183238pi r0 = this.A05;
        if (r0 != null) {
            r0.Bcl();
        }
    }

    public void A0A(int i) {
        AnonymousClass6OD r3 = this.A08;
        r3.Bl1(r3.B6d(), (long) i);
    }

    public void A0B(MediaPlayer.OnErrorListener onErrorListener) {
    }

    public void A0C(C147237Di r1) {
        this.A04 = r1;
    }

    public void A0D(C183238pi r1) {
        this.A05 = r1;
    }

    public boolean A0F() {
        AnonymousClass6OD r3 = this.A08;
        int BBS = r3.BBS();
        if ((BBS == 3 || BBS == 2) && r3.BBP()) {
            return true;
        }
        return false;
    }

    public boolean A0G(C55682qk r12, float f) {
        this.A03 = r12;
        try {
            AnonymousClass6OD r2 = this.A08;
            r2.A03();
            AnonymousClass6OC r4 = r2.A0M;
            if (AnonymousClass002.A00(r4.A05.A04.A01, f) >= 0.1f) {
                C158477k2 r1 = new C158477k2(f, 1.0f);
                r2.A03();
                C160747oF r22 = r4.A05;
                if (!r22.A04.equals(r1)) {
                    C160747oF A042 = r22.A04(r1);
                    r4.A02++;
                    C18290x4.A1C(((C1692188l) r4.A0B.A0Y).A00, r1, 4);
                    r4.A05(A042, 4, 0, 1, false, false);
                }
            }
            return true;
        } catch (IllegalArgumentException | IllegalStateException unused) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("currSpeed: ");
            A0o.append(-1.0f);
            A0o.append(" , newSpeed: ");
            A0o.append(f);
            r12.A0A("exoaudioplayer/setPlaybackSpeed failed", true, A0o.toString());
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("exoaudioplayer/setPlaybackSpeed failed, currSpeed: ");
            A0o2.append(-1.0f);
            A0o2.append(" , newSpeed: ");
            A0o2.append(f);
            Log.e(A0o2.toString());
            return false;
        }
    }

    public C138036pf(Context context, AnonymousClass1VX r9, File file, int i) {
        C180628lN r2;
        int i2;
        if (r9.A0X(793)) {
            r2 = new AnonymousClass862(new AnonymousClass6OI());
        } else {
            AnonymousClass865 r22 = new AnonymousClass865(context);
            r22.A00 = 1;
            r2 = r22;
        }
        this.A07 = Uri.fromFile(file);
        C126816Pk r1 = new C126816Pk(context);
        this.A09 = r1;
        this.A01 = null;
        this.A06 = false;
        AnonymousClass6OD A002 = AnonymousClass75G.A00(context, new C1685185s(), r2, r1, r9);
        this.A08 = A002;
        C158427jx r6 = new C158427jx(i == 0 ? 2 : 1);
        A002.A03();
        if (!A002.A0G) {
            if (!C162387ry.A0D(A002.A09, r6)) {
                A002.A09 = r6;
                A002.A09(r6, 1, 3);
                C158607kG r12 = A002.A0O;
                if (2 - r6.A01 != 0) {
                    i2 = 3;
                } else {
                    i2 = 0;
                }
                r12.A03(i2);
                C1685685x r3 = A002.A0R;
                AnonymousClass7XD A003 = C158187jZ.A00(r3);
                r3.A03(A003, new C1895291q(r6, 9, A003), 1016);
                Iterator it = A002.A0S.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0g("onAudioAttributesChanged");
                }
            }
            AnonymousClass7ZX r0 = A002.A0L;
            boolean BBP = A002.BBP();
            A002.A03();
            int i3 = -1;
            r0.A00();
            i3 = BBP ? 1 : i3;
            int i4 = 1;
            if (BBP && i3 != 1) {
                i4 = 2;
            }
            A002.A06(i3, i4, BBP);
        }
        A002.AwU(new C1685485v(this));
    }
}
