package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.common.jniexecutors.PooledNativeRunnable;
import java.lang.reflect.Array;

/* renamed from: X.7UN  reason: invalid class name */
public class AnonymousClass7UN {
    public int A00;
    public long A01;
    public Object[] A02;
    public final int A03 = Math.max(16, 1);
    public final int A04;
    public final int A05;
    public final AnonymousClass7XS A06;
    public final C183718qV A07;

    public AnonymousClass7UN(AnonymousClass7XS r6, C183718qV r7) {
        int max = Math.max(16, 0);
        this.A05 = max;
        this.A04 = Math.max(max, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        this.A06 = r6;
        this.A07 = r7;
        this.A02 = (Object[]) Array.newInstance(PooledNativeRunnable.class, max);
    }

    public final void A00(int i) {
        Object[] objArr = (Object[]) Array.newInstance(PooledNativeRunnable.class, i);
        Object[] objArr2 = this.A02;
        System.arraycopy(objArr2, 0, objArr, 0, Math.min(objArr2.length, i));
        this.A02 = objArr;
        this.A00 = Math.min(this.A00, i);
    }
}
