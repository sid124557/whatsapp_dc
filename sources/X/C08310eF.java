package X;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0eF  reason: invalid class name and case insensitive filesystem */
public class C08310eF implements C15910sA, C16640tj, C15940sD, C17310vJ, C15540rX, ComponentCallbacks, View.OnCreateContextMenuListener {
    public static final Object A0p = AnonymousClass002.A0D();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = -1;
    public int A05;
    public Bundle A06;
    public Bundle A07;
    public Bundle A08;
    public SparseArray A09;
    public LayoutInflater A0A;
    public View A0B;
    public ViewGroup A0C;
    public C04050Mp A0D;
    public C08310eF A0E;
    public C08310eF A0F;
    public AnonymousClass07u A0G;
    public C08270df A0H = new AnonymousClass07w();
    public C08270df A0I;
    public C08290dn A0J;
    public AnonymousClass0GC A0K = AnonymousClass0GC.RESUMED;
    public AnonymousClass08A A0L;
    public AnonymousClass08M A0M = AnonymousClass08M.A01();
    public C17190ui A0N;
    public AnonymousClass0PU A0O;
    public Boolean A0P = null;
    public Boolean A0Q;
    public Runnable A0R = new C10960is(this);
    public String A0S;
    public String A0T;
    public String A0U = null;
    public String A0V = UUID.randomUUID().toString();
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g = true;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l = true;
    public final C04090Mt A0m = new C009507l(this);
    public final ArrayList A0n = AnonymousClass001.A0s();
    public final AtomicInteger A0o = new AtomicInteger();

    public void A0a() {
        this.A0X = true;
    }

    public void A0c() {
        this.A0X = true;
    }

    public void A0d() {
        this.A0X = true;
    }

    public void A0e() {
        this.A0X = true;
    }

    public void A0f() {
        this.A0X = true;
    }

    public void A0g() {
        this.A0X = true;
    }

    public void A0h() {
        this.A0X = true;
    }

    public void A0m(Intent intent) {
        AnonymousClass07u r0 = this.A0G;
        if (r0 != null) {
            AnonymousClass0RN.A00(r0.A01, intent, (Bundle) null);
            return;
        }
        throw AnonymousClass000.A0I(" not attached to Activity", AnonymousClass000.A0j(this));
    }

    @Deprecated
    public void A0o(Bundle bundle) {
        this.A0X = true;
    }

    public void A0p(Bundle bundle) {
        this.A0X = true;
        A0t(bundle);
        C08270df r1 = this.A0H;
        if (r1.A00 < 1) {
            AnonymousClass08T.A00(r1);
            r1.A0S(1);
        }
    }

    public void A0r(Bundle bundle) {
        this.A0X = true;
    }

    @Deprecated
    public void A1F(Activity activity) {
        this.A0X = true;
    }

    public void A1G(Context context) {
        this.A0X = true;
        AnonymousClass07u r0 = this.A0G;
        if (r0 != null) {
            Activity activity = r0.A00;
            this.A0X = false;
            A1F(activity);
        }
    }

    public final AnonymousClass0O1 Bid(C15530rW r8, C04520Op r9) {
        C18050wf r4 = new C18050wf(this, 0);
        if (this.A04 <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            C009607m r1 = new C009607m(r8, r9, r4, this, atomicReference);
            if (this.A04 >= 0) {
                r1.A00();
            } else {
                this.A0n.add(r1);
            }
            return new AnonymousClass03t(r9, this, atomicReference);
        }
        throw AnonymousClass000.A0I(" is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).", AnonymousClass000.A0j(this));
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.A0X = true;
    }

    public void onLowMemory() {
        this.A0X = true;
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        A0n(intent, i, (Bundle) null);
    }

