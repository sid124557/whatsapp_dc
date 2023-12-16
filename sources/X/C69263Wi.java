package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* renamed from: X.3Wi  reason: invalid class name and case insensitive filesystem */
public class C69263Wi implements C84104Ba {
    public AnonymousClass4FU A00;
    public AnonymousClass7KD A01;
    public final Handler A02 = AnonymousClass000.A0A();
    public final C55682qk A03;
    public final C29441ip A04;
    public final C54292oU A05;
    public final C57162tC A06;
    public final AnonymousClass26P A07;
    public final Executor A08 = new C117945sk(this);

    @Deprecated
    public Toast A0C(CharSequence charSequence) {
        Context context = this.A05.A00;
        View A0H = C18310x6.A0H(LayoutInflater.from(context), R.layout.f8nameremoved);
        C18300x5.A0G(A0H, 16908299).setText(charSequence);
        Toast toast = new Toast(context);
        toast.setView(A0H);
        toast.setDuration(0);
        return toast;
    }

    public final void A0E(int i) {
        A0S(new C117705sM((Object) this, i, 7));
    }

    public void A0M(AnonymousClass4FU r4) {
        if (r4 == null && (r4 = this.A00) == null) {
            C626936e.A0D(false, "dialogToast == null");
            A0H(R.string.f11nameremoved, 0);
            return;
        }
        r4.BpA(0, R.string.f11nameremoved);
    }

    public static void A00(C69263Wi r1, Object obj, int i) {
        r1.A0S(new C70043Zq(obj, i));
    }

    public static void A01(C69263Wi r1, Object obj, int i) {
        r1.A0S(new C71293bs(obj, i));
    }

    public static void A02(C69263Wi r1, Object obj, int i) {
        r1.A0S(new C69973Zj(obj, i));
    }

    public static void A03(C69263Wi r1, Object obj, int i) {
        r1.A0S(new C71313bu(obj, i));
    }

    public static void A04(C69263Wi r1, Object obj, Object obj2, int i) {
        r1.A0S(new C70103Zx(obj, i, obj2));
    }

    public static void A05(C69263Wi r1, Object obj, Object obj2, int i) {
        r1.A0S(new C70143a1(obj, i, obj2));
    }

    public static void A06(C69263Wi r1, Object obj, Object obj2, int i) {
        r1.A0S(new C70153a2(obj, i, obj2));
    }

    public static void A07(C69263Wi r1, Object obj, Object obj2, int i) {
        r1.BkS(new C70153a2(obj, i, obj2));
    }

    public static void A08(C69263Wi r1, Object obj, Object obj2, int i) {
        r1.A0S(new C71653cS(obj, i, obj2));
    }

    public static void A09(C69263Wi r1, Object obj, Object obj2, int i) {
        r1.A0S(new C117175rV(obj, i, obj2));
    }

    public static void A0A(C69263Wi r1, Object obj, Object obj2, int i) {
        r1.A0S(new C71353by(obj, i, obj2));
    }

    public static void A0B(C69263Wi r1, Object obj, Object obj2, int i) {
        r1.A0S(new C70173a4(obj, i, obj2));
    }

    public void A0F(int i, int i2) {
        AnonymousClass4FU r0 = this.A00;
        if (r0 != null) {
            r0.Bot(i);
        } else {
            A0H(i, i2);
        }
    }

    public void A0H(int i, int i2) {
        A0P(this.A05.A00.getString(i), i2);
    }

    public void A0I(int i, int i2) {
        A0Q(this.A05.A00.getString(i), i2);
    }

    public void A0K(AnonymousClass4FU r3) {
        if (r3 == null && (r3 = this.A00) == null) {
            C626936e.A0D(false, "dialogToast == null");
            Log.w("app/removeProgressSpinner/ignore dialogToast == null");
            return;
        }
        r3.BjL();
    }

    public void A0N(AnonymousClass4FU r2, int i) {
        if (r2 != null) {
            r2.Bot(i);
        } else {
            A0F(i, 0);
        }
    }

    public void A0O(AnonymousClass4FU r2, String str) {
        if (r2 != null) {
            r2.Bou(str);
        } else {
            A0W(str, 0);
        }
    }

    public void A0P(CharSequence charSequence, int i) {
        View view;
        Context context = this.A05.A00;
        Toast makeText = Toast.makeText(context, charSequence, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i2 <= 28) {
            String str = Build.MANUFACTURER;
            if (("google".equalsIgnoreCase(str) || "oneplus".equalsIgnoreCase(str)) && (view = makeText.getView()) != null) {
                Drawable background = view.getBackground();
                TextView A09 = AnonymousClass002.A09(view, 16908299);
                if (!(background == null || A09 == null)) {
                    background.setColorFilter(AnonymousClass0Y8.A04(context, R.color.f5nameremoved), PorterDuff.Mode.SRC_IN);
                    AnonymousClass0x2.A0q(context, A09, R.color.f5nameremoved);
                }
            }
        }
        makeText.show();
    }

