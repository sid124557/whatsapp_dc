package X;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.00S  reason: invalid class name */
public class AnonymousClass00S extends Fragment {
    public static void A00(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C06700Yv.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new AnonymousClass00S(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static void A01(Activity activity, AnonymousClass0GH r2) {
        if (activity instanceof C15910sA) {
            AnonymousClass0O9 lifecycle = ((C15910sA) activity).getLifecycle();
            if (lifecycle instanceof AnonymousClass08A) {
                ((AnonymousClass08A) lifecycle).A04(r2);
            }
        }
    }

    public final void A02(AnonymousClass0GH r3) {
        if (Build.VERSION.SDK_INT < 29) {
            A01(getActivity(), r3);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        A02(AnonymousClass0GH.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        A02(AnonymousClass0GH.ON_DESTROY);
    }

    public void onPause() {
        super.onPause();
        A02(AnonymousClass0GH.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        A02(AnonymousClass0GH.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        A02(AnonymousClass0GH.ON_START);
    }

    public void onStop() {
        super.onStop();
        A02(AnonymousClass0GH.ON_STOP);
    }
}
