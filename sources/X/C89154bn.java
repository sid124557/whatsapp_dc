package X;

import android.animation.LayoutTransition;
import android.app.Dialog;
import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.ConversationFragment;
import com.whatsapp.R;
import com.whatsapp.home.ui.HomePlaceholderActivity;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4bn  reason: invalid class name and case insensitive filesystem */
public abstract class C89154bn extends C131756e8 implements AnonymousClass49T, C182178nz, C84524Cr, C184308ra, AnonymousClass8s7, C835949a, C836049b {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = 0;
    public Intent A03;
    public Point A04;
    public View A05;
    public View A06;
    public C179038iV A07;
    public AnonymousClass67C A08;
    public C97154xi A09;
    public AnonymousClass5KL A0A;
    public boolean A0B = false;
    public boolean A0C = false;
    public final C15790rw A0D = new AnonymousClass6A8(this, 0);

    public final void A79() {
        View view;
        Resources resources;
        int i;
        this.A04 = null;
        int i2 = this.A01;
        if (i2 != -1 && (view = this.A06) != null) {
            View findViewById = view.findViewById(i2);
            View findViewById2 = this.A06.findViewById(this.A00);
            double A012 = (double) C107065ad.A01(this);
            double A002 = (double) C107065ad.A00(this);
            boolean A1U = AnonymousClass001.A1U(((Math.max(A012, A002) / Math.min(A012, A002)) > 1.45d ? 1 : ((Math.max(A012, A002) / Math.min(A012, A002)) == 1.45d ? 0 : -1)));
            if ((findViewById instanceof LinearLayout) && (findViewById2 instanceof LinearLayout)) {
                LinearLayout.LayoutParams A0U = AnonymousClass001.A0U(findViewById);
                LinearLayout.LayoutParams A0U2 = AnonymousClass001.A0U(findViewById2);
                Resources resources2 = getResources();
                if (A1U) {
                    A0U.weight = (float) resources2.getInteger(R.integer.f7nameremoved);
                    resources = getResources();
                    i = R.integer.f7nameremoved;
                } else {
                    A0U.weight = (float) resources2.getInteger(R.integer.f7nameremoved);
                    resources = getResources();
                    i = R.integer.f7nameremoved;
                }
                A0U2.weight = (float) resources.getInteger(i);
                findViewById.setLayoutParams(A0U);
                findViewById2.setLayoutParams(A0U2);
            }
        }
    }

    public void A75() {
        View view;
        ViewGroup A0J;
        if (this.A09.A0F() && (view = this.A06) != null && this.A07 != null && (A0J = C86644Kx.A0J(view, this.A00)) != null) {
            View view2 = this.A05;
            if (view2 == null || !view2.isAttachedToWindow()) {
                this.A05 = new HomePlaceholderActivity.HomePlaceholderView((Context) this.A07, (AttributeSet) null);
            }
            View view3 = this.A05;
            if (view3 != null) {
                C86624Kv.A0v(view3, -1);
                AnonymousClass5Yj.A0A(this, A0J, R.attr.f3nameremoved, R.color.f5nameremoved);
                if (this.A05.getParent() instanceof ViewGroup) {
                    C86664Kz.A0l(this.A05).removeView(this.A05);
                }
                A0J.addView(this.A05);
                View view4 = this.A05;
                if (view4 instanceof C15110qn) {
                    this.A06.A00((C15110qn) view4);
                }
            }
        }
    }

    public void A77() {
        ViewGroup A0J;
        View view;
        View view2 = this.A00;
        if (view2 != null && (A0J = C86644Kx.A0J(view2, this.A00)) != null && (view = this.A05) != null) {
            A0J.removeView(view);
            View view3 = this.A05;
            if (view3 instanceof C15110qn) {
                this.A06.A01((C15110qn) view3);
            }
            this.A05 = null;
        }
    }

    public void A78() {
        View findViewById;
        boolean A0F = this.A09.A0F();
        View view = this.A06;
        if (view != null && A0F && (findViewById = view.findViewById(this.A00)) != null) {
            A75();
            findViewById.setVisibility(0);
            A79();
            A7A();
        }
    }

    public final void A7A() {
        View view;
        if (this.A09.A0I() && (view = this.A06) != null) {
            AnonymousClass6BG.A00(view.getViewTreeObserver(), this, 2);
        }
    }

