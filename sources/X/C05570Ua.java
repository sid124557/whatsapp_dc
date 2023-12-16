package X;

import android.util.Log;
import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Ua  reason: invalid class name and case insensitive filesystem */
public abstract class C05570Ua {
    public static final List A0I = Collections.emptyList();
    public int A00;
    public int A01 = 0;
    public int A02 = -1;
    public int A03 = -1;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public int A07 = 0;
    public long A08 = -1;
    public C04870Qz A09 = null;
    public C05570Ua A0A = null;
    public C05570Ua A0B = null;
    public RecyclerView A0C;
    public WeakReference A0D;
    public List A0E = null;
    public List A0F = null;
    public boolean A0G = false;
    public final View A0H;

    public void A03() {
        this.A00 = 0;
        this.A05 = -1;
        this.A03 = -1;
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = 0;
        this.A0A = null;
        this.A0B = null;
        List list = this.A0E;
        if (list != null) {
            list.clear();
        }
        this.A00 &= -1025;
        this.A07 = 0;
        this.A04 = -1;
        RecyclerView.A07(this);
    }

    public final void A05(boolean z) {
        int i;
        int i2;
        int i3 = this.A01;
        if (z) {
            i = i3 - 1;
        } else {
            i = i3 + 1;
        }
        this.A01 = i;
        if (i < 0) {
            this.A01 = 0;
            Log.e("View", AnonymousClass000.A0P(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ", AnonymousClass001.A0o()));
            return;
        }
        if (!z) {
            if (i == 1) {
                i2 = this.A00 | 16;
            } else {
                return;
            }
        } else if (i == 0) {
            i2 = this.A00 & -17;
        } else {
            return;
        }
        this.A00 = i2;
    }

    public final int A01() {
        RecyclerView recyclerView = this.A0C;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.A0B(this);
    }

    public List A02() {
        List list;
        if ((this.A00 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 || (list = this.A0E) == null || list.size() == 0) {
            return A0I;
        }
        return this.A0F;
    }

    public void A04(int i, boolean z) {
        if (this.A03 == -1) {
            this.A03 = this.A05;
        }
        int i2 = this.A06;
        if (i2 == -1) {
            i2 = this.A05;
            this.A06 = i2;
        }
        if (z) {
            this.A06 = i2 + i;
        }
        this.A05 += i;
        View view = this.A0H;
        if (view.getLayoutParams() != null) {
            AnonymousClass001.A0Y(view).A01 = true;
        }
    }

    public boolean A06() {
        if ((this.A00 & 1) == 0) {
            return false;
        }
        return true;
    }

    public C05570Ua(View view) {
        if (view != null) {
            this.A0H = view;
            return;
        }
        throw AnonymousClass001.A0c("itemView may not be null");
    }

    public String toString() {
        String simpleName;
        String str;
        Class<?> cls = getClass();
        if (cls.isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = cls.getSimpleName();
        }
        StringBuilder A0l = AnonymousClass000.A0l(simpleName);
        A0l.append("{");
        AnonymousClass001.A1N(A0l, hashCode());
        A0l.append(" position=");
        A0l.append(this.A05);
        A0l.append(" id=");
        A0l.append(this.A08);
        A0l.append(", oldPos=");
        A0l.append(this.A03);
        A0l.append(", pLpos:");
        StringBuilder sb = new StringBuilder(AnonymousClass000.A0h(A0l, this.A06));
        if (this.A09 != null) {
            sb.append(" scrap ");
            if (this.A0G) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb.append(str);
        }
        int i = this.A00;
        if ((i & 4) != 0) {
            sb.append(" invalid");
        }
        if (!A06()) {
            sb.append(" unbound");
        }
        if ((i & 2) != 0) {
            sb.append(" update");
        }
        if (AnonymousClass000.A1S(this.A00 & 8)) {
            sb.append(" removed");
        }
        if (AnonymousClass000.A1S(this.A00 & 128)) {
            sb.append(" ignored");
        }
        if ((i & 256) != 0) {
            sb.append(" tmpDetached");
        }
        if ((i & 16) != 0 || AnonymousClass0YY.A0D(this.A0H)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(" not recyclable(");
            A0o.append(this.A01);
            A0o.append(")");
            AnonymousClass000.A1B(A0o, sb);
        }
        int i2 = this.A00;
        if (!((i2 & 512) == 0 && (i2 & 4) == 0)) {
            sb.append(" undefined adapter position");
        }
        if (this.A0H.getParent() == null) {
            sb.append(" no parent");
        }
        return AnonymousClass000.A0g(sb);
    }
}
