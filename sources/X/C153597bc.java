package X;

import android.net.Uri;
import android.util.Log;
import com.facebook.exoplayer.monitor.VpsEventCallback;

/* renamed from: X.7bc  reason: invalid class name and case insensitive filesystem */
public class C153597bc {
    public C141886wI A00;
    public final C166337yW A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public void A01() {
        VpsEventCallback vpsEventCallback;
        C166337yW r1;
        if (this instanceof C126456Ny) {
            C126456Ny r12 = (C126456Ny) this;
            if (r12.A04.isVideoQplPipelineEnabled && (vpsEventCallback = r12.A01) != null && (r1 = r12.A01) != null) {
                vpsEventCallback.AyO(new C126396Ns(r1));
            }
        }
    }

    public void A02() {
        if (this instanceof C126446Nx) {
            ((C126446Nx) this).A00.run();
            return;
        }
        throw AnonymousClass002.A0G("VodPrefetchTask is a base class. Please use more specific prefetch task");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C153597bc) || !toString().equals(obj.toString())) {
            return false;
        }
        return true;
    }

    public String toString() {
        long j;
        StringBuilder A0o;
        String str = this.A03;
        C166337yW r3 = this.A01;
        if (r3 != null && r3.A0S) {
            str = AnonymousClass000.A0X("_t", AnonymousClass000.A0l(str));
        }
        if (!this.A04) {
            if (r3 == null) {
                Log.w("VodPrefetchTask", "Trying to lookup prefetch task with insufficient information");
                A0o = AnonymousClass000.A0l(str);
                A0o.append("_track_-1");
            } else {
                Uri uri = r3.A0E.A05;
                if (uri == null) {
                    A0o = AnonymousClass000.A0l(str);
                    A0o.append("_track_");
                    A0o.append(r3.A04);
                } else {
                    j = r3.A07;
                    if (j == 0) {
                        return uri.toString();
                    }
                    A0o = AnonymousClass001.A0o();
                    AnonymousClass000.A1B(uri, A0o);
                }
            }
            return A0o.toString();
        } else if (r3 == null) {
            return str;
        } else {
            j = r3.A07;
            if (j == 0) {
                return str;
            }
            A0o = AnonymousClass000.A0l(str);
        }
        A0o.append("_");
        A0o.append(j);
        return A0o.toString();
    }

    public C153597bc(C141886wI r1, C166337yW r2, String str, String str2, boolean z) {
        this.A01 = r2;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A00 = r1;
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
