package X;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.5UG  reason: invalid class name */
public class AnonymousClass5UG {
    public View A00;
    public C05430Th A01;
    public C05430Th A02;
    public C05430Th A03;
    public final int A04;
    public final C56972sr A05;
    public final C1228265z A06;
    public final AnonymousClass5AM A07;
    public final C56942so A08;
    public final C56982ss A09;
    public final C56892sj A0A;
    public final C620533h A0B;
    public final AnonymousClass3ZH A0C;
    public final AnonymousClass1VX A0D;
    public final C95814uZ A0E;
    public final WeakReference A0F;

    public final void A01(Menu menu, int i, int i2) {
        menu.add(0, 2, i2, i).setIcon(C107335b8.A05(C86664Kz.A0U(this.A0F), R.drawable.ic_btn_call_video, C106545Zk.A03(this.A0D)));
    }

    public final void A02(Menu menu, int i, int i2) {
        C626936e.A0B(true);
        AnonymousClass1VX r4 = this.A0D;
        if (C627436k.A0H(r4) && this.A0B.A0M(this.A0E)) {
            menu.add(0, i, i2, R.string.f11nameremoved).setIcon(C107335b8.A05(C86664Kz.A0U(this.A0F), R.drawable.vec_ic_schedule_call_24dp, C106545Zk.A03(r4)));
        }
    }

    public final C05430Th A00(View view) {
        AnonymousClass1VX r3 = this.A0D;
        boolean A042 = C106545Zk.A04(r3, (C58422vE) null, 4864);
        int i = R.style.f12nameremoved;
        if (A042) {
            i = R.style.f12nameremoved;
        }
        C05430Th r4 = new C05430Th(C86664Kz.A0U(this.A0F), view, 0, 0, i);
        C07890cz r1 = r4.A04;
        if (C106545Zk.A04(r3, (C58422vE) null, 4497)) {
            r1.A0H = true;
        }
        r4.A01 = new C1236669h(this, 0);
        r4.A00 = new AnonymousClass6AJ(this, 0);
        return r4;
    }

    public void A03(View view, int i) {
        C05430Th r5;
        MenuItem add;
        int i2;
        WeakReference weakReference = this.A0F;
        if (weakReference.get() == null || ((Activity) weakReference.get()).isFinishing()) {
            Log.w("GroupCallMenuHelper/launchPopupMenu activity is finished/finishing");
            return;
        }
        this.A00 = view;
        view.setAlpha(0.5f);
        if (i == 0) {
            r5 = this.A03;
            if (r5 == null) {
                r5 = A00(view);
                C07890cz r4 = r5.A04;
                r4.add(0, 1, 1, (int) R.string.f11nameremoved).setIcon(C107335b8.A05(C86664Kz.A0U(weakReference), R.drawable.ic_btn_call_audio, C106545Zk.A03(this.A0D)));
                A02(r4, 3, 2);
                this.A03 = r5;
            }
        } else if (i != 1) {
            r5 = this.A01;
            if (i != 2) {
                if (r5 == null) {
                    r5 = A00(view);
                    C07890cz r2 = r5.A04;
                    A01(r2, R.string.f11nameremoved, 1);
                    A02(r2, 5, 2);
                }
            } else if (r5 == null) {
                r5 = A00(view);
                C07890cz r3 = r5.A04;
                C95814uZ r7 = this.A0E;
                if (r7 instanceof C27991fJ) {
                    if (C627436k.A0B(this.A05, this.A0D, C86664Kz.A0H(this.A0A, (C28011fL) r7))) {
                        add = r3.add(0, 6, 1, (int) R.string.f11nameremoved);
                        i2 = R.drawable.vec_ic_action_voicechat;
                        add.setIcon(C107335b8.A05(C86664Kz.A0U(weakReference), i2, C106545Zk.A03(this.A0D)));
                        A01(r3, R.string.f11nameremoved, 2);
                        A02(r3, 5, 3);
                    }
                }
                add = r3.add(0, 1, 1, (int) R.string.f11nameremoved);
                i2 = R.drawable.ic_btn_call_audio;
                add.setIcon(C107335b8.A05(C86664Kz.A0U(weakReference), i2, C106545Zk.A03(this.A0D)));
                A01(r3, R.string.f11nameremoved, 2);
                A02(r3, 5, 3);
            }
            this.A01 = r5;
        } else {
            r5 = this.A02;
            if (r5 == null) {
                r5 = A00(view);
                C07890cz r22 = r5.A04;
                A01(r22, R.string.f11nameremoved, 1);
                A02(r22, 4, 2);
                this.A02 = r5;
            }
        }
        r5.A00();
    }

    public AnonymousClass5UG(C009707r r2, C56972sr r3, C1228265z r4, AnonymousClass5AM r5, C56942so r6, C56982ss r7, C66473Lo r8, C56892sj r9, C620533h r10, AnonymousClass1VX r11, C95814uZ r12, int i) {
        this.A0D = r11;
        this.A05 = r3;
        this.A09 = r7;
        this.A08 = r6;
        this.A0B = r10;
        this.A07 = r5;
        this.A0E = r12;
        this.A0F = AnonymousClass0x9.A14(r2);
        this.A06 = r4;
        this.A04 = i;
        this.A0A = r9;
        this.A0C = r8.A01(r12);
    }
}
