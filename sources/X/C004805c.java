package X;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity$3;
import androidx.activity.ComponentActivity$4;
import androidx.activity.ComponentActivity$5;
import androidx.activity.ImmLeaksCleaner;
import androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda0;
import androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda1;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.05c  reason: invalid class name and case insensitive filesystem */
public class C004805c extends AnonymousClass00M implements C15910sA, C16640tj, C15940sD, C17310vJ, C15540rX, C15550rY, C16550ta, C16560tb, C16570tc, C16580td, C16610tg, C17300vI, C14460pj, C14900qS {
    public static final String A0F = "android:support:activity-result";
    public int A00;
    public C17190ui A01;
    public AnonymousClass0N2 A02;
    public final C03600Kv A03;
    public final AnonymousClass0US A04;
    public final AnonymousClass0Ts A05;
    public final AnonymousClass08A A06;
    public final AnonymousClass0PU A07;
    public final AnonymousClass0NQ A08;
    public final CopyOnWriteArrayList A09;
    public final CopyOnWriteArrayList A0A;
    public final CopyOnWriteArrayList A0B;
    public final CopyOnWriteArrayList A0C;
    public final CopyOnWriteArrayList A0D;
    public final AtomicInteger A0E;

    @Deprecated
    public static void A0O() {
    }