    public void A0R(Runnable runnable) {
        this.A02.removeCallbacks(runnable);
    }

    public void A0S(Runnable runnable) {
        this.A02.post(runnable);
    }

    public void A0T(Runnable runnable, long j) {
        this.A02.postDelayed(runnable, j);
    }

    public void A0W(String str, int i) {
        AnonymousClass4FU r0 = this.A00;
        if (r0 != null) {
            r0.Bou(str);
        } else {
            A0P(str, i);
        }
    }

    public void A0X(String str, String str2, int i) {
        AnonymousClass4FU r0 = this.A00;
        if (r0 != null) {
            r0.Bov(str, str2);
        } else {
            A0P(str2, i);
        }
    }

    public boolean A0Y() {
        if (this.A04.A0F()) {
            return true;
        }
        A0H(C29441ip.A00(this.A05.A00), 0);
        return false;
    }

    public C69263Wi(C55682qk r2, C29441ip r3, C54292oU r4, C57162tC r5, AnonymousClass26P r6) {
        this.A03 = r2;
        this.A05 = r4;
        this.A04 = r3;
        this.A06 = r5;
        this.A07 = r6;
    }

    public void A0D() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("app/progress-spinner/remove dt=");
        C18260x0.A0o(this.A00, A0o);
        A0V("removeProgressSpinner");
        this.A01 = null;
        AnonymousClass4FU r0 = this.A00;
        if (r0 != null) {
            r0.BjL();
        } else {
            AnonymousClass5X0.A02 = false;
        }
        Log.i("app/progress-spinner/remove done");
    }

    public void A0G(int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("app/progress-spinner/show dt=");
        C18260x0.A0o(this.A00, A0o);
        A0V("showProgressSpinner");
        this.A01 = new AnonymousClass7KD(i, i2);
        AnonymousClass4FU r0 = this.A00;
        if (r0 != null) {
            r0.BpA(i, i2);
        }
        Log.i("app/progress-spinner/show done");
    }

    public void A0J(AnonymousClass4FU r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("app/dt/clear dt=");
        A0o.append(r3);
        A0o.append(" dialog_toast=");
        C18260x0.A0o(this.A00, A0o);
        A0V("clearDialogToast");
        AnonymousClass4FU r1 = this.A00;
        if (r1 == r3) {
            if (this.A01 != null) {
                r1.BjL();
            }
            this.A00 = null;
        }
        Log.i("app/dt/clear done");
    }

    public void A0L(AnonymousClass4FU r4) {
        C18260x0.A1R(AnonymousClass001.A0o(), "app/dt/set ", r4);
        A0V("setDialogToast");
        this.A00 = r4;
        AnonymousClass7KD r2 = this.A01;
        if (r2 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("app/dt/set show_progress_data=");
            A0o.append(r2);
            A0o.append(" dialog_toast=");
            C18260x0.A0o(this.A00, A0o);
            AnonymousClass4FU r22 = this.A00;
            AnonymousClass7KD r0 = this.A01;
            r22.BpA(r0.A02, r0.A01);
            if (this.A01.A00 != null) {
                Log.i("app/dt/set/update");
                this.A00.Bru(this.A01.A00);
            }
        }
        Log.i("app/dt/set done");
    }

    public void A0Q(CharSequence charSequence, int i) {
        if (C615631i.A02()) {
            A0P(charSequence, i);
        } else {
            A0S(new C71733ca((Object) charSequence, (Object) this, i, 3));
        }
    }

    public void A0U(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("app/progress-spinner/update-message dt=");
        C18260x0.A0o(this.A00, A0o);
        AnonymousClass7KD r0 = this.A01;
        if (r0 != null) {
            r0.A00 = str;
        } else {
            Log.w("app/progress-spinner/update-message no progress data");
        }
        AnonymousClass4FU r02 = this.A00;
        if (r02 != null) {
            r02.Bru(str);
        }
        Log.i("app/progress-spinner/update-message done");
    }

    public final void A0V(String str) {
        if (!C615631i.A02()) {
            this.A03.A0A("GlobalUI/not-called-on-main-thread", true, str);
        }
    }

    public void BkS(Runnable runnable) {
        if (C615631i.A02()) {
            runnable.run();
        } else {
            A0S(runnable);
        }
    }
}
