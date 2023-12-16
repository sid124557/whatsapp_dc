package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;
import com.whatsapp.android.di.BaseEntryPoint;
import com.whatsapp.dialogs.ProgressDialogFragment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4ea  reason: invalid class name and case insensitive filesystem */
public class C89654ea extends AnonymousClass1Hf implements AnonymousClass4FU, AnonymousClass64N {
    public static final long A0P = 500;
    public static final String A0Q = "screenshot.jpg";
    public View A00;
    public ViewGroup A01;
    public Toolbar A02;
    public C55682qk A03;
    public C64393Dh A04;
    public C69263Wi A05;
    public C66663Mh A06;
    public C29441ip A07;
    public C620633i A08;
    public AnonymousClass33p A09;
    public C54412og A0A;
    public AnonymousClass487 A0B;
    public AnonymousClass5Y0 A0C;
    public AnonymousClass1VX A0D;
    public boolean A0E = true;
    public int A0F;
    public long A0G;
    public Intent A0H;
    public View A0I;
    public ViewGroup A0J;
    public C87644Uc A0K;
    public Integer A0L;
    public boolean A0M;
    public final List A0N = AnonymousClass001.A0s();
    public final AnonymousClass5X0 A0O = new AnonymousClass5X0(this);

    public static C50472iE A4K(int i, int i2) {
        C50472iE A002 = LegacyMessageDialogFragment.A00(new Object[0], i);
        A002.A05 = i2;
        A002.A0B = new Object[0];
        A002.A00 = i;
        return A002;
    }

    private C87644Uc A4L() {
        return (C87644Uc) AnonymousClass4L0.A0F(new C123916Ag(this, 0), this).A01(C87644Uc.class);
    }

    public static void A4X(C89654ea r1, int i, int i2) {
        r1.Box(new Object[0], i, i2);
    }

    public void A6R(Intent intent) {
        A6T(intent, false);
    }

    public void BpY(Intent intent, int i) {
        A6S(intent, i, false);
    }

    private void A4N() {
        Intent intent = this.A0H;
        if (intent != null) {
            Integer num = this.A0L;
            if (num != null) {
                startActivityForResult(intent, num.intValue());
            } else {
                startActivity(intent);
            }
            if (this.A0M) {
                finish();
            }
            this.A0H = null;
            this.A0L = null;
            this.A0M = false;
        }
    }