    public static void A0D(DialogFragment dialogFragment) {
        dialogFragment.A08 = new C10950ir(dialogFragment);
        dialogFragment.A04 = new C17780wE(dialogFragment, 0);
        dialogFragment.A05 = new AnonymousClass0Z1(dialogFragment);
        dialogFragment.A01 = 0;
        dialogFragment.A02 = 0;
        dialogFragment.A09 = true;
        dialogFragment.A0E = true;
        dialogFragment.A00 = -1;
        dialogFragment.A07 = new C09920gy(dialogFragment, 8);
        dialogFragment.A0B = false;
    }

    public final int A0F() {
        C08310eF r0;
        AnonymousClass0GC r1 = this.A0K;
        if (r1 == AnonymousClass0GC.INITIALIZED || (r0 = this.A0E) == null) {
            return r1.ordinal();
        }
        return Math.min(r1.ordinal(), r0.A0F());
    }

    public final Bundle A0H() {
        Bundle bundle = this.A06;
        if (bundle != null) {
            return bundle;
        }
        throw AnonymousClass000.A0I(" does not have any arguments.", AnonymousClass000.A0j(this));
    }

    public final LayoutInflater A0I() {
        LayoutInflater layoutInflater = this.A0A;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater A1E = A1E((Bundle) null);
        this.A0A = A1E;
        return A1E;
    }

    public final View A0J() {
        View view = this.A0B;
        if (view != null) {
            return view;
        }
        throw AnonymousClass000.A0I(" did not return a View from onCreateView() or this was called before onCreateView().", AnonymousClass000.A0j(this));
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = this.A02;
        if (i != 0) {
            return AnonymousClass001.A0R(layoutInflater, viewGroup, i);
        }
        return null;
    }

    public final C04050Mp A0M() {
        C04050Mp r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        C04050Mp r02 = new C04050Mp();
        this.A0D = r02;
        return r02;
    }

    public final C08310eF A0N() {
        C08310eF r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        Context A1D = A1D();
        StringBuilder A0l2 = AnonymousClass000.A0l("Fragment ");
        if (A1D == null) {
            A0l2.append(this);
            throw AnonymousClass000.A0I(" is not attached to any Fragment or host", A0l2);
        }
        A0l2.append(this);
        A0l2.append(" is not a child Fragment, it is directly attached to ");
        throw AnonymousClass001.A0e(AnonymousClass000.A0R(A1D(), A0l2));
    }

    public C08310eF A0O(String str) {
        if (str.equals(this.A0V)) {
            return this;
        }
        return this.A0H.A0Y.A03(str);
    }

    public final C08310eF A0P(boolean z) {
        String str;
        if (z) {
            AnonymousClass080 r4 = new AnonymousClass080(this);
            AnonymousClass0Y2 r3 = AnonymousClass0Y2.A01;
            AnonymousClass0Y2.A03(r4);
            AnonymousClass0T5 A002 = AnonymousClass0Y2.A00(this);
            if (A002.A01.contains(AnonymousClass0G2.DETECT_TARGET_FRAGMENT_USAGE)) {
                AnonymousClass000.A0y(A002, r3, r4, this);
            }
        }
        C08310eF r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        C08270df r02 = this.A0I;
        if (r02 == null || (str = this.A0U) == null) {
            return null;
        }
        return r02.A0Y.A02(str);
    }

    public final C003203q A0Q() {
        AnonymousClass07u r0 = this.A0G;
        if (r0 == null) {
            return null;
        }
        return (C003203q) r0.A00;
    }

    public AnonymousClass0O3 A0S() {
        return new C009807s(this);
    }

    public final C08270df A0T() {
        if (this.A0G != null) {
            return this.A0H;
        }
        throw AnonymousClass000.A0I(" has not been attached yet.", AnonymousClass000.A0j(this));
    }

    public final C08270df A0U() {
        C08270df r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0I(" not associated with a fragment manager.", AnonymousClass000.A0j(this));
    }

