package X;

import android.graphics.Bitmap;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4Gz  reason: invalid class name and case insensitive filesystem */
public class C85624Gz extends C04840Qw {
    public Object A00;
    public final int A01 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85624Gz(C52342lK r2) {
        super(250);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ int A02(Object obj, Object obj2) {
        if (this.A01 != 0) {
            return super.A02(obj, obj2);
        }
        return ((Bitmap) obj2).getByteCount() / EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
    }

    public /* bridge */ /* synthetic */ void A09(boolean z, Object obj, Object obj2, Object obj3) {
        if (this.A01 == 0) {
            String str = (String) obj;
            Bitmap bitmap = (Bitmap) obj2;
            AnonymousClass30R r1 = (AnonymousClass30R) this.A00;
            synchronized (r1.A03) {
                if (z) {
                    if (r1.A01) {
                        r1.A04.A01(bitmap.getWidth(), bitmap.getHeight(), str);
                    }
                }
            }
        } else if (z) {
            C52342lK r12 = (C52342lK) this.A00;
            Map map = r12.A02;
            map.put(obj, AnonymousClass0x9.A14(obj2));
            int i = r12.A00 + 1;
            r12.A00 = i;
            if (i % 200 == 0) {
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator A0q = AnonymousClass000.A0q(map);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    if (((Reference) A0w.getValue()).get() == null) {
                        AnonymousClass0x7.A1J(A0s, A0w);
                    }
                }
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    map.remove(it.next());
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85624Gz(AnonymousClass30R r2, int i) {
        super(i);
        this.A00 = r2;
    }
}
