package X;

import android.app.Activity;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.updates.ui.UpdatesFragment;

/* renamed from: X.5b0  reason: invalid class name */
public class AnonymousClass5b0 implements C85014Ep {
    public Object A00;
    public final int A01;

    public AnonymousClass5b0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void A00() {
        Integer valueOf;
        int i;
        UpdatesFragment updatesFragment = (UpdatesFragment) this.A00;
        if (updatesFragment.A0O != null) {
            if (C61072zf.A01()) {
                valueOf = Integer.valueOf(R.string.f11nameremoved);
                i = R.string.f11nameremoved;
            } else {
                valueOf = Integer.valueOf(R.string.f11nameremoved);
                i = R.string.f11nameremoved;
            }
            Integer valueOf2 = Integer.valueOf(i);
            UpdatesFragment.A00(updatesFragment, AnonymousClass4L0.A0U(), valueOf.intValue(), valueOf2.intValue());
            return;
        }
        throw C18270x1.A0S("storageUtils");
    }

    public void BZP(String str) {
        switch (this.A01) {
            case 1:
                throw AnonymousClass001.A0e("must not be called");
            case 2:
                C08310eF r4 = (C08310eF) this.A00;
                boolean A012 = C61072zf.A01();
                int i = R.string.f11nameremoved;
                if (A012) {
                    i = R.string.f11nameremoved;
                }
                boolean A013 = C61072zf.A01();
                int i2 = R.string.f11nameremoved;
                if (A013) {
                    i2 = R.string.f11nameremoved;
                }
                ((AnonymousClass4FU) C86654Ky.A0O(r4)).Box(AnonymousClass4L0.A0U(), i, i2);
                return;
            case 5:
                A00();
                return;
            default:
                C89654ea r3 = (C89654ea) this.A00;
                boolean A014 = C61072zf.A01();
                int i3 = R.string.f11nameremoved;
                if (A014) {
                    i3 = R.string.f11nameremoved;
                }
                boolean A015 = C61072zf.A01();
                int i4 = R.string.f11nameremoved;
                if (A015) {
                    i4 = R.string.f11nameremoved;
                }
                C89654ea.A4X(r3, i3, i4);
                return;
        }
    }

    public void BZQ() {
        switch (this.A01) {
            case 1:
                throw AnonymousClass001.A0e("must not be called");
            case 2:
                ((AnonymousClass4FU) C86654Ky.A0O((C08310eF) this.A00)).Box(AnonymousClass4L0.A0U(), R.string.f11nameremoved, R.string.f11nameremoved);
                return;
            case 5:
                UpdatesFragment.A00((UpdatesFragment) this.A00, AnonymousClass4L0.A0U(), R.string.f11nameremoved, R.string.f11nameremoved);
                return;
            default:
                C89654ea.A4X((C89654ea) this.A00, R.string.f11nameremoved, R.string.f11nameremoved);
                return;
        }
    }

    public void Beo(String str) {
        switch (this.A01) {
            case 1:
                C89654ea r3 = (C89654ea) this.A00;
                C69263Wi r2 = r3.A05;
                boolean A012 = C61072zf.A01();
                int i = R.string.f11nameremoved;
                if (A012) {
                    i = R.string.f11nameremoved;
                }
                r2.A0H(i, 1);
                r3.finish();
                return;
            case 2:
                C08310eF r4 = (C08310eF) this.A00;
                boolean A013 = C61072zf.A01();
                int i2 = R.string.f11nameremoved;
                if (A013) {
                    i2 = R.string.f11nameremoved;
                }
                boolean A014 = C61072zf.A01();
                int i3 = R.string.f11nameremoved;
                if (A014) {
                    i3 = R.string.f11nameremoved;
                }
                ((AnonymousClass4FU) C86654Ky.A0O(r4)).Box(AnonymousClass4L0.A0U(), i2, i3);
                return;
            case 5:
                A00();
                return;
            default:
                C89654ea r32 = (C89654ea) this.A00;
                boolean A015 = C61072zf.A01();
                int i4 = R.string.f11nameremoved;
                if (A015) {
                    i4 = R.string.f11nameremoved;
                }
                boolean A016 = C61072zf.A01();
                int i5 = R.string.f11nameremoved;
                if (A016) {
                    i5 = R.string.f11nameremoved;
                }
                C89654ea.A4X(r32, i4, i5);
                return;
        }
    }

    public void Bep() {
        switch (this.A01) {
            case 1:
                Activity activity = (Activity) this.A00;
                int i = Build.VERSION.SDK_INT;
                int i2 = R.string.f11nameremoved;
                if (i >= 30) {
                    i2 = R.string.f11nameremoved;
                    if (i < 33) {
                        i2 = R.string.f11nameremoved;
                    }
                }
                RequestPermissionActivity.A0b(activity, R.string.f11nameremoved, i2);
                return;
            case 2:
                ((AnonymousClass4FU) C86654Ky.A0O((C08310eF) this.A00)).Box(AnonymousClass4L0.A0U(), R.string.f11nameremoved, R.string.f11nameremoved);
                return;
            case 5:
                UpdatesFragment.A00((UpdatesFragment) this.A00, AnonymousClass4L0.A0U(), R.string.f11nameremoved, R.string.f11nameremoved);
                return;
            default:
                C89654ea.A4X((C89654ea) this.A00, R.string.f11nameremoved, R.string.f11nameremoved);
                return;
        }
    }
}
