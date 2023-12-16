package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;

/* renamed from: X.03q  reason: invalid class name and case insensitive filesystem */
public class C003203q extends C004805c implements C15730rq, C14870qP {
    public static final String A05 = "android:support:lifecycle";
    public boolean A00;
    public boolean A01;
    public boolean A02 = true;
    public final AnonymousClass08A A03 = new AnonymousClass08A(this);
    public final AnonymousClass0KW A04 = new AnonymousClass0KW(new AnonymousClass07u(this));

    public void A5Z(Intent intent, Bundle bundle, C08310eF r4, int i) {
        if (i == -1) {
            C05680Um.A02(this, intent, bundle, -1);
        } else {
            r4.A0n(intent, i, bundle);
        }
    }

    public void A5a(Intent intent, C08310eF r3, int i) {
        A5Z(intent, (Bundle) null, r3, i);
    }

    private void A0C() {
        this.A07.A01.A04(new C02470Gj(this, 2), A05);
        Awa(new C17950wV(this, 1));
        A5L(new C17950wV(this, 2));
        AnonymousClass00M.A05(this, 2);
    }

    public static void A0D(C003203q r0) {
        r0.A04.A00.A03.A0L();
    }

    public static /* synthetic */ void A0K(C003203q r2) {
        AnonymousClass07u r1 = r2.A04.A00;
        r1.A03.A0e((C08310eF) null, r1, r1);
    }

    public static boolean A0L(C08270df r4, AnonymousClass0GC r5) {
        boolean z = false;
        for (C08310eF r2 : r4.A0Y.A05()) {
            if (r2 != null) {
                if (r2.A0G != null) {
                    z |= A0L(r2.A0T(), r5);
                }
                C08290dn r0 = r2.A0J;
                if (r0 != null) {
                    r0.A00();
                    if (AnonymousClass001.A1U(r0.A00.A02.compareTo(AnonymousClass0GC.STARTED))) {
                        r2.A0J.A00.A05(r5);
                        z = true;
                    }
                }
                if (AnonymousClass001.A1U(r2.A0L.A02.compareTo(AnonymousClass0GC.STARTED))) {
                    r2.A0L.A05(r5);
                    z = true;
                }
            }
        }
        return z;
    }

    public void A5R() {
        this.A03.A04(AnonymousClass0GH.ON_RESUME);
        C08270df A012 = AnonymousClass00M.A01(this);
        AnonymousClass08T.A00(A012);
        A012.A0S(7);
    }

    @Deprecated
    public final void A5W() {
    }