    private boolean A4u() {
        BaseEntryPoint baseEntryPoint = (BaseEntryPoint) C389229y.A02(this, BaseEntryPoint.class);
        Resources.Theme theme = getTheme();
        TypedValue A0B2 = AnonymousClass4L0.A0B();
        theme.resolveAttribute(R.attr.f3nameremoved, A0B2, true);
        if (!(A0B2.type == 18 && A0B2.data == 0)) {
            baseEntryPoint.Avy();
            if (!C1001059l.A07) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void A5d(C08310eF r3) {
        this.A0N.add(AnonymousClass0x9.A14(r3));
    }

    public void A5n(boolean z) {
        AnonymousClass0R8 supportActionBar;
        if (z || this.A0I != null) {
            int i = 0;
            if (this.A0I == null) {
                View A0g = C86664Kz.A0g(getLayoutInflater(), R.layout.f8nameremoved);
                View findViewById = A0g.findViewById(R.id.progress_bar);
                this.A0I = findViewById;
                if (!(findViewById == null || (supportActionBar = getSupportActionBar()) == null)) {
                    supportActionBar.A0O(true);
                    supportActionBar.A0H(A0g, new C001902e(-2, -2, 21));
                }
            }
            View view = this.A0I;
            if (view != null) {
                if (!z) {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    public void A6H() {
    }

    public void A6I() {
    }

    public void A6J() {
    }

    public void A6K() {
    }

    public void A6L() {
    }

    public void A6S(Intent intent, int i, boolean z) {
        if (!this.A0E) {
            this.A0H = intent;
            this.A0L = Integer.valueOf(i);
            this.A0M = z;
            return;
        }
        startActivityForResult(intent, i);
        if (z) {
            finish();
        }
    }

    public void A6T(Intent intent, boolean z) {
        boolean z2;
        if (!this.A0E) {
            this.A0H = intent;
            z2 = false;
        } else {
            startActivity(intent);
            z2 = true;
        }
        if (!z) {
            return;
        }
        if (z2) {
            finish();
        } else {
            this.A0M = true;
        }
    }

    public void A6U(Configuration configuration) {
        this.A0K.A0D(configuration);
    }

    public void A6d(String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDimension(R.dimen.f6nameremoved));
        C86634Kw.A0R(this).A0I(C107345b9.A03(this, textPaint, this.A0C, str));
    }

    public void A6e(String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDimension(R.dimen.f6nameremoved));
        setTitle(C107345b9.A03(this, textPaint, this.A0C, str));
    }

    public void Bdh(AnonymousClass0R2 r3) {
        Toolbar toolbar = this.A02;
        if (toolbar != null) {
            AnonymousClass0YY.A06(toolbar, 0);
        }
    }

    public void Bdi(AnonymousClass0R2 r3) {
        Toolbar toolbar = this.A02;
        if (toolbar != null) {
            AnonymousClass0YY.A06(toolbar, 4);
        }
    }

    public void BjL() {
        AnonymousClass5X0 r1 = this.A0O;
        AnonymousClass5X0.A02 = false;
        if (!C621433s.A03(r1.A01)) {
            ProgressDialogFragment progressDialogFragment = r1.A00;
            if (progressDialogFragment != null) {
                progressDialogFragment.A1L();
            }
            r1.A00 = null;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((this.A0E || SystemClock.elapsedRealtime() - this.A0G > 500 || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 2)) && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public AnonymousClass1VX getAbProps() {
        return this.A0D;
    }

    public View getContentView() {
        return this.A00;
    }

    public C55682qk getCrashLogs() {
        return this.A03;
    }

    public AnonymousClass5Y0 getEmojiLoader() {
        return this.A0C;
    }

    public C69263Wi getGlobalUI() {
        return this.A05;
    }

    public C66663Mh getServerProps() {
        return this.A06;
    }

    public C620633i getSystemServices() {
        return this.A08;
    }

    public AnonymousClass33p getWaSharedPreferences() {
        return this.A09;
    }

    public void onBackPressed() {
        if (Build.VERSION.SDK_INT < 29) {
            onStateNotSaved();
        }
        if (this.A0E) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        this.A0F = C06280Wy.A00;
        C107555bV.A08(getWindow(), this.A00);
        C87644Uc A4L = A4L();
        this.A0K = A4L;
        A4L.A00 = AnonymousClass001.A0M(this).uiMode & 48;
        C86604Kt.A1M(this, this.A0K.A01, 0);
        boolean A4u = A4u();
        if (A4u) {
            getTheme().applyStyle(R.style.f12nameremoved, true);
        }
        super.onCreate(bundle);
        if (C102805Ki.A00(this.A00)) {
            Resources.Theme theme = getTheme();
            TypedValue A0B2 = AnonymousClass4L0.A0B();
            theme.resolveAttribute(R.attr.f3nameremoved, A0B2, true);
            if (A0B2.type == 1) {
                i = A0B2.data;
            } else {
                i = R.style.f12nameremoved;
            }
            theme.applyStyle(i, true);
        }
        if (A4u) {
            A6N();
        }
    }

    public void onDestroy() {
        AnonymousClass5X0 r1 = this.A0O;
        ProgressDialogFragment progressDialogFragment = r1.A00;
        if (progressDialogFragment != null) {
            progressDialogFragment.A1L();
        }
        r1.A00 = null;
        this.A0H = null;
        this.A0M = false;
        super.onDestroy();
    }

    public void onPause() {
        this.A05.A0J(this);
        super.onPause();
        this.A0E = false;
        this.A0G = SystemClock.elapsedRealtime();
    }

    public void setContentView(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            C06560Yg.A0M(view, 8);
        }
        if (this.A01 != null) {
            this.A0J.addView(view, -1, -1);
            view = this.A01;
        }
        this.A00 = view;
        super.setContentView(view);
    }

    public C89654ea(int i) {
        super(i);
    }

    public static C89654ea A4J(Context context) {
        Activity A002 = C621633u.A00(context);
        if (A002 instanceof C89654ea) {
            return (C89654ea) A002;
        }
        return null;
    }

    public static Iterator A4M(C89654ea r0) {
        return r0.A6G().iterator();
    }

    /* JADX INFO: finally extract failed */
    private void A4O(int i) {
        boolean z = false;
        Toolbar toolbar = (Toolbar) getLayoutInflater().inflate(i, (ViewGroup) null, false);
        toolbar.setFitsSystemWindows(true);
        TypedValue A0B2 = AnonymousClass4L0.A0B();
        getTheme().resolveAttribute(R.attr.f3nameremoved, A0B2, true);
        TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(A0B2.resourceId, AnonymousClass0KC.A00);
        try {
            float dimension = obtainStyledAttributes.getDimension(12, 0.0f);
            obtainStyledAttributes.recycle();
            toolbar.setElevation(dimension);
            TypedValue A0B3 = AnonymousClass4L0.A0B();
            getTheme().resolveAttribute(R.attr.f3nameremoved, A0B3, true);
            if (A0B3.type == 18 && A0B3.data != 0) {
                z = true;
            }
            if (z) {
                this.A01 = new FrameLayout(this);
                FrameLayout frameLayout = new FrameLayout(this);
                this.A0J = frameLayout;
                this.A01.addView(frameLayout, -1, -1);
            } else {
                LinearLayout linearLayout = new LinearLayout(this);
                this.A01 = linearLayout;
                this.A0J = linearLayout;
                linearLayout.setOrientation(1);
            }
            this.A01.addView(toolbar, -1, C86614Ku.A03(this));
            setSupportActionBar(toolbar);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static void A4P(long j, long j2) {
        long A0E2 = AnonymousClass0x7.A0E(j);
        if (A0E2 < j2) {
            SystemClock.sleep(j2 - A0E2);
        }
    }

    public static void A4W(C89654ea r2) {
        r2.BpA(R.string.f11nameremoved, R.string.f11nameremoved);
    }

    public static /* synthetic */ void A4Z(C89654ea r2, Integer num) {
        if (num.intValue() == 1) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(r2.getClass().getCanonicalName());
            C18260x0.A1L(A0o, " ActivityLifecycleCallbacks: Recreating");
            r2.recreate();
        }
    }

    public Uri A6D() {
        StringBuilder sb;
        String str;
        FileOutputStream A0h;
        View rootView = AnonymousClass001.A0Q(this).getRootView();
        rootView.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
        rootView.setDrawingCacheEnabled(false);
        File A002 = C64393Dh.A00(this.A04, A0Q);
        try {
            A0h = AnonymousClass0x9.A0h(A002);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 75, A0h);
            A0h.flush();
            A0h.close();
        } catch (FileNotFoundException e) {
            e = e;
            sb = AnonymousClass001.A0o();
            str = "File not found: ";
        } catch (IOException e2) {
            e = e2;
            sb = AnonymousClass001.A0o();
            str = "IOException: ";
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return C627536m.A01(this, A002);
        throw th;
        C18260x0.A16(str, sb, e);
        return C627536m.A01(this, A002);
    }

    public Window A6E(String str) {
        Dialog dialog;
        C08310eF A0D2 = getSupportFragmentManager().A0D(str);
        if (!(A0D2 instanceof DialogFragment) || (dialog = ((DialogFragment) A0D2).A03) == null) {
            return null;
        }
        return dialog.getWindow();
    }

    public DialogFragment A6F(Class cls) {
        if (BHW()) {
            return null;
        }
        C08310eF A0D2 = getSupportFragmentManager().A0D(cls.getName());
        if (A0D2 instanceof DialogFragment) {
            return (DialogFragment) A0D2;
        }
        return null;
    }

    public List A6G() {
        ArrayList A0s = AnonymousClass001.A0s();
        for (Reference reference : this.A0N) {
            C08310eF r1 = (C08310eF) reference.get();
            if (r1 != null && r1.A16()) {
                A0s.add(r1);
            }
        }
        return A0s;
    }

    public void A6M() {
        View view;
        if (!isFinishing() && (view = this.A00) != null) {
            view.postDelayed(new C117645sG((Object) this, 11), 300);
        }
    }

    public void A6N() {
        A4O(R.layout.f8nameremoved);
    }

    public void A6O(int i) {
    }

    public void A6P(int i, int i2) {
        View view;
        if (!BHW()) {
            AnonymousClass5X0 r3 = this.A0O;
            if (r3.A00 == null) {
                ProgressDialogFragment A002 = ProgressDialogFragment.A00(0, i);
                r3.A00 = A002;
                A002.A1O(r3.A01.getSupportFragmentManager(), AnonymousClass5X0.A03);
            }
            AnonymousClass5X0.A02 = true;
            if (!isFinishing() && (view = this.A00) != null) {
                view.postDelayed(new C117645sG((Object) this, 11), (long) i2);
            }
        }
    }

    public void A6Q(DialogInterface.OnKeyListener onKeyListener, int i, int i2) {
        if (!BHW()) {
            AnonymousClass5X0 r1 = this.A0O;
            if (r1.A00 == null) {
                ProgressDialogFragment A002 = ProgressDialogFragment.A00(i, i2);
                r1.A00 = A002;
                A002.A00 = onKeyListener;
                A002.A1O(r1.A01.getSupportFragmentManager(), AnonymousClass5X0.A03);
            }
            AnonymousClass5X0.A02 = true;
        }
    }

    public void A6V(DialogFragment dialogFragment, String str) {
        if (!BHW()) {
            C08270df supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.A0D(str) == null) {
                dialogFragment.A1O(supportFragmentManager, str);
            }
        }
    }

    public void A6W(C181548mw r3, int i, int i2, int i3) {
        if (!BHW()) {
            C50472iE A4K = A4K(i2, i);
            AnonymousClass4SG.A3h(A4K, r3, 4, i3);
            C18270x1.A0t(A4K.A00(), this);
        }
    }

    public void A6X(C181548mw r4, int i, int i2, int i3) {
        if (!BHW()) {
            C50472iE A002 = LegacyMessageDialogFragment.A00(AnonymousClass4L0.A0U(), i);
            A002.A00 = i;
            A002.A01(new C1892590p(2), i2);
            C1891190b r0 = new C1891190b(r4, 1);
            A002.A04 = i3;
            A002.A07 = r0;
            C18270x1.A0t(A002.A00(), this);
        }
    }

    public void A6Y(C181548mw r4, int i, int i2, int i3, int i4) {
        if (!BHW()) {
            C50472iE A4K = A4K(i2, i);
            AnonymousClass4SG.A3h(A4K, r4, 7, i3);
            C1892590p r0 = new C1892590p(1);
            A4K.A04 = i4;
            A4K.A07 = r0;
            C18270x1.A0t(A4K.A00(), this);
        }
    }

    public void A6Z(C181548mw r4, C181548mw r5, int i, int i2, int i3) {
        if (!BHW()) {
            C50472iE A002 = LegacyMessageDialogFragment.A00(AnonymousClass4L0.A0U(), i);
            A002.A00 = i;
            AnonymousClass4SG.A3h(A002, r4, 8, i2);
            C1891190b r0 = new C1891190b(r5, 9);
            A002.A04 = i3;
            A002.A07 = r0;
            C18270x1.A0t(A002.A00(), this);
        }
    }

    public void A6a(C181548mw r4, C181548mw r5, int i, int i2, int i3, int i4) {
        if (!BHW()) {
            C50472iE A4K = A4K(i2, i);
            AnonymousClass4SG.A3h(A4K, r4, 2, i3);
            C1891190b r0 = new C1891190b(r5, 3);
            A4K.A04 = i4;
            A4K.A07 = r0;
            C18270x1.A0t(A4K.A00(), this);
        }
    }

    public void A6b(C181548mw r4, C181548mw r5, int i, int i2, int i3, int i4) {
        if (!BHW()) {
            C50472iE A4K = A4K(i2, i);
            AnonymousClass4SG.A3h(A4K, r4, 5, i3);
            C1891190b r0 = new C1891190b(r5, 6);
            A4K.A04 = i4;
            A4K.A07 = r0;
            Bon(A4K.A00(), (String) null);
        }
    }

    public void A6c(String str) {
        if (!BHW()) {
            C08270df supportFragmentManager = getSupportFragmentManager();
            C08240dc r1 = new C08240dc(supportFragmentManager);
            C08310eF A0D2 = supportFragmentManager.A0D(str);
            if (A0D2 != null) {
                r1.A07(A0D2);
                r1.A02();
            }
        }
    }

    public void A6f(String str) {
        if (!BHW()) {
            this.A0O.A00((String) null, str);
        }
    }

    public void A6g(String str, String str2) {
        if (!BHW()) {
            this.A0O.A00(str, str2);
        }
    }

    public boolean A6h() {
        if (AnonymousClass4SG.A40(this)) {
            return false;
        }
        boolean A022 = C29441ip.A02(this);
        int i = R.string.f11nameremoved;
        if (A022) {
            i = R.string.f11nameremoved;
        }
        Bot(i);
        return true;
    }

    public boolean A6i(int i) {
        if (AnonymousClass4SG.A40(this)) {
            return false;
        }
        Bot(i);
        return true;
    }

    public boolean BHW() {
        return C621433s.A03(this);
    }

    public void Bon(DialogFragment dialogFragment, String str) {
        if (!BHW()) {
            AnonymousClass344.A02(dialogFragment, getSupportFragmentManager(), str);
        }
    }

    public void Boo(DialogFragment dialogFragment) {
        if (!BHW()) {
            AnonymousClass344.A00(dialogFragment, getSupportFragmentManager());
        }
    }

    public void Bot(int i) {
        if (!BHW()) {
            C50472iE A002 = LegacyMessageDialogFragment.A00(AnonymousClass4L0.A0U(), i);
            A002.A00 = i;
            C18270x1.A0t(A002.A00(), this);
        }
    }

    @Deprecated
    public void Bou(String str) {
        if (!BHW()) {
            C50472iE r0 = new C50472iE();
            r0.A08 = str;
            C18270x1.A0t(r0.A00(), this);
        }
    }

    public void Bov(String str, String str2) {
        if (!BHW()) {
            C50472iE r0 = new C50472iE();
            r0.A08 = str2;
            r0.A09 = str;
            C18270x1.A0t(r0.A00(), this);
        }
    }

    public void Bow(C181548mw r4, Object[] objArr, int i, int i2, int i3) {
        if (!BHW()) {
            C50472iE A002 = LegacyMessageDialogFragment.A00(objArr, i2);
            Object[] A0U = AnonymousClass4L0.A0U();
            A002.A05 = i;
            A002.A0B = A0U;
            A002.A00 = i2;
            AnonymousClass4SG.A3h(A002, r4, 0, i3);
            C1892590p r1 = new C1892590p(0);
            A002.A04 = R.string.f11nameremoved;
            A002.A07 = r1;
            C18270x1.A0t(A002.A00(), this);
        }
    }

    public void Box(Object[] objArr, int i, int i2) {
        if (!BHW()) {
            C50472iE A002 = LegacyMessageDialogFragment.A00(objArr, i2);
            Object[] A0U = AnonymousClass4L0.A0U();
            A002.A05 = i;
            A002.A0B = A0U;
            A002.A00 = i2;
            C18270x1.A0t(A002.A00(), this);
        }
    }

    public void Bp9(int i) {
        if (!BHW()) {
            BpA(0, i);
        }
    }

    public void BpA(int i, int i2) {
        if (!BHW()) {
            AnonymousClass5X0 r1 = this.A0O;
            if (r1.A00 == null) {
                ProgressDialogFragment A002 = ProgressDialogFragment.A00(i, i2);
                r1.A00 = A002;
                A002.A1O(r1.A01.getSupportFragmentManager(), AnonymousClass5X0.A03);
            }
            AnonymousClass5X0.A02 = true;
        }
    }

    public AnonymousClass0R2 Bpz(C16910uE r4) {
        AnonymousClass0R2 Bpz = super.Bpz(r4);
        if (Bpz != null) {
            Bpz.A06();
        }
        View findViewById = findViewById(R.id.action_mode_close_button);
        if (findViewById != null) {
            C86614Ku.A1H(findViewById, this, 0);
        }
        return Bpz;
    }

    public void Bru(String str) {
        StringBuilder A0o;
        String str2;
        if (!BHW()) {
            ProgressDialogFragment progressDialogFragment = this.A0O.A00;
            if (progressDialogFragment == null) {
                A0o = AnonymousClass001.A0o();
                str2 = "dialogtoast/update-progress-message/progress-spinner-not-shown \"";
            } else {
                Dialog dialog = progressDialogFragment.A03;
                if (dialog == null) {
                    A0o = AnonymousClass001.A0o();
                    str2 = "dialogtoast/update-progress-message/null-dialog/ \"";
                } else if (!(dialog instanceof ProgressDialog)) {
                    A0o = AnonymousClass001.A0o();
                    str2 = "dialogtoast/update-progress-message/dialog-type-not-progress-dialog/ \"";
                } else {
                    ((AlertDialog) dialog).setMessage(str);
                    return;
                }
            }
            A0o.append(str2);
            C18260x0.A0t(str, "\"", A0o);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A6U(configuration);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onRestart() {
        super.onRestart();
        if (C06280Wy.A00 != this.A0F) {
            recreate();
        }
    }

    public void onResume() {
        super.onResume();
        this.A05.A0L(this);
        this.A0E = true;
        A4N();
    }

    public void onStart() {
        super.onStart();
        this.A0K.A0D(AnonymousClass001.A0M(this));
    }

    public void setSupportActionBar(Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
        this.A02 = toolbar;
    }

    public C89654ea() {
    }

    public void setContentView(int i) {
        setContentView(C86604Kt.A0F(getLayoutInflater(), i));
    }
}
