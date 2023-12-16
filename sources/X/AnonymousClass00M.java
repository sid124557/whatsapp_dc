package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;

/* renamed from: X.00M  reason: invalid class name */
public abstract class AnonymousClass00M extends Activity implements C15910sA, C15820rz {
    public C06290Wz A00 = new C06290Wz();
    public AnonymousClass08A A01 = new AnonymousClass08A(this);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        if (r1 < r0) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0A(java.lang.String[] r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L_0x000f
            int r0 = r3.length
            if (r0 <= 0) goto L_0x000f
            r1 = r3[r2]
            int r0 = r1.hashCode()
            switch(r0) {
                case -645125871: goto L_0x003a;
                case 100470631: goto L_0x002d;
                case 472614934: goto L_0x002a;
                case 1159329357: goto L_0x001d;
                case 1455016274: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            return r2
        L_0x0010:
            java.lang.String r0 = "--autofill"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            goto L_0x0046
        L_0x001d:
            java.lang.String r0 = "--contentcapture"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            goto L_0x0046
        L_0x002a:
            java.lang.String r0 = "--list-dumpables"
            goto L_0x002f
        L_0x002d:
            java.lang.String r0 = "--dump-dumpable"
        L_0x002f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            boolean r0 = X.AnonymousClass0WZ.A01()
            return r0
        L_0x003a:
            java.lang.String r0 = "--translation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
        L_0x0046:
            if (r1 < r0) goto L_0x000f
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00M.A0A(java.lang.String[]):boolean");
    }

    public abstract AnonymousClass0O9 getLifecycle();

    public static Bundle A00(Context context) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 17);
        bundle.putString("title", context.getString(R.string.f11nameremoved));
        return bundle;
    }

    public static C08270df A01(C003203q r0) {
        return r0.A04.A00.A03;
    }

    public static IllegalStateException A02(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("unexpected dialog box: ");
        sb.append(i);
        return new IllegalStateException(sb.toString());
    }

    public static void A05(C004805c r1, int i) {
        r1.A5J(new C17720w6(r1, i));
    }

    public static void A06(C08310eF r2, C003203q r3) {
        C08240dc r1 = new C08240dc(r3.A04.A00.A03);
        r1.A0C(r2, (String) null);
        r1.A00(true);
    }

    public static void A07(C08310eF r2, C003203q r3, String str) {
        C08240dc r1 = new C08240dc(r3.A04.A00.A03);
        r1.A0C(r2, str);
        r1.A00(true);
    }

    public static void A08(C003203q r1) {
        DialogFragment dialogFragment = (DialogFragment) r1.A04.A00.A03.A0D("auth_request_dialog");
        if (dialogFragment != null) {
            dialogFragment.A1L();
        }
    }

    @Deprecated
    public void A5C(AnonymousClass0HE r3) {
        this.A00.put(r3.getClass(), r3);
    }

    @Deprecated
    public void A5D(Class cls) {
        this.A00.get(cls);
    }

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass08A r2 = this.A01;
        AnonymousClass0GC r1 = AnonymousClass0GC.CREATED;
        r2.A07("markState");
        r2.A05(r1);
        super.onSaveInstanceState(bundle);
    }

    public static void A03(Activity activity, int i, int i2) {
        C005205m.A00(activity, i).setVisibility(i2);
    }

    public static void A04(Context context, int i, int i2, Object[] objArr) {
        objArr[i2] = context.getString(i);
    }

    public boolean BqI(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View A0Q = AnonymousClass001.A0Q(this);
        if (A0Q == null || !C06560Yg.A0V(A0Q, keyEvent)) {
            return AnonymousClass0K4.A00(keyEvent, A0Q, this, this);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View A0Q = AnonymousClass001.A0Q(this);
        if (A0Q == null || !C06560Yg.A0V(A0Q, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass00S.A00(this);
    }

    public static final void A09(String[] strArr) {
        A0A(strArr);
    }
}