    @Deprecated
    public void A5Y(Intent intent, IntentSender intentSender, Bundle bundle, C08310eF r20, int i, int i2, int i3, int i4) {
        Activity activity;
        Intent intent2 = intent;
        IntentSender intentSender2 = intentSender;
        Bundle bundle2 = bundle;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (i5 == -1) {
            activity = this;
        } else {
            C08310eF r6 = r20;
            if (r6.A0G != null) {
                if (C08270df.A04()) {
                    StringBuilder A0k = AnonymousClass000.A0k(r6, "Fragment ");
                    A0k.append(" received the following in startIntentSenderForResult() requestCode: ");
                    A0k.append(i5);
                    A0k.append(" IntentSender: ");
                    A0k.append(intentSender2);
                    A0k.append(" fillInIntent: ");
                    A0k.append(intent2);
                    AnonymousClass000.A1K(A0k, " options: ", bundle2);
                }
                C08270df A0U = r6.A0U();
                if (A0U.A04 != null) {
                    if (bundle != null) {
                        if (intent == null) {
                            intent2 = new Intent();
                            intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                        }
                        if (C08270df.A05(2)) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("ActivityOptions ");
                            A0o.append(bundle2);
                            A0o.append(" were added to fillInIntent ");
                            A0o.append(intent2);
                            AnonymousClass000.A18(r6, " for fragment ", "FragmentManager", A0o);
                        }
                        intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
                    }
                    AnonymousClass0NZ r0 = new AnonymousClass0NZ(intentSender2);
                    r0.A02 = intent2;
                    r0.A01 = i7;
                    r0.A00 = i6;
                    C06760Zc A002 = r0.A00();
                    A0U.A0D.addLast(new C06740Za(r6.A0V, i5));
                    if (C08270df.A05(2)) {
                        AnonymousClass000.A1E("is launching an IntentSender for result ", "FragmentManager", AnonymousClass000.A0k(r6, "Fragment "));
                    }
                    A0U.A04.A00((C05880Vi) null, A002);
                    return;
                }
                AnonymousClass07u r02 = A0U.A07;
                if (i5 == -1) {
                    activity = r02.A00;
                } else {
                    throw AnonymousClass001.A0e("Starting intent sender with a requestCode requires a FragmentActivity host");
                }
            } else {
                throw AnonymousClass000.A0I(" not attached to Activity", AnonymousClass000.A0k(r6, "Fragment "));
            }
        }
        C05680Um.A01(activity, intent2, intentSender2, bundle2, -1, i6, i7, i8);
    }

    public void A5b(AnonymousClass0P4 r2) {
        AnonymousClass00Y r0;
        if (r2 != null) {
            r0 = new AnonymousClass00Y(r2);
        } else {
            r0 = null;
        }
        AnonymousClass0X0.A03(this, r0);
    }

    public void A5c(AnonymousClass0P4 r2) {
        AnonymousClass00Y r0;
        if (r2 != null) {
            r0 = new AnonymousClass00Y(r2);
        } else {
            r0 = null;
        }
        AnonymousClass0X0.A04(this, r0);
    }

    public C003203q(int i) {
        super(i);
        A0C();
    }

    public static /* synthetic */ Bundle A0B(C003203q r1) {
        r1.A5Q();
        r1.A03.A04(AnonymousClass0GH.ON_STOP);
        return AnonymousClass002.A08();
    }

    public void A5Q() {
        do {
        } while (A0L(AnonymousClass00M.A01(this), AnonymousClass0GC.CREATED));
    }

    public final void A5X(Context context, AttributeSet attributeSet, View view, String str) {
        AnonymousClass00M.A01(this).A0W.onCreateView(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!AnonymousClass00M.A0A(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            AnonymousClass001.A1E(printWriter, System.identityHashCode(this));
            printWriter.println(" State:");
            String A0X = AnonymousClass000.A0X("  ", AnonymousClass000.A0l(str));
            printWriter.print(A0X);
            printWriter.print("mCreated=");
            printWriter.print(this.A00);
            printWriter.print(" mResumed=");
            printWriter.print(this.A01);
            printWriter.print(" mStopped=");
            printWriter.print(this.A02);
            if (getApplication() != null) {
                AnonymousClass0WA.A00(this).A04(A0X, fileDescriptor, printWriter, strArr);
            }
            AnonymousClass00M.A01(this).A0o(str, fileDescriptor, printWriter, strArr);
        }
    }

    public C08270df getSupportFragmentManager() {
        return AnonymousClass00M.A01(this);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        A0D(this);
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A03.A04(AnonymousClass0GH.ON_CREATE);
        C08270df A012 = AnonymousClass00M.A01(this);
        AnonymousClass08T.A00(A012);
        A012.A0S(1);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = AnonymousClass00M.A01(this).A0W.onCreateView(view, str, context, attributeSet);
        if (onCreateView == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass00M.A01(this).A0I();
        this.A03.A04(AnonymousClass0GH.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 6) {
            return false;
        }
        C08270df A012 = AnonymousClass00M.A01(this);
        if (A012.A00 < 1) {
            return false;
        }
        Iterator A002 = C04760Qo.A00(A012);
        while (A002.hasNext()) {
            C08310eF r0 = (C08310eF) A002.next();
            if (r0 != null && r0.A1C(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.A01 = false;
        AnonymousClass00M.A01(this).A0S(5);
        this.A03.A04(AnonymousClass0GH.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        A5R();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        A0D(this);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        A0D(this);
        super.onResume();
        this.A01 = true;
        AnonymousClass00M.A01(this).A0r(true);
    }

    public void onStart() {
        A0D(this);
        super.onStart();
        this.A02 = false;
        if (!this.A00) {
            this.A00 = true;
            C08270df A012 = AnonymousClass00M.A01(this);
            AnonymousClass08T.A00(A012);
            A012.A0S(4);
        }
        AnonymousClass00M.A01(this).A0r(true);
        this.A03.A04(AnonymousClass0GH.ON_START);
        C08270df A013 = AnonymousClass00M.A01(this);
        AnonymousClass08T.A00(A013);
        A013.A0S(5);
    }

    public void onStop() {
        super.onStop();
        this.A02 = true;
        A5Q();
        C08270df A012 = AnonymousClass00M.A01(this);
        A012.A0P = true;
        A012.A0A.A01 = true;
        A012.A0S(4);
        this.A03.A04(AnonymousClass0GH.ON_STOP);
    }

    @Deprecated
    public void A5d(C08310eF r1) {
    }

    @Deprecated
    public void A5P() {
        AnonymousClass0WA.A00(this);
    }

    public void A5S() {
        AnonymousClass0X0.A00(this);
    }

    @Deprecated
    public void A5T() {
        invalidateOptionsMenu();
    }

    public void A5U() {
        AnonymousClass0X0.A01(this);
    }

    public void A5V() {
        AnonymousClass0X0.A02(this);
    }

    public void onStateNotSaved() {
        A0D(this);
    }

    public C003203q() {
        A0C();
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = AnonymousClass00M.A01(this).A0W.onCreateView((View) null, str, context, attributeSet);
        if (onCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return onCreateView;
    }
}
