package X;

import android.graphics.Rect;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import java.util.Iterator;

/* renamed from: X.5h2  reason: invalid class name and case insensitive filesystem */
public class C110785h2 implements C16870uA {
    public int A00 = -1;
    public StatusPlaybackFragment A01 = null;
    public boolean A02 = false;
    public final Rect A03 = AnonymousClass001.A0N();
    public final Rect A04 = AnonymousClass001.A0N();
    public final /* synthetic */ StatusPlaybackActivity A05;

    public C110785h2(StatusPlaybackActivity statusPlaybackActivity) {
        this.A05 = statusPlaybackActivity;
    }

    public void BXd(int i) {
        char c;
        boolean z;
        C105285Uh A1Q;
        StatusPlaybackActivity statusPlaybackActivity = this.A05;
        if (i != 0) {
            if (!statusPlaybackActivity.A0M) {
                statusPlaybackActivity.A0M = true;
                this.A00 = statusPlaybackActivity.A07.getCurrentItem();
            }
            c = 1;
            if (i != 1) {
                c = 2;
                if (i != 2) {
                    throw AnonymousClass001.A0e("Invalid scrollState value from ViewPager");
                }
            }
        } else {
            statusPlaybackActivity.A0M = false;
            this.A00 = -1;
            this.A02 = false;
            this.A01 = null;
            Iterator A4M = C89654ea.A4M(statusPlaybackActivity);
            while (A4M.hasNext()) {
                C08310eF A0D = AnonymousClass4L0.A0D(A4M);
                if (A0D instanceof StatusPlaybackFragment) {
                    StatusPlaybackFragment statusPlaybackFragment = (StatusPlaybackFragment) A0D;
                    if (!statusPlaybackFragment.A00 && (A1Q = ((StatusPlaybackContactFragment) statusPlaybackFragment).A1Q()) != null && A1Q.A05) {
                        AnonymousClass51x r1 = (AnonymousClass51x) A1Q;
                        r1.A05 = false;
                        r1.A0I(0);
                    }
                }
            }
            this.A02 = false;
            Runnable runnable = statusPlaybackActivity.A0J;
            if (runnable != null) {
                runnable.run();
                statusPlaybackActivity.A0J = null;
            }
            c = 0;
        }
        Iterator A4M2 = C89654ea.A4M(statusPlaybackActivity);
        while (A4M2.hasNext()) {
            C08310eF A0D2 = AnonymousClass4L0.A0D(A4M2);
            if (A0D2 instanceof StatusPlaybackFragment) {
                StatusPlaybackFragment statusPlaybackFragment2 = (StatusPlaybackFragment) A0D2;
                if (statusPlaybackFragment2 instanceof StatusPlaybackBaseFragment) {
                    StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) statusPlaybackFragment2;
                    if (c != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    statusPlaybackBaseFragment.A1O(z);
                }
            }
        }
    }

    public void BXf(int i) {
        boolean z;
        StatusPlaybackActivity statusPlaybackActivity = this.A05;
        if (i != statusPlaybackActivity.A01) {
            statusPlaybackActivity.A0K = false;
            AnonymousClass5Go r6 = (AnonymousClass5Go) statusPlaybackActivity.A0D.A01.get(i);
            if (r6 != null) {
                Iterator A4M = C89654ea.A4M(statusPlaybackActivity);
                while (true) {
                    z = true;
                    if (!A4M.hasNext()) {
                        break;
                    }
                    C08310eF A0D = AnonymousClass4L0.A0D(A4M);
                    if (A0D instanceof StatusPlaybackFragment) {
                        StatusPlaybackFragment statusPlaybackFragment = (StatusPlaybackFragment) A0D;
                        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) statusPlaybackFragment;
                        if (!r6.A00.A0A.getRawString().equals(C18300x5.A0i(statusPlaybackContactFragment.A0R)) && statusPlaybackFragment.A00) {
                            if (i <= statusPlaybackActivity.A01) {
                                z = false;
                            }
                            int i2 = statusPlaybackActivity.A03;
                            if (i2 != 0) {
                                statusPlaybackActivity.A03 = 0;
                            } else {
                                i2 = 6;
                                if (z) {
                                    i2 = 7;
                                }
                            }
                            C105285Uh A1Q = statusPlaybackContactFragment.A1Q();
                            if (A1Q != null && A1Q.A05) {
                                AnonymousClass51x r1 = (AnonymousClass51x) A1Q;
                                r1.A05 = false;
                                r1.A0I(i2);
                            }
                            statusPlaybackFragment.A1K();
                        }
                    }
                }
                StatusPlaybackFragment A75 = statusPlaybackActivity.A75(r6.A00.A0A.getRawString());
                if (A75 != null && !A75.A00) {
                    A75.A1J();
                    if (i <= statusPlaybackActivity.A01) {
                        z = false;
                    }
                    int i3 = statusPlaybackActivity.A02;
                    if (i3 != 0) {
                        statusPlaybackActivity.A02 = 0;
                    } else {
                        i3 = 2;
                        if (z) {
                            i3 = 3;
                        }
                    }
                    A75.A1L(i3);
                }
            }
            statusPlaybackActivity.A01 = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r3 = r7.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BXe(int r8, float r9, int r10) {
        /*
            r7 = this;
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 != 0) goto L_0x0066
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            int r0 = r7.A00
            r5 = 1
            boolean r6 = X.AnonymousClass000.A1U(r8, r0)
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x0066
            com.whatsapp.status.playback.fragment.StatusPlaybackFragment r1 = r7.A01
            if (r1 != 0) goto L_0x002e
            com.whatsapp.status.playback.StatusPlaybackActivity r0 = r7.A05
            if (r6 == 0) goto L_0x0026
            int r8 = r8 + 1
        L_0x0026:
            com.whatsapp.status.playback.fragment.StatusPlaybackFragment r1 = r0.A74(r8)
            r7.A01 = r1
            if (r1 == 0) goto L_0x0066
        L_0x002e:
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0066
            android.view.View r4 = r1.A0B
            if (r4 == 0) goto L_0x0066
            com.whatsapp.status.playback.StatusPlaybackActivity r3 = r7.A05
            androidx.viewpager.widget.ViewPager r2 = r3.A07
            if (r2 == 0) goto L_0x0066
            boolean r0 = r2.isShown()
            if (r0 == 0) goto L_0x0066
            boolean r0 = r4.isShown()
            if (r0 == 0) goto L_0x0066
            android.graphics.Rect r1 = r7.A04
            r2.getGlobalVisibleRect(r1)
            android.graphics.Rect r0 = r7.A03
            r4.getGlobalVisibleRect(r0)
            boolean r0 = r1.intersect(r0)
            if (r0 == 0) goto L_0x0066
            com.whatsapp.status.playback.fragment.StatusPlaybackFragment r2 = r7.A01
            int r1 = r3.A02
            if (r1 == 0) goto L_0x0067
            r0 = 0
            r3.A02 = r0
        L_0x0061:
            r2.A1L(r1)
            r7.A02 = r5
        L_0x0066:
            return
        L_0x0067:
            r1 = 2
            if (r6 == 0) goto L_0x0061
            r1 = 3
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110785h2.BXe(int, float, int):void");
    }
}