    public static /* synthetic */ void A0S(C004805c r8) {
        Bundle A012 = r8.A07.A01.A01(A0F);
        if (A012 != null) {
            AnonymousClass0US r82 = r8.A04;
            ArrayList<Integer> integerArrayList = A012.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = A012.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                r82.A00 = A012.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                r82.A01 = (Random) A012.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                Bundle bundle = r82.A02;
                bundle.putAll(A012.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    Map map = r82.A04;
                    if (map.containsKey(str)) {
                        Object remove = map.remove(str);
                        if (!bundle.containsKey(str)) {
                            r82.A06.remove(remove);
                        }
                    }
                    Integer num = integerArrayList.get(i);
                    String str2 = stringArrayList.get(i);
                    r82.A06.put(num, str2);
                    map.put(str2, num);
                }
            }
        }
    }

    public void A5F() {
        if (this.A02 == null) {
            AnonymousClass0KD r0 = (AnonymousClass0KD) getLastNonConfigurationInstance();
            if (r0 != null) {
                this.A02 = r0.A00;
            }
            if (this.A02 == null) {
                this.A02 = new AnonymousClass0N2();
            }
        }
    }

    public void A5I() {
    }

    public final void A5J(C15520rV r3) {
        C03600Kv r1 = this.A03;
        if (r1.A01 != null) {
            r3.BQ0(r1.A01);
        }
        r1.A00.add(r3);
    }

    public final void A5K(C15520rV r2) {
        this.A03.A00.remove(r2);
    }

    public final void A5L(C15790rw r2) {
        this.A0B.add(r2);
    }

    public final void A5M(C15790rw r2) {
        this.A0B.remove(r2);
    }

    public void A5N(C14960qY r5, AnonymousClass0GC r6, C15910sA r7) {
        AnonymousClass0NQ r0 = this.A08;
        AnonymousClass0O9 lifecycle = r7.getLifecycle();
        Map map = r0.A01;
        AnonymousClass001.A1J(r5, map);
        map.put(r5, new AnonymousClass0L6(lifecycle, new MenuHostHelper$$ExternalSyntheticLambda1(r0, r5, r6)));
    }

    public void A5O(C14960qY r6, C15910sA r7) {
        AnonymousClass0NQ r4 = this.A08;
        r4.A02.add(r6);
        r4.A00.run();
        AnonymousClass0O9 lifecycle = r7.getLifecycle();
        Map map = r4.A01;
        AnonymousClass001.A1J(r6, map);
        map.put(r6, new AnonymousClass0L6(lifecycle, new MenuHostHelper$$ExternalSyntheticLambda0(r4, r6)));
    }

    public void AwY(C14960qY r3) {
        AnonymousClass0NQ r1 = this.A08;
        r1.A02.add(r3);
        r1.A00.run();
    }

    public final void Awa(C15790rw r2) {
        this.A09.add(r2);
    }

    public final void Awc(C15790rw r2) {
        this.A0A.add(r2);
    }

    public final void Awd(C15790rw r2) {
        this.A0C.add(r2);
    }

    public final void Awg(C15790rw r2) {
        this.A0D.add(r2);
    }

    public final AnonymousClass0US B49() {
        return this.A04;
    }

    public AnonymousClass0N3 B6t() {
        C010208a r3 = new C010208a();
        if (getApplication() != null) {
            r3.A00.put(AnonymousClass08X.A02, getApplication());
        }
        C15120qo r0 = C06120Wi.A01;
        Map map = r3.A00;
        map.put(r0, this);
        map.put(C06120Wi.A02, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            map.put(C06120Wi.A00, getIntent().getExtras());
        }
        return r3;
    }

    public C17190ui B6u() {
        Bundle bundle;
        C17190ui r2 = this.A01;
        if (r2 != null) {
            return r2;
        }
        Application application = getApplication();
        if (getIntent() != null) {
            bundle = getIntent().getExtras();
        } else {
            bundle = null;
        }
        AnonymousClass08Z r22 = new AnonymousClass08Z(application, bundle, this);
        this.A01 = r22;
        return r22;
    }

    public final AnonymousClass0Ts BA8() {
        return this.A05;
    }

    public final AnonymousClass0UG BCR() {
        return this.A07.A01;
    }

    public final AnonymousClass0O1 Bid(C15530rW r2, C04520Op r3) {
        return A5E(this.A04, r2, r3);
    }

    public void BjE(C14960qY r3) {
        AnonymousClass0NQ r1 = this.A08;
        r1.A02.remove(r3);
        AnonymousClass001.A1J(r3, r1.A01);
        r1.A00.run();
    }

    public final void BjF(C15790rw r2) {
        this.A09.remove(r2);
    }

    public final void BjG(C15790rw r2) {
        this.A0A.remove(r2);
    }

    public final void BjH(C15790rw r2) {
        this.A0C.remove(r2);
    }

    public final void BjK(C15790rw r2) {
        this.A0D.remove(r2);
    }

    public AnonymousClass0O9 getLifecycle() {
        return this.A06;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.A04.A06(intent, i, i2)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.A05.A00();
    }

    public void onCreate(Bundle bundle) {
        this.A07.A01(bundle);
        C03600Kv r0 = this.A03;
        r0.A01 = this;
        for (C15520rV BQ0 : r0.A00) {
            BQ0.BQ0(this);
        }
        super.onCreate(bundle);
        AnonymousClass00S.A00(this);
        int i = this.A00;
        if (i != 0) {
            setContentView(i);
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        AnonymousClass0NQ r0 = this.A08;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = r0.A02.iterator();
        while (it.hasNext()) {
            ((C08110dL) ((C14960qY) it.next())).A00.A0w(menu, menuInflater);
        }
        return true;
    }

    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            ((C15790rw) it.next()).AwB(new C05260Sq(configuration));
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        Iterator it = this.A08.A02.iterator();
        while (it.hasNext()) {
            ((C08110dL) ((C14960qY) it.next())).A00.A0W(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            ((C15790rw) it.next()).AwB(new C05270Sr(configuration));
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.A08.A02.iterator();
        while (it.hasNext()) {
            ((C08110dL) ((C14960qY) it.next())).A00.A0v(menu);
        }
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.A04.A06(new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr), i, -1) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        AnonymousClass0KD r0;
        AnonymousClass0N2 r1 = this.A02;
        if (r1 == null && ((r0 = (AnonymousClass0KD) getLastNonConfigurationInstance()) == null || (r1 = r0.A00) == null)) {
            return null;
        }
        AnonymousClass0KD r02 = new AnonymousClass0KD();
        r02.A00 = r1;
        return r02;
    }

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass08A r1 = this.A06;
        if (r1 != null) {
            r1.A05(AnonymousClass0GC.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.A07.A02(bundle);
    }

    public C004805c(int i) {
        this();
        this.A00 = i;
    }

    public static /* synthetic */ Bundle A0M(C004805c r4) {
        Bundle A082 = AnonymousClass002.A08();
        AnonymousClass0US r42 = r4.A04;
        Map map = r42.A04;
        A082.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", AnonymousClass002.A0J(map.values()));
        A082.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", AnonymousClass002.A0J(map.keySet()));
        A082.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", AnonymousClass002.A0J(r42.A00));
        A082.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) r42.A02.clone());
        A082.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", r42.A01);
        return A082;
    }

    private void A0N() {
        AnonymousClass001.A0Q(this).setTag(R.id.view_tree_lifecycle_owner, this);
        AnonymousClass001.A0Q(this).setTag(R.id.view_tree_view_model_store_owner, this);
        C02940Ie.A00(AnonymousClass001.A0Q(this), this);
        C02490Gl.A00(AnonymousClass001.A0Q(this), this);
    }

    public final AnonymousClass0O1 A5E(AnonymousClass0US r3, C15530rW r4, C04520Op r5) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("activity_rq#");
        return r3.A00(r4, r5, this, AnonymousClass000.A0h(A0o, this.A0E.getAndIncrement()));
    }

    public AnonymousClass0N2 BEL() {
        if (getApplication() != null) {
            A5F();
            return this.A02;
        }
        throw AnonymousClass001.A0e("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A0N();
        super.addContentView(view, layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            ((C15790rw) it.next()).AwB(configuration);
        }
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = this.A08.A02.iterator();
        while (it.hasNext()) {
            if (((C08110dL) ((C14960qY) it.next())).A00.A0x(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            ((C15790rw) it.next()).AwB(intent);
        }
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.A0D.iterator();
        while (it.hasNext()) {
            ((C15790rw) it.next()).AwB(Integer.valueOf(i));
        }
    }

    public void reportFullyDrawn() {
        try {
            if (C03380Jx.A00()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            Trace.endSection();
        }
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A0N();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public void A5G() {
        getLastNonConfigurationInstance();
    }

    public void A5H() {
        invalidateOptionsMenu();
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void onMultiWindowModeChanged(boolean z) {
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            ((C15790rw) it.next()).AwB(new C05260Sq());
        }
    }

    public void onPictureInPictureModeChanged(boolean z) {
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            ((C15790rw) it.next()).AwB(new C05270Sr());
        }
    }

    public void setContentView(int i) {
        A0N();
        super.setContentView(i);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public C004805c() {
        this.A03 = new C03600Kv();
        this.A08 = new AnonymousClass0NQ(new C10630iG(this));
        this.A06 = new AnonymousClass08A(this);
        AnonymousClass0PU r3 = new AnonymousClass0PU(this);
        this.A07 = r3;
        this.A05 = new AnonymousClass0Ts(new C10640iH(this));
        this.A0E = new AtomicInteger();
        this.A04 = new AnonymousClass0US(this);
        this.A09 = new CopyOnWriteArrayList();
        this.A0D = new CopyOnWriteArrayList();
        this.A0B = new CopyOnWriteArrayList();
        this.A0A = new CopyOnWriteArrayList();
        this.A0C = new CopyOnWriteArrayList();
        AnonymousClass08A r1 = this.A06;
        if (r1 != null) {
            int i = Build.VERSION.SDK_INT;
            r1.A00(new ComponentActivity$3(this));
            this.A06.A00(new ComponentActivity$4(this));
            this.A06.A00(new ComponentActivity$5(this));
            r3.A00();
            C06120Wi.A02(this);
            if (i <= 23) {
                this.A06.A00(new ImmLeaksCleaner(this));
            }
            this.A07.A01.A04(new C02470Gj(this, 0), A0F);
            AnonymousClass00M.A05(this, 0);
            return;
        }
        throw AnonymousClass001.A0e("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public void setContentView(View view) {
        A0N();
        super.setContentView(view);
    }
}