    public C15910sA A0V() {
        C08290dn r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A0e("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @Deprecated
    public void A0b() {
    }

    public void A0i() {
        ViewGroup viewGroup;
        if (this.A0D != null && A0M().A0E) {
            if (this.A0G == null) {
                A0M().A0E = false;
            } else if (Looper.myLooper() != this.A0G.A02.getLooper()) {
                this.A0G.A02.postAtFrontOfQueue(new C10970it(this));
            } else {
                C04050Mp r1 = this.A0D;
                if (r1 != null) {
                    r1.A0E = false;
                }
                if (this.A0B != null && (viewGroup = this.A0C) != null && this.A0I != null) {
                    AnonymousClass0UN A012 = AnonymousClass0UN.A01(viewGroup);
                    A012.A04();
                    this.A0G.A02.post(new C11850kZ(this, A012));
                }
            }
        }
    }

    public final void A0j() {
        this.A0L = new AnonymousClass08A(this);
        this.A0O = new AnonymousClass0PU(this);
        this.A0N = null;
        ArrayList arrayList = this.A0n;
        C04090Mt r1 = this.A0m;
        if (arrayList.contains(r1)) {
            return;
        }
        if (this.A04 >= 0) {
            r1.A00();
        } else {
            arrayList.add(r1);
        }
    }

    @Deprecated
    public void A0n(Intent intent, int i, Bundle bundle) {
        if (this.A0G != null) {
            C08270df A0U2 = A0U();
            if (A0U2.A03 != null) {
                A0U2.A0D.addLast(new C06740Za(this.A0V, i));
                if (!(intent == null || bundle == null)) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                A0U2.A03.A00((C05880Vi) null, intent);
                return;
            }
            AnonymousClass07u r1 = A0U2.A07;
            if (i == -1) {
                AnonymousClass0RN.A00(r1.A01, intent, bundle);
                return;
            }
            throw AnonymousClass001.A0e("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw AnonymousClass000.A0I(" not attached to Activity", AnonymousClass000.A0j(this));
    }

    public void A0t(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.A0H.A0V(parcelable);
            C08270df r1 = this.A0H;
            AnonymousClass08T.A00(r1);
            r1.A0S(1);
        }
    }

    public void A0u(Bundle bundle) {
        C08270df r0 = this.A0I;
        if (r0 == null || !r0.A0t()) {
            this.A06 = bundle;
            return;
        }
        throw AnonymousClass001.A0e("Fragment already added and state has been saved");
    }

    public void A0v(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A0H.A0L();
        this.A0h = true;
        this.A0J = new C08290dn(this, BEL());
        View A0K2 = A0K(bundle, layoutInflater, viewGroup);
        this.A0B = A0K2;
        C08290dn r0 = this.A0J;
        if (A0K2 != null) {
            r0.A00();
            this.A0B.setTag(R.id.view_tree_lifecycle_owner, this.A0J);
            this.A0B.setTag(R.id.view_tree_view_model_store_owner, this.A0J);
            C02940Ie.A00(this.A0B, this.A0J);
            this.A0M.A0H(this.A0J);
        } else if (r0.A00 != null) {
            throw AnonymousClass001.A0e("Called getViewLifecycleOwner() but onCreateView() returned null");
        } else {
            this.A0J = null;
        }
    }

    public void A0z(AnonymousClass0ZZ r2) {
        Bundle bundle;
        if (this.A0I == null) {
            if (r2 == null || (bundle = r2.A00) == null) {
                bundle = null;
            }
            this.A07 = bundle;
            return;
        }
        throw AnonymousClass001.A0e("Fragment already added");
    }

    @Deprecated
    public void A10(C08310eF r6, int i) {
        C08270df r0;
        if (r6 != null) {
            AnonymousClass081 r4 = new AnonymousClass081(this, r6, i);
            AnonymousClass0Y2 r3 = AnonymousClass0Y2.A01;
            AnonymousClass0Y2.A03(r4);
            AnonymousClass0T5 A002 = AnonymousClass0Y2.A00(this);
            if (A002.A01.contains(AnonymousClass0G2.DETECT_TARGET_FRAGMENT_USAGE)) {
                AnonymousClass000.A0y(A002, r3, r4, this);
            }
        }
        C08270df r1 = this.A0I;
        if (r6 != null) {
            r0 = r6.A0I;
        } else {
            r0 = null;
        }
        if (r1 == null || r0 == null || r1 == r0) {
            C08310eF r12 = r6;
            while (r12 != null) {
                if (!r12.equals(this)) {
                    r12 = r12.A0P(false);
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("Setting ");
                    A0o2.append(r6);
                    A0o2.append(" as the target of ");
                    A0o2.append(this);
                    throw AnonymousClass000.A0F(" would create a target cycle", A0o2);
                }
            }
            if (r6 == null) {
                this.A0U = null;
                this.A0F = null;
            } else if (this.A0I == null || r6.A0I == null) {
                this.A0U = null;
                this.A0F = r6;
            } else {
                this.A0U = r6.A0V;
                this.A0F = null;
            }
            this.A05 = i;
            return;
        }
        throw AnonymousClass000.A0F(" must share the same FragmentManager to be set as a target fragment", AnonymousClass000.A0j(r6));
    }

    @Deprecated
    public void A13(boolean z) {
        if (this.A0b != z) {
            this.A0b = z;
            if (A16() && !A17()) {
                this.A0G.A04.invalidateOptionsMenu();
            }
        }
    }

    public void A14(boolean z) {
        if (this.A0g != z) {
            this.A0g = z;
            if (this.A0b && A16() && !A17()) {
                this.A0G.A04.invalidateOptionsMenu();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r6 != false) goto L_0x004e;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A15(boolean r6) {
        /*
            r5 = this;
            X.085 r4 = new X.085
            r4.<init>(r5, r6)
            X.0Y2 r3 = X.AnonymousClass0Y2.A01
            X.AnonymousClass0Y2.A03(r4)
            X.0T5 r2 = X.AnonymousClass0Y2.A00(r5)
            java.util.Set r1 = r2.A01
            X.0G2 r0 = X.AnonymousClass0G2.DETECT_SET_USER_VISIBLE_HINT
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x001b
            X.AnonymousClass000.A0y(r2, r3, r4, r5)
        L_0x001b:
            boolean r0 = r5.A0l
            r4 = 5
            if (r0 != 0) goto L_0x0045
            if (r6 == 0) goto L_0x0045
            int r0 = r5.A04
            if (r0 >= r4) goto L_0x0045
            X.0df r3 = r5.A0I
            if (r3 == 0) goto L_0x0045
            boolean r0 = r5.A16()
            if (r0 == 0) goto L_0x0045
            boolean r0 = r5.A0f
            if (r0 == 0) goto L_0x0045
            X.0WE r2 = r3.A0G(r5)
            X.0eF r1 = r2.A02
            boolean r0 = r1.A0Y
            if (r0 == 0) goto L_0x0045
            boolean r0 = r3.A0L
            if (r0 == 0) goto L_0x005c
            r0 = 1
            r3.A0M = r0
        L_0x0045:
            r5.A0l = r6
            int r0 = r5.A04
            if (r0 >= r4) goto L_0x004e
            r0 = 1
            if (r6 == 0) goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            r5.A0Y = r0
            android.os.Bundle r0 = r5.A07
            if (r0 == 0) goto L_0x005b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r5.A0Q = r0
        L_0x005b:
            return
        L_0x005c:
            r0 = 0
            r1.A0Y = r0
            r2.A04()
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08310eF.A15(boolean):void");
    }

    public final boolean A16() {
        if (this.A0G == null || !this.A0W) {
            return false;
        }
        return true;
    }

    public final boolean A17() {
        C08310eF r0;
        if (this.A0c) {
            return true;
        }
        if (this.A0I == null || (r0 = this.A0E) == null || !r0.A17()) {
            return false;
        }
        return true;
    }

    public final boolean A18() {
        C08310eF r0;
        if (!this.A0g) {
            return false;
        }
        if (this.A0I == null || (r0 = this.A0E) == null || r0.A18()) {
            return true;
        }
        return false;
    }

    public boolean A1C(MenuItem menuItem) {
        if (this.A0c) {
            return false;
        }
        if (A1A(menuItem)) {
            return true;
        }
        C08270df r2 = this.A0H;
        if (r2.A00 < 1) {
            return false;
        }
        Iterator A002 = C04760Qo.A00(r2);
        while (A002.hasNext()) {
            C08310eF r0 = (C08310eF) A002.next();
            if (r0 != null && r0.A1C(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public Context A1D() {
        AnonymousClass07u r0 = this.A0G;
        if (r0 == null) {
            return null;
        }
        return r0.A01;
    }

    public LayoutInflater A1E(Bundle bundle) {
        AnonymousClass07u r0 = this.A0G;
        if (r0 != null) {
            C003203q r1 = r0.A04;
            LayoutInflater cloneInContext = r1.getLayoutInflater().cloneInContext(r1);
            cloneInContext.setFactory2(this.A0H.A0W);
            return cloneInContext;
        }
        throw AnonymousClass001.A0e("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r2 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (X.C08270df.A05(3) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Could not find Application instance from Context ");
        r1.append(A0G().getApplicationContext());
        android.util.Log.d("FragmentManager", X.AnonymousClass000.A0X(", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory", r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C17190ui B6u() {
        /*
            r3 = this;
            X.0df r0 = r3.A0I
            if (r0 == 0) goto L_0x0055
            X.0ui r1 = r3.A0N
            if (r1 != 0) goto L_0x004b
            android.content.Context r0 = r3.A0G()
            android.content.Context r2 = r0.getApplicationContext()
        L_0x0010:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0053
            boolean r0 = r2 instanceof android.app.Application
            if (r0 == 0) goto L_0x004c
            android.app.Application r2 = (android.app.Application) r2
            if (r2 != 0) goto L_0x0042
        L_0x001c:
            r0 = 3
            boolean r0 = X.C08270df.A05(r0)
            if (r0 == 0) goto L_0x0042
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Could not find Application instance from Context "
            r1.append(r0)
            android.content.Context r0 = r3.A0G()
            android.content.Context r0 = r0.getApplicationContext()
            r1.append(r0)
            java.lang.String r0 = ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r1)
        L_0x0042:
            android.os.Bundle r0 = r3.A06
            X.08Z r1 = new X.08Z
            r1.<init>(r2, r0, r3)
            r3.A0N = r1
        L_0x004b:
            return r1
        L_0x004c:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L_0x0010
        L_0x0053:
            r2 = 0
            goto L_0x001c
        L_0x0055:
            java.lang.String r0 = "Can't access ViewModels from detached fragment"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08310eF.B6u():X.0ui");
    }

    public final AnonymousClass0UG BCR() {
        return this.A0O.A01;
    }

    public AnonymousClass0N2 BEL() {
        C08270df r2 = this.A0I;
        if (r2 == null) {
            throw AnonymousClass001.A0e("Can't access ViewModels from detached fragment");
        } else if (A0F() != 1) {
            HashMap hashMap = r2.A0A.A04;
            AnonymousClass0N2 r1 = (AnonymousClass0N2) hashMap.get(this.A0V);
            if (r1 != null) {
                return r1;
            }
            AnonymousClass0N2 r12 = new AnonymousClass0N2();
            hashMap.put(this.A0V, r12);
            return r12;
        } else {
            throw AnonymousClass001.A0e("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public AnonymousClass0O9 getLifecycle() {
        return this.A0L;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        AnonymousClass000.A1A(this, sb);
        AnonymousClass000.A1J(sb, "{", this);
        sb.append("}");
        sb.append(" (");
        sb.append(this.A0V);
        int i = this.A03;
        if (i != 0) {
            AnonymousClass000.A1G(" id=0x", sb, i);
        }
        String str = this.A0T;
        if (str != null) {
            sb.append(" tag=");
            sb.append(str);
        }
        return AnonymousClass000.A0e(sb);
    }

    public C08310eF() {
        A0j();
    }

    public static Resources A09(C08310eF r0) {
        return r0.A0G().getResources();
    }

    public static TextView A0A(View view, int i) {
        return (TextView) C06560Yg.A02(view, i);
    }

    public static C05550Ty A0B(C08310eF r1) {
        return new AnonymousClass0XL(r1.A0R()).A01(EncBackupViewModel.class);
    }

    public static void A0C(TextView textView, C08310eF r2, int i) {
        textView.setText(r2.A0W(i));
    }

    public final Context A0G() {
        Context A1D = A1D();
        if (A1D != null) {
            return A1D;
        }
        throw AnonymousClass000.A0I(" not attached to a context.", AnonymousClass000.A0j(this));
    }

    public final C003203q A0R() {
        C003203q A0Q2 = A0Q();
        if (A0Q2 != null) {
            return A0Q2;
        }
        throw AnonymousClass000.A0I(" not attached to an activity.", AnonymousClass000.A0j(this));
    }

    public final CharSequence A0W(int i) {
        return A09(this).getText(i);
    }

    public final String A0X(int i) {
        return A09(this).getString(i);
    }

    public final String A0Y(int i, Object... objArr) {
        return A09(this).getString(i, objArr);
    }

    public void A0Z() {
        A0j();
        this.A0S = this.A0V;
        this.A0V = UUID.randomUUID().toString();
        this.A0W = false;
        this.A0i = false;
        this.A0a = false;
        this.A0e = false;
        this.A0j = false;
        this.A00 = 0;
        this.A0I = null;
        this.A0H = new AnonymousClass07w();
        this.A0G = null;
        this.A03 = 0;
        this.A01 = 0;
        this.A0T = null;
        this.A0c = false;
        this.A0Z = false;
    }

    @Deprecated
    public void A0k(int i, int i2, Intent intent) {
        if (C08270df.A04()) {
            StringBuilder A0j2 = AnonymousClass000.A0j(this);
            A0j2.append(" received the following in onActivityResult(): requestCode: ");
            A0j2.append(i);
            A0j2.append(" resultCode: ");
            A0j2.append(i2);
            AnonymousClass000.A1K(A0j2, " data: ", intent);
        }
    }

    public void A0s(Bundle bundle) {
        A0q(bundle);
        this.A0O.A02(bundle);
        bundle.putParcelable("android:support:fragments", this.A0H.A08());
    }

    public void A0w(Bundle bundle, View view) {
    }

    @Deprecated
    public void A0y(Menu menu, MenuInflater menuInflater) {
    }

    public void A11(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        AnonymousClass001.A1E(printWriter, this.A03);
        printWriter.print(" mContainerId=#");
        AnonymousClass001.A1E(printWriter, this.A01);
        printWriter.print(" mTag=");
        printWriter.println(this.A0T);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.A04);
        printWriter.print(" mWho=");
        printWriter.print(this.A0V);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.A00);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.A0W);
        printWriter.print(" mRemoving=");
        printWriter.print(this.A0i);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.A0a);
        printWriter.print(" mInLayout=");
        printWriter.println(this.A0e);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.A0c);
        printWriter.print(" mDetached=");
        printWriter.print(this.A0Z);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.A0g);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.A0b);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.A0k);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.A0l);
        if (this.A0I != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.A0I);
        }
        if (this.A0G != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.A0G);
        }
        if (this.A0E != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.A0E);
        }
        if (this.A06 != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.A06);
        }
        if (this.A07 != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.A07);
        }
        if (this.A09 != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.A09);
        }
        if (this.A08 != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.A08);
        }
        C08310eF A0P2 = A0P(false);
        if (A0P2 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(A0P2);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.A05);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        C04050Mp r0 = this.A0D;
        if (r0 == null) {
            z = false;
        } else {
            z = r0.A0F;
        }
        printWriter.println(z);
        C04050Mp r02 = this.A0D;
        if (!(r02 == null || r02.A01 == 0)) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            C04050Mp r03 = this.A0D;
            if (r03 == null) {
                i4 = 0;
            } else {
                i4 = r03.A01;
            }
            printWriter.println(i4);
        }
        C04050Mp r04 = this.A0D;
        if (!(r04 == null || r04.A02 == 0)) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            C04050Mp r05 = this.A0D;
            if (r05 == null) {
                i3 = 0;
            } else {
                i3 = r05.A02;
            }
            printWriter.println(i3);
        }
        C04050Mp r06 = this.A0D;
        if (!(r06 == null || r06.A04 == 0)) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            C04050Mp r07 = this.A0D;
            if (r07 == null) {
                i2 = 0;
            } else {
                i2 = r07.A04;
            }
            printWriter.println(i2);
        }
        C04050Mp r08 = this.A0D;
        if (!(r08 == null || r08.A05 == 0)) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            C04050Mp r09 = this.A0D;
            if (r09 == null) {
                i = 0;
            } else {
                i = r09.A05;
            }
            printWriter.println(i);
        }
        if (this.A0C != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.A0C);
        }
        if (this.A0B != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.A0B);
        }
        if (A1D() != null) {
            AnonymousClass0WA.A00(this).A04(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("Child ");
        A0o2.append(this.A0H);
        printWriter.println(AnonymousClass000.A0X(":", A0o2));
        this.A0H.A0o(AnonymousClass000.A0X("  ", AnonymousClass000.A0l(str)), fileDescriptor, printWriter, strArr);
    }

    public final boolean A19() {
        View view;
        if (!A16() || A17() || (view = this.A0B) == null || view.getWindowToken() == null || this.A0B.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r2 == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (X.C08270df.A05(3) == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Could not find Application instance from Context ");
        r1.append(A0G().getApplicationContext());
        android.util.Log.d("FragmentManager", X.AnonymousClass000.A0X(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory", r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0N3 B6t() {
        /*
            r4 = this;
            android.content.Context r0 = r4.A0G()
            android.content.Context r2 = r0.getApplicationContext()
        L_0x0008:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0063
            boolean r0 = r2 instanceof android.app.Application
            if (r0 == 0) goto L_0x005c
            if (r2 != 0) goto L_0x0038
        L_0x0012:
            r0 = 3
            boolean r0 = X.C08270df.A05(r0)
            if (r0 == 0) goto L_0x0038
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Could not find Application instance from Context "
            r1.append(r0)
            android.content.Context r0 = r4.A0G()
            android.content.Context r0 = r0.getApplicationContext()
            r1.append(r0)
            java.lang.String r0 = ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r1)
        L_0x0038:
            X.08a r3 = new X.08a
            r3.<init>()
            if (r2 == 0) goto L_0x0046
            X.0qo r1 = X.AnonymousClass08X.A02
            java.util.Map r0 = r3.A00
            r0.put(r1, r2)
        L_0x0046:
            X.0qo r0 = X.C06120Wi.A01
            java.util.Map r2 = r3.A00
            r2.put(r0, r4)
            X.0qo r0 = X.C06120Wi.A02
            r2.put(r0, r4)
            android.os.Bundle r1 = r4.A06
            if (r1 == 0) goto L_0x005b
            X.0qo r0 = X.C06120Wi.A00
            r2.put(r0, r1)
        L_0x005b:
            return r3
        L_0x005c:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L_0x0008
        L_0x0063:
            r2 = 0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08310eF.B6t():X.0N3");
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        A0R().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void A0q(Bundle bundle) {
    }

    @Deprecated
    public void A0x(Menu menu) {
    }

    public void A12(boolean z) {
    }

    public boolean A1A(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public boolean A1B(MenuItem menuItem) {
        return false;
    }

    public Animation A0L(int i, int i2, boolean z) {
        return null;
    }

    @Deprecated
    public void A0l(int i, String[] strArr, int[] iArr) {
    }
}
