package X;

import android.graphics.BitmapFactory;
import com.whatsapp.community.SubgroupWithParentView;
import java.io.InputStream;

/* renamed from: X.760  reason: invalid class name */
public class AnonymousClass760 implements C15810ry {
    public Object A00;
    public final int A01;

    public AnonymousClass760(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object get() {
        switch (this.A01) {
            case 0:
                return ((SubgroupWithParentView) this.A00).A00();
            case 1:
                return BitmapFactory.decodeStream((InputStream) this.A00);
            default:
                C93314oJ r2 = (C93314oJ) this.A00;
                return new C88924b1(r2.getContext(), r2);
        }
    }
}