    public final void A7B(int i) {
        View findViewById;
        View view = this.A06;
        if (view != null && (findViewById = view.findViewById(this.A01)) != null) {
            ViewGroup A0l = C86664Kz.A0l(findViewById);
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.addTransitionListener(new C162527sK(A0l, this));
            A0l.setLayoutTransition(layoutTransition);
            findViewById.setVisibility(i);
        }
    }

    public Point B5y() {
        View findViewById;
        Point point = this.A04;
        if (point != null) {
            return point;
        }
        View view = this.A06;
        if (!(view == null || (findViewById = view.findViewById(this.A00)) == null)) {
            this.A04 = new Point(findViewById.getWidth(), findViewById.getHeight());
        }
        return this.A04;
    }

    public void BP5(Intent intent) {
        if (this.A09.A0F()) {
            AnonymousClass5KL r7 = this.A0A;
            if (r7 == null) {
                r7 = new AnonymousClass5KL(this.A06, TimeUnit.MILLISECONDS);
                this.A0A = r7;
            }
            r7.A01 = new C124356By(intent, 0, this);
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = r7.A00;
            long j2 = r7.A02;
            if (uptimeMillis - j < j2) {
                r7.A03.removeCallbacks(r7.A05);
            } else if (C18310x6.A0A(j) > 3000) {
                r7.A03.post(r7.A05);
                r7.A00 = SystemClock.uptimeMillis();
                return;
            }
            r7.A03.postDelayed(r7.A05, j2);
            r7.A00 = SystemClock.uptimeMillis();
            return;
        }
        startActivity(intent);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        C97154xi r1 = this.A09;
        if (r1.A0I()) {
            Iterator A032 = C61102zi.A03(r1);
            while (A032.hasNext()) {
                AnonymousClass5UN r12 = (AnonymousClass5UN) A032.next();
                if (r12 instanceof C95694uG) {
                    C113245l7 r13 = ((C95694uG) r12).A00;
                    C94264qq r0 = r13.A45;
                    if (r0 != null && r0.isShowing()) {
                        r13.A45.dismiss();
                    } else if (C113245l7.A09(r13) != null && r13.A2X()) {
                        r13.A0d();
                    }
                }
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void A5h() {
        C93064np r0;
        if (A74() != null && (r0 = A74().A02) != null) {
            r0.A01.A00();
        }
    }

    public void A5w() {
        C93064np r0;
        if (A74() != null && (r0 = A74().A02) != null) {
            r0.A03.A0l();
        }
    }

    public void A6O(int i) {
        C93064np r0;
        if (A74() != null && (r0 = A74().A02) != null) {
            C113245l7 r1 = r0.A03;
            C87574Tl r02 = r1.A1q;
            if (r02 != null) {
                r02.A00.A00();
            }
            C87604Ty r03 = r1.A1w;
            if (r03 != null) {
                r03.A0E();
            }
        }
    }

    public void A6m() {
        if (A74() != null) {
            A76();
            A75();
            this.A09.A0D(false);
            return;
        }
        super.A6m();
    }

    public ConversationFragment A74() {
        return (ConversationFragment) getSupportFragmentManager().A0D("com.whatsapp.HomeActivity.ConversationFragment");
    }

    public void A76() {
        C08310eF A0D2;
        C08270df supportFragmentManager = getSupportFragmentManager();
        if (!isFinishing() && !supportFragmentManager.A0K && !supportFragmentManager.A0t() && (A0D2 = supportFragmentManager.A0D("com.whatsapp.HomeActivity.ConversationFragment")) != null) {
            C08240dc r0 = new C08240dc(supportFragmentManager);
            r0.A07(A0D2);
            r0.A03();
        }
    }

    public void Awp(AnonymousClass3ZH r2, C95814uZ r3) {
        if (A74() != null) {
            A74().Awp(r2, r3);
        }
    }

    public void BMB(long j, boolean z) {
        if (A74() != null) {
            A74().BMB(j, z);
        }
    }

    public void BMl() {
        if (A74() != null) {
            A74().BMl();
        }
    }

    public boolean BPr(C95814uZ r2, int i) {
        C93064np r0;
        if (A74() == null || (r0 = A74().A02) == null) {
            return true;
        }
        return r0.A03.A2d(r2, i);
    }

    public void BQP(long j, boolean z) {
        if (A74() != null) {
            A74().BQP(j, z);
        }
    }

    public void BY7(PickerSearchDialogFragment pickerSearchDialogFragment) {
        if (A74() != null) {
            A74().BY7(pickerSearchDialogFragment);
        }
    }

    public void Bdh(AnonymousClass0R2 r4) {
        C93064np r2;
        super.Bdh(r4);
        if (A74() != null && (r2 = A74().A02) != null) {
            C112975kg r0 = r2.A00;
            C107405bG.A07(C112975kg.A00(r0), AnonymousClass34K.A00(C112975kg.A00(r0)));
            AnonymousClass4SG.A3x(r2.A03.A2O, false);
        }
    }

    public void Bdi(AnonymousClass0R2 r3) {
        C93064np r1;
        super.Bdi(r3);
        if (A74() != null && (r1 = A74().A02) != null) {
            r1.A00.A08();
            AnonymousClass4SG.A3x(r1.A03.A2O, true);
        }
    }

    public void BfD() {
        if (A74() != null) {
            A74().BfD();
        }
    }

    public void Bom(DialogFragment dialogFragment) {
        if (A74() != null) {
            A74().Bom(dialogFragment);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (A74() != null) {
            A74().A0k(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (A74() != null) {
            C93064np r0 = A74().A02;
            if (r0 != null) {
                r0.A03.A0i();
                return;
            }
            return;
        }
        super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        Intent intent;
        super.onConfigurationChanged(configuration);
        this.A09.A0A(this);
        boolean A0F = this.A09.A0F();
        int i = configuration.screenWidthDp;
        if (i != this.A02) {
            this.A02 = i;
            if (A0F != this.A0B) {
                this.A0B = A0F;
                if (A0F) {
                    A78();
                } else {
                    C08310eF A0D2 = getSupportFragmentManager().A0D("com.whatsapp.HomeActivity.ConversationFragment");
                    if (A0D2 == null || !A0D2.A19()) {
                        intent = null;
                    } else {
                        Intent intent2 = getIntent();
                        intent = C627736r.A08(this, C18290x4.A1W(intent2) ? 1 : 0);
                        C162457s7.A0D(intent);
                        intent.setData(intent2.getData());
                        intent.putExtras(intent2);
                    }
                    this.A04 = null;
                    View view = this.A06;
                    if (view != null) {
                        View findViewById = view.findViewById(this.A00);
                        if (findViewById != null) {
                            A76();
                            A77();
                            this.A09.A0D(true);
                            findViewById.setVisibility(8);
                        }
                        A7A();
                    }
                    if (intent != null) {
                        startActivity(intent);
                    }
                }
            }
        }
        if (this.A0B) {
            A79();
        }
    }

    public void onContentChanged() {
        C93064np r0;
        super.onContentChanged();
        if (A74() != null && (r0 = A74().A02) != null) {
            C89174bs.A00(r0);
            r0.A01.A00();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A03 = getIntent();
    }

    public Dialog onCreateDialog(int i) {
        if (A74() == null) {
            return super.onCreateDialog(i);
        }
        return A74().A02.A03.A0W(i);
    }

    public void onDestroy() {
        super.onDestroy();
        Intent intent = this.A03;
        if (intent != null) {
            setIntent(intent);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (A74() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        C93064np r0 = A74().A02;
        if (r0 != null) {
            return r0.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (A74() == null) {
            return super.onKeyUp(i, keyEvent);
        }
        C93064np r0 = A74().A02;
        if (r0 != null) {
            return r0.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public void onProvideAssistContent(AssistContent assistContent) {
        super.onProvideAssistContent(assistContent);
        if (A74() != null) {
            A74().A1I(assistContent);
        }
    }

    public void onRestart() {
        C93064np r0;
        if (!(A74() == null || (r0 = A74().A02) == null)) {
            r0.A03.A0n();
        }
        super.onRestart();
    }

    public void onResume() {
        boolean z;
        View findViewById;
        super.onResume();
        if (this.A09.A0H()) {
            boolean A1T = C86654Ky.A1T(this.A0A.A01, "otp_split_mode_user_choice");
            if (this.A0C) {
                z = true;
            } else {
                View view = this.A06;
                z = false;
                if (!(view == null || (findViewById = view.findViewById(this.A00)) == null)) {
                    z = C86654Ky.A1U(findViewById);
                }
            }
            if (A1T != z) {
                Intent A022 = C627736r.A02(this);
                A022.addFlags(268468224);
                startActivity(A022);
                overridePendingTransition(R.anim.f0nameremoved, R.anim.f0nameremoved);
            }
        }
    }

    public void onStart() {
        super.onStart();
        this.A09.A0B(this, this.A0D);
    }

    public void onStop() {
        super.onStop();
        this.A09.A0C(this.A0D);
    }
}
