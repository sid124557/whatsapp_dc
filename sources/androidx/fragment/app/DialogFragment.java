package androidx.fragment.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00R;
import X.AnonymousClass07t;
import X.AnonymousClass0O3;
import X.C009807s;
import X.C02940Ie;
import X.C08230db;
import X.C08240dc;
import X.C08270df;
import X.C08310eF;
import X.C15930sC;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.whatsapp.R;

public class DialogFragment extends C08310eF implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public int A00;
    public int A01;
    public int A02;
    public Dialog A03;
    public DialogInterface.OnCancelListener A04;
    public DialogInterface.OnDismissListener A05;
    public Handler A06;
    public C15930sC A07;
    public Runnable A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public void A0c() {
        this.A0X = true;
        Dialog dialog = this.A03;
        if (dialog != null) {
            this.A0F = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.A03.dismiss();
            if (!this.A0C) {
                onDismiss(this.A03);
            }
            this.A03 = null;
            this.A0B = false;
        }
    }

    public void A0d() {
        this.A0X = true;
        if (!this.A0D && !this.A0C) {
            this.A0C = true;
        }
        this.A0M.A0F(this.A07);
    }

    public void A0g() {
        this.A0X = true;
        Dialog dialog = this.A03;
        if (dialog != null) {
            this.A0F = false;
            dialog.show();
            View decorView = this.A03.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            C02940Ie.A00(decorView, this);
        }
    }

    public void A0h() {
        this.A0X = true;
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void A0r(Bundle bundle) {
        Bundle bundle2;
        this.A0X = true;
        if (this.A03 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.A03.onRestoreInstanceState(bundle2);
        }
    }

    public Dialog A1J(Bundle bundle) {
        if (C08270df.A05(3)) {
            Log.d("FragmentManager", AnonymousClass000.A0P(this, "onCreateDialog called for DialogFragment ", AnonymousClass001.A0o()));
        }
        return new AnonymousClass00R(A0G(), A1H());
    }

    public void A1K() {
        A1Q(false, false);
    }

    public void A1L() {
        A1Q(true, false);
    }

    public void A1M(int i, int i2) {
        if (C08270df.A05(2)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Setting style and theme for DialogFragment ");
            A0o.append(this);
            A0o.append(" to ");
            A0o.append(i);
            Log.d("FragmentManager", AnonymousClass000.A0Y(", ", A0o, i2));
        }
        this.A01 = i;
        if (i == 2) {
            this.A02 = 16973913;
        }
        if (i2 != 0) {
            this.A02 = i2;
        }
    }

    public void A1N(int i, Dialog dialog) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void A1O(C08270df r3, String str) {
        this.A0C = false;
        this.A0D = true;
        C08240dc r1 = new C08240dc(r3);
        r1.A0H = true;
        r1.A0C(this, str);
        r1.A00(false);
    }

    public AnonymousClass0O3 A0S() {
        return new AnonymousClass07t(this, new C009807s(this));
    }

    public void A0q(Bundle bundle) {
        Dialog dialog = this.A03;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.A01;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.A02;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.A09;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.A0E;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.A00;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public int A1H() {
        return this.A02;
    }

    public final Dialog A1I() {
        Dialog dialog = this.A03;
        if (dialog != null) {
            return dialog;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DialogFragment ");
        A0o.append(this);
        throw AnonymousClass000.A0I(" does not have a Dialog.", A0o);
    }

    public void A1P(boolean z) {
        this.A09 = z;
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public final void A1Q(boolean z, boolean z2) {
        if (!this.A0C) {
            this.A0C = true;
            this.A0D = false;
            Dialog dialog = this.A03;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.A03.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.A06.getLooper()) {
                        onDismiss(this.A03);
                    } else {
                        this.A06.post(this.A08);
                    }
                }
            }
            this.A0F = true;
            if (this.A00 >= 0) {
                C08270df A0U = A0U();
                int i = this.A00;
                if (i >= 0) {
                    A0U.A0h(new C08230db(A0U, (String) null, i, 1), z);
                    this.A00 = -1;
                    return;
                }
                throw AnonymousClass000.A0G("Bad id: ", AnonymousClass001.A0o(), i);
            }
            C08240dc r1 = new C08240dc(A0U());
            r1.A0H = true;
            r1.A07(this);
            if (z) {
                r1.A00(true);
            } else {
                r1.A00(false);
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.A0F) {
            if (C08270df.A05(3)) {
                Log.d("FragmentManager", AnonymousClass000.A0P(this, "onDismiss called for DialogFragment ", AnonymousClass001.A0o()));
            }
            A1Q(true, true);
        }
    }

    public DialogFragment(int i) {
        this.A02 = i;
        C08310eF.A0D(this);
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A06 = new Handler();
        this.A0E = AnonymousClass000.A1T(this.A01);
        if (bundle != null) {
            this.A01 = bundle.getInt("android:style", 0);
            this.A02 = bundle.getInt("android:theme", 0);
            this.A09 = bundle.getBoolean("android:cancelable", true);
            this.A0E = bundle.getBoolean("android:showsDialog", this.A0E);
            this.A00 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void A0v(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Bundle bundle2;
        super.A0v(bundle, layoutInflater, viewGroup);
        if (this.A0B == null && this.A03 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.A03.onRestoreInstanceState(bundle2);
        }
    }

    /* JADX INFO: finally extract failed */
    public LayoutInflater A1E(Bundle bundle) {
        String str;
        LayoutInflater A1E = super.A1E(bundle);
        if (this.A0E && !this.A0A) {
            if (!this.A0B) {
                try {
                    this.A0A = true;
                    Dialog A1J = A1J(bundle);
                    this.A03 = A1J;
                    if (this.A0E) {
                        A1N(this.A01, A1J);
                        Context A1D = A1D();
                        if (A1D instanceof Activity) {
                            this.A03.setOwnerActivity((Activity) A1D);
                        }
                        this.A03.setCancelable(this.A09);
                        this.A03.setOnCancelListener(this.A04);
                        this.A03.setOnDismissListener(this.A05);
                        this.A0B = true;
                    } else {
                        this.A03 = null;
                    }
                    this.A0A = false;
                } catch (Throwable th) {
                    this.A0A = false;
                    throw th;
                }
            }
            if (C08270df.A05(2)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("get layout inflater for DialogFragment ");
                A0o.append(this);
                Log.d("FragmentManager", AnonymousClass000.A0X(" from dialog context", A0o));
            }
            Dialog dialog = this.A03;
            if (dialog != null) {
                return A1E.cloneInContext(dialog.getContext());
            }
        } else if (C08270df.A05(2)) {
            String A0P = AnonymousClass000.A0P(this, "getting layout inflater for DialogFragment ", AnonymousClass001.A0o());
            boolean z = this.A0E;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            if (!z) {
                str = "mShowsDialog = false: ";
            } else {
                str = "mCreatingDialog = true: ";
            }
            Log.d("FragmentManager", AnonymousClass000.A0V(str, A0P, A0o2));
        }
        return A1E;
    }

    public void A1G(Context context) {
        super.A1G(context);
        this.A0M.A0E(this.A07);
        if (!this.A0D) {
            this.A0C = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public DialogFragment() {
        C08310eF.A0D(this);
    }
}
